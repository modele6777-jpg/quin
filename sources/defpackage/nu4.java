package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nu4 implements pv2, Serializable {
    public static final nu4 a = new nu4();
    private static final long serialVersionUID = 0;

    private final Object readResolve() {
        return a;
    }

    @Override // defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        ov2Var.getClass();
        return null;
    }

    @Override // defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        ov2Var.getClass();
        return this;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // defpackage.pv2
    public final pv2 p0(pv2 pv2Var) {
        pv2Var.getClass();
        return pv2Var;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return obj;
    }
}
