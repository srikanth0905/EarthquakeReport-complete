package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class QuakeAdapter extends ArrayAdapter<Quake> {

    //private Activity activityContext;

    QuakeAdapter(Activity context, ArrayList<Quake> values) {
        super(context, 0, values);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null)
            listItemView = LayoutInflater.from(getContext()).
                    inflate(R.layout.report_layout, parent, false);

        final Quake currentQuakeList = getItem(position);

        TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
        //assert currentQuakeList != null;
        magnitude.setText(currentQuakeList.getMagnitude());

        TextView place = (TextView) listItemView.findViewById(R.id.place);
        place.setText(currentQuakeList.getPlaceName());

        TextView nearby = (TextView) listItemView.findViewById(R.id.nearOf);
        nearby.setText(currentQuakeList.getNearby());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentQuakeList.getDate());

        TextView time = (TextView) listItemView.findViewById(R.id.time);
        time.setText(currentQuakeList.getTime());

        return listItemView;
    }

}
