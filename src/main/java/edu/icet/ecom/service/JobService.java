package edu.icet.ecom.service;

import edu.icet.ecom.model.dto.JobDto;
import edu.icet.ecom.model.entity.JobEntity;
import edu.icet.ecom.repository.JobRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    @Autowired
    JobRepository jobRepository;

    ModelMapper mapper = new ModelMapper();

    public List<JobDto> getAll() {
        List<JobEntity> companyEntities = jobRepository.findAll();
        List<JobDto> jobDtos = new ArrayList<>();
        for(JobEntity jobEntity : companyEntities ){
            jobDtos.add(mapper.map(jobEntity, JobDto.class));
        }
        return jobDtos;
    }


    public void add(JobDto jobDto) {
        jobRepository.save(mapper.map(jobDto, JobEntity.class));
    }

    public void update(JobDto jobDto) {
        if (jobRepository.findById(jobDto.getJobId()).isPresent()) {
            jobRepository.save(mapper.map(jobDto, JobEntity.class));
        }
    }

    public void delete(Long id) {
        jobRepository.deleteById(id);
    }
}
