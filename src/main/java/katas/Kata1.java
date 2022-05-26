package katas;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import model.Movie;
import util.DataUtil;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

/*
    Goal: use map() to project an array of videos into an array of {id, title}-pairs
    Objetivo: usar map() para mostrar una serie de videos en una array de {id, title} parejas
    DataSource: DataUtil.getMovies()
    Output: List of ImmutableMap.of("id", "5", "title", "Bad Boys")
*/
public class Kata1 {

    public static List<Map> execute() {
        List<Movie> movies = DataUtil.getMovies();

        return movies.stream()
                .map(pelicula -> Map.of(pelicula.getId(), pelicula.getTitle()))
                .collect(Collectors.toList());
    }


}
