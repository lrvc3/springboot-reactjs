package com.renitalobo.expense.controller;

import com.renitalobo.expense.model.Expense;
import com.renitalobo.expense.repository.ExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ExpenseController {

    @Autowired
    private ExpenseRepository expenseRepository;

    @GetMapping(value = "/expenses")
    List<Expense> getExpenses(){
        return expenseRepository.findAll();
    }

    @DeleteMapping(value = "/expenses/{id}")
    void deleteExpense(@PathVariable Long id){
        expenseRepository.deleteById(id);
    }

    @PostMapping(value = "/expenses")
    Expense createExpense(@Valid @RequestBody Expense expense){
        return expenseRepository.save(expense);
    }
}
