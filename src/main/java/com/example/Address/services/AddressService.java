package com.example.Address.services;

import com.example.Address.exceptions.AddressNotFoundException;
import com.example.Address.models.Address;
import com.example.Address.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService {

    private final AddressRepository addressRepository;

    @Autowired
    public AddressService(AddressRepository addressRepository) {
        this.addressRepository = addressRepository;
    }

    public Address getAddress(int id) throws AddressNotFoundException {
        return addressRepository.findByEmpId(id).stream().findAny().orElseThrow(()->new AddressNotFoundException("Address for this id is not found"));
    }
}
