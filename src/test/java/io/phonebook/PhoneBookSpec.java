package io.phonebook;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by zihaocastine on 5/16/16.
 */
public class PhoneBookSpec {
    @Test
    public void testAdd(){
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Zihao", "3021239000");
        Assert.assertEquals(1, phoneBook.getSize());
    }

    @Test
    public void testLookUp(){
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Zihao", "3021239000");
        String expectedValue="3021239000\t";
        Assert.assertEquals(expectedValue, phoneBook.lookUp("zihao"));
    }

    @Test
    public void testRemove(){
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Zihao", "3021239000");
        phoneBook.add("Zihao", "3025679000");
        phoneBook.remove("zihao", "3021239000");
        int expectedValue=1;
        Assert.assertEquals(expectedValue, phoneBook.getSize());
    }

    @Test
    public void testRemoveRecord(){
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Zihao", "3021239000");
        phoneBook.removeRecord("zihao");
        int expectedValue=0;
        Assert.assertEquals(expectedValue, phoneBook.getSize());
    }

    @Test
    public void testListAllName(){
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Zihao", "3021239000");
        phoneBook.add("Castine", "3026668888");

        String expectedValue="Name: castine\n" + "Name: zihao\n";
        Assert.assertEquals(expectedValue, phoneBook.listAllNames());
    }

    @Test
    public void testListEntries(){
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Castine", "3026668888");
        phoneBook.add("Zihao", "3021239000");
        phoneBook.add("zihao", "3025558888");

        String expectedValue="Name: castine Number: 3026668888\t\n" +
                "Name: zihao Number: 3021239000\t3025558888\t\n";
        Assert.assertEquals(expectedValue, phoneBook.listEntries());
    }

    @Test
    public void testReverseLookUp(){
        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Zihao", "3021239000");
        String expectedValue="zihao";
        Assert.assertEquals(expectedValue, phoneBook.reverseLookup("3021239000"));
    }


}
