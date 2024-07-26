package com.project.ExpenseTrackerSystem.repository;

import com.project.ExpenseTrackerSystem.model.Income;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncomeRepository extends JpaRepository<Income, Long> {

}
