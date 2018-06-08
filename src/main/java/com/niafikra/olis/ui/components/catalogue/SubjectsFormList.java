package com.niafikra.olis.ui.components.catalogue;

import com.vaadin.flow.component.checkbox.Checkbox;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Label;

import java.util.ArrayList;
import java.util.List;

public class SubjectsFormList extends Div {
    private List<String> subjects = new ArrayList<String>();
    private Object controlView;


    public SubjectsFormList(Object controlView) {
        this.controlView = controlView;
        setClassName("form-checkbox");

        updateSubjects();
        add(new Label("Subjects associated: "));
        for (String subject : subjects) {
            add(new Checkbox(subject));
        }
    }

    private void updateSubjects() {
        subjects.add("Encology");
        subjects.add("Radiotherapy");
        subjects.add("HIV");
        subjects.add("Lukemia");
        subjects.add("Malaria");
        subjects.add("STDs");
        subjects.add("Computer");
        subjects.add("Canceling");
        subjects.add("Biology");

    }
}
