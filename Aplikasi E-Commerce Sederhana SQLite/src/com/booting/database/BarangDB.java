package com.booting.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 *  @author : Daniel FJP Napitupulu
 *  @Email  : if09033@gmail.com
 *  @Website: http://booting09.com
 */
public class BarangDB extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "ecommerseDB";
	public static final String KATEGORI   = "kategori";
	public static final String KISARAN    = "kisaran";
	public static final String NAMA       = "nama";
	public static final String IMAGE      = "image";
	public static final String KETERANGAN = "keterangan";
	public static final String SPEC       = "spec";
	public static final String DETAIL     = "detail";
	
	public BarangDB(Context context) {
		super(context, DATABASE_NAME, null, 1);
	}
	
	public void createTable(SQLiteDatabase db) {
		db.execSQL("DROP TABLE IF EXISTS Barang");
		db.execSQL("CREATE TABLE if not exists Barang " +
				"(id INTEGER PRIMARY KEY AUTOINCREMENT, " +
				"kategori varchar(50), kisaran varchar(50), " +
				"nama varchar(50), image varchar(50), " +
				"keterangan TEXT, spec TEXT, detail TEXT);");
	}
	
	public void generateData(SQLiteDatabase db) {
		ContentValues cv = new ContentValues();
		cv.put(KATEGORI, "Smartphone");
		cv.put(KISARAN, "500 Ribu - 1 Juta");
		cv.put(NAMA, "Blackberry CDMA 8530 - Hitam");
		cv.put(IMAGE, "bb8530.png");
		cv.put(KETERANGAN, "RP 719.000\nSebelum " +
				"RP 1.999.999, Diskon 64%");
		cv.put(SPEC, "- 2.5 Layar TFT\n- Blackberry " +
				"OS5\n- 2 MP Kamera\n\n");
		cv.put(DETAIL, "Detail Produk :\n" +
				"Smartfren membundling Blackberry 8530 " +
				"atau Aries sebagai perangkat handset " +
				"keluaran RIM mobile yang menggunakan " +
				"sistem operasi Blackberry OS dengan jaringan " +
				"CDMA. Smartphone ini dilengkapi " +
				"dengan beberapa aplikasi untuk mendukung " +
				"bisnis Anda dan berfungsi sangat baik seperti " +
				"fasilitas untuk memuat dan membaca email yang " +
				"masuk secara langsung (Push Mail) dan tombol " +
				"QWERTY yang tertata/terpisah-pisah dengan baik " +
				"untuk kemudahan dalam pengetikan.");
		db.insert("Barang", KATEGORI, cv);
		
		cv.put(KATEGORI, "Smartphone");
		cv.put(KISARAN, "500 Ribu - 1 Juta");
		cv.put(NAMA, "Samsung Galaxy Y S5360 - 160 MB");
		cv.put(IMAGE, "samsung5360.png");
		cv.put(KETERANGAN, "RP 899.900\nSebelum " +
				"RP 1.099.000, Diskon 18%");
		cv.put(SPEC, "- 3 TFT Touch Screen\n- Android " +
				"OS 2.3\n- 2 MP Kamera\n\n");
		cv.put(DETAIL, "Detail Produk :\n" +
				"Samsung Galaxy Y, Android smartphone " +
				"bagi Anda yang muda dan dinamis dengan " +
				"fungsi yang menakjubkan namun tetap " +
				"ringan, kompak dan stylish. Dilengkapi " +
				"dengan fitur Social Hub, Quickoffice, " +
				"Wi-Fi dan tampilan antar muka yang menarik, " +
				"handphone ini lengkap akan fitur yang " +
				"mendukung mobilitas Anda.");
		db.insert("Barang", KATEGORI, cv);
		
		cv.put(KATEGORI, "Smartphone");
		cv.put(KISARAN, "1 Juta - 1,5 Juta");
		cv.put(NAMA, "Blackberry Davis 9220 - Hitam");
		cv.put(IMAGE, "bb9220.png");
		cv.put(KETERANGAN, "RP 1.449.000\nSebelum " +
				"RP 1.799.000, Diskon 19%");
		cv.put(SPEC, "- 2.44 Layar TFT\n- Blackberry " +
				"OS 7.1\n- 2 MP Kamera\n\n");
		cv.put(DETAIL, "Detail Produk :\n" +
				"BlackBerry Curve 9220 Davis merupakan " +
				"handphone terbaru dari Blackberry berdesain " +
				"elegan dengan keyboard QWERTY yang ergonomis. " +
				"Dengan fitur yang dapat memenuhi kebutuhan " +
				"komunikasi Anda setiap hari. Keluaran terbaru " +
				"dari seri Curve ini memberikan pengetahuan " +
				"yang berlebih dari adanya fitur FM radio ini.");
		db.insert("Barang", KATEGORI, cv);
		
		cv.put(KATEGORI, "Smartphone");
		cv.put(KISARAN, "1,5 Juta - 2 Juta");
		cv.put(NAMA, "Sony Xperia Miro ST23i - 4 GB - Hitam");
		cv.put(IMAGE, "st23i.png");
		cv.put(KETERANGAN, "RP 1.900.000\nSebelum " +
				"RP 1.999.000, Diskon 5%");
		cv.put(SPEC, "- 3.5 TFT Touch Screen\n- Android " +
				"4.0\n- 5 MP Kamera\n\n");
		cv.put(DETAIL, "Detail Produk :\n" +
				"Sony kembali menghadirkan serian Xperia dengan " +
				"berbagai fitur yang menarik, Sony Xperia Miro " +
				"ST23i. Smartphone ini telah didukung sistem " +
				"operasi terbaru Android 4.0 Ice Cream Sandwich. " +
				"Smartphone ini dikemas dengan fitur multimedia " +
				"yang lengkap, kamera beresolusi 5 megapiksel " +
				"serta kamera sekunder 0.3 megapiksel. " +
				"Anda dapat langsung berbagi foto karena " +
				"Sony Xperia Miro telah terintegrasi dengan " +
				"Facebook. Dengan desain yang stylish dan " +
				"berbagai pilihan warna yang menarik, " +
				"Anda dapat tetap tampil eksis sekaligus stylish.");
		db.insert("Barang", KATEGORI, cv);
		
		cv.put(KATEGORI, "Smartphone");
		cv.put(KISARAN, "1,5 Juta - 2 Juta");
		cv.put(NAMA, "LG Optimus L4 II Dual E445 – 4 GB – Hitam");
		cv.put(IMAGE, "e445.png");
		cv.put(KETERANGAN, "RP 1.539.000\nSebelum " +
				"RP 1.699.000, Diskon 9%");
		cv.put(SPEC, "- 3.8 IPS Touchscreen\n- Android " +
				"OS 4.1 Jelly Bean\n- 3.15 MP Camera\n\n");
		cv.put(DETAIL, "Detail Produk :\n" +
				"LG kembali menghadirkan seri Optimus terbaru " +
				"untuk entry-level yaitu LG Optimus L4 II " +
				"Dual E445. Sesuai dengan namanya, smartphone " +
				"ini hampir sama dengan LG Optimus L4 II " +
				"namun untuk seri E445 dikemas dengan sistem " +
				"Dual GSM Stand-by memberikan " +
				"Anda fleksibilitas bagi Anda yang memiliki dua " +
				"nomor GSM yang berbeda. Tampil dengan layar IPS " +
				"berukuran 3.8, smartphone ini telah didukung " +
				"Android 4.1 Jelly Bean. Tak hanya itu, berbagai " +
				"fitur hiburan telah dilengkapi untuk menemani " +
				"aktivitas Anda.");
		db.insert("Barang", KATEGORI, cv);
		
		cv.put(KATEGORI, "Smartphone");
		cv.put(KISARAN, "1,5 Juta - 2 Juta");
		cv.put(NAMA, "Nokia Lumia 520 - 8 GB - Putih");
		cv.put(IMAGE, "n520.png");
		cv.put(KETERANGAN, "RP 1.599.000\nSebelum " +
				"RP 1.850.000, Diskon 14%");
		cv.put(SPEC, "- 4 IPS Touchscreen\n- Windows " +
				"Phone 8\n- 5 MP Camera\n\n");
		cv.put(DETAIL, "Detail Produk :\n" + 
				"Nokia merilis smartphone jajaran Windows " +
				"Phone 8 dengan harga yang paling terjangkau, " +
				"Nokia Lumia 520. Hadir dengan ukuran layar 4 " +
				"berteknologi IPS kapasitif membuatnya nyaman " +
				"untuk menikmati berbagai hiburan multimedia. " +
				"Untuk kinerjanya, prosesor Dual Core siap " +
				"memberikan Anda kemudahan dalam mengerjakan " +
				"multi aplikasi. Dengan kamera beresolusi 5 MP " +
				"dan video 720p, bidik berbagai momen favorit " +
				"di sekitar. Dengan desain ala Lumia dan " +
				"berbagai pilihan warna menarik, smartphone " +
				"ini dapat menjadi pilihan bagi Anda yang " +
				"ingin merasakan pengalaman baru Windows " +
				"phone dengan harga yang terjangkau.");
		db.insert("Barang", KATEGORI, cv);
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		//TODO Auto-generated method stub
	}
	
	@Override
	public void onCreate(SQLiteDatabase db) {
		//TODO Auto-generated method sub		
	}
}