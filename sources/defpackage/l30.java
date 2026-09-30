package defpackage;

import ai.askquin.R;
import ai.askquin.ui.conversation.FailReason;
import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l30 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ l30(dd2 dd2Var, Integer num, pad padVar, boolean z, a26 a26Var) {
        this.a = 18;
        this.d = dd2Var;
        this.c = num;
        this.e = padVar;
        this.b = z;
        this.f = a26Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v16 */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ?? r5;
        Object obj3;
        boolean z;
        Object obj4;
        boolean z2;
        Object obj5;
        int iG;
        int iG2;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        final boolean z3 = this.b;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        Object obj6 = this.c;
        Object obj7 = this.f;
        Object obj8 = this.e;
        Object obj9 = this.d;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                m93.f((v50) obj9, this.b, (x16) obj6, (x16) obj8, (x16) obj7, (l46) obj, k99.P(1));
                return wefVar;
            case 1:
                aee aeeVar = (aee) obj9;
                x16 x16Var = (x16) obj6;
                l26 l26Var = (l26) obj8;
                n69 n69Var = (n69) obj7;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Bitmap bitmap = aeeVar.a;
                    boolean z4 = this.b;
                    boolean zH = l46Var.h(z4);
                    Object objR = l46Var.R();
                    if (zH || objR == i8cVar) {
                        objR = new bs0(z4, n69Var, 1);
                        l46Var.p0(objR);
                    }
                    a26 a26Var = (a26) objR;
                    boolean zG = l46Var.g(l26Var) | l46Var.i(bitmap);
                    Object objR2 = l46Var.R();
                    if (zG || objR2 == i8cVar) {
                        objR2 = new j8(l26Var, bitmap, n69Var, 8);
                        l46Var.p0(objR2);
                    }
                    qn4.l(z4, a26Var, x16Var, (x16) objR2, l46Var, 0);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                ((Integer) obj2).getClass();
                af1.e((j09) obj9, this.b, (String) obj6, (fy9) obj8, (a26) obj7, (l46) obj, k99.P(4103));
                return wefVar;
            case 3:
                ((Integer) obj2).getClass();
                eb3.i((j09) obj9, (use) obj6, (String) obj8, this.b, (a26) obj7, (l46) obj, k99.P(7));
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                ga5.a((j09) obj9, (FailReason) obj7, this.b, (x16) obj6, (x16) obj8, (l46) obj, k99.P(1));
                return wefVar;
            case 5:
                ((Integer) obj2).getClass();
                kj0.B((j09) obj9, this.b, (iwa) obj8, (x16) obj6, (a26) obj7, (l46) obj, k99.P(513));
                return wefVar;
            case 6:
                ((Integer) obj2).getClass();
                qx8.c((String) obj9, (ij) obj7, this.b, (x16) obj6, (x16) obj8, (l46) obj, k99.P(65));
                return wefVar;
            case 7:
                String str = (String) obj9;
                e83 e83Var = (e83) obj7;
                x16 x16Var2 = (x16) obj6;
                x16 x16Var3 = (x16) obj8;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    j09 j09VarN = mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(24.0f, 0.0f, b.c(g09Var, 1.0f), 2)));
                    c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarN);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, c92VarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    c8b.i(androidx.compose.ui.platform.b.a(b.f(56.0f, 0.0f, b.c(g09Var, 1.0f), 2), str), afc.q(R.string.daily_fortune_reminder_multi_cta, l46Var2), null, null, 0L, 0.0f, (e83Var.a || e83Var.b) && !z3, null, null, false, null, null, x16Var2, l46Var2, 0, 0, 4028);
                    cgg.m(x16Var3, b.c(g09Var, 1.0f), !z3, null, null, null, qn4.e, l46Var2, 805306416, 504);
                    l46Var2.r(true);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 8:
                ((Integer) obj2).getClass();
                beb.a((TarotCardChoice) obj9, (String) obj6, this.b, (l26) obj8, (a26) obj7, (l46) obj, k99.P(1));
                return wefVar;
            case 9:
                ((Integer) obj2).getClass();
                vtb.d((mic) obj9, this.b, (a26) obj7, (x16) obj6, (x16) obj8, (l46) obj, k99.P(1));
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                tn4 tn4Var = (tn4) obj9;
                final jkc jkcVar = (jkc) obj7;
                x16 x16Var4 = (x16) obj6;
                x16 x16Var5 = (x16) obj8;
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    int iOrdinal = tn4Var.ordinal();
                    if (iOrdinal == 0) {
                        l46Var3.f0(-1373124408);
                        String strQ = afc.q(R.string.seasonal_start_draw, l46Var3);
                        boolean zH2 = l46Var3.h(z3) | l46Var3.i(jkcVar);
                        Object objR3 = l46Var3.R();
                        if (zH2 || objR3 == i8cVar) {
                            r5 = 0;
                            final boolean z5 = false ? 1 : 0;
                            x16 x16Var6 = new x16() { // from class: ekc
                                @Override // defpackage.x16
                                public final Object invoke() {
                                    int i2 = z5;
                                    wef wefVar2 = wef.a;
                                    p05 p05Var = p05.a;
                                    jkc jkcVar2 = jkcVar;
                                    boolean z6 = z3;
                                    switch (i2) {
                                        case 0:
                                            if (z6) {
                                                x1f x1fVar = x1f.a;
                                                x1f.k(p05Var, new pdc(22), 2);
                                            }
                                            jkcVar2.v.setValue(tn4.c);
                                            break;
                                        default:
                                            if (z6) {
                                                x1f x1fVar2 = x1f.a;
                                                x1f.k(p05Var, new pdc(21), 2);
                                            }
                                            jkcVar2.v.setValue(tn4.a);
                                            break;
                                    }
                                    return wefVar2;
                                }
                            };
                            l46Var3.p0(x16Var6);
                            obj3 = x16Var6;
                        } else {
                            r5 = 0;
                            obj3 = objR3;
                        }
                        vtb.c(r5, (x16) obj3, l46Var3, null, strQ);
                        l46Var3.r(r5);
                    } else if (iOrdinal == 1) {
                        l46Var3.f0(1895382521);
                        if (jkcVar.k()) {
                            l46Var3.f0(-1372676458);
                            String strQ2 = afc.q(R.string.seasonal_start_reading, l46Var3);
                            boolean zH3 = l46Var3.h(z3) | l46Var3.g(x16Var4);
                            Object objR4 = l46Var3.R();
                            if (zH3 || objR4 == i8cVar) {
                                obj5 = objR4;
                                on2 on2Var = new on2(z3, x16Var4, 5);
                                l46Var3.p0(on2Var);
                                obj5 = on2Var;
                            }
                            vtb.c(0, (x16) obj5, l46Var3, null, strQ2);
                            l46Var3.r(false);
                            z2 = false;
                        } else {
                            l46Var3.f0(-1372246736);
                            j09 j09VarC = b.c(g09Var, 1.0f);
                            c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var3, 54);
                            int iHashCode2 = Long.hashCode(l46Var3.T);
                            u8a u8aVarM2 = l46Var3.m();
                            j09 j09VarJ2 = m93.J(l46Var3, j09VarC);
                            lf2.q.getClass();
                            l46Var3.j0();
                            if (l46Var3.S) {
                                l46Var3.l(ov7Var);
                            } else {
                                l46Var3.s0();
                            }
                            dec.l(hj6.z, l46Var3, c92VarA2);
                            dec.l(hj6.y, l46Var3, u8aVarM2);
                            dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                            dec.k(l46Var3);
                            dec.l(hj6.x, l46Var3, j09VarJ2);
                            String strQ3 = afc.q(R.string.seasonal_physical_draw, l46Var3);
                            boolean zH4 = l46Var3.h(z3) | l46Var3.g(x16Var5);
                            Object objR5 = l46Var3.R();
                            Object obj10 = objR5;
                            if (zH4 || objR5 == i8cVar) {
                                on2 on2Var2 = new on2(z3, x16Var5, 6);
                                l46Var3.p0(on2Var2);
                                obj10 = on2Var2;
                            }
                            c8b.f(null, strQ3, null, false, (x16) obj10, l46Var3, 0, 13);
                            String strQ4 = afc.q(R.string.seasonal_start_shuffle, l46Var3);
                            boolean zH5 = l46Var3.h(z3) | l46Var3.i(jkcVar);
                            Object objR6 = l46Var3.R();
                            if (zH5 || objR6 == i8cVar) {
                                z = true;
                                final boolean z6 = true ? 1 : 0;
                                x16 x16Var7 = new x16() { // from class: ekc
                                    @Override // defpackage.x16
                                    public final Object invoke() {
                                        int i2 = z6;
                                        wef wefVar2 = wef.a;
                                        p05 p05Var = p05.a;
                                        jkc jkcVar2 = jkcVar;
                                        boolean z7 = z3;
                                        switch (i2) {
                                            case 0:
                                                if (z7) {
                                                    x1f x1fVar = x1f.a;
                                                    x1f.k(p05Var, new pdc(22), 2);
                                                }
                                                jkcVar2.v.setValue(tn4.c);
                                                break;
                                            default:
                                                if (z7) {
                                                    x1f x1fVar2 = x1f.a;
                                                    x1f.k(p05Var, new pdc(21), 2);
                                                }
                                                jkcVar2.v.setValue(tn4.a);
                                                break;
                                        }
                                        return wefVar2;
                                    }
                                };
                                l46Var3.p0(x16Var7);
                                obj4 = x16Var7;
                            } else {
                                z = true;
                                obj4 = objR6;
                            }
                            z2 = false;
                            vtb.c(0, (x16) obj4, l46Var3, null, strQ4);
                            l46Var3.r(z);
                            l46Var3.r(false);
                        }
                        l46Var3.r(z2);
                    } else {
                        if (iOrdinal != 2) {
                            throw tec.d(1895368674, l46Var3, false);
                        }
                        l46Var3.f0(1895430978);
                        l46Var3.r(false);
                    }
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                mxb.a(this.b, (a56) obj9, (a26) obj7, (x16) obj6, (x16) obj8, (l46) obj, k99.P(1));
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                x16 x16Var8 = (x16) obj6;
                SolarTerm solarTerm = (SolarTerm) obj9;
                fpc fpcVar = (fpc) obj8;
                e89 e89Var = (e89) obj7;
                l46 l46Var4 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var4.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    pa7.d(null, 0L, 0L, null, af1.b0(633064040, new roc(false ? 1 : 0, solarTerm), l46Var4), af1.b0(525957535, new ck(this.b, solarTerm, fpcVar, e89Var, 9), l46Var4), false, x16Var8, l46Var4, 221184, 79);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                b4d.k((x16) obj6, this.b, (x16) obj8, (yic) obj9, (x16) obj7, (l46) obj, k99.P(1));
                return wefVar;
            case 14:
                d0e d0eVar = (d0e) obj9;
                String str2 = (String) obj8;
                x16 x16Var9 = (x16) obj6;
                Context context = (Context) obj7;
                l46 l46Var5 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (l46Var5.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    boolean zG2 = l46Var5.g(str2) | l46Var5.g(x16Var9);
                    Object objR7 = l46Var5.R();
                    if (zG2 || objR7 == i8cVar) {
                        objR7 = new ykc(15, str2, x16Var9);
                        l46Var5.p0(objR7);
                    }
                    x16 x16Var10 = (x16) objR7;
                    boolean zG3 = l46Var5.g(str2) | l46Var5.i(context);
                    Object objR8 = l46Var5.R();
                    if (zG3 || objR8 == i8cVar) {
                        objR8 = new e5b(context, str2);
                        l46Var5.p0(objR8);
                    }
                    gcc.a(d0eVar, this.b, x16Var10, (x16) objR8, l46Var5, 0);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 15:
                List list = (List) obj9;
                mue mueVar = (mue) obj6;
                mue mueVar2 = (mue) obj8;
                j09 j09Var = (j09) obj7;
                l46 l46Var6 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var6.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        y8c.e(this.b, (kg4) it.next(), mueVar, mueVar2, j09Var, l46Var6, 0);
                    }
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                y8c.e(this.b, (kg4) obj9, (mue) obj6, (mue) obj8, (j09) obj7, (l46) obj, k99.P(1));
                return wefVar;
            case 17:
                lmb lmbVar = (lmb) obj9;
                jse jseVar = (jse) obj6;
                sg6 sg6Var = (sg6) obj8;
                lmb lmbVar2 = (lmb) obj7;
                lmbVar.element = hl9.g(lmbVar.element, ((hl9) obj2).a);
                ute uteVar = jseVar.b;
                z2f z2fVar = jseVar.a;
                ste steVarC = uteVar.c();
                if (steVarC != null) {
                    b59 b59Var = steVarC.b;
                    jseVar.A(sg6Var, hl9.g(lmbVar2.element, lmbVar.element));
                    boolean z7 = this.b;
                    if (z7) {
                        iG = b59Var.g(jseVar.n());
                    } else {
                        long j = z2fVar.d().d;
                        int i2 = eue.c;
                        iG = (int) (j >> 32);
                    }
                    int i3 = iG;
                    if (z7) {
                        long j2 = z2fVar.d().d;
                        int i4 = eue.c;
                        iG2 = (int) (j2 & 4294967295L);
                    } else {
                        iG2 = b59Var.g(jseVar.n());
                    }
                    int i5 = iG2;
                    long j3 = z2fVar.d().d;
                    long jB = jseVar.B(z2fVar.d(), i3, i5, z7, gec.g, false, false, new fh6(9));
                    if (eue.d(j3) || !eue.d(jB)) {
                        z2fVar.j(jB);
                    }
                }
                return wefVar;
            case 18:
                dd2 dd2Var = (dd2) obj9;
                Integer num = (Integer) obj6;
                pad padVar = (pad) obj8;
                a26 a26Var2 = (a26) obj7;
                l46 l46Var7 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var7.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    boolean zG4 = l46Var7.g(padVar) | l46Var7.g(num);
                    boolean z8 = this.b;
                    boolean zH6 = l46Var7.h(z8) | zG4 | l46Var7.g(a26Var2);
                    Object objR9 = l46Var7.R();
                    if (zH6 || objR9 == i8cVar) {
                        fef fefVar = new fef(padVar, num, z8, a26Var2, 1);
                        l46Var7.p0(fefVar);
                        objR9 = fefVar;
                    }
                    dd2Var.t(num, (a26) objR9, l46Var7, 0);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            default:
                ((Integer) obj2).getClass();
                rfc.c(this.b, (xzf) obj9, (wp9) obj8, (a26) obj7, (x16) obj6, (l46) obj, k99.P(1));
                return wefVar;
        }
    }

    public /* synthetic */ l30(tn4 tn4Var, boolean z, jkc jkcVar, x16 x16Var, x16 x16Var2) {
        this.a = 10;
        this.d = tn4Var;
        this.b = z;
        this.f = jkcVar;
        this.c = x16Var;
        this.e = x16Var2;
    }

    public /* synthetic */ l30(x16 x16Var, SolarTerm solarTerm, boolean z, fpc fpcVar, e89 e89Var) {
        this.a = 12;
        this.c = x16Var;
        this.d = solarTerm;
        this.b = z;
        this.e = fpcVar;
        this.f = e89Var;
    }

    public /* synthetic */ l30(x16 x16Var, boolean z, x16 x16Var2, yic yicVar, x16 x16Var3, int i) {
        this.a = 13;
        this.c = x16Var;
        this.b = z;
        this.e = x16Var2;
        this.d = yicVar;
        this.f = x16Var3;
    }

    public /* synthetic */ l30(j09 j09Var, use useVar, String str, boolean z, a26 a26Var, int i) {
        this.a = 3;
        this.d = j09Var;
        this.c = useVar;
        this.e = str;
        this.b = z;
        this.f = a26Var;
    }

    public /* synthetic */ l30(j09 j09Var, boolean z, iwa iwaVar, x16 x16Var, a26 a26Var, int i) {
        this.a = 5;
        this.d = j09Var;
        this.b = z;
        this.e = iwaVar;
        this.c = x16Var;
        this.f = a26Var;
    }

    public /* synthetic */ l30(lmb lmbVar, jse jseVar, sg6 sg6Var, lmb lmbVar2, boolean z) {
        this.a = 17;
        this.d = lmbVar;
        this.c = jseVar;
        this.e = sg6Var;
        this.f = lmbVar2;
        this.b = z;
    }

    public /* synthetic */ l30(mic micVar, boolean z, a26 a26Var, x16 x16Var, x16 x16Var2, int i) {
        this.a = 9;
        this.d = micVar;
        this.b = z;
        this.f = a26Var;
        this.c = x16Var;
        this.e = x16Var2;
    }

    public /* synthetic */ l30(d0e d0eVar, boolean z, String str, x16 x16Var, Context context) {
        this.a = 14;
        this.d = d0eVar;
        this.b = z;
        this.e = str;
        this.c = x16Var;
        this.f = context;
    }

    public /* synthetic */ l30(Object obj, Object obj2, boolean z, x16 x16Var, x16 x16Var2, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.f = obj2;
        this.b = z;
        this.c = x16Var;
        this.e = x16Var2;
    }

    public /* synthetic */ l30(Object obj, boolean z, Object obj2, Object obj3, m26 m26Var, int i, int i2) {
        this.a = i2;
        this.d = obj;
        this.b = z;
        this.c = obj2;
        this.e = obj3;
        this.f = m26Var;
    }

    public /* synthetic */ l30(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.d = obj;
        this.b = z;
        this.c = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ l30(String str, e83 e83Var, boolean z, x16 x16Var, x16 x16Var2) {
        this.a = 7;
        this.d = str;
        this.f = e83Var;
        this.b = z;
        this.c = x16Var;
        this.e = x16Var2;
    }

    public /* synthetic */ l30(TarotCardChoice tarotCardChoice, String str, boolean z, l26 l26Var, a26 a26Var, int i) {
        this.a = 8;
        this.d = tarotCardChoice;
        this.c = str;
        this.b = z;
        this.e = l26Var;
        this.f = a26Var;
    }

    public /* synthetic */ l30(boolean z, kg4 kg4Var, mue mueVar, mue mueVar2, j09 j09Var, int i) {
        this.a = 16;
        this.b = z;
        this.d = kg4Var;
        this.c = mueVar;
        this.e = mueVar2;
        this.f = j09Var;
    }

    public /* synthetic */ l30(boolean z, a56 a56Var, a26 a26Var, x16 x16Var, x16 x16Var2, int i) {
        this.a = 11;
        this.b = z;
        this.d = a56Var;
        this.f = a26Var;
        this.c = x16Var;
        this.e = x16Var2;
    }

    public /* synthetic */ l30(boolean z, xzf xzfVar, wp9 wp9Var, a26 a26Var, x16 x16Var, int i) {
        this.a = 19;
        this.b = z;
        this.d = xzfVar;
        this.e = wp9Var;
        this.f = a26Var;
        this.c = x16Var;
    }
}
