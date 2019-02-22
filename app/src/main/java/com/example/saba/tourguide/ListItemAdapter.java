package com.example.saba.tourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;


public class ListItemAdapter extends ArrayAdapter<ListItem> {

    private ListItem listItem;

    public ListItemAdapter(@NonNull Context context, int resource, List<ListItem> listItems) {
        super(context, 0,listItems);
        Log.v("RestaurantTap:", "ListItemAdapter created!");
    }

    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        final ListItem currentItem = getItem(position);
        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentItem.getmName());

        TextView rating = (TextView) listItemView.findViewById(R.id.rating);
        rating.setText(("Bewertung: " + currentItem.getmRating()));

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        address.setText(currentItem.getmAddress());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentItem.getmImageRescourceId());

        return  listItemView;
    }
}

