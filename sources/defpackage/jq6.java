package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jq6 extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        jq6 jq6Var = new jq6(3, (xn2) obj3);
        jq6Var.L$0 = (List) obj;
        jq6Var.L$1 = (oo6) obj2;
        return jq6Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list = (List) this.L$0;
        oo6 oo6Var = (oo6) this.L$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        boolean z = oo6Var.a;
        boolean z2 = oo6Var.b;
        TarotSkinIdentify tarotSkinIdentify = oo6Var.d;
        boolean z3 = oo6Var.e;
        oo6Var.getClass();
        list.getClass();
        return new oo6(z, z2, list, tarotSkinIdentify, z3);
    }
}
