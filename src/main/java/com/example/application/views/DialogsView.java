package com.example.application.views;

import com.example.application.componentthemes.ButtonTheme;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Dialogs")
@Route(value = "dialogs", layout = MainLayout.class)
public class DialogsView extends View {

    public DialogsView() {
        super("Dialogs");

        Button open = new Button("Basic dialog", e -> {
            Dialog dialog = new Dialog();
            dialog.setHeaderTitle("Basic dialog title");
            dialog.add(new Paragraph("A dialog is a type of modal window that appears in front of app content to " +
                    "provide critical information, or prompt for a decision to be made."));

            Button cancel = new Button("Cancel");
            cancel.addThemeName(ButtonTheme.TEXT);

            Button ok = new Button("OK");
            ok.addThemeName(ButtonTheme.TEXT);

            dialog.getFooter().add(cancel, ok);
            dialog.open();
        });
        open.addThemeName(ButtonTheme.TEXT);
        add(open);
    }



}
