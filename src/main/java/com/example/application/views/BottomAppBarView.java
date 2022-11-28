package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.BottomAppBar;
import com.example.application.componentthemes.ButtonTheme;
import com.example.application.utilityclasses.Margin;
import com.example.application.utilityclasses.Padding;
import com.example.application.utilityclasses.Typography;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Bottom app bar")
@Route(value = "bottom-app-bar", layout = MainLayout.class)
public class BottomAppBarView extends Main {

    public BottomAppBarView() {
        addClassNames(Padding._6);

        H2 title = new H2("Bottom app bar");
        title.addClassNames(Typography.Display.L, Margin.Bottom._8, Margin.Top._0);
        add(title);

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
