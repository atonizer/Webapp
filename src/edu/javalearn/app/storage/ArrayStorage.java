package edu.javalearn.app.storage;

import edu.javalearn.app.model.Resume;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.logging.Logger;

/**
 * Created by user
 * for Webapp
 * on 8/26/16.
 */
public class ArrayStorage implements IStorage {
    private static final int LIMIT = 100;
    // protected Logger LOGGER = Logger.getLogger(getClass().getName());
    private static Logger LOGGER = Logger.getLogger(ArrayStorage.class.getName());
    private Resume[] array = new Resume[LIMIT];
    //int idx = 0;

    @Override
    public void clear() {
        Arrays.fill(array, null);
    }

    @Override
    public void save(Resume r) {
        int idx = -1;
        for (int i = 0; i < LIMIT; i++) {
            Resume resume = array[i];
            if (resume != null) {
                if (r.equals(resume)) {
                    new IllegalStateException("Already present");
                }
            } else if (idx == -1) {
                idx = i;
            }
        }
        array[idx] = r;
        for (int i = 0; i < LIMIT; i++) {
            if (array[i] == null) {
                array[i] = r;
            }
        }

    }

    @Override
    public void update(Resume r) {

    }

    @Override
    public Resume load(String uuid) {
        return null;
    }

    @Override
    public void delete(String uuid) {

    }

    @Override
    public Collection<Resume> getAllSorted() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
