package com.niafikra.olis.ui.components.subjects;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcons;

@Tag("div")
public class Subject extends Div {
    private Button subscribe = new Button(new Icon(VaadinIcons.LINK));
    private SubjectSubscriptionForm subscriptionForm = new SubjectSubscriptionForm(this);

    public Subject() {
        subscribe.setText(" Subscribe");
        subscribe.addClickListener(e -> {
            subscriptionForm.open();
        });
        add(subscribe);
    }
}
