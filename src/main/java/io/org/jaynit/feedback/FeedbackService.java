package io.org.jaynit.feedback;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class FeedbackService {

	@Autowired
	FeedbackRepository feedbackRepo;
	
	public List<Feedback> getAllFeedback() {
		List<Feedback> feedback  = new ArrayList<>();
		feedbackRepo.findAll().forEach(feedback::add);
		return feedback;
	}

	public void addFeedback(Feedback f) {
		feedbackRepo.save(f);
		
	}

	public Optional<Feedback> getFeedback(int feedbackId) {
		feedbackRepo.findById(feedbackId);
		return null;
	}

	public void updateFeedback(Feedback f, int feedbackId) {
		feedbackRepo.save(f);
		
	}

	public void deleteFeedback(int feedbackId) {
		feedbackRepo.deleteById(feedbackId);
	}

}
