//package com.project.ExpenseTrackerSystem.service;
//
//import com.project.ExpenseTrackerSystem.model.Expense;
//import com.project.ExpenseTrackerSystem.model.Income;
//import com.project.ExpenseTrackerSystem.model.Transaction;
//import com.project.ExpenseTrackerSystem.repository.ExpenseRepository;
//import com.project.ExpenseTrackerSystem.repository.IncomeRepository;
//import com.project.ExpenseTrackerSystem.repository.TransactionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Service
//public class TransactionService {
//    private final TransactionRepository transactionRepository;
//
//
//    @Autowired
//    public TransactionService(TransactionRepository transactionRepository) {
//        this.transactionRepository = transactionRepository;
//    }
//    @Autowired
//    private ExpenseRepository expenseRepository;
//
//    @Autowired
//    private IncomeRepository incomeRepository;
//
//    public List<Transaction> getAllTransactions() {
//        List<Transaction> transactions = new ArrayList<>();
//
//        List<Expense> expenses = expenseRepository.findAll();
//        for (Expense expense : expenses) {
//            transactions.add(new Transaction(
//                    "Expense",
//                    expense.getExpCategory(),
//                    expense.getExpDescription(),
//                    expense.getExpAmount(),
//                    expense.getExpDate(),
//                    expense.getExpTime()
//            ));
//        }
//
//        List<Income> incomes = incomeRepository.findAll();
//        for (Income income : incomes) {
//            transactions.add(new Transaction(
//                    "Income",
//                    income.getIncomeCategory(),
//                    income.getIncomeDescription(),
//                    income.getIncomeAmount(),
//                    income.getIncomeDate(),
//                    income.getIncomeTime()
//            ));
//        }
//
//        return transactions;
//    }
//
//}
