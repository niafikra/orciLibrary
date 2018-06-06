package com.niafikra.olis.ui.components;

import com.niafikra.olis.ui.views.HomeView;
import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.polymertemplate.EventHandler;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.RouterLink;
import com.vaadin.flow.shared.ui.LoadMode;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.templatemodel.TemplateModel;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.servlet.view.RedirectView;

@HtmlImport("src/views/login/login-view.html")
@Tag("login-view")
@SpringComponent
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class LoginForm extends PolymerTemplate<LoginForm.LoginModel> {

    private @Id("username")
    TextField username;
    private @Id("password")
    PasswordField password;
    private @Id("loginBtn")
    Button loginBtn;

    public interface LoginModel extends TemplateModel {
        void login();
    }

    public LoginForm() {
        loginBtn.addClickListener(event -> {
            login();
        });
    }

    public void login() {
        loginBtn.getUI().ifPresent(ui -> ui.navigate("home"));
//        Notification.show("Hello " + username.getValue() + " with " + password.getValue() + " ", 5000, Notification.Position.MIDDLE);
    }
}
