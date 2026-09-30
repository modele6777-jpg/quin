package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cw1 implements q36 {
    public final pv2 a;
    public final int b;
    public final i41 c;

    public cw1(pv2 pv2Var, int i, i41 i41Var) {
        this.a = pv2Var;
        this.b = i;
        this.c = i41Var;
    }

    @Override // defpackage.wj5
    public Object b(xj5 xj5Var, xn2 xn2Var) {
        Object objO = jgb.O(new aw1(xj5Var, this, null), xn2Var);
        return objO == bw2.a ? objO : wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    @Override // defpackage.q36
    public final wj5 c(pv2 pv2Var, int i, i41 i41Var) {
        pv2 pv2Var2 = this.a;
        pv2 pv2VarP0 = pv2Var.p0(pv2Var2);
        i41 i41Var2 = i41.a;
        i41 i41Var3 = this.c;
        int i2 = this.b;
        if (i41Var == i41Var2) {
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            i41Var = i41Var3;
        }
        return (pa7.t(pv2VarP0, pv2Var2) && i == i2 && i41Var == i41Var3) ? this : g(pv2VarP0, i, i41Var);
    }

    public String e() {
        return null;
    }

    public abstract Object f(awa awaVar, xn2 xn2Var);

    public abstract cw1 g(pv2 pv2Var, int i, i41 i41Var);

    public wj5 j() {
        return null;
    }

    public yv1 k(aw2 aw2Var) {
        int i = this.b;
        if (i == -3) {
            i = -2;
        }
        l26 bw1Var = new bw1(this, null);
        zva zvaVar = new zva(y7h.B(aw2Var, this.a), urg.a(i, this.c, null, 4));
        zvaVar.k0(dw2.c, zvaVar, bw1Var);
        return zvaVar;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strE = e();
        if (strE != null) {
            arrayList.add(strE);
        }
        nu4 nu4Var = nu4.a;
        pv2 pv2Var = this.a;
        if (pv2Var != nu4Var) {
            arrayList.add("context=" + pv2Var);
        }
        int i = this.b;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        i41 i41Var = i41.a;
        i41 i41Var2 = this.c;
        if (i41Var2 != i41Var) {
            arrayList.add("onBufferOverflow=" + i41Var2);
        }
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        return ub3.l(sb, s72.D0(arrayList, ", ", null, null, null, 62), ']');
    }
}
