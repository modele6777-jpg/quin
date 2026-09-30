package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gz5 implements f9e {
    public static final String[] b = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] c = new String[0];
    public static final lw7 d;
    public static final lw7 e;
    public final SQLiteDatabase a;

    static {
        mz4 mz4Var = new mz4(27);
        z18 z18Var = z18.b;
        d = eb3.N(z18Var, mz4Var);
        e = eb3.N(z18Var, new mz4(28));
    }

    public gz5(SQLiteDatabase sQLiteDatabase) {
        this.a = sQLiteDatabase;
    }

    @Override // defpackage.f9e
    public final o9e C(String str) {
        str.getClass();
        SQLiteStatement sQLiteStatementCompileStatement = this.a.compileStatement(str);
        sQLiteStatementCompileStatement.getClass();
        return new nz5(sQLiteStatementCompileStatement);
    }

    @Override // defpackage.f9e
    public final boolean I0() {
        return this.a.isWriteAheadLoggingEnabled();
    }

    @Override // defpackage.f9e
    public final void J() throws IllegalAccessException, InvocationTargetException {
        lw7 lw7Var = e;
        if (((Method) lw7Var.getValue()) != null) {
            lw7 lw7Var2 = d;
            if (((Method) lw7Var2.getValue()) != null) {
                Method method = (Method) lw7Var.getValue();
                method.getClass();
                Method method2 = (Method) lw7Var2.getValue();
                method2.getClass();
                Object objInvoke = method2.invoke(this.a, null);
                if (objInvoke != null) {
                    method.invoke(objInvoke, 0, null, 0, null);
                    return;
                } else {
                    qc0.p("Required value was null.");
                    return;
                }
            }
        }
        t();
    }

    @Override // defpackage.f9e
    public final boolean S() {
        return this.a.enableWriteAheadLogging();
    }

    @Override // defpackage.f9e
    public final int S0(ContentValues contentValues, Object[] objArr) {
        int i = 0;
        if (contentValues.size() == 0) {
            qc0.j("Empty values");
            return 0;
        }
        int size = contentValues.size();
        int length = objArr.length + size;
        Object[] objArr2 = new Object[length];
        StringBuilder sb = new StringBuilder("UPDATE ");
        sb.append(b[3]);
        sb.append("WorkSpec SET ");
        int i2 = 0;
        for (String str : contentValues.keySet()) {
            sb.append(i2 > 0 ? "," : "");
            sb.append(str);
            objArr2[i2] = contentValues.get(str);
            sb.append("=?");
            i2++;
        }
        for (int i3 = size; i3 < length; i3++) {
            objArr2[i3] = objArr[i3 - size];
        }
        if (!TextUtils.isEmpty("last_enqueue_time = 0 AND interval_duration <> 0 ")) {
            sb.append(" WHERE last_enqueue_time = 0 AND interval_duration <> 0 ");
        }
        o9e o9eVarC = C(sb.toString());
        int length2 = objArr2.length;
        while (i < length2) {
            Object obj = objArr2[i];
            i++;
            if (obj == null) {
                o9eVarC.o(i);
            } else if (obj instanceof byte[]) {
                o9eVarC.n((byte[]) obj, i);
            } else if (obj instanceof Float) {
                o9eVarC.w0(((Number) obj).floatValue(), i);
            } else if (obj instanceof Double) {
                o9eVarC.w0(((Number) obj).doubleValue(), i);
            } else if (obj instanceof Long) {
                o9eVarC.m(i, ((Number) obj).longValue());
            } else if (obj instanceof Integer) {
                o9eVarC.m(i, ((Number) obj).intValue());
            } else if (obj instanceof Short) {
                o9eVarC.m(i, ((Number) obj).shortValue());
            } else if (obj instanceof Byte) {
                o9eVarC.m(i, ((Number) obj).byteValue());
            } else if (obj instanceof String) {
                o9eVarC.A(i, (String) obj);
            } else {
                if (!(obj instanceof Boolean)) {
                    throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: Null, ByteArray, Float, Double, Long, Int, Short, Byte, String");
                }
                o9eVarC.m(i, ((Boolean) obj).booleanValue() ? 1L : 0L);
            }
        }
        return ((nz5) o9eVarC).b.executeUpdateDelete();
    }

    @Override // defpackage.f9e
    public final void V() {
        this.a.setTransactionSuccessful();
    }

    @Override // defpackage.f9e
    public final void X(String str, Object[] objArr) {
        str.getClass();
        objArr.getClass();
        this.a.execSQL(str, objArr);
    }

    @Override // defpackage.f9e
    public final void Z() {
        this.a.beginTransactionNonExclusive();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.f9e
    public final boolean isOpen() {
        return this.a.isOpen();
    }

    @Override // defpackage.f9e
    public final Cursor l0(String str) {
        str.getClass();
        str.getClass();
        e4b e4bVar = new e4b();
        e4bVar.a = str;
        return w(e4bVar);
    }

    @Override // defpackage.f9e
    public final boolean q() {
        return this.a.inTransaction();
    }

    @Override // defpackage.f9e
    public final void q0() {
        this.a.endTransaction();
    }

    @Override // defpackage.f9e
    public final void t() {
        this.a.beginTransaction();
    }

    @Override // defpackage.f9e
    public final Cursor w(j9e j9eVar) {
        j9eVar.getClass();
        final wt wtVar = new wt(4, j9eVar);
        Cursor cursorRawQueryWithFactory = this.a.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: fz5
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) wtVar.t(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, j9eVar.f(), c, null);
        cursorRawQueryWithFactory.getClass();
        return cursorRawQueryWithFactory;
    }

    @Override // defpackage.f9e
    public final void y() {
        this.a.disableWriteAheadLogging();
    }

    @Override // defpackage.f9e
    public final void z(String str) {
        str.getClass();
        this.a.execSQL(str);
    }
}
