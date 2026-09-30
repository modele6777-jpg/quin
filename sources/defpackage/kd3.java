package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kd3 extends gbe implements l26 {
    final /* synthetic */ l26 $transform;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kd3(od3 od3Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = od3Var;
        this.$transform = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        kd3 kd3Var = new kd3(this.this$0, this.$transform, xn2Var);
        kd3Var.L$0 = obj;
        return kd3Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        aw2 aw2Var = (aw2) this.L$0;
        za2 za2Var = new za2();
        i0e i0eVarF = this.this$0.h.F();
        if (i0eVarF instanceof cb3) {
            i0eVarF = new qf9(((cb3) i0eVarF).a);
        }
        mt8 mt8Var = new mt8(this.$transform, za2Var, i0eVarF, aw2Var.getCoroutineContext());
        vid vidVar = this.this$0.l;
        Object objD = vidVar.c.d(mt8Var);
        if (objD instanceof pw1) {
            Throwable thA = rw1.a(objD);
            if (thA == null) {
                throw new g62("Channel was closed normally");
            }
            throw thA;
        }
        if (objD instanceof qw1) {
            qc0.p("Check failed.");
            return null;
        }
        if (vidVar.d.a.getAndIncrement() == 0) {
            ynb.V(vidVar.a, null, null, new uid(vidVar, null), 3);
        }
        this.label = 1;
        Object objS = za2Var.s(this);
        bw2 bw2Var = bw2.a;
        return objS == bw2Var ? bw2Var : objS;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kd3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
