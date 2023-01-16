package com.example.application.views;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Color")
@Route(value = "color", layout = MainLayout.class)
public class ColorView extends View {

    public ColorView() {
        super("Color");
    }

}
