package baihan.backend.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import baihan.backend.model.Comment;
import baihan.backend.model.Product;
import baihan.backend.service.CommentService;
import baihan.backend.service.ProductService;

@RestController
@RequestMapping("/comment")
@CrossOrigin(origins = "*")
public class CommentController {

	@Autowired
	private CommentService commentService;
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("")
	public List<Comment> getComment() {
		return commentService.getComment();
	}
	
	@PostMapping("/{productId}")
    public Comment saveComment(@PathVariable Long productId, @RequestBody Comment comment) {
        // Obtener el producto asociado al ID
        Product product = productService.getSingleProduct(productId);
        
        if (product != null) {
            // Establecer la relación entre el comentario y el producto
            comment.setProduct(product);
            return commentService.saveComment(comment);
        }
		return null;
    }
	
	@GetMapping("/Byproduct/{productId}")
	public List<Comment> getCommentsByProductsId(@PathVariable Long productId){
		return productService.getSingleProduct(productId).getComment();
	}
}
