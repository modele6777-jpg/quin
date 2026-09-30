package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tn2 extends vn2 {
    public final xn7 a;

    public tn2(xn7 xn7Var) {
        this.a = xn7Var;
    }

    @Override // defpackage.vn2
    public final xn7 a(List list) {
        list.getClass();
        return this.a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof tn2) && ((tn2) obj).a.equals(this.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
