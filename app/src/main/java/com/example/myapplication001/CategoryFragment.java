package com.example.myapplication001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class CategoryFragment extends Fragment {

    private Button floortileBtn,outdoortileBtn,bathroomtileBtn,walltileBtn;
    private ImageView ftile1,ftile2,ftile3,ftile4,btile1,btile2,btile3,btile4,wtile1,wtile2,wtile3,wtile4,otile1,otile2,otile3,otile4;
    private TextView ftitle1,ftitle2,ftitle3,ftitle4;
    private TextView fprice1;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_category,container,false);

        outdoortileBtn = view.findViewById(R.id.outdoorTiles_viewall_btn);
        floortileBtn = view.findViewById(R.id.floortiles_viewall_btn);
        bathroomtileBtn = view.findViewById(R.id.bathroomtiles_viewallbtn);
        walltileBtn = view.findViewById(R.id.walltiles_viewall_btn);

        ///outdoor
        otile1 = view.findViewById(R.id.tile_outdoor1);
        otile2 = view.findViewById(R.id.tile_outdoor2);
        otile3 = view.findViewById(R.id.tile_outdoor4);
        otile4 = view.findViewById(R.id.tile_outdoor5);
        otile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseOutdoorTiles.class);
                startActivity(pur);
            }
        });
        otile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseOutdoorTiles.class);
                startActivity(pur);
            }
        });
        otile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseOutdoorTiles.class);
                startActivity(pur);
            }
        });
        otile4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseOutdoorTiles.class);
                startActivity(pur);
            }
        });

        ///outdoor
        ///wall
        wtile1 = view.findViewById(R.id.tile_wall1);
        wtile2 = view.findViewById(R.id.tile_wall2);
        wtile3 = view.findViewById(R.id.tile_wall3);
        wtile4 = view.findViewById(R.id.tile_wall4);

        wtile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseWallTiles.class);
                startActivity(pur);
            }
        });
        wtile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseWallTiles.class);
                startActivity(pur);
            }
        });
        wtile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseWallTiles.class);
                startActivity(pur);
            }
        });
        wtile4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseWallTiles.class);
                startActivity(pur);
            }
        });
        ///wall
        ///bath
        btile1 = view.findViewById(R.id.tile_bathroom1);
        btile2 = view.findViewById(R.id.tile_bathroom2);
        btile3 = view.findViewById(R.id.tile_bathroom3);
        btile4 = view.findViewById(R.id.tile_bathroom4);

        btile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseBathroomTiles.class);
                startActivity(pur);
            }
        });
        btile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseBathroomTiles.class);
                startActivity(pur);
            }
        });
        btile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseBathroomTiles.class);
                startActivity(pur);
            }
        });
        btile4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseBathroomTiles.class);
                startActivity(pur);
            }
        });
        ///bath
        ///floor
        ftile1 = view.findViewById(R.id.tile_floor1);
        ftile2 = view.findViewById(R.id.tile_floor2);
        ftile3 = view.findViewById(R.id.tile_floor3);
        ftile4 = view.findViewById(R.id.tile_floor4);

        ftitle1 = view.findViewById(R.id.f_title1);
        fprice1 = view.findViewById(R.id.f_price1);

        ftile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                ftile1.setImageResource(R.drawable.floor_aletra);
//                ftitle1.setText("Aletra Tiles");
//                fprice1.setText("1140/-");

                Intent pur = new Intent(getActivity(),ImageViews01.class);
                startActivity(pur);
            }
        });
        ftile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),ImageViews01.class);
                startActivity(pur);
            }
        });
        ftile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseFloorTiles.class);
                startActivity(pur);
            }
        });
        ftile4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pur = new Intent(getActivity(),PurchaseFloorTiles.class);
                startActivity(pur);
            }
        });
        //floor


        outdoortileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent outdoortile = new Intent(getActivity(),outdoorTilesPurchase.class);
                startActivity(outdoortile);
            }
        });

        floortileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent floortile = new Intent(getActivity(),floorTilesPurchase.class);
                startActivity(floortile);
            }
        });

        bathroomtileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bathroom = new Intent(getActivity(),bathroomTilesPurchase.class);
                startActivity(bathroom);
            }
        });

        walltileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent wall = new Intent(getActivity(),wallTilesPurchase.class);
                startActivity(wall);
            }
        });
        return view;
    }

}
