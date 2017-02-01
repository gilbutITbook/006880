package com.devchronicles.dataaccessobject;

import java.util.List;
import javax.persistence.EntityManager;

public class MovieDAOImpl implements MovieDAO {
    private EntityManager em;

    public MovieDAOImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public void addMovie(Movie movie) {
        em.persist(movie);
    }

    @Override
    public Movie getMovie(int id) {
        return getAllMovies().get(id);
    }

    @Override
    public void deleteMovie(int id) {
        em.remove(getMovie(id));
    }

    @Override
    public void updateMovie(Movie movie) {
        em.merge(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return em.createQuery("SELECT m FROM Movie m", Movie.class)
                .getResultList();
    }
}