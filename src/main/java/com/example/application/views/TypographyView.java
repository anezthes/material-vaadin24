package com.example.application.views;

import com.example.application.utilityclasses.Display;
import com.example.application.utilityclasses.FlexDirection;
import com.example.application.utilityclasses.Gap;
import com.example.application.utilityclasses.Typography;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import org.apache.commons.lang3.StringUtils;

@PageTitle("Typography")
@Route(value = "typography", layout = MainLayout.class)
public class TypographyView extends View {

    public TypographyView() {
        super("Typography");

        addH3("Display");
        addTexts(Typography.Display.L, Typography.Display.M, Typography.Display.S);

        addH3("Headline");
        addTexts(Typography.Headline.L, Typography.Headline.M, Typography.Headline.S);

        addH3("Title");
        addTexts(Typography.Title.L, Typography.Title.M, Typography.Title.S);

        addH3("Label");
        addTexts(Typography.Label.L, Typography.Label.M, Typography.Label.S);

        addH3("Body");
        addTexts(Typography.Body.L, Typography.Body.M, Typography.Body.S);
    }

    private void addTexts(String... classNames) {
        Div texts = new Div();
        texts.addClassNames(Display.FLEX, FlexDirection.COLUMN, Gap._4);

        for (String className : classNames) {
            Span text = new Span(
                    StringUtils.capitalize(className.replace("-", " "))
            );
            text.addClassNames(className);
            texts.add(text);
        }

        add(texts);
    }

}
