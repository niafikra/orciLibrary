package com.niafikra.olis.ui.components.user;

import com.niafikra.olis.model.Notification;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.*;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcons;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;

import java.util.ArrayList;
import java.util.List;

@Tag("div")
public class UserProfile extends Div {
    private H2 fullname;
    private Image userimage;
    private Paragraph email;
    private Paragraph phone;
    private Paragraph sexStatus;
    private Button editlink;
    private Div detailcontainer;
    private ProfileEditorDialog editorDialog = new ProfileEditorDialog(this);

    public UserProfile() {
        setClassName("container");

        fullname = new H2("Chloe Michael Steel");
        email = new Paragraph("chloesullivan12@live.com");
        phone = new Paragraph("+1-111-222");
        sexStatus = new Paragraph("Female, Librarian");

        editlink = new Button(new Icon(VaadinIcons.PENCIL));
        editlink.setText("Edit");
        editlink.setClassName("edit-btn");
        editlink.addClickListener(e -> {
            editorDialog.open();
        });

        userimage = new Image();
        userimage.setSrc("frontend/images/samples/default.png");
        userimage.setAlt("Profile Picture");
        userimage.setClassName("profile-sample");


        detailcontainer = new Div();
        detailcontainer.setClassName("user-details");
        detailcontainer.add(fullname, email, phone, sexStatus, editlink);

        VerticalLayout userdetails = new VerticalLayout(detailcontainer);
        userdetails.setAlignItems(FlexComponent.Alignment.CENTER);
        userdetails.setClassName("profile-user-details");

        HorizontalLayout topdetails = new HorizontalLayout(userimage, userdetails);
        topdetails.setMargin(true);

        Grid<Notification> grid = new Grid<>();
        grid.setItems(new Notification());
//        grid.setItems(getItems());

        grid.addColumn(Notification::getDateSubmmited).setHeader("Date");
        grid.addColumn(Notification::getNote).setHeader("Message");
        grid.setSizeFull();



        VerticalLayout segments = new VerticalLayout(topdetails, grid);
        segments.setAlignItems(FlexComponent.Alignment.CENTER);
        segments.setClassName("profile");


        add(segments);

    }

    private void defaultData(){
        List<String> user = new ArrayList<String>();
    }


}
