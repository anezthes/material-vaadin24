package com.example.application.views;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Navigation drawer")
@Route(value = "navigation-drawer", layout = MainLayout.class)
public class NavigationDrawerView extends View {

    public NavigationDrawerView() {
        super("Navigation drawer");
    }

}
