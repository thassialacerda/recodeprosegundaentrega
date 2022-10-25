package br.com.springboot.controller;



import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import br.com.springboot.entity.Cliente;
import br.com.springboot.repository.ClienteRepository;



@Controller
public class HomeController {

	@Autowired
	private ClienteRepository clienteRepo;
	
	
	@GetMapping("/")
	public String home(Model m) {
	   
		List<Cliente> list = clienteRepo.findAll();
        m.addAttribute("all_clientes", list);
		
		
		
		
		return "index";
	}
	
	@GetMapping("/load_form")
	public String load_form()
	{
		return "add";
	}
	
	@GetMapping("/edit_form/{id}")
	public String edirform(@PathVariable(value = "id") long id,Model m) {
	
		
		Optional<Cliente> cliente = clienteRepo.findById(id);
		Cliente pro=cliente.get();
		m.addAttribute("cliente", pro);
		return "edit";
	}
	
	@PostMapping("/save_clientes")
	public String saveClientes(@ModelAttribute Cliente cliente,HttpSession session) {
	
	clienteRepo.save(cliente);
	session.setAttribute("msg", "Cotacao added Sucessfully..");
		
		
	return "redirect:/load_form";
	}

	@PostMapping("/update_clientes")
	public String updateClientes(@ModelAttribute Cliente cliente,HttpSession session) {
	
	clienteRepo.save(cliente);
	session.setAttribute("msg", "Cotacao Update Sucessfully..");
		
		
	return "redirect:/";
	
	
   }
	@GetMapping("/delete/{id}")
	public String deleteProducts(@PathVariable(value = "id") long id,HttpSession session)
	{
	
	clienteRepo.deleteById(id);
	session.setAttribute("msg", "Cotacao delete Sucessfully.. ");
		
	return "redirect:/";
	
}
}