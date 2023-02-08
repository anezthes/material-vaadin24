package com.example.application.utilities.enums;

import com.example.application.utilities.classes.Gap;

public enum ColumnGap {
    _1(Gap.Column._1),
    _2(Gap.Column._2),
    _3(Gap.Column._3),
    _4(Gap.Column._4),
    _5(Gap.Column._5),
    _6(Gap.Column._6),
    _7(Gap.Column._7),
    _8(Gap.Column._8),
    _9(Gap.Column._9),
    _10(Gap.Column._10);

    private final String className;

    private ColumnGap(String className) {
        this.className = className;
    }

    public String getClassName() {
        return this.className;
    }
}
