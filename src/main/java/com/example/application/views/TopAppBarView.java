package com.example.application.views;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Top app bar")
@Route(value = "top-app-bar", layout = MainLayout.class)
public class TopAppBarView extends Main {

	public TopAppBarView() {
		add(new H2("Top app bar"));
	}

}
