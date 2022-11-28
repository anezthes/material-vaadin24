package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.AssistChip;
import com.example.application.componentthemes.ChipTheme;
import com.example.application.utilityclasses.*;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Chips")
@Route(value = "chips", layout = MainLayout.class)
public class ChipsView extends Main {

    public ChipsView() {
        addClassNames(Padding._6);

        H2 title = new H2("Chips");
        title.addClassNames(Typography.Display.L, Margin._0);
        add(title);

        add(createH3("Assist chip"));
        addAssistChips();
    }

    private H3 createH3(String text) {
        H3 h3 = new H3(text);
        h3.addClassNames(Typography.Body.M, Margin.Bottom._4, Margin.Top._8);
        return h3;
    }

    private void addAssistChips() {
        Div chips = new Div();
        chips.addClassNames(Display.FLEX, Gap._4, Margin.Bottom._4);
        add(chips);

        addChip(chips, null, MaterialIcon.DIRECTIONS_CAR);
        addChip(chips, null, null);

        chips = new Div();
        chips.addClassNames(Display.FLEX, Gap._4);
        add(chips);

        addChip(chips, ChipTheme.ELEVATED, MaterialIcon.DIRECTIONS_CAR);
        addChip(chips, ChipTheme.ELEVATED, null);
    }

    private void addChip(HasComponents container, String theme, MaterialIcon icon) {
        AssistChip chip = new AssistChip("Assist chip");
        if (icon != null) chip.setIcon(icon.create());
        if (theme != null) chip.addThemeName(theme);
        container.add(chip);

        chip = new AssistChip("Assist chip");
        if (icon != null) chip.setIcon(icon.create());
        if (theme != null) chip.addThemeName(theme);
        chip.setEnabled(false);
        container.add(chip);
    }

}
