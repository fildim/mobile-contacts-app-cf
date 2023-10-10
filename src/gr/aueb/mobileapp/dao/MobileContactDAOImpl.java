package gr.aueb.mobileapp.dao;

import gr.aueb.mobileapp.model.MobileContact;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileContactDAOImpl implements IMobileContactDAO{

    private static final List<MobileContact> contacts = new ArrayList<>();


    //overrides from interface

    //documentation needed

    @Override
    public MobileContact insert(MobileContact mobileContact) {

        if (mobileContact == null) return null;

        contacts.add(mobileContact);

        return mobileContact;
    }

    @Override
    public MobileContact update(long id, MobileContact mobileContact) {

        if (id != mobileContact.getId()) return null;

        int positionToUpdate = getIndexById(id);

        return contacts.set(positionToUpdate, mobileContact);
    }

    @Override
    public void delete(long id) {
        contacts.removeIf((contact) -> contact.getId() == id);
    }

    @Override
    public MobileContact get(long id) {

        int position = getIndexById(id);

        if (position == -1) return null;

        return contacts.get(position);
    }

    @Override
    public List<MobileContact> getAll() {

         //return new ArrayList<>(contacts);

        return Collections.unmodifiableList(contacts);
    }

    @Override
    public void delete(String phoneNumber) {
        contacts.removeIf(contact -> contact.getPhoneNumber().equals(phoneNumber));
    }

    @Override
    public MobileContact get(String phoneNumber) {

        int position = getIndexByPhoneNumber(phoneNumber);

        if (position == -1) return null;

        return contacts.get(position);
    }

    @Override
    public boolean phoneNumberExists(String phoneNumber) {
        return getIndexByPhoneNumber(phoneNumber) != -1;
    }

    @Override
    public boolean userIdExists(long id) {
        return getIndexById(id) != -1;
    }





    //new added functions

    private int getIndexById(long id) {

        int position = -1;

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getId() == id) {

                position = i;
                break;
            }
        }

        return position;
    }

    private int getIndexByPhoneNumber(String phoneNumber) {

        int position = -1;

        for (int i = 0; i < contacts.size(); i++) {

            if (contacts.get(i).getPhoneNumber().equals(phoneNumber)) {

                position = i;
                break;
            }
        }

        return position;
    }
}
