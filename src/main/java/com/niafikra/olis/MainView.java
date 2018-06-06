package com.niafikra.olis;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@HtmlImport("styles/shared-styles.html")
@Route("")
@Theme(Lumo.class)

@PageTitle("OLIS | Home")
public class MainView extends VerticalLayout {
    private Anchor login = new Anchor();

    public MainView() {
        login.setText("LOGIN");
        login.setHref("/login");
        add(login);
    }
}
