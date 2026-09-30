package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b56 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a56 b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ b56(int i, a26 a26Var, a56 a56Var) {
        this.a = i;
        this.b = a56Var;
        this.c = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        int i3 = 2;
        mx4<a56> mx4Var = a56.c;
        final a26 a26Var = this.c;
        a56 a56Var = this.b;
        final int i4 = 1;
        final int i5 = 0;
        switch (i2) {
            case 0:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    j09 j09VarB0 = ynb.b0(24.0f, 0.0f, eb3.E(ynb.Y(b.c, xw9Var), xw9Var), 2);
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarB0);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    b21.b(0, l46Var, null, afc.q(R.string.annual_gender_title, l46Var));
                    String strQ = afc.q(R.string.annual_profile_enter_tips, l46Var);
                    mue mueVar = pue.a;
                    float f = 0.0f;
                    nte.b(strQ, null, ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 131066);
                    g09 g09Var = g09.a;
                    float f2 = 1.0f;
                    o5c.f(l46Var, b.d(g09Var, 1.0f));
                    l46Var.f0(1376631434);
                    for (final a56 a56Var2 : mx4Var) {
                        j09 j09VarF = b.f(96.0f, f, b.c(g09Var, f2), i3);
                        float f3 = f2;
                        boolean z = a56Var2 == a56Var;
                        boolean zE = l46Var.e(a56Var2.ordinal()) | l46Var.g(a26Var);
                        Object objR = l46Var.R();
                        if (zE || objR == i8cVar) {
                            objR = new x16() { // from class: c56
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i6 = i5;
                                    wef wefVar2 = wef.a;
                                    a56 a56Var3 = a56Var2;
                                    a26 a26Var2 = a26Var;
                                    switch (i6) {
                                        case 0:
                                            a26Var2.d(a56Var3);
                                            break;
                                        default:
                                            a26Var2.d(a56Var3);
                                            break;
                                    }
                                    return wefVar2;
                                }
                            };
                            l46Var.p0(objR);
                        }
                        y8c.b(z, j09VarF, 0.0f, (x16) objR, af1.b0(-1896615561, new i1(26, a56Var2), l46Var), l46Var, 24624);
                        f2 = f3;
                        f = 0.0f;
                        i3 = 2;
                    }
                    l46Var.r(false);
                    l46Var.r(true);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                    return wefVar;
                }
                for (final a56 a56Var3 : mx4Var) {
                    List list = rmc.a;
                    a56Var3.getClass();
                    int iOrdinal = a56Var3.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.seasonal_gender_female;
                    } else if (iOrdinal == 1) {
                        i = R.string.seasonal_gender_male;
                    } else {
                        if (iOrdinal != 2) {
                            ap.c();
                            return null;
                        }
                        i = R.string.seasonal_gender_secret;
                    }
                    String strQ2 = afc.q(i, l46Var2);
                    boolean z2 = a56Var3 == a56Var;
                    boolean zG = l46Var2.g(a26Var) | l46Var2.e(a56Var3.ordinal());
                    Object objR2 = l46Var2.R();
                    if (zG || objR2 == i8cVar) {
                        objR2 = new x16() { // from class: c56
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i6 = i4;
                                wef wefVar2 = wef.a;
                                a56 a56Var4 = a56Var3;
                                a26 a26Var2 = a26Var;
                                switch (i6) {
                                    case 0:
                                        a26Var2.d(a56Var4);
                                        break;
                                    default:
                                        a26Var2.d(a56Var4);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var2.p0(objR2);
                    }
                    xxb.e(0, (x16) objR2, l46Var2, strQ2, z2);
                }
                return wefVar;
        }
    }
}
