package com.example.application.utilities.enums;

public enum Gap {
    _1(com.example.application.utilities.classes.Gap._1),
    _2(com.example.application.utilities.classes.Gap._2),
    _3(com.example.application.utilities.classes.Gap._3),
    _4(com.example.application.utilities.classes.Gap._4),
    _5(com.example.application.utilities.classes.Gap._5),
    _6(com.example.application.utilities.classes.Gap._6),
    _7(com.example.application.utilities.classes.Gap._7),
    _8(com.example.application.utilities.classes.Gap._8),
    _9(com.example.application.utilities.classes.Gap._9),
    _10(com.example.application.utilities.classes.Gap._10);

    private final String className;

    Gap(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }

    public ColumnGap getColumnGap() {
        return ColumnGap.valueOf(this.name());
    }

    public RowGap getRowGap() {
        return RowGap.valueOf(this.name());
    }
}
