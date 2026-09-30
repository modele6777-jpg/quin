package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vd4 implements xd4 {
    public final ale a;
    public final List b;

    public vd4(ale aleVar, List list) {
        list.getClass();
        this.a = aleVar;
        this.b = list;
    }

    @Override // defpackage.xd4
    public final List a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd4)) {
            return false;
        }
        vd4 vd4Var = (vd4) obj;
        return this.a == vd4Var.a && pa7.t(this.b, vd4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "QuickDraw(spread=" + this.a + ", patterns=" + this.b + ")";
    }
}
