package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.componentthemes.ButtonTheme;
import com.example.application.utilityclasses.*;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Buttons")
@Route(value = "buttons", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class ButtonsView extends Main {

	public ButtonsView() {
		addClassNames(Padding._6);

		H2 title = new H2("Buttons");
		title.addClassNames(Typography.Display.L, Margin._0);
		add(title);

		add(createH3("Elevated"));
		addButtons(ButtonTheme.ELEVATED);

		add(createH3("Filled"));
		addButtons(ButtonTheme.FILLED);

		add(createH3("Filled tonal"));
		addButtons(ButtonTheme.FILLED_TONAL);

		add(createH3("Outlined"));
		addButtons(ButtonTheme.OUTLINED);

		add(createH3("Text"));
		addButtons(ButtonTheme.TEXT);

		add(createH3("Floating action button (FAB)"));
		addButtons(ButtonTheme.FAB);

		add(createH3("Small FAB"));
		addButtons(ButtonTheme.FAB_SMALL);

		add(createH3("Large FAB"));
		addButtons(ButtonTheme.FAB_LARGE);

		add(createH3("Extended FAB"));
		addButtons(ButtonTheme.FAB_EXTENDED);
	}

	private H3 createH3(String text) {
		H3 h3 = new H3(text);
		h3.addClassNames(Typography.Body.M, Margin.Bottom._4, Margin.Top._8);
		return h3;
	}

	private void addButtons(String theme) {
		Div buttons = new Div();
		buttons.addClassNames(Display.FLEX, Gap._4);
		add(buttons);

		if (theme.equals(ButtonTheme.FAB) || theme.equals(ButtonTheme.FAB_SMALL) || theme.equals(ButtonTheme.FAB_LARGE)) {
			addButton(buttons, theme, MaterialIcon.ADD);

		} else if (theme.equals(ButtonTheme.FAB_EXTENDED)) {
			addButton(buttons, theme, "Button", MaterialIcon.ADD);

		} else {
			addButton(buttons, theme, "Button");
			addButton(buttons, theme, "Button", MaterialIcon.ADD);
		}
	}

	private void addButton(HasComponents container, String theme, String label) {
		addButton(container, theme, label, null);
	}

	private void addButton(HasComponents container, String theme, MaterialIcon icon) {
		addButton(container, theme, null, icon);
	}

	private void addButton(HasComponents container, String theme, String label, MaterialIcon icon) {
		Button button = new Button();
		if (label != null) button.setText(label);
		if (icon != null) button.setIcon(icon.create());
		button.addThemeName(theme);
		container.add(button);

		button = new Button();
		if (label != null) button.setText(label);
		if (icon != null) button.setIcon(icon.create());
		button.addThemeName(theme);
		button.setEnabled(false);
		container.add(button);
	}

}
