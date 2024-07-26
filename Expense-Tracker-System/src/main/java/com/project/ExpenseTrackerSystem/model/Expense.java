package com.project.ExpenseTrackerSystem.model;

import jakarta.persistence.*;
import lombok.*;
import java.sql.Date;

@Entity
@Data
@Table(name = "expense_table")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String expCategory;
    private String expDescription;
    private Integer expAmount;
    private Date expDate;

    public Expense(){ }
}

