package com.MemoryGame.MemoryGame.Entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class SavingState {
    @Id
    @GeneratedValue
    private Integer Sessionid;

    @Lob
    private byte[] Matrix;
}
