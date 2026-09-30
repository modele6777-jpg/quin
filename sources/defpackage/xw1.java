package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xw1 extends ru6 {
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final ru6[] f;

    public xw1(String str, boolean z, boolean z2, String[] strArr, ru6[] ru6VarArr) {
        super("CTOC");
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = ru6VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || xw1.class != obj.getClass()) {
            return false;
        }
        xw1 xw1Var = (xw1) obj;
        return this.c == xw1Var.c && this.d == xw1Var.d && this.b.equals(xw1Var.b) && Arrays.equals(this.e, xw1Var.e) && Arrays.equals(this.f, xw1Var.f);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((527 + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31);
    }
}
