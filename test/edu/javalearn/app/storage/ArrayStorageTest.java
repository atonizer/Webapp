package edu.javalearn.app.storage;

import edu.javalearn.app.model.Contact;
import edu.javalearn.app.model.ContactType;
import edu.javalearn.app.model.Resume;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

/**
 *
 * Created by user
 * for Webapp
 * on 8/26/16.
 *
 */
public class ArrayStorageTest {
    private static Resume R1, R2, R3;

    private ArrayStorage storage = new ArrayStorage();

    static {
        R1 = new Resume("Full name1", "location");
        R1.addContact(new Contact(ContactType.MAIL, "mail@mail.com"));
        R1.addContact(new Contact(ContactType.PHONE, "1234567"));

        R2 = new Resume("Full name2", null);
        R2.addContact(new Contact(ContactType.SKYPE, "skype2"));
        R2.addContact(new Contact(ContactType.PHONE, "89101112"));

        R3 = new Resume("Full name3", null);
    }

    @BeforeClass
    public static void beforeClass(){
        // the same as static {}
    }

    @Before
    public void before(){
        storage.clear();
        storage.save(R1);
        storage.save(R2);
        storage.save(R3);
    }

    @org.junit.Test
    public void clear() throws Exception {

    }

    @org.junit.Test
    public void save() throws Exception {

    }

    @org.junit.Test
    public void update() throws Exception {

    }

    @org.junit.Test
    public void load() throws Exception {

    }

    @org.junit.Test
    public void delete() throws Exception {
        storage.delete(R1.getUuid());
        Assert.assertEquals(2, storage.size());
        Assert.assertEquals(2, storage.load(R1.getUuid()));
    }

    @org.junit.Test
    public void getAllSorted() throws Exception {

    }

    @org.junit.Test
    public void size() throws Exception {
        Assert.assertEquals(3, storage.size());
    }

}