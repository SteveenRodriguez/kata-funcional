package katas;

import com.google.common.collect.ImmutableList;
import model.Movie;
import model.MovieList;
import util.DataUtil;

import java.util.List;
import java.util.stream.Collectors;

/*
    Goal: Use map() and flatMap() to project and flatten the movieLists into an array of video ids (flatMap(c -> c.stream()))
    Objetivo: usar map() y flatMap() para proyectar y aplanar las movieLists en una matriz de
    identificadores de video (flatMap(c -> c.stream()))
    DataSource: DataUtil.getMovieLists()
    Output: List of Integers
*/
public class Kata3 {
    public static List<Integer> execute() {
        List<MovieList> movieLists = DataUtil.getMovieLists();

        List<Integer> videosPorIdAplanados = movieLists.stream()
                .map( movieList -> movieList.getVideos())
                .flatMap(video -> video.stream().map(id -> id.getId()))
                .collect(Collectors.toList());

        return videosPorIdAplanados;
    }
}
