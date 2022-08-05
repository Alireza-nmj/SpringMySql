package com.alirezanmj.blogmysql2;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Blog {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String title;
    private String content;

    public Blog(String title, String content) {
        this.setTitle(title);
        this.setContent(content);
    }

    public Blog(int id, String title, String content) {
        this.setId(id);
        this.setTitle(title);
        this.setContent(content);
    }

    public Blog() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + "'" +
                ", content='" + content + "'" +
                '}';
    }

}
