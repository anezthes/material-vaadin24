package com.example.application.views;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Navigation drawer")
@Route(value = "navigation-drawer", layout = MainLayout.class)
public class NavigationDrawerView extends Main {

	public NavigationDrawerView() {
		add(new H2("Navigation drawer"));
	}

}
