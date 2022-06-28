package br.com.bytefood.system.controller;

import br.com.bytefood.system.model.Cliente;
import br.com.bytefood.system.repository.ClienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ClienteController {

    private final ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @GetMapping("/clientes")
    public String clientes(Model model){
        List<Cliente> todosClientes = clienteRepository.findAll();
        model.addAttribute("clientes",todosClientes);
        return "clientes";
    }

}   
