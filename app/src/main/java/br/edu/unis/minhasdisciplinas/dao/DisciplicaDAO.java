package br.edu.unis.minhasdisciplinas.dao;

import java.util.ArrayList;

import br.edu.unis.minhasdisciplinas.model.Disciplina;

public class DisciplicaDAO {

    private final  static ArrayList<Disciplina> listaDisciplinas = new ArrayList<>();

    public DisciplicaDAO(){
        carregarDisciplinas();
    }

    public void  salvar(Disciplina disciplina){
       this.listaDisciplinas.add(disciplina);
    }

    public void  carregarDisciplinas(){

        Disciplina d1 = new Disciplina(1,"Linguagem de Programação",60);
        Disciplina d2 = new Disciplina(2,"Aplicações Móveis",40);
        Disciplina d3 = new Disciplina(3,"Banco de Dados II",60);
        Disciplina d4 = new Disciplina(4,"Front-end avançado",80);
        Disciplina d5 = new Disciplina(5,"Back-end avançado",40);

        listaDisciplinas.add(d1);
        listaDisciplinas.add(d2);
        listaDisciplinas.add(d3);
        listaDisciplinas.add(d4);
        listaDisciplinas.add(d5);


    }


    public ArrayList<Disciplina> buscarTodos(){
        return new ArrayList<>(listaDisciplinas);
    }

}
