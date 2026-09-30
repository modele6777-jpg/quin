package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xi9 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ int $hour;
    final /* synthetic */ int $minute;
    int label;
    final /* synthetic */ gj9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xi9(Context context, int i, int i2, gj9 gj9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = context;
        this.$hour = i;
        this.$minute = i2;
        this.this$0 = gj9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xi9(this.$context, this.$hour, this.$minute, this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object value;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            ta3 ta3Var = ta3.a;
            Context context = this.$context;
            int i2 = this.$hour;
            int i3 = this.$minute;
            this.label = 1;
            obj = ta3Var.q(context, i2, i3, this);
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
        if (((Boolean) obj).booleanValue()) {
            s0e s0eVar = this.this$0.e;
            int i4 = this.$hour;
            int i5 = this.$minute;
            do {
                value = s0eVar.getValue();
            } while (!s0eVar.l(value, qi9.a((qi9) value, false, false, i4, i5, false, false, 0, 0, false, false, 1011)));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xi9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
