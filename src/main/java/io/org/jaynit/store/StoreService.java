package io.org.jaynit.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreService {

	@Autowired
	StoreRepository storeRepository;
	
	public List<Store> getAllStore() {
		List<Store> stores  = new ArrayList<>();
		storeRepository.findAll().forEach(stores::add);
		return stores;
	}

	public Optional<Store> getStore(int sid) {
		return storeRepository.findById(sid);
	}

	public void addStore(Store s) {
		storeRepository.save(s);
	}

	public void updateStore(Store s, int sid) {
		storeRepository.save(s);
	
	}

	public void deleteStore(int sid) {
		storeRepository.deleteById(sid);
	}
		

}
