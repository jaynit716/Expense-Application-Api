package io.org.jaynit.expense;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class expenseService {
	
	@Autowired
	expenseRepository er;

	public List<Expense> getAllExpense(int sid){
		List<Expense> expenses  = new ArrayList<>();
		er.findByStore_sId(sid).forEach(expenses::add);
		return expenses;
	}

	public void addExpense(Expense e) {
		er.save(e);
	}

	public Optional<Expense> getExpense(int expenseId) {
		return er.findById(expenseId);
	}

	public void updateExpense(Expense e, int expenseId) {
		er.save(e);
	}

	public void deleteExpense(int expenseId) {
		er.deleteById(expenseId);
	}

	public List<Expense> getAllExpenses() {
		List<Expense> expenses  = new ArrayList<>();
		er.findAll().forEach(expenses::add);
		return expenses;
	}
	
	
	
}
