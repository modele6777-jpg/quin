package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gn implements xj5 {
    public final /* synthetic */ mmb a;
    public final /* synthetic */ aw2 b;
    public final /* synthetic */ l26 c;

    public gn(mmb mmbVar, aw2 aw2Var, l26 l26Var) {
        this.a = mmbVar;
        this.b = aw2Var;
        this.c = l26Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        en enVar;
        if (xn2Var instanceof en) {
            enVar = (en) xn2Var;
            int i = enVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                enVar.label = i - Integer.MIN_VALUE;
            } else {
                enVar = new en(this, xn2Var);
            }
        } else {
            enVar = new en(this, xn2Var);
        }
        Object obj2 = enVar.result;
        int i2 = enVar.label;
        mmb mmbVar = this.a;
        if (i2 == 0) {
            jzb.q(obj2);
            dg7 dg7Var = (dg7) mmbVar.element;
            if (dg7Var != null) {
                dg7Var.h(new qm());
                enVar.L$0 = obj;
                enVar.L$1 = dg7Var;
                enVar.label = 1;
                Object objU0 = dg7Var.U0(enVar);
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
            obj = enVar.L$0;
            jzb.q(obj2);
        }
        l26 l26Var = this.c;
        aw2 aw2Var = this.b;
        mmbVar.element = ynb.V(aw2Var, null, dw2.d, new cn(l26Var, obj, aw2Var, null), 1);
        return wef.a;
    }
}
