package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nle implements ac3 {
    public final ac3 a;
    public final e81 b;
    public boolean c;
    public long d;

    public nle(ac3 ac3Var, e81 e81Var) {
        ac3Var.getClass();
        this.a = ac3Var;
        e81Var.getClass();
        this.b = e81Var;
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) throws d81 {
        long j;
        long j2;
        dc3 dc3Var2 = dc3Var;
        long jB = this.a.b(dc3Var2);
        this.d = jB;
        if (jB == 0) {
            return 0L;
        }
        long j3 = dc3Var2.g;
        if (j3 != -1 || jB == -1) {
            j = 0;
        } else {
            if (j3 == jB) {
                j2 = 0;
            } else {
                j2 = 0;
                dc3Var2 = new dc3(dc3Var2.a, dc3Var2.b, dc3Var2.c, dc3Var2.d, dc3Var2.e, dc3Var2.f, jB, dc3Var2.h, dc3Var2.i);
            }
            j = j2;
        }
        int i = dc3Var2.i;
        this.c = true;
        e81 e81Var = this.b;
        e81Var.getClass();
        dc3Var2.h.getClass();
        if (dc3Var2.g == -1 && (i & 2) == 2) {
            e81Var.c = null;
        } else {
            e81Var.c = dc3Var2;
            e81Var.d = (i & 4) == 4 ? e81Var.b : Long.MAX_VALUE;
            e81Var.h = j;
            try {
                e81Var.b(dc3Var2);
            } catch (IOException e) {
                throw new d81(e);
            }
        }
        return this.d;
    }

    @Override // defpackage.ac3
    public final void close() throws d81 {
        e81 e81Var = this.b;
        try {
            this.a.close();
            if (this.c) {
                this.c = false;
                if (e81Var.c == null) {
                    return;
                }
                try {
                    e81Var.a();
                } catch (IOException e) {
                    throw new d81(e);
                }
            }
        } catch (Throwable th) {
            if (this.c) {
                this.c = false;
                if (e81Var.c != null) {
                    try {
                        e81Var.a();
                    } catch (IOException e2) {
                        throw new d81(e2);
                    }
                }
            }
            throw th;
        }
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        return this.a.getUri();
    }

    @Override // defpackage.ac3
    public final Map i() {
        return this.a.i();
    }

    @Override // defpackage.ac3
    public final void m(lp3 lp3Var) {
        lp3Var.getClass();
        this.a.m(lp3Var);
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) throws d81 {
        if (this.d == 0) {
            return -1;
        }
        int i3 = this.a.read(bArr, i, i2);
        if (i3 > 0) {
            e81 e81Var = this.b;
            dc3 dc3Var = e81Var.c;
            if (dc3Var != null) {
                int i4 = 0;
                while (i4 < i3) {
                    try {
                        if (e81Var.g == e81Var.d) {
                            e81Var.a();
                            e81Var.b(dc3Var);
                        }
                        int iMin = (int) Math.min(i3 - i4, e81Var.d - e81Var.g);
                        OutputStream outputStream = e81Var.f;
                        String str = pqf.a;
                        outputStream.write(bArr, i + i4, iMin);
                        i4 += iMin;
                        long j = iMin;
                        e81Var.g += j;
                        e81Var.h += j;
                    } catch (IOException e) {
                        throw new d81(e);
                    }
                }
            }
            long j2 = this.d;
            if (j2 != -1) {
                this.d = j2 - ((long) i3);
            }
        }
        return i3;
    }
}
