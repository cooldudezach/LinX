package com.mgdllc.linx.linx;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {
    ListView list;
    String[] web = {
            "MGD @ Facebook",
            "MGD Google Apps",
            "MGD-LLC.com",
            "Unleashed PrePaids",
            "Unleashed Facebook",
            "ROMz",
            "About"
    } ;

    Integer[] imageId = {
            R.drawable.mgdllc_icon,
            R.drawable.mgdllc_icon,
            R.drawable.mgdllc_icon,
            R.drawable.upp_icon,
            R.drawable.upp_fb_icon,
            R.drawable.romz_icon,
            R.drawable.ic_menu_about
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CustomList adapter = new
                CustomList(MainActivity.this, web, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                Toast.makeText(MainActivity.this, "You Clicked at " +web[+ position], Toast.LENGTH_SHORT).show();
            }
        });
    }
}