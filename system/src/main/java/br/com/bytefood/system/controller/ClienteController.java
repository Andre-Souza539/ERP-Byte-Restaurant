package br.com.bytefood.system.controller;

import br.com.bytefood.system.model.Cliente;
import br.com.bytefood.system.repository.ClienteRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;


import javax.validation.Valid;
import java.text.Bidi;
import java.util.List;
import java.util.Optional;

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

    @GetMapping("/deletar/cliente/{id}")
    public String deletarCliente(@PathVariable Long id){
        clienteRepository.deleteById(id);
        return  "redirect:/clientes";
    }

    @GetMapping("/cadastro/cliente")
    public String cadastrarCliente(Model model){
        model.addAttribute("cliente", new Cliente());
        return "cadastroClienteForm";
    }

    @PostMapping("/cadastrar/cliente")
    public String salvarCliente(@Valid Cliente cliente, BindingResult result){
        if(result.hasErrors()){
            return "cadastroClienteForm";
        } else {
            clienteRepository.save(cliente);
            return "redirect:/clientes";
        }
    }

    @GetMapping("/atualizar/cliente/{id}")
    public String atualizaClienteForm(@PathVariable Long id, Model model){
        model.addAttribute("cliente", clienteRepository.findById(id));
        return "atualizaClienteForm";
    }

    @PostMapping("/atualiza/cliente")
    public String atualizaCliente(@Valid Cliente cliente, BindingResult result){
        if(result.hasErrors()){
            return "atualizaClienteForm";
        } else {
            clienteRepository.save(cliente);
            return "redirect:/clientes";
        }
    }



}
