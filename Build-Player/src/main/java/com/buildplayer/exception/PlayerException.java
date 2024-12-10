package com.buildplayer.exception;

import java.io.Serial;

public class PlayerException extends RuntimeException {

	@Serial
	private static final long serialVersionUID = 5088656726691794786L;

	public PlayerException(String message) {
		super(message);
	}

}
