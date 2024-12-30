package lk.javaspringbootacademy.demo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Columns;

@Entity
@Table(name = "user_table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;


    @Column(name = "user_name",length = 255)
    private String name;

    @Column(name = "user_age")
    private int age;



}
