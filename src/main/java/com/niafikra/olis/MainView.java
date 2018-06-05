package com.niafikra.olis;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@HtmlImport("styles/shared-styles.html")
@Route("")
public class MainView extends VerticalLayout {

    private Span label;

    public MainView() {
        label = new Span("Hello Vaadin+User");
        add(label);
    }
}
