package com.example.application.components;

import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Header;

public class TopAppBar extends Header {

	private DrawerToggle navigationIcon;
	private H1 title;

	public enum Type {
		CENTER_ALIGNED,
		SMALL,
		MEDIUM,
		LARGE;

		public String getClassName() {
			return name().toLowerCase().replace("_", "-");
		}
	}

	private Type type;

	public TopAppBar() {
		addClassName("top-app-bar");
		setType(Type.CENTER_ALIGNED);

		navigationIcon = new DrawerToggle();
		title = new H1("Title");
		add(navigationIcon, title);
	}

	public void setType(Type type) {
		if (this.type != null) {
			removeClassName(this.type.getClassName());
		}
		addClassName(type.getClassName());
		this.type = type;
	}

}
