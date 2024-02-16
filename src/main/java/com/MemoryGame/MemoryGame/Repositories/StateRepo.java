package com.MemoryGame.MemoryGame.Repositories;

import com.MemoryGame.MemoryGame.Entities.SavingState;
import com.MemoryGame.MemoryGame.POJO.GameState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepo extends JpaRepository<SavingState, Integer> {
}
