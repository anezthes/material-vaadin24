package com.example.application.views;

import com.example.application.components.Layout;
import com.example.application.utilities.enums.FlexDirection;
import com.example.application.utilities.enums.Gap;
import com.vaadin.flow.component.radiobutton.RadioButtonGroup;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Radio button")
@Route(value = "radio-button", layout = MainLayout.class)
public class RadioButtonView extends View {

    public RadioButtonView() {
        super("Radio button");

        Layout groups = new Layout();
        groups.setFlexDirection(FlexDirection.COLUMN);
        groups.setGap(Gap._6);
        add(groups);

        RadioButtonGroup group = new RadioButtonGroup("Enabled");
        group.setItems("Radio button 1", "Radio button 2");
        groups.add(group);

        group = new RadioButtonGroup("Disabled");
        group.setItems("Radio button 1", "Radio button 2");
        group.setValue("Radio button 1");
        group.setEnabled(false);
        groups.add(group);
    }
}
