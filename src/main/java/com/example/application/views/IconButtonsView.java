package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.ToggleButton;
import com.example.application.componentthemes.ButtonTheme;
import com.example.application.utilityclasses.Display;
import com.example.application.utilityclasses.Gap;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Icon buttons")
@Route(value = "icon-buttons", layout = MainLayout.class)
public class IconButtonsView extends View {

    public IconButtonsView() {
        super("Icon buttons");

        addH3("No toggle");

        addH4("Standard");
        addButtons();

        addH4("Filled");
        addButtons(ButtonTheme.FILLED);

        addH4("Filled tonal");
        addButtons(ButtonTheme.FILLED_TONAL);

        addH4("Outlined");
        addButtons(ButtonTheme.OUTLINED);

        addH3("Toggle");

        addH4("Standard");
        addToggles();

        addH4("Filled");
        addToggles(ButtonTheme.FILLED);

        addH4("Filled tonal");
        addToggles(ButtonTheme.FILLED_TONAL);

        addH4("Outlined");
        addToggles(ButtonTheme.OUTLINED);
    }

    private void addButtons(String... themes) {
        Div buttons = new Div();
        buttons.addClassNames(Display.FLEX, Gap._4);
        add(buttons);

        Button button = new Button(MaterialIcon.FAVORITE.create());
        button.addThemeNames(themes);
        buttons.add(button);

        button = new Button(MaterialIcon.FAVORITE.create());
        button.addThemeNames(themes);
        button.setEnabled(false);
        buttons.add(button);
    }

    private void addToggles(String... themes) {
        Div toggles = new Div();
        toggles.addClassNames(Display.FLEX, Gap._4);
        add(toggles);

        ToggleButton toggle = new ToggleButton(MaterialIcon.FAVORITE, MaterialIcon.FAVORITE_OUTLINE, "Label");
        toggle.addThemeNames(themes);
        toggles.add(toggle);

        toggle = new ToggleButton(MaterialIcon.FAVORITE, MaterialIcon.FAVORITE_OUTLINE, "Label");
        toggle.addThemeNames(themes);
        toggle.setEnabled(false);
        toggles.add(toggle);
    }

}
