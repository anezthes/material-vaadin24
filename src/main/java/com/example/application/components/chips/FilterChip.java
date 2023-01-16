package com.example.application.components.chips;

import com.example.application.MaterialIcon;
import com.vaadin.flow.component.button.Button;

public class FilterChip extends Button {

    public String PRIMARY_THEME_NAME = "chip";
    public String SECONDARY_THEME_NAME = "filter";

    public String ARIA_PRESSED = "aria-pressed";
    private boolean pressed;

    public FilterChip(String text) {
        super(text);
        init();
    }

    public FilterChip(String text, MaterialIcon icon) {
        super(text, icon.create());
        init();
    }

    private void init() {
        addThemeNames(PRIMARY_THEME_NAME, SECONDARY_THEME_NAME);
        getElement().setAttribute(ARIA_PRESSED, String.valueOf(pressed));
        addClickListener(e -> toggle());
    }

    private void toggle() {
        pressed = !pressed;
        getElement().setAttribute(ARIA_PRESSED, String.valueOf(pressed));
    }

}
