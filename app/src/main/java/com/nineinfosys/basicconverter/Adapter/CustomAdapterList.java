package com.nineinfosys.basicconverter.Adapter;

/**
 * Created by Dev on 26-05-2017.
 */

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.amulyakhare.textdrawable.TextDrawable;
import com.amulyakhare.textdrawable.util.ColorGenerator;
import com.nineinfosys.basicconverter.R;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CustomAdapterList extends BaseAdapter{
    Context context;
    int flags[];
    String[] countryNames;
    LayoutInflater inflter;
    public CustomAdapterList(Context applicationContext, String[] countryNames) {
        this.context = applicationContext;
        this.countryNames = countryNames;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return countryNames.length;
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
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.listrow, null);
        ImageView imageView;
        TextView textViewgmt,textViewtimezonename,textViewdate,textViewtime;
        long miliSeconds=0;
        Date resultdate;
        SimpleDateFormat sdftime,sdfdate;
        Calendar current;
        sdftime = new SimpleDateFormat("hh:mm a");
        sdfdate = new SimpleDateFormat("EEEE, dd MMMM yyyy ");
        imageView=(ImageView)view.findViewById(R.id.imageView);
        textViewgmt=(TextView)view.findViewById(R.id.textViewgmt);
        textViewtimezonename=(TextView)view.findViewById(R.id.textViewtimezonename);
        textViewdate=(TextView)view.findViewById(R.id.textViewdate);
        textViewtime=(TextView)view.findViewById(R.id.textViewtime);

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
        TextDrawable ic1= builder.build(String.valueOf(countryNames[i].charAt(0)), color1);
        imageView.setImageDrawable(ic1);

        textViewgmt.setText(countryNames[i]);
        current = Calendar.getInstance();


        miliSeconds = current.getTimeInMillis();

        TimeZone tzCurrent = current.getTimeZone();
        int offset = tzCurrent.getRawOffset();
        if (tzCurrent.inDaylightTime(new Date())) {
            offset = offset + tzCurrent.getDSTSavings();
        }

        miliSeconds = miliSeconds - offset;

        resultdate = new Date(miliSeconds);

        TimeZone timezone = TimeZone.getTimeZone(countryNames[i]);
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
        return view;
    }

}
