package com.niafikra.olis.ui.views;

import com.niafikra.olis.ui.components.catalogs.Catalog;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@HtmlImport("frontend://styles/shared-styles.html")
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, users-scalable=yes")
@Route("catalogs")
@Theme(Lumo.class)
@PageTitle("OLIS | Catalog")
public class CatalogView extends Div {
    public CatalogView() {
        setClassName("catalogs");
        add(new Catalog());
    }
}
