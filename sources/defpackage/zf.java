package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zf implements n55 {
    public static final qu g = new qu(2);
    public final h1f a;
    public final int b;
    public final int[] c;
    public final rr5[] d;
    public int e;
    public final /* synthetic */ int f;

    public zf(int i, h1f h1fVar, int[] iArr) {
        rr5[] rr5VarArr;
        this.f = i;
        pa7.J(iArr.length > 0);
        h1fVar.getClass();
        rr5[] rr5VarArr2 = h1fVar.d;
        this.a = h1fVar;
        int length = iArr.length;
        this.b = length;
        this.d = new rr5[length];
        int i2 = 0;
        while (true) {
            int length2 = iArr.length;
            rr5VarArr = this.d;
            if (i2 >= length2) {
                break;
            }
            rr5VarArr[i2] = rr5VarArr2[iArr[i2]];
            i2++;
        }
        Arrays.sort(rr5VarArr, g);
        this.c = new int[this.b];
        int i3 = 0;
        while (true) {
            int i4 = this.b;
            if (i3 >= i4) {
                long[] jArr = new long[i4];
                return;
            }
            int[] iArr2 = this.c;
            rr5 rr5Var = this.d[i3];
            int i5 = 0;
            while (true) {
                if (i5 >= rr5VarArr2.length) {
                    i5 = -1;
                    break;
                } else if (rr5Var == rr5VarArr2[i5]) {
                    break;
                } else {
                    i5++;
                }
            }
            iArr2[i3] = i5;
            i3++;
        }
    }

    public static void m(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            dy6 dy6Var = (dy6) arrayList.get(i);
            if (dy6Var != null) {
                dy6Var.b(new yf(j, jArr[i]));
            }
        }
    }

    @Override // defpackage.n55
    public void a() {
        int i = this.f;
    }

    @Override // defpackage.n55
    public final h1f b() {
        return this.a;
    }

    @Override // defpackage.n55
    public final rr5 d(int i) {
        return this.d[i];
    }

    @Override // defpackage.n55
    public final int e(int i) {
        return this.c[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zf zfVar = (zf) obj;
            if (this.a.equals(zfVar.a) && Arrays.equals(this.c, zfVar.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.n55
    public void f() {
        int i = this.f;
    }

    @Override // defpackage.n55
    public final int g() {
        return this.c[0];
    }

    @Override // defpackage.n55
    public final rr5 h() {
        return this.d[0];
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        this.e = iHashCode;
        return iHashCode;
    }

    @Override // defpackage.n55
    public void i(float f) {
        int i = this.f;
    }

    @Override // defpackage.n55
    public final int l(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.n55
    public final int length() {
        return this.c.length;
    }

    private final void n() {
    }

    private final void p() {
    }

    public final void o() {
    }

    public final void q() {
    }

    private final void r(float f) {
    }

    @Override // defpackage.n55
    public final void c(boolean z) {
    }

    public final void s(float f) {
    }
}
