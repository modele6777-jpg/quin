package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nk5 extends gbe implements l26 {
    final /* synthetic */ xj5 $downStream;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk5(xj5 xj5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$downStream = xj5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nk5 nk5Var = new nk5(this.$downStream, xn2Var);
        nk5Var.L$0 = ((rw1) obj).a;
        return nk5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object obj2 = this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            xj5 xj5Var = this.$downStream;
            if (!(obj2 instanceof qw1)) {
                this.L$0 = null;
                this.L$1 = obj2;
                this.L$2 = null;
                this.I$0 = 0;
                this.I$1 = 0;
                this.label = 1;
                Object objA = xj5Var.a(obj2, this);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj2 = this.L$1;
            jzb.q(obj);
        }
        if (!(obj2 instanceof pw1)) {
            return Boolean.TRUE;
        }
        Throwable thA = rw1.a(obj2);
        if (thA == null) {
            return Boolean.FALSE;
        }
        throw thA;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Object obj3 = ((rw1) obj).a;
        nk5 nk5Var = new nk5(this.$downStream, (xn2) obj2);
        nk5Var.L$0 = obj3;
        return nk5Var.r(wef.a);
    }
}
