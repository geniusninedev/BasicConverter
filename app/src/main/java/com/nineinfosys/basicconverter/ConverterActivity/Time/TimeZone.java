package com.nineinfosys.basicconverter.ConverterActivity.Time;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;


import com.nineinfosys.basicconverter.Adapter.CustomAdapter;
import com.nineinfosys.basicconverter.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class TimeZone  extends Fragment {
    private Spinner spinnerfrom,spinnerto;
    private Calendar current;
    private TextView txtCurrentTime, txtTimeZonedate,txtGMT, txtTimeFrom,txtTimeTo,txtGMTTime,txttimezone,txttimezoneTime,txtTimeDiffrence,textViewConvert;
    private long miliSecondsfrom=0,miliSecondsto=0;
    private SimpleDateFormat sdftime,sdfdate;
    private Date resultdatefrom,resultdateto;
    java.util.TimeZone timezonefrom,timezoneto;

    //HH converts hour in 24 hours format (0-23), day calculation
    SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
    Date d1 = null;
    Date d2 = null;
    String[] idArray;
    String dateStart,dateStop;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View v  = inflater.inflate(R.layout.activity_time_zone,null);

        //getTimedifference();
        spinnerfrom = (Spinner) v.findViewById(R.id.spinnerfrom);
        spinnerto = (Spinner) v.findViewById(R.id.spinnerto);

        txtCurrentTime = (TextView) v.findViewById(R.id.txtCurrentTime);
        txtTimeZonedate = (TextView) v.findViewById(R.id.txtTimeZonedate);
        txtGMT = (TextView)v. findViewById(R.id.txtGMT);
        txtGMTTime = (TextView) v.findViewById(R.id.txtGMTTime);
        txttimezone = (TextView) v.findViewById(R.id.txttimezone);
        txttimezoneTime = (TextView) v.findViewById(R.id.txttimezoneTime);
        txtTimeFrom = (TextView) v.findViewById(R.id.txtTimeFrom);
        txtTimeTo = (TextView) v.findViewById(R.id.txtTimeTo);
        txtTimeDiffrence = (TextView) v.findViewById(R.id.txtTimeDiffrence);
        textViewConvert=(TextView) v.findViewById(R.id.buttonUnitConverter);
        idArray = java.util.TimeZone.getAvailableIDs();

        CustomAdapter customAdapter=new CustomAdapter(getActivity(),idArray);
        spinnerfrom.setAdapter(customAdapter);
        spinnerto.setAdapter(customAdapter);
        spinnerfrom.setSelection(247);
        spinnerto.setSelection(483);
        sdftime = new SimpleDateFormat("hh:mm a");
        sdfdate = new SimpleDateFormat("EEEE, dd MMMM yyyy ");
       // getGMTTime();
        txtTimeDiffrence.setText("Time Difference : -5:-29:47");
        spinnerfrom.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

                    @Override
                    public void onItemSelected(AdapterView<?> parent,
                                               View view, int position, long id) {
                        getTimedifference();
                        TextView names = (TextView) view.findViewById(R.id.textView);
                        txtTimeFrom.setText("From - "+names.getText().toString().trim());
                       // txtTimeTo.setText("To - "+spinnerto.getSelectedItem().toString());
                       // getGMTTime();
                        current = Calendar.getInstance();
                        //txtCurrentTime.setText(sdf.format(current.getTime()));

                        miliSecondsfrom = current.getTimeInMillis();

                        java.util.TimeZone tzCurrent = current.getTimeZone();
                        int offset = tzCurrent.getRawOffset();
                        if (tzCurrent.inDaylightTime(new Date())) {
                            offset = offset + tzCurrent.getDSTSavings();
                        }

                        miliSecondsfrom = miliSecondsfrom - offset;

                        resultdatefrom = new Date(miliSecondsfrom);
                        // System.out.println(sdf.format(resultdate));
                        timezonefrom = java.util.TimeZone.getTimeZone(idArray[position]);
                        String TimeZoneName = timezonefrom.getDisplayName();

                        int TimeZoneOffset = timezonefrom.getRawOffset()
                                / (60 * 1000);

                        int hrs = TimeZoneOffset / 60;
                        int mins = TimeZoneOffset % 60;

                        miliSecondsfrom = miliSecondsfrom + timezonefrom.getRawOffset();

                        resultdatefrom = new Date(miliSecondsfrom);
                        System.out.println(sdftime.format(resultdatefrom));

                        txtGMT.setText(TimeZoneName);
                        txtGMTTime.setText(sdftime.format(resultdatefrom));
                        txtCurrentTime.setText(sdfdate.format(resultdatefrom));
                        dateStart= format.format(resultdatefrom);

                        miliSecondsfrom = 0;

                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> arg0) {

                    }
                });
        spinnerto.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

            @Override
            public void onItemSelected(AdapterView<?> parent,
                                       View view, int position, long id) {
                getTimedifference();
                TextView names = (TextView) view.findViewById(R.id.textView);
                txtTimeTo.setText("To - "+names.getText().toString().trim());
                // txtTimeTo.setText("To - "+spinnerto.getSelectedItem().toString());
                //getGMTTime();
                current = Calendar.getInstance();
                //txtCurrentTime.setText(sdf.format(current.getTime()));

                miliSecondsto = current.getTimeInMillis();

                java.util.TimeZone tzCurrent = current.getTimeZone();
                int offset = tzCurrent.getRawOffset();
                if (tzCurrent.inDaylightTime(new Date())) {
                    offset = offset + tzCurrent.getDSTSavings();
                }

                miliSecondsto = miliSecondsto - offset;

                resultdatefrom = new Date(miliSecondsto);
                // System.out.println(sdf.format(resultdate));
                timezoneto = java.util.TimeZone.getTimeZone(idArray[position]);
                String TimeZoneName = timezoneto.getDisplayName();

                int TimeZoneOffset = timezoneto.getRawOffset()
                        / (60 * 1000);

                int hrs = TimeZoneOffset / 60;
                int mins = TimeZoneOffset % 60;

                miliSecondsto = miliSecondsto + timezoneto.getRawOffset();

                resultdateto = new Date(miliSecondsto);
                System.out.println(sdftime.format(resultdateto));

                txttimezone.setText(TimeZoneName);
                txttimezoneTime.setText(sdftime.format(resultdateto));
                txtTimeZonedate.setText(sdfdate.format(resultdateto));
                dateStop = format.format(resultdateto);

                miliSecondsto = 0;
            }

            @Override
            public void onNothingSelected(AdapterView<?> arg0) {

            }
        });
        textViewConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //switch spinner value
                int spinner1Index = spinnerfrom.getSelectedItemPosition();
                spinnerfrom.setSelection(spinnerto.getSelectedItemPosition());
                spinnerto.setSelection(spinner1Index);
            }
        });
