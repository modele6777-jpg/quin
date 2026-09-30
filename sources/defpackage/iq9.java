package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iq9 extends ni5 {
    public static final iq9 d = new iq9(0, 2, 1);

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        f46 f46Var = (f46) k01Var.c(0);
        Object objC = k01Var.c(1);
        if (objC instanceof p46) {
            p46 p46Var = (p46) objC;
            ((p89) bwVar.e).b(p46Var);
            ((x79) bwVar.d).e(p46Var);
        }
        if (opdVar.n != 0) {
            wf2.a("Can only append a slot if not current inserting");
        }
        int i = opdVar.i;
        int i2 = opdVar.j;
        int iC = opdVar.c(f46Var);
        int iF = opdVar.f(opdVar.b, opdVar.q(iC + 1));
        opdVar.i = iF;
        opdVar.j = iF;
        opdVar.w(1, iC);
        if (i >= iF) {
            i++;
            i2++;
        }
        opdVar.c[iF] = objC;
        opdVar.i = i;
        opdVar.j = i2;
    }
}
