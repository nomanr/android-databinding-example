package com.databinding.example.databindingexample.adapters;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import com.databinding.example.databindingexample.R;
import com.databinding.example.databindingexample.databinding.MovieListItemBinding;
import com.databinding.example.databindingexample.model.Movie;

import java.util.ArrayList;


public class SimpleAdapter extends ArrayAdapter<Movie> {
    private ArrayList<Movie> movies;
    private Context context;

    public SimpleAdapter(Context context, int resource, ArrayList<Movie> movies) {
        super(context, resource);
        this.movies = movies;
        this.context = context;
    }

    @Override
    public int getCount() {
        return movies.size();
    }

    @Override
    public Movie getItem(int position) {
        return movies.get(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(context);

        MovieListItemBinding binding = DataBindingUtil.
             inflate(inflater, R.layout.movie_list_item, null, false);

        //OR
        //MovieListItemBinding binding = MovieListItemBinding.inflate(inflater,null,false);

        binding.setMovie(getItem(position));
        return binding.getRoot();
    }
}
