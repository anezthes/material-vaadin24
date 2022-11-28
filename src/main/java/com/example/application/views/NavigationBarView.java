package com.example.application.views;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Navigation bar")
@Route(value = "navigation-bar", layout = MainLayout.class)
public class NavigationBarView extends Main {

    public NavigationBarView() {
        add(new H2("Navigation bar"));
    }

}
