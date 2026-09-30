package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j99 extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ vv2 $this_withLockLaunch;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j99(vv2 vv2Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_withLockLaunch = vv2Var;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        j99 j99Var = new j99(this.$this_withLockLaunch, this.$block, xn2Var);
        j99Var.L$0 = obj;
        return j99Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        d99 d99Var;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            tq.v(((aw2) this.L$0).getCoroutineContext());
            f99 f99Var = this.$this_withLockLaunch.a;
            l26 l26Var = this.$block;
            this.L$0 = f99Var;
            this.L$1 = l26Var;
            this.label = 1;
            k99.I(f99Var, this);
            return bw2Var;
        }
        if (i != 1) {
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d99Var = (d99) this.L$0;
            try {
                jzb.q(obj);
                d99Var.h(null);
                return wef.a;
            } catch (Throwable th) {
                th = th;
                d99Var.h(null);
                throw th;
            }
        }
        l26 l26Var2 = (l26) this.L$1;
        d99 d99Var2 = (d99) this.L$0;
        jzb.q(obj);
        try {
            this.L$0 = d99Var2;
            this.L$1 = null;
            this.label = 2;
            if (jgb.O(l26Var2, this) == bw2Var) {
                return bw2Var;
            }
            d99Var = d99Var2;
            d99Var.h(null);
            return wef.a;
        } catch (Throwable th2) {
            th = th2;
            d99Var = d99Var2;
            d99Var.h(null);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j99) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
