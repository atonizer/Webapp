package edu.javalearn.app;

import edu.javalearn.app.model.Resume;

/**
 * Created by user
 * for Webapp
 * on 8/27/16.
 */
public class WebAppException extends Exception {
    private Resume resume = null;
    private String uuid = null;

    public WebAppException(String message) {
        super(message);
    }

    public WebAppException(String message, Throwable e) {
        super(message, e);
    }

    public WebAppException(String message, Resume resume) {
        super(message);
        this.resume = resume;
    }

    public WebAppException(String message, Resume resume, Throwable e) {
        super(message);
        this.resume = resume;
    }

    public WebAppException(String message, String uuid) {
        super(message);
        this.uuid = uuid;
    }

    public Resume getResume() {
        return resume;
    }

    public String getUuid() {
        return uuid;
    }
}
