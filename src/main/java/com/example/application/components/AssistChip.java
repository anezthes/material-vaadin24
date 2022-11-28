package com.example.application.components;

import com.example.application.MaterialIcon;
import com.vaadin.flow.component.button.Button;

public class AssistChip extends Button {

    public String CLASS_NAME = "chip";
    public String THEME_NAME = "assist";

    public AssistChip(String text) {
        super(text);
        addClassName(CLASS_NAME);
        addThemeName(THEME_NAME);
    }

    public AssistChip(String text, MaterialIcon icon) {
        super(text, icon.create());
        addClassName(CLASS_NAME);
        addThemeName(THEME_NAME);
    }

}
