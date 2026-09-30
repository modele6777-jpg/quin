package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class inf implements hf8 {
    public static final /* synthetic */ int g = 0;
    public final Object a = new Object();
    public final f99 b = new f99();
    public final LinkedHashMap c = new LinkedHashMap();
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashSet e = new LinkedHashSet();
    public long f;

    public inf(bnf bnfVar) {
    }

    public static boolean a(String str, String str2) {
        if (pa7.t(str, str2)) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("|");
        return c5e.C(str, sb.toString(), false);
    }

    public final boolean b(cnf cnfVar) {
        boolean z;
        synchronized (this.a) {
            z = this.e.contains(cnfVar) || this.c.containsKey(cnfVar);
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var) {
        dnf dnfVar;
        Object dzbVar;
        if (zn2Var instanceof dnf) {
            dnfVar = (dnf) zn2Var;
            int i = dnfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dnfVar.label = i - Integer.MIN_VALUE;
            } else {
                dnfVar = new dnf(this, zn2Var);
            }
        } else {
            dnfVar = new dnf(this, zn2Var);
        }
        Object objB = dnfVar.result;
        int i2 = dnfVar.label;
        if (i2 == 0) {
            jzb.q(objB);
            dnfVar.label = 1;
            objB = lw2.b(new dsa(2, null), dnfVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objB);
        }
        String str = (String) objB;
        boolean zQ = v4e.Q(str);
        qu4 qu4Var = qu4.a;
        if (zQ) {
            return qu4Var;
        }
        try {
            xh7 xh7Var = fzc.a;
            xh7Var.getClass();
            p4e p4eVar = p4e.a;
            dzbVar = (Map) xh7Var.b(new qh6(p4eVar, new dd0(p4eVar, 2), 1), str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            d().g("Failed to decode user popup exposures: " + thA.getMessage());
        }
        return dzbVar instanceof dzb ? qu4Var : dzbVar;
    }

    public final Object e(LinkedHashMap linkedHashMap, zn2 zn2Var) {
        xh7 xh7Var = fzc.a;
        xh7Var.getClass();
        p4e p4eVar = p4e.a;
        return bsa.o(xqa.M.a, xh7Var.d(new qh6(p4eVar, new dd0(p4eVar, 2), 1), linkedHashMap), zn2Var);
    }

    public final Object f(cnf cnfVar, long j, fnf fnfVar) {
        Object objR = rs0.R(5000L, new enf(this, cnfVar, j, null), fnfVar);
        return objR == bw2.a ? objR : wef.a;
    }

    public final void g(cnf cnfVar, long j) {
        Long l;
        synchronized (this.a) {
            try {
                Long l2 = (Long) this.c.get(cnfVar);
                if (l2 != null && l2.longValue() == j) {
                    this.c.remove(cnfVar);
                }
                dg7 dg7Var = (dg7) this.d.get(cnfVar);
                if (dg7Var == null || dg7Var.L0() || (l = (Long) this.c.get(cnfVar)) == null || l.longValue() != j) {
                    this.d.remove(cnfVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x01af A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x004f, B:85:0x0206, B:66:0x01a1, B:68:0x01af, B:69:0x01b1, B:70:0x01bd, B:72:0x01c3, B:74:0x01d0, B:75:0x01d4, B:78:0x01e0, B:80:0x01e6, B:82:0x01ed, B:81:0x01ea), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c3 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x004f, B:85:0x0206, B:66:0x01a1, B:68:0x01af, B:69:0x01b1, B:70:0x01bd, B:72:0x01c3, B:74:0x01d0, B:75:0x01d4, B:78:0x01e0, B:80:0x01e6, B:82:0x01ed, B:81:0x01ea), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01de  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e0 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x004f, B:85:0x0206, B:66:0x01a1, B:68:0x01af, B:69:0x01b1, B:70:0x01bd, B:72:0x01c3, B:74:0x01d0, B:75:0x01d4, B:78:0x01e0, B:80:0x01e6, B:82:0x01ed, B:81:0x01ea), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e6 A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x004f, B:85:0x0206, B:66:0x01a1, B:68:0x01af, B:69:0x01b1, B:70:0x01bd, B:72:0x01c3, B:74:0x01d0, B:75:0x01d4, B:78:0x01e0, B:80:0x01e6, B:82:0x01ed, B:81:0x01ea), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01ea A[Catch: all -> 0x0054, TryCatch #1 {all -> 0x0054, blocks: (B:14:0x004f, B:85:0x0206, B:66:0x01a1, B:68:0x01af, B:69:0x01b1, B:70:0x01bd, B:72:0x01c3, B:74:0x01d0, B:75:0x01d4, B:78:0x01e0, B:80:0x01e6, B:82:0x01ed, B:81:0x01ea), top: B:98:0x002a }] */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0203, code lost:
    
        if (e(r8, r4) == r5) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v0, types: [inf] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.CharSequence, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7, types: [d99] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.util.LinkedHashMap, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(java.lang.String r18, java.lang.String r19, defpackage.zn2 r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 537
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.inf.h(java.lang.String, java.lang.String, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(String str, String str2, zn2 zn2Var) throws Throwable {
        hnf hnfVar;
        cnf cnfVar;
        d99 d99Var;
        d99 d99Var2;
        String str3;
        cnf cnfVar2;
        String str4;
        boolean z;
        if (zn2Var instanceof hnf) {
            hnfVar = (hnf) zn2Var;
            int i = hnfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                hnfVar.label = i - Integer.MIN_VALUE;
            } else {
                hnfVar = new hnf(this, zn2Var);
            }
        } else {
            hnfVar = new hnf(this, zn2Var);
        }
        Object obj = hnfVar.result;
        Object obj2 = bw2.a;
        int i2 = hnfVar.label;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                if (v4e.Q(str) || v4e.Q(str2)) {
                    return Boolean.FALSE;
                }
                cnfVar = new cnf(str, str2);
                if (b(cnfVar)) {
                    return Boolean.TRUE;
                }
                d99Var = this.b;
                hnfVar.L$0 = str;
                hnfVar.L$1 = str2;
                hnfVar.L$2 = cnfVar;
                hnfVar.L$3 = d99Var;
                hnfVar.label = 1;
                if (d99Var.b(hnfVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) hnfVar.L$3;
                cnfVar2 = (cnf) hnfVar.L$2;
                str3 = (String) hnfVar.L$1;
                str4 = (String) hnfVar.L$0;
                try {
                    jzb.q(obj);
                    Set set = (Set) ((Map) obj).get(str4);
                    z = set == null && set.contains(str3);
                    d99Var2.h(null);
                    if (z) {
                        return Boolean.valueOf(b(cnfVar2));
                    }
                    synchronized (this.a) {
                        this.e.add(cnfVar2);
                    }
                    return Boolean.TRUE;
                } catch (Throwable th) {
                    th = th;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) hnfVar.L$3;
            cnf cnfVar3 = (cnf) hnfVar.L$2;
            String str5 = (String) hnfVar.L$1;
            String str6 = (String) hnfVar.L$0;
            jzb.q(obj);
            cnfVar = cnfVar3;
            str2 = str5;
            d99Var = d99Var3;
            str = str6;
            hnfVar.L$0 = str;
            hnfVar.L$1 = str2;
            hnfVar.L$2 = cnfVar;
            hnfVar.L$3 = d99Var;
            hnfVar.label = 2;
            Object objC = c(hnfVar);
            if (objC != obj2) {
                str3 = str2;
                cnfVar2 = cnfVar;
                obj = objC;
                str4 = str;
                d99Var2 = d99Var;
                Set set2 = (Set) ((Map) obj).get(str4);
                if (set2 == null) {
                }
                d99Var2.h(null);
                if (z) {
                    return Boolean.valueOf(b(cnfVar2));
                }
                synchronized (this.a) {
                    this.e.add(cnfVar2);
                    return Boolean.TRUE;
                }
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }
}
