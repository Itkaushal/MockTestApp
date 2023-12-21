package com.kaushlendraprajapati.mocktest.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.kaushlendraprajapati.mocktest.ui.notifications.tab_fragment.rank.RankFragment;
import com.kaushlendraprajapati.mocktest.ui.notifications.tab_fragment.score.ScoreFragment;

public class TabAdapter extends FragmentStateAdapter{

    public TabAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position){
            case 0:
                RankFragment rf = new RankFragment();
                return rf;
            case 1:
                ScoreFragment sf = new ScoreFragment();
                return sf;

            default:
                return null;
        }
    }

    @Override
    public int getItemCount() {
        return 2;
    }
}
