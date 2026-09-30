package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import tech.chatmind.api.credits.GuestPassGrantReason;
import tech.chatmind.api.credits.GuestPassPendingGrant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wqa implements sf6, hf8 {
    public static final qh6 e = t72.m(p4e.a, GuestPassPendingGrant.Companion.serializer());
    public final t7 a;
    public final f99 b = new f99();
    public final ncd c;
    public final uhb d;

    public wqa(t7 t7Var) {
        this.a = t7Var;
        ncd ncdVarB = ocd.b(0, 1, i41.b, 1);
        this.c = ncdVarB;
        this.d = if9.m(ncdVarB);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[Catch: all -> 0x0041, TryCatch #1 {all -> 0x0041, blocks: (B:14:0x003c, B:42:0x00d1, B:43:0x00f9, B:21:0x0056, B:35:0x009e, B:38:0x00b0), top: B:52:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [hf8, wqa] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, tech.chatmind.api.credits.GuestPassPendingGrant] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v7, types: [d99] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [tech.chatmind.api.credits.GuestPassPendingGrant] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public final Object a(GuestPassPendingGrant guestPassPendingGrant, zn2 zn2Var) throws Throwable {
        rqa rqaVar;
        String strB;
        d99 d99Var;
        ?? r11;
        ?? r4;
        d99 d99Var2;
        String str;
        LinkedHashMap linkedHashMapY;
        ?? r1;
        d99 d99Var3;
        if (zn2Var instanceof rqa) {
            rqaVar = (rqa) zn2Var;
            int i = rqaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rqaVar.label = i - Integer.MIN_VALUE;
            } else {
                rqaVar = new rqa(this, zn2Var);
            }
        } else {
            rqaVar = new rqa(this, zn2Var);
        }
        Object obj = rqaVar.result;
        int i2 = rqaVar.label;
        boolean z = true;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i2 == 0) {
                    jzb.q(obj);
                    strB = b();
                    if (strB == null) {
                        return Boolean.FALSE;
                    }
                    rqaVar.L$0 = guestPassPendingGrant;
                    rqaVar.L$1 = strB;
                    d99Var = this.b;
                    rqaVar.L$2 = d99Var;
                    rqaVar.label = 1;
                    if (d99Var.b(rqaVar) != bw2Var) {
                    }
                    r11 = guestPassPendingGrant;
                    return bw2Var;
                }
                if (i2 == 1) {
                    d99 d99Var4 = (d99) rqaVar.L$2;
                    String str2 = (String) rqaVar.L$1;
                    GuestPassPendingGrant guestPassPendingGrant2 = (GuestPassPendingGrant) rqaVar.L$0;
                    jzb.q(obj);
                    strB = str2;
                    d99Var = d99Var4;
                    r11 = guestPassPendingGrant2;
                } else {
                    if (i2 == 2) {
                        d99 d99Var5 = (d99) rqaVar.L$2;
                        str = (String) rqaVar.L$1;
                        GuestPassPendingGrant guestPassPendingGrant3 = (GuestPassPendingGrant) rqaVar.L$0;
                        jzb.q(obj);
                        r4 = guestPassPendingGrant3;
                        d99Var2 = d99Var5;
                        linkedHashMapY = bm8.Y((Map) obj);
                        if (pa7.t(linkedHashMapY.get(str), r4)) {
                            linkedHashMapY.remove(str);
                            rqaVar.L$0 = r4;
                            rqaVar.L$1 = null;
                            rqaVar.L$2 = d99Var2;
                            rqaVar.L$3 = null;
                            rqaVar.label = 3;
                            if (bsa.o(xqa.E.a, fzc.a.d(e, linkedHashMapY), rqaVar) != bw2Var) {
                                r1 = r4;
                                d99Var3 = d99Var2;
                            }
                            r11 = guestPassPendingGrant;
                            return bw2Var;
                        }
                        z = false;
                        guestPassPendingGrant = d99Var2;
                        Boolean boolValueOf = Boolean.valueOf(z);
                        guestPassPendingGrant.h(null);
                        return boolValueOf;
                    }
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d99 d99Var6 = (d99) rqaVar.L$2;
                    GuestPassPendingGrant guestPassPendingGrant4 = (GuestPassPendingGrant) rqaVar.L$0;
                    jzb.q(obj);
                    r1 = guestPassPendingGrant4;
                    d99Var3 = d99Var6;
                }
                d().e("Friend-coupon grant exposure consumed (reason=" + r1.getReason() + ", count=" + r1.getCount() + ")");
                guestPassPendingGrant = d99Var3;
                Boolean boolValueOf2 = Boolean.valueOf(z);
                guestPassPendingGrant.h(null);
                return boolValueOf2;
                r11 = guestPassPendingGrant;
                rqaVar.L$0 = r11;
                rqaVar.L$1 = strB;
                rqaVar.L$2 = d99Var;
                rqaVar.label = 2;
                Object objC = c(rqaVar);
                if (objC != bw2Var) {
                    r4 = r11;
                    d99Var2 = d99Var;
                    str = strB;
                    obj = objC;
                    linkedHashMapY = bm8.Y((Map) obj);
                    if (pa7.t(linkedHashMapY.get(str), r4)) {
                        z = false;
                        guestPassPendingGrant = d99Var2;
                    } else {
                        linkedHashMapY.remove(str);
                        rqaVar.L$0 = r4;
                        rqaVar.L$1 = null;
                        rqaVar.L$2 = d99Var2;
                        rqaVar.L$3 = null;
                        rqaVar.label = 3;
                        if (bsa.o(xqa.E.a, fzc.a.d(e, linkedHashMapY), rqaVar) != bw2Var) {
                            r1 = r4;
                            d99Var3 = d99Var2;
                            d().e("Friend-coupon grant exposure consumed (reason=" + r1.getReason() + ", count=" + r1.getCount() + ")");
                            guestPassPendingGrant = d99Var3;
                        }
                    }
                    Boolean boolValueOf3 = Boolean.valueOf(z);
                    guestPassPendingGrant.h(null);
                    return boolValueOf3;
                }
                r11 = guestPassPendingGrant;
                return bw2Var;
            } catch (Throwable th) {
                th = th;
                guestPassPendingGrant = d99Var;
                guestPassPendingGrant.h(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final String b() {
        String strA = ((mo3) this.a).a();
        if (v4e.Q(strA)) {
            hs3 hs3Var = xqa.A;
            strA = (String) z5c.I(nu4.a, new sqa(hs3Var.a, hs3Var.b, null));
        }
        if (v4e.Q(strA)) {
            return null;
        }
        return strA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var) {
        tqa tqaVar;
        Object dzbVar;
        if (zn2Var instanceof tqa) {
            tqaVar = (tqa) zn2Var;
            int i = tqaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqaVar.label = i - Integer.MIN_VALUE;
            } else {
                tqaVar = new tqa(this, zn2Var);
            }
        } else {
            tqaVar = new tqa(this, zn2Var);
        }
        Object objC = tqaVar.result;
        int i2 = tqaVar.label;
        Object obj = null;
        if (i2 == 0) {
            jzb.q(objC);
            hs3 hs3Var = xqa.E;
            tqaVar.label = 1;
            objC = bsa.c(hs3Var, tqaVar);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objC);
        }
        if (v4e.Q((String) objC)) {
            objC = null;
        }
        String str = (String) objC;
        if (str != null) {
            try {
                dzbVar = (Map) fzc.a.b(e, str);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            obj = (Map) (dzbVar instanceof dzb ? null : dzbVar);
        }
        return obj == null ? qu4.a : obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(zn2 zn2Var) throws Throwable {
        uqa uqaVar;
        String strB;
        d99 d99Var;
        d99 d99Var2;
        String str;
        if (zn2Var instanceof uqa) {
            uqaVar = (uqa) zn2Var;
            int i = uqaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uqaVar.label = i - Integer.MIN_VALUE;
            } else {
                uqaVar = new uqa(this, zn2Var);
            }
        } else {
            uqaVar = new uqa(this, zn2Var);
        }
        Object obj = uqaVar.result;
        int i2 = uqaVar.label;
        Object obj2 = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                strB = b();
                if (strB == null) {
                    return null;
                }
                uqaVar.L$0 = strB;
                d99Var = this.b;
                uqaVar.L$1 = d99Var;
                uqaVar.label = 1;
                if (d99Var.b(uqaVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) uqaVar.L$1;
                str = (String) uqaVar.L$0;
                try {
                    jzb.q(obj);
                    GuestPassPendingGrant guestPassPendingGrant = (GuestPassPendingGrant) ((Map) obj).get(str);
                    d99Var2.h(null);
                    return guestPassPendingGrant;
                } catch (Throwable th) {
                    th = th;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99Var = (d99) uqaVar.L$1;
            String str2 = (String) uqaVar.L$0;
            jzb.q(obj);
            strB = str2;
            uqaVar.L$0 = strB;
            uqaVar.L$1 = d99Var;
            uqaVar.label = 2;
            Object objC = c(uqaVar);
            if (objC != obj2) {
                str = strB;
                obj = objC;
                d99Var2 = d99Var;
                GuestPassPendingGrant guestPassPendingGrant2 = (GuestPassPendingGrant) ((Map) obj).get(str);
                d99Var2.h(null);
                return guestPassPendingGrant2;
            }
            return obj2;
        } catch (Throwable th2) {
            th = th2;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [tech.chatmind.api.credits.GuestPassPendingGrant] */
    /* JADX WARN: Type inference failed for: r10v0, types: [hf8, wqa] */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, tech.chatmind.api.credits.GuestPassPendingGrant] */
    /* JADX WARN: Type inference failed for: r11v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v7 */
    public final Object f(GuestPassPendingGrant guestPassPendingGrant, zn2 zn2Var) throws Throwable {
        vqa vqaVar;
        String strB;
        d99 d99Var;
        ?? r11;
        ?? r3;
        d99 d99Var2;
        String str;
        LinkedHashMap linkedHashMapY;
        ?? r0;
        if (zn2Var instanceof vqa) {
            vqaVar = (vqa) zn2Var;
            int i = vqaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vqaVar.label = i - Integer.MIN_VALUE;
            } else {
                vqaVar = new vqa(this, zn2Var);
            }
        } else {
            vqaVar = new vqa(this, zn2Var);
        }
        Object obj = vqaVar.result;
        int i2 = vqaVar.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i2 == 0) {
                    jzb.q(obj);
                    GuestPassGrantReason reason = guestPassPendingGrant != 0 ? guestPassPendingGrant.getReason() : null;
                    int i3 = reason == null ? -1 : qqa.a[reason.ordinal()];
                    if (i3 != -1) {
                        if (i3 == 1 || i3 == 2) {
                            if (guestPassPendingGrant.getCount() > 0 && (strB = b()) != null) {
                                vqaVar.L$0 = guestPassPendingGrant;
                                vqaVar.L$1 = strB;
                                d99Var = this.b;
                                vqaVar.L$2 = d99Var;
                                vqaVar.label = 1;
                                if (d99Var.b(vqaVar) != bw2Var) {
                                }
                                r11 = guestPassPendingGrant;
                                return bw2Var;
                            }
                        } else if (i3 != 3 && i3 != 4) {
                            ap.c();
                            return null;
                        }
                    }
                    return wefVar;
                }
                if (i2 == 1) {
                    d99 d99Var3 = (d99) vqaVar.L$2;
                    String str2 = (String) vqaVar.L$1;
                    GuestPassPendingGrant guestPassPendingGrant2 = (GuestPassPendingGrant) vqaVar.L$0;
                    jzb.q(obj);
                    strB = str2;
                    d99Var = d99Var3;
                    r11 = guestPassPendingGrant2;
                } else {
                    if (i2 == 2) {
                        d99Var2 = (d99) vqaVar.L$2;
                        str = (String) vqaVar.L$1;
                        GuestPassPendingGrant guestPassPendingGrant3 = (GuestPassPendingGrant) vqaVar.L$0;
                        jzb.q(obj);
                        r3 = guestPassPendingGrant3;
                        linkedHashMapY = bm8.Y((Map) obj);
                        linkedHashMapY.put(str, r3);
                        vqaVar.L$0 = r3;
                        vqaVar.L$1 = null;
                        vqaVar.L$2 = d99Var2;
                        vqaVar.L$3 = null;
                        vqaVar.label = 3;
                        if (bsa.o(xqa.E.a, fzc.a.d(e, linkedHashMapY), vqaVar) != bw2Var) {
                            r0 = r3;
                        }
                        r11 = guestPassPendingGrant;
                        return bw2Var;
                    }
                    if (i2 != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    d99Var2 = (d99) vqaVar.L$2;
                    GuestPassPendingGrant guestPassPendingGrant4 = (GuestPassPendingGrant) vqaVar.L$0;
                    jzb.q(obj);
                    r0 = guestPassPendingGrant4;
                }
                d99Var2.h(null);
                d().e("Friend-coupon grant persisted (reason=" + r0.getReason() + ", count=" + r0.getCount() + ")");
                this.c.i(wefVar);
                return wefVar;
                r11 = guestPassPendingGrant;
                vqaVar.L$0 = r11;
                vqaVar.L$1 = strB;
                vqaVar.L$2 = d99Var;
                vqaVar.label = 2;
                Object objC = c(vqaVar);
                if (objC != bw2Var) {
                    r3 = r11;
                    d99Var2 = d99Var;
                    str = strB;
                    obj = objC;
                    linkedHashMapY = bm8.Y((Map) obj);
                    linkedHashMapY.put(str, r3);
                    vqaVar.L$0 = r3;
                    vqaVar.L$1 = null;
                    vqaVar.L$2 = d99Var2;
                    vqaVar.L$3 = null;
                    vqaVar.label = 3;
                    if (bsa.o(xqa.E.a, fzc.a.d(e, linkedHashMapY), vqaVar) != bw2Var) {
                        r0 = r3;
                        d99Var2.h(null);
                        d().e("Friend-coupon grant persisted (reason=" + r0.getReason() + ", count=" + r0.getCount() + ")");
                        this.c.i(wefVar);
                        return wefVar;
                    }
                }
                r11 = guestPassPendingGrant;
                return bw2Var;
            } catch (Throwable th) {
                th = th;
                guestPassPendingGrant = d99Var;
                guestPassPendingGrant.h(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
