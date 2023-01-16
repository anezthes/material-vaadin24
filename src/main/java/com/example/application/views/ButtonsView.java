package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.componentthemes.ButtonTheme;
import com.example.application.utilityclasses.Display;
import com.example.application.utilityclasses.FlexWrap;
import com.example.application.utilityclasses.Gap;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;

@PageTitle("Buttons")
@Route(value = "buttons", layout = MainLayout.class)
@RouteAlias(value = "buttons", layout = MainLayout.class)
public class ButtonsView extends View {

    public ButtonsView() {
        super("Buttons");

        addH3("Elevated");
        addButtons(ButtonTheme.ELEVATED);

        addH3("Filled");
        addButtons(ButtonTheme.FILLED);

        addH3("Filled tonal");
        addButtons(ButtonTheme.FILLED_TONAL);

        addH3("Outlined");
        addButtons(ButtonTheme.OUTLINED);

        addH3("Text");
        addButtons(ButtonTheme.TEXT);

        addH3("Floating action button (FAB)");
        addButtons(ButtonTheme.FAB);

        addH3("Small FAB");
        addButtons(ButtonTheme.FAB_SMALL);

        addH3("Large FAB");
        addButtons(ButtonTheme.FAB_LARGE);

        addH3("Extended FAB");
        addButtons(ButtonTheme.FAB_EXTENDED);
    }

    private void addButtons(String theme) {
        Div buttons = new Div();
        buttons.addClassNames(Display.FLEX, FlexWrap.WRAP, Gap._4);
        add(buttons);

        if (theme.equals(ButtonTheme.FAB) || theme.equals(ButtonTheme.FAB_SMALL) || theme.equals(ButtonTheme.FAB_LARGE)) {
            addButton(buttons, theme, MaterialIcon.ADD);

        } else if (theme.equals(ButtonTheme.FAB_EXTENDED)) {
            addButton(buttons, theme, "Button", MaterialIcon.ADD);

        } else {
            addButton(buttons, theme, "Button");
            addButton(buttons, theme, "Button", MaterialIcon.ADD);
        }
    }

    private void addButton(HasComponents container, String theme, String label) {
        addButton(container, theme, label, null);
    }

    private void addButton(HasComponents container, String theme, MaterialIcon icon) {
        addButton(container, theme, null, icon);
    }

    private void addButton(HasComponents container, String theme, String label, MaterialIcon icon) {
        // Enabled
        Button button = new Button();
        if (label != null) button.setText(label);
        if (icon != null) button.setIcon(icon.create());
        button.addThemeName(theme);
        container.add(button);

        // Disabled
        button = new Button();
        if (label != null) button.setText(label);
        if (icon != null) button.setIcon(icon.create());
        button.addThemeName(theme);
        button.setEnabled(false);
        container.add(button);
    }

}
