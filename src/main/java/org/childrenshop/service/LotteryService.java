package org.childrenshop.service;

import org.childrenshop.service.impl.StockServiceImpl;
import org.childrenshop.service.impl.ToyServiceImpl;

public interface LotteryService {
    ToyService toyService = new ToyServiceImpl();
    StockService stockService = new StockServiceImpl();

    int holdLottery();
}
