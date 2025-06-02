package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CompanyDto;
import edu.icet.ecom.model.entity.CompanyEntity;
import edu.icet.ecom.repository.CompanyRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CompanyService {

    @Autowired
    CompanyRepository companyRepository;

    ModelMapper mapper = new ModelMapper();

    public List<CompanyDto> getAll() {
        List<CompanyEntity> companyEntities = companyRepository.findAll();
        List<CompanyDto> companyDtos = new ArrayList<>();
        for(CompanyEntity companyEntity : companyEntities ){
            companyDtos.add(mapper.map(companyEntity, CompanyDto.class));
        }
        return companyDtos;
    }


}
