package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.ToggleButton;
import com.example.application.componentthemes.ButtonTheme;
import com.example.application.utilityclasses.*;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Icon buttons")
@Route(value = "icon-buttons", layout = MainLayout.class)
public class IconButtonsView extends Main {

    public IconButtonsView() {
        addClassNames(Padding._6);

        H2 title = new H2("Icon buttons");
        title.addClassNames(Typography.Display.L, Margin._0);
        add(title);

        H3 subtitle = new H3("No toggle");
        subtitle.addClassNames(Typography.Display.M, Margin.Bottom._0);
        add(subtitle);

        add(createH4("Standard"));
        addButtons();

        add(createH4("Filled"));
        addButtons(ButtonTheme.FILLED);

        add(createH4("Filled tonal"));
        addButtons(ButtonTheme.FILLED_TONAL);

        add(createH4("Outlined"));
        addButtons(ButtonTheme.OUTLINED);

        subtitle = new H3("Toggle");
        subtitle.addClassNames(Typography.Display.M, Margin.Bottom._0);
        add(subtitle);

        add(createH4("Standard"));
        addToggles();

        add(createH4("Filled"));
        addToggles(ButtonTheme.FILLED);

        add(createH4("Filled tonal"));
        addToggles(ButtonTheme.FILLED_TONAL);

        add(createH4("Outlined"));
        addToggles(ButtonTheme.OUTLINED);
    }

    private H4 createH4(String text) {
        H4 h4 = new H4(text);
        h4.addClassNames(Typography.Body.M, Margin.Bottom._4, Margin.Top._8);
        return h4;
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
