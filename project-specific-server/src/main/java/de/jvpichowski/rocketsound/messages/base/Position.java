package de.jvpichowski.rocketsound.messages.base;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.telestion.api.message.JsonMessage;

public record Position(@JsonProperty double x, @JsonProperty double y, @JsonProperty double z) implements JsonMessage {

	@SuppressWarnings("unused")
	public Position() {
		this(0.0, 0.0, 0.0);
	}
}
