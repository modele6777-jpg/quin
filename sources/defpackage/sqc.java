package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sqc implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pu1 b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ sqc(int i, pu1 pu1Var, a26 a26Var) {
        this.a = i;
        this.b = pu1Var;
        this.c = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        mx4<pu1> mx4Var = pu1.e;
        final a26 a26Var = this.c;
        pu1 pu1Var = this.b;
        final int i3 = 1;
        final int i4 = 0;
        switch (i2) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                    return wefVar;
                }
                for (final pu1 pu1Var2 : mx4Var) {
                    List list = rmc.a;
                    pu1Var2.getClass();
                    int iOrdinal = pu1Var2.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.seasonal_career_middle_high;
                    } else if (iOrdinal == 1) {
                        i = R.string.seasonal_career_college;
                    } else if (iOrdinal == 2) {
                        i = R.string.seasonal_career_worker;
                    } else {
                        if (iOrdinal != 3) {
                            ap.c();
                            return null;
                        }
                        i = R.string.seasonal_career_freelance;
                    }
                    String strQ = afc.q(i, l46Var);
                    boolean z = pu1Var2 == pu1Var;
                    boolean zG = l46Var.g(a26Var) | l46Var.e(pu1Var2.ordinal());
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new x16() { // from class: tqc
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i5 = i4;
                                wef wefVar2 = wef.a;
                                pu1 pu1Var3 = pu1Var2;
                                a26 a26Var2 = a26Var;
                                switch (i5) {
                                    case 0:
                                        a26Var2.d(pu1Var3);
                                        break;
                                    default:
                                        a26Var2.d(pu1Var3);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var.p0(objR);
                    }
                    xxb.e(0, (x16) objR, l46Var, strQ, z);
                }
                return wefVar;
            default:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var2.g(xw9Var) ? 4 : 2;
                }
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    j09 j09VarB0 = ynb.b0(24.0f, 0.0f, eb3.E(ynb.Y(b.c, xw9Var), xw9Var), 2);
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarB0);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, c92VarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    b21.b(0, l46Var2, null, afc.q(R.string.annual_career_title, l46Var2));
                    String strQ2 = afc.q(R.string.profile_label_tips, l46Var2);
                    mue mueVar = pue.a;
                    nte.b(strQ2, null, ((e8b) l46Var2.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var2), l46Var2, 0, 0, 131066);
                    l46Var2.f0(-1328447347);
                    for (final pu1 pu1Var3 : mx4Var) {
                        j09 j09VarF = b.f(96.0f, 0.0f, b.c(g09.a, 1.0f), 2);
                        boolean z2 = pu1Var == pu1Var3;
                        boolean zG2 = l46Var2.g(a26Var) | l46Var2.e(pu1Var3.ordinal());
                        Object objR2 = l46Var2.R();
                        if (zG2 || objR2 == i8cVar) {
                            objR2 = new x16() { // from class: tqc
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i5 = i3;
                                    wef wefVar2 = wef.a;
                                    pu1 pu1Var4 = pu1Var3;
                                    a26 a26Var2 = a26Var;
                                    switch (i5) {
                                        case 0:
                                            a26Var2.d(pu1Var4);
                                            break;
                                        default:
                                            a26Var2.d(pu1Var4);
                                            break;
                                    }
                                    return wefVar2;
                                }
                            };
                            l46Var2.p0(objR2);
                        }
                        y8c.b(z2, j09VarF, 0.0f, (x16) objR2, af1.b0(870890429, new z8d(14, pu1Var3), l46Var2), l46Var2, 24624);
                    }
                    l46Var2.r(false);
                    l46Var2.r(true);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
        }
    }
}
