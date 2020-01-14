package io.org.jaynit.store;

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


@RestController
public class StoreController {
	
	@Autowired
	StoreService storeService;
	
	@GetMapping("/store")
	public List<Store> getAllStore(){
		return storeService.getAllStore();
	}
	
	@GetMapping("/store/{sid}")
	public Optional<Store> getStore(@PathVariable int sid) {
		return storeService.getStore(sid);
	}
	
	@PostMapping("/store")
	public void addStore(@RequestBody Store s) {
		storeService.addStore(s);
	}
	
	@PutMapping("/store/{sid}")
	public void  updateStore(@RequestBody Store s,@PathVariable int sid) {
		storeService.updateStore(s,sid);
	}
	
	@DeleteMapping("/store/{sid}")
	public void deleteStore(@PathVariable int sid) {
		storeService.deleteStore(sid);
	}

}
