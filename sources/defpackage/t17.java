package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t17 extends gbe implements l26 {
    int label;
    final /* synthetic */ x17 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t17(x17 x17Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = x17Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new t17(this.this$0, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            x17 x17Var = this.this$0;
            jx jxVar = x17Var.M0;
            if (jxVar != null) {
                wne wneVarS = x17Var.L0;
                if (wneVarS == null) {
                    wneVarS = m8c.s((m82) eb3.H(x17Var, o82.a), (hue) eb3.H(x17Var, iue.a));
                }
                x17 x17Var2 = this.this$0;
                y72 y72Var = new y72(wneVarS.c(x17Var2.F0, false, x17Var2.J0));
                x17 x17Var3 = this.this$0;
                vz vzVarB = x17Var3.F0 ? vpf.B((s39) eb3.H(x17Var3, vm8.a), t39.d) : b21.O();
                this.label = 1;
                obj = jx.b(jxVar, y72Var, vzVarB, null, null, this, 12);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t17) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
