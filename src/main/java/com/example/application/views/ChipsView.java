package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.chips.AssistChip;
import com.example.application.components.chips.FilterChip;
import com.example.application.components.chips.InputChip;
import com.example.application.componentthemes.ChipTheme;
import com.example.application.utilityclasses.Display;
import com.example.application.utilityclasses.FlexWrap;
import com.example.application.utilityclasses.Gap;
import com.example.application.utilityclasses.Margin;
import com.vaadin.flow.component.HasComponents;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Chips")
@Route(value = "chips", layout = MainLayout.class)
public class ChipsView extends View {

    public ChipsView() {
        super("Chips");

        addH3("Assist chip");
        addAssistChips();

        addH3("Filter chip");
        addFilterChips();

        addH3("Input chip");
        addInputChips();
    }

    private void addAssistChips() {
        Div chips = new Div();
        chips.addClassNames(Display.FLEX, FlexWrap.WRAP, Gap._4, Margin.Bottom._4);
        add(chips);

        addAssistChip(chips, null, MaterialIcon.DIRECTIONS_CAR);
        addAssistChip(chips, null, null);

        chips = new Div();
        chips.addClassNames(Display.FLEX, FlexWrap.WRAP, Gap._4);
        add(chips);

        addAssistChip(chips, ChipTheme.ELEVATED, MaterialIcon.DIRECTIONS_CAR);
        addAssistChip(chips, ChipTheme.ELEVATED, null);
    }

    private void addAssistChip(HasComponents container, String theme, MaterialIcon icon) {
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

    private void addFilterChips() {
        Div chips = new Div();
        chips.addClassNames(Display.FLEX, Gap._4, Margin.Bottom._4);
        add(chips);

        addFilterChip(chips, null, MaterialIcon.DIRECTIONS_CAR);
        addFilterChip(chips, null, null);

        chips = new Div();
        chips.addClassNames(Display.FLEX, Gap._4);
        add(chips);

        addFilterChip(chips, ChipTheme.ELEVATED, MaterialIcon.DIRECTIONS_CAR);
        addFilterChip(chips, ChipTheme.ELEVATED, null);
    }

    private void addFilterChip(HasComponents container, String theme, MaterialIcon icon) {
        FilterChip chip = new FilterChip("Filter chip");
        if (icon != null) chip.setIcon(icon.create());
        if (theme != null) chip.addThemeName(theme);
        container.add(chip);

        chip = new FilterChip("Filter chip");
        if (icon != null) chip.setIcon(icon.create());
        if (theme != null) chip.addThemeName(theme);
        chip.setEnabled(false);
        container.add(chip);
    }

    private void addInputChips() {
        Div chips = new Div();
        chips.addClassNames(Display.FLEX, Gap._4, Margin.Bottom._4);
        add(chips);

        addInputChip(chips, null, MaterialIcon.DIRECTIONS_CAR);
        addInputChip(chips, null, (MaterialIcon) null);

        chips = new Div();
        chips.addClassNames(Display.FLEX, Gap._4, Margin.Bottom._4);
        add(chips);

        addInputChip(chips, ChipTheme.SELECTED, MaterialIcon.DIRECTIONS_CAR);
        addInputChip(chips, ChipTheme.SELECTED, (MaterialIcon) null);

        chips = new Div();
        chips.addClassNames(Display.FLEX, Gap._4);
        add(chips);

        addInputChip(chips, "images/avatar.png", "Avatar");
    }

    private void addInputChip(HasComponents container, String src, String alt) {
        InputChip chip = new InputChip("Input chip");
        chip.setIcon(new Image(src, alt));
        container.add(chip);

        chip = new InputChip("Input chip");
        chip.setIcon(new Image(src, alt));
        chip.setEnabled(false);
        container.add(chip);
    }

    private void addInputChip(HasComponents container, String theme, MaterialIcon icon) {
        InputChip chip = new InputChip("Input chip");
        if (icon != null) chip.setIcon(icon.create());
        if (theme != null) chip.addThemeName(theme);
        container.add(chip);

        chip = new InputChip("Input chip");
        if (icon != null) chip.setIcon(icon.create());
        if (theme != null) chip.addThemeName(theme);
        chip.setEnabled(false);
        container.add(chip);
    }
}
