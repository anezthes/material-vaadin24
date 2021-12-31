package com.example.application.views;

import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Cards")
@Route(value = "cards", layout = MainLayout.class)
public class CardsView extends Main {

	public CardsView() {
		add(new H2("Cards"));
	}

}
