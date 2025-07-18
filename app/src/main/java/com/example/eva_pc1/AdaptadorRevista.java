package com.example.eva_pc1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdaptadorRevista extends ArrayAdapter<Revista> {
    public AdaptadorRevista(Context context, ArrayList<Revista> datos)  {
        super(context, R.layout.item, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item, null);




        TextView txtMes = (TextView)item.findViewById(R.id.txtAnio);
        txtMes.setText(getItem(position).getAnio());


        TextView txtCategoria = (TextView)item.findViewById(R.id.txtMes);
        txtCategoria.setText(getItem(position).getMes());

        TextView txtDescripcion = (TextView)item.findViewById(R.id.txtDescripcion);
        txtDescripcion.setText((getItem(position).getUrlpw()));

        //Imagen de la portada

        ImageView imageView = (ImageView)item.findViewById(R.id.imgUsr);
        Glide.with(this.getContext())
                .load(getItem(position).getUrlportada())
                .into(imageView);

        return(item);
    }
}
