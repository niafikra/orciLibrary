package com.niafikra.olis;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Anchor;
import com.vaadin.flow.component.html.Span;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@HtmlImport("frontend://styles/shared-styles.html")
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
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
