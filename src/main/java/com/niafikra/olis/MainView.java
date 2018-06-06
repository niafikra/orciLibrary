package com.niafikra.olis;

import com.niafikra.olis.ui.views.LoginView;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.page.Viewport;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@HtmlImport("frontend://styles/shared-styles.html")
@Viewport("width=device-width, minimum-scale=1.0, initial-scale=1.0, user-scalable=yes")
@Route("")
@Theme(Lumo.class)

@PageTitle("OLIS | Main")
public class MainView extends Div implements BeforeEnterObserver {

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        if (!isLogin()) {
            event.rerouteTo(LoginView.class);
        }
    }

    public boolean isLogin() {
        return false;
    }
}
