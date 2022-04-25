package com.rtxschool.zombies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.rtxschool.zombies.databinding.FragmentFirst6Binding;

public class First6Fragment extends Fragment {

    private FragmentFirst6Binding cur_context;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        cur_context
                = FragmentFirst6Binding.inflate(inflater, container, false);
        return cur_context.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        cur_context.imgCareer.
                setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                        NavHostFragment.findNavController(First6Fragment.this)
                                .navigate(R.id.from_stat_to_career);


                    }

                });
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        cur_context = null;
    }
}