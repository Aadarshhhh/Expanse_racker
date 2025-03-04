package com.example.expensetracker.service;


import com.example.expensetracker.Repository.ExpenseRepository;
import com.example.expensetracker.model.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExpenseService {
    //for bussiness logic


    //DI
    @Autowired


    private ExpenseRepository expenseRepository;
    //sql query - select * from expense
    public List<Expense> getAllExpenses() {

        return expenseRepository.findAll();
    }
    // insert into expense ('description_value',amont_value');
    public void saveExpense(Expense expense) {
        expenseRepository.save(expense);
    }
    //select * from expense;
    public Expense getExpenseById(Long id) {
        return expenseRepository.findById(id).orElse(null);
    }
    // select * form expense
    public void deleteExpenseById(Long id) {
        expenseRepository.deleteById(id);
    }
}
