package com.mayanksood.resume.client.css;

import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;
import com.mayanksood.resume.client.css.contact.ContactCss;
import com.mayanksood.resume.client.css.home.HomeCss;
import com.mayanksood.resume.client.css.layout.LayoutCss;
import com.mayanksood.resume.client.css.portfolio.PortfolioCss;

/**
 * Created by mayank on 18/08/17.
 */
public interface GlobalCssBundle extends ClientBundle {
    GlobalCssBundle INSTANCE = GWT.create(GlobalCssBundle.class);

    @Source({"layout/layout.css"})
    LayoutCss layout();

    @Source({"layout/layout.css"})
    TextResource layoutText();

    @Source({"contact/contact.css"})
    ContactCss contact();

    @Source({"home/home.css"})
    HomeCss home();

    @Source({"portfolio/portfolio.css"})
    PortfolioCss portfolio();
}
