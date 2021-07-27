package com.project.exercise.model.entity;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "exercise")
public class Exercise {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String url;

    @Column
    private int start;

    @Column
    private int end;


}
