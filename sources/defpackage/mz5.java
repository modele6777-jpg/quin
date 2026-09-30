package defpackage;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class mz5 implements i9e {
    public final SQLiteProgram a;

    public mz5(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.i9e
    public final void A(int i, String str) {
        str.getClass();
        this.a.bindString(i, str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.i9e
    public final void m(int i, long j) {
        this.a.bindLong(i, j);
    }

    @Override // defpackage.i9e
    public final void n(byte[] bArr, int i) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.i9e
    public final void o(int i) {
        this.a.bindNull(i);
    }

    @Override // defpackage.i9e
    public final void s() {
        this.a.clearBindings();
    }

    @Override // defpackage.i9e
    public final void w0(double d, int i) {
        this.a.bindDouble(i, d);
    }
}
