package com.example.demo_gradle;

import lombok.*;

import javax.persistence.*;

@Entity // This tells Hibernate to make a table out of this class
@Table(name = "UserTable")
@Getter @Setter @ToString @NoArgsConstructor @RequiredArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;

    @Column
    @NonNull
    private String name;

    @Column
    @NonNull
    private String email;
}