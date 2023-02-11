package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.Layout;
import com.example.application.components.ToggleButton;
import com.example.application.themes.ButtonTheme;
import com.example.application.utilities.enums.FlexWrap;
import com.example.application.utilities.enums.Gap;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.button.Button;
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

        addH3("Icon button (no toggle)");

        addH4("Standard");
        addIconButtons();

        addH4("Filled");
        addIconButtons(ButtonTheme.FILLED);

        addH4("Filled tonal");
        addIconButtons(ButtonTheme.FILLED_TONAL);

        addH4("Outlined");
        addIconButtons(ButtonTheme.OUTLINED);

        addH3("Icon button (toggle)");

        addH4("Standard");
        addIconToggles();

        addH4("Filled");
        addIconToggles(ButtonTheme.FILLED);

        addH4("Filled tonal");
        addIconToggles(ButtonTheme.FILLED_TONAL);

        addH4("Outlined");
        addIconToggles(ButtonTheme.OUTLINED);
    }

    private void addButtons(String theme) {
        Layout buttons = new Layout();
        buttons.setFlexWrap(FlexWrap.WRAP);
        buttons.setGap(Gap._4);
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

    private void addIconButtons(String... themes) {
        Layout buttons = new Layout();
        buttons.setGap(Gap._4);
        add(buttons);

        Button button = new Button(MaterialIcon.FAVORITE.create());
        button.addThemeNames(themes);
        buttons.add(button);

        button = new Button(MaterialIcon.FAVORITE.create());
        button.addThemeNames(themes);
        button.setEnabled(false);
        buttons.add(button);
    }

    private void addIconToggles(String... themes) {
        Layout toggles = new Layout();
        toggles.setGap(Gap._4);
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
