package edu.javalearn.app.model;

/**
 * Created by user
 * on 8/26/16.
 * Webapp
 */
public enum SectionType {
    OBJECTIVE("Position"),
    ACHIEVEMENT("Achievement"),
    QUALIFICATIONS("Qualification"),
    EXPERIENCE("Experience"),
    EDUCATION("Education");

    private String title;

    SectionType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
