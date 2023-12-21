package com.kaushlendraprajapati.mocktest.ui.notifications.tab_fragment.score;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.kaushlendraprajapati.mocktest.databinding.FragmentScoreBinding;

public class ScoreFragment extends Fragment {
    private FragmentScoreBinding fragmentScoreBinding;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        fragmentScoreBinding=FragmentScoreBinding.inflate(inflater,container,false);
        return fragmentScoreBinding.getRoot();
    }
}

