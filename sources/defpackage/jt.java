package defpackage;

import ai.askquin.R;
import ai.askquin.ui.draw.photo.homepage.QuestionInputRoute;
import ai.askquin.ui.onboard.OnboardAuthRoute;
import ai.askquin.ui.onboard.OnboardHearFromRoute;
import ai.askquin.ui.onboard.OnboardProfileSyncRoute;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ jt(x16 x16Var, boolean z, wp9 wp9Var, e89 e89Var, xzf xzfVar, a26 a26Var) {
        this.a = 12;
        this.b = x16Var;
        this.c = z;
        this.d = wp9Var;
        this.e = e89Var;
        this.f = xzfVar;
        this.g = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        int i2 = 7;
        byte b = 0;
        boolean z = this.c;
        int i3 = 1;
        wef wefVar = wef.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                mt.b((dd2) obj6, (x16) obj7, (j09) obj5, this.c, (tr8) obj4, (xw9) obj3, (l46) obj, k99.P(7));
                break;
            case 1:
                e89 e89Var = (e89) obj6;
                x16 x16Var = (x16) obj7;
                x16 x16Var2 = (x16) obj5;
                die dieVar = (die) obj4;
                fy9 fy9Var = (fy9) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    FillElement fillElement = b.c;
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = new pg(e89Var, 12);
                        l46Var.p0(objR);
                    }
                    j09 j09VarB = vwc.b(fillElement, false, (a26) objR);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarB);
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
                    xdc.a(null, af1.b0(-1497217021, new mb0(z, x16Var2, i3), l46Var), null, null, null, 0, y72.j, 0L, null, af1.b0(-864536360, new mp1(dieVar, fy9Var, e89Var, i3), l46Var), l46Var, 806879280, 445);
                    qp1 qp1Var = (qp1) e89Var.getValue();
                    qp1 qp1Var2 = qp1.g;
                    if (qp1Var == qp1Var2 || ((qp1) e89Var.getValue()) == qp1.v) {
                        l46Var.f0(931311795);
                        j09 j09VarF = b.f(56.0f, 0.0f, mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, b.c(d31.a.a(g09.a, ndb.w), 1.0f), 2))), 2);
                        String strQ = afc.q(R.string.text_next_step, l46Var);
                        boolean z2 = ((qp1) e89Var.getValue()) == qp1Var2;
                        boolean zG = l46Var.g(x16Var);
                        Object objR2 = l46Var.R();
                        if (zG || objR2 == i8cVar) {
                            objR2 = new k8(x16Var, e89Var, i3);
                            l46Var.p0(objR2);
                        }
                        c8b.i(j09VarF, strQ, null, null, 0L, 0.0f, z2, null, null, false, null, null, (x16) objR2, l46Var, 0, 0, 4028);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(932057531);
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                }
                break;
            case 2:
                x16 x16Var3 = (x16) obj7;
                wp9 wp9Var = (wp9) obj6;
                gj6 gj6Var = (gj6) obj5;
                x16 x16Var4 = (x16) obj4;
                e89 e89Var2 = (e89) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    xdc.a(b.c, af1.b0(-1166947146, new xi6(x16Var3, wp9Var, b == true ? 1 : 0), l46Var2), af1.b0(543703701, new kg(z, gj6Var, x16Var4, i2), l46Var2), null, null, 0, y72.j, 0L, null, af1.b0(-1527693173, new w7(24, e89Var2, gj6Var), l46Var2), l46Var2, 806879670, 440);
                }
                break;
            case 3:
                rn9 rn9Var = (rn9) obj6;
                OnboardAuthRoute onboardAuthRoute = (OnboardAuthRoute) obj7;
                cb9 cb9Var = (cb9) obj5;
                aw2 aw2Var = (aw2) obj4;
                Context context = (Context) obj3;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                String str = (String) obj2;
                str.getClass();
                bsc bscVar = dsc.a;
                if (zBooleanValue) {
                    bscVar.b = true;
                }
                boolean zG2 = rn9Var.g(zBooleanValue);
                ca2.a.getClass();
                if (ca2.c) {
                    hs3 hs3Var = xqa.c;
                    ynb.V(lw2.a, null, null, new uo9(hs3Var.a, Boolean.valueOf(zG2), null), 3);
                }
                if (onboardAuthRoute.getAfterFirstReading()) {
                    bt5 bt5Var = new bt5(str, 14);
                    if (ca2.c) {
                        x1f x1fVar = x1f.a;
                        x1f.k(new r05("registration_complete"), bt5Var, 2);
                    }
                    cb9Var.d(new xn9(4), new OnboardProfileSyncRoute(zG2));
                } else if (!zBooleanValue) {
                    if (z) {
                        tj7 tj7Var = tj7.L0;
                        if (ca2.c) {
                            x1f x1fVar2 = x1f.a;
                            x1f.k(new r05("restore_purchase_success"), tj7Var, 2);
                        }
                    }
                    ynb.V(aw2Var, null, null, new lo9(rn9Var, context, cb9Var, null), 3);
                } else {
                    ka9.e(cb9Var, OnboardHearFromRoute.INSTANCE, null, 6);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                t72.o((String) obj6, this.c, (x16) obj7, (x16) obj5, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case 5:
                aw2 aw2Var2 = (aw2) obj6;
                e89 e89Var3 = (e89) obj7;
                jr2 jr2Var = (jr2) obj5;
                QuestionInputRoute questionInputRoute = (QuestionInputRoute) obj4;
                ka9 ka9Var = (ka9) obj3;
                String str2 = (String) obj;
                List list = (List) obj2;
                str2.getClass();
                list.getClass();
                if (!((Boolean) e89Var3.getValue()).booleanValue() && !z) {
                    e89Var3.setValue(Boolean.TRUE);
                    ynb.V(aw2Var2, null, null, new pda(jr2Var, questionInputRoute, list, str2, ka9Var, null), 3);
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                rxg.s((tr2) obj6, (w4b) obj5, (a26) obj4, (x16) obj7, this.c, (x16) obj3, (l46) obj, k99.P(9));
                break;
            case 7:
                ((Integer) obj2).getClass();
                vtb.b((jkc) obj6, (egd) obj4, this.c, (x16) obj7, (x16) obj3, (j09) obj5, (l46) obj, k99.P(9));
                break;
            case 8:
                ((Integer) obj2).getClass();
                q3c.c(this.c, (use) obj6, (x16) obj7, (x16) obj5, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                a6c.b(this.c, (kpb) obj6, (a26) obj5, (x16) obj7, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                w6c.c(this.c, (pu1) obj6, (a26) obj5, (x16) obj7, (x16) obj4, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                y8c.f((List) obj6, this.c, (mue) obj7, (mue) obj4, (j09) obj5, (j09) obj3, (l46) obj, k99.P(1794049));
                break;
            default:
                x16 x16Var5 = (x16) obj7;
                wp9 wp9Var2 = (wp9) obj6;
                h0e h0eVar = (h0e) obj5;
                xzf xzfVar = (xzf) obj4;
                a26 a26Var = (a26) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    int i4 = 19;
                    xdc.a(b.c, af1.b0(435622113, new kg(17, x16Var5, wp9Var2, z), l46Var3), af1.b0(-452415424, new o7b(h0eVar, xzfVar, a26Var, i4), l46Var3), null, null, 0, y72.j, 0L, null, af1.b0(-1931055818, new s19(i4, h0eVar, xzfVar), l46Var3), l46Var3, 806879670, 440);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ jt(tr2 tr2Var, w4b w4bVar, a26 a26Var, x16 x16Var, boolean z, x16 x16Var2, int i) {
        this.a = 6;
        this.d = tr2Var;
        this.e = w4bVar;
        this.f = a26Var;
        this.b = x16Var;
        this.c = z;
        this.g = x16Var2;
    }

    public /* synthetic */ jt(x16 x16Var, wp9 wp9Var, boolean z, gj6 gj6Var, x16 x16Var2, e89 e89Var) {
        this.a = 2;
        this.b = x16Var;
        this.d = wp9Var;
        this.c = z;
        this.e = gj6Var;
        this.f = x16Var2;
        this.g = e89Var;
    }

    public /* synthetic */ jt(dd2 dd2Var, x16 x16Var, j09 j09Var, boolean z, tr8 tr8Var, xw9 xw9Var, int i) {
        this.a = 0;
        this.d = dd2Var;
        this.b = x16Var;
        this.e = j09Var;
        this.c = z;
        this.f = tr8Var;
        this.g = xw9Var;
    }

    public /* synthetic */ jt(e89 e89Var, x16 x16Var, boolean z, x16 x16Var2, die dieVar, fy9 fy9Var) {
        this.a = 1;
        this.d = e89Var;
        this.b = x16Var;
        this.c = z;
        this.e = x16Var2;
        this.f = dieVar;
        this.g = fy9Var;
    }

    public /* synthetic */ jt(rn9 rn9Var, OnboardAuthRoute onboardAuthRoute, cb9 cb9Var, boolean z, aw2 aw2Var, Context context) {
        this.a = 3;
        this.d = rn9Var;
        this.b = onboardAuthRoute;
        this.e = cb9Var;
        this.c = z;
        this.f = aw2Var;
        this.g = context;
    }

    public /* synthetic */ jt(jkc jkcVar, egd egdVar, boolean z, x16 x16Var, x16 x16Var2, j09 j09Var, int i) {
        this.a = 7;
        this.d = jkcVar;
        this.f = egdVar;
        this.c = z;
        this.b = x16Var;
        this.g = x16Var2;
        this.e = j09Var;
    }

    public /* synthetic */ jt(String str, boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, int i) {
        this.a = 4;
        this.d = str;
        this.c = z;
        this.b = x16Var;
        this.e = x16Var2;
        this.f = x16Var3;
        this.g = x16Var4;
    }

    public /* synthetic */ jt(List list, boolean z, mue mueVar, mue mueVar2, j09 j09Var, j09 j09Var2, int i) {
        this.a = 11;
        this.d = list;
        this.c = z;
        this.b = mueVar;
        this.f = mueVar2;
        this.e = j09Var;
        this.g = j09Var2;
    }

    public /* synthetic */ jt(boolean z, aw2 aw2Var, e89 e89Var, jr2 jr2Var, QuestionInputRoute questionInputRoute, ka9 ka9Var) {
        this.a = 5;
        this.c = z;
        this.d = aw2Var;
        this.b = e89Var;
        this.e = jr2Var;
        this.f = questionInputRoute;
        this.g = ka9Var;
    }

    public /* synthetic */ jt(boolean z, use useVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, int i) {
        this.a = 8;
        this.c = z;
        this.d = useVar;
        this.b = x16Var;
        this.e = x16Var2;
        this.f = x16Var3;
        this.g = x16Var4;
    }

    public /* synthetic */ jt(boolean z, Enum r2, a26 a26Var, x16 x16Var, x16 x16Var2, x16 x16Var3, int i, int i2) {
        this.a = i2;
        this.c = z;
        this.d = r2;
        this.e = a26Var;
        this.b = x16Var;
        this.f = x16Var2;
        this.g = x16Var3;
    }
}
