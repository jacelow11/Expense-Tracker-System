package com.project.ExpenseTrackerSystem.model;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "income_table")
public class Income {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String incomeCategory;
    private String incomeDescription;
    private Integer incomeAmount;
    private Date incomeDate;

    public Income(){}

}
