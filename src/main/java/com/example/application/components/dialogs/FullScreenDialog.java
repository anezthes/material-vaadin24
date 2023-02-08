package com.example.application.components.dialogs;

import com.example.application.MaterialIcon;
import com.example.application.themes.ButtonTheme;
import com.example.application.themes.DialogTheme;
import com.example.application.utilities.classes.Inset;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.theme.lumo.LumoUtility;

public class FullScreenDialog extends Dialog {

    private Button close;
    private Button save;

    public FullScreenDialog(String title, Component... components) {
        addThemeName(DialogTheme.FULL_SCREEN);
        setSizeFull();

        setHeaderTitle(title);

        close = new Button(MaterialIcon.CLOSE.create(), e -> close());
        close.addClassNames(LumoUtility.Position.ABSOLUTE, Inset.Left._1);
        close.getElement().setAttribute("aria-label", "Close");

        save = new Button("Save");
        save.addThemeName(ButtonTheme.TEXT);

        getHeader().add(close, save);

        add(components);
    }

}
