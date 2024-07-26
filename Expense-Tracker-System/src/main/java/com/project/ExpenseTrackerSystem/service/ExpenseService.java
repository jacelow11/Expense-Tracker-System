package com.project.ExpenseTrackerSystem.service;

import com.project.ExpenseTrackerSystem.model.Expense;
import com.project.ExpenseTrackerSystem.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    // Constructor
    @Autowired
    public ExpenseService(ExpenseRepository expenseRepository) { this.expenseRepository = expenseRepository; }

    // Operations

    // Get all expenses
    public List<Expense> getAllExpenses() { return expenseRepository.findAll(); }
    // Get expense by id
    public Expense getExpenseById(Long id) { return expenseRepository.findById(id).orElse(null); }
    // Save expense
    public void saveExpense(Expense expense) { expenseRepository.save(expense); }
    // Delete expense
    public void deleteExpense(Long id) { expenseRepository.deleteById(id); }
}

