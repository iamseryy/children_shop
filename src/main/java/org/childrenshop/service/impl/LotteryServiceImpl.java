package org.childrenshop.service.impl;

import org.childrenshop.repository.WonToys;
import org.childrenshop.repository.impl.WonToysImpl;
import org.childrenshop.service.LotteryService;

import java.util.ArrayList;
import java.util.List;

public class LotteryServiceImpl implements LotteryService {
    private static WonToys wonToys = WonToysImpl.getInstance();
    @Override
    public int holdLottery() {
        var stockBalance = stockService.findAll();
        Integer totalHeft = stockBalance.stream()
                .map(position -> toyService.findById(position.toyId()).get().heft())
                .reduce(0, Integer::sum);

        int randomTotalHeft = (int) (Math.random() * (totalHeft)) + 1;

        List<Integer> stockToyIdList = new ArrayList<>();
        stockBalance.forEach(position -> wonToys.stockToyIdList.add(position.toyId()));

        int toyId = 0;
        while (randomTotalHeft > 0){
            int randomIndex = (int) (Math.random() * (stockToyIdList.size()));
            int heft = toyService.findById(stockToyIdList.get(randomIndex)).get().heft();
            if(heft >= randomTotalHeft) {
                toyId = toyService.findById(stockToyIdList.get(randomIndex)).get().id();
            }

            randomTotalHeft -= heft;
        }

        wonToys.add(toyId);

        return toyId;
    }
}
