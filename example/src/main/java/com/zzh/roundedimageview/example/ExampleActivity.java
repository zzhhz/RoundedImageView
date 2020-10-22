package com.zzh.roundedimageview.example;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class ExampleActivity extends AppCompatActivity
    implements AdapterView.OnItemSelectedListener {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);

    setContentView(R.layout.example_activity);
    Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
    Spinner navSpinner = (Spinner) findViewById(R.id.spinner_nav);

    navSpinner.setAdapter(ArrayAdapter.createFromResource(
        navSpinner.getContext(),
        R.array.action_list,
        android.R.layout.simple_spinner_dropdown_item));

    navSpinner.setOnItemSelectedListener(this);

    if (savedInstanceState == null) {
      navSpinner.setSelection(0);
    }
  }

  @Override public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
    Fragment newFragment;
    switch (position) {
      default:
      case 0:
        // bitmap
        newFragment = RoundedFragment.getInstance(RoundedFragment.ExampleType.DEFAULT);
        break;
      case 1:
        // oval
        newFragment = RoundedFragment.getInstance(RoundedFragment.ExampleType.OVAL);
        break;
      case 2:
        // select
        newFragment = RoundedFragment.getInstance(RoundedFragment.ExampleType.SELECT_CORNERS);
        break;
      case 3:
        // picasso
        newFragment = new PicassoFragment();
        break;
      case 4:
        // color
        newFragment = new ColorFragment();
        break;
      case 5:
        // background
        newFragment = RoundedFragment.getInstance(RoundedFragment.ExampleType.BACKGROUND);
        break;
      case 6:
        // background
        newFragment = new GlideFragment();
        break;
    }

    getSupportFragmentManager().beginTransaction()
        .replace(R.id.fragment_container, newFragment)
        .commit();
  }

  @Override public void onNothingSelected(AdapterView<?> parent) { }
}
