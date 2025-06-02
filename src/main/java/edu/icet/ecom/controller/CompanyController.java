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
        return companyService.getAll();
    }

    @PostMapping
    public void add(@RequestBody CompanyDto companyDto) {
        companyService.add(companyDto);
    }

    @PutMapping
    public void update(@RequestBody CompanyDto companyDto) {
        companyService.update(companyDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        companyService.delete(id);
    }

}
