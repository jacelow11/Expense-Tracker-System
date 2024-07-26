package com.project.ExpenseTrackerSystem.controller;


import com.project.ExpenseTrackerSystem.model.Expense;
import com.project.ExpenseTrackerSystem.service.ExpenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/expenses")
public class ExpenseController {

    // Waxaa lagu sameeyey injection oo ah in aan keeno expense service-ka
    private final ExpenseService expenseService;
    // Constructor
    @Autowired
    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    // These are the requests
    // 1. Get all expenses
    @GetMapping
    public String getAllExpenses(Model model) {
        List<Expense> expenses = expenseService.getAllExpenses();
        model.addAttribute("expenses", expenses);
        return "expenses";
    }
    // 2. Get expense by id
    @GetMapping("/{id}")
    public String getExpenseById(@PathVariable Long id, Model model) {
        Expense expense = expenseService.getExpenseById(id);
        model.addAttribute("expense", expense);
        return "expense-details";
    }

    // 3. Show form to create a new expense
    @GetMapping("/new")
    public String showExpenseForm(Model model) {
        model.addAttribute("expense", new Expense());
        return "expense-form";
    }

    // 4. Save a new expense
    @PostMapping("/new")
    public String saveExpense(@ModelAttribute("expense") Expense expense) {
        expenseService.saveExpense(expense);
        return "redirect:/expenses";
    }

    // 5. Show form to edit an existing expense
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Expense expense = expenseService.getExpenseById(id);
        model.addAttribute("expense", expense);
        return "expense-form";
    }

    // 6. Update an existing expense
    @PostMapping("/{id}/edit")
    public String updateExpense(@ModelAttribute("expense") Expense expense) {
        expenseService.saveExpense(expense);
        return "redirect:/expenses";
    }

    // 7. Delete expense by id
    @GetMapping("/{id}/delete")
    public String deleteExpense(@PathVariable Long id) {
        expenseService.deleteExpense(id);
        return "redirect:/expenses";
    }
}
