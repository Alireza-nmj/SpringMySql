package com.alirezanmj.h2blog;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String content;

    public Blog(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public Blog() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String lastName) {
        this.content = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String firstName) {
        this.title = firstName;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
