package defpackage;

import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uzf implements o26 {
    public final /* synthetic */ List a;
    public final /* synthetic */ List b;
    public final /* synthetic */ xzf c;
    public final /* synthetic */ h0e d;

    public uzf(List list, List list2, xzf xzfVar, h0e h0eVar) {
        this.a = list;
        this.b = list2;
        this.c = xzfVar;
        this.d = h0eVar;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        fy9 fy9VarA;
        mx7 mx7Var = (mx7) obj;
        int iIntValue = ((Number) obj2).intValue();
        l46 l46Var = (l46) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (l46Var.g(mx7Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= l46Var.e(iIntValue) ? 32 : 16;
        }
        if (l46Var.W(i & 1, (i & 147) != 146)) {
            rzf rzfVar = (rzf) this.a.get(iIntValue);
            l46Var.f0(1697987192);
            boolean zContains = ((Set) this.d.getValue()).contains(rzfVar);
            Integer numC = rzfVar.c();
            if (numC == null) {
                l46Var.f0(1698131960);
                l46Var.r(false);
                fy9VarA = null;
            } else {
                l46Var.f0(1698131961);
                fy9VarA = od4.A(numC.intValue(), 0, l46Var);
                l46Var.r(false);
            }
            fy9 fy9Var = fy9VarA;
            String strQ = afc.q(rzfVar.b(), l46Var);
            boolean z = iIntValue < this.b.size() - 1;
            xzf xzfVar = this.c;
            boolean zI = l46Var.i(xzfVar) | l46Var.e(rzfVar.ordinal());
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new tzf(xzfVar, rzfVar, 0);
                l46Var.p0(objR);
            }
            af1.f(null, zContains, strQ, fy9Var, z, (a26) objR, l46Var, 4096);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
