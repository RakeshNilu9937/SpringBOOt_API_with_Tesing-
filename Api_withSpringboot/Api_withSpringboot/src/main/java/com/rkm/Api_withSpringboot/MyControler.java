package com.rkm.Api_withSpringboot;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/Trains")
public class MyControler {
	@GetMapping("/MumRajadhani")
	public String Train1() {
		return"Rajdhani Express MUM-DEL,Dis-1384,Time-15H32M,trnum-12951";
	}
	@PostMapping("/CRRajadhani")
	public String Train2() {
		return "CR-Rajadhani Express CSMT-NZM,Dis-1534,Time-17H55M,trnum-22221";
	}
	@PutMapping("/PaschimExpress")
	public String Train3() {
		return"Paschmi Express MMCT-NDLS,dis-1384,Time-22H15M,trnum-12925";
	
	}
	@DeleteMapping("/SwarajExpress")
	public String train4() {
		return"Swaraj Express BDTS-NDLS,dis-1337,Time-18h25M,trnum-12471";
	}

}
