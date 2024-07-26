package com.project.ExpenseTrackerSystem.service;

import com.project.ExpenseTrackerSystem.model.Income;
import com.project.ExpenseTrackerSystem.repository.IncomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class IncomeService {
    private final IncomeRepository incomeRepository;

    // Constructor
    @Autowired
    public IncomeService(IncomeRepository incomeRepository) { this.incomeRepository = incomeRepository; }

    // Operations

    // Get all expenses
    public List<Income> getAllIncomes() { return incomeRepository.findAll(); }
    // Get expense by id
    public Income getIncomeById(Long id) { return incomeRepository.findById(id).orElse(null); }
    // Save expense
    public void saveIncome(Income income) { incomeRepository.save(income); }
    // Delete expense
    public void deleteIncome(Long id) { incomeRepository.deleteById(id); }
}
