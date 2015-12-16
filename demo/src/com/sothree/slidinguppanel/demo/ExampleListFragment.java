package com.sothree.slidinguppanel.demo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ListFragment;
import android.widget.ArrayAdapter;

import java.util.Arrays;
import java.util.List;

public class ExampleListFragment extends ListFragment {

    public ExampleListFragment() {
        super();
    }

    @Override
    public void onActivityCreated(@Nullable final Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        List<String> data = Arrays.asList(
            "This",
            "Is",
            "An",
            "Example",
            "ListView",
            "That",
            "You",
            "Can",
            "Scroll",
            ".",
            "It",
            "Shows",
            "How",
            "Any",
            "Scrollable",
            "View",
            "Can",
            "Be",
            "Included",
            "As",
            "A",
            "Child",
            "Of",
            "SlidingUpPanelLayout"
        );
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(
            getActivity(),
            android.R.layout.simple_list_item_1,
            data
        );

        setListAdapter(arrayAdapter);
    }
}
