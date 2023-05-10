package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.Layout;
import com.example.application.components.MDTextField;
import com.example.application.themes.TextFieldTheme;
import com.example.application.utilities.enums.FlexWrap;
import com.example.application.utilities.enums.Gap;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import java.time.LocalDate;
import java.util.Date;

@PageTitle("Date pickers")
@Route(value = "date-pickers", layout = MainLayout.class)
public class DatePickersView extends View {

    public DatePickersView() {
        super("Date pickers");

        addH3("Filled");
        addTextFields(TextFieldTheme.FILLED);

        addH3("Outlined");
        addTextFields(TextFieldTheme.OUTLINED);
    }

    private void addTextFields(String theme) {
        Layout fields = new Layout();
        fields.setFlexWrap(FlexWrap.WRAP);
        fields.setGap(Gap._6);
        add(fields);

        DatePicker field = new DatePicker("Date");
        field.addThemeName(theme);
        field.setHelperText("Supporting text");
        fields.add(field);

        field = new DatePicker("Date");
        field.addThemeName(theme);
        field.setHelperText("Supporting text");
        field.setValue(LocalDate.now());
        fields.add(field);

        field = new DatePicker("Date");
        field.addThemeName(theme);
        field.setEnabled(false);
        fields.add(field);
    }

}
