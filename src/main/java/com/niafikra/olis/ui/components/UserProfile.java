package com.niafikra.olis.ui.components;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

@Tag("div")
public class UserProfile extends Div {
    private H2 fullname;
    private Image userimage;
    private Paragraph email;
    private Paragraph phone;
    private Paragraph sexStatus;
    private Anchor editlink;
    private Div detailcontainer;

    public UserProfile() {
        fullname = new H2("Chloe Michael Steel");
        email = new Paragraph("chloesullivan12@live.com");
        phone = new Paragraph("+1-111-222");
        sexStatus = new Paragraph("Female, Librarian");

        editlink = new Anchor();
        editlink.setText("Edit");
        editlink.setHref("profile/edit");
        editlink.setClassName("edit-btn");

        userimage = new Image();
        userimage.setSrc("frontend/images/samples/profile.jpg");
        userimage.setAlt("Profile Picture");
        userimage.setClassName("profile-sample");


        detailcontainer = new Div();
        detailcontainer.setClassName("user-details");
        detailcontainer.add(fullname, email, phone, sexStatus);

        VerticalLayout userdetails = new VerticalLayout(detailcontainer);
        userdetails.setClassName("profile-user-details");

        HorizontalLayout topdetails = new HorizontalLayout(userimage, userdetails, editlink);

        VerticalLayout segments = new VerticalLayout(topdetails);
        segments.setAlignItems(FlexComponent.Alignment.CENTER);

        add(segments);

    }
}
