package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class phf implements zbe {
    public final /* synthetic */ int a;
    public final /* synthetic */ w8c b;

    public /* synthetic */ phf(w8c w8cVar, int i) {
        this.a = i;
        this.b = w8cVar;
    }

    @Override // defpackage.zbe
    public final Object p() {
        int i = this.a;
        w8c w8cVar = this.b;
        boolean z = false;
        switch (i) {
            case 0:
                w8cVar.getClass();
                int i2 = z42.e;
                szc szcVar = new szc(12, z);
                szcVar.c = null;
                szcVar.d = new ArrayList();
                szcVar.e = null;
                szcVar.b = "";
                HashMap map = new HashMap();
                SQLiteDatabase sQLiteDatabaseB = w8cVar.b();
                sQLiteDatabaseB.beginTransaction();
                try {
                    z42 z42Var = (z42) w8c.N(sQLiteDatabaseB.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new gi2(w8cVar, map, szcVar, 11));
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return z42Var;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            default:
                long jE = w8cVar.b.e() - w8cVar.d.d;
                SQLiteDatabase sQLiteDatabaseB2 = w8cVar.b();
                sQLiteDatabaseB2.beginTransaction();
                try {
                    String[] strArr = {String.valueOf(jE)};
                    Cursor cursorRawQuery = sQLiteDatabaseB2.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr);
                    while (cursorRawQuery.moveToNext()) {
                        try {
                            w8cVar.x(cursorRawQuery.getInt(0), ve8.MESSAGE_TOO_OLD, cursorRawQuery.getString(1));
                        } catch (Throwable th) {
                            cursorRawQuery.close();
                            throw th;
                        }
                    }
                    cursorRawQuery.close();
                    int iDelete = sQLiteDatabaseB2.delete("events", "timestamp_ms < ?", strArr);
                    sQLiteDatabaseB2.setTransactionSuccessful();
                    sQLiteDatabaseB2.endTransaction();
                    return Integer.valueOf(iDelete);
                } catch (Throwable th2) {
                    sQLiteDatabaseB2.endTransaction();
                    throw th2;
                }
        }
    }
}
