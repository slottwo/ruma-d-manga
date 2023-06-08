/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.http;

import java.io.FileNotFoundException;

/**
 *
 * @author slottwo
 */
public class ClientIdException extends FileNotFoundException {

    ClientIdException() {
        super();
    }

    ClientIdException(String s) {
        super(s);
    }
}
