package com.example.application.views;

import com.example.application.components.Badge;
import com.example.application.utilityclasses.*;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Buttons")
@Route(value = "badges", layout = MainLayout.class)
public class BadgesView extends Main {

	public BadgesView() {
		addClassNames(Padding._6);

		H2 title = new H2("Badges");
		title.addClassNames(Typography.Display.L, Margin._0);
		add(title);

		addBadges();
	}

	private void addBadges() {
		Div badges = new Div(
				new Badge(),
				new Badge("1"),
				new Badge("999+")
		);
		badges.addClassNames(Display.FLEX, FlexDirection.COLUMN, Gap._4, Margin.Top._8);
		add(badges);
	}

}
