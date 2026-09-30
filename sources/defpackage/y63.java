package defpackage;

import ai.askquin.model.DailyFortuneDirectionContent;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.repository.b;
import ai.askquin.ui.popup.dailyfortune.v;
import android.content.Context;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y63 extends ewf {
    public final boolean E0;
    public lyd F0;
    public long G0;
    public final AtomicLong H0;
    public volatile Map I0;
    public boolean J0;
    public final AtomicLong X;
    public final s0e Y;
    public final whb Z;
    public final t7 b;
    public final d43 c;
    public final b d;
    public final gd8 e;
    public final xof f;
    public final cmd g;
    public final gpf v;
    public final v w;
    public final s0e x;
    public final whb y;
    public final AtomicReference z;

    public y63(t7 t7Var, d43 d43Var, b bVar, gd8 gd8Var, xof xofVar, cmd cmdVar, gpf gpfVar, v vVar) {
        this.b = t7Var;
        this.c = d43Var;
        this.d = bVar;
        this.e = gd8Var;
        this.f = xofVar;
        this.g = cmdVar;
        this.v = gpfVar;
        this.w = vVar;
        s0e s0eVarA = t0e.a(c63.a);
        this.x = s0eVarA;
        this.y = if9.n(s0eVarA);
        this.z = new AtomicReference(v33.a);
        this.X = new AtomicLong();
        s0e s0eVarA2 = t0e.a(null);
        this.Y = s0eVarA2;
        this.Z = if9.n(s0eVarA2);
        this.H0 = new AtomicLong();
        this.I0 = (Map) ((ys3) cmdVar).v.a.getValue();
        if (this.E0) {
            return;
        }
        this.E0 = true;
        ynb.V(hwf.a(this), null, null, new v63(this, null), 3);
    }

    public static d63 k(d63 d63Var, Map map) {
        hmd hmdVar;
        lld lldVar = d63Var.g;
        List<cod> list = lldVar.a;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        for (cod codVarO : list) {
            TarotSkinIdentify tarotSkinIdentify = codVarO.a;
            if (tarotSkinIdentify.getRequiresDownload() && codVarO.b != omd.e && (hmdVar = (hmd) map.get(tarotSkinIdentify)) != null) {
                codVarO = o(tarotSkinIdentify, hmdVar, tarotSkinIdentify == lldVar.b());
            }
            arrayList.add(codVarO);
        }
        return d63.a(d63Var, lld.a(lldVar, arrayList, 0, null, false, false, 30));
    }

    public static cod o(TarotSkinIdentify tarotSkinIdentify, hmd hmdVar, boolean z) {
        gmd gmdVar;
        boolean requiresDownload = tarotSkinIdentify.getRequiresDownload();
        omd omdVar = omd.b;
        omd omdVar2 = omd.a;
        if (!requiresDownload) {
            if (z) {
                omdVar = omdVar2;
            }
            return new cod(tarotSkinIdentify, omdVar, 0.0f);
        }
        if (hmdVar == null || (gmdVar = hmdVar.a) == null) {
            gmdVar = gmd.b;
        }
        int iOrdinal = gmdVar.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                if (iOrdinal == 2) {
                    return new cod(tarotSkinIdentify, omd.d, hmdVar != null ? hmdVar.b : 0.0f);
                }
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        ap.c();
                        return null;
                    }
                }
            }
            return new cod(tarotSkinIdentify, omd.c, hmdVar != null ? hmdVar.b : 0.0f);
        }
        if (z) {
            omdVar = omdVar2;
        }
        return new cod(tarotSkinIdentify, omdVar, 1.0f);
    }

    public static void p(y63 y63Var, Context context) {
        String folder;
        Object dzbVar;
        String str;
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        y63Var.getClass();
        Object value = y63Var.x.getValue();
        d63 d63Var = value instanceof d63 ? (d63) value : null;
        if (d63Var == null) {
            return;
        }
        TarotCardChoice tarotCardChoice = d63Var.c;
        TarotSkinIdentify tarotSkinIdentifyB = d63Var.g.b();
        List list = g6g.a;
        String strA = ((mo3) y63Var.b).a();
        if (v4e.Q(strA)) {
            hs3 hs3Var = xqa.A;
            strA = (String) z5c.I(nu4.a, new x63(hs3Var.a, hs3Var.b, null));
        }
        String str2 = d63Var.a;
        String cardKey = tarotCardChoice.getCard().getCardKey();
        boolean zIsReversed = tarotCardChoice.isReversed();
        String string = context.getString(tarotCardChoice.getCard().getTitleRes());
        string.getClass();
        String str3 = d63Var.b;
        if (tarotSkinIdentifyB == null || (folder = tarotSkinIdentifyB.getFolder()) == null) {
            folder = "rider_waite";
        }
        boolean requiresDownload = tarotSkinIdentifyB != null ? tarotSkinIdentifyB.getRequiresDownload() : false;
        tec.x(strA, str2, cardKey);
        try {
            dzbVar = LocalDate.parse(str2);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        LocalDate localDate = (LocalDate) (dzbVar instanceof dzb ? null : dzbVar);
        if (localDate == null) {
            return;
        }
        if (localDate.equals(localDateNow)) {
            str = "";
        } else if (!localDate.equals(localDateNow.plusDays(1L))) {
            return;
        } else {
            str = "next_";
        }
        context.getSharedPreferences("daily_fortune_widget", 0).edit().putBoolean(g6g.g(str, "is_drawn"), true).putString(g6g.g(str, "date"), str2).putString(g6g.g(str, "card_key"), cardKey).putString(g6g.g(str, "card_name"), string).putString(g6g.g(str, "affirmation"), str3).putBoolean(g6g.g(str, "is_reversed"), zIsReversed).putString(g6g.g(str, "skin_folder"), folder).putBoolean(g6g.g(str, "skin_requires_download"), requiresDownload).putString(g6g.g(str, "account_id"), strA).apply();
        if (str.length() == 0) {
            g6g.e(context);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:32:0x0101  */
    /* JADX WARN: Code duplicated, block: B:33:0x0106  */
    /* JADX WARN: Code duplicated, block: B:35:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:38:0x010f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0111  */
    /* JADX WARN: Code duplicated, block: B:41:0x0114  */
    /* JADX WARN: Code duplicated, block: B:42:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x0118  */
    /* JADX WARN: Code duplicated, block: B:44:0x011a  */
    /* JADX WARN: Code duplicated, block: B:45:0x011c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x0176  */
    /* JADX WARN: Code duplicated, block: B:70:0x0199  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x01dc A[LOOP:1: B:73:0x01cb->B:78:0x01dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x01a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:0x01df A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x01e0 A[EDGE_INSN: B:94:0x01e0->B:80:0x01e0 BREAK  A[LOOP:1: B:73:0x01cb->B:78:0x01dc], SYNTHETIC] */
    public final Object f(String str, TarotSkinIdentify tarotSkinIdentify, TarotSkinIdentify tarotSkinIdentify2, TarotSkinIdentify tarotSkinIdentify3, zn2 zn2Var) {
        i63 i63Var;
        String str2;
        TarotSkinIdentify tarotSkinIdentify4;
        TarotSkinIdentify tarotSkinIdentify5;
        TarotSkinIdentify tarotSkinIdentify6;
        yof yofVar;
        TarotSkinIdentify tarotSkinIdentify7;
        TarotSkinIdentify tarotSkinIdentify8;
        TarotSkinIdentify tarotSkinIdentify9;
        mfc mfcVar;
        Object objB;
        mfc mfcVar2;
        String str3;
        TarotSkinIdentify tarotSkinIdentify10;
        TarotSkinIdentify tarotSkinIdentifyA;
        String str4;
        TarotSkinIdentify tarotSkinIdentifyN;
        List list;
        Map map;
        Map map2;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Iterator it;
        Iterator it2;
        int i;
        TarotSkinIdentify tarotSkinIdentify11;
        cod codVarO;
        int iOrdinal;
        char c;
        if (zn2Var instanceof i63) {
            i63Var = (i63) zn2Var;
            int i2 = i63Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i63Var.label = i2 - Integer.MIN_VALUE;
            } else {
                i63Var = new i63(this, zn2Var);
            }
        } else {
            i63Var = new i63(this, zn2Var);
        }
        Object objB2 = i63Var.result;
        bw2 bw2Var = bw2.a;
        int i3 = i63Var.label;
        Object obj = null;
        int i4 = 2;
        int i5 = 1;
        if (i3 == 0) {
            jzb.q(objB2);
            wj5 wj5Var = this.f.b;
            i63Var.L$0 = str;
            i63Var.L$1 = tarotSkinIdentify;
            i63Var.L$2 = tarotSkinIdentify2;
            i63Var.L$3 = tarotSkinIdentify3;
            i63Var.label = 1;
            objB2 = tm7.B(wj5Var, i63Var);
            if (objB2 != bw2Var) {
                str2 = str;
                tarotSkinIdentify4 = tarotSkinIdentify3;
                tarotSkinIdentify5 = tarotSkinIdentify;
                tarotSkinIdentify6 = tarotSkinIdentify2;
            }
            return bw2Var;
        }
        if (i3 == 1) {
            tarotSkinIdentify4 = (TarotSkinIdentify) i63Var.L$3;
            tarotSkinIdentify6 = (TarotSkinIdentify) i63Var.L$2;
            tarotSkinIdentify5 = (TarotSkinIdentify) i63Var.L$1;
            str2 = (String) i63Var.L$0;
            jzb.q(objB2);
        } else {
            if (i3 == 2) {
                yofVar = (yof) i63Var.L$4;
                tarotSkinIdentify9 = (TarotSkinIdentify) i63Var.L$3;
                tarotSkinIdentify8 = (TarotSkinIdentify) i63Var.L$2;
                TarotSkinIdentify tarotSkinIdentify12 = (TarotSkinIdentify) i63Var.L$1;
                String str5 = (String) i63Var.L$0;
                jzb.q(objB2);
                tarotSkinIdentify7 = tarotSkinIdentify12;
                str2 = str5;
                mfcVar = (mfc) objB2;
                wc8 wc8Var = this.e.d;
                i63Var.L$0 = str2;
                i63Var.L$1 = tarotSkinIdentify7;
                i63Var.L$2 = tarotSkinIdentify8;
                i63Var.L$3 = tarotSkinIdentify9;
                i63Var.L$4 = yofVar;
                i63Var.L$5 = mfcVar;
                i63Var.label = 3;
                objB = tm7.B(wc8Var, i63Var);
                if (objB != bw2Var) {
                    mfcVar2 = mfcVar;
                    objB2 = objB;
                    str3 = str2;
                    tarotSkinIdentify10 = tarotSkinIdentify7;
                }
                return bw2Var;
            }
            if (i3 != 3) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mfcVar2 = (mfc) i63Var.L$5;
            yofVar = (yof) i63Var.L$4;
            tarotSkinIdentify9 = (TarotSkinIdentify) i63Var.L$3;
            tarotSkinIdentify8 = (TarotSkinIdentify) i63Var.L$2;
            tarotSkinIdentify10 = (TarotSkinIdentify) i63Var.L$1;
            str3 = (String) i63Var.L$0;
            jzb.q(objB2);
        }
        lb8 lb8Var = (lb8) objB2;
        xke xkeVar = TarotSkinIdentify.Companion;
        n2f n2fVar = yofVar.g;
        xkeVar.getClass();
        tarotSkinIdentifyA = xke.a(n2fVar);
        str4 = (String) lb8Var.u.get(str3);
        if (str4 != null) {
            tarotSkinIdentifyN = r8c.n(str4, mfcVar2);
        } else {
            tarotSkinIdentifyN = null;
        }
        if (tarotSkinIdentify8 == null) {
            if (tarotSkinIdentify10 == null) {
                tarotSkinIdentify8 = tarotSkinIdentify10;
            } else if (tarotSkinIdentifyN == null) {
                tarotSkinIdentify8 = tarotSkinIdentifyA;
            } else {
                tarotSkinIdentify8 = tarotSkinIdentifyN;
            }
        }
        if (tarotSkinIdentify10 == null) {
            tarotSkinIdentify9 = tarotSkinIdentify10;
        } else if (tarotSkinIdentify9 == null) {
            if (tarotSkinIdentifyN == null) {
                tarotSkinIdentify9 = tarotSkinIdentify8;
            } else {
                tarotSkinIdentify9 = tarotSkinIdentifyN;
            }
        }
        list = yofVar.f;
        map = this.I0;
        List listC = r8c.c(mfcVar2);
        map2 = lb8Var.t;
        arrayList = new ArrayList();
        arrayList2 = new ArrayList();
        arrayList3 = new ArrayList();
        arrayList4 = new ArrayList();
        it = listC.iterator();
        while (true) {
            if (it.hasNext()) {
                List listB1 = s72.b1(arrayList2, new zd0(i5, new zd0(i4, new g63(0, tarotSkinIdentify9), map2), list));
                List listB2 = s72.b1(arrayList3, new h63(list, 0));
                arrayList.addAll(listB1);
                arrayList.addAll(listB2);
                arrayList.addAll(arrayList4);
                it2 = arrayList.iterator();
                i = 0;
                while (true) {
                    if (it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (((cod) it2.next()).a == tarotSkinIdentify9) {
                        break;
                    }
                    i++;
                }
                return new lld(arrayList, i >= 0 ? i : 0, tarotSkinIdentify8, 24);
            }
            tarotSkinIdentify11 = (TarotSkinIdentify) it.next();
            obj = obj;
            if (!r8c.k(tarotSkinIdentify11) || list.contains(tarotSkinIdentify11.getKey())) {
                codVarO = o(tarotSkinIdentify11, (hmd) map.get(tarotSkinIdentify11), tarotSkinIdentify11 == tarotSkinIdentify9);
                iOrdinal = codVarO.b.ordinal();
                if (iOrdinal != 0 || iOrdinal == 1) {
                    c = 3;
                    arrayList2.add(codVarO);
                } else {
                    c = 3;
                    if (iOrdinal == 2 || iOrdinal == 3) {
                        arrayList3.add(codVarO);
                    } else {
                        if (iOrdinal != 4) {
                            ap.c();
                            return obj;
                        }
                        arrayList4.add(codVarO);
                    }
                }
            } else {
                arrayList4.add(new cod(tarotSkinIdentify11, omd.e, 0.0f));
            }
        }
        yof yofVar2 = (yof) objB2;
        wj5 wj5Var2 = k8b.a;
        i63Var.L$0 = str2;
        i63Var.L$1 = tarotSkinIdentify5;
        i63Var.L$2 = tarotSkinIdentify6;
        i63Var.L$3 = tarotSkinIdentify4;
        i63Var.L$4 = yofVar2;
        i63Var.label = 2;
        Object objB3 = tm7.B(wj5Var2, i63Var);
        if (objB3 != bw2Var) {
            TarotSkinIdentify tarotSkinIdentify13 = tarotSkinIdentify4;
            yofVar = yofVar2;
            objB2 = objB3;
            tarotSkinIdentify7 = tarotSkinIdentify5;
            tarotSkinIdentify8 = tarotSkinIdentify6;
            tarotSkinIdentify9 = tarotSkinIdentify13;
            mfcVar = (mfc) objB2;
            wc8 wc8Var2 = this.e.d;
            i63Var.L$0 = str2;
            i63Var.L$1 = tarotSkinIdentify7;
            i63Var.L$2 = tarotSkinIdentify8;
            i63Var.L$3 = tarotSkinIdentify9;
            i63Var.L$4 = yofVar;
            i63Var.L$5 = mfcVar;
            i63Var.label = 3;
            objB = tm7.B(wc8Var2, i63Var);
            if (objB != bw2Var) {
                mfcVar2 = mfcVar;
                objB2 = objB;
                str3 = str2;
                tarotSkinIdentify10 = tarotSkinIdentify7;
                lb8 lb8Var2 = (lb8) objB2;
                xke xkeVar2 = TarotSkinIdentify.Companion;
                n2f n2fVar2 = yofVar.g;
                xkeVar2.getClass();
                tarotSkinIdentifyA = xke.a(n2fVar2);
                str4 = (String) lb8Var2.u.get(str3);
                if (str4 != null) {
                    tarotSkinIdentifyN = r8c.n(str4, mfcVar2);
                } else {
                    tarotSkinIdentifyN = null;
                }
                if (tarotSkinIdentify8 == null) {
                    if (tarotSkinIdentify10 == null) {
                        tarotSkinIdentify8 = tarotSkinIdentify10;
                    } else if (tarotSkinIdentifyN == null) {
                        tarotSkinIdentify8 = tarotSkinIdentifyA;
                    } else {
                        tarotSkinIdentify8 = tarotSkinIdentifyN;
                    }
                }
                if (tarotSkinIdentify10 == null) {
                    tarotSkinIdentify9 = tarotSkinIdentify10;
                } else if (tarotSkinIdentify9 == null) {
                    if (tarotSkinIdentifyN == null) {
                        tarotSkinIdentify9 = tarotSkinIdentify8;
                    } else {
                        tarotSkinIdentify9 = tarotSkinIdentifyN;
                    }
                }
                list = yofVar.f;
                map = this.I0;
                List listC2 = r8c.c(mfcVar2);
                map2 = lb8Var2.t;
                arrayList = new ArrayList();
                arrayList2 = new ArrayList();
                arrayList3 = new ArrayList();
                arrayList4 = new ArrayList();
                it = listC2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        List listB3 = s72.b1(arrayList2, new zd0(i5, new zd0(i4, new g63(0, tarotSkinIdentify9), map2), list));
                        List listB4 = s72.b1(arrayList3, new h63(list, 0));
                        arrayList.addAll(listB3);
                        arrayList.addAll(listB4);
                        arrayList.addAll(arrayList4);
                        it2 = arrayList.iterator();
                        i = 0;
                        while (true) {
                            if (it2.hasNext()) {
                                i = -1;
                                break;
                            }
                            if (((cod) it2.next()).a == tarotSkinIdentify9) {
                                break;
                                break;
                            }
                            i++;
                        }
                        return new lld(arrayList, i >= 0 ? i : 0, tarotSkinIdentify8, 24);
                    }
                    tarotSkinIdentify11 = (TarotSkinIdentify) it.next();
                    obj = obj;
                    if (r8c.k(tarotSkinIdentify11)) {
                    }
                    codVarO = o(tarotSkinIdentify11, (hmd) map.get(tarotSkinIdentify11), tarotSkinIdentify11 == tarotSkinIdentify9);
                    iOrdinal = codVarO.b.ordinal();
                    if (iOrdinal != 0) {
                        c = 3;
                        arrayList2.add(codVarO);
                    } else {
                        c = 3;
                        arrayList2.add(codVarO);
                    }
                }
            }
        }
        return bw2Var;
    }

    public final void g() {
        TarotSkinIdentify tarotSkinIdentifyB;
        n2f key;
        String strName;
        Object value = this.x.getValue();
        d63 d63Var = value instanceof d63 ? (d63) value : null;
        if (d63Var == null || (tarotSkinIdentifyB = d63Var.g.b()) == null || (key = tarotSkinIdentifyB.getKey()) == null || (strName = key.name()) == null) {
            return;
        }
        ynb.V(hwf.a(this), fg9.b, null, new j63(this, d63Var, strName, null), 2);
    }

    public final void h(Context context, String str, boolean z, TarotSkinIdentify tarotSkinIdentify) {
        context.getClass();
        str.getClass();
        long j = this.G0 + 1;
        this.G0 = j;
        long j2 = this.H0.get();
        Object value = this.x.getValue();
        d63 d63Var = value instanceof d63 ? (d63) value : null;
        lld lldVar = d63Var != null ? d63Var.g : null;
        lyd lydVar = this.F0;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.F0 = ynb.V(hwf.a(this), null, null, new t63(j, this, j2, z, context, str, tarotSkinIdentify, lldVar, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object i(r33 r33Var, TarotSkinIdentify tarotSkinIdentify, TarotSkinIdentify tarotSkinIdentify2, TarotSkinIdentify tarotSkinIdentify3, zn2 zn2Var) {
        u63 u63Var;
        int i;
        r33 r33Var2;
        TarotCardChoice tarotCardChoice;
        DailyFortuneDirectionContent dailyFortuneDirectionContent;
        String str;
        if (zn2Var instanceof u63) {
            u63Var = (u63) zn2Var;
            int i2 = u63Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u63Var.label = i2 - Integer.MIN_VALUE;
            } else {
                u63Var = new u63(this, zn2Var);
            }
        } else {
            u63Var = new u63(this, zn2Var);
        }
        u63 u63Var2 = u63Var;
        Object objF = u63Var2.result;
        int i3 = u63Var2.label;
        if (i3 == 0) {
            jzb.q(objF);
            TarotCardChoice tarotCardChoiceN = o5c.n(r33Var);
            String str2 = r33Var.d;
            if (tarotCardChoiceN == null) {
                return new b63("no card");
            }
            int i4 = r33Var.c;
            if (i4 == 0) {
                i = 0;
            } else {
                if (i4 != 1) {
                    qc0.j(tec.e(i4, "Invalid orientation value: "));
                    return null;
                }
                i = 1;
            }
            DailyFortuneDirectionContent dailyFortuneDirectionContentB = this.d.b(new qhe(str2, i));
            String str3 = r33Var.h;
            String str4 = str3.length() == 0 ? str2 : str3;
            String str5 = r33Var.a;
            u63Var2.L$0 = r33Var;
            u63Var2.L$1 = null;
            u63Var2.L$2 = null;
            u63Var2.L$3 = null;
            u63Var2.L$4 = tarotCardChoiceN;
            u63Var2.L$5 = null;
            u63Var2.L$6 = dailyFortuneDirectionContentB;
            u63Var2.L$7 = str4;
            u63Var2.label = 1;
            objF = f(str5, tarotSkinIdentify, tarotSkinIdentify2, tarotSkinIdentify3, u63Var2);
            Object obj = bw2.a;
            if (objF == obj) {
                return obj;
            }
            r33Var2 = r33Var;
            tarotCardChoice = tarotCardChoiceN;
            dailyFortuneDirectionContent = dailyFortuneDirectionContentB;
            str = str4;
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            String str6 = (String) u63Var2.L$7;
            dailyFortuneDirectionContent = (DailyFortuneDirectionContent) u63Var2.L$6;
            TarotCardChoice tarotCardChoice2 = (TarotCardChoice) u63Var2.L$4;
            r33Var2 = (r33) u63Var2.L$0;
            jzb.q(objF);
            str = str6;
            tarotCardChoice = tarotCardChoice2;
        }
        lld lldVar = (lld) objF;
        String str7 = r33Var2.a;
        String affirmation = dailyFortuneDirectionContent != null ? dailyFortuneDirectionContent.getAffirmation() : null;
        String str8 = affirmation == null ? "" : affirmation;
        String reading = dailyFortuneDirectionContent != null ? dailyFortuneDirectionContent.getReading() : null;
        String str9 = reading == null ? "" : reading;
        List<String> questions = dailyFortuneDirectionContent != null ? dailyFortuneDirectionContent.getQuestions() : null;
        pu4 pu4Var = pu4.a;
        List<String> list = questions == null ? pu4Var : questions;
        List<String> dos = dailyFortuneDirectionContent != null ? dailyFortuneDirectionContent.getDos() : null;
        List<String> list2 = dos == null ? pu4Var : dos;
        List<String> donts = dailyFortuneDirectionContent != null ? dailyFortuneDirectionContent.getDonts() : null;
        return new d63(str7, str8, tarotCardChoice, str, str9, list, lldVar, list2, donts == null ? pu4Var : donts);
    }

    public final void l(w33 w33Var, TarotSkinIdentify tarotSkinIdentify) {
        AtomicReference atomicReference;
        v33 v33Var;
        lld lldVar;
        TarotSkinIdentify tarotSkinIdentify2;
        tarotSkinIdentify.getClass();
        if (w33Var != w33.b && w33Var != w33.c) {
            qc0.j("Failed requirement.");
            return;
        }
        do {
            atomicReference = this.z;
            v33Var = v33.a;
            if (atomicReference.compareAndSet(v33Var, v33.c)) {
                Object value = this.x.getValue();
                d63 d63Var = value instanceof d63 ? (d63) value : null;
                if (d63Var != null && (lldVar = d63Var.g) != null && (tarotSkinIdentify2 = lldVar.c) != null) {
                    tarotSkinIdentify = tarotSkinIdentify2;
                }
                u33 u33Var = new u33(this.X.incrementAndGet(), tarotSkinIdentify, w33Var);
                s0e s0eVar = this.Y;
                s0eVar.getClass();
                s0eVar.n(null, u33Var);
                return;
            }
        } while (atomicReference.get() == v33Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x006c  */
    /* JADX WARN: Code duplicated, block: B:34:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0045 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x005a -> B:25:0x005b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object m(defpackage.a26 r7, defpackage.zn2 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.w63
            if (r0 == 0) goto L13
            r0 = r8
            w63 r0 = (defpackage.w63) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            w63 r0 = new w63
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r6 = r0.result
            int r8 = r0.label
            r1 = 0
            r2 = 1
            if (r8 == 0) goto L3a
            if (r8 != r2) goto L34
            int r7 = r0.I$1
            int r8 = r0.I$0
            java.lang.Object r3 = r0.L$1
            y63 r3 = (defpackage.y63) r3
            java.lang.Object r3 = r0.L$0
            a26 r3 = (defpackage.a26) r3
            defpackage.jzb.q(r6)     // Catch: java.lang.Throwable -> L32
            goto L5b
        L32:
            r6 = move-exception
            goto L62
        L34:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L3a:
            defpackage.jzb.q(r6)
            r6 = 2
            r8 = 0
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r5
        L43:
            if (r7 >= r8) goto L72
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L5e
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L5e
            r0.I$0 = r8     // Catch: java.lang.Throwable -> L5e
            r0.I$1 = r7     // Catch: java.lang.Throwable -> L5e
            r0.I$2 = r7     // Catch: java.lang.Throwable -> L5e
            r0.label = r2     // Catch: java.lang.Throwable -> L5e
            java.lang.Object r3 = r6.d(r0)     // Catch: java.lang.Throwable -> L5e
            bw2 r4 = defpackage.bw2.a
            if (r3 != r4) goto L5a
            return r4
        L5a:
            r3 = r6
        L5b:
            wef r6 = defpackage.wef.a     // Catch: java.lang.Throwable -> L32
            goto L68
        L5e:
            r3 = move-exception
            r5 = r3
            r3 = r6
            r6 = r5
        L62:
            dzb r4 = new dzb
            r4.<init>(r6)
            r6 = r4
        L68:
            boolean r6 = r6 instanceof defpackage.dzb
            if (r6 != 0) goto L6f
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        L6f:
            int r7 = r7 + r2
            r6 = r3
            goto L43
        L72:
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y63.m(a26, zn2):java.lang.Object");
    }

    public final void n(int i) {
        s0e s0eVar;
        Object value;
        Object objA;
        if (this.z.get() != v33.a) {
            return;
        }
        boolean z = false;
        do {
            s0eVar = this.x;
            value = s0eVar.getValue();
            objA = (e63) value;
            d63 d63Var = objA instanceof d63 ? (d63) objA : null;
            if (d63Var != null) {
                lld lldVar = d63Var.g;
                if (((cod) s72.y0(i, lldVar.a)) != null) {
                    List list = lldVar.a;
                    ArrayList arrayList = new ArrayList(t72.u(list, 10));
                    int i2 = 0;
                    for (Object obj : list) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            t72.Z();
                            throw null;
                        }
                        cod codVarA = (cod) obj;
                        omd omdVar = omd.a;
                        omd omdVar2 = omd.b;
                        if (i2 == i && codVarA.b == omdVar2) {
                            codVarA = cod.a(codVarA, omdVar);
                        } else if (codVarA.b == omdVar) {
                            codVarA = cod.a(codVarA, omdVar2);
                        }
                        arrayList.add(codVarA);
                        i2 = i3;
                    }
                    objA = d63.a(d63Var, lld.a(lldVar, arrayList, i, null, false, false, 28));
                    z = true;
                }
            }
            z = z;
        } while (!s0eVar.l(value, objA));
        if (z) {
            this.J0 = true;
            this.H0.incrementAndGet();
        }
    }
}
