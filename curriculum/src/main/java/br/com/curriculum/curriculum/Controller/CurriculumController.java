package br.com.curriculum.curriculum.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.curriculum.curriculum.Model.Eu;
import br.com.curriculum.curriculum.Model.Experiencias;

@Controller
@RequestMapping("/exemplo")

public class CurriculumController {
    Eu eu = new Eu("Larissa Silva",
     "Meu nome é Larissa, tenho 20 anos, moro atualmente na cidade de São Paulo, sou uma profissional com boas habilidades de relacionamento, proatividade e com facil capacidade de trabalho em equipe. Aprendo novas coisas com facilidade e presto suporte a equipe e tarefas diversas, visando colaborar efetivamente em uma rotina de trabalho.",
     "Programadora Front End",
     "larybermatos@gmail.com");

    Idiomas ingles = new Idiomas("Ingles", 70);
    Idiomas frances = new Idiomas("Francês", 20);
    Idiomas espanhol = new Idiomas("Espanhol", 30);

    Experiencias EM = new Experiencias("12/2020", "Colégio Cidade Canção", "Ensino Médio", null);
    Experiencias SenaiADM = new Experiencias("08/2021", "Senai", "Auxiliar Administatrivo", null);
    Experiencias SenaiECO = new Experiencias("10/2021", "Senai", "Economia Circular", null);
    Experiencias SenaiTRANS = new Experiencias("10/2021", "Senai", "Competencia Transversal", null);
    Experiencias Senac = new Experiencias("Atual", "Senac", "Analise e Desenvolvimento de Sistemas", null);
    Experiencias AEC = new Experiencias("Atual", "AEC", "Telemarketing", "Atividades de suporte, Apoio administrativo, Atendimento ao cliete, Vendas, etc.");
    
    @GetMapping("/curriculum")
    public ModelAndView curriculum(){
    ModelAndView mv = new ModelAndView("curriculum");
    mv.addObject("nome", eu.getNome());
    mv.addObject("resumo", eu.getResumo());
    mv.addObject("profissao", eu.getProfissao());
    mv.addObject("email", eu.getEmail());
    mv.addObject("ingles", ingles.getNome());
    mv.addObject("inglesAP", ingles.getAprendizado() + "%");
    mv.addObject("espanhol", espanhol.getNome());
    mv.addObject("espanholAP", espanhol.getAprendizado() + "%");
    mv.addObject("frances", frances.getNome());
    mv.addObject("francesAP", frances.getAprendizado() + "%");



    mv.addObject("em", EM.getAno());
    mv.addObject("admAno", SenaiADM.getAno());
    mv.addObject("ecoAno", SenaiECO.getAno());
    mv.addObject("transAno", SenaiTRANS.getAno());
    mv.addObject("senacAno", Senac.getAno());
    mv.addObject("aecAno", AEC.getAno());
    mv.addObject("emn", EM.getLugar() + " - " + EM.getCargo());
    mv.addObject("senai", SenaiADM.getLugar());
    mv.addObject("admNome", SenaiADM.getCargo() + " - " + SenaiADM.getAno());
    mv.addObject("ecoNome", SenaiECO.getCargo() + " - " + SenaiECO.getAno());
    mv.addObject("transNome", SenaiTRANS.getCargo() + " - " + SenaiTRANS.getAno());
    mv.addObject("senacNome", Senac.getLugar() + " - " + Senac.getCargo() + " - " + Senac.getAno());





    mv.addObject("aecNome", AEC.getLugar() + " - " + AEC.getCargo() + " " + AEC.getAno());
    mv.addObject("aecResumo", AEC.getResumo());

    
    return mv;
    }

    public class Idiomas {
        private String nome;
        private int aprendizado;

        public Idiomas(){

        }

        public Idiomas(String nome, int aprendizado) {
            this.nome = nome;
            this.aprendizado = aprendizado;
        }

        public int getAprendizado() {
            return aprendizado;
        }
        public void setAprendizado(int aprendizado) {
            this.aprendizado = aprendizado;
        }
        public String getNome() {
            return nome;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }

    }
}
