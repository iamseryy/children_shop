package org.childrenshop.view.ui.template.impl;

import org.childrenshop.view.ui.template.Template;

import java.util.Optional;

public class AddToyTemplate implements Template {
    @Override
    public void output() {
        ui.output("\nAdd Toy\n");
        ui.output("Complete the following fields or enter an empty string to cancel\n");

        Optional<String> nameOpt = ui.input("Toy name: ", String::toString);
        if(nameOpt.isEmpty()){
            ui.output("\nCancelled\n");
            return;
        }
    }
}
