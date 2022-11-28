package com.example.application.views;

import com.example.application.components.TopAppBar;
import com.example.application.utilityclasses.Margin;
import com.example.application.utilityclasses.Padding;
import com.example.application.utilityclasses.Surface;
import com.example.application.utilityclasses.Typography;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.H3;
import com.vaadin.flow.component.html.Main;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Top app bar")
@Route(value = "top-app-bar", layout = MainLayout.class)
public class TopAppBarView extends Main {

    public TopAppBarView() {
        addClassNames(Padding._6, Surface._1);
        setMinHeight(100, Unit.PERCENTAGE);

        H2 title = new H2("Top app bar");
        title.addClassNames(Typography.Display.L, Margin._0);
        add(title);

        add(createH3("Center aligned"));
        addTopAppBar(TopAppBar.Type.CENTER_ALIGNED);

        add(createH3("Small"));
        addTopAppBar(TopAppBar.Type.SMALL);

        add(createH3("Medium"));
        addTopAppBar(TopAppBar.Type.MEDIUM);

        add(createH3("Large"));
        addTopAppBar(TopAppBar.Type.LARGE);
    }

    private H3 createH3(String text) {
        H3 h3 = new H3(text);
        h3.addClassNames(Typography.Body.M, Margin.Bottom._4, Margin.Top._8);
        return h3;
    }

    private void addTopAppBar(TopAppBar.Type type) {
        TopAppBar topAppBar = new TopAppBar();
        topAppBar.setType(type);
        add(topAppBar);
    }

}
