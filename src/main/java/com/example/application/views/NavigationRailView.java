package com.example.application.views;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Navigation rail")
@Route(value = "navigation-rail", layout = MainLayout.class)
public class NavigationRailView extends Main {

	public NavigationRailView() {
		add(new H2("Navigation rail"));
	}

}
