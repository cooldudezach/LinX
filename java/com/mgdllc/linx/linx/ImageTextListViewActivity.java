package com.mgdllc.linx.linx;

import java.util.ArrayList;
import java.util.List;
import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;

public class ImageTextListViewActivity extends Activity implements
        OnItemClickListener {

    public static final String[] titles = new String[] {
            "MGD Facebook Page",
            "MGD Play Store",
            "MGD-LLC.com",
            "UnleashedPrepaids",
            "Unleashed @ Facebook",
            "ROMz",
            "PlayfulGod's Play Store",
            "Degenerate Droid Development"
    };

    public static final String[] descriptions = new String[] {
            "MGDLLC on Facebook.",
            "MGDLLC on the Google Play Store.",
            "Mobile Generation Development.",
            "Home for Unleashed Prepaids.",
            "UPP's Facebook page.",
            "Your link to ROMz",
            "PlayfulGod Play Store",
            "DDD Google Play Store"
    };

    public static final Integer[] images = {
            R.drawable.mgdllc_icon,
            R.drawable.mgdllc_icon,
            R.drawable.mgdllc_icon,
            R.drawable.mgdllc_fb_icon,
            R.drawable.upp_icon,
            R.drawable.upp_fb_icon,
            R.drawable.romz_icon,
            R.drawable.ic_menu_about
    };

    ListView listView;
    List<RowItem> rowItems;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        rowItems = new ArrayList<RowItem>();
        for (int i = 0; i < titles.length; i++) {
            RowItem item = new RowItem(images[i], titles[i], descriptions[i]);
            rowItems.add(item);
        }

        listView = (ListView) findViewById(R.id.list);
        CustomListViewAdapter adapter = new CustomListViewAdapter(this,
                R.layout.list_item, rowItems);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position,
                            long id) {
        Toast toast = Toast.makeText(getApplicationContext(),
                "Item " + (position + 1) + ": " + rowItems.get(position),
                Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM| Gravity.CENTER_HORIZONTAL, 0, 0);
        toast.show();

    }
}
