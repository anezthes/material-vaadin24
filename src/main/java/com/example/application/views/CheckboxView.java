package com.example.application.views;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Checkbox")
@Route(value = "checkbox", layout = MainLayout.class)
public class CheckboxView extends View {

    public CheckboxView() {
        super("Checkbox");

        Checkbox checkbox = new Checkbox("Checkbox");
        add(checkbox);

        checkbox = new Checkbox("Checkbox");
        checkbox.setEnabled(false);
        add(checkbox);
    }
}
