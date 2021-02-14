package com.example.firstproject.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.AllArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@ToString
public class Article {

    @Id // 대표값 pk
    @GeneratedValue // 1,2,3,4 자동 증가 시퀀스 인듯
    private Long id;

    @Column
    private String title;

    @Column
    private String content;
}
