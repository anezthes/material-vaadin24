package com.example.application.components.chips;

import com.example.application.MaterialIcon;
import com.vaadin.flow.component.button.Button;

public class AssistChip extends Button {

    public String PRIMARY_THEME_NAME = "chip";
    public String SECONDARY_THEME_NAME = "assist";

    public AssistChip(String text) {
        super(text);
        addThemeNames(PRIMARY_THEME_NAME, SECONDARY_THEME_NAME);
    }

    public AssistChip(String text, MaterialIcon icon) {
        super(text, icon.create());
        addThemeNames(PRIMARY_THEME_NAME, SECONDARY_THEME_NAME);
    }

}
