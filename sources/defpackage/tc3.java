package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tc3 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tc3(od3 od3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = od3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        tc3 tc3Var = new tc3(this.this$0, xn2Var);
        tc3Var.L$0 = obj;
        return tc3Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        xj5 xj5Var;
        i0e i0eVar;
        int i = this.label;
        int i2 = 0;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            xj5 xj5Var2 = (xj5) this.L$0;
            od3 od3Var = this.this$0;
            this.L$0 = xj5Var2;
            this.label = 1;
            Object objP0 = ynb.p0(od3Var.c.getCoroutineContext(), new hd3(od3Var, false, null), this);
            if (objP0 != bw2Var) {
                xj5Var = xj5Var2;
                obj = objP0;
            }
        }
        if (i == 1) {
            xj5 xj5Var3 = (xj5) this.L$0;
            jzb.q(obj);
            xj5Var = xj5Var3;
        } else {
            if (i != 2) {
                if (i == 3) {
                    jzb.q(obj);
                    return wefVar;
                }
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i0eVar = (i0e) this.L$1;
            xj5Var = (xj5) this.L$0;
            jzb.q(obj);
        }
        od3 od3Var2 = this.this$0;
        sk5 sk5Var = new sk5(new sc3(i2, new kl5(new tl5(new yk5((s0e) od3Var2.h.b, new mc3(od3Var2, null)), new nc3(2, null)), new oc3(i0eVar, null), 0)), new pc3(this.this$0, null));
        this.L$0 = null;
        this.L$1 = null;
        this.label = 3;
        return ok8.r(xj5Var, sk5Var, this) == bw2Var ? bw2Var : wefVar;
        i0eVar = (i0e) obj;
        if (i0eVar instanceof cb3) {
            Object obj2 = ((cb3) i0eVar).b;
            this.L$0 = xj5Var;
            this.L$1 = i0eVar;
            this.label = 2;
            if (xj5Var.a(obj2, this) != bw2Var) {
                od3 od3Var3 = this.this$0;
                sk5 sk5Var2 = new sk5(new sc3(i2, new kl5(new tl5(new yk5((s0e) od3Var3.h.b, new mc3(od3Var3, null)), new nc3(2, null)), new oc3(i0eVar, null), 0)), new pc3(this.this$0, null));
                this.L$0 = null;
                this.L$1 = null;
                this.label = 3;
                if (ok8.r(xj5Var, sk5Var2, this) == bw2Var) {
                }
            }
        }
        if (i0eVar instanceof zaf) {
            qc0.p("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
            return null;
        }
        if (i0eVar instanceof odb) {
            throw ((odb) i0eVar).b;
        }
        if (!(i0eVar instanceof we5)) {
            if (i0eVar instanceof qf9) {
                qc0.p("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                return null;
            }
            ap.c();
            return null;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tc3) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
