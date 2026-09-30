package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fm1 {
    public final QaResult a;
    public final dm1 b;

    public fm1(QaResult qaResult, dm1 dm1Var) {
        qaResult.getClass();
        this.a = qaResult;
        this.b = dm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fm1)) {
            return false;
        }
        fm1 fm1Var = (fm1) obj;
        return pa7.t(this.a, fm1Var.a) && this.b == fm1Var.b;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dm1 dm1Var = this.b;
        return iHashCode + (dm1Var == null ? 0 : dm1Var.hashCode());
    }

    public final String toString() {
        return "RoutedResult(result=" + this.a + ", effect=" + this.b + ")";
    }
}
