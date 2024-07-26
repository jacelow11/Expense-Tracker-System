//package com.project.ExpenseTrackerSystem.controller;
//
//
//
//import com.project.ExpenseTrackerSystem.model.Transaction;
//import com.project.ExpenseTrackerSystem.service.TransactionService;
//import com.project.ExpenseTrackerSystem.repository.ExpenseRepository;
//import com.project.ExpenseTrackerSystem.repository.IncomeRepository;
//import com.project.ExpenseTrackerSystem.repository.TransactionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//@RequestMapping("/Transactions")
//public class TransactionController {
//    private final IncomeRepository incomeRepository;
//    private final ExpenseRepository expenseRepository;
//    private final TransactionRepository transactionRepository;
//    private final TransactionService transactionService;
//
//    @Autowired
//    public TransactionController(TransactionRepository transactionRepository,
//                                 IncomeRepository incomeRepository,
//                                 ExpenseRepository expenseRepository,
//                                 TransactionService transactionService) {
//        this.incomeRepository = incomeRepository;
//        this.expenseRepository = expenseRepository;
//        this.transactionRepository = transactionRepository;
//        this.transactionService = transactionService;
//    }
//    @GetMapping
//    public String getAllTransactions(Model model) {
//        List<Transaction> transactions = transactionService.getAllTransactions();
//        model.addAttribute("transactions", transactions);
//        return "transactions";
//    }
//}
//
//
