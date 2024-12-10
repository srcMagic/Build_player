package com.buildplayer.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.buildplayer.demo.model.Player;
import com.buildplayer.demo.repository.PlayerRepository;
import com.buildplayer.exception.PlayerException;

@Service
public class PlayerService {

	@Autowired
	private PlayerRepository playerRepository;

	public Player addPlayers(Player player) {
		return playerRepository.save(player);
	}

	public List<Player> findAllPlayers() {
		return playerRepository.findAll();
	}

	public Player findPlayerById(int id) {
		return playerRepository.findById(id)
				.orElseThrow(() -> new PlayerException("Player by id " + id + "was not found"));
	}

	public Player updatePlayer(Player player) {
		return playerRepository.save(player);
	}

	public void deletePlayer(int id) {
		Player existingPlayer = this.playerRepository.findById(id)
				.orElseThrow(() -> new PlayerException("Player by id " + id + "was not found"));
		this.playerRepository.delete(existingPlayer);

	}

}
