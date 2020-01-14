package io.org.jaynit.store;


import org.springframework.data.repository.CrudRepository;

public interface StoreRepository extends CrudRepository<Store,Integer> {

	//public Store findBysId(int sId);
}
