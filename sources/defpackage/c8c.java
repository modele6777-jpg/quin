package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c8c extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c8c(l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        c8c c8cVar = new c8c(this.$block, xn2Var);
        c8cVar.L$0 = obj;
        return c8cVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        nv2 nv2VarF0 = ((aw2) this.L$0).getCoroutineContext().F0(hj6.Z);
        nv2VarF0.getClass();
        sv2 sv2Var = (sv2) nv2VarF0;
        za2 za2Var = new za2();
        ynb.U(ob6.a, sv2Var, dw2.d, new a8c(za2Var, this.$block, null));
        while (!za2Var.L0()) {
            try {
                return z5c.I(sv2Var, new b8c(za2Var, null));
            } catch (InterruptedException unused) {
            }
        }
        return za2Var.D();
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c8c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
