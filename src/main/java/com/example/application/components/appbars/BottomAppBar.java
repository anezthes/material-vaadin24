package com.example.application.components.appbars;

import com.example.application.utilities.classes.Surface;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Footer;

public class BottomAppBar extends Footer {

    public static final String BOTTOM_APP_BAR = "bottom-app-bar";

    private final Div secondaryActions;
    private final Div primaryAction;

    public BottomAppBar(Component... components) {
        addClassNames(BOTTOM_APP_BAR, Surface._2);

        this.secondaryActions = new Div(components);
        this.primaryAction = new Div();
        add(this.secondaryActions, this.primaryAction);
    }

    public void setPrimaryAction(Component component) {
        this.primaryAction.removeAll();
        this.primaryAction.add(component);
    }

}
