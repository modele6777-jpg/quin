package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x49 implements xn8 {
    public final w49 a;

    public x49(w49 w49Var) {
        this.a = w49Var;
    }

    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
        return this.a.a(ga7Var, i7h.t(ga7Var), i);
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        return this.a.b(zn8Var, i7h.t(zn8Var), j);
    }

    @Override // defpackage.xn8
    public final int c(ga7 ga7Var, List list, int i) {
        return this.a.c(ga7Var, i7h.t(ga7Var), i);
    }

    @Override // defpackage.xn8
    public final int d(ga7 ga7Var, List list, int i) {
        return this.a.d(ga7Var, i7h.t(ga7Var), i);
    }

    @Override // defpackage.xn8
    public final int e(ga7 ga7Var, List list, int i) {
        return this.a.e(ga7Var, i7h.t(ga7Var), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x49) && pa7.t(this.a, ((x49) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ")";
    }
}
