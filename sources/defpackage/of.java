package defpackage;

import android.net.Uri;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class of {
    public final int a;
    public final Uri[] b;
    public final op8[] c;
    public final int[] d;
    public final long[] e;
    public final String[] f;
    public final pf[] g;

    static {
        kv2.v(0, 1, 2, 3, 4);
        kv2.v(5, 6, 7, 8, 9);
        pqf.D(10);
        pqf.D(11);
    }

    public of(int i, int[] iArr, op8[] op8VarArr, long[] jArr, String[] strArr, pf[] pfVarArr) {
        Uri uri;
        int i2 = 0;
        pa7.A(iArr.length == op8VarArr.length);
        pa7.A(iArr.length == pfVarArr.length);
        this.a = i;
        this.d = iArr;
        this.c = op8VarArr;
        this.e = jArr;
        this.b = new Uri[op8VarArr.length];
        while (true) {
            Uri[] uriArr = this.b;
            if (i2 >= uriArr.length) {
                this.f = strArr;
                this.g = pfVarArr;
                return;
            }
            op8 op8Var = op8VarArr[i2];
            if (op8Var == null) {
                uri = null;
            } else {
                lp8 lp8Var = op8Var.b;
                lp8Var.getClass();
                uri = lp8Var.a;
            }
            uriArr[i2] = uri;
            i2++;
        }
    }

    public final int a(int i) {
        int i2;
        int i3 = i + 1;
        while (true) {
            int[] iArr = this.d;
            if (i3 >= iArr.length || (i2 = iArr[i3]) == 0 || i2 == 1) {
                break;
            }
            i3++;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || of.class != obj.getClass()) {
            return false;
        }
        of ofVar = (of) obj;
        return this.a == ofVar.a && Arrays.equals(this.c, ofVar.c) && Arrays.equals(this.d, ofVar.d) && Arrays.equals(this.e, ofVar.e) && Arrays.equals(this.f, ofVar.f) && Arrays.equals(this.g, ofVar.g);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.g) + ((((Arrays.hashCode(this.e) + ((Arrays.hashCode(this.d) + ((Arrays.hashCode(this.c) + (((this.a * 31) - 1) * 961)) * 31)) * 31)) * 29791) + Arrays.hashCode(this.f)) * 31)) * 31;
    }
}
