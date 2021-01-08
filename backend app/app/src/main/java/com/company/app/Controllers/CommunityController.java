package com.company.app.Controllers;

import java.util.List;

import com.company.app.Models.CommunityModel;
import com.company.app.Repositories.CommunityRepo;
import com.company.app.entities.CommunityEntity;
import com.company.app.services.FormService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/community")
public class CommunityController {
    @Autowired
    CommunityRepo communityRepo;
    @Autowired
    FormService formService;

    @GetMapping(value = "/getCommunities")
    public List<CommunityModel> getCommunities() {
        return formService.convertToListOfCommunityResponseForm(communityRepo.getAllCommunities().get());
    }

    @PostMapping(path = "/addcommunity")
    public CommunityModel addCommunity(@RequestBody CommunityEntity community) {
        CommunityModel ComResponse = new CommunityModel();

        if (communityRepo.findByName(community.getName()).isPresent()) {
            ComResponse.setName("already Added");
            return ComResponse;
        } else {
            community = communityRepo.save(community);
            ComResponse = formService.convertToCommunityResponseForm(community);
            return ComResponse;
        }

    }

    @GetMapping(path = "/search/{val}")
    public List<CommunityModel> search(@PathVariable(name = "val") String value) {
        return formService.convertToListOfCommunityResponseForm(communityRepo.search(value).get());
    }

}
