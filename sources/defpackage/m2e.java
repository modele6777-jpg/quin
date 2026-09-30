package defpackage;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m2e extends gbe implements n26 {
    private /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        ((Boolean) obj2).getClass();
        m2e m2eVar = new m2e(3, (xn2) obj3);
        m2eVar.L$0 = (pd5) obj;
        return m2eVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws IOException {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        pd5 pd5Var = (pd5) this.L$0;
        this.label = 1;
        if (pd5Var.c.get()) {
            qc0.p("This scope has already been closed.");
            return null;
        }
        Object objM = m93.M(pd5Var.a, new od5(pd5Var, null), this);
        bw2 bw2Var = bw2.a;
        return objM == bw2Var ? bw2Var : objM;
    }
}
