package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ipb implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ kpb b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ ipb(int i, a26 a26Var, kpb kpbVar) {
        this.a = i;
        this.b = kpbVar;
        this.c = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.a;
        wef wefVar = wef.a;
        i8c i8cVar = sf2.a;
        mx4<kpb> mx4Var = kpb.c;
        final a26 a26Var = this.c;
        kpb kpbVar = this.b;
        final int i3 = 1;
        final int i4 = 0;
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
                    b21.b(0, l46Var, null, afc.q(R.string.annual_relationship_title, l46Var));
                    String strQ = afc.q(R.string.annual_profile_enter_tips, l46Var);
                    mue mueVar = pue.a;
                    nte.b(strQ, null, ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 131066);
                    l46Var.f0(-1322269875);
                    for (final kpb kpbVar2 : mx4Var) {
                        j09 j09VarF = b.f(96.0f, 0.0f, b.c(g09.a, 1.0f), 2);
                        boolean z = kpbVar2 == kpbVar;
                        boolean zG = l46Var.g(a26Var) | l46Var.e(kpbVar2.ordinal());
                        Object objR = l46Var.R();
                        if (zG || objR == i8cVar) {
                            objR = new x16() { // from class: jpb
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i5 = i4;
                                    wef wefVar2 = wef.a;
                                    kpb kpbVar3 = kpbVar2;
                                    a26 a26Var2 = a26Var;
                                    switch (i5) {
                                        case 0:
                                            a26Var2.d(kpbVar3);
                                            break;
                                        default:
                                            a26Var2.d(kpbVar3);
                                            break;
                                    }
                                    return wefVar2;
                                }
                            };
                            l46Var.p0(objR);
                        }
                        y8c.b(z, j09VarF, 0.0f, (x16) objR, af1.b0(-38432763, new wf8(15, kpbVar2), l46Var), l46Var, 24624);
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
                for (final kpb kpbVar3 : mx4Var) {
                    List list = rmc.a;
                    kpbVar3.getClass();
                    int iOrdinal = kpbVar3.ordinal();
                    if (iOrdinal == 0) {
                        i = R.string.seasonal_relationship_single;
                    } else if (iOrdinal == 1) {
                        i = R.string.seasonal_relationship_in_love;
                    } else {
                        if (iOrdinal != 2) {
                            ap.c();
                            return null;
                        }
                        i = R.string.seasonal_relationship_talking;
                    }
                    String strQ2 = afc.q(i, l46Var2);
                    boolean z2 = kpbVar3 == kpbVar;
                    boolean zG2 = l46Var2.g(a26Var) | l46Var2.e(kpbVar3.ordinal());
                    Object objR2 = l46Var2.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new x16() { // from class: jpb
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i5 = i3;
                                wef wefVar2 = wef.a;
                                kpb kpbVar4 = kpbVar3;
                                a26 a26Var2 = a26Var;
                                switch (i5) {
                                    case 0:
                                        a26Var2.d(kpbVar4);
                                        break;
                                    default:
                                        a26Var2.d(kpbVar4);
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
