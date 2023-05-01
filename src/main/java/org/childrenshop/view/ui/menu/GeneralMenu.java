package org.childrenshop.view.ui.menu;

import org.childrenshop.view.ui.template.impl.AddToyTemplate;
import org.childrenshop.view.ui.template.impl.EditToyTemplate;
import org.childrenshop.view.ui.template.impl.ExitTemplate;

import java.util.Arrays;
import java.util.List;

public interface GeneralMenu {
    String header = "\nChildren Shop\n";
    List<MenuItem> generalMenuItems = Arrays.asList(
            new MenuItem[] {
                    new MenuItem("1. Add toy", () -> new AddToyTemplate().output()),
                    new MenuItem("2. Edit toy", () -> new EditToyTemplate().output()),
                    new MenuItem("3. Exit", () -> new ExitTemplate().output())
            }
    );
}