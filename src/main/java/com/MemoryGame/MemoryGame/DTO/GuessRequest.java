package com.MemoryGame.MemoryGame.DTO;

import lombok.Data;

@Data
public class GuessRequest {
    private int columnCard1;
    private int rowCard1;
    private int columnCard2;
    private int rowCard2;

}
