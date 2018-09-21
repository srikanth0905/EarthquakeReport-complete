package com.example.android.quakereport;

import android.app.Activity;
import android.graphics.drawable.GradientDrawable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
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
        //
        double magnitudeValue = currentQuakeList.getMagnitude();
        magnitude.setText(String.valueOf(magnitudeValue));


        TextView place = (TextView) listItemView.findViewById(R.id.place);
        place.setText(currentQuakeList.getPlaceName());

        TextView nearby = (TextView) listItemView.findViewById(R.id.nearOf);
        nearby.setText(currentQuakeList.getNearby());

        TextView date = (TextView) listItemView.findViewById(R.id.date);
        date.setText(currentQuakeList.getDate());

        TextView time = (TextView) listItemView.findViewById(R.id.time);
        time.setText(currentQuakeList.getTime());


        GradientDrawable magnitudeCircle = (GradientDrawable) magnitude.getBackground();
        int magnitudeColor = getMagnitudeColor(magnitudeValue);
        magnitudeCircle.setColor(magnitudeColor);

        return listItemView;
    }


    private int getMagnitudeColor(double magnitude) {

        int magnitudeColorResourceId;
        int magnitudeFloor = (int) Math.floor(magnitude);

        switch (magnitudeFloor) {
            case 0:
            case 1:
                magnitudeColorResourceId = R.color.magnitude1;
                break;
            case 2:
                magnitudeColorResourceId = R.color.magnitude2;
                break;
            case 3:
                magnitudeColorResourceId = R.color.magnitude3;
                break;
            case 4:
                magnitudeColorResourceId = R.color.magnitude4;
                break;
            case 5:
                magnitudeColorResourceId = R.color.magnitude5;
                break;
            case 6:
                magnitudeColorResourceId = R.color.magnitude6;
                break;
            case 7:
                magnitudeColorResourceId = R.color.magnitude7;
                break;
            case 8:
                magnitudeColorResourceId = R.color.magnitude8;
                break;
            case 9:
                magnitudeColorResourceId = R.color.magnitude9;
                break;
            default:
                magnitudeColorResourceId = R.color.magnitude10plus;
                break;

        }

        return ContextCompat.getColor(getContext(), magnitudeColorResourceId);
    }


}
