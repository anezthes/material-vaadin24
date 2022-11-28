package com.example.application.components;

import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.component.html.Span;

public class Badge extends Span implements HasTheme {

    public static final String BADGE = "badge";
    public static final String MULTIPLE_DIGITS = "multiple-digits";

    public Badge() {
        addThemeName(BADGE);
    }

    public Badge(String text) {
        super(text);
        addThemeName(BADGE);
        if (text.length() > 1) {
            addThemeName(MULTIPLE_DIGITS);
        }
    }

}
