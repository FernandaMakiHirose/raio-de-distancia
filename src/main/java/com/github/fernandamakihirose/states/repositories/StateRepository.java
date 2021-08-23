package com.github.fernandamakihirose.states.repositories;

import com.github.andrelugomes.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
