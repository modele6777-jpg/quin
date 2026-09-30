package defpackage;

import ai.askquin.model.Scene;
import ai.askquin.ui.settings.language.LanguagesActivity;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.net.IDN;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import tech.chatmind.api.RecommendQuestionType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class so5 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ so5(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0489  */
    /* JADX WARN: Code duplicated, block: B:231:0x067a  */
    /* JADX WARN: Code duplicated, block: B:234:0x068b  */
    /* JADX WARN: Code duplicated, block: B:236:0x069a  */
    /* JADX WARN: Code duplicated, block: B:258:0x06e6  */
    /* JADX WARN: Code duplicated, block: B:261:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:263:0x0706  */
    /* JADX WARN: Code duplicated, block: B:286:0x0756  */
    /* JADX WARN: Code duplicated, block: B:289:0x0767  */
    /* JADX WARN: Code duplicated, block: B:291:0x0776  */
    /* JADX WARN: Code duplicated, block: B:295:0x0782  */
    /* JADX WARN: Code duplicated, block: B:297:0x078d  */
    /* JADX WARN: Code duplicated, block: B:302:0x07a2  */
    /* JADX WARN: Code duplicated, block: B:304:0x07aa  */
    /* JADX WARN: Code duplicated, block: B:305:0x07ac  */
    /* JADX WARN: Code duplicated, block: B:307:0x07b4  */
    /* JADX WARN: Code duplicated, block: B:308:0x07b6  */
    /* JADX WARN: Code duplicated, block: B:310:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:311:0x07be  */
    /* JADX WARN: Code duplicated, block: B:313:0x07c6  */
    /* JADX WARN: Code duplicated, block: B:318:0x07cf  */
    /* JADX WARN: Code duplicated, block: B:321:0x07e0  */
    /* JADX WARN: Code duplicated, block: B:323:0x07ef  */
    /* JADX WARN: Code duplicated, block: B:383:0x090f  */
    /* JADX WARN: Code duplicated, block: B:431:0x069d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:440:0x0709 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:450:0x0779 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:452:0x07ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:460:0x07f2 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v90, types: [java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r8v31, types: [int] */
    /* JADX WARN: Type inference failed for: r8v37 */
    @Override // defpackage.a26
    public final Object d(Object obj) throws Exception {
        iy9 iy9Var;
        Object obj2;
        Object j9fVar;
        Object objD;
        Object objD2;
        int size;
        int i;
        ar5 ar5Var;
        int size2;
        ar5 ar5Var2;
        ar5 ar5Var3;
        int i2;
        int size3;
        int i3;
        Object obj3;
        ar5 ar5Var4;
        int i4;
        Object obj4;
        int size4;
        int i5;
        Object obj5;
        int size5;
        int i6;
        Object obj6;
        Typeface typefaceB;
        URI uri;
        Object dzbVar;
        Object dzbVar2;
        String str;
        int i7 = 18;
        int i8 = 2;
        int i9 = 8;
        int i10 = 3;
        ?? r8 = 0;
        switch (this.a) {
            case 0:
                ((u69) ((t69) this.b)).b((l77) this.c);
                return wef.a;
            case 1:
                String str2 = (String) this.b;
                RecommendQuestionType recommendQuestionType = (RecommendQuestionType) this.c;
                l1f l1fVar = (l1f) obj;
                kv2.y(l1fVar, "btn", "recommend_question", "pathway", str2);
                l1fVar.a(recommendQuestionType.getWireValue(), "recommend_type");
                return wef.a;
            case 2:
                zp5 zp5Var = (zp5) this.b;
                i9f i9fVar = (i9f) this.c;
                a26 a26Var = (a26) obj;
                fq5 fq5Var = zp5Var.d;
                bs bsVar = zp5Var.a;
                ot1 ot1Var = zp5Var.f;
                yp5 yp5Var = i9fVar.a;
                if (yp5Var instanceof cq5) {
                    List list = ((cq5) yp5Var).f;
                    ar5 ar5Var5 = i9fVar.b;
                    int i11 = i9fVar.c;
                    ArrayList arrayList = new ArrayList(list.size());
                    int size6 = list.size();
                    for (int i12 = 0; i12 < size6; i12++) {
                        Object obj7 = list.get(i12);
                        zxb zxbVar = (zxb) obj7;
                        if (pa7.t(zxbVar.b, ar5Var5) && zxbVar.c == i11) {
                            arrayList.add(obj7);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        ArrayList arrayList2 = new ArrayList(list.size());
                        int size7 = list.size();
                        for (int i13 = 0; i13 < size7; i13++) {
                            Object obj8 = list.get(i13);
                            if (((zxb) obj8).c == i11) {
                                arrayList2.add(obj8);
                            }
                        }
                        if (!arrayList2.isEmpty()) {
                            list = arrayList2;
                        }
                        int iCompareTo = ar5Var5.compareTo(ar5.b);
                        int i14 = ar5Var5.a;
                        if (iCompareTo < 0) {
                            int size8 = list.size();
                            ar5 ar5Var6 = null;
                            ar5 ar5Var7 = null;
                            for (int i15 = 0; i15 < size8; i15++) {
                                ar5 ar5Var8 = ((zxb) list.get(i15)).b;
                                int i16 = ar5Var8.a;
                                if (pa7.L(i16, i14) < 0) {
                                    if (ar5Var6 == null || pa7.L(i16, ar5Var6.a) > 0) {
                                        ar5Var6 = ar5Var8;
                                    }
                                } else if (pa7.L(i16, i14) <= 0) {
                                    ar5Var6 = ar5Var8;
                                    ar5Var7 = ar5Var6;
                                    if (ar5Var6 == null) {
                                        ar5Var6 = ar5Var7;
                                    }
                                    arrayList = new ArrayList(list.size());
                                    size5 = list.size();
                                    for (i6 = 0; i6 < size5; i6++) {
                                        obj6 = list.get(i6);
                                        if (pa7.t(((zxb) obj6).b, ar5Var6)) {
                                            arrayList.add(obj6);
                                        }
                                    }
                                } else if (ar5Var7 == null || pa7.L(i16, ar5Var7.a) < 0) {
                                    ar5Var7 = ar5Var8;
                                }
                            }
                            if (ar5Var6 == null) {
                                ar5Var6 = ar5Var7;
                            }
                            arrayList = new ArrayList(list.size());
                            size5 = list.size();
                            while (i6 < size5) {
                                obj6 = list.get(i6);
                                if (pa7.t(((zxb) obj6).b, ar5Var6)) {
                                    arrayList.add(obj6);
                                }
                            }
                        } else {
                            ar5 ar5Var9 = ar5.c;
                            if (ar5Var5.compareTo(ar5Var9) > 0) {
                                int size9 = list.size();
                                ar5 ar5Var10 = null;
                                ar5 ar5Var11 = null;
                                for (int i17 = 0; i17 < size9; i17++) {
                                    ar5 ar5Var12 = ((zxb) list.get(i17)).b;
                                    int i18 = ar5Var12.a;
                                    if (pa7.L(i18, i14) < 0) {
                                        if (ar5Var10 == null || pa7.L(i18, ar5Var10.a) > 0) {
                                            ar5Var10 = ar5Var12;
                                        }
                                    } else if (pa7.L(i18, i14) <= 0) {
                                        ar5Var10 = ar5Var12;
                                        ar5Var11 = ar5Var10;
                                        if (ar5Var11 != null) {
                                            ar5Var10 = ar5Var11;
                                        }
                                        arrayList = new ArrayList(list.size());
                                        size4 = list.size();
                                        for (i5 = 0; i5 < size4; i5++) {
                                            obj5 = list.get(i5);
                                            if (pa7.t(((zxb) obj5).b, ar5Var10)) {
                                                arrayList.add(obj5);
                                            }
                                        }
                                    } else if (ar5Var11 == null || pa7.L(i18, ar5Var11.a) < 0) {
                                        ar5Var11 = ar5Var12;
                                    }
                                }
                                if (ar5Var11 != null) {
                                    ar5Var10 = ar5Var11;
                                }
                                arrayList = new ArrayList(list.size());
                                size4 = list.size();
                                while (i5 < size4) {
                                    obj5 = list.get(i5);
                                    if (pa7.t(((zxb) obj5).b, ar5Var10)) {
                                        arrayList.add(obj5);
                                    }
                                }
                            } else {
                                int size10 = list.size();
                                ar5 ar5Var13 = null;
                                ar5 ar5Var14 = null;
                                for (int i19 = 0; i19 < size10; i19++) {
                                    ar5 ar5Var15 = ((zxb) list.get(i19)).b;
                                    if (pa7.L(ar5Var15.a, ar5Var9.a) <= 0) {
                                        int i20 = ar5Var15.a;
                                        if (pa7.L(i20, i14) < 0) {
                                            if (ar5Var13 == null || pa7.L(i20, ar5Var13.a) > 0) {
                                                ar5Var13 = ar5Var15;
                                            }
                                        } else if (pa7.L(i20, i14) <= 0) {
                                            ar5Var13 = ar5Var15;
                                            ar5Var14 = ar5Var13;
                                            if (ar5Var14 != null) {
                                                ar5Var13 = ar5Var14;
                                            }
                                            arrayList = new ArrayList(list.size());
                                            size = list.size();
                                            for (i = 0; i < size; i++) {
                                                obj4 = list.get(i);
                                                if (pa7.t(((zxb) obj4).b, ar5Var13)) {
                                                    arrayList.add(obj4);
                                                }
                                            }
                                            if (arrayList.isEmpty()) {
                                                ar5Var = ar5.c;
                                                size2 = list.size();
                                                ar5Var2 = null;
                                                ar5Var3 = null;
                                                for (i2 = 0; i2 < size2; i2++) {
                                                    ar5Var4 = ((zxb) list.get(i2)).b;
                                                    if (ar5Var != null || pa7.L(ar5Var4.a, ar5Var.a) >= 0) {
                                                        i4 = ar5Var4.a;
                                                        if (pa7.L(i4, i14) < 0) {
                                                            if (ar5Var2 != null || pa7.L(i4, ar5Var2.a) > 0) {
                                                                ar5Var2 = ar5Var4;
                                                            }
                                                        } else if (pa7.L(i4, i14) <= 0) {
                                                            ar5Var2 = ar5Var4;
                                                            ar5Var3 = ar5Var2;
                                                            if (ar5Var3 != null) {
                                                                ar5Var2 = ar5Var3;
                                                            }
                                                            arrayList = new ArrayList(list.size());
                                                            size3 = list.size();
                                                            for (i3 = 0; i3 < size3; i3++) {
                                                                obj3 = list.get(i3);
                                                                if (pa7.t(((zxb) obj3).b, ar5Var2)) {
                                                                    arrayList.add(obj3);
                                                                }
                                                            }
                                                        } else if (ar5Var3 != null || pa7.L(i4, ar5Var3.a) < 0) {
                                                            ar5Var3 = ar5Var4;
                                                        }
                                                    }
                                                }
                                                if (ar5Var3 != null) {
                                                    ar5Var2 = ar5Var3;
                                                }
                                                arrayList = new ArrayList(list.size());
                                                size3 = list.size();
                                                while (i3 < size3) {
                                                    obj3 = list.get(i3);
                                                    if (pa7.t(((zxb) obj3).b, ar5Var2)) {
                                                        arrayList.add(obj3);
                                                    }
                                                }
                                            }
                                        } else if (ar5Var14 == null || pa7.L(i20, ar5Var14.a) < 0) {
                                            ar5Var14 = ar5Var15;
                                        }
                                    }
                                }
                                if (ar5Var14 != null) {
                                    ar5Var13 = ar5Var14;
                                }
                                arrayList = new ArrayList(list.size());
                                size = list.size();
                                while (i < size) {
                                    obj4 = list.get(i);
                                    if (pa7.t(((zxb) obj4).b, ar5Var13)) {
                                        arrayList.add(obj4);
                                    }
                                }
                                if (arrayList.isEmpty()) {
                                    ar5Var = ar5.c;
                                    size2 = list.size();
                                    ar5Var2 = null;
                                    ar5Var3 = null;
                                    while (i2 < size2) {
                                        ar5Var4 = ((zxb) list.get(i2)).b;
                                        if (ar5Var != null) {
                                            i4 = ar5Var4.a;
                                            if (pa7.L(i4, i14) < 0) {
                                                if (ar5Var2 != null) {
                                                    ar5Var2 = ar5Var4;
                                                } else {
                                                    ar5Var2 = ar5Var4;
                                                }
                                            } else if (pa7.L(i4, i14) <= 0) {
                                                ar5Var2 = ar5Var4;
                                                ar5Var3 = ar5Var2;
                                                if (ar5Var3 != null) {
                                                    ar5Var2 = ar5Var3;
                                                }
                                                arrayList = new ArrayList(list.size());
                                                size3 = list.size();
                                                while (i3 < size3) {
                                                    obj3 = list.get(i3);
                                                    if (pa7.t(((zxb) obj3).b, ar5Var2)) {
                                                        arrayList.add(obj3);
                                                    }
                                                }
                                            } else if (ar5Var3 != null) {
                                                ar5Var3 = ar5Var4;
                                            } else {
                                                ar5Var3 = ar5Var4;
                                            }
                                        } else {
                                            i4 = ar5Var4.a;
                                            if (pa7.L(i4, i14) < 0) {
                                                if (ar5Var2 != null) {
                                                    ar5Var2 = ar5Var4;
                                                } else {
                                                    ar5Var2 = ar5Var4;
                                                }
                                            } else if (pa7.L(i4, i14) <= 0) {
                                                ar5Var2 = ar5Var4;
                                                ar5Var3 = ar5Var2;
                                                if (ar5Var3 != null) {
                                                    ar5Var2 = ar5Var3;
                                                }
                                                arrayList = new ArrayList(list.size());
                                                size3 = list.size();
                                                while (i3 < size3) {
                                                    obj3 = list.get(i3);
                                                    if (pa7.t(((zxb) obj3).b, ar5Var2)) {
                                                        arrayList.add(obj3);
                                                    }
                                                }
                                            } else if (ar5Var3 != null) {
                                                ar5Var3 = ar5Var4;
                                            } else {
                                                ar5Var3 = ar5Var4;
                                            }
                                        }
                                    }
                                    if (ar5Var3 != null) {
                                        ar5Var2 = ar5Var3;
                                    }
                                    arrayList = new ArrayList(list.size());
                                    size3 = list.size();
                                    while (i3 < size3) {
                                        obj3 = list.get(i3);
                                        if (pa7.t(((zxb) obj3).b, ar5Var2)) {
                                            arrayList.add(obj3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    ta0 ta0Var = fq5Var.a;
                    if (arrayList.size() > 0) {
                        zxb zxbVar2 = (zxb) arrayList.get(0);
                        zxbVar2.getClass();
                        synchronized (((g3e) ta0Var.b)) {
                            try {
                                ih0 ih0Var = new ih0(zxbVar2);
                                hh0 hh0Var = (hh0) ((ej8) ta0Var.c).c(ih0Var);
                                if (hh0Var == null) {
                                    hh0Var = (hh0) ((w79) ta0Var.d).g(ih0Var);
                                }
                                if (hh0Var != null) {
                                    objD2 = hh0Var.a;
                                } else {
                                    try {
                                        Context context = bsVar.a;
                                        if (zxbVar2 instanceof zxb) {
                                            Typeface typefaceA = hyb.a(context, zxbVar2.a);
                                            typefaceA.getClass();
                                            objD = y41.Q(typefaceA, zxbVar2.d, context);
                                        } else {
                                            objD = null;
                                        }
                                    } catch (Exception unused) {
                                        objD = ot1Var.d(i9fVar);
                                    }
                                    ta0Var.getClass();
                                    ih0 ih0Var2 = new ih0(zxbVar2);
                                    synchronized (((g3e) ta0Var.b)) {
                                        try {
                                            if (objD == null) {
                                                ((w79) ta0Var.d).m(ih0Var2, new hh0(null));
                                            } else {
                                                ((ej8) ta0Var.c).d(ih0Var2, new hh0(objD));
                                            }
                                        } catch (Throwable th) {
                                            throw th;
                                        }
                                        break;
                                    }
                                    objD2 = objD;
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                            break;
                        }
                        if (objD2 == null) {
                            objD2 = ot1Var.d(i9fVar);
                        }
                        iy9Var = new iy9(null, y7h.P(i9fVar.d, objD2, zxbVar2, i9fVar.b, i9fVar.c));
                    } else {
                        iy9Var = new iy9(null, ot1Var.d(i9fVar));
                    }
                    List list2 = (List) iy9Var.a();
                    Object objB = iy9Var.b();
                    if (list2 == null) {
                        j9fVar = new k9f(objB, true);
                        obj2 = null;
                    } else {
                        rg0 rg0Var = new rg0(list2, objB, i9fVar, fq5Var.a, a26Var, bsVar);
                        obj2 = null;
                        ynb.V(fq5Var.b, null, dw2.d, new dq5(rg0Var, null), 1);
                        j9fVar = new j9f(rg0Var);
                    }
                } else {
                    obj2 = null;
                    j9fVar = null;
                }
                if (j9fVar == null) {
                    kga kgaVar = (kga) zp5Var.e.a;
                    yp5 yp5Var2 = i9fVar.a;
                    int i21 = i9fVar.c;
                    ar5 ar5Var16 = i9fVar.b;
                    if (yp5Var2 == null || (yp5Var2 instanceof vq3)) {
                        typefaceB = kgaVar.b(ar5Var16, i21);
                    } else if (yp5Var2 instanceof o66) {
                        typefaceB = kgaVar.d((o66) yp5Var2, ar5Var16, i21);
                    } else {
                        if (yp5Var2 instanceof w98) {
                            typefaceB = (Typeface) ((w98) yp5Var2).f.b;
                        } else {
                            j9fVar = obj2;
                        }
                        if (j9fVar == null) {
                            qc0.p("Could not load font");
                            return obj2;
                        }
                    }
                    j9fVar = new k9f(typefaceB, true);
                    if (j9fVar == null) {
                        qc0.p("Could not load font");
                        return obj2;
                    }
                }
                return j9fVar;
            case 3:
                x48 x48Var = (x48) this.b;
                q06 q06Var = (q06) this.c;
                ((ra4) obj).getClass();
                y6 y6Var = new y6(i8, q06Var);
                x48Var.k().a(y6Var);
                return new oe0(13, x48Var, y6Var);
            case 4:
                lx4 lx4Var = (lx4) this.b;
                a26 a26Var2 = (a26) this.c;
                wa6 wa6Var = (wa6) s72.y0(((Integer) obj).intValue(), lx4Var);
                if (wa6Var != null) {
                    a26Var2.d(wa6Var);
                }
                return wef.a;
            case 5:
                wa6 wa6Var2 = (wa6) this.b;
                String str3 = (String) this.c;
                l1f l1fVar2 = (l1f) obj;
                l1fVar2.getClass();
                l1fVar2.a("my_gift_cards_page", "pathway");
                l1fVar2.a(wa6Var2.a(), "tab");
                l1fVar2.a(str3, "gift_card_status");
                return wef.a;
            case 6:
                if6 if6Var = (if6) this.b;
                bne bneVar = (bne) this.c;
                hne hneVar = (hne) obj;
                hneVar.getClass();
                if (((Boolean) if6Var.b.invoke()).booleanValue()) {
                    bneVar.d.d(hneVar);
                } else {
                    hneVar.close();
                }
                return wef.a;
            case 7:
                ((wg6) this.b).c.removeCallbacks((ny2) this.c);
                return wef.a;
            case 8:
                x48 x48Var2 = (x48) this.b;
                gj6 gj6Var = (gj6) this.c;
                ((ra4) obj).getClass();
                y6 y6Var2 = new y6(i10, gj6Var);
                x48Var2.k().a(y6Var2);
                return new oe0(14, x48Var2, y6Var2);
            case 9:
                kq6 kq6Var = (kq6) this.b;
                q7b q7bVar = (q7b) this.c;
                Scene scene = (Scene) obj;
                scene.getClass();
                jr2 jr2Var = q7bVar.b;
                jr2Var.getClass();
                ynb.V(hwf.a(kq6Var), null, null, new hp6(kq6Var, jr2Var, scene, null), 3);
                return wef.a;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Context context2 = (Context) this.b;
                kq6 kq6Var2 = (kq6) this.c;
                c58 c58Var = (c58) obj;
                c58Var.getClass();
                n80 n80Var = new n80(i10, kq6Var2);
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.intent.action.DATE_CHANGED");
                intentFilter.addAction("android.intent.action.TIME_SET");
                intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
                bp.H(context2, n80Var, intentFilter, null, 4);
                kq6Var2.h();
                return new sm6(c58Var, context2, n80Var);
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                Context context3 = (Context) this.b;
                a26 a26Var3 = (a26) this.c;
                wm6 wm6Var = (wm6) obj;
                wm6Var.getClass();
                x1f x1fVar = x1f.a;
                x1f.k(new r05("explore_event"), new za6(i9, wm6Var), 2);
                uj3 uj3Var = new uj3(1, context3, kn2.class, "browse", "browse(Landroid/content/Context;Ljava/lang/String;)Z", 1, 25);
                tk6 tk6Var = new tk6(i9);
                a26Var3.getClass();
                String str4 = wm6Var.c;
                if (!v4e.Q(str4)) {
                    if (!wm6Var.d || str4.equals("/app") || c5e.C(str4, "/app/", false)) {
                        a26Var3.d(str4);
                    } else {
                        try {
                            uri = new URI(str4);
                        } catch (URISyntaxException unused2) {
                            uri = null;
                        }
                        if (uri != null && (c5e.v(uri.getScheme(), "http", true) || c5e.v(uri.getScheme(), Constants.SCHEME, true))) {
                            try {
                                dzbVar = uri.toURL().getHost();
                            } catch (Throwable th3) {
                                dzbVar = new dzb(th3);
                            }
                            boolean z = dzbVar instanceof dzb;
                            Object obj9 = dzbVar;
                            if (z) {
                                obj9 = null;
                            }
                            String str5 = (String) obj9;
                            if (str5 == null) {
                                tk6Var.d(str4);
                            } else {
                                if (v4e.Q(str5)) {
                                    str5 = null;
                                }
                                if (str5 != null) {
                                    if (!c5e.C(str5, "[", false) || !c5e.u(str5, "]", false)) {
                                        try {
                                            dzbVar2 = IDN.toASCII(str5, 2);
                                        } catch (Throwable th4) {
                                            dzbVar2 = new dzb(th4);
                                        }
                                        String str6 = (String) (dzbVar2 instanceof dzb ? null : dzbVar2);
                                        if (str6 == null || !(!v4e.Q(str6))) {
                                            tk6Var.d(str4);
                                        }
                                    }
                                    if (!((Boolean) uj3Var.d(str4)).booleanValue()) {
                                        tk6Var.d(str4);
                                    }
                                } else {
                                    tk6Var.d(str4);
                                }
                            }
                        } else {
                            tk6Var.d(str4);
                        }
                    }
                    break;
                } else {
                    tk6Var.d(str4);
                }
                return wef.a;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                b68 b68Var = (b68) this.b;
                b68 b68Var2 = (b68) this.c;
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                sn4.O0(sn4Var, b68Var, 0L, 0L, 0.0f, null, null, 0, 126);
                sn4.O0(sn4Var, b68Var2, 0L, 0L, 0.0f, null, null, 0, 126);
                return wef.a;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                bz6 bz6Var = (bz6) this.b;
                ArrayList arrayList3 = (ArrayList) this.c;
                q8c q8cVar = (q8c) obj;
                q8cVar.getClass();
                ax3 ax3Var = bz6Var.b;
                x8c x8cVarW0 = q8cVar.W0("INSERT OR REPLACE INTO `tb_in_app_message` (`message_id`,`message_type`,`region`,`title`,`content`,`image_url`,`intensity`,`action`,`action_tips`,`attach`,`created_at`) VALUES (?,?,?,?,?,?,?,?,?,?,?)");
                try {
                    for (Object obj10 : arrayList3) {
                        if (obj10 != null) {
                            ax3Var.p(x8cVarW0, obj10);
                            x8cVarW0.R0();
                            x8cVarW0.reset();
                        }
                    }
                    cgg.t(x8cVarW0, null);
                    return wef.a;
                } catch (Throwable th5) {
                    try {
                        throw th5;
                    } catch (Throwable th6) {
                        cgg.t(x8cVarW0, th5);
                        throw th6;
                    }
                }
            case 14:
                g07 g07Var = (g07) this.b;
                a26 a26Var4 = (a26) this.c;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                List list3 = ((f07) g07Var).a;
                v08Var.X(list3.size(), new d5(i7, new tk6(22), list3), new gj(12, list3, r8), new dd2(new a07(list3, a26Var4, r8), true, 802480018));
                return wef.a;
            case 15:
                zt ztVar = (zt) this.b;
                x17 x17Var = (x17) this.c;
                vv7 vv7Var = (vv7) ((im2) obj);
                vv7Var.a();
                jx jxVar = x17Var.M0;
                jxVar.getClass();
                sn4.s(vv7Var, ztVar, new dtd(((y72) jxVar.e()).a), 0.0f, null, null, 0, 60);
                return wef.a;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                p27 p27Var = (p27) this.b;
                m27 m27Var = (m27) this.c;
                p27Var.a.b(m27Var);
                p27Var.b.setValue(Boolean.TRUE);
                return new oe0(17, p27Var, m27Var);
            case 17:
                g87 g87Var = (g87) this.b;
                bwa bwaVar = (bwa) this.c;
                ((t7) obj).getClass();
                g87Var.H(bwaVar, ((mo3) g87Var.P0).a());
                return wef.a;
            case 18:
                String str7 = (String) this.b;
                yc7 yc7Var = (yc7) this.c;
                l1f l1fVar3 = (l1f) obj;
                l1fVar3.getClass();
                l1fVar3.a(str7, "code");
                l1fVar3.a(((mo3) yc7Var.e).a(), "accepted_by");
                return wef.a;
            case 19:
                lu7 lu7Var = (lu7) this.b;
                LanguagesActivity languagesActivity = (LanguagesActivity) this.c;
                Locale locale = (Locale) obj;
                int i22 = LanguagesActivity.Q0;
                locale.getClass();
                lu7Var.b = true;
                Locale[] localeArr = vd8.a;
                td8 td8Var = td8.b;
                td8 td8VarC = td8.c(new LocaleList(locale));
                hf8.Q.getClass();
                ef8.a("LocaleManager").e("Set donut locale to " + td8VarC);
                h80 h80Var = i80.a;
                if (Build.VERSION.SDK_INT < 33) {
                    if (!td8VarC.equals(i80.c)) {
                        synchronized (i80.v) {
                            i80.c = td8VarC;
                            i80.a();
                        }
                    }
                    break;
                } else {
                    Object objD3 = i80.d();
                    if (objD3 != null) {
                        q6.D(objD3, LocaleList.forLanguageTags(td8VarC.a.a.toLanguageTags()));
                    }
                }
                cn1.P0 = languagesActivity;
                cn1.X(locale);
                return wef.a;
            case 20:
                fx7 fx7Var = (fx7) this.b;
                da4 da4Var = (da4) this.c;
                dr5 dr5VarB = fx7Var.b(((Integer) obj).intValue());
                int i23 = dr5VarB.a;
                ?? r1 = dr5VarB.b;
                ArrayList arrayList4 = new ArrayList(r1.size());
                int size11 = r1.size();
                int i24 = 0;
                while (r8 < size11) {
                    int i25 = (int) ((af6) r1.get(r8)).a;
                    arrayList4.add(new iy9(Integer.valueOf(i23), new kl2(da4Var.a(i24, i25))));
                    i23++;
                    i24 += i25;
                    r8++;
                }
                return arrayList4;
            case 21:
                da4 da4Var2 = (da4) this.b;
                ww7 ww7Var = (ww7) this.c;
                int iIntValue = ((Integer) obj).intValue();
                fx7 fx7Var2 = (fx7) da4Var2.e;
                int i26 = fx7Var2.i;
                int iE = fx7Var2.e(iIntValue);
                return ww7Var.B0(da4Var2.a(0, iE), iIntValue, 0, iE, ww7Var.e);
            case 22:
                o18 o18Var = (o18) this.b;
                Object obj11 = this.c;
                o18Var.c.j(obj11);
                return new oe0(i7, o18Var, obj11);
            case 23:
                return new o18((ucc) this.b, (Map) obj, (qcc) this.c);
            case 24:
                yx9 yx9Var = (yx9) this.b;
                gbd gbdVar = (gbd) this.c;
                l1f l1fVar4 = (l1f) obj;
                l1fVar4.getClass();
                l1fVar4.a(((sz9) yx9Var.d.c).j() == 1 ? Constants.LONG : "short", "layout");
                int iOrdinal = gbdVar.ordinal();
                if (iOrdinal == 0) {
                    str = "qq";
                } else if (iOrdinal == 1) {
                    str = "qq_zone";
                } else if (iOrdinal == 2) {
                    str = "wechat";
                } else if (iOrdinal == 3) {
                    str = "wechat_moments";
                } else {
                    if (iOrdinal != 4) {
                        ap.c();
                        return null;
                    }
                    str = "share";
                }
                l1fVar4.a(str, "pathway");
                return wef.a;
            case 25:
                ynb.V((aw2) this.b, null, null, new p38((yx9) this.c, ((Integer) obj).intValue(), null), 3);
                return wef.a;
            case 26:
                cea ceaVar = (cea) this.b;
                h0e h0eVar = (h0e) this.c;
                bea beaVar = (bea) obj;
                beaVar.getClass();
                bea.q(beaVar, ceaVar, 0, 0, new wh1(i9, h0eVar), 4);
                return wef.a;
            case 27:
                bea beaVar2 = (bea) obj;
                ArrayList arrayListK0 = vd0.k0((List) this.b, (x16) ((x68) this.c).b);
                if (arrayListK0 != null) {
                    int size12 = arrayListK0.size();
                    for (int i27 = 0; i27 < size12; i27++) {
                        iy9 iy9Var2 = (iy9) arrayListK0.get(i27);
                        cea ceaVar2 = (cea) iy9Var2.a();
                        x16 x16Var = (x16) iy9Var2.b();
                        bea.j(beaVar2, ceaVar2, x16Var != null ? ((w67) x16Var.invoke()).a : 0L);
                    }
                }
                return wef.a;
            case 28:
                iu8 iu8Var = (iu8) this.b;
                hu8 hu8Var = (hu8) this.c;
                ((ra4) obj).getClass();
                if (iu8Var != null) {
                    hu8Var.getClass();
                    iu8Var.a.add(hu8Var);
                }
                return new oe0(21, hu8Var, iu8Var);
            default:
                ted tedVar = (ted) this.b;
                jx jxVar2 = (jx) this.c;
                g0c g0cVar = (g0c) obj;
                float fJ = tedVar.d.i.j();
                float fIntBitsToFloat = Float.intBitsToFloat((int) (g0cVar.G0 & 4294967295L));
                if (!Float.isNaN(fJ) && !Float.isNaN(fIntBitsToFloat) && fIntBitsToFloat != 0.0f) {
                    float fFloatValue = ((Number) jxVar2.e()).floatValue();
                    g0cVar.q(zz8.d(g0cVar, fFloatValue));
                    g0cVar.r(zz8.e(g0cVar, fFloatValue));
                    g0cVar.D(sfc.d(0.5f, (fJ + fIntBitsToFloat) / fIntBitsToFloat));
                }
                return wef.a;
        }
    }
}
