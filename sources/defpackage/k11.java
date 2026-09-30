package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.conversation.Operation;
import android.content.Context;
import android.webkit.WebView;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.TarotReadingHistory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k11 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    public /* synthetic */ k11(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x029a  */
    /* JADX WARN: Code duplicated, block: B:103:0x02a5 A[LOOP:1: B:98:0x0294->B:103:0x02a5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:108:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:119:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:120:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:125:0x02da  */
    /* JADX WARN: Code duplicated, block: B:128:0x02de  */
    /* JADX WARN: Code duplicated, block: B:132:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0251 A[PHI: r5
  0x0251: PHI (r5v4 ad4) = (r5v3 ad4), (r5v8 ad4) binds: [B:62:0x0232, B:69:0x0242] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:76:0x025a  */
    /* JADX WARN: Code duplicated, block: B:78:0x025d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0263  */
    /* JADX WARN: Code duplicated, block: B:81:0x0266  */
    /* JADX WARN: Code duplicated, block: B:88:0x0274  */
    /* JADX WARN: Code duplicated, block: B:91:0x0278  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1, types: [int] */
    /* JADX WARN: Type inference failed for: r6v14 */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        yc4 yc4VarA;
        yc4 yc4VarM;
        String str;
        ArrayList arrayListL1;
        Iterator it;
        et8 et8Var;
        String str2;
        String uid;
        Instant instant;
        String str3;
        fb4 fb4Var;
        jd4 jd4Var;
        bd4 bd4Var;
        fb4 fb4Var2;
        int i = this.a;
        int i2 = 17;
        int i3 = 2;
        ?? r6 = 0;
        int i4 = 0;
        wef wefVar = wef.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                v6c v6cVar = (v6c) obj6;
                jmb jmbVar = (jmb) obj5;
                mmb mmbVar = (mmb) obj4;
                zt ztVar = (zt) obj3;
                b41 b41Var = (b41) obj2;
                sn4 sn4Var = (sn4) obj;
                dxe dxeVar = (dxe) ((a82) obj7).d;
                dxeVar.getClass();
                float fFloatValue = Float.valueOf(dxeVar.a).floatValue();
                if (fFloatValue < 0.0f) {
                    fFloatValue = 0.0f;
                }
                boolean z = 2.0f * fFloatValue > Math.min(Math.abs(v6cVar.b()), Math.abs(v6cVar.a()));
                if (jmbVar.element != fFloatValue) {
                    ztVar.k();
                    zt.c(ztVar, v6cVar);
                    if (!z) {
                        zt ztVarA = cu.a();
                        zt.c(ztVarA, new v6c(v6cVar.a + fFloatValue, v6cVar.b + fFloatValue, v6cVar.c - fFloatValue, v6cVar.d - fFloatValue, dj6.X(v6cVar.e, fFloatValue), dj6.X(v6cVar.f, fFloatValue), dj6.X(v6cVar.g, fFloatValue), dj6.X(v6cVar.h, fFloatValue)));
                        ztVar.i(ztVar, ztVarA, 0);
                    }
                    mmbVar.element = ztVar;
                    jmbVar.element = fFloatValue;
                }
                Object obj8 = mmbVar.element;
                obj8.getClass();
                sn4.s(sn4Var, (zt) obj8, b41Var, 0.0f, null, null, 0, 60);
                return wefVar;
            case 1:
                cea[] ceaVarArr = (cea[]) obj7;
                List list = (List) obj6;
                zn8 zn8Var = (zn8) obj5;
                kmb kmbVar = (kmb) obj4;
                kmb kmbVar2 = (kmb) obj3;
                u21 u21Var = (u21) obj2;
                bea beaVar = (bea) obj;
                int length = ceaVarArr.length;
                int i5 = 0;
                while (r6 < length) {
                    cea ceaVar = ceaVarArr[r6];
                    ceaVar.getClass();
                    s21.d(beaVar, ceaVar, (tn8) list.get(i5), zn8Var.getLayoutDirection(), kmbVar.element, kmbVar2.element, u21Var.a);
                    i5++;
                    r6++;
                }
                return wefVar;
            case 2:
                List list2 = (List) obj7;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                v08Var.X(list2.size(), new d5(7, new wu0(i2), list2), new gj(i3, list2, r6), new dd2(new tq1(list2, (TarotCardType) obj6, (TarotSkinIdentify) obj5, (l26) obj4, (a26) obj3, (a26) obj2), true, 802480018));
                return wefVar;
            case 3:
                j97 j97Var = (j97) obj7;
                String str4 = (String) obj6;
                String str5 = (String) obj5;
                mmb mmbVar2 = (mmb) obj4;
                String str6 = (String) obj3;
                Instant instant2 = (Instant) obj2;
                yc4 yc4Var = (yc4) obj;
                TarotReadingHistory tarotReadingHistory = j97Var.b;
                if (tarotReadingHistory == null || !k99.J(tarotReadingHistory.getChatId()).equals(str4)) {
                    tarotReadingHistory = null;
                }
                if (yc4Var != null) {
                    fb4 fb4Var3 = yc4Var.h;
                    Operation operation = fb4Var3.c;
                    boolean z2 = operation instanceof Operation.Explanation;
                    Operation operation2 = fb4Var3.e;
                    boolean z3 = operation2 instanceof Operation.Explanation;
                    yc4VarA = yc4.a(yc4Var, null, false, null, null, 0, fb4.a(fb4Var3, null, null, !z2 ? operation : null, z2 ? null : fb4Var3.d, !z3 ? operation2 : null, null, z3 || z2 ? null : fb4Var3.g, null, null, 419), null, null, null, null, null, null, null, 4193919);
                } else {
                    yc4VarA = null;
                }
                if (tarotReadingHistory == null) {
                    if (yc4VarA != null) {
                        yc4VarM = yc4VarA;
                    } else {
                        qc0.o("Missing local snapshot for completed interpretation ".concat(str4));
                    }
                    return null;
                }
                yc4VarM = af8.m(tarotReadingHistory, yc4VarA, 2);
                fb4 fb4Var4 = yc4VarM.h;
                ad4 ad4VarM = ym8.m(fb4Var4.a);
                if (ad4VarM != null) {
                    str = j97Var.a;
                    if (v4e.Q(str)) {
                        str = null;
                    }
                    if (str == null) {
                        jd4Var = fb4Var4.a;
                        if (jd4Var instanceof bd4) {
                            bd4Var = (bd4) jd4Var;
                        } else {
                            bd4Var = null;
                        }
                        if (bd4Var != null || (str = bd4Var.a) == null || v4e.Q(str)) {
                            str = null;
                        }
                        if (str == null) {
                            ho7.j("Completed interpretation has no text for ".concat(str4));
                        }
                    }
                    if (yc4VarA != null && (fb4Var = yc4VarA.h) != null) {
                        fb4Var4 = fb4Var;
                    }
                    arrayListL1 = s72.l1(fb4Var4.b);
                    it = arrayListL1.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i4 = -1;
                        } else if (((ot8) it.next()) instanceof et8) {
                            i4++;
                        }
                    }
                    et8Var = new et8(str5, str, true);
                    if (i4 >= 0) {
                        arrayListL1.set(i4, et8Var);
                    } else {
                        arrayListL1.add(et8Var);
                    }
                    if (yc4Var != null || (str3 = yc4Var.r) == null) {
                        if (tarotReadingHistory != null || (uid = tarotReadingHistory.getUid()) == null || v4e.Q(uid)) {
                            str2 = null;
                        } else {
                            str2 = uid;
                        }
                        if (str2 != null) {
                            str6 = str2;
                        }
                    } else {
                        if (v4e.Q(str3)) {
                            str3 = null;
                        }
                        if (str3 == null) {
                            if (tarotReadingHistory != null) {
                                str2 = null;
                            } else {
                                str2 = null;
                            }
                            if (str2 != null) {
                                str6 = str2;
                            }
                        } else {
                            str6 = str3;
                        }
                    }
                    mmbVar2.element = str6;
                    Instant instantNow = Instant.now();
                    instantNow.getClass();
                    instant = yc4VarM.e;
                    if (instant != null) {
                        instant2 = instant;
                    }
                    return yc4.a(yc4VarM, str4, false, instantNow, instant2, arrayListL1.size(), fb4.a(yc4VarM.h, new bd4(str, ad4VarM), arrayListL1, fb4Var4.c, fb4Var4.d, fb4Var4.e, fb4Var4.f, fb4Var4.g, null, null, 384), null, null, null, (String) mmbVar2.element, null, null, null, 4062758);
                }
                ad4VarM = ym8.m((yc4Var == null || (fb4Var2 = yc4Var.h) == null) ? null : fb4Var2.a);
                if (ad4VarM != null) {
                    str = j97Var.a;
                    if (v4e.Q(str)) {
                        str = null;
                    }
                    if (str == null) {
                        jd4Var = fb4Var4.a;
                        if (jd4Var instanceof bd4) {
                            bd4Var = (bd4) jd4Var;
                        } else {
                            bd4Var = null;
                        }
                        if (bd4Var != null) {
                            str = null;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            ho7.j("Completed interpretation has no text for ".concat(str4));
                        }
                    }
                    if (yc4VarA != null) {
                        fb4Var4 = fb4Var;
                    }
                    arrayListL1 = s72.l1(fb4Var4.b);
                    it = arrayListL1.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            i4 = -1;
                        } else if (((ot8) it.next()) instanceof et8) {
                            i4++;
                        }
                    }
                    et8Var = new et8(str5, str, true);
                    if (i4 >= 0) {
                        arrayListL1.set(i4, et8Var);
                    } else {
                        arrayListL1.add(et8Var);
                    }
                    if (yc4Var != null) {
                        if (tarotReadingHistory != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str6 = str2;
                        }
                    } else {
                        if (tarotReadingHistory != null) {
                            str2 = null;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str6 = str2;
                        }
                    }
                    mmbVar2.element = str6;
                    Instant instantNow2 = Instant.now();
                    instantNow2.getClass();
                    instant = yc4VarM.e;
                    if (instant != null) {
                        instant2 = instant;
                    }
                    return yc4.a(yc4VarM, str4, false, instantNow2, instant2, arrayListL1.size(), fb4.a(yc4VarM.h, new bd4(str, ad4VarM), arrayListL1, fb4Var4.c, fb4Var4.d, fb4Var4.e, fb4Var4.f, fb4Var4.g, null, null, 384), null, null, null, (String) mmbVar2.element, null, null, null, 4062758);
                }
                ho7.j("Completed interpretation has no cards for ".concat(str4));
                return null;
            case 4:
                Context context = (Context) obj6;
                a26 a26Var = (a26) obj5;
                a26 a26Var2 = (a26) obj4;
                a26 a26Var3 = (a26) obj3;
                a26 a26Var4 = (a26) obj2;
                v08 v08Var2 = (v08) obj;
                v08Var2.getClass();
                el6 el6Var = (el6) ((fl6) obj7);
                for (Map.Entry entry : el6Var.a.entrySet()) {
                    ma8 ma8Var = (ma8) entry.getKey();
                    List list3 = (List) entry.getValue();
                    v08.W(v08Var2, ma8Var.toString(), new dd2(new w7(25, ma8Var, context), true, -1215056326), 2);
                    v08Var2.X(list3.size(), new d5(15, new oz5(29), list3), new gj(9, list3, r6), new dd2(new zk6(list3, a26Var, a26Var2, a26Var3, a26Var4, 0), true, 802480018));
                }
                if (el6Var.b) {
                    v08.W(v08Var2, "loading_more", rxg.e, 2);
                }
                return wefVar;
            case 5:
                g87 g87Var = (g87) obj2;
                bwa bwaVar = (bwa) obj;
                bwaVar.getClass();
                String strP = ym8.P(bwaVar);
                ((e89) obj6).setValue(strP);
                x1f x1fVar = x1f.a;
                x1f.k(new r05("paywall_action"), new kf((Object) bwaVar, (String) obj5, (Object) strP, obj4, obj3, 12), 2);
                vb2 vb2VarH = kn2.H((Context) obj7);
                if (vb2VarH != null) {
                    y41.N(g87Var.P0, vb2VarH, new so5(i2, g87Var, bwaVar), 2);
                }
                return wefVar;
            case 6:
                yx9 yx9Var = (yx9) obj6;
                aw2 aw2Var = (aw2) obj5;
                wt6 wt6Var = (wt6) obj4;
                Context context2 = (Context) obj3;
                fcb fcbVar = (fcb) obj2;
                gbd gbdVar = (gbd) obj;
                gbdVar.getClass();
                f6d f6dVarA = ((g6d) obj7).a(Integer.valueOf(((sz9) yx9Var.d.c).j()));
                if (f6dVarA != null) {
                    ynb.V(aw2Var, null, null, new o38(wt6Var, context2, gbdVar, f6dVarA, null), 3).E(new it3(fcbVar, yx9Var, gbdVar, 18));
                }
                return wefVar;
            case 7:
                WebView webView = (WebView) obj7;
                ((Context) obj).getClass();
                tgc.f(webView);
                ((a26) obj6).d(webView);
                webView.setWebChromeClient(new c9b((a26) obj4, (i0g) obj3, (yk8) obj2));
                webView.loadUrl((String) obj5);
                return webView;
            default:
                egd egdVar = (egd) obj7;
                xfc xfcVar = (xfc) obj6;
                aw2 aw2Var2 = (aw2) obj5;
                a26 a26Var5 = (a26) obj4;
                w77 w77Var = (w77) obj3;
                zk1 zk1Var = (zk1) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                if (!egdVar.b() && egdVar.a() == hgd.e && xfcVar.invoke() == s13.a) {
                    egdVar.d(true);
                    ynb.V(aw2Var2, null, null, new cgd(a26Var5, w77Var, egdVar, zBooleanValue, zk1Var, null), 3);
                }
                return wefVar;
        }
    }
}
