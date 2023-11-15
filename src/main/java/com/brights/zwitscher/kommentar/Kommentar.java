package com.brights.zwitscher.kommentar;

import com.brights.zwitscher.artikel.BlogArtikel;
import com.brights.zwitscher.user.User;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Kommentar {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Instant datum;
    @ManyToOne
    @JsonIgnore
    private User verfasser;
    private String inhalt;
    @ManyToOne
    @JsonIgnore
    private BlogArtikel blogArtikel;

    public Kommentar() {
    }

    public Kommentar(User user, String inhalt, BlogArtikel blogArtikel) {
        this.verfasser = user;
        this.inhalt = inhalt;
        this.blogArtikel = blogArtikel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getDatum() {
        return datum;
    }

    public void setDatum(Instant datum) {
        this.datum = datum;
    }

    public User getVerfasser() {
        return verfasser;
    }

    public void setVerfasser(User user) {
        this.verfasser = user;
    }

    public String getInhalt() {
        return inhalt;
    }

    public void setInhalt(String inhalt) {
        this.inhalt = inhalt;
    }

    public BlogArtikel getBlogArtikel() {
        return blogArtikel;
    }

    public void setBlogArtikel(BlogArtikel blogArtikel) {
        this.blogArtikel = blogArtikel;
    }
}