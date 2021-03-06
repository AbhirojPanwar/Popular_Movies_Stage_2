package abhiroj95.com.popular_movies_stage_2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import abhiroj95.com.popular_movies_stage_2.Data.Movie;

/**
 * Created by APnaturals on 7/1/2016.
 */
public class MovieGridAdapter extends ArrayAdapter<Movie> {


    public MovieGridAdapter(Context context, List<Movie> movieList) {
        super(context,0, movieList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Movie movie=getItem(position);
        String url="http://image.tmdb.org/t/p/w185"+movie.getImgPath();
        if(convertView==null)
        {
            convertView= LayoutInflater.from(getContext()).inflate(R.layout.disp_image,parent,false);
        }

        ImageView gridImage=(ImageView) convertView.findViewById(R.id.movie_poster);
        Picasso.with(getContext()).load(url.trim()).into(gridImage);
        return convertView;
    }




}
