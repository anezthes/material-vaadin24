package com.example.application.components;

import com.example.application.MaterialIcon;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.html.ListItem;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.RouterLink;

public class NavigationDrawerItem extends ListItem {

	private RouterLink link;

	public NavigationDrawerItem(Class<? extends Component> view, String label, MaterialIcon icon) {
		addClassName("navigation-drawer-item");

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
