package defpackage;

import androidx.compose.foundation.layout.b;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zk6 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zk6(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        l46 l46Var;
        int i2;
        int i3 = this.a;
        Object obj5 = null;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        Object obj6 = this.d;
        Object obj7 = this.b;
        Object obj8 = this.f;
        Object obj9 = this.c;
        Object obj10 = this.e;
        switch (i3) {
            case 0:
                mx7 mx7Var = (mx7) obj;
                int iIntValue = ((Number) obj2).intValue();
                l46 l46Var2 = (l46) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                a26 a26Var = (a26) obj6;
                a26 a26Var2 = (a26) obj9;
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (l46Var2.g(mx7Var) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= l46Var2.e(iIntValue) ? 32 : 16;
                }
                if (l46Var2.W(i & 1, (i & 147) != 146)) {
                    bc4 bc4Var = (bc4) ((List) obj7).get(iIntValue);
                    l46Var2.f0(-779899327);
                    if (bc4Var instanceof zb4) {
                        l46Var2.f0(-779852301);
                        zb4 zb4Var = (zb4) bc4Var;
                        boolean zG = l46Var2.g(a26Var2) | l46Var2.i(bc4Var);
                        Object objR = l46Var2.R();
                        if (zG || objR == i8cVar) {
                            objR = new jk6(a26Var2, zb4Var, 1);
                            l46Var2.p0(objR);
                        }
                        x16 x16Var = (x16) objR;
                        boolean zI = l46Var2.i(bc4Var) | l46Var2.g(a26Var);
                        Object objR2 = l46Var2.R();
                        if (zI || objR2 == i8cVar) {
                            objR2 = new jk6(a26Var, zb4Var, 2);
                            l46Var2.p0(objR2);
                        }
                        al6.d(null, zb4Var, x16Var, (x16) objR2, l46Var2, 64);
                        l46Var = l46Var2;
                        jgb.p(null, l46Var, 0, 1);
                        l46Var.r(false);
                    } else {
                        l46Var = l46Var2;
                        if (!(bc4Var instanceof ac4)) {
                            throw tec.d(944673282, l46Var, false);
                        }
                        l46Var.f0(-779461670);
                        ac4 ac4Var = (ac4) bc4Var;
                        mxb.b(null, af1.b0(1551501665, new yk6((a26) obj10, ac4Var), l46Var), af1.b0(1458947392, new yk6(ac4Var, (a26) obj8), l46Var), l46Var, 432, 1);
                        jgb.p(null, l46Var, 0, 1);
                        l46Var.r(false);
                    }
                    l46Var.r(false);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 1:
                ly lyVar = (ly) obj;
                da9 da9Var = (da9) obj2;
                l46 l46Var3 = (l46) obj3;
                ((Number) obj4).intValue();
                boolean zT = pa7.t(((ltc) obj7).c.getValue(), (da9) obj9);
                if (!((Boolean) ((e89) obj10).getValue()).booleanValue() && !zT) {
                    List list = (List) ((h0e) obj8).getValue();
                    ListIterator listIterator = list.listIterator(list.size());
                    while (listIterator.hasPrevious()) {
                        Object objPrevious = listIterator.previous();
                        if (pa7.t(da9Var, (da9) objPrevious)) {
                            obj5 = objPrevious;
                            da9Var = (da9) obj5;
                        }
                    }
                    da9Var = (da9) obj5;
                }
                if (da9Var == null) {
                    l46Var3.f0(105930796);
                } else {
                    l46Var3.f0(-1520603531);
                    tq.f(da9Var, (qcc) obj6, af1.b0(-1263531443, new fw0(11, da9Var, lyVar), l46Var3), l46Var3, 384);
                }
                l46Var3.r(false);
                return wefVar;
            default:
                mx7 mx7Var2 = (mx7) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l46 l46Var4 = (l46) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                zt ztVar = (zt) obj10;
                sw3 sw3Var = (sw3) obj9;
                c6d c6dVar = (c6d) obj8;
                if ((iIntValue4 & 6) == 0) {
                    i2 = iIntValue4 | (l46Var4.g(mx7Var2) ? 4 : 2);
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= l46Var4.e(iIntValue3) ? 32 : 16;
                }
                if (l46Var4.W(i2 & 1, (i2 & 147) != 146)) {
                    d6d d6dVar = (d6d) ((List) obj7).get(iIntValue3);
                    l46Var4.f0(1954574032);
                    j09 j09VarD = b.d(b.p(g09.a, sw3Var.Z(c6dVar.b.b)), sw3Var.Z(d6dVar.d)).D((j09) obj6);
                    boolean zI2 = l46Var4.i(ztVar) | l46Var4.i(c6dVar) | l46Var4.g(d6dVar);
                    Object objR3 = l46Var4.R();
                    if (zI2 || objR3 == i8cVar) {
                        objR3 = new mz0(ztVar, c6dVar, d6dVar, 4);
                        l46Var4.p0(objR3);
                    }
                    nk8.e(0, (a26) objR3, l46Var4, j09VarD);
                    l46Var4.r(false);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
        }
    }
}
