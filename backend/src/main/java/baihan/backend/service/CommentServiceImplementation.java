package baihan.backend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import baihan.backend.model.Comment;
import baihan.backend.repository.CommentRepository;

@Service
public class CommentServiceImplementation implements CommentService {

	@Autowired
	CommentRepository commentRepository;

	@Override
	public List<Comment> getComment() {
		// TODO Auto-generated method stub
		return commentRepository.findAll();
	}

	@Override
	public Comment saveComment(Comment comment) {
		// TODO Auto-generated method stub
		return commentRepository.save(comment);
	}
    
}
