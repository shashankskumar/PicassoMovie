package com.skumar.picassomovie;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

/**
 * Created by shashankshivakumar on 11/21/17.
 */

public class MovieAdapter extends BaseAdapter {

    private final Context mContext;
    private final Movie[] movies;

    public MovieAdapter(Context mContext, Movie[] movies) {
        this.mContext = mContext;
        this.movies = movies;
    }

    @Override
    public int getCount() {
        return movies.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        final Movie movie = movies[position];
        if (view==null) {
            final LayoutInflater inflater = LayoutInflater.from(mContext);
            view = inflater.inflate(R.layout.movie_layout, null);
        }
        final ImageView imageView = (ImageView) view.findViewById(R.id.imageview_cover_art);
        final ImageView imageViewFav = (ImageView) view.findViewById(R.id.imageview_favorite);
        final TextView textView = (TextView) view.findViewById(R.id.textview_movie_name);

        Picasso.with(mContext)
                .load(movie.getImageUrl()) //Load the image
                .placeholder(R.drawable.ic_placeholder) //Image resource that act as placeholder
                .error(R.drawable.ic_error_black_18dp) //Image resource for error
                .resize(300, 500)  // Post processing - Resizing the image
                .into(imageView); // View where image is loaded.

        textView.setText(movie.getName());
        imageViewFav.setImageResource(
                movie.isFavorite() ? R.drawable.ic_favorite_black_18dp : R.drawable.ic_favorite_border_black_18dp);
        return view;
    }
}
