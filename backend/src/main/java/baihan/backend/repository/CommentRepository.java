package baihan.backend.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import baihan.backend.model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long>{
	
}
