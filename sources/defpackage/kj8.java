package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kj8 {
    public static final HashMap b = new HashMap();
    public static final String c;
    public static final String d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final String h;
    public static final String i;
    public static final String j;
    public final ij8 a;

    static {
        StringBuilder sb = new StringBuilder("CREATE TABLE ");
        jj8 jj8Var = jj8.EVENTS;
        sb.append(jj8Var.a());
        sb.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        c = sb.toString();
        StringBuilder sb2 = new StringBuilder("CREATE TABLE ");
        jj8 jj8Var2 = jj8.PEOPLE;
        sb2.append(jj8Var2.a());
        sb2.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        d = sb2.toString();
        StringBuilder sb3 = new StringBuilder("CREATE TABLE ");
        jj8 jj8Var3 = jj8.GROUPS;
        sb3.append(jj8Var3.a());
        sb3.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        e = sb3.toString();
        StringBuilder sb4 = new StringBuilder("CREATE TABLE ");
        jj8 jj8Var4 = jj8.ANONYMOUS_PEOPLE;
        sb4.append(jj8Var4.a());
        sb4.append(" (_id INTEGER PRIMARY KEY AUTOINCREMENT, data STRING NOT NULL, created_at INTEGER NOT NULL, automatic_data INTEGER DEFAULT 0, token STRING NOT NULL DEFAULT '')");
        f = sb4.toString();
        g = "CREATE INDEX IF NOT EXISTS time_idx ON " + jj8Var.a() + " (created_at);";
        h = "CREATE INDEX IF NOT EXISTS time_idx ON " + jj8Var2.a() + " (created_at);";
        i = "CREATE INDEX IF NOT EXISTS time_idx ON " + jj8Var3.a() + " (created_at);";
        j = "CREATE INDEX IF NOT EXISTS time_idx ON " + jj8Var4.a() + " (created_at);";
    }

    public kj8(Context context, gj8 gj8Var) {
        gj8Var.getClass();
        this.a = new ij8(context, "mixpanel", gj8Var);
    }

    public final boolean a() {
        ij8 ij8Var = this.a;
        gj8 gj8Var = ij8Var.c;
        File file = ij8Var.a;
        if (file.exists()) {
            return file.length() > Math.max(file.getUsableSpace(), (long) gj8Var.e) || file.length() > ((long) gj8Var.f);
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007b A[PHI: r10
  0x007b: PHI (r10v5 android.database.Cursor) = (r10v4 android.database.Cursor), (r10v7 android.database.Cursor) binds: [B:18:0x0079, B:27:0x0091] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v9 */
    public final int b(JSONObject jSONObject, String str, jj8 jj8Var) {
        Cursor cursorRawQuery;
        ij8 ij8Var = this.a;
        if (a()) {
            db6.F("MixpanelAPI.Database", "There is not enough space left on the device or the data was over the maximum size limit so it was discarded");
            return -2;
        }
        String strA = jj8Var.a();
        Cursor cursor = null;
        cursor = null;
        ?? r10 = 0;
        try {
            try {
                try {
                    SQLiteDatabase writableDatabase = ij8Var.getWritableDatabase();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("data", jSONObject.toString());
                    contentValues.put("created_at", Long.valueOf(System.currentTimeMillis()));
                    contentValues.put("token", str);
                    writableDatabase.insert(strA, null, contentValues);
                    cursorRawQuery = writableDatabase.rawQuery("SELECT COUNT(*) FROM " + strA + " WHERE token='" + str + "'", null);
                    try {
                        cursorRawQuery.moveToFirst();
                        int i2 = cursorRawQuery.getInt(0);
                        cursorRawQuery.close();
                        ij8Var.close();
                        return i2;
                    } catch (SQLiteException unused) {
                        db6.F("MixpanelAPI.Database", "Could not add Mixpanel data to table");
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        } else {
                            cursor = cursorRawQuery;
                        }
                        ij8Var.b();
                        if (cursor != null) {
                            cursor.close();
                        }
                        ij8Var.close();
                        return -1;
                    } catch (OutOfMemoryError unused2) {
                        cursor = cursorRawQuery;
                        db6.F("MixpanelAPI.Database", "Out of memory when adding Mixpanel data to table");
                        if (cursor != null) {
                            cursor.close();
                        }
                        ij8Var.close();
                        return -1;
                    }
                } catch (SQLiteException unused3) {
                    cursorRawQuery = null;
                } catch (OutOfMemoryError unused4) {
                }
            } catch (Throwable th) {
                th = th;
                if (r10 != 0) {
                    r10.close();
                }
                ij8Var.close();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            r10 = strA;
        }
    }

    public final void c(jj8 jj8Var, String str) {
        ij8 ij8Var = this.a;
        String strA = jj8Var.a();
        try {
            ij8Var.getWritableDatabase().delete(strA, "token = '" + str + "'", null);
        } catch (SQLiteException e2) {
            db6.G("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + strA + ". Re-initializing database.", e2);
            ij8Var.b();
        } finally {
            ij8Var.close();
        }
    }

    public final void d(long j2, jj8 jj8Var) {
        ij8 ij8Var = this.a;
        String strA = jj8Var.a();
        try {
            ij8Var.getWritableDatabase().delete(strA, "created_at <= " + j2, null);
        } catch (SQLiteException e2) {
            db6.G("MixpanelAPI.Database", "Could not clean timed-out Mixpanel records from " + strA + ". Re-initializing database.", e2);
            ij8Var.b();
        } finally {
            ij8Var.close();
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0110  */
    /* JADX WARN: Code duplicated, block: B:58:0x0115  */
    public final String[] e(jj8 jj8Var, String str) {
        Cursor cursorRawQuery;
        Cursor cursorRawQuery2;
        String strValueOf;
        String string;
        String string2;
        String strA = jj8Var.a();
        ij8 ij8Var = this.a;
        SQLiteDatabase readableDatabase = ij8Var.getReadableDatabase();
        Cursor cursor = null;
        try {
            String str2 = "SELECT * FROM " + strA + " WHERE token = '" + str + "' ";
            String str3 = "SELECT COUNT(*) FROM " + strA + " WHERE token = '" + str + "' ";
            cursorRawQuery2 = readableDatabase.rawQuery(str2.concat("ORDER BY created_at ASC LIMIT " + Integer.toString(ij8Var.c.n)), null);
            try {
                cursorRawQuery = readableDatabase.rawQuery(str3, null);
                try {
                    try {
                        cursorRawQuery.moveToFirst();
                        strValueOf = String.valueOf(cursorRawQuery.getInt(0));
                        try {
                            JSONArray jSONArray = new JSONArray();
                            string2 = null;
                            while (cursorRawQuery2.moveToNext()) {
                                if (cursorRawQuery2.isLast()) {
                                    string2 = cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("_id") >= 0 ? cursorRawQuery2.getColumnIndex("_id") : 0);
                                }
                                try {
                                    jSONArray.put(new JSONObject(cursorRawQuery2.getString(cursorRawQuery2.getColumnIndex("data") >= 0 ? cursorRawQuery2.getColumnIndex("data") : 1)));
                                } catch (JSONException unused) {
                                }
                            }
                            string = jSONArray.length() > 0 ? jSONArray.toString() : null;
                            ij8Var.close();
                            cursorRawQuery2.close();
                            cursorRawQuery.close();
                        } catch (SQLiteException e2) {
                            e = e2;
                            db6.G("MixpanelAPI.Database", "Could not pull records for Mixpanel out of database " + strA + ". Waiting to send.", e);
                            ij8Var.close();
                            if (cursorRawQuery2 != null) {
                                cursorRawQuery2.close();
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            string = null;
                            string2 = null;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor = cursorRawQuery2;
                        ij8Var.close();
                        if (cursor != null) {
                            cursor.close();
                        }
                        if (cursorRawQuery != null) {
                            cursorRawQuery.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    strValueOf = null;
                }
            } catch (SQLiteException e4) {
                e = e4;
                cursorRawQuery = null;
                strValueOf = null;
            } catch (Throwable th2) {
                th = th2;
                cursorRawQuery = null;
                cursor = cursorRawQuery2;
                ij8Var.close();
                if (cursor != null) {
                    cursor.close();
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursorRawQuery = null;
            cursorRawQuery2 = null;
            strValueOf = null;
        } catch (Throwable th3) {
            th = th3;
            cursorRawQuery = null;
            ij8Var.close();
            if (cursor != null) {
                cursor.close();
            }
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (string2 == null || string == null) {
            return null;
        }
        return new String[]{string2, string, strValueOf};
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0155  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public final int f(String str, String str2) {
        String strA;
        Cursor cursorRawQuery;
        jj8 jj8Var = jj8.ANONYMOUS_PEOPLE;
        ij8 ij8Var = this.a;
        if (a()) {
            db6.F("MixpanelAPI.Database", "There is not enough space left on the device or the data was over the maximum size limit so it was discarded");
            return -2;
        }
        ?? r6 = 0;
        String str3 = null;
        int i2 = -1;
        try {
            try {
                SQLiteDatabase writableDatabase = ij8Var.getWritableDatabase();
                StringBuilder sb = new StringBuilder("SELECT * FROM ");
                strA = jj8Var.a();
                sb.append(strA);
                sb.append(" WHERE token = '");
                sb.append(str);
                sb.append("'");
                cursorRawQuery = writableDatabase.rawQuery(sb.toString(), null);
                try {
                    writableDatabase.beginTransaction();
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            try {
                                try {
                                    ContentValues contentValues = new ContentValues();
                                    contentValues.put("created_at", Long.valueOf(cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("created_at") >= 0 ? cursorRawQuery.getColumnIndex("created_at") : 2)));
                                    contentValues.put("automatic_data", Integer.valueOf(cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("automatic_data") >= 0 ? cursorRawQuery.getColumnIndex("automatic_data") : 3)));
                                    contentValues.put("token", cursorRawQuery.getString(cursorRawQuery.getColumnIndex("token") >= 0 ? cursorRawQuery.getColumnIndex("token") : 4));
                                    JSONObject jSONObject = new JSONObject(cursorRawQuery.getString(cursorRawQuery.getColumnIndex("data") >= 0 ? cursorRawQuery.getColumnIndex("data") : 1));
                                    try {
                                        jSONObject.put("$distinct_id", str2);
                                        contentValues.put("data", jSONObject.toString());
                                        writableDatabase.insert(jj8.PEOPLE.a(), str3, contentValues);
                                        int i3 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("_id") >= 0 ? cursorRawQuery.getColumnIndex("_id") : 0);
                                        String strA2 = jj8Var.a();
                                        StringBuilder sb2 = new StringBuilder();
                                        try {
                                            sb2.append("_id = ");
                                            sb2.append(i3);
                                            strA = null;
                                            strA = null;
                                            try {
                                                try {
                                                    writableDatabase.delete(strA2, sb2.toString(), null);
                                                    i2++;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    writableDatabase.endTransaction();
                                                    throw th;
                                                }
                                            } catch (JSONException unused) {
                                            }
                                        } catch (JSONException unused2) {
                                            strA = null;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            writableDatabase.endTransaction();
                                            throw th;
                                        }
                                    } catch (JSONException unused3) {
                                        strA = str3;
                                    }
                                } catch (JSONException unused4) {
                                }
                                str3 = strA;
                            } catch (SQLiteException e2) {
                                e = e2;
                                db6.G("MixpanelAPI.Database", "Could not push anonymous updates records from " + jj8Var.a() + ". Re-initializing database.", e);
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                    r6 = strA;
                                } else {
                                    r6 = cursorRawQuery;
                                }
                                try {
                                    ij8Var.b();
                                    if (r6 != 0) {
                                        r6.close();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (r6 != 0) {
                                        r6.close();
                                    }
                                    ij8Var.close();
                                    throw th;
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    cursorRawQuery.close();
                } catch (SQLiteException e3) {
                    e = e3;
                    strA = null;
                }
            } catch (SQLiteException e4) {
                e = e4;
                strA = null;
                cursorRawQuery = null;
            } catch (Throwable th5) {
                th = th5;
                if (r6 != 0) {
                    r6.close();
                }
                ij8Var.close();
                throw th;
            }
            ij8Var.close();
            return i2;
        } catch (Throwable th6) {
            th = th6;
            r6 = " WHERE token = '";
            if (r6 != 0) {
                r6.close();
            }
            ij8Var.close();
            throw th;
        }
    }
}
