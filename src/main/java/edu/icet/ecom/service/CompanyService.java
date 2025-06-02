package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.CompanyDto;
import edu.icet.ecom.model.entity.CompanyEntity;
import edu.icet.ecom.model.entity.JobEntity;
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


    public void add(CompanyDto companyDto) {
        companyRepository.save(mapper.map(companyDto, CompanyEntity.class));
    }

    public void update(CompanyDto companyDto) {
        if (companyRepository.findById(companyDto.getCompanyId()).isPresent()) {
            companyRepository.save(mapper.map(companyDto, CompanyEntity.class));
        }
    }

    public void delete(Long id) {
        companyRepository.deleteById(id);
    }
}
