package edu.icet.ecom.controller;

import edu.icet.ecom.model.dto.JobDto;
import edu.icet.ecom.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/job")
@CrossOrigin
public class JobController {
    @Autowired
    JobService jobService;
    @GetMapping
    public List<JobDto> getAll(){
        return jobService.getAll();
    }

    @PostMapping
    public void add(@RequestBody JobDto jobDto) {
        jobService.add(jobDto);
    }

    @PutMapping
    public void update(@RequestBody JobDto jobDto) {
        jobService.update(jobDto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        jobService.delete(id);
    }


}
