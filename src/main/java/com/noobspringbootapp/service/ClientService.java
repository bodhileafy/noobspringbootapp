package com.noobspringbootapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClientService {

    @Autowired
    ClientRepository repository;

    public List<Client> getAll() {
        final List<Client> clients = new ArrayList<>();
        repository.findAll().forEach(client -> clients.add(client));
        return clients;
    }
}