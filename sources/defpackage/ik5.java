package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ik5 extends gbe implements l26 {
    final /* synthetic */ xj5 $downstream;
    final /* synthetic */ mmb $lastValue;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ik5(xn2 xn2Var, xj5 xj5Var, mmb mmbVar) {
        super(2, xn2Var);
        this.$lastValue = mmbVar;
        this.$downstream = xj5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ik5 ik5Var = new ik5(xn2Var, this.$downstream, this.$lastValue);
        ik5Var.L$0 = ((rw1) obj).a;
        return ik5Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        mmb mmbVar;
        mmb mmbVar2;
        Object obj2 = this.L$0;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            mmbVar = this.$lastValue;
            boolean z = obj2 instanceof qw1;
            if (!z) {
                mmbVar.element = obj2;
            }
            xj5 xj5Var = this.$downstream;
            if (z) {
                Throwable thA = rw1.a(obj2);
                if (thA != null) {
                    throw thA;
                }
                Object obj3 = mmbVar.element;
                if (obj3 != null) {
                    if (obj3 == rj9.a) {
                        obj3 = null;
                    }
                    this.L$0 = null;
                    this.L$1 = obj2;
                    this.L$2 = mmbVar;
                    this.L$3 = null;
                    this.I$0 = 0;
                    this.I$1 = 0;
                    this.label = 1;
                    Object objA = xj5Var.a(obj3, this);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                    mmbVar2 = mmbVar;
                }
                mmbVar.element = rj9.c;
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        mmbVar2 = (mmb) this.L$2;
        jzb.q(obj);
        mmbVar = mmbVar2;
        mmbVar.element = rj9.c;
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Object obj3 = ((rw1) obj).a;
        ik5 ik5Var = new ik5((xn2) obj2, this.$downstream, this.$lastValue);
        ik5Var.L$0 = obj3;
        return ik5Var.r(wef.a);
    }
}
