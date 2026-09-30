package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mm5 extends gbe implements l26 {
    final /* synthetic */ Object $initialValue;
    final /* synthetic */ b89 $shared;
    final /* synthetic */ wj5 $upstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mm5(wj5 wj5Var, b89 b89Var, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.$upstream = wj5Var;
        this.$shared = b89Var;
        this.$initialValue = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        mm5 mm5Var = new mm5(this.$upstream, this.$shared, this.$initialValue, xn2Var);
        mm5Var.L$0 = obj;
        return mm5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        led ledVar = (led) this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            int iOrdinal = ledVar.ordinal();
            if (iOrdinal == 0) {
                wj5 wj5Var = this.$upstream;
                b89 b89Var = this.$shared;
                this.L$0 = null;
                this.label = 1;
                Object objB = wj5Var.b(b89Var, this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    ap.c();
                    return null;
                }
                Object obj2 = this.$initialValue;
                b89 b89Var2 = this.$shared;
                if (obj2 == ocd.a) {
                    b89Var2.h();
                } else {
                    b89Var2.i(obj2);
                }
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
        return ((mm5) k((xn2) obj2, (led) obj)).r(wef.a);
    }
}
