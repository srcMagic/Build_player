package com.buildplayer.demo.controller;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.buildplayer.demo.model.Player;
import com.buildplayer.demo.service.PlayerService;

@RestController
@RequestMapping("/api")
public class PlayerController {

	private final PlayerService playerService;

	public PlayerController(PlayerService playerService) {
		this.playerService = playerService;
	}

	@PostMapping("/players")
	public ResponseEntity<Player> addPlayers(@RequestBody Player player) {
		Player newPlayer = playerService.addPlayers(player);
		return new ResponseEntity<>(newPlayer, HttpStatus.CREATED);
	}

	@GetMapping("/players")
	public ResponseEntity<List<Player>> getAllPlayers() {
		List<Player> players = playerService.findAllPlayers();
		return new ResponseEntity<>(players, HttpStatus.OK);
	}

	@GetMapping("/players/{id}")
	public ResponseEntity<Player> findPlayerById(@PathVariable("id") int id) {
		Player player = playerService.findPlayerById(id);
		return new ResponseEntity<>(player, HttpStatus.OK);
	}

	@PutMapping("/players/{id}")
	public ResponseEntity<Player> updatePlayer(@PathVariable("id") int id, @RequestBody Player player) {
		player.setId(id);
		Player updatePlayer = playerService.updatePlayer(player);
		return new ResponseEntity<>(updatePlayer, HttpStatus.OK);
	}

	@DeleteMapping("/players/{id}")
	public ResponseEntity<Player> deletePlayer(@PathVariable("id") int id) {
		playerService.deletePlayer(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
