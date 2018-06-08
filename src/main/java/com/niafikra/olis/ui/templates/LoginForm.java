package com.niafikra.olis.ui.templates;

import com.vaadin.flow.component.Tag;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.HtmlImport;
import com.vaadin.flow.component.polymertemplate.Id;
import com.vaadin.flow.component.polymertemplate.PolymerTemplate;
import com.vaadin.flow.component.textfield.PasswordField;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.spring.annotation.SpringComponent;
import com.vaadin.flow.templatemodel.TemplateModel;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;

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
        loginBtn.getUI().ifPresent(ui -> ui.navigate("dashboard"));
//        Notification.show("Hello " + username.getValue() + " with " + password.getValue() + " ", 5000, Notification.Position.MIDDLE);
    }
}
