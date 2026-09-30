package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.r0;
import android.content.Context;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class as2 implements l26 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ as2(mic micVar, ju5 ju5Var, boolean z, a26 a26Var, a26 a26Var2, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, x16 x16Var5, a26 a26Var3, j09 j09Var, int i) {
        this.d = micVar;
        this.e = ju5Var;
        this.b = z;
        this.f = a26Var;
        this.g = a26Var2;
        this.c = x16Var;
        this.v = x16Var2;
        this.w = x16Var3;
        this.x = x16Var4;
        this.y = x16Var5;
        this.z = a26Var3;
        this.X = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Object obj3;
        final r0 r0Var;
        Context context;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj4 = this.X;
        Object obj5 = this.z;
        Object obj6 = this.y;
        Object obj7 = this.x;
        Object obj8 = this.w;
        Object obj9 = this.v;
        Object obj10 = this.g;
        Object obj11 = this.f;
        Object obj12 = this.e;
        Object obj13 = this.d;
        switch (i) {
            case 0:
                final r0 r0Var2 = (r0) obj13;
                final mma mmaVar = (mma) obj12;
                final Context context2 = (Context) obj11;
                final TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj10;
                final tr2 tr2Var = (tr2) obj9;
                final e89 e89Var = (e89) obj8;
                final e89 e89Var2 = (e89) obj7;
                final e89 e89Var3 = (e89) obj6;
                final e89 e89Var4 = (e89) obj5;
                String str = (String) obj4;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                final int i2 = 1;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    final int i3 = 0;
                    dd2 dd2VarB0 = af1.b0(-750807656, new l26() { // from class: hs2
                        @Override // defpackage.l26
                        public final Object z(Object obj14, Object obj15) {
                            int i4 = i3;
                            wef wefVar2 = wef.a;
                            g09 g09Var = g09.a;
                            e89 e89Var5 = e89Var;
                            r0 r0Var3 = r0Var2;
                            switch (i4) {
                                case 0:
                                    l46 l46Var2 = (l46) obj14;
                                    int iIntValue2 = ((Integer) obj15).intValue();
                                    if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        l46Var2.Z();
                                    } else if ((!r0Var3.Q() || ((Boolean) r0Var3.Q1.getValue()).booleanValue()) && r0Var3.V() == null && !r0Var3.p0()) {
                                        if (!r0Var3.m0() && r0Var3.H() == null) {
                                            l46Var2.f0(879268068);
                                            j09 j09VarP = pa7.p(g09Var, ((Boolean) e89Var5.getValue()).booleanValue() ? 0.0f : 1.0f);
                                            xn8 xn8VarC = s21.c(ndb.b, false);
                                            int iHashCode = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM = l46Var2.m();
                                            j09 j09VarJ = m93.J(l46Var2, j09VarP);
                                            lf2.q.getClass();
                                            l46Var2.j0();
                                            if (l46Var2.S) {
                                                l46Var2.l(LayoutNode.h1);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            dec.l(hj6.z, l46Var2, xn8VarC);
                                            dec.l(hj6.y, l46Var2, u8aVarM);
                                            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                                            dec.k(l46Var2);
                                            dec.l(hj6.x, l46Var2, j09VarJ);
                                            vd0.j(null, r0Var3.a0(), r0Var3.d0(), l46Var2, 0);
                                            l46Var2.r(true);
                                            l46Var2.r(false);
                                        } else {
                                            l46Var2.f0(879458346);
                                            l46Var2.r(false);
                                        }
                                    }
                                    break;
                                default:
                                    l46 l46Var3 = (l46) obj14;
                                    int iIntValue3 = ((Integer) obj15).intValue();
                                    if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        l46Var3.Z();
                                    } else if (!r0Var3.m0()) {
                                        l46Var3.f0(-540428893);
                                        gu6.b(od4.A(R.drawable.ic_close, 0, l46Var3), null, pa7.p(g09Var, ((Boolean) e89Var5.getValue()).booleanValue() ? 0.0f : 1.0f), 0L, l46Var3, 56, 8);
                                        l46Var3.r(false);
                                    } else {
                                        l46Var3.f0(-540192053);
                                        l46Var3.r(false);
                                    }
                                    break;
                            }
                            return wefVar2;
                        }
                    }, l46Var);
                    dd2 dd2VarB1 = af1.b0(-1093691465, new l26() { // from class: hs2
                        @Override // defpackage.l26
                        public final Object z(Object obj14, Object obj15) {
                            int i4 = i2;
                            wef wefVar2 = wef.a;
                            g09 g09Var = g09.a;
                            e89 e89Var5 = e89Var;
                            r0 r0Var3 = r0Var2;
                            switch (i4) {
                                case 0:
                                    l46 l46Var2 = (l46) obj14;
                                    int iIntValue2 = ((Integer) obj15).intValue();
                                    if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                        l46Var2.Z();
                                    } else if ((!r0Var3.Q() || ((Boolean) r0Var3.Q1.getValue()).booleanValue()) && r0Var3.V() == null && !r0Var3.p0()) {
                                        if (!r0Var3.m0() && r0Var3.H() == null) {
                                            l46Var2.f0(879268068);
                                            j09 j09VarP = pa7.p(g09Var, ((Boolean) e89Var5.getValue()).booleanValue() ? 0.0f : 1.0f);
                                            xn8 xn8VarC = s21.c(ndb.b, false);
                                            int iHashCode = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM = l46Var2.m();
                                            j09 j09VarJ = m93.J(l46Var2, j09VarP);
                                            lf2.q.getClass();
                                            l46Var2.j0();
                                            if (l46Var2.S) {
                                                l46Var2.l(LayoutNode.h1);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            dec.l(hj6.z, l46Var2, xn8VarC);
                                            dec.l(hj6.y, l46Var2, u8aVarM);
                                            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                                            dec.k(l46Var2);
                                            dec.l(hj6.x, l46Var2, j09VarJ);
                                            vd0.j(null, r0Var3.a0(), r0Var3.d0(), l46Var2, 0);
                                            l46Var2.r(true);
                                            l46Var2.r(false);
                                        } else {
                                            l46Var2.f0(879458346);
                                            l46Var2.r(false);
                                        }
                                    }
                                    break;
                                default:
                                    l46 l46Var3 = (l46) obj14;
                                    int iIntValue3 = ((Integer) obj15).intValue();
                                    if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                        l46Var3.Z();
                                    } else if (!r0Var3.m0()) {
                                        l46Var3.f0(-540428893);
                                        gu6.b(od4.A(R.drawable.ic_close, 0, l46Var3), null, pa7.p(g09Var, ((Boolean) e89Var5.getValue()).booleanValue() ? 0.0f : 1.0f), 0L, l46Var3, 56, 8);
                                        l46Var3.r(false);
                                    } else {
                                        l46Var3.f0(-540192053);
                                        l46Var3.r(false);
                                    }
                                    break;
                            }
                            return wefVar2;
                        }
                    }, l46Var);
                    boolean zI = l46Var.i(r0Var2);
                    final x16 x16Var = this.c;
                    boolean zG = zI | l46Var.g(x16Var) | l46Var.i(mmaVar) | l46Var.i(context2) | l46Var.e(tarotSkinIdentify.ordinal()) | l46Var.i(tr2Var);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        r0Var = r0Var2;
                        obj3 = new x16() { // from class: is2
                            @Override // defpackage.x16
                            public final Object invoke() {
                                r0 r0Var3 = r0Var;
                                boolean zM0 = r0Var3.m0();
                                wef wefVar2 = wef.a;
                                if (zM0) {
                                    return wefVar2;
                                }
                                if (!r0Var3.Q() && !r0Var3.e0()) {
                                    e89Var4.setValue(Boolean.TRUE);
                                    return wefVar2;
                                }
                                boolean zP0 = r0Var3.p0();
                                mma mmaVar2 = mmaVar;
                                Context context3 = context2;
                                TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                                e89 e89Var5 = e89Var2;
                                e89 e89Var6 = e89Var3;
                                if (zP0 && r0Var3.Q()) {
                                    lt2.c(mmaVar2, context3, r0Var3, tarotSkinIdentify2, e89Var5, e89Var6, new ds2(tr2Var, 1));
                                    return wefVar2;
                                }
                                lt2.c(mmaVar2, context3, r0Var3, tarotSkinIdentify2, e89Var5, e89Var6, x16Var);
                                return wefVar2;
                            }
                        };
                        context = context2;
                        l46Var.p0(obj3);
                    } else {
                        obj3 = objR;
                        context = context2;
                        r0Var = r0Var2;
                    }
                    oa7.h(null, dd2VarB0, dd2VarB1, (x16) obj3, af1.b0(-1798429363, new cl(r0Var, this.b, str, context, e89Var, 3), l46Var), l46Var, 25008);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                kj0.l((mic) obj13, (ju5) obj12, this.b, (a26) obj11, (a26) obj10, this.c, (x16) obj9, (x16) obj8, (x16) obj7, (x16) obj6, (a26) obj5, (j09) obj4, (l46) obj, k99.P(65));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ as2(r0 r0Var, x16 x16Var, mma mmaVar, Context context, TarotSkinIdentify tarotSkinIdentify, tr2 tr2Var, e89 e89Var, e89 e89Var2, e89 e89Var3, e89 e89Var4, boolean z, String str) {
        this.d = r0Var;
        this.c = x16Var;
        this.e = mmaVar;
        this.f = context;
        this.g = tarotSkinIdentify;
        this.v = tr2Var;
        this.w = e89Var;
        this.x = e89Var2;
        this.y = e89Var3;
        this.z = e89Var4;
        this.b = z;
        this.X = str;
    }
}
