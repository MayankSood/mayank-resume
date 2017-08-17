package com.mayanksood.resume.client.image;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.ImageResource;

/**
 * Created by mayank on 17/08/17.
 */
public interface GlobalImageBundle extends ClientBundle {
    GlobalImageBundle INSTANCE = GWT.create(GlobalImageBundle.class);

    @Source("minkudp.jpg")
    ImageResource minkuProfilePic();

    @Source("linkedImg.png")
    ImageResource cardImage();
}
