package com.example.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student
{
    @Id
    @Column(name="ID")
    private long id;
    
    @Column(name="NAME")
    private String name;
    
    @Column(name="AGE")
    private long age;

    public Student()
    {
        super();
    }
    public Student(long id, String name, long age)
    {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public long getId()
    {
        return id;
    }
    public void setId(long id)
    {
        this.id = id;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public long getAge()
    {
        return age;
    }
    public void setAge(long age)
    {
        this.age = age;
    }
    
    @Override
    public String toString()
    {
        return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
    }
}
