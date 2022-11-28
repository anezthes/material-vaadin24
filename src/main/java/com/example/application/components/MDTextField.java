package com.example.application.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;

import static com.example.application.MaterialIcon.MATERIAL_ICONS;

public class MDTextField extends TextField {

    public MDTextField() {
        super();
    }

    public MDTextField(String label) {
        super(label);
    }

    public MDTextField(String label, String placeholder) {
        super(label, placeholder);
    }

    public MDTextField(String label, String initialValue, String placeholder) {
        super(label, initialValue, placeholder);
    }

    public MDTextField(ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
        super(listener);
    }

    public MDTextField(String label, ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
        super(label, listener);
    }

    public MDTextField(String label, String initialValue, ValueChangeListener<? super ComponentValueChangeEvent<TextField, String>> listener) {
        super(label, initialValue, listener);
    }

    @Override
    public void setPrefixComponent(Component component) {
        super.setPrefixComponent(component);
        if (component instanceof Span && ((Span) component).hasClassName(MATERIAL_ICONS)) {
            getElement().setAttribute("leading-icon", component != null);
        } else {
            getElement().setAttribute("prefix", component != null);
        }
    }

    @Override
    public void setSuffixComponent(Component component) {
        super.setSuffixComponent(component);
        if (component instanceof Span && ((Span) component).hasClassName(MATERIAL_ICONS)) {
            getElement().setAttribute("trailing-icon", component != null);
        } else {
            getElement().setAttribute("suffix", component != null);
        }
    }
}
