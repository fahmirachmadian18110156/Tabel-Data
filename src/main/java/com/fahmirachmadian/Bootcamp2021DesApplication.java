package com.fahmirachmadian;

import com.fahmirachmadian.model.Mahasiswa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Bootcamp2021DesApplication {

	@Bean
	public String getNama() {
		return "Fahmi Rachmadian";
	}

	@GetMapping("/api/mahasiswa")
	public Mahasiswa getMahasiswa() {
		Mahasiswa mahasiswa = new Mahasiswa();
		mahasiswa.setNama("Fahmi Rachmadian");
		mahasiswa.setNim("18110156");
		mahasiswa.setKelas("TI");
		return mahasiswa;
	}

	@PostMapping("/api/mahasiswa")
	public Mahasiswa addMahasiswa(@RequestBody Mahasiswa mahasiswa) {
		return mahasiswa;
	}

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(Bootcamp2021DesApplication.class, args);

		String value = run.getBean("getNama", String.class);
		System.out.println("Value : " + value);
	}

}
