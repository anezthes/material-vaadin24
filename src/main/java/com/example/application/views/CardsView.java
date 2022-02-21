package com.example.application.views;

import com.example.application.components.Card;
import com.example.application.componentthemes.ButtonTheme;
import com.example.application.componentthemes.CardTheme;
import com.example.application.utilityclasses.*;
import com.vaadin.flow.component.Unit;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@PageTitle("Cards")
@Route(value = "cards", layout = MainLayout.class)
public class CardsView extends Main {

	public CardsView() {
		addClassNames(Padding._6);

		H2 title = new H2("Cards");
		title.addClassNames(Typography.Display.L, Margin._0);
		add(title);

		add(createH3("Elevated"));
		addCard(CardTheme.ELEVATED);

		add(createH3("Filled"));
		addCard(CardTheme.FILLED);

		add(createH3("Outlined"));
		addCard(CardTheme.OUTLINED);

		add(createH3("Examples"));
		addCardExamples();
	}

	private H3 createH3(String text) {
		H3 h3 = new H3(text);
		h3.addClassNames(Typography.Body.M, Margin.Bottom._4, Margin.Top._8);
		return h3;
	}

	private void addCard(String theme) {
		Card card = new Card();
		card.addThemeName(theme);
		card.setHeight(128, Unit.PIXELS);
		card.setWidth(288, Unit.PIXELS);
		card.setFocusable(true);
		add(card);
	}

	private void addCardExamples() {
		Div cards = new Div(
			createCardExample1(CardTheme.ELEVATED),
			createCardExample2(CardTheme.OUTLINED),
			createCardExample3(CardTheme.ELEVATED),
			createCardExample4(CardTheme.FILLED)
		);
		cards.addClassNames(Display.FLEX, FlexDirection.COLUMN, Gap._4);
		add(cards);
	}

	private Card createCardExample1(String theme) {
		Image image = new Image("https://images.unsplash.com/photo-1433838552652-f9a46b332c40", "Photo of Cappadocia, Turkey by Daniela Cuevas");
		image.setHeight(168, Unit.PIXELS);

		Span headline = new Span("Headline");
		headline.addClassNames(Typography.Headline.M);

		Span supportingText = new Span("Supporting text");
		supportingText.addClassNames(Typography.Body.M);

		Div text = new Div(headline, supportingText);
		text.addClassNames(Display.FLEX, FlexDirection.COLUMN, Gap._1, Padding.Bottom._2, Padding.Horizontal._4, Padding.Top._3);

		Button button = new Button("Button");
		button.addThemeName(ButtonTheme.FILLED);

		Div buttons = new Div(button);
		buttons.addClassNames(Display.FLEX, Gap._2, Padding._4);

		Card card = new Card(image, text, buttons);
		card.addThemeName(theme);
		card.setWidth(360, Unit.PIXELS);
		return card;
	}

	private Card createCardExample2(String theme) {
		Image image = new Image("https://images.unsplash.com/photo-1507525428034-b723cf961d3e", "Photo of North Shore, Waialua, United States by Sean Oulashin");
		image.setHeight(220, Unit.PIXELS);

		Span headline = new Span("Headline");
		headline.addClassNames(Typography.Display.M);

		Span subhead = new Span("Subhead");
		subhead.addClassNames(Typography.Headline.S);

		Span supportingText = new Span("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		supportingText.addClassNames(Typography.Body.M);

		Div text = new Div(headline, subhead, supportingText);
		text.addClassNames(
				Display.FLEX, FlexDirection.COLUMN, Gap._3,
				Padding.Bottom._4, Padding.Horizontal._6, Padding.Top._6
		);

		Button button1 = new Button("Button");
		button1.addThemeName(ButtonTheme.OUTLINED);

		Button button2 = new Button("Button");
		button2.addThemeName(ButtonTheme.FILLED);

		Div buttons = new Div(button1, button2);
		buttons.addClassNames(JustifyContent.END, Display.FLEX, Gap._2, Padding._4);

		Card card = new Card(image, text, buttons);
		card.addThemeName(theme);
		card.setWidth(506, Unit.PIXELS);
		return card;
	}

	private Card createCardExample3(String theme) {
		Image image = new Image("https://images.unsplash.com/photo-1506744038136-46273834b3fb", "Photo of Yosemite Valley, United States by Bailey Zindel");
		image.setHeight(218, Unit.PIXELS);

		Span headline = new Span("Headline");
		headline.addClassNames(Typography.Headline.S);

		Span subhead = new Span("Subhead");
		subhead.addClassNames(Margin.Bottom._1, Margin.Top._2);

		Span supportingText = new Span("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");
		supportingText.addClassNames(Typography.Body.S);

		Div text = new Div(headline, subhead, supportingText);
		text.addClassNames(
				Display.FLEX, FlexDirection.COLUMN,
				Padding.Bottom._5, Padding.Horizontal._3, Padding.Top._4
		);

		Card card = new Card(image, text);
		card.addThemeName(theme);
		card.setWidth(360, Unit.PIXELS);
		return card;
	}

	private Card createCardExample4(String theme) {
		Span headline = new Span("Headline");
		headline.addClassNames(Typography.Headline.S);

		Span supportingText = new Span("Supporting text");
		supportingText.addClassNames(Typography.Body.M);

		Div text = new Div(headline, supportingText);
		text.addClassNames(
				Display.FLEX, FlexDirection.COLUMN,
				Padding._4
		);

		Button button = new Button("Button");
		button.addThemeName(ButtonTheme.FILLED);

		Div buttons = new Div(button);
		buttons.addClassNames(Display.FLEX, Gap._2, Padding._4);

		Card card = new Card(text, buttons);
		card.addClassNames(JustifyContent.BETWEEN);
		card.addThemeName(theme);
		card.setHeight(168, Unit.PIXELS);
		card.setWidth(360, Unit.PIXELS);
		return card;
	}

}
