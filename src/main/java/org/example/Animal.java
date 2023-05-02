package org.example;

import javax.persistence.*;

@Entity
@Table(name = "animal")
public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int age;
    @Column
    private String name;
    @Column
    private boolean tail;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public boolean isTail() {
        return tail;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTail(boolean tail) {
        this.tail = tail;
    }
}
