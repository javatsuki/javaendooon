package com.example.baseball.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.baseball.domain.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

	

}
