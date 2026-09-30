package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Pair;
import io.sentry.android.core.b1;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kz5 extends SQLiteOpenHelper {
    public static final /* synthetic */ int v = 0;
    public final Context a;
    public final kb6 b;
    public final sug c;
    public final boolean d;
    public boolean e;
    public final lva f;
    public boolean g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kz5(Context context, String str, final kb6 kb6Var, final sug sugVar, boolean z) {
        super(context, str, null, sugVar.b, new DatabaseErrorHandler() { // from class: hz5
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = kz5.v;
                sQLiteDatabase.getClass();
                kb6 kb6Var2 = kb6Var;
                gz5 gz5Var = (gz5) kb6Var2.b;
                if (gz5Var == null || !gz5Var.a.equals(sQLiteDatabase)) {
                    gz5Var = new gz5(sQLiteDatabase);
                    kb6Var2.b = gz5Var;
                }
                SQLiteDatabase sQLiteDatabase2 = gz5Var.a;
                sugVar.getClass();
                b1.d("SupportSQLite", "Corruption reported by sqlite on database: " + gz5Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        sug.i(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        gz5Var.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            obj.getClass();
                            sug.i((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            sug.i(path2);
                        }
                    }
                }
            }
        });
        sugVar.getClass();
        this.a = context;
        this.b = kb6Var;
        this.c = sugVar;
        this.d = z;
        this.f = new lva(str == null ? ib8.i() : str, context.getCacheDir(), false);
    }

    public final f9e b(boolean z) {
        lva lvaVar = this.f;
        try {
            lvaVar.a((this.g || getDatabaseName() == null) ? false : true);
            this.e = false;
            SQLiteDatabase sQLiteDatabaseL = l(z);
            if (!this.e) {
                return h(sQLiteDatabaseL);
            }
            close();
            return b(z);
        } finally {
            lvaVar.b();
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        lva lvaVar = this.f;
        try {
            lvaVar.a(lvaVar.a);
            super.close();
            this.b.b = null;
            this.g = false;
        } finally {
            lvaVar.b();
        }
    }

    public final gz5 h(SQLiteDatabase sQLiteDatabase) {
        kb6 kb6Var = this.b;
        gz5 gz5Var = (gz5) kb6Var.b;
        if (gz5Var != null && gz5Var.a.equals(sQLiteDatabase)) {
            return gz5Var;
        }
        gz5 gz5Var2 = new gz5(sQLiteDatabase);
        kb6Var.b = gz5Var2;
        return gz5Var2;
    }

    public final SQLiteDatabase l(boolean z) throws Throwable {
        SQLiteDatabase readableDatabase;
        SQLiteDatabase readableDatabase2;
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.g;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                b1.l("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            if (z) {
                SQLiteDatabase writableDatabase = getWritableDatabase();
                writableDatabase.getClass();
                return writableDatabase;
            }
            SQLiteDatabase readableDatabase3 = getReadableDatabase();
            readableDatabase3.getClass();
            return readableDatabase3;
        } catch (Throwable unused) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                if (z) {
                    readableDatabase2 = getWritableDatabase();
                    readableDatabase2.getClass();
                } else {
                    readableDatabase2 = getReadableDatabase();
                    readableDatabase2.getClass();
                }
                return readableDatabase2;
            } catch (Throwable th) {
                th = th;
                if (th instanceof iz5) {
                    iz5 iz5Var = (iz5) th;
                    Throwable cause = iz5Var.getCause();
                    int iOrdinal = iz5Var.getCallbackName().ordinal();
                    if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3) {
                        throw cause;
                    }
                    if (iOrdinal != 4) {
                        ap.c();
                        return null;
                    }
                    if (!(cause instanceof SQLiteException)) {
                        throw cause;
                    }
                    th = cause;
                }
                if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    if (z) {
                        readableDatabase = getWritableDatabase();
                        readableDatabase.getClass();
                    } else {
                        readableDatabase = getReadableDatabase();
                        readableDatabase.getClass();
                    }
                    return readableDatabase;
                } catch (iz5 e) {
                    throw e.getCause();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        boolean z = this.e;
        sug sugVar = this.c;
        if (!z && sugVar.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            h(sQLiteDatabase);
            sugVar.getClass();
        } catch (Throwable th) {
            throw new iz5(jz5.a, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        try {
            ((ld5) this.c.c).q(new e9e(h(sQLiteDatabase)));
        } catch (Throwable th) {
            throw new iz5(jz5.b, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.n(h(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new iz5(jz5.d, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (!this.e) {
            try {
                sug sugVar = this.c;
                gz5 gz5VarH = h(sQLiteDatabase);
                ld5 ld5Var = (ld5) sugVar.c;
                ld5Var.s(new e9e(gz5VarH));
                ld5Var.i = gz5VarH;
            } catch (Throwable th) {
                throw new iz5(jz5.e, th);
            }
        }
        this.g = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        this.e = true;
        try {
            this.c.n(h(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new iz5(jz5.c, th);
        }
    }
}
