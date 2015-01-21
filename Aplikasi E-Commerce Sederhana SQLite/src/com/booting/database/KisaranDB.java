package com.booting.database;

import java.util.ArrayList;
import java.util.List;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *  @author : Daniel FJP Napitupulu
 *  @Email  : if09033@gmail.com
 *  @Website: http://booting09.com
 */
public class KisaranDB extends SQLiteOpenHelper {
	private static final String DATABASE_NAME = "ecommerseDB";
	public static final String ID	          = "_id";
	public static final String KISARAN        = "kisaran";
	
	public KisaranDB(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}
	
	public void createTable(SQLiteDatabase db) {
		db.execSQL("DROP TABLE IF EXISTS Kisaran");
		db.execSQL("CREATE TABLE if not exists Kisaran " +
				"(_id INTEGER PRIMARY KEY AUTOINCREMENT, " +
				"kisaran varchar(50));");
	}
	
	public void generateData(SQLiteDatabase db) {
		ContentValues cv = new ContentValues();
		cv.put(KISARAN, "100 ribu - 1 Juta");
		db.insert("Kisaran", KISARAN, cv);
		
		cv.put(KISARAN, "500 Ribu - 1 Juta");
		db.insert("Kisaran", KISARAN, cv);
		
		cv.put(KISARAN, "1 Juta - 1,5 Juta");
		db.insert("Kisaran", KISARAN, cv);
		
		cv.put(KISARAN, "1,5 Juta - 2 Juta");
		db.insert("Kisaran", KISARAN, cv);
		
		
		
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, 
		int newVersion) {
		//TODO Auto-generated method stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		//TODO Auto-generated method sub	
	}
	
	/**
     * Getting all labels
     * returns list of labels
     * */
    public List<String> getAllLabels(){
        List<String> labels = new ArrayList<String>();
 
        // Select All Query
        String selectQuery = "SELECT * FROM Kisaran";
 
        SQLiteDatabase db = this.getReadableDatabase();    
        Cursor cursor = db.rawQuery(selectQuery, null);
 
        // looping through all rows and adding to list
        if (cursor.moveToFirst()) {
            do {
                labels.add(cursor.getString(1));
            } while (cursor.moveToNext());
        }
 
        // returning lables
        return labels;
    }
}