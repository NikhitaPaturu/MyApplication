package nikhita.com.sampledb;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.util.Log;

/**
 * Created by meghana on 3/30/2016.
 */
public class MyDatabase extends SQLiteOpenHelper {
    public static final String DB_NAME="Sathya";
    public static final int VERSION=1;

    public MyDatabase(Context context)
    {
        super(context,DB_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
        String  qry="create table employee(eid INTEGER,ename TEXT,sal REAL)";
        db.execSQL(qry);
    }
    catch (Exception e)
    {
        Log.e("table not created",""+e);
    }
    }

    public boolean insert(int id, String name, double sal)
    {
        try {
            SQLiteDatabase db=getWritableDatabase();
            String qry = "insert into employee values(" + id + ",'" + name + "'," + sal + ") ";
            db.execSQL(qry);
        } catch (Exception e) {
            Log.e("insert data", " " + e);
        }
        return  true;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
