package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a8c extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ ya2 $deferred;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a8c(ya2 ya2Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$deferred = ya2Var;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        a8c a8cVar = new a8c(this.$deferred, this.$block, xn2Var);
        a8cVar.L$0 = obj;
        return a8cVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        ya2 ya2Var;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            aw2 aw2Var = (aw2) this.L$0;
            ya2 ya2Var2 = this.$deferred;
            l26 l26Var = this.$block;
            try {
                this.L$0 = ya2Var2;
                this.label = 1;
                obj = l26Var.z(aw2Var, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
                ya2Var = ya2Var2;
            } catch (Throwable th) {
                th = th;
                ya2Var = ya2Var2;
                obj = new dzb(th);
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ya2Var = (ya2) this.L$0;
            try {
                jzb.q(obj);
            } catch (Throwable th2) {
                th = th2;
                obj = new dzb(th);
            }
        }
        Throwable thA = ezb.a(obj);
        za2 za2Var = (za2) ya2Var;
        if (thA == null) {
            za2Var.R(obj);
        } else {
            za2Var.i0(thA);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a8c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
