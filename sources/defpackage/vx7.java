package defpackage;

import ai.askquin.ui.conversation.r0;
import android.util.Log;
import com.google.android.filament.Engine;
import com.google.android.filament.IndexBuffer;
import com.google.android.filament.MaterialInstance;
import com.google.android.filament.Scene;
import com.google.android.filament.SwapChain;
import com.google.android.filament.Texture;
import com.google.android.filament.VertexBuffer;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.seasonal.model.SeasonalReadingResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vx7 extends h36 implements a26 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vx7(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x03a3  */
    @Override // defpackage.a26
    public final Object d(Object obj) {
        int iJ;
        int iNextIndex;
        Integer numValueOf;
        boolean zContains;
        int i = this.a;
        boolean z = false;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                t99 t99Var = (t99) obj;
                t99Var.getClass();
                return ((wx7) this.receiver).N(t99Var);
            case 1:
                t99 t99Var2 = (t99) obj;
                t99Var2.getClass();
                return ((wx7) this.receiver).O(t99Var2);
            case 2:
                cb cbVar = (cb) ((ht6) this.receiver);
                cbVar.getClass();
                js3 js3Var = ga4.a;
                return ynb.p0(hr3.c, new oa(cbVar, null), (xn2) obj);
            case 3:
                return bsa.c((hs3) this.receiver, (xn2) obj);
            case 4:
                return bsa.c((hs3) this.receiver, (xn2) obj);
            case 5:
                h19 h19Var = (h19) this.receiver;
                agf agfVar = h19Var.a;
                int iIntValue = ((Number) agfVar.a.a(obj)).intValue();
                String str = (String) s72.y0(iIntValue - agfVar.b, h19Var.b);
                return str == null ? ks0.l(ub3.n(iIntValue, "The value ", " of "), agfVar.d, " does not have a corresponding string representation") : str;
            case 6:
                return ((wd9) this.receiver).b((xn2) obj);
            case 7:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                gj9 gj9Var = (gj9) this.receiver;
                gj9Var.getClass();
                a62 a62VarA = hwf.a(gj9Var);
                js3 js3Var2 = ga4.a;
                ynb.V(a62VarA, hr3.c, null, new bj9(zBooleanValue, gj9Var, null), 2);
                return wefVar;
            case 8:
                ma8 ma8Var = (ma8) obj;
                ma8Var.getClass();
                bo9 bo9Var = (bo9) this.receiver;
                bo9Var.getClass();
                ycc yccVar = bo9Var.b;
                String string = (String) yccVar.a("birthday");
                if (string == null) {
                    string = bo9Var.f.toString();
                }
                if (!string.equals(ma8Var.toString())) {
                    yccVar.d("edited", Boolean.TRUE);
                }
                yccVar.d("birthday", ma8Var.toString());
                return wefVar;
            case 9:
                return ((txa) this.receiver).a.get(obj);
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return Boolean.valueOf(((mpa) this.receiver).test(obj));
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((t5f) this.receiver).getClass();
                return Boolean.TRUE;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                String str2 = (String) obj;
                str2.getClass();
                return ((r0) this.receiver).o(str2);
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                r0 r0Var = (r0) this.receiver;
                if (zBooleanValue2) {
                    iJ = r0Var.S1.j() + 1;
                } else {
                    int iJ2 = r0Var.S1.j() - 1;
                    iJ = iJ2 < 0 ? 0 : iJ2;
                }
                r0Var.S1.k(iJ);
                return wefVar;
            case 14:
                List<wi1> list = (List) obj;
                list.getClass();
                ((z1b) this.receiver).getClass();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (((wi1) obj2) instanceof itb) {
                        arrayList.add(obj2);
                    }
                }
                list.removeAll(arrayList);
                Iterator it = s72.V0(arrayList).iterator();
                while (it.hasNext()) {
                    list.add(0, (wi1) it.next());
                }
                ListIterator listIterator = list.listIterator(list.size());
                while (true) {
                    if (!listIterator.hasPrevious()) {
                        iNextIndex = -1;
                    } else if (((wi1) listIterator.previous()) instanceof jtb) {
                        iNextIndex = listIterator.nextIndex();
                    }
                }
                if (iNextIndex > 0) {
                    Object obj3 = list.get(iNextIndex);
                    obj3.getClass();
                    jtb jtbVar = (jtb) obj3;
                    for (int i2 = 0; i2 < iNextIndex; i2++) {
                        wi1 wi1Var = (wi1) list.remove(0);
                        za2 za2Var = wi1Var instanceof ktb ? ((ktb) wi1Var).b : wi1Var instanceof jtb ? ((jtb) wi1Var).a : null;
                        if (za2Var != null) {
                            jtbVar.a.E(new p59(19, za2Var));
                        }
                        if (wi1Var instanceof stb) {
                            ((stb) wi1Var).a.a(null);
                        }
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int i3 = 0;
                for (wi1 wi1Var2 : list) {
                    int i4 = i3 + 1;
                    if (wi1Var2 instanceof stb) {
                        stb stbVar = (stb) wi1Var2;
                        String str3 = stbVar.a.a;
                        Set setO1 = s72.o1(s72.R0(stbVar.b, new ig1(str3)));
                        int size = list.size();
                        int i5 = i4;
                        while (true) {
                            if (i5 < size) {
                                wi1 wi1Var3 = (wi1) list.get(i5);
                                if (wi1Var3 instanceof ktb) {
                                    zContains = setO1.contains(new ig1(((ktb) wi1Var3).a));
                                } else if (wi1Var3 instanceof stb) {
                                    stb stbVar2 = (stb) wi1Var3;
                                    String str4 = stbVar2.a.a;
                                    Set setO2 = s72.o1(s72.R0(stbVar2.b, new ig1(str4)));
                                    if (pa7.t(str3, str4) || !setO1.equals(setO2)) {
                                        zContains = true;
                                    } else {
                                        zContains = false;
                                    }
                                } else {
                                    zContains = false;
                                }
                                if (zContains) {
                                    numValueOf = Integer.valueOf(i5);
                                } else {
                                    i5++;
                                }
                            } else {
                                numValueOf = null;
                            }
                        }
                    } else if (wi1Var2 instanceof ktb) {
                        int size2 = list.size();
                        int i6 = i4;
                        while (true) {
                            if (i6 < size2) {
                                wi1 wi1Var4 = (wi1) list.get(i6);
                                if ((wi1Var4 instanceof ktb) && pa7.t(((ktb) wi1Var4).a, ((ktb) wi1Var2).a)) {
                                    numValueOf = Integer.valueOf(i6);
                                } else {
                                    i6++;
                                }
                            } else {
                                numValueOf = null;
                            }
                        }
                    } else {
                        numValueOf = null;
                    }
                    if (numValueOf != null) {
                        wi1 wi1Var5 = (wi1) list.get(numValueOf.intValue());
                        Log.d("CXCP", wi1Var2 + " is pruned by " + wi1Var5);
                        linkedHashSet.add(Integer.valueOf(i3));
                        if ((wi1Var2 instanceof ktb) && (wi1Var5 instanceof ktb)) {
                            ((ktb) wi1Var5).b.E(new p59(20, (ktb) wi1Var2));
                        }
                    }
                    i3 = i4;
                }
                ArrayList<wi1> arrayList2 = new ArrayList();
                Iterator it2 = s72.a1(linkedHashSet).iterator();
                while (it2.hasNext()) {
                    arrayList2.add(list.remove(((Number) it2.next()).intValue() - arrayList2.size()));
                }
                for (wi1 wi1Var6 : arrayList2) {
                    if (wi1Var6 instanceof stb) {
                        ((stb) wi1Var6).a.a(null);
                    }
                }
                return wefVar;
            case 15:
                ((ngc) this.receiver).a(((Boolean) obj).booleanValue());
                return wefVar;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ((jkc) this.receiver).p(Integer.valueOf(((Number) obj).intValue()));
                return wefVar;
            case 17:
                int iIntValue2 = ((Number) obj).intValue();
                jnc jncVar = (jnc) this.receiver;
                jsd jsdVar = jncVar.e;
                TarotCardChoice tarotCardChoice = (TarotCardChoice) s72.y0(iIntValue2, jsdVar);
                if (tarotCardChoice != null) {
                    jsdVar.set(iIntValue2, TarotCardChoice.copy$default(tarotCardChoice, null, !tarotCardChoice.isReversed(), null, 5, null));
                    jncVar.g();
                }
                return wefVar;
            case 18:
                int iIntValue3 = ((Number) obj).intValue();
                jnc jncVar2 = (jnc) this.receiver;
                jsd jsdVar2 = jncVar2.e;
                if (iIntValue3 >= 0 && iIntValue3 < jsdVar2.size()) {
                    jsdVar2.set(iIntValue3, null);
                }
                jncVar2.g();
                return wefVar;
            case 19:
                SeasonalReadingResponse seasonalReadingResponse = (SeasonalReadingResponse) obj;
                seasonalReadingResponse.getClass();
                lqc lqcVar = (lqc) this.receiver;
                int i7 = lqc.c;
                lqcVar.getClass();
                return lqc.h(seasonalReadingResponse);
            case 20:
                SeasonalReadingResponse seasonalReadingResponse2 = (SeasonalReadingResponse) obj;
                seasonalReadingResponse2.getClass();
                lqc lqcVar2 = (lqc) this.receiver;
                int i8 = lqc.c;
                lqcVar2.getClass();
                return lqc.h(seasonalReadingResponse2);
            case 21:
                SeasonalReadingResponse seasonalReadingResponse3 = (SeasonalReadingResponse) obj;
                seasonalReadingResponse3.getClass();
                lqc lqcVar3 = (lqc) this.receiver;
                int i9 = lqc.c;
                lqcVar3.getClass();
                int i10 = vpc.a[seasonalReadingResponse3.getStatus().ordinal()];
                return (i10 == 3 || i10 == 4) ? new opc(seasonalReadingResponse3.getErrorMessage()) : lqc.h(seasonalReadingResponse3);
            case 22:
                return (Integer) ((txa) this.receiver).a(obj);
            case 23:
                String str5 = (String) obj;
                str5.getClass();
                return ((ka9) this.receiver).b(str5);
            case 24:
                String str6 = (String) obj;
                str6.getClass();
                return ((ka9) this.receiver).b(str6);
            case 25:
                lge lgeVar = (lge) obj;
                lgeVar.getClass();
                ((pge) this.receiver).getClass();
                pge.c.remove(lgeVar);
                lgeVar.b();
                jgb.I((qn2) lgeVar.k.a.b, null);
                wge wgeVar = xge.a;
                wgeVar.getClass();
                lgeVar.k = new ege(new vea(wgeVar, jgb.k(i7h.I(iqf.d(), wgeVar.b)), z, 15), new LinkedHashSet(), new LinkedHashMap());
                Engine engine = lgeVar.b;
                SwapChain swapChain = lgeVar.n;
                if (swapChain != null) {
                    engine.s(swapChain);
                    engine.w();
                }
                lgeVar.n = null;
                lgeVar.c();
                lgeVar.i(1, xu4.a);
                engine.w();
                if (pge.b == null) {
                    pge.b = lgeVar;
                } else {
                    lgeVar.d();
                }
                return wefVar;
            case 26:
                Texture texture = (Texture) obj;
                texture.getClass();
                ((Engine) this.receiver).t(texture);
                return wefVar;
            case 27:
                dhe dheVar = (dhe) obj;
                dheVar.getClass();
                ((fhe) this.receiver).getClass();
                ws4 ws4Var = fhe.b;
                ws4Var.getClass();
                HashMap map = (HashMap) ws4Var.d;
                cge cgeVar = dheVar.b;
                Set set = (Set) map.get(cgeVar);
                if (set != null) {
                    set.remove(Long.valueOf(dheVar.a));
                    if (set.isEmpty()) {
                        map.remove(cgeVar);
                    }
                }
                ws4.b(ws4Var, 3);
                return wefVar;
            case 28:
                Engine engine2 = (Engine) obj;
                engine2.getClass();
                ihe iheVar = (ihe) this.receiver;
                hhe hheVar = iheVar.e;
                if (hheVar != null) {
                    int i11 = hheVar.f;
                    Scene scene = hheVar.c;
                    l7c l7cVar = hheVar.q;
                    int i12 = l7cVar.a;
                    scene.c(i12);
                    engine2.d.h(i12);
                    engine2.b.b(i12);
                    ex4.a.b(i12);
                    Iterator it3 = l7cVar.b.iterator();
                    while (it3.hasNext()) {
                        engine2.o((MaterialInstance) it3.next());
                    }
                    Iterator it4 = hheVar.p.iterator();
                    while (it4.hasNext()) {
                        int iIntValue4 = ((Number) it4.next()).intValue();
                        scene.c(iIntValue4);
                        engine2.c.h(iIntValue4);
                        ex4.a.b(iIntValue4);
                    }
                    engine2.t(hheVar.m);
                    engine2.t(hheVar.n);
                    engine2.t(hheVar.o);
                    engine2.p(hheVar.i);
                    engine2.t(hheVar.j);
                    engine2.t(hheVar.k);
                    engine2.s(hheVar.l);
                    lqb lqbVar = hheVar.h;
                    engine2.u((VertexBuffer) lqbVar.b);
                    engine2.m((IndexBuffer) lqbVar.c);
                    engine2.n(hheVar.g);
                    engine2.v(hheVar.d);
                    engine2.l(hheVar.e);
                    engine2.r(scene);
                    engine2.q(hheVar.b);
                    engine2.k(i11);
                    ex4.a.b(i11);
                    engine2.w();
                }
                iheVar.e = null;
                return wefVar;
            default:
                long j = ((hl9) obj).a;
                zme zmeVar = (zme) this.receiver;
                zmeVar.getClass();
                ene eneVar = (ene) eb3.H(zmeVar, fne.a);
                if (eneVar != null) {
                    ynb.V(zmeVar.Z0(), null, null, new yme(zmeVar, j, eneVar, new xme(zmeVar, j), null), 3);
                }
                return wefVar;
        }
    }
}
