package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w8c implements Closeable {
    public static final jv4 f = new jv4("proto");
    public final jfc a;
    public final j52 b;
    public final j52 c;
    public final yo0 d;
    public final h1b e;

    public w8c(j52 j52Var, j52 j52Var2, yo0 yo0Var, jfc jfcVar, h1b h1bVar) {
        this.a = jfcVar;
        this.b = j52Var;
        this.c = j52Var2;
        this.d = yo0Var;
        this.e = h1bVar;
    }

    public static String G(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((tp0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object N(Cursor cursor, u8c u8cVar) {
        try {
            return u8cVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long h(SQLiteDatabase sQLiteDatabase, qq0 qq0Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(qq0Var.a, String.valueOf(mua.a(qq0Var.c))));
        byte[] bArr = qq0Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final Object E(zbe zbeVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        j52 j52Var = this.c;
        long jE = j52Var.e();
        while (true) {
            try {
                sQLiteDatabaseB.beginTransaction();
                try {
                    Object objP = zbeVar.p();
                    sQLiteDatabaseB.setTransactionSuccessful();
                    return objP;
                } finally {
                    sQLiteDatabaseB.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (j52Var.e() >= ((long) this.d.c) + jE) {
                    throw new ybe("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final SQLiteDatabase b() {
        jfc jfcVar = this.a;
        Objects.requireNonNull(jfcVar);
        j52 j52Var = this.c;
        long jE = j52Var.e();
        while (true) {
            try {
                return jfcVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (j52Var.e() >= ((long) this.d.c) + jE) {
                    throw new ybe("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final Object l(u8c u8cVar) {
        SQLiteDatabase sQLiteDatabaseB = b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Object objApply = u8cVar.apply(sQLiteDatabaseB);
            sQLiteDatabaseB.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    public final ArrayList u(SQLiteDatabase sQLiteDatabase, qq0 qq0Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lH = h(sQLiteDatabase, qq0Var);
        if (lH == null) {
            return arrayList;
        }
        N(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lH.toString()}, null, null, null, String.valueOf(i)), new gi2(this, arrayList, qq0Var, 9));
        return arrayList;
    }

    public final void x(long j, ve8 ve8Var, String str) {
        l(new zh2(j, str, ve8Var));
    }
}
