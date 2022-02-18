package com.example.application.views;

import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Chips")
@Route(value = "chips", layout = MainLayout.class)
public class ChipsView extends Main {

	public ChipsView() {
		add(new H2("Chips"));
	}

}
