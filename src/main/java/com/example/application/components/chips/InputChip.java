package com.example.application.components.chips;

import com.example.application.MaterialIcon;
import com.example.application.componentthemes.ChipTheme;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;

public class InputChip extends Div implements HasTheme {

    public String ARIA_LABEL = "aria-label";

    public String PRIMARY_CLASS_NAME = "chip";
    public String SECONDARY_CLASS_NAME = "input";

    private AssistChip chip;
    private Button close;

    public InputChip(String text) {
        addClassNames(PRIMARY_CLASS_NAME, SECONDARY_CLASS_NAME);

        chip = new AssistChip(text);

        close = new Button(MaterialIcon.CLOSE.create());
        close.getElement().setAttribute(ARIA_LABEL, "Close");

        add(chip, close);
    }

    public void setIcon(Component icon) {
        if (icon != null) {
            if (icon instanceof Image) {
                addThemeName(ChipTheme.AVATAR);
            } else {
                removeThemeName(ChipTheme.AVATAR);
            }
            addThemeName(ChipTheme.ICON);
        } else {
            removeThemeNames(ChipTheme.AVATAR, ChipTheme.ICON);
        }
        chip.setIcon(icon);
    }

    public AssistChip getChip() {
        return chip;
    }

    public Button getCloseButton() {
        return close;
    }
}
