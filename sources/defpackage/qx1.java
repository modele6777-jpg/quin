package defpackage;

import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qx1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dd2 b;

    public /* synthetic */ qx1(dd2 dd2Var, int i) {
        this.a = i;
        this.b = dd2Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        dd2 dd2Var = this.b;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    dd2Var.z(l46Var, 0);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                g21.r(dd2Var, (l46) obj, k99.P(7));
                break;
            case 2:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    dd2Var.z(l46Var2, 6);
                }
                break;
            case 3:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    dd2Var.m(en5.a, l46Var3, 6);
                }
                break;
            case 4:
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    dd2Var.z(l46Var4, 0);
                }
                break;
            case 5:
                ((Integer) obj2).getClass();
                zr5.c(dd2Var, (l46) obj, k99.P(7));
                break;
            case 6:
                ((Integer) obj2).getClass();
                z7f.f(dd2Var, (l46) obj, k99.P(7));
                break;
            case 7:
                ((Integer) obj2).getClass();
                ok8.g(dd2Var, (l46) obj, k99.P(7));
                break;
            case 8:
                ((Integer) obj2).getClass();
                eb3.v(dd2Var, (l46) obj, k99.P(7));
                break;
            case 9:
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    dd2Var.z(l46Var5, 0);
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    m82 m82Var = (m82) l46Var6.k(o82.a);
                    vm8.b(new m82(rx8.a, y72.e, m82Var.c, m82Var.d, m82Var.e, m82Var.f, m82Var.g, m82Var.h, m82Var.i, m82Var.j, m82Var.k, m82Var.l, m82Var.m, m82Var.n, m82Var.o, m82Var.p, m82Var.q, m82Var.r, m82Var.s, m82Var.t, m82Var.u, m82Var.v, m82Var.w, m82Var.x, m82Var.y, m82Var.z, m82Var.A, m82Var.B, m82Var.C, m82Var.D, m82Var.E, m82Var.F, m82Var.G, m82Var.H, m82Var.I, m82Var.J, m82Var.K, m82Var.L, m82Var.M, m82Var.N, m82Var.O, m82Var.P, m82Var.Q, m82Var.R, m82Var.S, m82Var.T, m82Var.U, m82Var.V), null, null, this.b, l46Var6, 0, 6);
                }
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    dd2Var.z(l46Var7, 0);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                g21.p(dd2Var, (l46) obj, k99.P(7));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                g21.p(dd2Var, (l46) obj, k99.P(7));
                break;
            case 14:
                l46 l46Var8 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    dd2Var.z(l46Var8, 0);
                }
                break;
            case 15:
                l46 l46Var9 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var9.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var9.Z();
                } else {
                    dd2Var.z(l46Var9, 0);
                }
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                k8b.b(dd2Var, (l46) obj, k99.P(7));
                break;
            case 17:
                ((Integer) obj2).getClass();
                k8b.a(dd2Var, (l46) obj, k99.P(7));
                break;
            case 18:
                ((Integer) obj2).getClass();
                ksb.a(dd2Var, (l46) obj, k99.P(7));
                break;
            case 19:
                l46 l46Var10 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var10.Z();
                } else {
                    mh3.a(z3c.a.a(Boolean.TRUE), af1.b0(1492427592, new qx1(dd2Var, 21), l46Var10), l46Var10, 56);
                }
                break;
            case 20:
                ((Integer) obj2).getClass();
                z3c.b(dd2Var, (l46) obj, k99.P(7));
                break;
            case 21:
                l46 l46Var11 = (l46) obj;
                int iIntValue11 = ((Integer) obj2).intValue();
                if (!l46Var11.W(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    l46Var11.Z();
                } else {
                    dd2Var.z(l46Var11, 0);
                }
                break;
            case 22:
                l46 l46Var12 = (l46) obj;
                int iIntValue12 = ((Integer) obj2).intValue();
                if (!l46Var12.W(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    l46Var12.Z();
                } else {
                    dd2Var.m(c4c.a, l46Var12, 0);
                }
                break;
            case 23:
                l46 l46Var13 = (l46) obj;
                int iIntValue13 = ((Integer) obj2).intValue();
                if (!l46Var13.W(iIntValue13 & 1, (iIntValue13 & 3) != 2)) {
                    l46Var13.Z();
                } else {
                    dd2Var.z(l46Var13, 0);
                }
                break;
            case 24:
                ((Integer) obj2).getClass();
                xxb.a(dd2Var, (l46) obj, k99.P(7));
                break;
            case 25:
                l46 l46Var14 = (l46) obj;
                int iIntValue14 = ((Integer) obj2).intValue();
                if (!l46Var14.W(iIntValue14 & 1, (iIntValue14 & 3) != 2)) {
                    l46Var14.Z();
                } else {
                    dd2Var.z(l46Var14, 0);
                }
                break;
            case 26:
                ((Integer) obj2).getClass();
                fbc.a(dd2Var, (l46) obj, k99.P(7));
                break;
            case 27:
                l46 l46Var15 = (l46) obj;
                int iIntValue15 = ((Integer) obj2).intValue();
                if (!l46Var15.W(iIntValue15 & 1, (iIntValue15 & 3) != 2)) {
                    l46Var15.Z();
                } else {
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var15, 0);
                    int iHashCode = Long.hashCode(l46Var15.T);
                    u8a u8aVarM = l46Var15.m();
                    j09 j09VarJ = m93.J(l46Var15, g09.a);
                    lf2.q.getClass();
                    l46Var15.j0();
                    if (l46Var15.S) {
                        l46Var15.l(LayoutNode.h1);
                    } else {
                        l46Var15.s0();
                    }
                    dec.l(hj6.z, l46Var15, c92VarA);
                    dec.l(hj6.y, l46Var15, u8aVarM);
                    dec.l(hj6.X, l46Var15, Integer.valueOf(iHashCode));
                    dec.k(l46Var15);
                    dec.l(hj6.x, l46Var15, j09VarJ);
                    ks0.q(6, dd2Var, e92.a, l46Var15, true);
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                j7d.c(dd2Var, (l46) obj, k99.P(7));
                break;
            default:
                ((Integer) obj2).getClass();
                red.a(dd2Var, (l46) obj, k99.P(55));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ qx1(dd2 dd2Var, int i, int i2) {
        this.a = i2;
        this.b = dd2Var;
    }
}
