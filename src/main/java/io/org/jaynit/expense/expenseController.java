package io.org.jaynit.expense;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import io.org.jaynit.store.Store;

@RestController
public class expenseController {

	@Autowired
	expenseService es;
	
	@GetMapping("/expense")
	public List<Expense> getAllExpenses(){
		return es.getAllExpenses();
	}
	
	@GetMapping("/store/{sid}/expense")
	public List<Expense> getAllExpense(@PathVariable int sid){
		return es.getAllExpense(sid);
	}
	
	@GetMapping("/store/{sid}/expense/{expenseId}")
	public Optional<Expense> getExpense(@PathVariable int expenseId) {
		return es.getExpense(expenseId);
	}
	
	@PostMapping("/store/{sid}/expense")
	public void addExpense(@RequestBody Expense e,@PathVariable int sid) {
		e.setStore(new Store("","",sid));
		es.addExpense(e);
	}
	
	@PutMapping("/store/{sid}/expense/{expenseId}")
	public void  updateExpense(@RequestBody Expense e,@PathVariable int expenseId,@PathVariable int sid) {
		e.setStore(new Store("","",sid));
		es.updateExpense(e,expenseId);
	}
	
	@DeleteMapping("/store/{sid}/expense/{expenseId}")
	public void deleteExpense(@PathVariable int expenseId) {
		es.deleteExpense(expenseId);
	}
	
}
