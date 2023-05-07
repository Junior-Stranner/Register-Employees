package com.jujubaprojects.funcionario.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jujubaprojects.funcionario.model.Funcionario;

@Controller
public class FuncionarioController {

    List<Funcionario> funcs = new ArrayList();
        
    @GetMapping("/inicio")
        public String home(){
            return "inicio";
    }

    @PostMapping("inicio")
       public String lista(){
        int id = funcs.size()+1;
         return "redirect:lista";
       }

    @GetMapping("/lista")
        public ModelAndView cadastro(){
            ModelAndView mv = new ModelAndView("lista");
            mv.addObject("funcs",funcs);
            return mv;

       }   

    @GetMapping("/excluir")
      public ModelAndView excluir(@PathVariable("id") int id){
        ModelAndView mv = new ModelAndView("inicio");
        for(Funcionario funcionario : funcs){
            if(funcionario.getId()== id){
                funcs.remove(funcionario);
                break;
            }
        }
        mv.addObject("funcs",funcs);
        return mv;
        
      }

}
