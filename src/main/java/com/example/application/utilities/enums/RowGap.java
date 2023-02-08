package com.example.application.utilities.enums;

import com.example.application.utilities.classes.Gap;

public enum RowGap {
    _1(Gap.Row._1),
    _2(Gap.Row._2),
    _3(Gap.Row._3),
    _4(Gap.Row._4),
    _5(Gap.Row._5),
    _6(Gap.Row._6),
    _7(Gap.Row._7),
    _8(Gap.Row._8),
    _9(Gap.Row._9),
    _10(Gap.Row._10);

    private final String className;

    private RowGap(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }
}
