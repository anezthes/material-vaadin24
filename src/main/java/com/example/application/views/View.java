package com.example.application.views;

import com.example.application.utilities.classes.Margin;
import com.example.application.utilities.classes.Padding;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.H4;
import com.vaadin.flow.component.html.Main;

public class View extends Main {

    public View(String title) {
        addClassNames(Padding._6);

        H2 h2 = new H2(title);
        h2.addClassNames(Margin.Bottom._8, Margin.Top._0);
        add(h2);
    }

    protected void addH3(String text) {
        H3 h3 = new H3(text);
        h3.addClassNames(Margin.Bottom._4, Margin.Top._8);
        add(h3);
    }

    protected void addH4(String text) {
        H4 h4 = new H4(text);
        h4.addClassNames(Margin.Bottom._4, Margin.Top._8);
        add(h4);
    }

}
