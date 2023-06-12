/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.gui;

/**
 *
 * @author slottwo
 */
public class Main {

    public static InícioJFrame início;
    public static InícioLogadoJFrame inícioLogado;
    public static PesquisaJFrame pesquisa;
    public static BibliotecaJFrame biblioteca;

    public static void main(String[] args) {
        início = new InícioJFrame();
        início.setVisible(true);
        inícioLogado = new InícioLogadoJFrame();
        pesquisa = new PesquisaJFrame();
//      biblioteca = new BibliotecaJFrame();
//      biblioteca.setVisible(false);
    }
}
