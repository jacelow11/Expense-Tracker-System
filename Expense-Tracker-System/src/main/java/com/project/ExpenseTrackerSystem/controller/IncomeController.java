package com.project.ExpenseTrackerSystem.controller;


import com.project.ExpenseTrackerSystem.model.Income;
import com.project.ExpenseTrackerSystem.service.IncomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("/incomes")
public class IncomeController {

    // Injected to bring expense service
    private final IncomeService incomeService;
    // Constructor
    @Autowired
    public IncomeController(IncomeService incomeService) {
        this.incomeService = incomeService;
    }

    // These are the requests
    // 1. Get all incomes
    @GetMapping
    public String getAllIncomes(Model model) {
        List<Income> incomes = incomeService.getAllIncomes();
        model.addAttribute("incomes", incomes);
        return "incomes";
    }
    // 2. Get income by id
    @GetMapping("/{id}")
    public String getIncomeById(@PathVariable Long id, Model model) {
        Income income = incomeService.getIncomeById(id);
        model.addAttribute("income", income);
        return "income-details";
    }

    // 3. Show form to create a new income
    @GetMapping("/new")
    public String showIncomeForm(Model model) {
        model.addAttribute("income", new Income());
        return "income-form";
    }

    // 4. Save a new income
    @PostMapping("/new")
    public String saveIncome(@ModelAttribute("income") Income income) {
        incomeService.saveIncome(income);
        return "redirect:/incomes";
    }

    // 5. Show form to edit an existing income
    @GetMapping("/{id}/edit")
    public String showEditForm(@PathVariable Long id, Model model) {
        Income income = incomeService.getIncomeById(id);
        model.addAttribute("income", income   );
        return "income-form";
    }

    // 6. Update an existing income
    @PostMapping("/{id}/edit")
    public String updateIncome(@ModelAttribute("income") Income income) {
        incomeService.saveIncome(income);
        return "redirect:/incomes";
    }

    // 7. Delete income by id
    @GetMapping("/{id}/delete")
    public String deleteIncome(@PathVariable Long id) {
        incomeService.deleteIncome(id);
        return "redirect:/incomes";
    }

}
