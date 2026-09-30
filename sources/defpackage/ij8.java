package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.io.File;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ij8 extends SQLiteOpenHelper {
    public final File a;
    public final boolean b;
    public final gj8 c;
    public final Context d;

    public ij8(Context context, String str, gj8 gj8Var) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 7);
        File databasePath = context.getDatabasePath(str);
        this.a = databasePath;
        this.b = !databasePath.exists();
        this.c = gj8Var;
        this.d = context;
    }

    public final void b() {
        close();
        this.a.delete();
    }

    public final void h(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(kj8.f);
        sQLiteDatabase.execSQL(kj8.j);
        Context context = this.d;
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        if (file.exists() && file.isDirectory()) {
            for (String str : file.list(new hj8(0))) {
                SharedPreferences sharedPreferences = context.getSharedPreferences(str.split("\\.xml")[0], 0);
                String string = sharedPreferences.getString("waiting_array", null);
                if (string != null) {
                    try {
                        JSONArray jSONArray = new JSONArray(string);
                        sQLiteDatabase.beginTransaction();
                        for (int i = 0; i < jSONArray.length(); i++) {
                            try {
                                try {
                                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                                    String string2 = jSONObject.getString("$token");
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("data", jSONObject.toString());
                                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                                    contentValues.put("automatic_data", Boolean.FALSE);
                                    contentValues.put("token", string2);
                                    sQLiteDatabase.insert(jj8.ANONYMOUS_PEOPLE.a(), null, contentValues);
                                } catch (JSONException unused) {
                                }
                            } catch (Throwable th) {
                                sQLiteDatabase.endTransaction();
                                throw th;
                            }
                        }
                        sQLiteDatabase.setTransactionSuccessful();
                        sQLiteDatabase.endTransaction();
                    } catch (JSONException unused2) {
                    }
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.remove("waiting_array");
                    editorEdit.apply();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        db6.f1("MixpanelAPI.Database", "Creating a new Mixpanel events DB");
        sQLiteDatabase.execSQL(kj8.c);
        sQLiteDatabase.execSQL(kj8.d);
        sQLiteDatabase.execSQL(kj8.e);
        sQLiteDatabase.execSQL(kj8.f);
        sQLiteDatabase.execSQL(kj8.g);
        sQLiteDatabase.execSQL(kj8.h);
        sQLiteDatabase.execSQL(kj8.i);
        sQLiteDatabase.execSQL(kj8.j);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        int i4;
        db6.f1("MixpanelAPI.Database", "Upgrading app, replacing Mixpanel events DB");
        jj8 jj8Var = jj8.PEOPLE;
        jj8 jj8Var2 = jj8.EVENTS;
        if (i < 4 || i2 > 7) {
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + jj8Var2.a());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + jj8Var.a());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + jj8.GROUPS.a());
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + jj8.ANONYMOUS_PEOPLE.a());
            sQLiteDatabase.execSQL(kj8.c);
            sQLiteDatabase.execSQL(kj8.d);
            sQLiteDatabase.execSQL(kj8.e);
            sQLiteDatabase.execSQL(kj8.f);
            sQLiteDatabase.execSQL(kj8.g);
            sQLiteDatabase.execSQL(kj8.h);
            sQLiteDatabase.execSQL(kj8.i);
            sQLiteDatabase.execSQL(kj8.j);
            return;
        }
        if (i == 4) {
            sQLiteDatabase.execSQL("ALTER TABLE " + jj8Var2.a() + " ADD COLUMN automatic_data INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE " + jj8Var.a() + " ADD COLUMN automatic_data INTEGER DEFAULT 0");
            sQLiteDatabase.execSQL("ALTER TABLE " + jj8Var2.a() + " ADD COLUMN token STRING NOT NULL DEFAULT ''");
            sQLiteDatabase.execSQL("ALTER TABLE " + jj8Var.a() + " ADD COLUMN token STRING NOT NULL DEFAULT ''");
            StringBuilder sb = new StringBuilder("SELECT * FROM ");
            sb.append(jj8Var2.a());
            Cursor cursorRawQuery = sQLiteDatabase.rawQuery(sb.toString(), null);
            while (cursorRawQuery.moveToNext()) {
                try {
                    String string = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data") >= 0 ? cursorRawQuery.getColumnIndex("data") : 1)).getJSONObject("properties").getString("token");
                    i4 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0);
                    try {
                        sQLiteDatabase.execSQL("UPDATE " + jj8Var2.a() + " SET token = '" + string + "' WHERE _id = " + i4);
                    } catch (JSONException unused) {
                        sQLiteDatabase.delete(jj8Var2.a(), "_id = " + i4, null);
                    }
                } catch (JSONException unused2) {
                    i4 = 0;
                }
            }
            Cursor cursorRawQuery2 = sQLiteDatabase.rawQuery("SELECT * FROM " + jj8Var.a(), null);
            while (cursorRawQuery2.moveToNext()) {
                try {
                    String string2 = new JSONObject(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("data") >= 0 ? cursorRawQuery2.getColumnIndex("data") : 1)).getString("$token");
                    i3 = cursorRawQuery2.getInt(cursorRawQuery2.getColumnIndex("_id") >= 0 ? cursorRawQuery2.getColumnIndex("_id") : 0);
                    try {
                        sQLiteDatabase.execSQL("UPDATE " + jj8Var.a() + " SET token = '" + string2 + "' WHERE _id = " + i3);
                    } catch (JSONException unused3) {
                        sQLiteDatabase.delete(jj8Var.a(), "_id = " + i3, null);
                    }
                } catch (JSONException unused4) {
                    i3 = 0;
                }
            }
            sQLiteDatabase.execSQL(kj8.e);
            sQLiteDatabase.execSQL(kj8.i);
            h(sQLiteDatabase);
        }
        if (i == 5) {
            sQLiteDatabase.execSQL(kj8.e);
            sQLiteDatabase.execSQL(kj8.i);
            h(sQLiteDatabase);
        }
        if (i == 6) {
            h(sQLiteDatabase);
        }
    }
}
