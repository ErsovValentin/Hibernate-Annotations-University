package com.hibernate.annotations.university;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "students_group")
public class Groups {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "group_id")
    private int id;

    @Column(name = "group_name")
    private String name;

    @Enumerated(EnumType.STRING)
    @Column(name = "faculty")
    private Faculty faculty;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "lecture",
                joinColumns = @JoinColumn(name = "students_group"),
                inverseJoinColumns = @JoinColumn(name = "professor"))
    private Set<Professors> professors;

    @OneToMany(mappedBy = "group", cascade = CascadeType.ALL)
    private Set<Students> students;



    public Groups() {
        this.name = null;
        this.faculty = null;
        this.professors = new HashSet<Professors>();
        this.students = new HashSet<Students>();
    }

    @Override
    public String toString() {
        return "Group{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", faculty=" + faculty +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public Set<Professors> getProfessors() {
        return professors;
    }

    public Set<Students> getStudents() {
        return students;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public void setProfessors(Set<Professors> professors) {
        this.professors = professors;
    }

    public void setStudents(Set<Students> students) {
        this.students = students;
    }
}
