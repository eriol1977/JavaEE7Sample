/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.glassfish.movieplex7.client;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 *
 * @author Francesco
 */
@Named
@RequestScoped
public class MovieBackingBean
{

    int movieId;

    String name;

    String actors;

    public int getMovieId()
    {
        return movieId;
    }

    public void setMovieId(int movieId)
    {
        this.movieId = movieId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getActors()
    {
        return actors;
    }

    public void setActors(String actors)
    {
        this.actors = actors;
    }

}
