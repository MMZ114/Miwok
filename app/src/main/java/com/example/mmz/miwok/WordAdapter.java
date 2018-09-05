package com.example.mmz.miwok;

import android.content.Context;
import android.provider.UserDictionary;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    /** Resource ID for the background color for this list of words */
    private int mColorResourceId;

    /**
     * Create a new {@link WordAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param words is the list of {@link Word}s to be displayed.
     * @param colorResourceId is the resource ID for the background color for this list of words
     */
    public WordAdapter(Context context, ArrayList<Word> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        Word word = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvMiwok);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvEnglish);
        ImageView ivImage = convertView.findViewById(R.id.ivImage);
        ImageView ivPlay = convertView.findViewById(R.id.ivPlay);

        if (word.getmImage() != -1){
            ivImage.setImageResource(word.getmImage());
        }else ivImage.setVisibility(View.GONE);

        ivPlay.setImageResource(word.getmPlayIcon());
        ivPlay.setVisibility(View.VISIBLE);
        // Populate the data into the template view using the data object
        tvName.setText(word.getmMiwokTranslation());
        tvHome.setText(word.getmDefaultTranslation());

        // Set the theme color for the list item
        View textContainer = convertView.findViewById(R.id.text_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);

        // Return the completed view to render on screen
        return convertView;
    }
}
