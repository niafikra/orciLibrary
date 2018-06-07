package com.niafikra.olis.ui.components.user;

import com.niafikra.olis.predefinedmodels.SexItems;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.combobox.ComboBox;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcons;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;

public class ProfileEditorDialog extends Dialog {

    private H3 title = new H3("Edit Profile");
    private TextField firstName = new TextField("First Name:");
    private TextField middleName = new TextField("Middle Name:");
    private TextField lastName = new TextField("Last Name:");
    private TextField phoneNo = new TextField("Phone Number:");
    private TextField email = new TextField("Email:");
    private ComboBox<SexItems> sex = new ComboBox("Sex:");
    private Button save = new Button(" Save");
    private Button cancel = new Button(new Icon(VaadinIcons.CLOSE));
    private Object controlview;

    public ProfileEditorDialog(Object controlview) {
        this.controlview = controlview;

        ProfilePhotoUpload profilePhotoUpload = new ProfilePhotoUpload(controlview);

        setCloseOnEsc(false);
        setCloseOnOutsideClick(false);

        sex.setItems(SexItems.values());

        cancel.addClickListener(e -> {
            close();
        });

        cancel.setText(" Cancel");
        save.setIcon(new Icon(VaadinIcons.CHECK));
        save.getElement().setAttribute("theme", "primary");

        HorizontalLayout buttons = new HorizontalLayout(save, cancel);
        FormLayout profileForm = new FormLayout(
                new VerticalLayout(title, firstName,
                        lastName, middleName, lastName, email, phoneNo, sex, buttons)
        );

        VerticalLayout imagecontainer = new VerticalLayout(new H4("Change profile photo"), profilePhotoUpload);
        imagecontainer.setMargin(true);

        add(new HorizontalLayout(profileForm, imagecontainer));

    }
}
