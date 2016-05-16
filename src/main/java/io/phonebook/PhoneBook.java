package io.phonebook;


import java.util.TreeMap;

/**
 * Created by zihaocastine on 5/16/16.
 */
public class PhoneBook {
    TreeMap <String, String> phoneMap;
    PhoneBook(){
        phoneMap=new TreeMap<String, String>();
    }

    public void add(String name, String number){
        phoneMap.put(name.toLowerCase(),number);

    }

    public void remove(String name){
        phoneMap.remove(name.toLowerCase());
    }

    public int getSize(){
        return phoneMap.size();
    }

    public String lookUp(String name){
        return phoneMap.get(name.toLowerCase());

    }

    public String listAllNames(){
        String allName="";
        for (String each : phoneMap.keySet()) {
            allName+= "Name: "+each+"\n";
        }
        return allName;
    }

    public String listEntries(){
        String allEntries="";
        for (String each : phoneMap.keySet()) {
            allEntries+= "Name: "+each+" Number: "+phoneMap.get(each)+"\n";
        }
        return allEntries;
    }



}
