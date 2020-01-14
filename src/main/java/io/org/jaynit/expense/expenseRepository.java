package io.org.jaynit.expense;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface expenseRepository extends CrudRepository<Expense,Integer> {

	public List<Expense> findByStore_sId(int sid);
}
