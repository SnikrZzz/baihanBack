package baihan.backend.service;

import java.util.List;

import baihan.backend.model.Comment;

public interface CommentService {
	
	Comment saveComment(Comment comment);

	List<Comment> getComment();
}
