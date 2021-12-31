package com.example.application.components;

import com.example.application.MaterialIcon;
import com.example.application.componentthemes.ButtonTheme;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Header;
import com.vaadin.flow.component.orderedlayout.FlexLayout;

public class TopAppBar extends Header {

	private DrawerToggle navigationIcon;
	private H1 title;
	private FlexLayout interactiveIcons;

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

		navigationIcon = new DrawerToggle();
		title = new H1("Title");
		interactiveIcons = new FlexLayout();
		interactiveIcons.addClassNames("interactive-icons");

		add(navigationIcon, title, interactiveIcons);

		setType(Type.CENTER_ALIGNED);
	}

	public void setType(Type type) {
		if (this.type != null) {
			removeClassName(this.type.getClassName());
		}
		addClassName(type.getClassName());
		this.type = type;

		/* Demo purposes */
		interactiveIcons.removeAll();
		if (this.type.equals(Type.CENTER_ALIGNED)) {
			Button account = new Button(MaterialIcon.ACCOUNT_CIRCLE.create());
			interactiveIcons.add(account);
		} else {
			Button attach = new Button(MaterialIcon.ATTACH_FILE.create());
			Button event = new Button(MaterialIcon.EVENT.create());
			Button more = new Button(MaterialIcon.MORE_VERT.create());
			interactiveIcons.add(attach, event, more);
		}
	}

}
