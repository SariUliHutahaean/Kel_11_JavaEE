package del.ac.id.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import del.ac.id.demo.jpa.Pemesanan;
import del.ac.id.demo.jpa.PemesananRepository;

@RestController

public class PemesananController {
	@Autowired
	private PemesananRepository pemesananRepository;	
	
	@RequestMapping("pemesanan/showForm")
	public String showPemesananForm(Pemesanan pemesanan) {
		return "add-pemesanan";
	}
	
	@GetMapping("list")
	public String pemesanan(Model model) {
		model.addAttribute("pemesanans", this.pemesananRepository.findAll());
		return "index";
	}
	
	@PostMapping("add")
	public String addStudent(@Validated Pemesanan pemesanan, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "add-pemesanan";
		}
		
		this.pemesananRepository.save(pemesanan);
		return "redirect:list";
	}
	
	
	@GetMapping("edit/{id}")
	public String showUpdateForm(@PathVariable ("id") long id, Model model) {
		Pemesanan pemesanan = this.pemesananRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid pemesanan id : " + id));
		
		model.addAttribute("pemesanan", pemesanan);
		return "update-pemesanan";
	}
	
	@PostMapping("update/{id}")
	public String updatePemesanan(@PathVariable("id") int id, @Validated Pemesanan pemesanan, BindingResult result, Model model) {
		if(result.hasErrors()) {
			pemesanan.setId(id);
			return "update-pemesanan";
		}
		
		// update pemesanan
		pemesananRepository.save(pemesanan);
		
		// get all pemesanans ( with update)
		model.addAttribute("pemesanans", this.pemesananRepository.findAll());
		return "index";
	}
	
	@GetMapping("delete/{id}")
	public String deletePemesanan(@PathVariable ("id") Long id, Model model) {
		
		Pemesanan pemesanan = this.pemesananRepository.findById(id)
				.orElseThrow(() -> new IllegalArgumentException("Invalid pemesanan id : " + id));
		
		this.pemesananRepository.delete(pemesanan);
		model.addAttribute("pemesanans", this.pemesananRepository.findAll());
		return "index";
		
	}
}
