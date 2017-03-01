package nikhita.com.databaseapp;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by meghana on 2/29/2016.
 */
public class MyDatabase extends SQLiteOpenHelper
{
    public static final String DB_NAME = "sathya";
    public static final int VERSION = 1;

    public MyDatabase(Context context)
    {
        super(context, DB_NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {
        try
        {
            String qry = "create table employee (e_id INTEGER,e_name TEXT,e_salary REAL)";
            db.execSQL(qry);
        }
        catch (Exception e)
        {
            Log.e("Table Creation", "" + e);
        }
    }

    public boolean insertData(int idno,String name,double sal)
    {
        try
        {
            String qry = "insert into employee values(" + idno + ",'" + name + "'," + sal + ")";
            SQLiteDatabase db = getWritableDatabase();
            db.execSQL(qry);
            return true;
        }
        catch (Exception e)
        {
            Log.e("Insertion Exception",""+e);
            return false;
        }
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)

    {

    }
}
