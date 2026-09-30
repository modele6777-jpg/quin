package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ng9 extends gbe implements l26 {
    final /* synthetic */ yv1 $this_busyReceive;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ng9(yv1 yv1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_busyReceive = yv1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ng9 ng9Var = new ng9(this.$this_busyReceive, xn2Var);
        ng9Var.L$0 = obj;
        return ng9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Throwable th;
        dg7 dg7Var;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dg7Var = (dg7) this.L$0;
            try {
                jzb.q(obj);
                dg7Var.h(null);
                return obj;
            } catch (Throwable th2) {
                th = th2;
                dg7Var.h(null);
                throw th;
            }
        }
        jzb.q(obj);
        lyd lydVarV = ynb.V((aw2) this.L$0, null, null, new mg9(2, null), 3);
        try {
            yv1 yv1Var = this.$this_busyReceive;
            this.L$0 = lydVarV;
            this.label = 1;
            Object objM = yv1Var.m(this);
            bw2 bw2Var = bw2.a;
            if (objM == bw2Var) {
                return bw2Var;
            }
            obj = objM;
            dg7Var = lydVarV;
            dg7Var.h(null);
            return obj;
        } catch (Throwable th3) {
            th = th3;
            dg7Var = lydVarV;
            dg7Var.h(null);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ng9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
