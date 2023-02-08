package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.Layout;
import com.example.application.components.MDTextField;
import com.example.application.themes.TextFieldTheme;
import com.example.application.utilities.enums.FlexWrap;
import com.example.application.utilities.enums.Gap;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Text fields")
@Route(value = "text-fields", layout = MainLayout.class)
public class TextFieldsView extends View {

    public TextFieldsView() {
        super("Text fields");

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

        TextField field = new MDTextField("Label text");
        field.addThemeName(theme);
        field.setHelperText("Supporting text");
        fields.add(field);

        field = new MDTextField("Label text");
        field.addThemeName(theme);
        field.setHelperText("Supporting text");
        field.setValue("Input text");
        fields.add(field);

        field = new MDTextField("Label text");
        field.addThemeName(theme);
        field.setHelperText("Supporting text");
        field.setPrefixComponent(MaterialIcon.SEARCH.create());
        fields.add(field);

        field = new MDTextField("Label text");
        field.addThemeName(theme);
        field.setClearButtonVisible(true);
        field.setHelperText("Supporting text");
        field.setPrefixComponent(MaterialIcon.SEARCH.create());
        field.setValue("Input text");
        fields.add(field);

        field = new MDTextField("Label text");
        field.addThemeName(theme);
        field.setPrefixComponent(new Span("$"));
        field.setValue("1.43");
        fields.add(field);

        field = new MDTextField("Label text");
        field.addThemeName(theme);
        field.setSuffixComponent(new Span("lbs"));
        field.setValue("143");
        fields.add(field);

        field = new MDTextField("Label text");
        field.addThemeName(theme);
        field.setEnabled(false);
        fields.add(field);
    }

}
