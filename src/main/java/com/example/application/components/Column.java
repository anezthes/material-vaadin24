package com.example.application.components;

import com.example.application.utilities.enums.FlexDirection;
import com.vaadin.flow.component.Component;

public class Column extends Layout {

    public Column(Component... components) {
        super(components);
        setFlexDirection(FlexDirection.COLUMN);
    }

}
