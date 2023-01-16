package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.BottomAppBar;
import com.example.application.componentthemes.ButtonTheme;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Bottom app bar")
@Route(value = "bottom-app-bar", layout = MainLayout.class)
public class BottomAppBarView extends View {

    public BottomAppBarView() {
        super("Bottom app bar");
        addBottomAppBar();
    }

    private void addBottomAppBar() {
        BottomAppBar bottomAppBar = new BottomAppBar(
                new Button(MaterialIcon.SEARCH.create()),
                new Button(MaterialIcon.DELETE.create()),
                new Button(MaterialIcon.ARCHIVE.create()),
                new Button(MaterialIcon.REPLY.create())
        );

        Button fab = new Button(MaterialIcon.ADD.create());
        fab.addThemeName(ButtonTheme.FAB);
        bottomAppBar.setPrimaryAction(fab);

        add(bottomAppBar);
    }

}
