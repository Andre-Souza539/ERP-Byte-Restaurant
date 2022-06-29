package br.com.bytefood.system.controller;

import br.com.bytefood.system.model.Cliente;
import br.com.bytefood.system.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


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

    @GetMapping("/cliente/cadastro")
    public String cadastroForm(Model model){
        model.addAttribute("cliente", new Cliente());
        return "cadastroClienteForm";
    }

    @PostMapping("/cadastrar/cliente")
    public String cadastrarCliente(Cliente cliente){
        clienteRepository.save(cliente);
        return  "redirect:/clientes";
    }

    @GetMapping("/deletar/cliente/{id}")
    public String cadastrarCliente(@PathVariable Long id){
        clienteRepository.deleteById(id);
        return  "redirect:/clientes";
    }

    @GetMapping("/atualizar/cliente/{id}")
    public String updateCliente(@PathVariable Long id, Model model){
        model.addAttribute("cliente", clienteRepository.findById(id));
        return "atualizacaoClienteForm";
    }

    @GetMapping("/update")
    public String updateProcess(Cliente cliente){
        clienteRepository.save(cliente);
        return "redirect:/clientes";
    }

}
