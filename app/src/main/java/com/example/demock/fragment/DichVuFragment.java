package com.example.demock.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.demock.R;


public class DichVuFragment extends Fragment {

    private Button btnTroLaiDichVu;
    private Fragment fragment;



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_dichvu, container, false);
        btnTroLaiDichVu = view.findViewById(R.id.btnTroLaiDichVu);

        btnTroLaiDichVu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragment = new TrangChuFragment();
                replaceFragment(fragment);
            }
        });
        return view;
    }

    private void replaceFragment(Fragment someFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();
        transaction.replace(R.id.container_trangchu, someFragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}