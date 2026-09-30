package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fy0 extends gbe implements l26 {
    final /* synthetic */ a26 $onSuccess;
    final /* synthetic */ String $phoneNumber;
    Object L$0;
    int label;
    final /* synthetic */ gy0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fy0(gy0 gy0Var, String str, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gy0Var;
        this.$phoneNumber = str;
        this.$onSuccess = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fy0(this.this$0, this.$phoneNumber, this.$onSuccess, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00b3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b4 A[RETURN] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            ht6 ht6Var = this.this$0.b;
            String str = this.$phoneNumber;
            this.label = 1;
            js3 js3Var = ga4.a;
            obj = ynb.p0(hr3.c, new bb((cb) ht6Var, str, null), this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            if (i != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return wefVar;
        }
        jzb.q(obj);
        rca rcaVar = (rca) obj;
        if (!(rcaVar instanceof pca)) {
            if (!pa7.t(rcaVar, qca.a)) {
                ap.c();
                return null;
            }
            js3 js3Var2 = ga4.a;
            wg6 wg6Var = mk8.a;
            ey0 ey0Var = new ey0(null, this.$onSuccess, this.$phoneNumber);
            this.L$0 = null;
            this.label = 3;
            if (ynb.p0(wg6Var, ey0Var, this) == bw2Var) {
                return bw2Var;
            }
            return wefVar;
        }
        int i2 = ((pca) rcaVar).a;
        gy0 gy0Var = this.this$0;
        if (i2 == 10003) {
            gy0Var.c.setValue(jy0.a((jy0) gy0Var.c.getValue(), true));
            return wefVar;
        }
        Integer num = new Integer(xdc.t(new Integer(i2)));
        this.L$0 = null;
        this.label = 2;
        gy0Var.getClass();
        js3 js3Var3 = ga4.a;
        Object objP0 = ynb.p0(mk8.a, new dy0(null, num), this);
        if (objP0 != bw2Var) {
            objP0 = wefVar;
        }
        if (objP0 == bw2Var) {
            return bw2Var;
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fy0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
