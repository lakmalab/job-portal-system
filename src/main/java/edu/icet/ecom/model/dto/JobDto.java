package edu.icet.ecom.model.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JobDto {
    private Long id;
    private String title;
    private Date salary_date;
    private Boolean salary;
    private String description;

}
