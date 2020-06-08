package com.softwareag.tpmiti.tpp_fetcher_extract;

import java.io.File;
import java.io.IOException;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.softwareag.tpmiti.tpp_fetcher_extract.model.Copyrights;
import com.softwareag.tpmiti.tpp_fetcher_extract.model.Files;
import com.softwareag.tpmiti.tpp_fetcher_extract.model.ScanCodeResponseJSON;

@SpringBootApplication
public class JacksonApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(JacksonApplication.class, args);
	}

	public void run(String[] args) throws IOException {

		// create ObjectMapper instance
		ObjectMapper objectMapper = new ObjectMapper();

		// read json file and convert to ScanCode response object
		ScanCodeResponseJSON scanCodeResponseJSON = objectMapper.readValue(new File(
				"C:\\Users\\adh\\Documents\\TA Development\\TPP Interface\\User Story\\TPMITI-243 [TPP Interface] Improve copyright merge & clean logic\\vim-minimal-7.4.629-6.el7.x86_64new.json"),
				ScanCodeResponseJSON.class);

		// print ScanCode Copyright details
		Files[] files = scanCodeResponseJSON.getFiles();
		for (Files file : files) {
			Copyrights[] copyrights = file.getCopyrights();
			for (Copyrights copyright : copyrights) {
				System.out.println(copyright.getValue());
			}
		}

	}

}
