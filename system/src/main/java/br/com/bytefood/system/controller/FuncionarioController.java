package br.com.bytefood.system.controller;

import br.com.bytefood.system.model.Cliente;
import br.com.bytefood.system.model.Funcionario;
import br.com.bytefood.system.repository.FuncionarioRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;
import java.util.List;

@Controller
public class FuncionarioController {


    private final FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping("/funcionarios")
    public String funcionarios(Model model){
        List<Funcionario>  todosFuncionarios = funcionarioRepository.findAll();
        model.addAttribute("funcionarios", todosFuncionarios);
        return "funcionarios";
    }


    @GetMapping("/cadastro/funcionario")
    public String cadastroFuncionarioForm(Model model){
        model.addAttribute("funcionario", new Funcionario());
        return "funcionarioCadastroForm";
    }

    @PostMapping("/salvar/funcionario")
    public String salvaFuncionario(@Valid Funcionario funcionario, BindingResult result){
        if(result.hasErrors()){
            return "funcionarioCadastroForm";
        } else {
            funcionarioRepository.save(funcionario);
            return "redirect:/funcionarios";
        }
    }





}
