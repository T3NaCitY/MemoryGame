package com.MemoryGame.MemoryGame;

import com.MemoryGame.MemoryGame.DTO.GuessRequest;
import com.MemoryGame.MemoryGame.DTO.GuessResponse;
import com.MemoryGame.MemoryGame.POJO.StateOfTheGame;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
public class MainController {

    private StateOfTheGame State;

    @GetMapping(path="initial/{width}/{height}")
    public StateOfTheGame OnInitialLoad(@PathVariable int width, @PathVariable int height){
         StateOfTheGame state = new StateOfTheGame(width,height);
         State = state;
         return State;
    }

    @PostMapping(value = "/makeaguess", produces = "application/json")
    public GuessResponse MakeAGuess(@RequestBody GuessRequest guessRequest){
        return State.getElementByWidthAndHeight(guessRequest);
    }
}
