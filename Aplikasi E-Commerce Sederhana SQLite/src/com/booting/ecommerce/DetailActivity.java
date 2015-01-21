package com.booting.ecommerce;

import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

/**
 *  @author : Daniel FJP Napitupulu
 *  @Email  : if09033@gmail.com
 *  @Website: http://booting09.com
 */
public class DetailActivity extends DashBoardActivity {
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE); 
        setContentView(R.layout.detail);
        
        Bundle b = getIntent().getExtras(); 
    	String Image = b.getString("Image");
    	String Title = b.getString("Title");
    	String Keterangan = b.getString("Keterangan");
    	String Spec   = b.getString("Spec");
    	String Detail = b.getString("Detail");
    	
        setHeader(Title, true, true);
        
        TextView keterangan   = (TextView) findViewById(R.id.keterangan);
        TextView spec         = (TextView) findViewById(R.id.spec);
        TextView txtDetail    = (TextView) findViewById(R.id.detail);
        ImageView thumb_image = (ImageView) findViewById(R.id.list_image);
        
        txtDetail.setText(Detail);
        keterangan.setText("Harga: " + Keterangan);
        spec.setText("\nSpesifikasi:\n" + Spec);
        
        if (Image.equals("bb8530.png")) {
        	thumb_image.setImageResource(R.drawable.bb8530);
        } else if (Image.equals("samsung5360.png")) {
        	thumb_image.setImageResource(R.drawable.samsung5360);
        } else if (Image.equals("bb9220.png")) {
        	thumb_image.setImageResource(R.drawable.bb9220);
        } else if (Image.equals("st23i.png")) {
        	thumb_image.setImageResource(R.drawable.st23i);
        } else if (Image.equals("e445.png")) {
        	thumb_image.setImageResource(R.drawable.e445);
        } else if (Image.equals("n520.png")) {
        	thumb_image.setImageResource(R.drawable.n520);
        }
    }
}