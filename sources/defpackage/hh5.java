package defpackage;

import ai.askquin.ui.paywall.upgrade.s;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hh5 extends gbe implements l26 {
    final /* synthetic */ iy9 $key;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ s this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hh5(s sVar, iy9 iy9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sVar;
        this.$key = iy9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hh5(this.this$0, this.$key, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        s sVar;
        d99 d99Var;
        iy9 iy9Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            s sVar2 = this.this$0;
            f99 f99Var = sVar2.e;
            iy9 iy9Var2 = this.$key;
            this.L$0 = f99Var;
            this.L$1 = sVar2;
            this.L$2 = iy9Var2;
            this.label = 1;
            Object objB = f99Var.b(this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            sVar = sVar2;
            d99Var = f99Var;
            iy9Var = iy9Var2;
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            iy9Var = (iy9) this.L$2;
            sVar = (s) this.L$1;
            d99Var = (d99) this.L$0;
            jzb.q(obj);
        }
        try {
            return (dg7) sVar.f.remove(iy9Var);
        } finally {
            d99Var.h(null);
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hh5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
