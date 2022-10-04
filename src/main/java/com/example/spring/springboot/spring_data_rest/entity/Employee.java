package com.example.spring.springboot.spring_data_rest.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@ToString
@Getter
@Setter
@NoArgsConstructor
@RequiredArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    @NonNull
    private String name;

    @Column(name = "surname")
    @NonNull
    private String surname;

    @Column(name = "department")
    @NonNull
    private String department;

    @Column(name = "salary")
    @NonNull
    private int salary;

}
