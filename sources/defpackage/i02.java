package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i02 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ e89 e;
    public final /* synthetic */ e89 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ a26 z;

    public /* synthetic */ i02(l26 l26Var, y63 y63Var, Context context, a26 a26Var, a26 a26Var2, boolean z, TarotSkinIdentify tarotSkinIdentify, x16 x16Var, e89 e89Var, e89 e89Var2, tt1 tt1Var, l26 l26Var2) {
        this.a = 2;
        this.c = l26Var;
        this.d = y63Var;
        this.g = context;
        this.z = a26Var2;
        this.b = z;
        this.v = tarotSkinIdentify;
        this.w = x16Var;
        this.e = e89Var;
        this.f = e89Var2;
        this.x = tt1Var;
        this.y = l26Var2;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:112:0x0333 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x0335  */
    /* JADX WARN: Code duplicated, block: B:114:0x033e  */
    /* JADX WARN: Code duplicated, block: B:117:0x0347  */
    /* JADX WARN: Code duplicated, block: B:118:0x035f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:119:0x0361  */
    /* JADX WARN: Code duplicated, block: B:143:0x0330 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0279  */
    /* JADX WARN: Code duplicated, block: B:92:0x02a9  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        Iterator it;
        int i;
        double d;
        float f;
        vs1 vs1Var;
        int i2;
        Object value;
        Object objA;
        int i3 = this.a;
        e89 e89Var = this.e;
        boolean z = this.b;
        wef wefVar = wef.a;
        Object obj2 = this.y;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.v;
        Object obj6 = this.g;
        Object obj7 = this.d;
        Object obj8 = this.c;
        switch (i3) {
            case 0:
                Integer num = (Integer) obj8;
                List list = (List) obj7;
                e89 e89Var2 = (e89) obj6;
                e89 e89Var3 = (e89) obj5;
                gh6 gh6Var = (gh6) obj4;
                aw2 aw2Var = (aw2) obj3;
                jx jxVar = (jx) obj2;
                hl9 hl9Var = (hl9) obj;
                long jCurrentTimeMillis = System.currentTimeMillis();
                e89 e89Var4 = this.f;
                if (z) {
                    wn7[] wn7VarArr = q02.a;
                    e89Var.setValue(Long.valueOf(jCurrentTimeMillis));
                    j = hl9Var.a;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                    List list2 = (List) e89Var2.getValue();
                    ArrayList arrayList = new ArrayList();
                    while (r4.hasNext()) {
                        vs1Var = (vs1) obj;
                        if (vs1Var.h) {
                        }
                    }
                    it = s72.b1(arrayList, new ww2(15)).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            vs1 vs1Var2 = (vs1) it.next();
                            float f2 = vs1Var2.b;
                            float f3 = vs1Var2.c;
                            float f4 = vs1Var2.d;
                            float f5 = vs1Var2.e;
                            float f6 = fIntBitsToFloat;
                            float f7 = fIntBitsToFloat2;
                            double radians = Math.toRadians(-vs1Var2.f);
                            double dCos = Math.cos(radians);
                            double dSin = Math.sin(radians);
                            double d2 = f6 - f2;
                            double d3 = fIntBitsToFloat2 - f3;
                            d = (d2 * dCos) - (d3 * dSin);
                            double d4 = (d3 * dCos) + (d2 * dSin);
                            f = f4 / 2.0f;
                            float f8 = f5 / 2.0f;
                            if (d >= (-f)) {
                            }
                            fIntBitsToFloat = f6;
                            fIntBitsToFloat2 = f7;
                        } else {
                            i = -1;
                        }
                    }
                    if (i >= 0) {
                        if (z) {
                            e89Var3.setValue(new nh3(j, i));
                        } else if (((Integer) e89Var4.getValue()) == null) {
                            gh6Var.c();
                            ynb.V(aw2Var, null, null, new e02(i, jxVar, this.z, e89Var4, null), 3);
                        }
                    } else if (z) {
                        e89Var3.setValue(new nh3(j, -1));
                    }
                } else {
                    wn7[] wn7VarArr2 = q02.a;
                    if (jCurrentTimeMillis - ((Number) e89Var.getValue()).longValue() >= 2000 && num == null && ((Integer) e89Var4.getValue()) == null) {
                        wn7[] wn7VarArr3 = q02.a;
                        e89Var.setValue(Long.valueOf(jCurrentTimeMillis));
                        j = hl9Var.a;
                        fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                        fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                        List list3 = (List) e89Var2.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj9 : list3) {
                            vs1Var = (vs1) obj9;
                            if (vs1Var.h && !list.contains(Integer.valueOf(vs1Var.a))) {
                                arrayList2.add(obj9);
                            }
                        }
                        it = s72.b1(arrayList2, new ww2(15)).iterator();
                        while (true) {
                            if (it.hasNext()) {
                                vs1 vs1Var3 = (vs1) it.next();
                                float f9 = vs1Var3.b;
                                float f10 = vs1Var3.c;
                                float f11 = vs1Var3.d;
                                float f12 = vs1Var3.e;
                                float f13 = fIntBitsToFloat;
                                float f14 = fIntBitsToFloat2;
                                double radians2 = Math.toRadians(-vs1Var3.f);
                                double dCos2 = Math.cos(radians2);
                                double dSin2 = Math.sin(radians2);
                                double d5 = f13 - f9;
                                double d6 = fIntBitsToFloat2 - f10;
                                d = (d5 * dCos2) - (d6 * dSin2);
                                double d7 = (d6 * dCos2) + (d5 * dSin2);
                                f = f11 / 2.0f;
                                float f15 = f12 / 2.0f;
                                if (d >= (-f) || d > f || d7 < (-f15) || d7 > f15) {
                                    fIntBitsToFloat = f13;
                                    fIntBitsToFloat2 = f14;
                                } else {
                                    i = vs1Var3.a;
                                }
                            } else {
                                i = -1;
                            }
                        }
                        if (i >= 0) {
                            if (z) {
                                e89Var3.setValue(new nh3(j, i));
                            } else if (((Integer) e89Var4.getValue()) == null) {
                                gh6Var.c();
                                ynb.V(aw2Var, null, null, new e02(i, jxVar, this.z, e89Var4, null), 3);
                            }
                        } else if (z) {
                            e89Var3.setValue(new nh3(j, -1));
                        }
                    }
                }
                return wefVar;
            case 1:
                Integer num2 = (Integer) obj8;
                List list4 = (List) obj7;
                e89 e89Var5 = (e89) obj6;
                e89 e89Var6 = (e89) obj5;
                gh6 gh6Var2 = (gh6) obj4;
                aw2 aw2Var2 = (aw2) obj3;
                jx jxVar2 = (jx) obj2;
                hl9 hl9Var2 = (hl9) obj;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                e89 e89Var7 = this.f;
                if (z || (jCurrentTimeMillis2 - ((Number) e89Var.getValue()).longValue() >= 2000 && num2 == null && ((Integer) e89Var7.getValue()) == null)) {
                    e89Var.setValue(Long.valueOf(jCurrentTimeMillis2));
                    long j2 = hl9Var2.a;
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    List list5 = (List) e89Var5.getValue();
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj10 : list5) {
                        cjc cjcVar = (cjc) obj10;
                        if (!cjcVar.h && !list4.contains(Integer.valueOf(cjcVar.a))) {
                            arrayList3.add(obj10);
                        }
                    }
                    Iterator it2 = s72.b1(arrayList3, new kv8(12)).iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            cjc cjcVar2 = (cjc) it2.next();
                            float f16 = cjcVar2.b;
                            float f17 = cjcVar2.c;
                            float f18 = cjcVar2.d;
                            float f19 = cjcVar2.e;
                            Iterator it3 = it2;
                            float f20 = fIntBitsToFloat3 - f16;
                            float f21 = fIntBitsToFloat3;
                            float f22 = fIntBitsToFloat4;
                            double radians3 = Math.toRadians(-cjcVar2.f);
                            double dCos3 = Math.cos(radians3);
                            double dSin3 = Math.sin(radians3);
                            double d8 = f20;
                            double d9 = fIntBitsToFloat4 - f17;
                            double d10 = (d8 * dCos3) - (d9 * dSin3);
                            double d11 = (d9 * dCos3) + (d8 * dSin3);
                            float f23 = f18 / 2.0f;
                            float f24 = f19 / 2.0f;
                            if (d10 < (-f23) || d10 > f23 || d11 < (-f24) || d11 > f24) {
                                it2 = it3;
                                fIntBitsToFloat4 = f22;
                                fIntBitsToFloat3 = f21;
                            } else {
                                i2 = cjcVar2.a;
                            }
                        } else {
                            i2 = -1;
                        }
                    }
                    if (i2 >= 0) {
                        if (z) {
                            e89Var6.setValue(new vjc(j2, i2));
                        } else if (((Integer) e89Var7.getValue()) == null) {
                            gh6Var2.c();
                            ynb.V(aw2Var2, null, null, new njc(i2, jxVar2, this.z, e89Var7, null), 3);
                        }
                    } else if (z) {
                        e89Var6.setValue(new vjc(j2, -1));
                    }
                }
                return wefVar;
            default:
                l26 l26Var = (l26) obj8;
                y63 y63Var = (y63) obj7;
                Context context = (Context) obj6;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj5;
                x16 x16Var = (x16) obj4;
                tt1 tt1Var = (tt1) obj3;
                l26 l26Var2 = (l26) obj2;
                q33 q33Var = (q33) obj;
                q33Var.getClass();
                boolean zEquals = q33Var.equals(l33.a);
                e89 e89Var8 = this.e;
                if (zEquals) {
                    dj6.i(this.b, context, tarotSkinIdentify, x16Var, e89Var8, this.f);
                    return wefVar;
                }
                if (q33Var.equals(m33.a)) {
                    e63 e63Var = (e63) e89Var8.getValue();
                    d63 d63Var = e63Var instanceof d63 ? (d63) e63Var : null;
                    if (d63Var == null) {
                        return wefVar;
                    }
                    TarotSkinIdentify tarotSkinIdentifyB = d63Var.g.b();
                    if (tarotSkinIdentifyB == null) {
                        tarotSkinIdentifyB = tarotSkinIdentify;
                    }
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new ks2(7, tarotSkinIdentifyB, d63Var), 2);
                    tt1.c(tt1Var, d63Var.c.getCard(), tarotSkinIdentifyB, 0, true, new j8(l26Var2, tarotSkinIdentifyB, d63Var, 17), null, null, false, 352);
                    return wefVar;
                }
                if (q33Var instanceof o33) {
                    Set set = a63.a;
                    w6c.x("daily_card", "daily_card");
                    l26Var.z(((o33) q33Var).a, xad.DailyCard);
                    return wefVar;
                }
                if (!q33Var.equals(p33.a)) {
                    if (!(q33Var instanceof n33)) {
                        ap.c();
                        return null;
                    }
                    a26 a26Var = this.z;
                    if (a26Var == null) {
                        return wefVar;
                    }
                    a26Var.d(((n33) q33Var).a);
                    return wefVar;
                }
                s0e s0eVar = y63Var.x;
                do {
                    value = s0eVar.getValue();
                    objA = (e63) value;
                    d63 d63Var2 = objA instanceof d63 ? (d63) objA : null;
                    if (d63Var2 != null) {
                        lld lldVar = d63Var2.g;
                        objA = d63.a(d63Var2, lld.a(lldVar, null, 0, null, false, !lldVar.e, 15));
                    }
                } while (!s0eVar.l(value, objA));
                return wefVar;
        }
    }

    public /* synthetic */ i02(boolean z, Integer num, List list, e89 e89Var, e89 e89Var2, e89 e89Var3, e89 e89Var4, gh6 gh6Var, aw2 aw2Var, jx jxVar, a26 a26Var, int i) {
        this.a = i;
        this.b = z;
        this.c = num;
        this.d = list;
        this.e = e89Var;
        this.f = e89Var2;
        this.g = e89Var3;
        this.v = e89Var4;
        this.w = gh6Var;
        this.x = aw2Var;
        this.y = jxVar;
        this.z = a26Var;
    }
}
