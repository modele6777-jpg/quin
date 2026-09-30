package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rm1 {
    public final List a;
    public final int b;
    public final qh2 c;

    public rm1(List list, int i, qh2 qh2Var) {
        list.getClass();
        qh2Var.getClass();
        this.a = list;
        this.b = i;
        this.c = qh2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm1)) {
            return false;
        }
        rm1 rm1Var = (rm1) obj;
        return pa7.t(this.a, rm1Var.a) && this.b == rm1Var.b && pa7.t(this.c, rm1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ub3.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MainCaptureParams(configs=" + this.a + ", requestTemplate=" + ((Object) ttb.b(this.b)) + ", sessionConfigOptions=" + this.c + ')';
    }
}
