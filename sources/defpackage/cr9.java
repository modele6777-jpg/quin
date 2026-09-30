package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cr9 extends ni5 {
    public static final cr9 d = new cr9(0, 1, 1);

    @Override // defpackage.ni5
    public final void d(k01 k01Var, ac0 ac0Var, opd opdVar, bw bwVar, qr9 qr9Var) {
        ojb ojbVar = (ojb) k01Var.c(0);
        Set set = (Set) bwVar.a;
        if (set == null) {
            return;
        }
        q2a q2aVar = new q2a(set);
        w79 w79Var = (w79) bwVar.w;
        if (w79Var == null) {
            long[] jArr = jec.a;
            w79Var = new w79();
            bwVar.w = w79Var;
        }
        w79Var.m(ojbVar, q2aVar);
        ((p89) bwVar.e).b(new p46(q2aVar, -1));
    }
}
