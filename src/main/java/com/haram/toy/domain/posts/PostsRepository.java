package com.haram.toy.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PostsRepository extends JpaRepository<Posts, Long> {
} // JpaRepository 클래스를 상속하면 자동으로 CRUD를 만든다.
