package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kn0 extends gbe implements a26 {
    final /* synthetic */ String $contractId;
    boolean Z$0;
    int label;
    final /* synthetic */ sn0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kn0(sn0 sn0Var, String str, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = sn0Var;
        this.$contractId = str;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new kn0(this.this$0, this.$contractId, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        boolean zBooleanValue;
        boolean z;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            x1g x1gVar = this.this$0.Q0;
            String str = this.$contractId;
            this.label = 1;
            obj = ((c2g) x1gVar).a(str, this);
            if (obj != bw2Var) {
            }
            return bw2Var;
        }
        if (i == 1) {
            jzb.q(obj);
        } else {
            if (i != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.Z$0;
            jzb.q(obj);
        }
        zBooleanValue = z;
        return Boolean.valueOf(zBooleanValue);
        zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            sn0 sn0Var = this.this$0;
            this.Z$0 = zBooleanValue;
            this.label = 2;
            if (sn0Var.S(this) != bw2Var) {
                z = zBooleanValue;
                zBooleanValue = z;
            }
            return bw2Var;
        }
        return Boolean.valueOf(zBooleanValue);
    }
}
