package gr.aueb.mobileapp.dao;

import gr.aueb.mobileapp.model.MobileContact;

import java.util.List;

public interface IMobileContactDAO {

    //documentation needed

    //basic crud
    MobileContact insert(MobileContact mobileContact);
    MobileContact update(long id, MobileContact mobileContact);
    void delete(long id);
    MobileContact get(long id);
    List<MobileContact> getAll();

    //optional crud
    void delete(String phoneNumber);
    MobileContact get(String phoneNumber);

    //helpful additional methods
    boolean phoneNumberExists(String phoneNumber);
    boolean userIdExists(long id);
}
