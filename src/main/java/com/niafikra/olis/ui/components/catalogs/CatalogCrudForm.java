package com.niafikra.olis.ui.components.catalogs;

import com.niafikra.olis.predefinedmodels.CategoryItems;
import com.niafikra.olis.predefinedmodels.MaterialItems;
import com.niafikra.olis.ui.components.subjects.SubjectsFormList;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcons;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextArea;
import com.vaadin.flow.component.textfield.TextField;


public class CatalogCrudForm extends Dialog {

    private H3 formtitle = new H3("CatalogView Manager");
    private TextField title = new TextField("Title");
    private TextField author = new TextField("Author");
    private TextField publisher = new TextField("Publisher");
    private TextField isbn = new TextField("ISBN");
    private TextField issn = new TextField("ISSN");
    private TextField location = new TextField("Shelf Location");
    private TextArea descriptions = new TextArea("Descriptions");
    private ComboBox<CategoryItems> itemcategory = new ComboBox("Category");
    private ComboBox<MaterialItems> material = new ComboBox("Material type");
    private SubjectsFormList subjectCheckbox;

    private Button save = new Button(new Icon(VaadinIcons.CHECK));
    private Button delete = new Button(new Icon(VaadinIcons.TRASH));
    private Button cancel = new Button(new Icon(VaadinIcons.CLOSE));

    private Object controlView;

    public CatalogCrudForm(Object controlView) {
        this.controlView = controlView;

        setCloseOnEsc(false);
        setCloseOnOutsideClick(false);

        itemcategory.setItems(CategoryItems.values());
        material.setItems(MaterialItems.values());

        subjectCheckbox = new SubjectsFormList(controlView);

        cancel.addClickListener(e -> {
            close();
        });

        delete.addClickListener(e -> {
            // delete action here
        });

        save.addClickListener(e -> {
            // save action here
        });

        delete.getElement().setAttribute("theme", "error");
        save.getElement().setAttribute("theme", "primary");
        cancel.setText(" Cancel");
        save.setText(" Save");
        delete.setText(" Delete");

        HorizontalLayout buttons = new HorizontalLayout(save, delete, cancel);

        VerticalLayout catalogueForm = new VerticalLayout(formtitle,
                new FormLayout(title, author, publisher, isbn, issn, location, descriptions,
                        itemcategory, material, subjectCheckbox), buttons);

        add(catalogueForm);
    }
}
