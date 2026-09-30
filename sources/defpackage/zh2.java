package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class zh2 implements yn2, u8c, zbe {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zh2(long j, Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
        this.a = j;
    }

    @Override // defpackage.u8c
    public Object apply(Object obj) {
        String str = (String) this.b;
        ve8 ve8Var = (ve8) this.c;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(ve8Var.a())});
        try {
            boolean z = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j = this.a;
            if (z) {
                sQLiteDatabase.execSQL(kv2.m("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?", j), new String[]{str, Integer.toString(ve8Var.a())});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(ve8Var.a()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th) {
            cursorRawQuery.close();
            throw th;
        }
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        return ((di2) this.b).e(task, this.a, (HashMap) this.c);
    }

    @Override // defpackage.zbe
    public Object p() {
        lp0 lp0Var = (lp0) this.b;
        qq0 qq0Var = (qq0) this.c;
        w8c w8cVar = (w8c) lp0Var.d;
        long jE = ((j52) lp0Var.v).e() + this.a;
        w8cVar.getClass();
        w8cVar.l(new t8c(jE, qq0Var));
        return null;
    }

    public /* synthetic */ zh2(di2 di2Var, long j, HashMap map) {
        this.b = di2Var;
        this.a = j;
        this.c = map;
    }
}
