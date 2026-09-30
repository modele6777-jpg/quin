package defpackage;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vm3 {
    public final String a;
    public final rr5 b;
    public final rr5 c;
    public final int d;
    public final int e;

    public vm3(String str, rr5 rr5Var, rr5 rr5Var2, int i, int i2) {
        pa7.A(i == 0 || i2 == 0);
        pa7.A(true ^ TextUtils.isEmpty(str));
        this.a = str;
        rr5Var.getClass();
        this.b = rr5Var;
        rr5Var2.getClass();
        this.c = rr5Var2;
        this.d = i;
        this.e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && vm3.class == obj.getClass()) {
            vm3 vm3Var = (vm3) obj;
            if (this.d == vm3Var.d && this.e == vm3Var.e && this.a.equals(vm3Var.a) && this.b.equals(vm3Var.b) && this.c.equals(vm3Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + ub3.c((((527 + this.d) * 31) + this.e) * 31, 31, this.a)) * 31);
    }
}
