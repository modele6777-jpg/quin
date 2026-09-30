package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y1e {
    public final List a;
    public final int b;
    public final int c;
    public final ya2 d;

    public y1e(List list, int i, int i2, ya2 ya2Var) {
        list.getClass();
        ya2Var.getClass();
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = ya2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1e)) {
            return false;
        }
        y1e y1eVar = (y1e) obj;
        return pa7.t(this.a, y1eVar.a) && this.b == y1eVar.b && this.c == y1eVar.c && pa7.t(this.d, y1eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.b(this.c, ub3.b(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return "CaptureRequest(captureConfigs=" + this.a + ", captureMode=" + this.b + ", flashType=" + this.c + ", result=" + this.d + ')';
    }
}
