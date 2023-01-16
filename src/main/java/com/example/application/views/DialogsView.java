package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.BasicDialog;
import com.example.application.componentthemes.ButtonTheme;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Dialogs")
@Route(value = "dialogs", layout = MainLayout.class)
public class DialogsView extends View {

    public DialogsView() {
        super("Dialogs");

        Button open = new Button("Basic dialog", e -> new BasicDialog(
                "Basic dialog title",
                "A dialog is a type of modal window that appears in front of app content to provide " +
                        "critical information, or prompt for a decision to be made."
        ).open());
        open.addThemeName(ButtonTheme.TEXT);
        add(open);

        open = new Button("Dialog with icon", e -> new BasicDialog(
                MaterialIcon.MOBILE_FRIENDLY,
                "Dialog with hero icon",
                "A dialog is a type of modal window that appears in front of app content to provide " +
                        "critical information, or prompt for a decision to be made."
        ).open());
        open.addThemeName(ButtonTheme.TEXT);
        add(open);
    }



}
