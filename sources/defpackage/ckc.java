package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ckc implements hf8 {
    public final t7 a;
    public final f99 b = new f99();

    public ckc(t7 t7Var) {
        this.a = t7Var;
    }

    public final Map a(String str) {
        Object dzbVar;
        iy9 iy9Var;
        if (!v4e.Q(str)) {
            try {
                Object objE = fzc.a.e(str);
                dzbVar = objE instanceof ti7 ? (ti7) objE : null;
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            ti7 ti7Var = (ti7) dzbVar;
            if (ti7Var != null) {
                Set<Map.Entry> setEntrySet = ti7Var.a.entrySet();
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : setEntrySet) {
                    String str2 = (String) entry.getKey();
                    try {
                        iy9Var = new iy9(str2, fzc.a.a(SeasonalDraftStore$Draft.Companion.serializer(), (nh7) entry.getValue()));
                    } catch (yyc e) {
                        d().g("skip unparseable seasonal draft for " + str2 + ": " + e.getMessage());
                        iy9Var = null;
                    }
                    if (iy9Var != null) {
                        arrayList.add(iy9Var);
                    }
                }
                return bm8.W(arrayList);
            }
        }
        return qu4.a;
    }

    public final SeasonalDraftStore$Draft b(int i, String str) {
        str.getClass();
        hs3 hs3Var = xqa.v0;
        return (SeasonalDraftStore$Draft) a((String) z5c.I(nu4.a, new yjc(hs3Var.a, hs3Var.b, null))).get(c(i, str));
    }

    public final String c(int i, String str) {
        return ((mo3) this.a).a() + "#" + i + "#" + str;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00df A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:21:0x0073, B:34:0x00c8, B:36:0x00df, B:37:0x00f2, B:39:0x00fe, B:41:0x0105, B:40:0x0102), top: B:53:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00fe A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:21:0x0073, B:34:0x00c8, B:36:0x00df, B:37:0x00f2, B:39:0x00fe, B:41:0x0105, B:40:0x0102), top: B:53:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0102 A[Catch: all -> 0x0077, TryCatch #1 {all -> 0x0077, blocks: (B:21:0x0073, B:34:0x00c8, B:36:0x00df, B:37:0x00f2, B:39:0x00fe, B:41:0x0105, B:40:0x0102), top: B:53:0x0073 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object e(int i, String str, a26 a26Var, xn2 xn2Var) throws Throwable {
        zjc zjcVar;
        d99 d99Var;
        a26 a26Var2;
        int i2;
        String str2;
        d99 d99Var2;
        d99 d99Var3;
        a26 a26Var3;
        String str3;
        LinkedHashMap linkedHashMap;
        String strC;
        SeasonalDraftStore$Draft seasonalDraftStore$Draft;
        SeasonalDraftStore$Draft seasonalDraftStore$Draft2;
        String strD;
        isa isaVar;
        if (xn2Var instanceof zjc) {
            zjcVar = (zjc) xn2Var;
            int i3 = zjcVar.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zjcVar.label = i3 - Integer.MIN_VALUE;
            } else {
                zjcVar = new zjc(this, xn2Var);
            }
        } else {
            zjcVar = new zjc(this, xn2Var);
        }
        Object objB = zjcVar.result;
        int i4 = zjcVar.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i4 == 0) {
                jzb.q(objB);
                zjcVar.L$0 = str;
                zjcVar.L$1 = a26Var;
                d99Var = this.b;
                zjcVar.L$2 = d99Var;
                zjcVar.I$0 = i;
                zjcVar.label = 1;
                if (d99Var.b(zjcVar) != bw2Var) {
                    a26Var2 = a26Var;
                    i2 = i;
                    str2 = str;
                }
                return bw2Var;
            }
            if (i4 != 1) {
                if (i4 == 2) {
                    i2 = zjcVar.I$0;
                    d99Var3 = (d99) zjcVar.L$2;
                    a26Var3 = (a26) zjcVar.L$1;
                    str3 = (String) zjcVar.L$0;
                    try {
                        jzb.q(objB);
                        linkedHashMap = new LinkedHashMap(a((String) objB));
                        strC = c(i2, str3);
                        seasonalDraftStore$Draft = (SeasonalDraftStore$Draft) linkedHashMap.get(strC);
                        if (seasonalDraftStore$Draft == null) {
                            seasonalDraftStore$Draft = new SeasonalDraftStore$Draft((String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 63, (rp3) null);
                        }
                        seasonalDraftStore$Draft2 = (SeasonalDraftStore$Draft) a26Var3.d(seasonalDraftStore$Draft);
                        if (seasonalDraftStore$Draft2.isEmpty()) {
                            linkedHashMap.remove(strC);
                        } else {
                            linkedHashMap.put(strC, seasonalDraftStore$Draft2);
                        }
                        hs3 hs3Var = xqa.v0;
                        xh7 xh7Var = fzc.a;
                        xh7Var.getClass();
                        strD = xh7Var.d(new qh6(p4e.a, SeasonalDraftStore$Draft.Companion.serializer(), 1), linkedHashMap);
                        isaVar = hs3Var.a;
                        zjcVar.L$0 = null;
                        zjcVar.L$1 = null;
                        zjcVar.L$2 = d99Var3;
                        zjcVar.L$3 = null;
                        zjcVar.L$4 = null;
                        zjcVar.L$5 = null;
                        zjcVar.L$6 = null;
                        zjcVar.L$7 = null;
                        zjcVar.L$8 = null;
                        zjcVar.L$9 = null;
                        zjcVar.I$0 = i2;
                        zjcVar.label = 3;
                        if (bsa.n(isaVar, strD, zjcVar) != bw2Var) {
                            d99Var2 = d99Var3;
                        }
                        return bw2Var;
                    } catch (Throwable th) {
                        th = th;
                        d99Var2 = d99Var3;
                        d99Var2.h(null);
                        throw th;
                    }
                }
                if (i4 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) zjcVar.L$2;
                try {
                    jzb.q(objB);
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
                d99Var2.h(null);
                return wef.a;
            }
            i2 = zjcVar.I$0;
            d99Var = (d99) zjcVar.L$2;
            a26Var2 = (a26) zjcVar.L$1;
            str2 = (String) zjcVar.L$0;
            jzb.q(objB);
            bkc bkcVar = new bkc(2, null);
            zjcVar.L$0 = str2;
            zjcVar.L$1 = a26Var2;
            zjcVar.L$2 = d99Var;
            zjcVar.I$0 = i2;
            zjcVar.label = 2;
            objB = lw2.b(bkcVar, zjcVar);
            if (objB != bw2Var) {
                d99Var3 = d99Var;
                a26Var3 = a26Var2;
                str3 = str2;
                linkedHashMap = new LinkedHashMap(a((String) objB));
                strC = c(i2, str3);
                seasonalDraftStore$Draft = (SeasonalDraftStore$Draft) linkedHashMap.get(strC);
                if (seasonalDraftStore$Draft == null) {
                    seasonalDraftStore$Draft = new SeasonalDraftStore$Draft((String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 63, (rp3) null);
                }
                seasonalDraftStore$Draft2 = (SeasonalDraftStore$Draft) a26Var3.d(seasonalDraftStore$Draft);
                if (seasonalDraftStore$Draft2.isEmpty()) {
                    linkedHashMap.remove(strC);
                } else {
                    linkedHashMap.put(strC, seasonalDraftStore$Draft2);
                }
                hs3 hs3Var2 = xqa.v0;
                xh7 xh7Var2 = fzc.a;
                xh7Var2.getClass();
                strD = xh7Var2.d(new qh6(p4e.a, SeasonalDraftStore$Draft.Companion.serializer(), 1), linkedHashMap);
                isaVar = hs3Var2.a;
                zjcVar.L$0 = null;
                zjcVar.L$1 = null;
                zjcVar.L$2 = d99Var3;
                zjcVar.L$3 = null;
                zjcVar.L$4 = null;
                zjcVar.L$5 = null;
                zjcVar.L$6 = null;
                zjcVar.L$7 = null;
                zjcVar.L$8 = null;
                zjcVar.L$9 = null;
                zjcVar.I$0 = i2;
                zjcVar.label = 3;
                if (bsa.n(isaVar, strD, zjcVar) != bw2Var) {
                    d99Var2 = d99Var3;
                    d99Var2.h(null);
                    return wef.a;
                }
            }
            return bw2Var;
        } catch (Throwable th3) {
            th = th3;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }
}
