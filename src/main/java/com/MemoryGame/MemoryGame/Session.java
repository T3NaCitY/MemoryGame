package com.MemoryGame.MemoryGame;

import jakarta.persistence.*;

@Entity
public class Session {

    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "sessionId", unique = true)
    private String sessionId;
}
