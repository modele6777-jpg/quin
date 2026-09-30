package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o92 implements Serializable {
    private static final long serialVersionUID = 0;
    private final pv2[] elements;

    public o92(pv2[] pv2VarArr) {
        this.elements = pv2VarArr;
    }

    private final Object readResolve() {
        pv2[] pv2VarArr = this.elements;
        pv2 pv2VarP0 = nu4.a;
        for (pv2 pv2Var : pv2VarArr) {
            pv2VarP0 = pv2VarP0.p0(pv2Var);
        }
        return pv2VarP0;
    }
}
