package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
    Goal: Chain filter() and map() to collect the ids of videos that have a rating of 5.0
    Objetivo: Chain filter() y map() para recopilar las identificaciones de videos que tienen una calificación de 5.0
    DataSource: DataUtil.getMovies()
    Output: List of Integers
*/
public class Kata2 {
    public static List<Integer> execute() {
        List<Movie> movies = DataUtil.getMovies();
        List<Integer> peliculasPorCalificacionAlta = movies.stream()
                .map(pelis -> pelis.getRating())
                .filter(calificacion -> calificacion == 5.0)
                .map(valor -> valor.intValue())
                .collect(Collectors.toList());

        return peliculasPorCalificacionAlta;
        //return ImmutableList.of(1, 2, 3);
    }
}
