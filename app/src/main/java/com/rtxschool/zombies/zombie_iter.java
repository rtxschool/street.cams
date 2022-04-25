package com.rtxschool.zombies;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.squareup.picasso.Picasso;

import androidx.cardview.widget.CardView;

import java.io.InputStream;
import java.util.ArrayList;

public class zombie_iter extends ArrayAdapter<zombie_p> {
    public zombie_iter(Context context, ArrayList<zombie_p> zombies
    ) {

        super(context, 0,
                zombies
        );
    }

    @Override
    public View getView(int i, View convertView, ViewGroup vg
    ) {
        zombie_p zp = getItem(i);

        if (convertView == null
        ) {
            convertView = LayoutInflater.from(getContext())
                    .inflate(R.layout.zombie, vg, !true
                    );
        }
        convertView.setTag(zp);
        TextView nomencl = (TextView) convertView.
                findViewById(R.id.txt_nomencl_
                );

        TextView publ = (TextView) convertView.
                findViewById(R.id.txt_published
                );

        nomencl.setText
                (zp.nomencl
                );

        publ.setText
                (zp.published
                );

        ImageView r = (ImageView) convertView.
                findViewById(R.id.img_zombie_micro
                );

        Picasso.with(getContext()
        )
                .load(zp.img_url
                )
                .into(r);

        return convertView;
    }
}




