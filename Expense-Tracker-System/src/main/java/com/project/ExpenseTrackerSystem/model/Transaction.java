//package com.project.ExpenseTrackerSystem.model;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.sql.Date;
//import java.sql.Time;
//
//@Entity
//@Data
//@Table(name = "transaction_table")
//public class Transaction {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//    private String transactionType;
//    private String transactionCategory;
//    private String transactionDescription;
//    private Integer transactionAmount;
//    private Date transactionDate;
//    private Time transactionTime;
//
//    public Transaction(String expense, String expCategory, String expDescription, Integer expAmount, Date expDate, Time expTime) {}
//
//    public Transaction(Long id, String transactionType, String transactionCategory, String transactionDescription, Integer transactionAmount, Date transactionDate, Time transactionTime) {
//    this.id=id;
//    this.transactionType=transactionType;
//    this.transactionCategory=transactionCategory;
//    this.transactionDescription=transactionDescription;
//    this.transactionAmount=transactionAmount;
//    this.transactionDate=transactionDate;
//    this.transactionTime=transactionTime;
//    }
//}
