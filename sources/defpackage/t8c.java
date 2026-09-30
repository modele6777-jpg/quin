package defpackage;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import io.sentry.instrumentation.file.a;
import io.sentry.instrumentation.file.d;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t8c implements u8c, a {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t8c(long j, qq0 qq0Var) {
        this.a = j;
        this.b = qq0Var;
    }

    @Override // defpackage.u8c
    public Object apply(Object obj) {
        qq0 qq0Var = (qq0) this.b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.a));
        String str = qq0Var.a;
        lua luaVar = qq0Var.c;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(mua.a(luaVar))}) < 1) {
            contentValues.put("backend_name", str);
            contentValues.put("priority", Integer.valueOf(mua.a(luaVar)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override // io.sentry.instrumentation.file.a
    public Object call() {
        d dVar = (d) this.b;
        return Long.valueOf(dVar.a.skip(this.a));
    }

    public /* synthetic */ t8c(d dVar, long j) {
        this.b = dVar;
        this.a = j;
    }
}
