package com.example.application.components.dialogs;

import com.example.application.MaterialIcon;
import com.example.application.themes.ButtonTheme;
import com.example.application.themes.DialogTheme;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;

public class BasicDialog extends Dialog {

    private final Button primary;
    private final Button secondary;

    public BasicDialog(String title, String text) {
        setHeaderTitle(title);
        add(new Text(text));

        primary = new Button("Action 1");
        primary.addThemeName(ButtonTheme.TEXT);

        secondary = new Button("Action 2");
        secondary.addThemeName(ButtonTheme.TEXT);

        getFooter().add(secondary, primary);
    }

    public BasicDialog(MaterialIcon icon, String title, String text) {
        this(title, text);
        getHeader().add(icon.create());
        addThemeName(DialogTheme.ICON);
    }

    public Button getPrimaryButton() {
        return primary;
    }

    public Button getSecondaryButton() {
        return secondary;
    }
}
