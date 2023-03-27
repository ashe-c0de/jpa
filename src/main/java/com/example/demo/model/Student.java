package com.example.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(
        name = "student",
        uniqueConstraints = {
                @UniqueConstraint(name = "email_unique", columnNames = "email")
        }
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;
    @Column(
            name = "first_name",
            nullable = false,
            columnDefinition = "varchar(20)"
    )
    private String firstname;
    @Column(
            name = "last_name",
            nullable = false,
            columnDefinition = "varchar(20)"
    )
    private String lastname;
    @Column(
            name = "email",
            nullable = false,
            columnDefinition = "varchar(255)"
    )
    private String email;
    @Column(
            name = "age",
            nullable = false
    )
    private Integer age;


    public Student() {
    }

    public Student(String firstname, String lastname, String email, Integer age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
