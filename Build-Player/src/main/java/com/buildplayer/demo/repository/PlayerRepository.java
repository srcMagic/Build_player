package com.buildplayer.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.buildplayer.demo.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer> {

}
