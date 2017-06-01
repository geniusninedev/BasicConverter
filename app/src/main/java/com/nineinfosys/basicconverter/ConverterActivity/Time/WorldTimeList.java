package com.nineinfosys.basicconverter.ConverterActivity.Time;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.nineinfosys.basicconverter.Adapter.CustomAdapterList;
import com.nineinfosys.basicconverter.R;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * Created by Dev on 26-05-2017.
 */

public class WorldTimeList extends Fragment {

    ImageView imageView;
    TextView textViewgmt,textViewtimezonename,textViewdate,textViewtime;
    ListView listviewworldtime;
    String[] idArray;
    long miliSeconds=0;
    Date resultdate;
    SimpleDateFormat sdftime,sdfdate;
    Calendar current;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v  = inflater.inflate(R.layout.activity_listtimezone,null);
        imageView=(ImageView)v.findViewById(R.id.imageView);
        textViewgmt=(TextView)v.findViewById(R.id.textViewgmt);
        textViewtimezonename=(TextView)v.findViewById(R.id.textViewtimezonename);
        textViewdate=(TextView)v.findViewById(R.id.textViewdate);
        textViewtime=(TextView)v.findViewById(R.id.textViewtime);
        listviewworldtime=(ListView)v.findViewById(R.id.listviewworldtime);
        sdftime = new SimpleDateFormat("hh:mm a");
        sdfdate = new SimpleDateFormat("EEEE, dd MMMM yyyy ");
        ColorGenerator generator = ColorGenerator.DEFAULT; // or use DEFAULT
// generate random color
        int color1 = generator.getRandomColor();
// declare the builder object once.
        TextDrawable.IBuilder builder = TextDrawable.builder()
                .beginConfig()
                .withBorder(4)
                .endConfig()
                .round();
// reuse the builder specs to create multiple drawables
        TextDrawable ic1= builder.build("G", color1);
        imageView.setImageDrawable(ic1);

        textViewgmt.setText("GMT0");
        current = Calendar.getInstance();


        miliSeconds = current.getTimeInMillis();

        TimeZone tzCurrent = current.getTimeZone();
        int offset = tzCurrent.getRawOffset();
        if (tzCurrent.inDaylightTime(new Date())) {
            offset = offset + tzCurrent.getDSTSavings();
        }

        miliSeconds = miliSeconds - offset;

        resultdate = new Date(miliSeconds);

        TimeZone timezone = TimeZone.getTimeZone("GMT0");
        String TimeZoneName = timezone.getDisplayName();

        int TimeZoneOffset = timezone.getRawOffset()
                / (60 * 1000);

        int hrs = TimeZoneOffset / 60;
        int mins = TimeZoneOffset % 60;
        miliSeconds = miliSeconds + timezone.getRawOffset();

        resultdate = new Date(miliSeconds);
        textViewtimezonename.setText(TimeZoneName);
        textViewdate.setText(sdfdate.format(resultdate));
        textViewtime.setText(sdftime.format(resultdate));
        idArray = TimeZone.getAvailableIDs();
        listviewworldtime.setAdapter(new CustomAdapterList(getActivity(), idArray));

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View rootView = getActivity().getWindow().getDecorView().findViewById(android.R.id.content);


            }
        });

return v;
    }


}