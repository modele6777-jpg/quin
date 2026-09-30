package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.annual.model.AnnualActionFor;
import android.content.Context;
import android.text.Annotation;
import android.text.Spanned;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kg implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kg(boolean z, j09 j09Var, a26 a26Var, int i) {
        this.a = 15;
        this.b = z;
        this.c = j09Var;
        this.d = a26Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v13, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.util.List] */
    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i;
        Integer numValueOf;
        ?? G0;
        k00 k00VarL;
        long j;
        String strName;
        int i2 = this.a;
        ov7 ov7Var = LayoutNode.h1;
        i8c i8cVar = sf2.a;
        int i3 = 6;
        g09 g09Var = g09.a;
        boolean z = this.b;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                db6.a((fd4) obj3, z, (x16) obj4, (l46) obj, k99.P(9));
                return wefVar;
            case 1:
                w10 w10Var = (w10) obj3;
                AnnualActionFor annualActionFor = (AnnualActionFor) obj4;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    boolean zK = w10Var.k();
                    pr4 pr4Var = l8b.a;
                    xtd xtdVar = new xtd(((e8b) l46Var.k(pr4Var)).q, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534);
                    int[] iArr = e60.a;
                    int i4 = iArr[annualActionFor.ordinal()];
                    if (i4 != 1) {
                        if (i4 == 2) {
                            i = R.array.annual_domain_draw_pattern_title;
                        } else {
                            ap.c();
                        }
                        return null;
                    }
                    i = R.array.annual_monthly_draw_pattern_title;
                    int iE = t72.E(w10Var.f) + 1;
                    int i5 = iArr[annualActionFor.ordinal()];
                    if (i5 == 1) {
                        numValueOf = null;
                    } else {
                        if (i5 != 2) {
                            ap.c();
                            return null;
                        }
                        numValueOf = Integer.valueOf(z ? 2 : 1);
                    }
                    mue mueVar = pue.a;
                    xtd xtdVar2 = mue.a(pue.n(l46Var), ((e8b) l46Var.k(pr4Var)).u, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214).a;
                    xtdVar2.getClass();
                    l46Var.f0(1132160982);
                    CharSequence[] textArray = ((Context) l46Var.k(uq.b)).getResources().getTextArray(i);
                    if (numValueOf != null) {
                        int iIntValue2 = numValueOf.intValue();
                        textArray.getClass();
                        G0 = new ArrayList();
                        int length = textArray.length;
                        int i6 = 0;
                        int i7 = 0;
                        while (i6 < length) {
                            CharSequence charSequence = textArray[i6];
                            int i8 = i7 + 1;
                            if (i7 != iIntValue2) {
                                G0.add(charSequence);
                            }
                            i6++;
                            i7 = i8;
                        }
                    } else {
                        textArray.getClass();
                        G0 = qd0.G0(textArray);
                    }
                    CharSequence charSequence2 = (CharSequence) s72.y0(iE, G0);
                    if (charSequence2 == null) {
                        StringBuilder sb = new StringBuilder(16);
                        new ArrayList();
                        ArrayList arrayList = new ArrayList();
                        new ArrayList();
                        String string = sb.toString();
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size = arrayList.size();
                        for (int i9 = 0; i9 < size; i9++) {
                            arrayList2.add(((h00) arrayList.get(i9)).a(sb.length()));
                        }
                        k00VarL = new k00(string, arrayList2);
                    } else {
                        i00 i00Var = new i00();
                        int iK = i00Var.k(xtdVar);
                        try {
                            i00Var.e(charSequence2);
                            i00Var.h(iK);
                            if (charSequence2 instanceof Spanned) {
                                Spanned spanned = (Spanned) charSequence2;
                                Object[] spans = spanned.getSpans(0, charSequence2.length(), Annotation.class);
                                spans.getClass();
                                for (Object obj5 : spans) {
                                    Annotation annotation = (Annotation) obj5;
                                    if (pa7.t(annotation.getValue(), "HIGHLIGHT")) {
                                        i00Var.b(xtdVar2, spanned.getSpanStart(annotation), spanned.getSpanEnd(annotation));
                                    }
                                }
                            }
                            k00VarL = i00Var.l();
                        } catch (Throwable th) {
                            i00Var.h(iK);
                            throw th;
                        }
                    }
                    l46Var.r(false);
                    tm7.k(zK, null, k00VarL, null, l46Var, 48, 8);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                ((Integer) obj2).getClass();
                jgb.e((String) obj3, z, (j09) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 3:
                t69 t69Var = (t69) obj3;
                wne wneVar = (wne) obj4;
                l46 l46Var2 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (l46Var2.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    qk6.O0.a(this.b, false, t69Var, null, wneVar, eze.a(l46Var2).a.i, 0.0f, 0.0f, l46Var2, 114819504, 8);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 4:
                ((Integer) obj2).getClass();
                vd0.j((j09) obj3, (jd4) obj4, z, (l46) obj, k99.P(1));
                return wefVar;
            case 5:
                esb esbVar = (esb) obj3;
                kw5 kw5Var = (kw5) obj4;
                l46 l46Var3 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (l46Var3.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    j09 j09VarZ = ynb.Z(g09Var, 24.0f);
                    jx0 jx0Var = ndb.Z;
                    c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(0)), jx0Var, l46Var3, 54);
                    int iHashCode = Long.hashCode(l46Var3.T);
                    u8a u8aVarM = l46Var3.m();
                    j09 j09VarJ = m93.J(l46Var3, j09VarZ);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var3, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var3, u8aVarM);
                    Integer numValueOf2 = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var3, numValueOf2);
                    dec.k(l46Var3);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var3, j09VarJ);
                    c92 c92VarA2 = a92.a(new uc0(4.0f, true, new qc0(0)), jx0Var, l46Var3, 54);
                    int iHashCode2 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM2 = l46Var3.m();
                    j09 j09VarJ2 = m93.J(l46Var3, g09Var);
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(he2Var, l46Var3, c92VarA2);
                    dec.l(he2Var2, l46Var3, u8aVarM2);
                    ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
                    dec.l(he2Var4, l46Var3, j09VarJ2);
                    String strQ = afc.q(esbVar.a, l46Var3);
                    mue mueVar2 = pue.a;
                    mue mueVarP = pue.p(l46Var3);
                    yp5 yp5Var = ((y8b) l46Var3.k(x8b.a)).a;
                    pr4 pr4Var2 = l8b.a;
                    nte.b(strQ, null, ((e8b) l46Var3.k(pr4Var2)).q, 0L, null, yp5Var, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarP, l46Var3, 0, 0, 129914);
                    String strQ2 = afc.q(esbVar.b, l46Var3);
                    mue mueVarD = pue.d(l46Var3);
                    if (!k8b.e((e8b) l46Var3.k(pr4Var2))) {
                        l46Var3.f0(1127690132);
                        j = ((e8b) l46Var3.k(pr4Var2)).r;
                        l46Var3.r(false);
                    } else if (z) {
                        l46Var3.f0(1127691601);
                        l46Var3.r(false);
                        j = kw5Var.c;
                    } else {
                        l46Var3.f0(1127692944);
                        l46Var3.r(false);
                        j = kw5Var.d;
                    }
                    nte.b(strQ2, null, j, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarD, l46Var3, 0, 0, 130042);
                    nte.b(afc.q(esbVar.c, l46Var3), null, ((e8b) l46Var3.k(pr4Var2)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a, l46Var3, 0, 0, 130042);
                    l46Var3.r(true);
                    feg.j(od4.A(z ? esbVar.e : esbVar.f, 0, l46Var3), null, b.c(g09Var, 1.0f), null, an2.d, 0.0f, null, l46Var3, 25016, 104);
                    nte.b(afc.q(esbVar.d, l46Var3), b.c(g09Var, 1.0f), ((e8b) l46Var3.k(pr4Var2)).q, 0L, null, null, 0L, null, new jme(5), 0L, 0, false, 0, 0, null, pue.c(l46Var3), l46Var3, 48, 0, 130040);
                    l46Var3.r(true);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 6:
                he2 he2Var5 = hj6.x;
                he2 he2Var6 = hj6.X;
                he2 he2Var7 = hj6.y;
                he2 he2Var8 = hj6.z;
                List list = (List) obj3;
                a26 a26Var = (a26) obj4;
                l46 l46Var4 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var4.Z();
                    return wefVar;
                }
                g09 g09Var2 = g09.a;
                j09 j09VarD0 = ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, g09Var2);
                c92 c92VarA3 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Y, l46Var4, 6);
                int iHashCode3 = Long.hashCode(l46Var4.T);
                u8a u8aVarM3 = l46Var4.m();
                j09 j09VarJ3 = m93.J(l46Var4, j09VarD0);
                lf2.q.getClass();
                l46Var4.j0();
                if (l46Var4.S) {
                    l46Var4.l(ov7Var);
                } else {
                    l46Var4.s0();
                }
                dec.l(he2Var8, l46Var4, c92VarA3);
                dec.l(he2Var7, l46Var4, u8aVarM3);
                ib8.s(iHashCode3, l46Var4, he2Var6, l46Var4);
                dec.l(he2Var5, l46Var4, j09VarJ3);
                l46Var4.f0(-182622531);
                Iterator it = s72.p1(list, 2, 2, true).iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i11 = i10 + 1;
                    if (i10 < 0) {
                        t72.Z();
                        throw null;
                    }
                    List list2 = (List) next;
                    Iterator it2 = it;
                    int i12 = i10;
                    t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.y, l46Var4, 6);
                    a26 a26Var2 = a26Var;
                    int iHashCode4 = Long.hashCode(l46Var4.T);
                    u8a u8aVarM4 = l46Var4.m();
                    j09 j09VarJ4 = m93.J(l46Var4, g09Var2);
                    lf2.q.getClass();
                    l46Var4.j0();
                    if (l46Var4.S) {
                        l46Var4.l(ov7Var);
                    } else {
                        l46Var4.s0();
                    }
                    dec.l(he2Var8, l46Var4, t7cVarA);
                    dec.l(he2Var7, l46Var4, u8aVarM4);
                    ib8.s(iHashCode4, l46Var4, he2Var6, l46Var4);
                    Iterator itS = kv2.s(l46Var4, j09VarJ4, he2Var5, 481200346, list2);
                    int i13 = 0;
                    while (itS.hasNext()) {
                        Object next2 = itS.next();
                        int i14 = i13 + 1;
                        if (i13 < 0) {
                            t72.Z();
                            throw null;
                        }
                        String str = (String) next2;
                        boolean zG = l46Var4.g(a26Var2) | l46Var4.g(str);
                        Object objR = l46Var4.R();
                        if (zG || objR == i8cVar) {
                            objR = new n43(2, a26Var2, str);
                            l46Var4.p0(objR);
                        }
                        l46 l46Var5 = l46Var4;
                        pa6.p(0, (x16) objR, l46Var5, androidx.compose.ui.platform.b.a(g09Var2, "gift_card_blessing_recommendation-" + ((i12 * 2) + i13)), str, this.b);
                        i13 = i14;
                        l46Var4 = l46Var5;
                    }
                    l46 l46Var6 = l46Var4;
                    l46Var6.r(false);
                    l46Var6.r(true);
                    it = it2;
                    a26Var = a26Var2;
                    i10 = i11;
                }
                l46 l46Var7 = l46Var4;
                l46Var7.r(false);
                l46Var7.r(true);
                return wefVar;
            case 7:
                gj6 gj6Var = (gj6) obj3;
                x16 x16Var = (x16) obj4;
                l46 l46Var8 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (l46Var8.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    j09 j09VarF = b.f(56.0f, 0.0f, mh3.N(ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2))), 2);
                    String strQ3 = afc.q(R.string.text_next_step, l46Var8);
                    boolean zI = l46Var8.i(gj6Var) | l46Var8.g(x16Var);
                    Object objR2 = l46Var8.R();
                    if (zI || objR2 == i8cVar) {
                        objR2 = new jf6(1, gj6Var, x16Var);
                        l46Var8.p0(objR2);
                    }
                    c8b.i(j09VarF, strQ3, null, null, 0L, 0.0f, this.b, null, null, false, null, null, (x16) objR2, l46Var8, 0, 0, 4028);
                } else {
                    l46Var8.Z();
                }
                return wefVar;
            case 8:
                ((Integer) obj2).getClass();
                oa7.f((bwa) obj3, z, (j09) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case 9:
                ((Integer) obj2).getClass();
                vfh.e((Locale) obj3, z, (a26) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                pa7.i((e83) obj3, z, (a26) obj4, (l46) obj, k99.P(1));
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                qhe qheVar = (qhe) obj3;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj4;
                l46 l46Var9 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (l46Var9.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    String str2 = qheVar.a;
                    if (tarotSkinIdentify == null || (strName = tarotSkinIdentify.name()) == null) {
                        strName = "unavailable";
                    }
                    j09 j09VarP = b.p(ynb.Z(androidx.compose.ui.platform.b.a(g09Var, "history-card-" + str2 + "-" + strName), 2.0f), 40.0f);
                    pr4 pr4Var3 = snd.a;
                    boolean z2 = this.b;
                    float aspectRatio = 0.5714286f;
                    if (!z2 && tarotSkinIdentify != null) {
                        aspectRatio = tarotSkinIdentify.getAspectRatio();
                    }
                    o7c.d(dj6.w(j09VarP, aspectRatio), qheVar, tarotSkinIdentify, false, an2.a, 4.0f, null, z2, l46Var9, 224256, 64);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                x16 x16Var2 = (x16) obj4;
                SolarTerm solarTerm = (SolarTerm) obj3;
                l46 l46Var10 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (l46Var10.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    pa7.a(null, 0L, 0L, null, af1.b0(-1582615238, new nu2(z, solarTerm, 4), l46Var10), null, false, false, x16Var2, l46Var10, 24576, 239);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                egd egdVar = (egd) obj3;
                x16 x16Var3 = (x16) obj4;
                l46 l46Var11 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (l46Var11.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    rs0.k(egdVar, x16Var3, null, this.b, l46Var11, 0, 4);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
            case 14:
                ((Integer) obj2).getClass();
                gcc.b((d0e) obj3, (x16) obj4, z, (l46) obj, k99.P(1));
                return wefVar;
            case 15:
                ((Integer) obj2).getClass();
                scc.c(k99.P(1), (a26) obj4, (l46) obj, (j09) obj3, z);
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((Integer) obj2).getClass();
                ief.b((j09) obj3, z, (oad) obj4, (l46) obj, k99.P(1));
                return wefVar;
            default:
                x16 x16Var4 = (x16) obj4;
                wp9 wp9Var = (wp9) obj3;
                l46 l46Var12 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (l46Var12.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    pa7.a(null, 0L, 0L, null, af1.b0(1468645143, new nu2(z, wp9Var, i3), l46Var12), z5c.e, false, false, x16Var4, l46Var12, 221184, 207);
                } else {
                    l46Var12.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ kg(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ kg(Object obj, Object obj2, boolean z, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.d = obj2;
        this.b = z;
    }

    public /* synthetic */ kg(Object obj, boolean z, Object obj2, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = z;
        this.d = obj2;
    }

    public /* synthetic */ kg(int i, x16 x16Var, Object obj, boolean z) {
        this.a = i;
        this.d = x16Var;
        this.b = z;
        this.c = obj;
    }

    public /* synthetic */ kg(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
