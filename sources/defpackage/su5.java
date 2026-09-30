package defpackage;

import com.adjust.sdk.network.ErrorCodes;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class su5 extends gbe implements l26 {
    int label;
    final /* synthetic */ vu5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public su5(vu5 vu5Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = vu5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new su5(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        ju5 ju5Var;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        vu5 vu5Var = this.this$0;
        s0e s0eVar = vu5Var.U0;
        do {
            value = s0eVar.getValue();
            ju5Var = (ju5) value;
        } while (!s0eVar.l(value, ju5.a(ju5Var, null, null, null, null, vu5Var.P(ju5Var.d), false, false, false, false, ErrorCodes.IO_EXCEPTION)));
        if (this.this$0.l() != null) {
            this.this$0.I();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        su5 su5Var = (su5) k((xn2) obj2, Long.valueOf(((Number) obj).longValue()));
        wef wefVar = wef.a;
        su5Var.r(wefVar);
        return wefVar;
    }
}
