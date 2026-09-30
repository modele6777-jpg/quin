package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n75 implements xj5 {
    public final /* synthetic */ xj5 a;

    public n75(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        m75 m75Var;
        if (xn2Var instanceof m75) {
            m75Var = (m75) xn2Var;
            int i = m75Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                m75Var.label = i - Integer.MIN_VALUE;
            } else {
                m75Var = new m75(this, xn2Var);
            }
        } else {
            m75Var = new m75(this, xn2Var);
        }
        Object obj2 = m75Var.result;
        int i2 = m75Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            Map map = ((lb8) obj).u;
            m75Var.L$0 = null;
            m75Var.L$1 = null;
            m75Var.L$2 = null;
            m75Var.L$3 = null;
            m75Var.label = 1;
            Object objA = this.a.a(map, m75Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
