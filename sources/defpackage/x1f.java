package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x1f implements lr7 {
    public static final x1f a = new x1f();
    public static final AtomicReference b = new AtomicReference(null);
    public static final AtomicReference c = new AtomicReference(null);
    public static final ace d = new ace(new mie(18));
    public static final ace e = new ace(new mie(19));
    public static final ace f = new ace(new mie(20));
    public static final ace g = new ace(new mie(21));

    public static o05 a() {
        return (o05) e.getValue();
    }

    public static o05 b() {
        return (o05) d.getValue();
    }

    public static void c(hy8 hy8Var) {
        hs3 hs3Var = xqa.A;
        hy8Var.b((String) z5c.I(nu4.a, new v1f(hs3Var.a, hs3Var.b, null)));
        mfc mfcVarC = k8b.c();
        if (hy8Var.c.get()) {
            l1f l1fVar = new l1f();
            l1fVar.a(mfcVarC == mfc.b ? "neo" : "classic", "theme");
            hy8Var.b.b(new jf6(22, hy8Var, n16.Y(l1fVar.a)));
        }
    }

    public static boolean d() {
        o05 o05VarB = b();
        hy8 hy8Var = o05VarB instanceof hy8 ? (hy8) o05VarB : null;
        return hy8Var != null && hy8Var.c.get();
    }

    public static void g(t05 t05Var, m1f m1fVar, a26 a26Var) {
        String str;
        t05Var.getClass();
        m1fVar.getClass();
        a26Var.getClass();
        if (t05Var.equals(p05.a)) {
            str = "button_click";
        } else if (t05Var.equals(s05.a)) {
            str = "screen_view";
        } else {
            if (!(t05Var instanceof r05)) {
                ap.c();
                return;
            }
            str = ((r05) t05Var).a;
        }
        h(str, m1fVar, a26Var);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0102  */
    /* JADX WARN: Code duplicated, block: B:60:0x0114  */
    /* JADX WARN: Code duplicated, block: B:64:0x011f A[PHI: r0
  0x011f: PHI (r0v11 java.lang.String) = (r0v7 java.lang.String), (r0v10 java.lang.String), (r0v12 java.lang.String) binds: [B:81:0x0154, B:66:0x0127, B:62:0x011c] A[DONT_GENERATE, DONT_INLINE]] */
    public static void h(String str, m1f m1fVar, a26 a26Var) {
        List listH;
        String str2;
        Object dzbVar;
        str.getClass();
        m1fVar.getClass();
        a26Var.getClass();
        l1f l1fVar = new l1f();
        Set set = j0c.a;
        ca2.a.getClass();
        String strConcat = null;
        if (!ca2.c && j0c.a.contains(str)) {
            l1f l1fVar2 = new l1f();
            a26Var.d(l1fVar2);
            if (!l1fVar2.a.containsKey("reading_pack_test_group")) {
                hs3 hs3Var = xqa.s0;
                String str3 = (String) z5c.I(nu4.a, new i0c(hs3Var.a, hs3Var.b, null));
                try {
                    xh7 xh7Var = fzc.a;
                    xh7Var.getClass();
                    p4e p4eVar = p4e.a;
                    dzbVar = (String) ((Map) xh7Var.b(new qh6(p4eVar, p4eVar, 1), str3)).get("reading-pack-test-202609");
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                if (dzbVar instanceof dzb) {
                    dzbVar = null;
                }
                String strB0 = pa7.b0(6, (String) dzbVar, false);
                if (strB0 != null) {
                    l1fVar2.a(strB0, "reading_pack_test_group");
                }
            }
            a26Var = new ckb(4, l1fVar2);
        }
        a26Var.d(l1fVar);
        LinkedHashMap linkedHashMap = l1fVar.a;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        Object obj = linkedHashMap.get("blocked_reason");
        String str4 = obj instanceof String ? (String) obj : null;
        if (str4 != null) {
            iif.a.getClass();
            iif iifVarD = uzd.d(str4);
            if (iifVarD != null) {
                linkedHashMap2.put("blocked_reason", iifVarD.a());
            }
        }
        if (str.equals("card_share")) {
            Object obj2 = linkedHashMap.get("pathway");
            String str5 = obj2 instanceof String ? (String) obj2 : null;
            Object obj3 = linkedHashMap.get("result");
            String str6 = obj3 instanceof String ? (String) obj3 : null;
            Object obj4 = linkedHashMap.get("target");
            String str7 = obj4 instanceof String ? (String) obj4 : null;
            if (str5 != null) {
                switch (str5.hashCode()) {
                    case -791770330:
                        str2 = "wechat";
                        if (str5.equals("wechat")) {
                            strConcat = str2;
                        }
                        break;
                    case -308827011:
                        if (str5.equals("share_result") && str7 != null) {
                            if (!pa7.t(str6, "completed") || v4e.Q(str7)) {
                                str7 = null;
                            }
                            if (str7 != null) {
                                strConcat = "system:".concat(str7);
                            }
                        }
                        break;
                    case 3616:
                        str2 = "qq";
                        if (str5.equals("qq")) {
                            strConcat = str2;
                        }
                        break;
                    case 3522941:
                        str2 = "save";
                        if (str5.equals("save")) {
                            strConcat = str2;
                        }
                        break;
                    case 108102557:
                        if (str5.equals("qzone")) {
                            strConcat = "qzone";
                        }
                        break;
                    case 535274091:
                        if (str5.equals("qq_zone")) {
                            strConcat = "qzone";
                        }
                        break;
                    case 594307674:
                        if (str5.equals("wechat_moments")) {
                            strConcat = "moments";
                        }
                        break;
                    case 1235271283:
                        if (str5.equals("moments")) {
                            strConcat = "moments";
                        }
                        break;
                }
            }
            if (strConcat != null) {
                linkedHashMap2.put("share_platform", strConcat);
            }
        }
        trd trdVar = new trd(18, linkedHashMap2);
        iec.m(str, m1fVar, trdVar);
        o05 o05VarB = b();
        o05 o05VarA = a();
        o05 o05Var = (o05) f.getValue();
        int iOrdinal = m1fVar.ordinal();
        if (iOrdinal == 0) {
            listH = t72.H(o05VarB);
        } else if (iOrdinal == 1) {
            listH = t72.H(o05VarA);
        } else {
            if (iOrdinal != 2) {
                ap.c();
                return;
            }
            listH = qd0.k0(new Object[]{o05VarB, o05VarA, o05Var});
        }
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            ((o05) it.next()).c(str, trdVar);
        }
    }

    public static /* synthetic */ void i(int i, a26 a26Var, String str) {
        m1f m1fVar = (i & 2) != 0 ? m1f.c : m1f.a;
        if ((i & 4) != 0) {
            a26Var = new ule(22);
        }
        h(str, m1fVar, a26Var);
    }

    public static /* synthetic */ void k(t05 t05Var, a26 a26Var, int i) {
        m1f m1fVar = (i & 2) != 0 ? m1f.c : m1f.b;
        if ((i & 4) != 0) {
            a26Var = new ule(23);
        }
        g(t05Var, m1fVar, a26Var);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(boolean z, boolean z2, zn2 zn2Var) {
        w1f w1fVar;
        Object dzbVar;
        Throwable thA;
        zx8 zx8Var;
        hy8 hy8Var;
        if (zn2Var instanceof w1f) {
            w1fVar = (w1f) zn2Var;
            int i = w1fVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                w1fVar.label = i - Integer.MIN_VALUE;
            } else {
                w1fVar = new w1f(this, zn2Var);
            }
        } else {
            w1fVar = new w1f(this, zn2Var);
        }
        Object objG = w1fVar.result;
        int i2 = w1fVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objG);
                b.set(Boolean.valueOf(z2));
                o05 o05VarB = b();
                hy8Var = o05VarB instanceof hy8 ? (hy8) o05VarB : null;
                if (hy8Var == null) {
                    dzbVar = new zx8(false, false, false, false);
                } else {
                    w1fVar.L$0 = this;
                    w1fVar.L$1 = hy8Var;
                    w1fVar.Z$0 = z;
                    w1fVar.Z$1 = z2;
                    w1fVar.label = 1;
                    objG = hy8Var.g(z, z2, w1fVar);
                    bw2 bw2Var = bw2.a;
                    if (objG == bw2Var) {
                        return bw2Var;
                    }
                }
                thA = ezb.a(dzbVar);
                if (thA != null) {
                    hf8.Q.getClass();
                    ef8.a("EventTracking").c("Failed to record Mixpanel authorization", thA);
                }
                zx8Var = new zx8(false, false, false, false);
                if (dzbVar instanceof dzb) {
                    return zx8Var;
                }
                return dzbVar;
            }
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z2 = w1fVar.Z$1;
            hy8 hy8Var2 = (hy8) w1fVar.L$1;
            x1f x1fVar = (x1f) w1fVar.L$0;
            jzb.q(objG);
            hy8Var = hy8Var2;
            this = x1fVar;
            yx8 yx8Var = (yx8) objG;
            if (z2) {
                this.getClass();
                c(hy8Var);
            }
            dzbVar = new zx8(z2, yx8Var.a, yx8Var.b, true);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        thA = ezb.a(dzbVar);
        if (thA != null) {
            hf8.Q.getClass();
            ef8.a("EventTracking").c("Failed to record Mixpanel authorization", thA);
        }
        zx8Var = new zx8(false, false, false, false);
        if (dzbVar instanceof dzb) {
            return zx8Var;
        }
        return dzbVar;
    }

    public final void f(a26 a26Var) {
        Iterator it = ((List) g.getValue()).iterator();
        while (it.hasNext()) {
            ((o05) it.next()).e(a26Var);
        }
    }
}
