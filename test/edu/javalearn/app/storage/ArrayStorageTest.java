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
    private Resume R1, R2, R3;

    private ArrayStorage storage = new ArrayStorage();

    @BeforeClass
    public static void beforeClass(){
        // the same as static {}
    }

    @Before
    public void before(){

        R1 = new Resume("Full name1", "location");
        R1.addContact(new Contact(ContactType.MAIL, "mail@mail.com"));
        R1.addContact(new Contact(ContactType.PHONE, "1234567"));

        R2 = new Resume("Full name2", null);
        R2.addContact(new Contact(ContactType.SKYPE, "skype2"));
        R2.addContact(new Contact(ContactType.PHONE, "89101112"));

        R3 = new Resume("Full name3", null);
        storage.clear();
        storage.save(R3);
        storage.save(R1);
        storage.save(R2);
    }

    @org.junit.Test
    public void save() throws Exception {

    }

    @org.junit.Test
    public void clear() throws Exception {
        storage.clear();
        assertEquals(0,storage.size());
    }

    @org.junit.Test
    public void update() throws Exception {
        R2.setFullName("Updated N2");
        storage.update(R2);
        assertEquals(R2, storage.load(R2.getUuid()));
    }

    @org.junit.Test
    public void load() throws Exception {
        assertEquals(R1, storage.load(R1.getUuid()));
        assertEquals(R2, storage.load(R2.getUuid()));
        assertEquals(R3, storage.load(R3.getUuid()));
    }

    @org.junit.Test
    public void delete() throws Exception {
        storage.delete(R1.getUuid());
        Assert.assertEquals(2, storage.size());
        Assert.assertEquals(2, storage.load(R1.getUuid()));
    }

    @org.junit.Test
    public void getAllSorted() throws Exception {
        Resume[] src = new Resume[]{R1, R2, R3};
        Arrays.sort(src);
    }

    @org.junit.Test
    public void size() throws Exception {
        Assert.assertEquals(3, storage.size());
    }

}