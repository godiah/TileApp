package com.example.myapplication001;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class AccountFragment extends Fragment {

     private TextView myprofileDetails, mysuggestions,myorders,mysaveditems;
     private ImageView myProfilePic;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        return inflater.inflate(R.layout.fragment_account,container,false);

        View view = inflater.inflate(R.layout.fragment_account,container,false);

        myprofileDetails = view.findViewById(R.id.accounts_myprofile);
        mysuggestions = view.findViewById(R.id.accounts_suggestions);
        myorders = view.findViewById(R.id.accounts_myorders);
        mysaveditems = view.findViewById(R.id.accounts_saveditems);
        myProfilePic = view.findViewById(R.id.myProfilePicture);

        myprofileDetails.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent editprofile = new Intent(getActivity(),MyProfileDetailsEditor.class);
                startActivity(editprofile);
            }
        });

        mysuggestions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent suggestion = new Intent(getActivity(),MySuggestions.class);
                startActivity(suggestion);

            }
        });

        myorders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Intent myOrders = new Intent(getActivity(),MyOrders.class);
               startActivity(myOrders);
            }
        });

        mysaveditems.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent mySavedItems = new Intent(getActivity(),MySavedItems.class);
                startActivity(mySavedItems);
            }
        });

//        myProfilePic.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent mediagallery = ge
//                startActivity(mediagallery);
//            }
//        });

        return view;
    }
}
