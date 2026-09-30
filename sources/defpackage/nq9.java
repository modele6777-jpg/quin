package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nq9 extends ni5 {
    public static final nq9 d = new nq9(0, 2, 1);

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        int i;
        b77 b77Var = (b77) k01Var.c(0);
        int iC = opdVar.c((f46) k01Var.c(1));
        if (opdVar.t >= iC) {
            wf2.a("Check failed");
        }
        y7h.C(opdVar, ac0Var, iC);
        int i2 = opdVar.t;
        int iF = opdVar.v;
        while (iF >= 0 && !opdVar.x(iF)) {
            iF = opdVar.F(opdVar.b, iF);
        }
        int iT = iF + 1;
        int iM = 0;
        while (iT < i2) {
            if (opdVar.u(i2, iT)) {
                if (opdVar.x(iT)) {
                    iM = 0;
                }
                iT++;
            } else {
                iM += opdVar.x(iT) ? 1 : opdVar.E(iT);
                iT += opdVar.t(iT);
            }
        }
        while (true) {
            i = opdVar.t;
            if (i >= iC) {
                break;
            }
            if (opdVar.u(iC, i)) {
                int i3 = opdVar.t;
                if (i3 < opdVar.u && (opdVar.b[(opdVar.q(i3) * 5) + 1] & 1073741824) != 0) {
                    ac0Var.d(opdVar.D(opdVar.t));
                    iM = 0;
                }
                opdVar.Q();
            } else {
                iM += opdVar.M();
            }
        }
        if (i != iC) {
            wf2.a("Check failed");
        }
        b77Var.a = iM;
    }
}
