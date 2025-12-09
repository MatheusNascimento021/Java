
package com.mycompany.exercicio;


public class LivroAlgoritmos {
    
    String nomeLivro;
    String editora;
    String autor;
    int ano;
    int edicao;
    String idioma;
    boolean aberto;
    
    void abrir(){
        this.aberto = true;
    }
    void fechar(){
        this.aberto = false;
    }
    void estudar(){
        if(this.aberto == false){
            System.out.println("Não da pra estudar com o livro fechado.");
        } else{
            System.out.println("Bons estudos meu parceiro.");
        }
        

    }
    void status(){
        System.out.println("------STATUS-------");
        System.out.println("Título: " + nomeLivro);
        System.out.println("Editora: " + editora);
        System.out.println("Edição: " + edicao);
        System.out.println("Ano: " + ano);
        System.out.println("Autor: " + autor);
        System.out.println("Idioma: " + idioma);
        if(aberto){
            System.out.println("O livro está aberto");
        } else{
            System.out.println("O livro está fechado.");
        }
    }
            
    
}
