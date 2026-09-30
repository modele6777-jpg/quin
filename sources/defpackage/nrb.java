package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nrb extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ d99 $mutex;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nrb(d99 d99Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$mutex = d99Var;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nrb(this.$mutex, this.$block, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        d99 d99Var;
        l26 l26Var;
        Throwable th;
        d99 d99Var2;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                d99Var = this.$mutex;
                l26Var = this.$block;
                this.L$0 = d99Var;
                this.L$1 = l26Var;
                this.label = 1;
                if (d99Var.b(this) != bw2Var) {
                }
                return bw2Var;
            }
            if (i != 1) {
                if (i != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) this.L$0;
                try {
                    jzb.q(obj);
                    d99Var2.h(null);
                    return wef.a;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            l26Var = (l26) this.L$1;
            d99 d99Var3 = (d99) this.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            mrb mrbVar = new mrb(l26Var, null);
            this.L$0 = d99Var;
            this.L$1 = null;
            this.label = 2;
            if (jgb.O(mrbVar, this) != bw2Var) {
                d99Var2 = d99Var;
                d99Var2.h(null);
                return wef.a;
            }
            return bw2Var;
        } catch (Throwable th3) {
            d99 d99Var4 = d99Var;
            th = th3;
            d99Var2 = d99Var4;
            d99Var2.h(null);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nrb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
