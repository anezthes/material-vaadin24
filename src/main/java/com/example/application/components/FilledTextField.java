package com.example.application.components;

import com.example.application.MaterialIcon;
import com.example.application.componentthemes.TextFieldTheme;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;

public class FilledTextField extends TextField {

	public FilledTextField() {
		super();
		addThemeName(TextFieldTheme.FILLED);
	}

	public FilledTextField(String label) {
		super(label);
		addThemeName(TextFieldTheme.FILLED);
	}

	public FilledTextField(String label, String placeholder) {
		super(label, placeholder);
		addThemeName(TextFieldTheme.FILLED);
	}

	public FilledTextField(String label, String initialValue, String placeholder) {
		super(label, initialValue, placeholder);
		addThemeName(TextFieldTheme.FILLED);
	}


	public FilledTextField(ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
		super(listener);
		addThemeName(TextFieldTheme.FILLED);
	}

	public FilledTextField(String label, ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
		super(label, listener);
		addThemeName(TextFieldTheme.FILLED);
	}

	public FilledTextField(String label, String initialValue, ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
		super(label, initialValue, listener);
		addThemeName(TextFieldTheme.FILLED);
	}

	@Override
	public void setPrefixComponent(Component component) {
		super.setPrefixComponent(component);
		getElement().setAttribute("has-prefix", component != null);
	}
}
