package com.nineinfosys.basicconverter.Adapter;

import android.content.Context;
import android.content.Intent;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.nineinfosys.basicconverter.ConverterActivity.AngleActivity;
import com.nineinfosys.basicconverter.ConverterActivity.AreaActivity;
import com.nineinfosys.basicconverter.ConverterActivity.CookingActivity;
import com.nineinfosys.basicconverter.ConverterActivity.DataStorageActivity;
import com.nineinfosys.basicconverter.ConverterActivity.DataTransferConverterActivity;
import com.nineinfosys.basicconverter.ConverterActivity.EnergyActivity;
import com.nineinfosys.basicconverter.ConverterActivity.ForceActivity;
import com.nineinfosys.basicconverter.ConverterActivity.FuelActivity;
import com.nineinfosys.basicconverter.ConverterActivity.ImageActivity;
import com.nineinfosys.basicconverter.ConverterActivity.LengthActivity;
import com.nineinfosys.basicconverter.ConverterActivity.PowerActivity;
import com.nineinfosys.basicconverter.ConverterActivity.PrefixActivity;
import com.nineinfosys.basicconverter.ConverterActivity.PressureActivity;
import com.nineinfosys.basicconverter.ConverterActivity.RomanNumbersActivity;
import com.nineinfosys.basicconverter.ConverterActivity.SoundActivity;
import com.nineinfosys.basicconverter.ConverterActivity.SpeedActivity;
import com.nineinfosys.basicconverter.ConverterActivity.TempertureActivity;
import com.nineinfosys.basicconverter.ConverterActivity.Time.TimeMainActivity;
import com.nineinfosys.basicconverter.ConverterActivity.TimeActivity;
import com.nineinfosys.basicconverter.ConverterActivity.TypographyConversionActivity;
import com.nineinfosys.basicconverter.ConverterActivity.VolumeActivity;
import com.nineinfosys.basicconverter.ConverterActivity.VolumeDryActivity;
import com.nineinfosys.basicconverter.ConverterActivity.VolumeLumberConverterActivity;
import com.nineinfosys.basicconverter.ConverterActivity.WeightActivity;
import com.nineinfosys.basicconverter.ConverterActivity.WorkConverterActivity;

import com.nineinfosys.basicconverter.R;
import com.nineinfosys.basicconverter.Supporter.ItemObject;


import java.util.List;


/**
 * Created by AndriodDev5 on 18-04-2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolders> {

    private List<ItemObject> itemList;
    private Context context;

    public RecyclerViewAdapter(Context context, List<ItemObject> itemList) {
        this.itemList = itemList;
        this.context = context;
    }

    @Override
    public RecyclerViewHolders onCreateViewHolder(ViewGroup parent, int viewType) {

        View layoutView = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_view_list, null);
        RecyclerViewHolders rcv = new RecyclerViewHolders(layoutView);
        return rcv;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolders holder, int position) {
        holder.countryName.setText(itemList.get(position).getName());
        holder.countryPhoto.setImageResource(itemList.get(position).getPhoto());

    }

    @Override
    public int getItemCount() {
        return this.itemList.size();
    }


    public class RecyclerViewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{

        public TextView countryName;
        public ImageView countryPhoto;


        public RecyclerViewHolders(View itemView) {
            super(itemView);
            itemView.setOnClickListener(this);
            countryName = (TextView)itemView.findViewById(R.id.country_name);
            countryPhoto = (ImageView)itemView.findViewById(R.id.country_photo);

        }

        @Override
        public void onClick(View view) {

            switch (getPosition())
            {
                case 0:
                    Intent i=new Intent(context,TimeMainActivity.class);
                    context.startActivity(i);
                    break;
                case 1:
                    Intent i1=new Intent(context,LengthActivity.class);
                    context.startActivity(i1);
                    break;
                case 2:
                    Intent i2=new Intent(context,WeightActivity.class);
                    context.startActivity(i2);
                    break;
                case 3:
                    Intent i3=new Intent(context,VolumeActivity.class);
                    context.startActivity(i3);
                    break;
                case 4:
                    Intent i4=new Intent(context,TempertureActivity.class);
                    context.startActivity(i4);

                    break;
                case 5:
                    Intent i5=new Intent(context,AreaActivity.class);
                    context.startActivity(i5);
                    break;
                case 6:
                    Intent i6=new Intent(context,PressureActivity.class);
                    context.startActivity(i6);
                    break;
                case 7:
                    Intent i7=new Intent(context,EnergyActivity.class);
                    context.startActivity(i7);
                    break;
                case 8:
                    Intent i8=new Intent(context,PowerActivity.class);
                    context.startActivity(i8);
                    break;
                case 9:
                    Intent i9=new Intent(context,ForceActivity.class);
                    context.startActivity(i9);
                    break;
                case 10:
                    Intent i10=new Intent(context,TimeActivity.class);
                    context.startActivity(i10);
                    break;
                case 11:
                    Intent i11=new Intent(context,SpeedActivity.class);
                    context.startActivity(i11);
                    break;
                case 12:
                    Intent i12=new Intent(context,AngleActivity.class);
                    context.startActivity(i12);
                    break;

                case 13:
                    Intent i13=new Intent(context,FuelActivity.class);
                    context.startActivity(i13);
                    break;

                case 14:
                    Intent i14=new Intent(context,RomanNumbersActivity.class);
                    context.startActivity(i14);
                    break;
                case 15:
                    Intent i15=new Intent(context,DataStorageActivity.class);
                    context.startActivity(i15);
                    break;
                case 16:
                    Intent i16=new Intent(context,VolumeDryActivity.class);
                    context.startActivity(i16);
                    break;
                case 17:
                    Intent i17=new Intent(context,PrefixActivity.class);
                    context.startActivity(i17);
                    break;
                case 18:
                    Intent i18=new Intent(context,DataTransferConverterActivity.class);
                    context.startActivity(i18);
                    break;
                case 19:
                    Intent i19=new Intent(context,SoundActivity.class);
                    context.startActivity(i19);
                    break;
                case 20:
                    Intent i20=new Intent(context,TypographyConversionActivity.class);
                    context.startActivity(i20);

                    break;

                case 21:
                    Intent i21=new Intent(context,VolumeLumberConverterActivity.class);
                    context.startActivity(i21);
                    break;

                case 22:
                    Intent i22=new Intent(context,ImageActivity.class);
                    context.startActivity(i22);
                    break;

                case 23:
                    Intent i23=new Intent(context,CookingActivity.class);
                    context.startActivity(i23);
                    break;
                case 24:
                    Intent i24=new Intent(context,WorkConverterActivity.class);
                    context.startActivity(i24);
                    break;


            }


        }



    }
}