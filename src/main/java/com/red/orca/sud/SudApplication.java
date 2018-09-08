package com.red.orca.sud;

import com.red.orca.sud.areas.Room;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SudApplication.class, args);

		final Room room = new Room(false, null, null);
	}
}
