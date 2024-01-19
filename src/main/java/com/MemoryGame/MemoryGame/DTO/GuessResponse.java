package com.MemoryGame.MemoryGame.DTO;

import lombok.Data;

@Data
public class GuessResponse {
    private String guess1;
    private String guess2;
    private Boolean isCorrect;
}
