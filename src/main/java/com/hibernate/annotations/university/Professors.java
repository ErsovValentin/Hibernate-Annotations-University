package com.hibernate.annotations.university;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "professors")
public class Professors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "professor_id")
    private int id;

    @Column(name = "professor_name")
    private String name;

    @Column(name = "professor_experience")
    private int experience;

    @ManyToMany(mappedBy = "professors")
    private Set<Groups> groups;

    public Professors() {
        this.name = null;
        this.experience = 0;
        this.groups = new HashSet<Groups>();
    }

    @Override
    public String toString() {
        return "Professor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }

    public Set<Groups> getGroups() {
        return groups;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public void setGroups(Set<Groups> groups) {
        this.groups = groups;
    }
}
