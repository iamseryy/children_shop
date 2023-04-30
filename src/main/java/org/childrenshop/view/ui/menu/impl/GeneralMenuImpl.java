package org.childrenshop.view.ui.menu.impl;

import org.childrenshop.view.ui.menu.GeneralMenu;
import org.childrenshop.view.ui.menu.Menu;

public class GeneralMenuImpl  extends Menu implements GeneralMenu {
    public void processing() {
        super.processing(header, generalMenuItems);
    }
}
