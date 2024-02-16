package com.MemoryGame.MemoryGame.Controllers;

import com.MemoryGame.MemoryGame.DTO.GuessRequest;
import com.MemoryGame.MemoryGame.DTO.GuessResponse;
import com.MemoryGame.MemoryGame.Entities.SavingState;
import com.MemoryGame.MemoryGame.POJO.GameState;
import com.MemoryGame.MemoryGame.Repositories.StateRepo;
import com.MemoryGame.MemoryGame.Services.GameStateService;
import org.springframework.web.bind.annotation.*;


@RestController
public class MainController {


    private GameState currentGameState;
    private StateRepo repo;
    private GameStateService gameStateService;
    private MainController(StateRepo repo, GameStateService gameStateService){
        this.repo = repo;
        this.gameStateService = gameStateService;
    }

    @GetMapping(path="initial/{row}/{column}")
    public GameState OnInitialLoad(@PathVariable int row, @PathVariable int column){
        this.currentGameState = new GameState(row, column);
        SavingState dbState = new SavingState();

        //Converting String to LOB
        dbState.setMatrix(gameStateService.getMatrixToString(currentGameState.getElements()).getBytes());



        //Converting ByteArray to Matrix
        //currentGameState.getByteArrayToMatrix(currentGameState.getMatrixToString(currentGameState.getElements()).getBytes());

        //Have to Implement Session ID that is getting stored in LocalStorage (Have to do Front First)
        //currentGameState.getByteArrayToMatrix(currentGameState.getMatrixToString(repo.findById(SessionId));

        repo.save(dbState);
         return currentGameState;
    }

    @PostMapping(value = "/makeaguess", produces = "application/json")
    public GuessResponse MakeAGuess(@RequestBody GuessRequest guessRequest){
        return currentGameState.getElementByWidthAndHeight(guessRequest);
    }


}
