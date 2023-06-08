package br.edu.ufca.rumadmanga.http;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author slottwo
 */
public class MalRestAPI {

    public static void main(String[] args) throws ClientIdException {
        String CLIENT_ID;

        File file = new File("CLIENT-ID");
        try (Scanner reader = new Scanner(file)) {
            if (reader.hasNextLine()) {
                CLIENT_ID = reader.nextLine();
            } else {
                throw new ClientIdException("CLIENT-ID is empty.");
            }
        } catch (FileNotFoundException e) {
            throw new ClientIdException("CLIENT-ID not Found.");
        }
    }

}
