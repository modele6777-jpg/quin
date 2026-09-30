package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kw1 implements xj5 {
    public final /* synthetic */ mmb a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ mw1 c;
    public final /* synthetic */ xj5 d;

    public kw1(mmb mmbVar, aw2 aw2Var, mw1 mw1Var, xj5 xj5Var) {
        this.a = mmbVar;
        this.b = aw2Var;
        this.c = mw1Var;
        this.d = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        jw1 jw1Var;
        if (xn2Var instanceof jw1) {
            jw1Var = (jw1) xn2Var;
            int i = jw1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jw1Var.label = i - Integer.MIN_VALUE;
            } else {
                jw1Var = new jw1(this, xn2Var);
            }
        } else {
            jw1Var = new jw1(this, xn2Var);
        }
        Object obj2 = jw1Var.result;
        int i2 = jw1Var.label;
        mmb mmbVar = this.a;
        if (i2 == 0) {
            jzb.q(obj2);
            dg7 dg7Var = (dg7) mmbVar.element;
            if (dg7Var != null) {
                dg7Var.h(new vy1("Child of the scoped flow was cancelled"));
                jw1Var.L$0 = obj;
                jw1Var.L$1 = dg7Var;
                jw1Var.L$2 = null;
                jw1Var.I$0 = 0;
                jw1Var.label = 1;
                Object objU0 = dg7Var.U0(jw1Var);
                bw2 bw2Var = bw2.a;
                if (objU0 == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = jw1Var.L$0;
            jzb.q(obj2);
        }
        mmbVar.element = ynb.V(this.b, null, dw2.d, new iw1(this.c, this.d, obj, null), 1);
        return wef.a;
    }
}
