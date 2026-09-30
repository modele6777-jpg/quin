package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eic extends gbe implements l26 {
    /* synthetic */ long J$0;
    long J$1;
    int label;
    final /* synthetic */ gic this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eic(gic gicVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gicVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        eic eicVar = new eic(this.this$0, xn2Var);
        eicVar.J$0 = ((zsf) obj).a;
        return eicVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        long j;
        long j2;
        long j3;
        long j4;
        long j5;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            j = this.J$0;
            sc9 sc9Var = this.this$0.f;
            this.J$0 = j;
            this.label = 1;
            obj = sc9Var.b(j, this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            j = this.J$0;
            jzb.q(obj);
        } else {
            if (i == 2) {
                j2 = this.J$1;
                j = this.J$0;
                jzb.q(obj);
                j3 = ((zsf) obj).a;
                sc9 sc9Var2 = this.this$0.f;
                long jD = zsf.d(j2, j3);
                this.J$0 = j;
                this.J$1 = j3;
                this.label = 3;
                obj = sc9Var2.a(jD, j3, this);
                if (obj != bw2Var) {
                    j4 = j;
                    j5 = j3;
                }
                return bw2Var;
            }
            if (i != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j5 = this.J$1;
            j4 = this.J$0;
            jzb.q(obj);
        }
        return new zsf(zsf.d(j4, zsf.d(j5, ((zsf) obj).a)));
        long jD2 = zsf.d(j, ((zsf) obj).a);
        gic gicVar = this.this$0;
        this.J$0 = j;
        this.J$1 = jD2;
        this.label = 2;
        obj = gicVar.a(jD2, this);
        if (obj != bw2Var) {
            j2 = jD2;
            j3 = ((zsf) obj).a;
            sc9 sc9Var3 = this.this$0.f;
            long jD3 = zsf.d(j2, j3);
            this.J$0 = j;
            this.J$1 = j3;
            this.label = 3;
            obj = sc9Var3.a(jD3, j3, this);
            if (obj != bw2Var) {
                j4 = j;
                j5 = j3;
                return new zsf(zsf.d(j4, zsf.d(j5, ((zsf) obj).a)));
            }
        }
        return bw2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        long j = ((zsf) obj).a;
        eic eicVar = new eic(this.this$0, (xn2) obj2);
        eicVar.J$0 = j;
        return eicVar.r(wef.a);
    }
}
