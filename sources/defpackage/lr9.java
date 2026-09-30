package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lr9 extends ni5 {
    public static final lr9 d = new lr9(1, 0, 2);

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        int iB = k01Var.b(0);
        int i = opdVar.v;
        int iO = opdVar.O(opdVar.b, opdVar.q(i));
        int iF = opdVar.f(opdVar.b, opdVar.q(i + 1));
        for (int iMax = Math.max(iO, iF - iB); iMax < iF; iMax++) {
            Object obj = opdVar.c[opdVar.g(iMax)];
            if (obj instanceof p46) {
                bwVar.i((p46) obj);
            } else if (obj instanceof ojb) {
                ((ojb) obj).c();
            }
        }
        if (iB <= 0) {
            wf2.a("Check failed");
        }
        int i2 = opdVar.v;
        int iO2 = opdVar.O(opdVar.b, opdVar.q(i2));
        int iF2 = opdVar.f(opdVar.b, opdVar.q(i2 + 1)) - iB;
        if (iF2 < iO2) {
            wf2.a("Check failed");
        }
        opdVar.K(iF2, iB, i2);
        int i3 = opdVar.i;
        if (i3 >= iO2) {
            opdVar.i = i3 - iB;
        }
    }
}
