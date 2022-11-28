package com.example.application.components;

import com.example.application.MaterialIcon;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.RouterLink;

public class NavigationDrawerItem extends ListItem {

    public static final String NAVIGATION_DRAWER_ITEM = "navigation-drawer-item";

    private RouterLink link;

    public NavigationDrawerItem(Class<? extends Component> view, String label, MaterialIcon icon) {
        addClassName(NAVIGATION_DRAWER_ITEM);

        link = new RouterLink();
        link.add(icon.create(), new Span(label));
        link.setRoute(view);
        add(link);
    }

    public NavigationDrawerItem(Class<? extends Component> view, String label, MaterialIcon icon, String badge) {
        this(view, label, icon);
        link.add(new Span(badge));
    }

}
