package org.childrenshop.view.template.impl;

import org.childrenshop.view.template.Template;

import java.util.Optional;

public class ToyLotteryTemplate implements Template {
    @Override
    public void output() {
        ui.output("\nToy lottery\n");

        Optional<String> answer = ui.input("\nStart lottery? (1 - yes / any other key - no): ", String::toString);
        if (answer.isEmpty() || !answer.get().equals("1")) {
            ui.output("\nCancelled\n");
            ui.pressEnterToContinue();
            return;
        }

        ui.output("\nThe toy is awaiting receipt by the winner\n");
        ui.pressEnterToContinue();
    }
}
