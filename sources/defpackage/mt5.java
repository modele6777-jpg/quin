package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mt5 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ cs3 b;
    public final /* synthetic */ dd2 c;
    public final /* synthetic */ dd2 d;

    public /* synthetic */ mt5(dd2 dd2Var, cs3 cs3Var, dd2 dd2Var2) {
        this.c = dd2Var;
        this.b = cs3Var;
        this.d = dd2Var2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Integer num;
        int i = this.a;
        dd2 dd2Var = this.d;
        dd2 dd2Var2 = this.c;
        int i2 = 0;
        switch (i) {
            case 0:
                r6e r6eVar = (r6e) obj;
                kl2 kl2Var = (kl2) obj2;
                r6eVar.getClass();
                long jA = kl2.a(kl2Var.a, 0, 0, 0, Integer.MAX_VALUE, 3);
                Iterator it = mh3.c0(0, 3).iterator();
                y67 y67Var = (y67) it;
                if (y67Var.c) {
                    q67 q67Var = (q67) it;
                    int iNextInt = q67Var.nextInt();
                    Iterator it2 = r6eVar.z0(new dd2(new st5(dd2Var2, iNextInt, i2), true, -1093901724), tec.e(iNextInt, "measure_")).iterator();
                    if (it2.hasNext()) {
                        int i3 = ((tn8) it2.next()).v(jA).b;
                        while (it2.hasNext()) {
                            int i4 = ((tn8) it2.next()).v(jA).b;
                            if (i3 < i4) {
                                i3 = i4;
                            }
                        }
                        Integer numValueOf = Integer.valueOf(i3);
                        while (y67Var.c) {
                            int iNextInt2 = q67Var.nextInt();
                            Iterator it3 = r6eVar.z0(new dd2(new st5(dd2Var2, iNextInt2, i2), true, -1093901724), tec.e(iNextInt2, "measure_")).iterator();
                            if (it3.hasNext()) {
                                int i5 = ((tn8) it3.next()).v(jA).b;
                                while (it3.hasNext()) {
                                    int i6 = ((tn8) it3.next()).v(jA).b;
                                    if (i5 < i6) {
                                        i5 = i6;
                                    }
                                }
                                Integer numValueOf2 = Integer.valueOf(i5);
                                if (numValueOf.compareTo(numValueOf2) < 0) {
                                    numValueOf = numValueOf2;
                                }
                                i2 = 0;
                            }
                        }
                        num = numValueOf;
                    }
                    s8f.c();
                    return null;
                }
                num = null;
                int iIntValue = num != null ? num.intValue() : 0;
                List listZ0 = r6eVar.z0(new dd2(new mt5(this.b, dd2Var, dd2Var2), true, 1187528903), "pager");
                ArrayList arrayList = new ArrayList(t72.u(listZ0, 10));
                Iterator it4 = listZ0.iterator();
                while (it4.hasNext()) {
                    arrayList.add(((tn8) it4.next()).v(kl2.a(kl2Var.a, 0, 0, iIntValue, iIntValue, 3)));
                }
                return r6eVar.n0(kl2.h(kl2Var.a), iIntValue, qu4.a, new lr(3, arrayList));
            default:
                l46 l46Var = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i7 = 2;
                if (l46Var.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j09 j09VarC = b.c(g09.a, 1.0f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarC);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    cn1.h(0.0f, 0, 48, 16380, null, af1.b0(542028366, new uu0(dd2Var, i7), l46Var), l46Var, b.c, null, null, null, null, this.b, null, null, false);
                    dd2Var2.m(d31.a, l46Var, 6);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wef.a;
        }
    }

    public /* synthetic */ mt5(cs3 cs3Var, dd2 dd2Var, dd2 dd2Var2) {
        this.b = cs3Var;
        this.c = dd2Var;
        this.d = dd2Var2;
    }
}
