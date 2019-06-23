package com.CK;

import java.util.ArrayList;

public class MobilePhone {
    ArrayList<Contacts> mobilePhone = new ArrayList<Contacts>();

    public  void printListOfContacts() {
        if (mobilePhone.size() ==0 ){
            System.out.println("MobilePhone list is empty!");
        }else{
            for (int i = 0; i < mobilePhone.size(); i++ ){
                System.out.println(i+1 + ". Contact Name: "+ mobilePhone.get(i).getName()+
                        ",  Phone number: "+ mobilePhone.get(i).getNumber());
            }
        }
    }

    public void addContacts(Contacts add_contact){
        mobilePhone.add(add_contact);
    }

    public void removeContact(String contactName) {
        mobilePhone.remove(mobilePhone.get(findContact(contactName)));
    }

    public int findContact(String contactName){
        for (int i=0; i<mobilePhone.size(); i++){
            if (contactName == mobilePhone.get(i).getName()){
                return i;
            }
        }
        return -1;
    }
}
