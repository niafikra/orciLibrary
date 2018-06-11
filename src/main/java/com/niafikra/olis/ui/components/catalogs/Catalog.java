package com.niafikra.olis.ui.components.catalogs;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcons;

@Tag("div")
public class Catalog extends Div {

    private Button newCatalog = new Button(new Icon(VaadinIcons.PLUS));
    private CatalogCrudForm catalogForm = new CatalogCrudForm(this);

    public Catalog() {
        setClassName("container");

        newCatalog.addClickListener(e -> {
            catalogForm.open();
        });

        add(newCatalog);
    }
}
