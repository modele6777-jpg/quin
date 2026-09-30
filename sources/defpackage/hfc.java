package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.onboard.model.UserIntentionType;
import android.content.ClipData;
import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyEvent;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hfc {
    public static final void a(int i, l46 l46Var, j09 j09Var, String str) {
        int i2;
        l46Var.h0(-1861127044);
        if ((i & 6) == 0) {
            i2 = i | (l46Var.g(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            Context context = (Context) l46Var.k(uq.b);
            boolean zG = l46Var.g((Configuration) l46Var.k(uq.a)) | ((i2 & 14) == 4);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = rfc.k(context, str);
                l46Var.p0(objR);
            }
            String strI = (String) objR;
            if (strI == null) {
                strI = tec.i(l46Var, -1836684747, R.string.usage_daily_limit_reset_tomorrow, l46Var, false);
            } else {
                l46Var.f0(-1836687692);
                l46Var.r(false);
            }
            String strR = afc.r(R.string.usage_daily_limit_notice, new Object[]{strI}, l46Var);
            mue mueVar = pue.a;
            nte.b(strR, j09Var, ((e8b) l46Var.k(l8b.a)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.g(l46Var), l46Var, i2 & 112, 0, 130040);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o43(str, j09Var, i, 8, (byte) 0);
        }
    }

    public static String b(String str, String str2) {
        return ib8.j(str, ":", str2);
    }

    public static final void c(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("?");
            if (i2 < i - 1) {
                sb.append(",");
            }
        }
    }

    public static final String d(rzf rzfVar) {
        rzfVar.getClass();
        switch (rzfVar.ordinal()) {
            case 0:
                return "love";
            case 1:
                return "career";
            case 2:
                return "study";
            case 3:
                return "life_confusion";
            case 4:
                return "fortune";
            case 5:
                return "decision";
            case 6:
                return "self_discovery";
            case 7:
                return "random";
            default:
                ap.c();
                return null;
        }
    }

    public static String e(String str, String str2, String str3) {
        return tec.m(str, ":", str2, ":", str3);
    }

    public static final boolean f(KeyEvent keyEvent) {
        return keyEvent.getAction() == 0 && !Character.isISOControl(keyEvent.getUnicodeChar());
    }

    public static final xn7 g(em7 em7Var, ArrayList arrayList, x16 x16Var) {
        xn7 dd0Var;
        xn7 pmbVar;
        kob kobVar = job.a;
        if (em7Var.equals(kobVar.b(Collection.class)) || em7Var.equals(kobVar.b(List.class)) || em7Var.equals(kobVar.b(List.class)) || em7Var.equals(kobVar.b(ArrayList.class))) {
            dd0Var = new dd0((xn7) arrayList.get(0), 0);
        } else if (em7Var.equals(kobVar.b(HashSet.class))) {
            dd0Var = new dd0((xn7) arrayList.get(0), 1);
        } else if (em7Var.equals(kobVar.b(Set.class)) || em7Var.equals(kobVar.b(Set.class)) || em7Var.equals(kobVar.b(LinkedHashSet.class))) {
            dd0Var = new dd0((xn7) arrayList.get(0), 2);
        } else if (em7Var.equals(kobVar.b(HashMap.class))) {
            dd0Var = new qh6((xn7) arrayList.get(0), (xn7) arrayList.get(1), 0);
        } else if (em7Var.equals(kobVar.b(Map.class)) || em7Var.equals(kobVar.b(Map.class)) || em7Var.equals(kobVar.b(LinkedHashMap.class))) {
            dd0Var = new qh6((xn7) arrayList.get(0), (xn7) arrayList.get(1), 1);
        } else {
            if (em7Var.equals(kobVar.b(Map.Entry.class))) {
                xn7 xn7Var = (xn7) arrayList.get(0);
                xn7 xn7Var2 = (xn7) arrayList.get(1);
                xn7Var.getClass();
                xn7Var2.getClass();
                pmbVar = new pl8(xn7Var, xn7Var2, 0);
            } else if (em7Var.equals(kobVar.b(iy9.class))) {
                xn7 xn7Var3 = (xn7) arrayList.get(0);
                xn7 xn7Var4 = (xn7) arrayList.get(1);
                xn7Var3.getClass();
                xn7Var4.getClass();
                pmbVar = new pl8(xn7Var3, xn7Var4, 1);
            } else if (em7Var.equals(kobVar.b(m5f.class))) {
                xn7 xn7Var5 = (xn7) arrayList.get(0);
                xn7 xn7Var6 = (xn7) arrayList.get(1);
                xn7 xn7Var7 = (xn7) arrayList.get(2);
                xn7Var5.getClass();
                xn7Var6.getClass();
                xn7Var7.getClass();
                dd0Var = new n5f(xn7Var5, xn7Var6, xn7Var7);
            } else if (af1.R(em7Var).isArray()) {
                Object objInvoke = x16Var.invoke();
                objInvoke.getClass();
                xn7 xn7Var8 = (xn7) arrayList.get(0);
                xn7Var8.getClass();
                pmbVar = new pmb((em7) objInvoke, xn7Var8);
            } else {
                dd0Var = null;
            }
            dd0Var = pmbVar;
        }
        if (dd0Var != null) {
            return dd0Var;
        }
        xn7[] xn7VarArr = (xn7[]) arrayList.toArray(new xn7[0]);
        xn7[] xn7VarArr2 = (xn7[]) Arrays.copyOf(xn7VarArr, xn7VarArr.length);
        return g21.C(af1.R(em7Var), (xn7[]) Arrays.copyOf(xn7VarArr2, xn7VarArr2.length));
    }

    public static final lmd h(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        switch (nld.a[tarotSkinIdentify.ordinal()]) {
            case 1:
                return lmd.c;
            case 2:
                return lmd.d;
            case 3:
                return lmd.e;
            case 4:
                return lmd.f;
            case 5:
                return lmd.g;
            case 6:
                return lmd.w;
            case 7:
                return lmd.v;
            case 8:
                return lmd.x;
            case 9:
                return lmd.y;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return lmd.z;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return lmd.X;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return lmd.Y;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return lmd.Z;
            case 14:
                return lmd.E0;
            case 15:
                return lmd.F0;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return lmd.G0;
            case 17:
                return lmd.H0;
            case 18:
                return lmd.I0;
            default:
                ap.c();
                return null;
        }
    }

    public static final List i(x8c x8cVar) {
        int iG = z8c.g(x8cVar, "id");
        int iG2 = z8c.g(x8cVar, "seq");
        int iG3 = z8c.g(x8cVar, "from");
        int iG4 = z8c.g(x8cVar, "to");
        c78 c78VarW = t72.w();
        while (x8cVar.R0()) {
            c78VarW.add(new mr5(x8cVar.t0(iG3), (int) x8cVar.getLong(iG), x8cVar.t0(iG4), (int) x8cVar.getLong(iG2)));
        }
        return s72.a1(c78VarW.n());
    }

    public static final mde j(q8c q8cVar, String str, boolean z) {
        x8c x8cVarW0 = q8cVar.W0("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iG = z8c.g(x8cVarW0, "seqno");
            int iG2 = z8c.g(x8cVarW0, "cid");
            int iG3 = z8c.g(x8cVarW0, "name");
            int iG4 = z8c.g(x8cVarW0, "desc");
            if (iG != -1 && iG2 != -1 && iG3 != -1 && iG4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (x8cVarW0.R0()) {
                    if (((int) x8cVarW0.getLong(iG2)) >= 0) {
                        int i = (int) x8cVarW0.getLong(iG);
                        String strT0 = x8cVarW0.t0(iG3);
                        String str2 = x8cVarW0.getLong(iG4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strT0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listB1 = s72.b1(linkedHashMap.entrySet(), new kv8(10));
                ArrayList arrayList = new ArrayList(t72.u(listB1, 10));
                Iterator it = listB1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listJ1 = s72.j1(arrayList);
                List listB2 = s72.b1(linkedHashMap2.entrySet(), new kv8(11));
                ArrayList arrayList2 = new ArrayList(t72.u(listB2, 10));
                Iterator it2 = listB2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                mde mdeVar = new mde(str, z, listJ1, s72.j1(arrayList2));
                cgg.t(x8cVarW0, null);
                return mdeVar;
            }
            cgg.t(x8cVarW0, null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(x8cVarW0, th);
                throw th2;
            }
        }
    }

    public static final String k(a52 a52Var) {
        ClipData clipData = a52Var.a;
        ClipData clipData2 = a52Var.a;
        int itemCount = clipData.getItemCount();
        boolean z = false;
        for (int i = 0; i < itemCount; i++) {
            z = z || clipData2.getItemAt(i).getText() != null;
        }
        if (!z) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        int itemCount2 = clipData2.getItemCount();
        boolean z2 = false;
        for (int i2 = 0; i2 < itemCount2; i2++) {
            CharSequence text = clipData2.getItemAt(i2).getText();
            if (text != null) {
                if (z2) {
                    sb.append("\n");
                }
                sb.append(text);
                z2 = true;
            }
        }
        return sb.toString();
    }

    public static final xn7 l(em7 em7Var) {
        em7Var.getClass();
        xn7 xn7VarO = o(em7Var);
        if (xn7VarO != null) {
            return xn7VarO;
        }
        throw new yyc(hkg.D0(em7Var));
    }

    public static final xn7 m(hzc hzcVar, yn7 yn7Var) {
        hzcVar.getClass();
        yn7Var.getClass();
        xn7 xn7VarN = n(hzcVar, yn7Var, true);
        if (xn7VarN != null) {
            return xn7VarN;
        }
        throw new yyc(hkg.D0(hkg.A0(yn7Var)));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051  */
    /* JADX WARN: Code duplicated, block: B:46:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00da  */
    /* JADX WARN: Code duplicated, block: B:62:0x00df A[RETURN] */
    public static final xn7 n(hzc hzcVar, yn7 yn7Var, boolean z) {
        xn7 xn7VarH;
        xn7 xn7VarC;
        xn7 ajaVar;
        em7 em7VarA0 = hkg.A0(yn7Var);
        boolean zO = yn7Var.o();
        List<do7> listA = yn7Var.A();
        ArrayList arrayList = new ArrayList(t72.u(listA, 10));
        for (do7 do7Var : listA) {
            do7Var.getClass();
            yn7 yn7Var2 = do7Var.b;
            if (yn7Var2 == null) {
                ho7.y(yn7Var2, "Star projections in type arguments are not allowed, but had ");
                return null;
            }
            arrayList.add(yn7Var2);
        }
        boolean zIsEmpty = arrayList.isEmpty();
        List list = pu4.a;
        if (zIsEmpty) {
            if (!af1.R(em7VarA0).isInterface() || hzcVar.c(em7VarA0, list) == null) {
                ezc ezcVar = gzc.a;
                if (zO) {
                    xn7VarH = gzc.b.h(em7VarA0);
                } else {
                    xn7VarH = gzc.a.h(em7VarA0);
                    if (xn7VarH == null) {
                        xn7VarH = null;
                    }
                }
            } else {
                xn7VarH = null;
            }
        } else if (hzcVar.a) {
            xn7VarH = null;
        } else {
            ezc ezcVar2 = gzc.a;
            Object objR = !zO ? gzc.c.r(em7VarA0, arrayList) : gzc.d.r(em7VarA0, arrayList);
            if (objR instanceof dzb) {
                objR = null;
            }
            xn7VarH = (xn7) objR;
        }
        if (xn7VarH != null) {
            return xn7VarH;
        }
        if (arrayList.isEmpty()) {
            xn7VarC = o(em7VarA0);
            if (xn7VarC == null && (xn7VarC = hzcVar.c(em7VarA0, list)) == null) {
                if (af1.R(em7VarA0).isInterface()) {
                    ajaVar = new aja(em7VarA0);
                    xn7VarC = ajaVar;
                } else {
                    xn7VarC = null;
                }
            }
            if (xn7VarC != null) {
                if (zO) {
                    return t72.F(xn7VarC);
                }
                return xn7VarC;
            }
        } else {
            ArrayList arrayListP = p(hzcVar, arrayList, z);
            if (arrayListP != null) {
                xn7 xn7VarG = g(em7VarA0, arrayListP, new ep9(2, arrayList));
                if (xn7VarG == null) {
                    xn7VarC = hzcVar.c(em7VarA0, arrayListP);
                    if (xn7VarC == null) {
                        if (af1.R(em7VarA0).isInterface()) {
                            ajaVar = new aja(em7VarA0);
                            xn7VarC = ajaVar;
                        } else {
                            xn7VarC = null;
                        }
                    }
                } else {
                    xn7VarC = xn7VarG;
                }
                if (xn7VarC != null) {
                    if (zO) {
                        return t72.F(xn7VarC);
                    }
                    return xn7VarC;
                }
            }
        }
        return null;
    }

    public static final xn7 o(em7 em7Var) {
        em7Var.getClass();
        xn7 xn7VarC = g21.C(af1.R(em7Var), (xn7[]) Arrays.copyOf(new xn7[0], 0));
        return xn7VarC == null ? (xn7) kua.a.get(em7Var) : xn7VarC;
    }

    public static final ArrayList p(hzc hzcVar, List list, boolean z) {
        hzcVar.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m(hzcVar, (yn7) it.next()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(t72.u(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            yn7 yn7Var = (yn7) it2.next();
            yn7Var.getClass();
            xn7 xn7VarN = n(hzcVar, yn7Var, false);
            if (xn7VarN == null) {
                return null;
            }
            arrayList2.add(xn7VarN);
        }
        return arrayList2;
    }

    public static final mld q(TarotSkinIdentify tarotSkinIdentify) {
        tarotSkinIdentify.getClass();
        switch (nld.a[tarotSkinIdentify.ordinal()]) {
            case 1:
                return mld.a;
            case 2:
                return mld.b;
            case 3:
                return mld.c;
            case 4:
                return mld.d;
            case 5:
                return mld.e;
            case 6:
                return mld.f;
            case 7:
                return mld.g;
            case 8:
                return mld.v;
            case 9:
                return mld.w;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return mld.x;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return mld.y;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return mld.z;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return mld.X;
            case 14:
                return mld.Y;
            case 15:
                return mld.Z;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return mld.E0;
            case 17:
                return mld.F0;
            case 18:
                return mld.G0;
            default:
                ap.c();
                return null;
        }
    }

    public static final UserIntentionType r(rzf rzfVar) {
        rzfVar.getClass();
        switch (rzfVar.ordinal()) {
            case 0:
                return UserIntentionType.Emotion;
            case 1:
                return UserIntentionType.Career;
            case 2:
                return UserIntentionType.AcademicAdvice;
            case 3:
                return UserIntentionType.Life;
            case 4:
                return UserIntentionType.Fortune;
            case 5:
                return UserIntentionType.DecisionMaking;
            case 6:
                return UserIntentionType.SelfUnderstanding;
            case 7:
                return UserIntentionType.MultiSelector;
            default:
                ap.c();
                return null;
        }
    }

    public static boolean s(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }
}
