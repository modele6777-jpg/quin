package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nvc extends czb implements l26 {
    final /* synthetic */ lmb $overSlop;
    final /* synthetic */ long $pointerId;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nvc(long j, lmb lmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pointerId = j;
        this.$overSlop = lmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nvc nvcVar = new nvc(this.$pointerId, this.$overSlop, xn2Var);
        nvcVar.L$0 = obj;
        return nvcVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        mbe mbeVar;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            mbeVar = (mbe) this.L$0;
            long j = this.$pointerId;
            wf8 wf8Var = new wf8(22, this.$overSlop);
            this.L$0 = mbeVar;
            this.label = 1;
            obj = rk4.f(mbeVar, j, wf8Var, this);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mbeVar = (mbe) this.L$0;
            jzb.q(obj);
        }
        if (((oia) obj) != null && (this.$overSlop.element & 9223372034707292159L) != 9205357640488583168L) {
            return wi4.b;
        }
        oia oiaVar = (oia) s72.v0(mbeVar.e.I0.a);
        if (!xo1.n(oiaVar)) {
            return wi4.d;
        }
        oiaVar.a();
        return wi4.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nvc) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
