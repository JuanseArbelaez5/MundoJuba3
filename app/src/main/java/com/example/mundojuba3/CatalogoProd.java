package com.example.mundojuba3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.mundojuba3.Adaptadores.Product_Adapter;
import com.example.mundojuba3.Entidades.Producto;

import java.util.ArrayList;

public class CatalogoProd extends AppCompatActivity {
    private ListView listViewProductos;
    private Product_Adapter productAdapter;
    private ArrayList<Producto> arrayProducts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catalogo_prod);

        listViewProductos = (ListView) findViewById(R.id.listViewProductos);
        arrayProducts = new ArrayList<>();
        /*
        //***** Creación de Productos
        Producto producto1 = new Producto("producto1", "Desc1", 37000, R.drawable.logo);
        Producto producto2 = new Producto("producto2", "Desc2", 57000, R.drawable.logo);
        Producto producto3 = new Producto("producto3", "Desc3", 47000, R.drawable.logo);
        Producto producto4 = new Producto("producto4", "Desc4", 27000, R.drawable.logo);
        Producto producto5 = new Producto("producto5", "Desc5", 37000, R.drawable.logo);
        Producto producto6 = new Producto("producto6", "Desc6", 137000, R.drawable.logo);

        arrayProducts.add(producto1);
        arrayProducts.add(producto2);
        arrayProducts.add(producto3);
        arrayProducts.add(producto4);
        arrayProducts.add(producto5);
        arrayProducts.add(producto6);
        */
        //***** ***** ****
        productAdapter = new Product_Adapter(this, arrayProducts);
        listViewProductos.setAdapter(productAdapter);

    }
}