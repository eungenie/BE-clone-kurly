package com.clone.kukka.repository;

import com.clone.kukka.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
//    List<Comment> findByProductId(Long productId);
}
