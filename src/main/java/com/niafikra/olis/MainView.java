package com.niafikra.olis;

import com.niafikra.olis.ui.views.DashboardView;
import com.niafikra.olis.ui.views.LoginView;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;

@HtmlImport("frontend://styles/shared-styles.html")
@Route("")
@Theme(Lumo.class)

@PageTitle("OLIS | Main")
public class MainView extends Div implements BeforeEnterObserver {

    @Override
    public void beforeEnter(BeforeEnterEvent event) {
        if (isLogin()) {
            event.rerouteTo(DashboardView.class);
        }
        event.rerouteTo(LoginView.class);
    }

    public boolean isLogin() {
        return false;
    }
}
