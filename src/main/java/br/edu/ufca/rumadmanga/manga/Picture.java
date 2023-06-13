/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufca.rumadmanga.manga;

import java.net.URI;

/**
 *
 * @author slottwo
 */
public class Picture {

    private URI medium;
    private URI large;

    Picture(URI large) {
        this.medium = null;
        this.large = large;
    }

    Picture(URI medium, URI large) {
        this.medium = medium;
        this.large = large;
    }

    public URI getLarge() {
        return large;
    }

    public URI getMedium() {
        return medium;
    }

    public void setLarge(URI large) {
        this.large = large;
    }

    public void setMedium(URI medium) {
        this.medium = medium;
    }

}
