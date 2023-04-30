package org.childrenshop.controller;

import org.childrenshop.view.ui.menu.impl.GeneralMenuImpl;

public class AppController {
    public static void start(){
        new GeneralMenuImpl().processing();
    }
}
