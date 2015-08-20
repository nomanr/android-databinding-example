package com.databinding.example.databindingexample.activities;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.databinding.example.databindingexample.R;
import com.databinding.example.databindingexample.adapters.SimpleAdapter;
import com.databinding.example.databindingexample.model.Movie;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_view_activity);

        listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(new SimpleAdapter(this,R.layout.movie_list_item,getData()));
    }

    private ArrayList<Movie> getData() {

        String[] titles = getResources().getStringArray(R.array.movie_titles);
        int[] year = getResources().getIntArray(R.array.movie_year);
        TypedArray ratings = getResources().obtainTypedArray(R.array.movie_rating);

        ArrayList<Movie> movies = new ArrayList<>();

        for (int i = 0; i < titles.length; i++) {
            Movie movie = new Movie();
            movie.setTitle(titles[i]);
            movie.setYear(year[i]);
            movie.setRating(ratings.getString(i));
            movies.add(movie);

        }
        return movies;
    }



}
