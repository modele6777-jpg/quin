package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vw1 extends ru6 implements uw1 {
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final long f;
    public final ru6[] g;

    public vw1(String str, int i, int i2, long j, long j2, ru6[] ru6VarArr) {
        String str2;
        super("CHAP");
        pa7.A(i <= i2);
        this.b = str;
        this.c = i;
        this.d = i2;
        int length = ru6VarArr.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                str2 = null;
                break;
            }
            ru6 ru6Var = ru6VarArr[i3];
            if (ru6Var instanceof fte) {
                fte fteVar = (fte) ru6Var;
                jy6 jy6Var = fteVar.c;
                if (fteVar.a.equals("TIT2") && !jy6Var.isEmpty()) {
                    str2 = (String) jy6Var.get(0);
                    break;
                }
            }
            i3++;
        }
        if (str2 != null) {
            new fu7(null, str2);
        }
        this.e = j;
        this.f = j2;
        this.g = ru6VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || vw1.class != obj.getClass()) {
            return false;
        }
        vw1 vw1Var = (vw1) obj;
        return this.c == vw1Var.c && this.d == vw1Var.d && this.e == vw1Var.e && this.f == vw1Var.f && this.b.equals(vw1Var.b) && Arrays.equals(this.g, vw1Var.g);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((((((((527 + this.c) * 31) + this.d) * 31) + ((int) this.e)) * 31) + ((int) this.f)) * 31);
    }
}
