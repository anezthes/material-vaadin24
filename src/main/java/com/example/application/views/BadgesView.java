package com.example.application.views;

import com.example.application.components.Badge;
import com.example.application.utilityclasses.Display;
import com.example.application.utilityclasses.FlexDirection;
import com.example.application.utilityclasses.Gap;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Badges")
@Route(value = "badges", layout = MainLayout.class)
public class BadgesView extends View {

    public BadgesView() {
        super("Badges");
        addBadges();
    }

    private void addBadges() {
        Div badges = new Div(
                new Badge(),
                new Badge("1"),
                new Badge("999+")
        );
        badges.addClassNames(Display.FLEX, FlexDirection.COLUMN, Gap._4);
        add(badges);
    }

}
