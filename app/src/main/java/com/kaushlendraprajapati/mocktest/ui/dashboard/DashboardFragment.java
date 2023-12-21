package com.kaushlendraprajapati.mocktest.ui.dashboard;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import com.kaushlendraprajapati.mocktest.Adapter.SliderAdapter;
import com.kaushlendraprajapati.mocktest.Modal.SliderData;
import com.kaushlendraprajapati.mocktest.databinding.FragmentDashboardBinding;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
public class DashboardFragment extends Fragment {

    private FragmentDashboardBinding binding;
    String url1 = "https://d20x1nptavktw0.cloudfront.net/wordpress_media/2019/01/mock-test-1.png";
    String url2 = "https://5.imimg.com/data5/UH/TX/FJ/GLADMIN-12761082/selection-003-500x500.png";
    String url3 = "https://s3service.hitbullseye.com/s3fs-public/cat-mock-test-sign.jpg?null";
    String url4 = "https://www.vidyalankar.org/infinite/gate/assets/informative/gate-exam-mock-test-online-for-free.png";


    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        DashboardViewModel dashboardViewModel = new ViewModelProvider(this).get(DashboardViewModel.class);
        binding = FragmentDashboardBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        ArrayList<SliderData> sliderDataArrayList = new ArrayList<>();
        sliderDataArrayList.add(new SliderData(url1));
        sliderDataArrayList.add(new SliderData(url2));
        sliderDataArrayList.add(new SliderData(url3));
        sliderDataArrayList.add(new SliderData(url4));

        SliderAdapter sa = new SliderAdapter(getContext(),sliderDataArrayList);
        binding.slider.setSliderAdapter(sa);
        binding.slider.setScrollTimeInSec(2);
        binding.slider.setAutoCycle(true);
        binding.slider.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_BACK_AND_FORTH);
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}