return v;
    }

    private void getTimedifference() {
        Date d1 = null;
        Date d2 = null;

        try {
            long diff=0;
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);

            //in milliseconds
            diff= d2.getTime() - d1.getTime();

            long diffSeconds = diff / 1000 % 60;
            long diffMinutes = diff / (60 * 1000) % 60;
            long diffHours = diff / (60 * 60 * 1000) % 24;
            long diffDays = diff / (24 * 60 * 60 * 1000);

            System.out.print(diffDays + " days, ");
            System.out.print(diffHours + " hours, ");
            System.out.print(diffMinutes + " minutes, ");
            System.out.print(diffSeconds + " seconds.");
            String hms = String.format("%02d:%02d:%02d", TimeUnit.MILLISECONDS.toHours(diff),
                    TimeUnit.MILLISECONDS.toMinutes(diff) % TimeUnit.HOURS.toMinutes(1),
                    TimeUnit.MILLISECONDS.toSeconds(diff) % TimeUnit.MINUTES.toSeconds(1));
            txtTimeDiffrence.setText("Time Difference : "+hms);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Convert Local Time into GMT time

    private void getGMTTime() {
        current = Calendar.getInstance();
        //txtCurrentTime.setText(sdf.format(current.getTime()));

        miliSecondsto = current.getTimeInMillis();

        java.util.TimeZone tzCurrent = current.getTimeZone();
        int offset = tzCurrent.getRawOffset();
        if (tzCurrent.inDaylightTime(new Date())) {
            offset = offset + tzCurrent.getDSTSavings();
        }

        miliSecondsto = miliSecondsto - offset;

        resultdatefrom = new Date(miliSecondsto);
       // System.out.println(sdf.format(resultdate));
    }

}