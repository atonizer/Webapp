package edu.javalearn.app.model;

/**
 * Created by user
 * on 8/26/16.
 * Webapp
 */
public enum ContactType {
    PHONE("Phone"),
    MOBILE("Mobile phone"),
    HOME_PHONE("Home phone"),
    SKYPE("Skype"),
    MAIL("Mail"),
    QQ("QQ");

    private String title;

    ContactType(String title){
        this.title=title;
    }

    public String getTitle() {
        return title;
    }
}
