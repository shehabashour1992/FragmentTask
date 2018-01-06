package com.example.nh.fragmenttask;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
/*1- create activity with a fragment and override all of the fragments lfe cycle methods;
  2- create activity with two fragments
  -Fragment1 has a button
  -Fragment2 has TextView that displays the number of clicks of the button.

  3- create activty with two fragments
  -Fragent1 has a listView.(name job)
  -fragment2 has textview that displays teh details of the selected item from the
  listview(id name address job salary)
* */
