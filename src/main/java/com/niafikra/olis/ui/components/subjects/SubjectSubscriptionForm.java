package com.niafikra.olis.ui.components.subjects;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcons;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

public class SubjectSubscriptionForm extends Dialog {
    private H3 formtitle = new H3("Subscription Form");
    private Paragraph intro = new Paragraph("Please check Subject that you need to be notified:");
    private SubjectsFormList subjectCheckbox;
    private Button save = new Button(new Icon(VaadinIcons.CHECK));
    private Button cancel = new Button(new Icon(VaadinIcons.CLOSE));
    private Object controlView;

    public SubjectSubscriptionForm(Object controlView) {
        this.controlView = controlView;

        setCloseOnEsc(false);
        setCloseOnOutsideClick(false);

        subjectCheckbox = new SubjectsFormList(controlView);

        save.setText("Subscribe");

        cancel.addClickListener(e -> {
            close();
        });

        save.addClickListener(e -> {
            // subcription method here
        });
        HorizontalLayout buttons = new HorizontalLayout(save, cancel);
        VerticalLayout subcriptionForm = new VerticalLayout(formtitle, intro,
                new FormLayout(subjectCheckbox), buttons);

        add(subcriptionForm);

    }
}
