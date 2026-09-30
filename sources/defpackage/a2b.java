package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a2b extends gbe implements l26 {
    final /* synthetic */ f2b $this_processIn;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2b(f2b f2bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_processIn = f2bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a2b(this.$this_processIn, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            f2b f2bVar = this.$this_processIn;
            this.label = 1;
            f2bVar.getClass();
            e2b e2bVar = new e2b(f2bVar, null);
            s8e s8eVar = new s8e(this, getContext());
            Object objC = gcc.C(s8eVar, true, s8eVar, e2bVar);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a2b) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
