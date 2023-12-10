package com.example.demo.core.domain.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@AllArgsConstructor
@Builder
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String name;
    private String author;
    private String publisher;
    private Date publishDate;
    private int pages;
    private double price;

    //War nicht in Tobis repo. Intellij zeigt aber einen Error ohne das. Vllt. läuft der App ohne das trotzdem.
    public Product(){}

    public Integer getId() { return id;}

    public void setId(Integer id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) {this.name = name; }

    public String getPublisher() { return publisher; }

    public void setPublisher(String publisher) { this.publisher = publisher; }

    public Date getPublishDate() { return publishDate; }

    public void setPublishDate(Date publishDate) { this.publishDate = publishDate; }

    public int getPages() {return pages; }

    public void setPages(int pages) {this.pages = pages; }

    public double getPrice() { return price; }

    public void setPrice(double price) { this.price = price; }
}
