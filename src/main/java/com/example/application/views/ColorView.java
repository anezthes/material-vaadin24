package com.example.application.views;

import com.example.application.utilityclasses.Margin;
import com.example.application.utilityclasses.Padding;
import com.example.application.utilityclasses.Typography;
import com.example.application.views.MainLayout;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Color")
@Route(value = "color", layout = MainLayout.class)
public class ColorView extends Main {

	public ColorView() {
		addClassNames(Padding.Horizontal._6);

		H2 title = new H2("Color");
		title.addClassNames(Typography.Display.L, Margin._0);
		add(title);
	}

}
