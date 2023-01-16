package com.example.application.views;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Navigation rail")
@Route(value = "navigation-rail", layout = MainLayout.class)
public class NavigationRailView extends View {

    public NavigationRailView() {
        super("Navigation rail");
    }

}
