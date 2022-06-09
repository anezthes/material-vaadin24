package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.AssistChip;
import com.example.application.components.FilledTextField;
import com.example.application.componentthemes.ChipTheme;
import com.example.application.componentthemes.TextFieldTheme;
import com.example.application.utilityclasses.*;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Text fields")
@Route(value = "text-fields", layout = MainLayout.class)
public class TextFieldsView extends Main {

	public TextFieldsView() {
		addClassNames(Padding._6);

		H2 title = new H2("Text fields");
		title.addClassNames(Typography.Display.L, Margin._0);
		add(title);

		add(createH3("Filled"));
		addTextFields();

		add(createH3("Outlined"));
	}

	private H3 createH3(String text) {
		H3 h3 = new H3(text);
		h3.addClassNames(Typography.Body.M, Margin.Bottom._4, Margin.Top._8);
		return h3;
	}

	private void addTextFields() {
		Div fields = new Div();
		fields.addClassNames(Display.FLEX, FlexWrap.WRAP, Gap._4);
		add(fields);

		TextField field = new FilledTextField("Label text");
		fields.add(field);

		field = new FilledTextField("Label text");
		field.setValue("Input text");
		fields.add(field);

		field = new FilledTextField("Label text");
		field.setPrefixComponent(MaterialIcon.SEARCH.create());
		fields.add(field);

		field = new FilledTextField("Label text");
		field.setClearButtonVisible(true);
		field.setPrefixComponent(MaterialIcon.SEARCH.create());
		field.setValue("Input text");
		fields.add(field);
	}

}
