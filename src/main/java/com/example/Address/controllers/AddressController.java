package com.example.Address.controllers;

import com.example.Address.dto.AddressDTO;
import com.example.Address.exceptions.AddressExceptionResponse;
import com.example.Address.exceptions.AddressNotFoundException;
import com.example.Address.services.AddressService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/address")
public class AddressController {
    private final AddressService addressService;
    private final ModelMapper modelMapper = new ModelMapper();

    @Autowired
    public AddressController(AddressService addressService) {
        this.addressService = addressService;
    }

    @GetMapping("/{employeeId}")
    public AddressDTO getByEmpId(@PathVariable("employeeId") int id) throws AddressNotFoundException {
        return modelMapper.map(addressService.getAddress(id), AddressDTO.class);
    }

    @ExceptionHandler
    public ResponseEntity<AddressExceptionResponse> handleNotFoundException(AddressNotFoundException e) {
        return new ResponseEntity<>(new AddressExceptionResponse(e.getMessage()), HttpStatus.BAD_REQUEST);
    }
}
