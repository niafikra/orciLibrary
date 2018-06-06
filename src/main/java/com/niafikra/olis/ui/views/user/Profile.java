package com.niafikra.olis.ui.views.user;

import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.FlexLayout;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.component.html.*;

@HtmlImport("styles/shared-styles.html")
@Route("profile")
@PageTitle("OLIS | Profile")
@Theme(Lumo.class)
public class Profile extends Div {

    private H2 fullname;
    private Image userimage;

    public Profile() {
        setClassName("profile");

        fullname = new H2("Chloe Michael Steel");
        userimage = new Image();
        userimage.setSrc("frontend/images/samples/profile.jpg");
        userimage.setAlt("Profile Picture");
        userimage.setClassName("profile-sample");

        HorizontalLayout topdetails = new HorizontalLayout(userimage, fullname);

        VerticalLayout segments = new VerticalLayout(topdetails);

        FlexLayout flex = new FlexLayout(segments);

        add(flex);
    }
}
