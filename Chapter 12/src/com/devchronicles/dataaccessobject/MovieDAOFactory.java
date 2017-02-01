package com.devchronicles.dataaccessobject;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@ApplicationScoped
public class MovieDAOFactory {
    @PersistenceContext(unitName = "moviePU")
    private EntityManager em;

    @Produces
    public MovieDAO createMovieDAO() {
        return new MovieDAOImpl(em);
    }
}