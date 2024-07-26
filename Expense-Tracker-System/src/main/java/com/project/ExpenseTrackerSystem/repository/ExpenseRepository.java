package com.project.ExpenseTrackerSystem.repository;


import com.project.ExpenseTrackerSystem.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Long> {

}

