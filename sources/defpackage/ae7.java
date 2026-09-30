package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ae7 extends gbe implements l26 {
    final /* synthetic */ a26 $transform;
    int label;
    final /* synthetic */ fe7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ae7(fe7 fe7Var, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = fe7Var;
        this.$transform = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ae7(this.this$0, this.$transform, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                Object obj2 = this.this$0.b.get();
                Boolean bool = Boolean.TRUE;
                if (pa7.t(obj2, bool)) {
                    qc0.p("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    return null;
                }
                this.this$0.b.set(bool);
                fc3 fc3Var = this.this$0.c;
                zd7 zd7Var = new zd7(null, this.$transform);
                this.label = 1;
                obj = fc3Var.a(new lsa(zd7Var, null), this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            p79 p79Var = (p79) obj;
            this.this$0.b.set(Boolean.FALSE);
            return p79Var;
        } catch (Throwable th) {
            this.this$0.b.set(Boolean.FALSE);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ae7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
