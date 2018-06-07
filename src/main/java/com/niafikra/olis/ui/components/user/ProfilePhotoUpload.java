package com.niafikra.olis.ui.components.user;

import com.vaadin.flow.component.upload.Upload;
import com.vaadin.flow.component.upload.receivers.MultiFileMemoryBuffer;

public class ProfilePhotoUpload extends Upload {
    private Object controlView;

    public ProfilePhotoUpload(Object contrrolView) {
        this.controlView = contrrolView;

        MultiFileMemoryBuffer buffer = new MultiFileMemoryBuffer();
        new Upload(buffer);
        setAcceptedFileTypes("image/jpeg", "image/png", "image/gif");
        addSucceededListener(event -> {
           // Upload action here
        });
    }
}
