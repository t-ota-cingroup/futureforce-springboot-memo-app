package com.lesson.memo.model;

import java.time.LocalDateTime;

import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Entity
@Table(name = "admins")
@Data
public class Admin{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "姓を入力してください")
    @Column(name = "last_name", nullable = false, length = 255)
    private String lastName;

    @NotBlank(message = "名を入力してください")
    @Column(name = "first_name", nullable = false, length = 255)
    private String firstName;

    @NotBlank(message = "メールアドレスを入力してください")
    @Column(nullable = false, unique = true, length = 255)
    private String email;

    @NotBlank(message = "パスワードを入力してください")
    @Column(nullable = false, length = 225)
    private String password;

    @DateTimeFormat(pattern = "yyyy-mm-dd HH-mm:ss")
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @DateTimeFormat(pattern = "yyyy-mm-dd HH-mm:ss")
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}