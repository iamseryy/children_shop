package org.childrenshop.view.ui.template.impl;

import org.childrenshop.view.ui.UserInterface;
import org.childrenshop.view.ui.impl.UserInterfaceImpl;
import org.childrenshop.view.ui.template.Template;

import java.util.logging.Level;

public class ExitTemplate implements Template {

    @Override
    public void output() {
        ui.output("Application closed");
    }
}
