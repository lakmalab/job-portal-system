package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.CompanyDto;
import edu.icet.ecom.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping
    public List<CompanyDto> getAll(){
        System.out.println("fer");
        return companyService.getAll();
    }



}
