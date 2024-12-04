package com.example.tatjavalab4.data;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "ro_users")
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "name")
    private String name;

    @Lob
    @Column(name = "mail")
    private String mail;

    @Lob
    @Column(name = "password")
    private String password;

    @Column(name = "birthday")
    private LocalDate birthday;

    @Column(name = "pid")
    private Integer pid;

    @ColumnDefault("0")
    @Column(name = "balance")
    private Double balance;

    @Column(name = "time")
    private Instant time;

    public User(String name, String mail, String password, String birthday, String pid, Double balance) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.birthday = LocalDate.parse(birthday);
        this.pid = Integer.parseInt(pid);
        this.balance = balance;
        this.time = Instant.now();
    }

}