package com.teamtwentyone.questions.repository;

import com.teamtwentyone.questions.entity.Question;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuestionsRepository extends JpaRepository<Question, Long> {

    Page<Question> findByStatus(Question.Status status, PageRequest pageRequest); // 질문 상태로 조회
    Page<Question> findByTitleContainingOrContentContaining(String keyword, String keyword1, PageRequest pageRequest); // 제목 또는 내용으로 조회
    Page<Question> findByTitleContaining(String keyword, PageRequest pageRequest); // 제목으로 조회
    Page<Question> findByContentContaining(String keyword, PageRequest pageRequest); // 내용으로 조회
    Page<Question> findByWriterNickNameContaining(String keyword, PageRequest pageRequest); // 작성자 닉네임으로 조회
    List<Question> findByWriterNickNameContaining(String keyword); // 작성자 닉네임으로 조회
    Page<Question> findByAnswersContentContaining(String keyword, PageRequest pageRequest); // 답변 내용으로 조회
    Page<Question> findByWriterNickNameContainingAndStatus(String nickName, Question.Status status, PageRequest questionId); // 작성자 닉네임과 질문 상태로 조회
    Page<Question> findByAnswersWriterNickNameContaining(String nickName, PageRequest questionId); // 답변 작성자 닉네임으로 조회
}
