package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.MDTextField;
import com.example.application.componentthemes.TextFieldTheme;
import com.example.application.utilityclasses.*;
import com.vaadin.flow.component.html.*;
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
        addTextFields(TextFieldTheme.FILLED);

        add(createH3("Outlined"));
        addTextFields(TextFieldTheme.OUTLINED);
    }

    private H3 createH3(String text) {
        H3 h3 = new H3(text);
        h3.addClassNames(Typography.Body.M, Margin.Bottom._4, Margin.Top._8);
        return h3;
    }

    private void addTextFields(String theme) {
        Div fields = new Div();
        fields.addClassNames(Display.FLEX, FlexWrap.WRAP, Gap._4);
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
