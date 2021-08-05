package com.github.rubenialima.staties.repositories;

import com.github.rubenialima.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
