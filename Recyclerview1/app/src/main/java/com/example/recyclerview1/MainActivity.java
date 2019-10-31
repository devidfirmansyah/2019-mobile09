package com.example.recyclerview1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView tugas1 =(RecyclerView) findViewById(R.id.tugas1);
        tugas1.setLayoutManager(new LinearLayoutManager(this));
        String[] Mobil = {"Audi", "Bentley", "Buggati", "BMW", "Chevrolet",
                "Daihatsu","Ferrari", "Honda", "Isuzu", "Jaguar", "Lamborghini",
                "Mercedes Benz", "Mitsubishi", "Nissan", "Suzuki", "Toyota", "Volvo"};
        tugas1.setAdapter(new Tugas1Adapter(Mobil));
    }
}
