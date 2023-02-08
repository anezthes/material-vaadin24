package com.example.application.components;

import com.example.application.utilities.enums.*;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class Layout extends Div {

    private AlignItems alignItems;
    private FlexDirection flexDirection;
    private FlexWrap flexWrap;
    private JustifyContent justifyContent;

    private ColumnGap colGap;
    private RowGap rowGap;

    public Layout(Component... components) {
        super(components);
        addClassNames(LumoUtility.Display.FLEX);
    }

    public void setAlignItems(AlignItems alignItems) {
        if (this.alignItems != null) {
            removeClassNames(this.alignItems.getClassName());
        }
        addClassNames(alignItems.getClassName());
        this.alignItems = alignItems;
    }

    public void setFlexDirection(FlexDirection flexDirection) {
        if (this.flexDirection != null) {
            removeClassNames(this.flexDirection.getClassName());
        }
        addClassNames(flexDirection.getClassName());
        this.flexDirection = flexDirection;
    }

    public void setFlexWrap(FlexWrap flexWrap) {
        if (this.flexWrap != null) {
            removeClassNames(this.flexWrap.getClassName());
        }
        addClassNames(flexWrap.getClassName());
        this.flexWrap = flexWrap;
    }

    public void setGap(Gap gap) {
        setColumnGap(gap);
        setRowGap(gap);
    }

    public void setColumnGap(Gap gap) {
        removeColumnGap();
        this.addClassNames(gap.getColumnGap().getClassName());
        this.colGap = gap.getColumnGap();
    }

    public void setRowGap(Gap gap) {
        removeRowGap();
        this.addClassNames(gap.getRowGap().getClassName());
        this.rowGap = gap.getRowGap();
    }

    public void removeGap() {
        removeColumnGap();
        removeRowGap();
    }

    public void removeColumnGap() {
        if (this.colGap != null) {
            this.removeClassName(this.colGap.getClassName());
        }
        this.colGap = null;
    }

    public void removeRowGap() {
        if (this.rowGap != null) {
            this.removeClassName(this.rowGap.getClassName());
        }
        this.rowGap = null;
    }

    public void setJustifyContent(JustifyContent justifyContent) {
        if (this.justifyContent != null) {
            removeClassNames(this.justifyContent.getClassName());
        }
        addClassNames(justifyContent.getClassName());
        this.justifyContent = justifyContent;
    }

}
