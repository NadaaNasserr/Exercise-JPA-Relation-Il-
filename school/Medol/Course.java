package com.example.school.Medol;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;


@Setter
@Getter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;




    private String name;




    @ManyToOne
    @JoinColumn(name = "teacher_id" , referencedColumnName = "id")
    @JsonIgnore
    private Teacher teacher1;

}
