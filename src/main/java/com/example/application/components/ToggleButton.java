package com.example.application.components;

import com.example.application.MaterialIcon;
import com.example.application.componentthemes.ButtonTheme;
import com.vaadin.flow.component.button.Button;

public class ToggleButton extends Button {

    public static final String ARIA_LABEL = "aria-label";
    public static final String ARIA_PRESSED = "aria-pressed";

    private MaterialIcon enabled;
    private MaterialIcon disabled;

    private boolean pressed = false;

    public ToggleButton(MaterialIcon enabled, MaterialIcon disabled, String label) {
        this.enabled = enabled;
        this.disabled = disabled;

        addThemeName(ButtonTheme.TOGGLE);
        getElement().setAttribute(ARIA_LABEL, label);

        getElement().setAttribute(ARIA_PRESSED, String.valueOf(pressed));
        addClickListener(e -> {
            pressed = !pressed;
            getElement().setAttribute(ARIA_PRESSED, String.valueOf(pressed));
            updateIcon();
        });

        updateIcon();
    }

    public ToggleButton(MaterialIcon icon, String label) {
        this(icon, icon, label);
    }

    private void updateIcon() {
        setIcon(pressed ? this.enabled.create() : this.disabled.create());
    }

}
