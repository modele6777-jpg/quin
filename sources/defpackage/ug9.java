package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ug9 {
    public final j22 a;
    public final List b;

    public ug9(j22 j22Var, List list) {
        j22Var.getClass();
        this.a = j22Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ug9)) {
            return false;
        }
        ug9 ug9Var = (ug9) obj;
        return pa7.t(this.a, ug9Var.a) && this.b.equals(ug9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ClassRequest(classId=" + this.a + ", typeParametersCount=" + this.b + ')';
    }
}
