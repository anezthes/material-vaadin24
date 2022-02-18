package com.example.application.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.HasTheme;
import com.vaadin.flow.component.html.Div;

public class Card extends Div implements HasTheme {

	public Card(Component... components) {
		add(components);
		addClassName("card");
	}

	public void setFocusable(boolean focusable) {
		if (focusable) {
			getElement().setAttribute("tabindex", "0");
		} else {
			getElement().removeAttribute("tabindex");
		}
	}

}
