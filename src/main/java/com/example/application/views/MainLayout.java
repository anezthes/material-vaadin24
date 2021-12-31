package com.example.application.views;

import com.example.application.components.NavigationDrawerItem;
import com.example.application.components.TopAppBar;
import com.example.application.MaterialIcon;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.dependency.StyleSheet;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.router.PageTitle;

@CssImport("/themes/material/styles.css")
@CssImport(value = "/themes/material/components/app-layout.css", themeFor = "vaadin-app-layout")
@CssImport(value = "/themes/material/components/button.css", themeFor = "vaadin-button")
@CssImport(value = "/themes/material/components/drawer-toggle.css", themeFor = "vaadin-drawer-toggle")
@PageTitle("Material Design 3 for Vaadin 23")
@StyleSheet("https://fonts.googleapis.com/icon?family=Material+Icons")
public class MainLayout extends AppLayout {

	public TopAppBar topAppBar;

	public String STYLES_LABEL = "styles-label";
	public String COMPONENTS_LABEL = "components-label";

	public MainLayout() {
		getElement().executeJs(
				"var prevScrollPos = 0;" +
						"var topappbar = document.querySelector('.top-app-bar');" +
						"var content = this.shadowRoot.querySelector('[content]');" +
						"content.addEventListener('scroll', function(e) {" +
						"  if (content.scrollTop > 0) {" +
						"    topappbar.classList.add('surface-2');" +
						"  } else {" +
						"    topappbar.classList.remove('surface-2');" +
						"  }" +
						"});"
		);
		setPrimarySection(Section.DRAWER);
		createAppBar();
		createNavigationDrawer();
	}

	private void createAppBar() {
		topAppBar = new TopAppBar();
		topAppBar.setType(TopAppBar.Type.SMALL);
		addToNavbar(topAppBar);
	}

	private void createNavigationDrawer() {
		// Styles
		createStylesNav();

		// Components
		createComponentsNav();
	}

	private void createStylesNav() {
		H2 label = new H2("Styles");
		label.setId(STYLES_LABEL);

		UnorderedList list = new UnorderedList();
		list.add(
				new NavigationDrawerItem(ColorView.class, "Color", MaterialIcon.PALETTE),
                new NavigationDrawerItem(TypographyView.class, "Typography", MaterialIcon.ABC)
		);

		Nav nav = new Nav(label, list);
		nav.getElement().setAttribute("aria-labelledby", STYLES_LABEL);
		addToDrawer(nav);
	}

	private void createComponentsNav() {
		H2 label = new H2("Components");
		label.setId(COMPONENTS_LABEL);

		UnorderedList list = new UnorderedList();
		list.add(
				new NavigationDrawerItem(ButtonsView.class, "Buttons", MaterialIcon.INBOX, "26"),
				new NavigationDrawerItem(CardsView.class, "Cards", MaterialIcon.OUTBOX, "100+"),
				new NavigationDrawerItem(ChipsView.class, "Chips", MaterialIcon.FAVORITE),
				new NavigationDrawerItem(DialogsView.class, "Dialogs", MaterialIcon.DELETE),
				new NavigationDrawerItem(NavigationBarView.class, "Navigation bar", MaterialIcon.CIRCLE),
				new NavigationDrawerItem(NavigationDrawerView.class, "Navigation drawer", MaterialIcon.CHANGE_HISTORY),
				new NavigationDrawerItem(NavigationRailView.class, "Navigation rail", MaterialIcon.SQUARE),
				new NavigationDrawerItem(TopAppBarView.class, "Top app bar", MaterialIcon.CIRCLE)
		);

		Nav nav = new Nav(label, list);
		nav.getElement().setAttribute("aria-labelledby", COMPONENTS_LABEL);
		addToDrawer(nav);
	}
}
