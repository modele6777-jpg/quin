package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r06 extends gbe implements l26 {
    final /* synthetic */ t7 $accountInfoProvider;
    final /* synthetic */ q06 $guard;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r06(t7 t7Var, q06 q06Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$accountInfoProvider = t7Var;
        this.$guard = q06Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new r06(this.$accountInfoProvider, this.$guard, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                whb whbVar = ((mo3) this.$accountInfoProvider).d;
                cs1 cs1Var = new cs1(1, this.$guard);
                this.label = 1;
                Object objB = whbVar.a.b(cs1Var, this);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            throw new nt7();
        } catch (Throwable th) {
            q06 q06Var = this.$guard;
            if (!q06Var.g) {
                q06Var.g = true;
                q06Var.c.invoke();
            }
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((r06) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
