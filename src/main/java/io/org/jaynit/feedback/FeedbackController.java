package io.org.jaynit.feedback;

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
public class FeedbackController {

	@Autowired
	FeedbackService feedbackService;
	
	
	@GetMapping("/feedback")
	public List<Feedback> getAllStore(){
		return feedbackService.getAllFeedback();
	}
	
	@GetMapping("/feedback/{feedbackId}")
	public Optional<Feedback> getStore(@PathVariable int feedbackId) {
		return feedbackService.getFeedback(feedbackId);
	}
	
	
	@PostMapping("/feedback")
	public void addStore(@RequestBody Feedback f) {
		feedbackService.addFeedback(f);
	}
	
	@PutMapping("/feedback/{feedbackId}")
	public void  updateStore(@RequestBody Feedback f,@PathVariable int feedbackId) {
		feedbackService.updateFeedback(f,feedbackId);
	}
	
	@DeleteMapping("/feedback/{feedbackId}")
	public void deleteStore(@PathVariable int feedbackId) {
		feedbackService.deleteFeedback(feedbackId);
	}
	
	
}
