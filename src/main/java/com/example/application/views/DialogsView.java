package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.Column;
import com.example.application.components.dialogs.BasicDialog;
import com.example.application.components.dialogs.FullScreenDialog;
import com.example.application.themes.ButtonTheme;
import com.example.application.themes.TextFieldTheme;
import com.example.application.utilities.enums.Gap;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.datepicker.DatePicker;
import com.vaadin.flow.component.textfield.EmailField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.component.timepicker.TimePicker;
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

        open = new Button("Full-screen dialog", e -> new FullScreenDialog(
                "Full-screen dialog title",
                createFullScreenDialogContent()
        ).open());
        open.addThemeName(ButtonTheme.TEXT);
        add(open);
    }

    private Component createFullScreenDialogContent() {
        EmailField email = new EmailField("Email");
        email.setValue("leevillanuevanotes@gmail.com");
        email.addThemeName(TextFieldTheme.OUTLINED);

        TextField event = new TextField("Event");
        event.addThemeName(TextFieldTheme.OUTLINED);

        DatePicker from = new DatePicker("From");
        from.addThemeName(TextFieldTheme.OUTLINED);

        DatePicker to = new DatePicker("To");
        to.addThemeName(TextFieldTheme.OUTLINED);

        Checkbox allday = new Checkbox("All day");

        ComboBox timezone = new ComboBox("Timezone");
        timezone.addThemeName(TextFieldTheme.OUTLINED);
        timezone.setItems("Pacific Standard Time");
        timezone.setValue("Pacific Standard Time");

        Column form = new Column(email, event, from, to, allday, timezone);
        form.setGap(Gap._6);
        return form;
    }

}
