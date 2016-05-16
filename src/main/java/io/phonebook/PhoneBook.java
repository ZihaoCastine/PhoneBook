package io.phonebook;


import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/**
 * Created by zihaocastine on 5/16/16.
 */
public class PhoneBook {
    private TreeMap <String, List<String>> phoneMap;

    PhoneBook(){
        phoneMap=new TreeMap<String, List<String>>();

    }

    public void add(String name, String number){
        List<String> numberList=new ArrayList<String>();
        if(phoneMap.containsKey(name.toLowerCase())){
            phoneMap.get(name.toLowerCase()).add(number);
        }else {
            numberList.add(number);
            phoneMap.put(name.toLowerCase(),numberList);
        }
    }

    public void removeRecord(String name){
        phoneMap.remove(name.toLowerCase());
    }

    public void remove(String name, String number){
        if(phoneMap.get(name.toLowerCase()).size()>1){
            phoneMap.get(name.toLowerCase()).remove(number);
        }else {
            phoneMap.remove(name.toLowerCase());
        }
    }

    public int getSize(){
        return phoneMap.size();
    }

    public String lookUp(String name){
        String number="";
        for( String each: phoneMap.get(name.toLowerCase())){
            number+=each+"\t";
        }

        return number;
    }

    public String reverseLookup(String number){
        String name="";
        for (String each : phoneMap.keySet()) {
           if(phoneMap.get(each).contains(number)){
               name=each;
           }
        }
        return name;

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
        String numbers="";
        for (String each : phoneMap.keySet()) {
            numbers="";
            for(String number: phoneMap.get(each)){
                numbers+=number+"\t";
            }
            allEntries+= "Name: "+each+" Number: "+numbers+"\n";
        }
        return allEntries;
    }



}
