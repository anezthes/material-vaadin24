package com.example.application.utilities.enums;

import com.vaadin.flow.theme.lumo.LumoUtility;

public enum FlexWrap {
    NOWRAP(LumoUtility.FlexWrap.NOWRAP),
    WRAP(LumoUtility.FlexWrap.WRAP),
    WRAP_REVERSE(LumoUtility.FlexWrap.WRAP_REVERSE);

    private final String className;

    FlexWrap(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }
}
