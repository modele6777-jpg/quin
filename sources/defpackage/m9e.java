package defpackage;

import android.database.Cursor;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m9e extends n9e {
    public int[] d;
    public long[] e;
    public double[] f;
    public String[] g;
    public byte[][] v;
    public Cursor w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9e(f9e f9eVar, String str) {
        super(f9eVar, str);
        f9eVar.getClass();
        str.getClass();
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.v = new byte[0][];
    }

    public static void u(Cursor cursor, int i) {
        if (i < 0 || i >= cursor.getColumnCount()) {
            p8c.x(25, "column index out of range");
            throw null;
        }
    }

    @Override // defpackage.x8c
    public final void Q(int i, String str) {
        str.getClass();
        b();
        h(3, i);
        this.d[i] = 3;
        this.g[i] = str;
    }

    @Override // defpackage.x8c
    public final boolean R0() {
        b();
        l();
        Cursor cursor = this.w;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        qc0.p("Required value was null.");
        return false;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.c) {
            s();
            reset();
        }
        this.c = true;
    }

    @Override // defpackage.x8c
    public final byte[] getBlob(int i) {
        b();
        Cursor cursorX = x();
        u(cursorX, i);
        byte[] blob = cursorX.getBlob(i);
        blob.getClass();
        return blob;
    }

    @Override // defpackage.x8c
    public final int getColumnCount() {
        b();
        l();
        Cursor cursor = this.w;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // defpackage.x8c
    public final String getColumnName(int i) {
        b();
        l();
        Cursor cursor = this.w;
        if (cursor == null) {
            qc0.p("Required value was null.");
            return null;
        }
        u(cursor, i);
        String columnName = cursor.getColumnName(i);
        columnName.getClass();
        return columnName;
    }

    @Override // defpackage.x8c
    public final long getLong(int i) {
        b();
        Cursor cursorX = x();
        u(cursorX, i);
        return cursorX.getLong(i);
    }

    public final void h(int i, int i2) {
        int i3 = i2 + 1;
        int[] iArr = this.d;
        if (iArr.length < i3) {
            this.d = Arrays.copyOf(iArr, i3);
        }
        if (i == 1) {
            long[] jArr = this.e;
            if (jArr.length < i3) {
                this.e = Arrays.copyOf(jArr, i3);
                return;
            }
            return;
        }
        if (i == 2) {
            double[] dArr = this.f;
            if (dArr.length < i3) {
                this.f = Arrays.copyOf(dArr, i3);
                return;
            }
            return;
        }
        if (i == 3) {
            String[] strArr = this.g;
            if (strArr.length < i3) {
                this.g = (String[]) Arrays.copyOf(strArr, i3);
                return;
            }
            return;
        }
        if (i != 4) {
            return;
        }
        byte[][] bArr = this.v;
        if (bArr.length < i3) {
            this.v = (byte[][]) Arrays.copyOf(bArr, i3);
        }
    }

    @Override // defpackage.x8c
    public final boolean isNull(int i) {
        b();
        Cursor cursorX = x();
        u(cursorX, i);
        return cursorX.isNull(i);
    }

    public final void l() {
        if (this.w == null) {
            this.w = this.a.w(new g5b(9, this));
        }
    }

    @Override // defpackage.x8c
    public final void m(int i, long j) {
        b();
        h(1, i);
        this.d[i] = 1;
        this.e[i] = j;
    }

    @Override // defpackage.x8c
    public final void n(byte[] bArr, int i) {
        b();
        h(4, i);
        this.d[i] = 4;
        this.v[i] = bArr;
    }

    @Override // defpackage.x8c
    public final void o(int i) {
        b();
        h(5, i);
        this.d[i] = 5;
    }

    @Override // defpackage.n9e, defpackage.x8c
    public final void reset() {
        b();
        Cursor cursor = this.w;
        if (cursor != null) {
            cursor.close();
        }
        this.w = null;
    }

    @Override // defpackage.n9e, defpackage.x8c
    public final void s() {
        b();
        this.d = new int[0];
        this.e = new long[0];
        this.f = new double[0];
        this.g = new String[0];
        this.v = new byte[0][];
    }

    @Override // defpackage.x8c
    public final String t0(int i) {
        b();
        Cursor cursorX = x();
        u(cursorX, i);
        String string = cursorX.getString(i);
        string.getClass();
        return string;
    }

    public final Cursor x() {
        Cursor cursor = this.w;
        if (cursor != null) {
            return cursor;
        }
        p8c.x(21, "no row");
        throw null;
    }
}
