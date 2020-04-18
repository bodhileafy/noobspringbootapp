package com.noobspringbootapp.restful;

import com.noobspringbootapp.service.Client;
import com.noobspringbootapp.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@RestController
public class ClientController {

    @Autowired
    ClientService client;

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping("/clients")
    public List<Client> getClients() {
        return client.getAll();
    }

}