package edu.icet.ecom.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class JobDto {
    private Long jobId;
    private String title;
    private Date salary_date;
    private Double salary;
    private String description;
    private Long companyId;
}
