package de.jvpichowski.rocketsound.messages.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telestion.api.message.JsonMessage;

public record Temperature(@JsonProperty double temperature) implements JsonMessage {

	@SuppressWarnings("unused")
	public Temperature(){
		this(0.0);
	}
}
