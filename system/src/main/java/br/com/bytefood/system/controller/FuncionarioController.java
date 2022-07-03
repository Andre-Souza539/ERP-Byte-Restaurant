package br.com.bytefood.system.controller;

import br.com.bytefood.system.model.Funcionario;
import br.com.bytefood.system.repository.FuncionarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FuncionarioController {


    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }


    @GetMapping("/funcionarios")
    public String listaFuncionarios(Model model){
        List<Funcionario>  todosFuncionarios = funcionarioRepository.findAll();
        model.addAttribute("funcionarios", todosFuncionarios);
        return "funcionarios";
    }


}
