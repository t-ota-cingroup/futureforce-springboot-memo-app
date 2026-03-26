package com.lesson.memo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import com.lesson.memo.model.Memo;

public interface MemoRepository extends JpaRepository<Memo, Long> {
    List<Memo> findByTitleContainingOrContentContaining(String title, String content);
}