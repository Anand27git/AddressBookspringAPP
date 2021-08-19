package com.bridgelabz.AddressBookApp.service;


import com.bridgelabz.AddressBookApp.dto.AddressBookDTO;
import com.bridgelabz.AddressBookApp.model.PersonDetails;
import org.springframework.stereotype.Service;

import java.util.List;

    @Service
    public interface IPersonService {

        public List<PersonDetails> getPersonDetails();

        public PersonDetails getPersonDetailsById(int personId);

        public PersonDetails createPersonDetails(AddressBookDTO addBookDTO);

        public PersonDetails updatePersonDetails(int personId,AddressBookDTO addBookDTO);

        public void deletePersonDetailsById(int personId);

    }



