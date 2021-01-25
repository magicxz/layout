package com.example.layout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ItemAdapter itemAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<OrderModel> orderModel = new ArrayList<>();
        orderModel.add(new OrderModel("PAID","Ordered Confirmed","T101","01/01/2021 1.00 AM","MYR 10,000","Tan Tan","Private tour","1 - 2","Kuala Lumpur", "05/01/2021","https://www.talkwalker.com/images/2020/blog-headers/image-analysis.png"));
        orderModel.add(new OrderModel("UNPAID","Pending Order","T102","02/01/2021 2.00 AM","MYR 20,000","Ba Ba","Public tour","3 - 4","Johor", "10/01/2021","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzr0R9ziCVWDGq7tD8jO-FhKrY_KxfqpxW1g&usqp=CAU"));
        orderModel.add(new OrderModel("PAID","Ordered Confirmed","T103","03/01/2021 3.00 AM","MYR 30,000","Quadra","Private sofa","1 - 5","Penang", "15/01/2021","https://cdn.searchenginejournal.com/wp-content/uploads/2019/08/c573bf41-6a7c-4927-845c-4ca0260aad6b-760x400.jpeg"));
        orderModel.add(new OrderModel("UNPAID","Pending Order","T104","04/01/2021 4.00 AM","MYR 40,000","Lolol","Private tour","2 - 5","Sabah", "20/01/2021","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTAfYnIYZSoO3v6wW1IMzXyGrsNVzymymgQhQ&usqp=CAU"));
        orderModel.add(new OrderModel("PAID","Ordered Confirmed","T105","05/01/2021 5.00 AM","MYR 50,000","Aquaria","Public room","2 - 4","Selangor", "25/01/2021","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRneF6YlKoPHrVxJAnSHV5edlYqs0FSV8rIxA&usqp=CAU"));
        orderModel.add(new OrderModel("PAID","Ordered Confirmed","T106","06/01/2021 6.00 AM","MYR 60,000","PaoPao","Private Mesin","1 - 2","Muar", "30/01/2021","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQlvHjLp_ZNMrgFCWdm6pg7kkJmA96xpekJdQ&usqp=CAU"));
        orderModel.add(new OrderModel("UNPAID","Pending Order","T107","07/01/2021 7.00 AM","MYR 70,000","Ilussion","Private aircon","1 - 3","Seremban", "4/02/2021","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQmlIGnKEJJYKYRYwforVnha5h-BV88MYEz7Q&usqp=CAU"));
        orderModel.add(new OrderModel("UNPAID","Pending Order","T108","08/01/2021 8.00 AM","MYR 80,000","Chan Chan","Public car","1 - 6","Nilai", "09/02/2021","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQx_hOOLH8i9Ipgp_5ceCzlqrjSp8IH2Tkkgw&usqp=CAU"));
        orderModel.add(new OrderModel("PAID","Ordered Confirmed","T109","09/01/2021 9.00 AM","MYR 90,000","Ha Meng","Private gym","1 - 4","Melaka", "14/02/2021","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRgtYdPpgOquAVSnyKJpDVGVlQhj_cdBvyLdw&usqp=CAU"));
        orderModel.add(new OrderModel("UNPAID","Pending Order","T110","10/01/2021 10.00 AM","MYR 11,111","Worlld","Public Zoo","3 - 6","Ipoh", "19/02/2021","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzr0R9ziCVWDGq7tD8jO-FhKrY_KxfqpxW1g&usqp=CAU"));

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        itemAdapter = new ItemAdapter(this,orderModel);
        recyclerView.setAdapter(itemAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}