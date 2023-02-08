package com.example.application.views;

import com.example.application.components.Badge;
import com.example.application.components.Column;
import com.example.application.utilities.enums.Gap;
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
        Column badges = new Column(
                new Badge(),
                new Badge("1"),
                new Badge("999+")
        );
        badges.setGap(Gap._4);
        add(badges);
    }

}
