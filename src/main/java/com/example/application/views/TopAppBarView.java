package com.example.application.views;

import com.example.application.components.TopAppBar;
import com.example.application.utilityclasses.Surface;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Top app bar")
@Route(value = "top-app-bar", layout = MainLayout.class)
public class TopAppBarView extends View {

    public TopAppBarView() {
        super("Top app bar");
        addClassNames(Surface._1);
        setMinHeight(100, Unit.PERCENTAGE);

        addH3("Center aligned");
        addTopAppBar(TopAppBar.Type.CENTER_ALIGNED);

        addH3("Small");
        addTopAppBar(TopAppBar.Type.SMALL);

        addH3("Medium");
        addTopAppBar(TopAppBar.Type.MEDIUM);

        addH3("Large");
        addTopAppBar(TopAppBar.Type.LARGE);
    }

    private void addTopAppBar(TopAppBar.Type type) {
        TopAppBar topAppBar = new TopAppBar();
        topAppBar.setType(type);
        add(topAppBar);
    }

}
