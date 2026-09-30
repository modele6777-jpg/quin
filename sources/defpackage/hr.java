package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hr implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ e89 b;

    public /* synthetic */ hr(e89 e89Var, int i) {
        this.a = i;
        this.b = e89Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        gx6 gx6VarB;
        String str;
        int i = this.a;
        g09 g09Var = g09.a;
        i8c i8cVar = sf2.a;
        int i2 = 0;
        wef wefVar = wef.a;
        e89 e89Var = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objR = l46Var.R();
                    if (objR == i8cVar) {
                        objR = new z4(25);
                        l46Var.p0(objR);
                    }
                    t72.c(vwc.b(g09Var, false, (a26) objR), (l26) e89Var.getValue(), l46Var, 0);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                e89Var.setValue(new r2f(g21.w((a77) obj, (a77) obj2)));
                return wefVar;
            case 2:
                x16 x16Var = (x16) obj2;
                ((sw3) obj).getClass();
                x16Var.getClass();
                e89Var.setValue((ste) x16Var.invoke());
                return wefVar;
            case 3:
                int iIntValue2 = ((Integer) obj).intValue();
                ((cod) obj2).getClass();
                lld lldVar = ((d63) e89Var.getValue()).g;
                d63 d63Var = (d63) e89Var.getValue();
                List list = lldVar.a;
                ArrayList arrayList = new ArrayList(t72.u(list, 10));
                for (Object obj3 : list) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        t72.Z();
                        throw null;
                    }
                    cod codVarA = (cod) obj3;
                    omd omdVar = omd.a;
                    omd omdVar2 = omd.b;
                    if (i2 == iIntValue2 && codVarA.b == omdVar2) {
                        codVarA = cod.a(codVarA, omdVar);
                    } else if (codVarA.b == omdVar) {
                        codVarA = cod.a(codVarA, omdVar2);
                    }
                    arrayList.add(codVarA);
                    i2 = i3;
                }
                e89Var.setValue(d63.a(d63Var, lld.a(lldVar, arrayList, iIntValue2, null, false, false, 28)));
                return wefVar;
            case 4:
                l46 l46Var2 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    if (((dwf) e89Var.getValue()) == dwf.a) {
                        gx6VarB = tm7.G;
                        if (gx6VarB == null) {
                            fx6 fx6Var = new fx6("Outlined.Apps", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i4 = msf.a;
                            dtd dtdVar = new dtd(y72.b);
                            s71 s71Var = new s71(1);
                            s71Var.p(4.0f, 8.0f);
                            s71Var.m(4.0f);
                            s71Var.n(8.0f, 4.0f);
                            s71Var.n(4.0f, 4.0f);
                            s71Var.t(4.0f);
                            s71Var.h();
                            s71Var.p(10.0f, 20.0f);
                            s71Var.m(4.0f);
                            s71Var.t(-4.0f);
                            s71Var.m(-4.0f);
                            s71Var.t(4.0f);
                            s71Var.h();
                            s71Var.p(4.0f, 20.0f);
                            s71Var.m(4.0f);
                            s71Var.t(-4.0f);
                            s71Var.n(4.0f, 16.0f);
                            s71Var.t(4.0f);
                            s71Var.h();
                            s71Var.p(4.0f, 14.0f);
                            s71Var.m(4.0f);
                            s71Var.t(-4.0f);
                            s71Var.n(4.0f, 10.0f);
                            s71Var.t(4.0f);
                            s71Var.h();
                            s71Var.p(10.0f, 14.0f);
                            s71Var.m(4.0f);
                            s71Var.t(-4.0f);
                            s71Var.m(-4.0f);
                            s71Var.t(4.0f);
                            s71Var.h();
                            s71Var.p(16.0f, 4.0f);
                            s71Var.t(4.0f);
                            s71Var.m(4.0f);
                            s71Var.n(20.0f, 4.0f);
                            s71Var.m(-4.0f);
                            s71Var.h();
                            s71Var.p(10.0f, 8.0f);
                            s71Var.m(4.0f);
                            s71Var.n(14.0f, 4.0f);
                            s71Var.m(-4.0f);
                            s71Var.t(4.0f);
                            s71Var.h();
                            s71Var.p(16.0f, 14.0f);
                            s71Var.m(4.0f);
                            s71Var.t(-4.0f);
                            s71Var.m(-4.0f);
                            s71Var.t(4.0f);
                            s71Var.h();
                            s71Var.p(16.0f, 20.0f);
                            s71Var.m(4.0f);
                            s71Var.t(-4.0f);
                            s71Var.m(-4.0f);
                            s71Var.t(4.0f);
                            s71Var.h();
                            fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                            gx6VarB = fx6Var.b();
                            tm7.G = gx6VarB;
                        }
                    } else {
                        gx6VarB = y8c.a;
                        if (gx6VarB == null) {
                            fx6 fx6Var2 = new fx6("Outlined.ViewCarousel", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i5 = msf.a;
                            dtd dtdVar2 = new dtd(y72.b);
                            s71 s71Var2 = new s71(1);
                            s71Var2.p(2.0f, 7.0f);
                            s71Var2.m(4.0f);
                            s71Var2.t(10.0f);
                            s71Var2.l(2.0f);
                            s71Var2.s(7.0f);
                            s71Var2.h();
                            s71Var2.p(7.0f, 19.0f);
                            s71Var2.m(10.0f);
                            s71Var2.s(5.0f);
                            s71Var2.l(7.0f);
                            s71Var2.s(19.0f);
                            s71Var2.h();
                            s71Var2.p(9.0f, 7.0f);
                            s71Var2.m(6.0f);
                            s71Var2.t(10.0f);
                            s71Var2.l(9.0f);
                            s71Var2.s(7.0f);
                            s71Var2.h();
                            s71Var2.p(18.0f, 7.0f);
                            s71Var2.m(4.0f);
                            s71Var2.t(10.0f);
                            s71Var2.m(-4.0f);
                            s71Var2.s(7.0f);
                            s71Var2.h();
                            fx6.a(fx6Var2, s71Var2.b, dtdVar2, 1.0f, 1.0f, 2, 1.0f);
                            gx6VarB = fx6Var2.b();
                            y8c.a = gx6VarB;
                        }
                    }
                    gu6.a(gx6VarB, null, null, 0L, l46Var2, 48, 12);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 5:
                l46 l46Var3 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    str = ((Boolean) e89Var.getValue()).booleanValue() ? "已开启✓" : "开启";
                    Object objR2 = l46Var3.R();
                    if (objR2 == i8cVar) {
                        objR2 = new ok3(e89Var, 5);
                        l46Var3.p0(objR2);
                    }
                    j74.n(str, (x16) objR2, l46Var3, 48);
                    Object objR3 = l46Var3.R();
                    if (objR3 == i8cVar) {
                        objR3 = new ok3(e89Var, 6);
                        l46Var3.p0(objR3);
                    }
                    j74.n("关闭", (x16) objR3, l46Var3, 54);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 6:
                l46 l46Var4 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    str = ((Boolean) e89Var.getValue()).booleanValue() ? "已开启✓" : "开启";
                    Object objR4 = l46Var4.R();
                    if (objR4 == i8cVar) {
                        objR4 = new ok3(e89Var, 1);
                        l46Var4.p0(objR4);
                    }
                    j74.n(str, (x16) objR4, l46Var4, 48);
                    Object objR5 = l46Var4.R();
                    if (objR5 == i8cVar) {
                        objR5 = new ok3(e89Var, 2);
                        l46Var4.p0(objR5);
                    }
                    j74.n("关闭", (x16) objR5, l46Var4, 54);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 7:
                l46 l46Var5 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    str = ((Boolean) e89Var.getValue()).booleanValue() ? "已开启✓" : "开启";
                    Object objR6 = l46Var5.R();
                    if (objR6 == i8cVar) {
                        objR6 = new ok3(e89Var, 3);
                        l46Var5.p0(objR6);
                    }
                    j74.n(str, (x16) objR6, l46Var5, 48);
                    Object objR7 = l46Var5.R();
                    if (objR7 == i8cVar) {
                        objR7 = new ok3(e89Var, 4);
                        l46Var5.p0(objR7);
                    }
                    j74.n("关闭", (x16) objR7, l46Var5, 54);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 8:
                e89Var.setValue(new r2f(g21.w((a77) obj, (a77) obj2)));
                return wefVar;
            case 9:
                l46 l46Var6 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objR8 = l46Var6.R();
                    if (objR8 == i8cVar) {
                        objR8 = new ok3(e89Var, 17);
                        l46Var6.p0(objR8);
                    }
                    tm7.b(null, (x16) objR8, l46Var6, 48, 1);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            default:
                l46 l46Var7 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    j09 j09VarD = b.d(mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 12.0f, 7, ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2))), 56.0f);
                    y6c y6cVar = a7c.a;
                    String strQ = afc.q(R.string.invitation_button, l46Var7);
                    Object objR9 = l46Var7.R();
                    if (objR9 == i8cVar) {
                        objR9 = new ok3(e89Var, 27);
                        l46Var7.p0(objR9);
                    }
                    c8b.i(j09VarD, strQ, null, null, 0L, 0.0f, false, y6cVar, null, false, null, null, (x16) objR9, l46Var7, 0, 384, 3964);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
        }
    }
}
