package com.example.application.views;

import com.example.application.MaterialIcon;
import com.example.application.components.NavigationDrawerItem;
import com.example.application.components.appbars.TopAppBar;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.html.H2;
import com.vaadin.flow.component.html.Nav;
import com.vaadin.flow.component.html.UnorderedList;
import com.vaadin.flow.router.PageTitle;

@CssImport("./themes/material/styles.css")
@CssImport(value = "./themes/material/components/app-layout.css", themeFor = "vaadin-app-layout")
@CssImport(value = "./themes/material/components/button.css", themeFor = "vaadin-button")
@CssImport(value = "./themes/material/components/checkbox.css", themeFor = "vaadin-checkbox")
@CssImport(value = "./themes/material/components/checkbox-group.css", themeFor = "vaadin-checkbox-group")
@CssImport(value = "./themes/material/components/date-picker.css", themeFor = "vaadin-date-picker")
@CssImport(value = "./themes/material/components/date-picker-overlay-content.css", themeFor = "vaadin-date-picker-overlay-content")
@CssImport(value = "./themes/material/components/dialog.css", themeFor = "vaadin-dialog-overlay")
@CssImport(value = "./themes/material/components/drawer-toggle.css", themeFor = "vaadin-drawer-toggle")
@CssImport(value = "./themes/material/components/input-container.css", themeFor = "vaadin-input-container")
@CssImport(value = "./themes/material/components/radio-button.css", themeFor = "vaadin-radio-button")
@CssImport(value = "./themes/material/components/radio-group.css", themeFor = "vaadin-radio-group")
@CssImport(value = "./themes/material/components/text-field.css", themeFor = "vaadin-combo-box")
@CssImport(value = "./themes/material/components/text-field.css", themeFor = "vaadin-date-picker")
@CssImport(value = "./themes/material/components/text-field.css", themeFor = "vaadin-text-field")
@PageTitle("Material Design 3 for Vaadin 23")
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
                new NavigationDrawerItem(BadgesView.class, "Badges", MaterialIcon.BADGE),
                new NavigationDrawerItem(BottomAppBarView.class, "Bottom app bar", MaterialIcon.VERTICAL_ALIGN_BOTTOM),
                new NavigationDrawerItem(ButtonsView.class, "Buttons", MaterialIcon.ADS_CLICK, "26"),
                new NavigationDrawerItem(CardsView.class, "Cards", MaterialIcon.DASHBOARD, "100+"),
                new NavigationDrawerItem(CheckboxView.class, "Checkbox", MaterialIcon.CHECK_BOX),
                new NavigationDrawerItem(ChipsView.class, "Chips", MaterialIcon.MEMORY),
                new NavigationDrawerItem(DatePickersView.class, "Date pickers", MaterialIcon.TODAY),
                new NavigationDrawerItem(DialogsView.class, "Dialogs", MaterialIcon.WEB_ASSET),
                new NavigationDrawerItem(NavigationBarView.class, "Navigation bar", MaterialIcon.CIRCLE),
                new NavigationDrawerItem(NavigationDrawerView.class, "Navigation drawer", MaterialIcon.MENU),
                new NavigationDrawerItem(NavigationRailView.class, "Navigation rail", MaterialIcon.SQUARE),
                new NavigationDrawerItem(RadioButtonView.class, "Radio button", MaterialIcon.RADIO_BUTTON_ON),
                new NavigationDrawerItem(TextFieldsView.class, "Text field", MaterialIcon.INPUT),
                new NavigationDrawerItem(TopAppBarView.class, "Top app bar", MaterialIcon.VERTICAL_ALIGN_TOP)
        );

        Nav nav = new Nav(label, list);
        nav.getElement().setAttribute("aria-labelledby", COMPONENTS_LABEL);
        addToDrawer(nav);
    }
}
