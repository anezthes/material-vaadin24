package com.example.application.views;

import com.example.application.components.Layout;
import com.example.application.utilities.enums.FlexDirection;
import com.example.application.utilities.enums.Gap;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.checkbox.CheckboxGroup;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Checkbox")
@Route(value = "checkbox", layout = MainLayout.class)
public class CheckboxView extends View {

    public CheckboxView() {
        super("Checkbox");

        addH3("Single");
        addCheckboxes(false);

        addH3("Indeterminate");
        addCheckboxes(true);

        addH3("Group");
        addCheckboxGroups();
    }

    private void addCheckboxes(boolean indeterminate) {
        Layout checkboxes = new Layout();
        checkboxes.setFlexDirection(FlexDirection.COLUMN);
        add(checkboxes);

        Checkbox checkbox = new Checkbox("Checkbox");
        checkbox.setIndeterminate(indeterminate);
        checkboxes.add(checkbox);

        checkbox = new Checkbox("Disabled");
        checkbox.setIndeterminate(indeterminate);
        checkbox.setEnabled(false);
        checkboxes.add(checkbox);
    }

    private void addCheckboxGroups() {
        Layout groups = new Layout();
        groups.setFlexDirection(FlexDirection.COLUMN);
        groups.setGap(Gap._6);
        add(groups);

        CheckboxGroup group = new CheckboxGroup("Enabled");
        group.setItems("Checkbox 1", "Checkbox 2");
        groups.add(group);

        group = new CheckboxGroup("Disabled");
        group.setItems("Checkbox 1", "Checkbox 2");
        group.setEnabled(false);
        groups.add(group);
    }
}
