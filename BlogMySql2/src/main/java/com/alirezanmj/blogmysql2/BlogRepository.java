package com.alirezanmj.blogmysql2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findByTitleContainingOrContentContaining(String test, String testAgain);

    void delete(int blogId);
}
