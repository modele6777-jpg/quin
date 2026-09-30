package defpackage;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m7d extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        m7d m7dVar = new m7d(3, (xn2) obj3);
        m7dVar.L$0 = (yof) obj;
        m7dVar.L$1 = (wc4) obj2;
        return m7dVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        yof yofVar = (yof) this.L$0;
        wc4 wc4Var = (wc4) this.L$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (wc4Var != null) {
            fb4 fb4Var = wc4Var.a;
            jd4 jd4Var = fb4Var.a;
            if (jd4Var instanceof bd4) {
                Set set = qp5.a;
                pp5 pp5VarA = qp5.a(qu4.a, fb4Var.b);
                bd4 bd4Var = (bd4) jd4Var;
                return new l7d(yofVar, wc4Var, o7c.D(pp5VarA), o7c.C(pp5VarA, ((ad4) bd4Var.b).a.a, bd4Var.a));
            }
        }
        return k7d.a;
    }
}
