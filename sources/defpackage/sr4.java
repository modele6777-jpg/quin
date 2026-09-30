package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sr4 extends gf6 {
    public static final /* synthetic */ int c = 0;
    public final qr4 a = qr4.e;
    public final mb5 b = mb5.a;

    @Override // defpackage.gf6
    public final mb5 a() {
        return this.b;
    }

    @Override // defpackage.gf6
    public final boolean b(ng1 ng1Var, hc2 hc2Var) {
        Set setA = ng1Var.a();
        setA.getClass();
        b21.q("DynamicRangeFeature", "isSupportedIndividually: cameraInfoSupportedDynamicRanges = " + setA + ", this = " + this);
        qr4 qr4Var = this.a;
        if (!setA.contains(qr4Var)) {
            return false;
        }
        for (oif oifVar : (List) hc2Var.f) {
            Set setK = oifVar.k(ng1Var);
            b21.q("DynamicRangeFeature", "isSupportedIndividually: useCaseSupportedDynamicRanges = " + setK + ", this = " + this + ", useCases = " + oifVar);
            if (setK != null && !setK.contains(qr4Var)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return "DynamicRangeFeature(dynamicRange=" + this.a + ')';
    }
}
