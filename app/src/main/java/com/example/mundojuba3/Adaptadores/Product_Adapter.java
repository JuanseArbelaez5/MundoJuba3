package com.example.mundojuba3.Adaptadores;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mundojuba3.Entidades.Producto;
import com.example.mundojuba3.R;

import java.util.ArrayList;

public class Product_Adapter extends BaseAdapter {

    private Context context;
    private ArrayList arrayProducts;

    public Product_Adapter(Context context, ArrayList arrayProducts) {
        this.context = context;
        this.arrayProducts = arrayProducts;
    }

    @Override
    public int getCount() {
        return arrayProducts.size();
    }

    @Override
    public Object getItem(int i) {
        return arrayProducts.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        //Se referencia el temaplate de producto
        view = layoutInflater.inflate(R.layout.product_template, null);

        ImageView imgProducts = (ImageView) view.findViewById(R.id.imgProducts);
        TextView textNameProducts = (TextView) view.findViewById(R.id.textNameProducts);
        TextView textDescriptionProducts = (TextView) view.findViewById(R.id.textDescriptionProducts);
        TextView textPriceProducts = (TextView) view.findViewById(R.id.textPriceProducts);

        Producto producto = (Producto) arrayProducts.get(i);
        imgProducts.setImageResource(producto.getImage());
        textNameProducts.setText(producto.getName());
        textDescriptionProducts.setText(producto.getDescription());
        //Se debe convertir el int del price a String
        textPriceProducts.setText(String.valueOf(producto.getPrice()));



        return null;
    }
}
