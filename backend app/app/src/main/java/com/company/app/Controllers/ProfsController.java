package com.company.app.Controllers;

import java.util.Date;

import com.company.app.Models.ProfsModel;
import com.company.app.Repositories.ProfsRepo;
import com.company.app.entities.ProfsEntity;
import com.company.app.services.FormService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/profs")
public class ProfsController {

    @Autowired
    ProfsRepo profsRepo;
    @Autowired
    FormService service;

    @GetMapping(path = "/koko")
    public ProfsEntity gettoto() {
        return new ProfsEntity();
    }

    @PostMapping(path = "/addprofs")
    public ProfsModel addProfs(@RequestBody ProfsEntity p) {
        ProfsModel response = new ProfsModel();
        if (profsRepo.findByEmail(p.getEmail()).isPresent()) {
            response.setName("-1");
            return response;
        } else {
            p.setCreated_at(new Date());
            return response = service.convertToProfResponseForm(profsRepo.save(p));
        }
    }

}