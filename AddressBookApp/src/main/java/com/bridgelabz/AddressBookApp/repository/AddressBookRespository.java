package com.bridgelabz.AddressBookApp.repository;


import com.bridgelabz.AddressBookApp.model.PersonDetails;
import org.springframework.data.jpa.repository.JpaRepository;

    public interface AddressBookRespository extends JpaRepository<PersonDetails,Integer> {
    }

