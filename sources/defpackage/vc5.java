package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vc5 implements z85 {
    @Override // defpackage.z85
    public final int a() {
        return 3;
    }

    @Override // defpackage.z85
    public final int b(ca1 ca1Var, ca1 ca1Var2, u09 u09Var) {
        ca1Var.getClass();
        ca1Var2.getClass();
        if (!(ca1Var2 instanceof wxa) || !(ca1Var instanceof wxa)) {
            return 3;
        }
        wxa wxaVar = (wxa) ca1Var2;
        wxa wxaVar2 = (wxa) ca1Var;
        if (!pa7.t(wxaVar.getName(), wxaVar2.getName())) {
            return 3;
        }
        if (lmg.l0(wxaVar) && lmg.l0(wxaVar2)) {
            return 1;
        }
        return (lmg.l0(wxaVar) || lmg.l0(wxaVar2)) ? 2 : 3;
    }
}
