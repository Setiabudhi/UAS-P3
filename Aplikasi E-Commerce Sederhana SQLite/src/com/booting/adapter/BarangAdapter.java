package com.booting.adapter;

import java.util.ArrayList;
import java.util.HashMap;
import com.booting.ecommerce.MainActivity;
import com.booting.ecommerce.R;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *  @author : Daniel FJP Napitupulu
 *  @Email  : if09033@gmail.com
 *  @Website: http://booting09.com
 */
public class BarangAdapter extends BaseAdapter {
    private Activity activity;
    private ArrayList<HashMap<String, String>> data;
    private static LayoutInflater inflater=null;
    HashMap<String, String> tipss;
    
    public BarangAdapter(Activity a, 
    	ArrayList<HashMap<String, String>> d) {
        activity = a;
        data=d;
        inflater = (LayoutInflater)activity.
        getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public int getCount() {
        return data.size();
    }

    public Object getItem(int position) {
        return position;
    }

    public long getItemId(int position) {
        return position;
    }
    
    public View getView(int position, 
    	View convertView, ViewGroup parent) {
        View vi=convertView;
        if(convertView==null)
            vi = inflater.inflate(R.layout.list_row, null);
 
        TextView id	          = (TextView)vi.findViewById(R.id.id);
        TextView title        = (TextView)vi.findViewById(R.id.title); 
        TextView keterangan   = (TextView)vi.findViewById(R.id.keterangan);
        TextView spec         = (TextView)vi.findViewById(R.id.spec);
        TextView txtImage     = (TextView)vi.findViewById(R.id.txtImage);
        TextView txtDetail    = (TextView)vi.findViewById(R.id.detail);
        ImageView thumb_image =(ImageView)vi.findViewById(R.id.list_image); // thumb image
        
        tipss = new HashMap<String, String>();
        tipss = data.get(position);
      
        // TODO Setting all values in list view
        id.setText(tipss.get(MainActivity.AR_ID));
        title.setText(tipss.get(MainActivity.AR_NAMA));
        keterangan.setText(tipss.get(MainActivity.AR_KETERANGAN));
        spec.setText(tipss.get(MainActivity.AR_SPEC));
        txtImage.setText(tipss.get(MainActivity.AR_IMAGE));
        txtDetail.setText(tipss.get(MainActivity.AR_DETAIL));
        
        String image = txtImage.getText().toString();
        if (image.equals("bb8530.png")) {
        	thumb_image.setImageResource(R.drawable.bb8530);
        } else if (image.equals("samsung5360.png")) {
        	thumb_image.setImageResource(R.drawable.samsung5360);
        } else if (image.equals("bb9220.png")) {
        	thumb_image.setImageResource(R.drawable.bb9220);
        } else if (image.equals("st23i.png")) {
        	thumb_image.setImageResource(R.drawable.st23i);
        } else if (image.equals("e445.png")) {
        	thumb_image.setImageResource(R.drawable.e445);
        } else if (image.equals("n520.png")) {
        	thumb_image.setImageResource(R.drawable.n520);
        } 
        
        return vi;
    } 
    
 // TODO Clear data on list view
    public void clearList() {
        data.clear();
        notifyDataSetChanged();
    }
}