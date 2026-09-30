package defpackage;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lu6 implements ac3 {
    public final ac3 a;
    public final int b;
    public final hxa c;
    public final byte[] d;
    public int e;

    public lu6(ac3 ac3Var, int i, hxa hxaVar) {
        pa7.A(i > 0);
        this.a = ac3Var;
        this.b = i;
        this.c = hxaVar;
        this.d = new byte[1];
        this.e = i;
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.ac3
    public final void close() {
        throw new UnsupportedOperationException();
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
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.e;
        ac3 ac3Var = this.a;
        if (i3 == 0) {
            byte[] bArr2 = this.d;
            int i4 = 0;
            if (ac3Var.read(bArr2, 0, 1) != -1) {
                int i5 = (bArr2[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr3 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int i7 = ac3Var.read(bArr3, i4, i6);
                        if (i7 != -1) {
                            i4 += i7;
                            i6 -= i7;
                        }
                    }
                    while (i5 > 0 && bArr3[i5 - 1] == 0) {
                        i5--;
                    }
                    if (i5 > 0) {
                        d0a d0aVar = new d0a(bArr3, i5);
                        hxa hxaVar = this.c;
                        long jMax = !hxaVar.m ? hxaVar.j : Math.max(hxaVar.n.t(true), hxaVar.j);
                        int iA = d0aVar.a();
                        k1f k1fVar = hxaVar.l;
                        k1fVar.getClass();
                        k1fVar.e(iA, d0aVar);
                        k1fVar.a(jMax, 1, iA, 0, null);
                        hxaVar.m = true;
                    }
                }
                i3 = this.b;
                this.e = i3;
            }
            return -1;
        }
        int i8 = ac3Var.read(bArr, i, Math.min(i3, i2));
        if (i8 != -1) {
            this.e -= i8;
        }
        return i8;
    }
}
