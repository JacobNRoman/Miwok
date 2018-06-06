package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.provider.UserDictionary;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class WordAdapter extends ArrayAdapter<Word> {
    int color;

    public WordAdapter(Context context, List<Word> words, int color){
        super(context, R.layout.list_item, words);
        this.color = context.getResources().getColor(color);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View itemView = convertView;

        if (itemView == null) {
            itemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView miwok = (TextView) itemView.findViewById(R.id.miwok_text_view);
        TextView english = (TextView) itemView.findViewById(R.id.default_text_view);
        View clickView = itemView.findViewById(R.id.click);
        miwok.setBackgroundColor(color);
        english.setBackgroundColor(color);
        ImageView image = (ImageView) itemView.findViewById(R.id.image);
        if (currentWord.hasImage()) {
            image.setImageResource(currentWord.getImageResourceId());
        } else {
            image.setVisibility(View.GONE);
        }
        miwok.setText(currentWord.getMiwokTranslation());
        english.setText(currentWord.getDefaultTranslation());

        return itemView;
    }
}
