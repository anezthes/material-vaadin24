package com.example.application.views;

import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Navigation bar")
@Route(value = "navigation-bar", layout = MainLayout.class)
public class NavigationBarView extends View {

    public NavigationBarView() {
        super("Navigation bar");
    }

}
