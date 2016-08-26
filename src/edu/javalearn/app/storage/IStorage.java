package edu.javalearn.app.storage;

import edu.javalearn.app.model.Resume;

import java.util.Collection;

/**
 * Created by user
 * for Webapp
 * on 8/26/16.
 */
public interface IStorage {
    void clear();

    void save(Resume r);

    void update(Resume r);

    Resume load(String uuid);

    void delete(String uuid);

    Collection<Resume> getAllSorted();

    int size();


}
