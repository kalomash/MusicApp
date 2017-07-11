package com.example.admin.music;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Admin on 7/7/2017.
 */

public class SongAdapter extends ArrayAdapter<Song> {


    private int mColorResourceId;


    public SongAdapter(Context context, ArrayList<Song> words, int mcolorResourceId) {

        super(context, 0, words);
        mColorResourceId=mcolorResourceId;

    }
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Song currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current Word object and
        // set this text on the name TextView
        miwokTextView.setText(currentWord.getmMiwokTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView defualtTextView = (TextView) listItemView.findViewById(R.id.defualt_text_view);
        // Get the version number from the current Word object and
        // set this text on the number TextView
        defualtTextView.setText(currentWord.getmDefaultTranslation());

        //Find the ImageView in the list_item.xml layout with the ID image
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        //Set the ImageVIew to the image resource specified in the current Word


        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getImageResourceID());
// Make sure the view is visible
            imageView.setVisibility(View.VISIBLE);
        } else{
            //Hide the ImageView(set visibility to GONE)

            imageView.setVisibility(View.GONE);

        }
//Set the theme color for the list iten
        View textContainer = listItemView.findViewById(R.id.text_container);
        //Find the color that the resource ID maps
        int color  = ContextCompat.getColor(getContext(), mColorResourceId);
        //Set the background color of the text container view
        textContainer.setBackgroundColor(color);
        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}


