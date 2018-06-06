package com.niafikra.olis.ui.views;

import com.niafikra.olis.ui.components.LoginForm;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import org.springframework.beans.factory.annotation.Autowired;

@HtmlImport("styles/shared-styles.html")
@Route("login")
@Theme(Lumo.class)

@PageTitle("OLIS | Login")
public class LoginView extends Div {
    public LoginView(@Autowired LoginForm loginForm) {
        add(loginForm);
    }
}
