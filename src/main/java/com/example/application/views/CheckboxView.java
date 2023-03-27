package com.example.application.views;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.LumoUtility;

@PageTitle("Checkbox")
@Route(value = "checkbox", layout = MainLayout.class)
public class CheckboxView extends View {

    public CheckboxView() {
        super("Checkbox");
        addClassNames(LumoUtility.Display.FLEX, LumoUtility.FlexDirection.COLUMN);

        Checkbox checkbox = new Checkbox("Checkbox");
        add(checkbox);

        checkbox = new Checkbox("Checkbox");
        checkbox.setEnabled(false);
        add(checkbox);

        CheckboxGroup group = new CheckboxGroup("Group");
        group.setItems("Checkbox 1", "Checkbox 2");
        add(group);
    }
}
