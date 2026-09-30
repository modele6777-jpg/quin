package defpackage;

import ai.askquin.ui.onboard.PendingUserProfile;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o9 implements hf8 {
    public static final /* synthetic */ int z = 0;
    public final xof a;
    public final gpf b;
    public final s7 c;
    public d9 x;
    public final f99 d = new f99();
    public final f99 e = new f99();
    public final f99 f = new f99();
    public final AtomicLong g = new AtomicLong();
    public final LinkedHashMap v = new LinkedHashMap();
    public final AtomicLong w = new AtomicLong();
    public final q y = new q(3);

    public o9(xof xofVar, gpf gpfVar, s7 s7Var) {
        this.a = xofVar;
        this.b = gpfVar;
        this.c = s7Var;
        ynb.V(lw2.a, null, null, new c9(this, null), 3);
    }

    public static /* synthetic */ Object i(o9 o9Var, Boolean bool, Boolean bool2, Boolean bool3, zn2 zn2Var, int i) {
        if ((i & 1) != 0) {
            bool = null;
        }
        if ((i & 2) != 0) {
            bool2 = null;
        }
        if ((i & 4) != 0) {
            bool3 = null;
        }
        return o9Var.h(bool, bool2, bool3, zn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) throws Throwable {
        e9 e9Var;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        if (zn2Var instanceof e9) {
            e9Var = (e9) zn2Var;
            int i = e9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                e9Var.label = i - Integer.MIN_VALUE;
            } else {
                e9Var = new e9(this, zn2Var);
            }
        } else {
            e9Var = new e9(this, zn2Var);
        }
        Object obj = e9Var.result;
        int i2 = e9Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                this.g.incrementAndGet();
                this.w.incrementAndGet();
                d99Var = this.e;
                e9Var.L$0 = d99Var;
                e9Var.label = 1;
                if (d99Var.b(e9Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) e9Var.L$0;
                try {
                    jzb.q(obj);
                    d99Var2.h(null);
                    return wef.a;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) e9Var.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            xof xofVar = this.a;
            e9Var.L$0 = d99Var;
            e9Var.label = 2;
            if (xofVar.b(e9Var) != bw2Var) {
                d99Var2 = d99Var;
                d99Var2.h(null);
                return wef.a;
            }
            return bw2Var;
        } catch (Throwable th3) {
            d99 d99Var4 = d99Var;
            th = th3;
            d99Var2 = d99Var4;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a0 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:25:0x0076, B:28:0x007c, B:32:0x0083, B:34:0x0089, B:37:0x00a0, B:39:0x00a8, B:44:0x00b2), top: B:54:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00a8 A[Catch: all -> 0x007f, TryCatch #0 {all -> 0x007f, blocks: (B:25:0x0076, B:28:0x007c, B:32:0x0083, B:34:0x0089, B:37:0x00a0, B:39:0x00a8, B:44:0x00b2), top: B:54:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:42:0x00af  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2 A[Catch: all -> 0x007f, TRY_LEAVE, TryCatch #0 {all -> 0x007f, blocks: (B:25:0x0076, B:28:0x007c, B:32:0x0083, B:34:0x0089, B:37:0x00a0, B:39:0x00a8, B:44:0x00b2), top: B:54:0x0076 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object b(String str, boolean z2, zn2 zn2Var) {
        f9 f9Var;
        d99 d99Var;
        boolean z3;
        String str2;
        nu3 nu3VarX;
        LinkedHashMap linkedHashMap = this.v;
        if (zn2Var instanceof f9) {
            f9Var = (f9) zn2Var;
            int i = f9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                f9Var.label = i - Integer.MIN_VALUE;
            } else {
                f9Var = new f9(this, zn2Var);
            }
        } else {
            f9Var = new f9(this, zn2Var);
        }
        f9 f9Var2 = f9Var;
        Object obj = f9Var2.result;
        int i2 = f9Var2.label;
        int i3 = 2;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                if (str.length() != 0) {
                    f9Var2.L$0 = str;
                    f99 f99Var = this.d;
                    f9Var2.L$1 = f99Var;
                    f9Var2.Z$0 = z2;
                    f9Var2.label = 1;
                    if (f99Var.b(f9Var2) != bw2Var) {
                        d99Var = f99Var;
                        z3 = z2;
                        str2 = str;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
                return obj;
            }
            boolean z4 = f9Var2.Z$0;
            d99 d99Var2 = (d99) f9Var2.L$1;
            String str3 = (String) f9Var2.L$0;
            jzb.q(obj);
            z3 = z4;
            d99Var = d99Var2;
            str2 = str3;
            d9 d9Var = this.x;
            if (z3) {
                nu3VarX = (nu3) linkedHashMap.get(str2);
                if (nu3VarX == null) {
                    long jIncrementAndGet = this.w.incrementAndGet();
                    qn2 qn2Var = lw2.a;
                    js3 js3Var = ga4.a;
                    nu3VarX = ynb.x(qn2Var, hr3.c, dw2.b, new g9(this, str2, jIncrementAndGet, null));
                    linkedHashMap.put(str2, nu3VarX);
                    nu3VarX.E(new w6(this, str2, nu3VarX, i3));
                    nu3VarX.start();
                } else {
                    if (nu3VarX.b()) {
                        nu3VarX = null;
                    }
                    if (nu3VarX == null) {
                        long jIncrementAndGet2 = this.w.incrementAndGet();
                        qn2 qn2Var2 = lw2.a;
                        js3 js3Var2 = ga4.a;
                        nu3VarX = ynb.x(qn2Var2, hr3.c, dw2.b, new g9(this, str2, jIncrementAndGet2, null));
                        linkedHashMap.put(str2, nu3VarX);
                        nu3VarX.E(new w6(this, str2, nu3VarX, i3));
                        nu3VarX.start();
                    }
                }
            } else {
                if (!pa7.t(d9Var != null ? d9Var.a : null, str2) || ((Number) this.y.invoke()).longValue() - d9Var.b >= 5000) {
                    nu3VarX = (nu3) linkedHashMap.get(str2);
                    if (nu3VarX == null) {
                        long jIncrementAndGet3 = this.w.incrementAndGet();
                        qn2 qn2Var3 = lw2.a;
                        js3 js3Var3 = ga4.a;
                        nu3VarX = ynb.x(qn2Var3, hr3.c, dw2.b, new g9(this, str2, jIncrementAndGet3, null));
                        linkedHashMap.put(str2, nu3VarX);
                        nu3VarX.E(new w6(this, str2, nu3VarX, i3));
                        nu3VarX.start();
                    } else {
                        if (nu3VarX.b()) {
                            nu3VarX = null;
                        }
                        if (nu3VarX == null) {
                            long jIncrementAndGet4 = this.w.incrementAndGet();
                            qn2 qn2Var4 = lw2.a;
                            js3 js3Var4 = ga4.a;
                            nu3VarX = ynb.x(qn2Var4, hr3.c, dw2.b, new g9(this, str2, jIncrementAndGet4, null));
                            linkedHashMap.put(str2, nu3VarX);
                            nu3VarX.E(new w6(this, str2, nu3VarX, i3));
                            nu3VarX.start();
                        }
                    }
                } else {
                    nu3VarX = null;
                }
            }
            d99Var.h(null);
            if (nu3VarX != null) {
                f9Var2.L$0 = null;
                f9Var2.L$1 = null;
                f9Var2.Z$0 = z3;
                f9Var2.label = 2;
                Object objH0 = nu3VarX.H0(f9Var2);
                return objH0 == bw2Var ? bw2Var : objH0;
            }
            return null;
        } catch (Throwable th) {
            d99Var.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x012c A[Catch: all -> 0x0149, TRY_LEAVE, TryCatch #2 {all -> 0x0149, blocks: (B:46:0x0122, B:48:0x012c), top: B:67:0x0122 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0143  */
    /* JADX WARN: Code duplicated, block: B:67:0x0122 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object c(String str, long j, zn2 zn2Var) throws Throwable {
        i9 i9Var;
        String str2;
        long j2;
        Object objP0;
        yof yofVar;
        yof yofVar2;
        d99 d99Var;
        String str3;
        long j3;
        yof yofVar3;
        Object obj;
        d99 d99Var2;
        xof xofVar;
        yof yofVar4;
        if (zn2Var instanceof i9) {
            i9Var = (i9) zn2Var;
            int i = i9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                i9Var.label = i - Integer.MIN_VALUE;
            } else {
                i9Var = new i9(this, zn2Var);
            }
        } else {
            i9Var = new i9(this, zn2Var);
        }
        Object obj2 = i9Var.result;
        int i2 = i9Var.label;
        boolean z2 = true;
        bw2 bw2Var = bw2.a;
        if (i2 == 0) {
            jzb.q(obj2);
            str2 = str;
            i9Var.L$0 = str2;
            j2 = j;
            i9Var.J$0 = j2;
            i9Var.label = 1;
            npf npfVar = (npf) this.b;
            js3 js3Var = ga4.a;
            objP0 = ynb.p0(hr3.c, new jpf(npfVar, null), i9Var);
            if (objP0 != bw2Var) {
            }
            return bw2Var;
        }
        if (i2 == 1) {
            j2 = i9Var.J$0;
            String str4 = (String) i9Var.L$0;
            jzb.q(obj2);
            objP0 = obj2;
            str2 = str4;
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) i9Var.L$3;
                yofVar4 = (yof) i9Var.L$1;
                try {
                    jzb.q(obj2);
                    d99Var = d99Var2;
                    yofVar = yofVar4;
                    d99Var.h(null);
                    return yofVar;
                } catch (Throwable th) {
                    th = th;
                    obj = null;
                    d99Var2.h(obj);
                    throw th;
                }
            }
            j3 = i9Var.J$0;
            d99 d99Var3 = (d99) i9Var.L$3;
            yofVar3 = (yof) i9Var.L$2;
            yof yofVar5 = (yof) i9Var.L$1;
            str3 = (String) i9Var.L$0;
            jzb.q(obj2);
            d99Var = d99Var3;
            yofVar = yofVar5;
            try {
                if (j3 == this.w.get()) {
                    try {
                        if (pa7.t(s7.a(), str3)) {
                            xofVar = this.a;
                            i9Var.L$0 = null;
                            i9Var.L$1 = yofVar;
                            i9Var.L$2 = null;
                            i9Var.L$3 = d99Var;
                            i9Var.J$0 = j3;
                            i9Var.label = 3;
                            if (xofVar.f(yofVar3, i9Var) != bw2Var) {
                                yofVar4 = yofVar;
                                d99Var2 = d99Var;
                                d99Var = d99Var2;
                                yofVar = yofVar4;
                            }
                            return bw2Var;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        d99Var2 = d99Var;
                        obj = null;
                        d99Var2.h(obj);
                        throw th;
                    }
                }
                d99Var.h(null);
                return yofVar;
            } catch (Throwable th3) {
                th = th3;
                obj = null;
                d99Var2 = d99Var;
            }
        }
        yofVar = (yof) objP0;
        if (yofVar == null) {
            return yofVar;
        }
        n2f n2fVar = yofVar.g;
        List list = yofVar.f;
        if (n2fVar != n2f.a && n2fVar != n2f.b) {
            z2 = false;
        }
        boolean zContains = list.contains(n2fVar);
        if (z2 || zContains) {
            yofVar2 = yofVar;
        } else {
            n2f key = r8c.d().getKey();
            String str5 = yofVar.a;
            String str6 = yofVar.b;
            String str7 = yofVar.c;
            String str8 = yofVar.d;
            Integer num = yofVar.e;
            List list2 = yofVar.h;
            List list3 = yofVar.i;
            Boolean bool = yofVar.j;
            Boolean bool2 = yofVar.k;
            Boolean bool3 = yofVar.l;
            Boolean bool4 = yofVar.m;
            str5.getClass();
            str6.getClass();
            str7.getClass();
            str8.getClass();
            key.getClass();
            list2.getClass();
            list3.getClass();
            yofVar2 = new yof(str5, str6, str7, str8, num, list, key, list2, list3, bool, bool2, bool3, bool4);
        }
        i9Var.L$0 = str2;
        i9Var.L$1 = yofVar;
        i9Var.L$2 = yofVar2;
        d99Var = this.e;
        i9Var.L$3 = d99Var;
        i9Var.J$0 = j2;
        i9Var.label = 2;
        if (d99Var.b(i9Var) != bw2Var) {
            str3 = str2;
            j3 = j2;
            yofVar3 = yofVar2;
            if (j3 == this.w.get()) {
                if (pa7.t(s7.a(), str3)) {
                    xofVar = this.a;
                    i9Var.L$0 = null;
                    i9Var.L$1 = yofVar;
                    i9Var.L$2 = null;
                    i9Var.L$3 = d99Var;
                    i9Var.J$0 = j3;
                    i9Var.label = 3;
                    if (xofVar.f(yofVar3, i9Var) != bw2Var) {
                        yofVar4 = yofVar;
                        d99Var2 = d99Var;
                        d99Var = d99Var2;
                        yofVar = yofVar4;
                    }
                }
            }
            d99Var.h(null);
            return yofVar;
        }
        return bw2Var;
    }

    public final boolean e(long j, String str) {
        return !v4e.Q(str) && pa7.t(s7.a(), str) && this.g.get() == j;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012b  */
    /* JADX WARN: Code duplicated, block: B:50:0x012f A[Catch: all -> 0x018b, TRY_LEAVE, TryCatch #4 {all -> 0x018b, blocks: (B:63:0x0180, B:64:0x0183, B:47:0x0123, B:50:0x012f), top: B:86:0x0123 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0152 A[Catch: all -> 0x0191, TRY_LEAVE, TryCatch #0 {all -> 0x0191, blocks: (B:53:0x0148, B:57:0x0152), top: B:79:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0173  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code duplicated, block: B:90:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public final Object f(String str, zn2 zn2Var) throws Throwable {
        k9 k9Var;
        long j;
        String str2;
        d99 d99Var;
        d99 d99Var2;
        d99 d99Var3;
        Throwable th;
        d99 d99Var4;
        String str3;
        long j2;
        PendingUserProfile pendingUserProfile;
        bw2 bw2Var;
        Object objB;
        Object objA;
        f8a f8aVar = f8a.a;
        if (zn2Var instanceof k9) {
            k9Var = (k9) zn2Var;
            int i = k9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                k9Var.label = i - Integer.MIN_VALUE;
            } else {
                k9Var = new k9(this, zn2Var);
            }
        } else {
            k9Var = new k9(this, zn2Var);
        }
        k9 k9Var2 = k9Var;
        Object obj = k9Var2.result;
        int i2 = k9Var2.label;
        boolean zBooleanValue = true;
        Object obj2 = null;
        bw2 bw2Var2 = bw2.a;
        try {
            if (i2 != 0) {
                try {
                    if (i2 != 1) {
                        try {
                            if (i2 == 2) {
                                long j3 = k9Var2.J$0;
                                pendingUserProfile = (PendingUserProfile) k9Var2.L$2;
                                d99Var2 = (d99) k9Var2.L$1;
                                str3 = (String) k9Var2.L$0;
                                jzb.q(obj);
                                objA = obj;
                                j2 = j3;
                                bw2Var = bw2Var2;
                                try {
                                    if (((Boolean) objA).booleanValue()) {
                                        d99Var4 = this.e;
                                        k9Var2.L$0 = str3;
                                        k9Var2.L$1 = d99Var2;
                                        k9Var2.L$2 = d99Var4;
                                        k9Var2.L$3 = pendingUserProfile;
                                        k9Var2.L$4 = null;
                                        k9Var2.J$0 = j2;
                                        k9Var2.label = 3;
                                        if (d99Var4.b(k9Var2) == bw2Var) {
                                            return bw2Var;
                                        }
                                        if (e(j2, str3)) {
                                            this.w.incrementAndGet();
                                            l9 l9Var = new l9(pendingUserProfile, this, null);
                                            k9Var2.L$0 = null;
                                            k9Var2.L$1 = d99Var2;
                                            k9Var2.L$2 = d99Var4;
                                            k9Var2.L$3 = null;
                                            k9Var2.L$4 = null;
                                            k9Var2.J$0 = j2;
                                            k9Var2.label = 4;
                                            objB = f8aVar.b(pendingUserProfile, l9Var, k9Var2);
                                            if (objB == bw2Var) {
                                                return bw2Var;
                                            }
                                            obj = objB;
                                            d99Var3 = d99Var4;
                                            d99Var = d99Var2;
                                        } else {
                                            zBooleanValue = false;
                                        }
                                        obj2 = null;
                                        d99Var4.h(null);
                                    } else {
                                        zBooleanValue = false;
                                        obj2 = null;
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                                    d99Var2.h(obj2);
                                    return boolValueOf;
                                } catch (Throwable th2) {
                                    th = th2;
                                    obj2 = null;
                                    d99Var2.h(obj2);
                                    throw th;
                                }
                            }
                            if (i2 == 3) {
                                j2 = k9Var2.J$0;
                                pendingUserProfile = (PendingUserProfile) k9Var2.L$3;
                                d99 d99Var5 = (d99) k9Var2.L$2;
                                d99Var2 = (d99) k9Var2.L$1;
                                str3 = (String) k9Var2.L$0;
                                jzb.q(obj);
                                d99Var4 = d99Var5;
                                bw2Var = bw2Var2;
                                try {
                                    if (e(j2, str3)) {
                                        zBooleanValue = false;
                                    } else {
                                        this.w.incrementAndGet();
                                        l9 l9Var2 = new l9(pendingUserProfile, this, null);
                                        k9Var2.L$0 = null;
                                        k9Var2.L$1 = d99Var2;
                                        k9Var2.L$2 = d99Var4;
                                        k9Var2.L$3 = null;
                                        k9Var2.L$4 = null;
                                        k9Var2.J$0 = j2;
                                        k9Var2.label = 4;
                                        objB = f8aVar.b(pendingUserProfile, l9Var2, k9Var2);
                                        if (objB == bw2Var) {
                                            return bw2Var;
                                        }
                                        obj = objB;
                                        d99Var3 = d99Var4;
                                        d99Var = d99Var2;
                                    }
                                    obj2 = null;
                                    d99Var4.h(null);
                                    Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                                    d99Var2.h(obj2);
                                    return boolValueOf2;
                                } catch (Throwable th3) {
                                    th = th3;
                                    d99Var3 = d99Var4;
                                    d99Var = d99Var2;
                                    obj2 = null;
                                    d99Var3.h(obj2);
                                    throw th;
                                }
                            }
                            if (i2 != 4) {
                                qc0.p("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            d99Var3 = (d99) k9Var2.L$2;
                            d99Var = (d99) k9Var2.L$1;
                            try {
                                jzb.q(obj);
                            } catch (Throwable th4) {
                                th = th4;
                                d99Var3.h(obj2);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            d99Var2.h(obj2);
                            throw th;
                        }
                    } else {
                        j = k9Var2.J$0;
                        d99Var = (d99) k9Var2.L$1;
                        String str4 = (String) k9Var2.L$0;
                        jzb.q(obj);
                        str2 = str4;
                    }
                    zBooleanValue = ((Boolean) obj).booleanValue();
                    d99Var4 = d99Var3;
                    d99Var2 = d99Var;
                    obj2 = null;
                    d99Var4.h(null);
                    Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                    d99Var2.h(obj2);
                    return boolValueOf3;
                } catch (Throwable th6) {
                    th = th6;
                    obj2 = null;
                    d99Var3.h(obj2);
                    throw th;
                }
            }
            jzb.q(obj);
            j = this.g.get();
            str2 = str;
            k9Var2.L$0 = str2;
            d99Var = this.f;
            k9Var2.L$1 = d99Var;
            k9Var2.J$0 = j;
            k9Var2.label = 1;
            if (d99Var.b(k9Var2) == bw2Var2) {
                return bw2Var2;
            }
            if (e(j, str2)) {
                PendingUserProfile pendingUserProfileC = f8a.c();
                if (pendingUserProfileC == null) {
                    d99Var2 = d99Var;
                } else if (pa7.t(pendingUserProfileC.getAccountId(), str2)) {
                    gpf gpfVar = this.b;
                    List<String> quinSource = pendingUserProfileC.getQuinSource();
                    List<String> intentions = pendingUserProfileC.getIntentions();
                    String birthday = pendingUserProfileC.getBirthday();
                    k9Var2.L$0 = str2;
                    k9Var2.L$1 = d99Var;
                    k9Var2.L$2 = pendingUserProfileC;
                    k9Var2.J$0 = j;
                    k9Var2.label = 2;
                    long j4 = j;
                    String str5 = str2;
                    bw2Var = bw2Var2;
                    objA = gpf.a(gpfVar, null, null, birthday, null, quinSource, intentions, null, null, null, null, k9Var2, 7803);
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                    d99Var2 = d99Var;
                    str3 = str5;
                    j2 = j4;
                    pendingUserProfile = pendingUserProfileC;
                    if (((Boolean) objA).booleanValue()) {
                        zBooleanValue = false;
                        obj2 = null;
                    } else {
                        d99Var4 = this.e;
                        k9Var2.L$0 = str3;
                        k9Var2.L$1 = d99Var2;
                        k9Var2.L$2 = d99Var4;
                        k9Var2.L$3 = pendingUserProfile;
                        k9Var2.L$4 = null;
                        k9Var2.J$0 = j2;
                        k9Var2.label = 3;
                        if (d99Var4.b(k9Var2) == bw2Var) {
                            return bw2Var;
                        }
                        if (e(j2, str3)) {
                            zBooleanValue = false;
                        } else {
                            this.w.incrementAndGet();
                            l9 l9Var3 = new l9(pendingUserProfile, this, null);
                            k9Var2.L$0 = null;
                            k9Var2.L$1 = d99Var2;
                            k9Var2.L$2 = d99Var4;
                            k9Var2.L$3 = null;
                            k9Var2.L$4 = null;
                            k9Var2.J$0 = j2;
                            k9Var2.label = 4;
                            objB = f8aVar.b(pendingUserProfile, l9Var3, k9Var2);
                            if (objB == bw2Var) {
                                return bw2Var;
                            }
                            obj = objB;
                            d99Var3 = d99Var4;
                            d99Var = d99Var2;
                            zBooleanValue = ((Boolean) obj).booleanValue();
                            d99Var4 = d99Var3;
                            d99Var2 = d99Var;
                        }
                        obj2 = null;
                        d99Var4.h(null);
                    }
                } else {
                    d99Var2 = d99Var;
                    zBooleanValue = false;
                }
            } else {
                d99Var2 = d99Var;
                zBooleanValue = false;
            }
            Boolean boolValueOf4 = Boolean.valueOf(zBooleanValue);
            d99Var2.h(obj2);
            return boolValueOf4;
        } catch (Throwable th7) {
            th = th7;
            d99Var2 = d99Var;
            obj2 = null;
            d99Var2.h(obj2);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:135:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x0146  */
    /* JADX WARN: Code duplicated, block: B:64:0x0194  */
    /* JADX WARN: Code duplicated, block: B:65:0x0198 A[Catch: all -> 0x023a, TRY_LEAVE, TryCatch #6 {all -> 0x023a, blocks: (B:62:0x018c, B:65:0x0198), top: B:121:0x018c }] */
    /* JADX WARN: Code duplicated, block: B:68:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:71:0x01c0 A[PHI: r1 r11 r16
  0x01c0: PHI (r1v14 d99) = (r1v11 d99), (r1v15 d99) binds: [B:70:0x01be, B:88:0x021d] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r11v15 d99) = (r11v9 d99), (r11v16 d99) binds: [B:70:0x01be, B:88:0x021d] A[DONT_GENERATE, DONT_INLINE]
  0x01c0: PHI (r16v2 boolean) = (r16v0 boolean), (r16v3 boolean) binds: [B:70:0x01be, B:88:0x021d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x01c3 A[Catch: all -> 0x01fa, TryCatch #7 {all -> 0x01fa, blocks: (B:69:0x01ba, B:72:0x01c3, B:74:0x01ca), top: B:123:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca A[Catch: all -> 0x01fa, TRY_LEAVE, TryCatch #7 {all -> 0x01fa, blocks: (B:69:0x01ba, B:72:0x01c3, B:74:0x01ca), top: B:123:0x01ba }] */
    /* JADX WARN: Code duplicated, block: B:77:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:87:0x021c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object g(String str, String str2, a26 a26Var, zn2 zn2Var) throws Throwable {
        m9 m9Var;
        String str3;
        a26 a26Var2;
        long j;
        String str4;
        d99 d99Var;
        a26 a26Var3;
        d99 d99Var2;
        d99 d99Var3;
        Object obj;
        boolean z2;
        bw2 bw2Var;
        String str5;
        String str6;
        long j2;
        d99 d99Var4;
        PendingUserProfile pendingUserProfile;
        Object obj2;
        d99 d99Var5;
        long j3;
        String str7;
        d99 d99Var6;
        d99 d99Var7;
        d99 d99Var8;
        Object obj3;
        xof xofVar;
        if (zn2Var instanceof m9) {
            m9Var = (m9) zn2Var;
            int i = m9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                m9Var.label = i - Integer.MIN_VALUE;
            } else {
                m9Var = new m9(this, zn2Var);
            }
        } else {
            m9Var = new m9(this, zn2Var);
        }
        m9 m9Var2 = m9Var;
        Object obj4 = m9Var2.result;
        int i2 = m9Var2.label;
        boolean z3 = false;
        bw2 bw2Var2 = bw2.a;
        try {
            if (i2 != 0) {
                try {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            j2 = m9Var2.J$0;
                            PendingUserProfile pendingUserProfile2 = (PendingUserProfile) m9Var2.L$4;
                            d99Var4 = (d99) m9Var2.L$3;
                            str6 = (String) m9Var2.L$1;
                            str5 = (String) m9Var2.L$0;
                            try {
                                jzb.q(obj4);
                                pendingUserProfile = pendingUserProfile2;
                                z2 = true;
                                bw2Var = bw2Var2;
                                try {
                                    if (!((Boolean) obj4).booleanValue()) {
                                        d99Var5 = this.e;
                                        m9Var2.L$0 = str5;
                                        m9Var2.L$1 = str6;
                                        m9Var2.L$2 = null;
                                        m9Var2.L$3 = d99Var4;
                                        m9Var2.L$4 = d99Var5;
                                        m9Var2.L$5 = null;
                                        m9Var2.L$6 = pendingUserProfile;
                                        m9Var2.J$0 = j2;
                                        m9Var2.label = 3;
                                        if (d99Var5.b(m9Var2) == bw2Var) {
                                            return bw2Var;
                                        }
                                        j3 = j2;
                                        d99Var3 = d99Var4;
                                        str7 = str6;
                                        if (e(j3, str5)) {
                                            this.w.incrementAndGet();
                                            if (pendingUserProfile != null) {
                                                m9Var2.L$0 = null;
                                                m9Var2.L$1 = str7;
                                                m9Var2.L$2 = null;
                                                m9Var2.L$3 = d99Var3;
                                                m9Var2.L$4 = d99Var5;
                                                m9Var2.L$5 = null;
                                                m9Var2.L$6 = null;
                                                m9Var2.L$7 = null;
                                                m9Var2.J$0 = j3;
                                                m9Var2.label = 4;
                                                if (ypa.a.a(new e8a(new z7a(pendingUserProfile, null), null), m9Var2) == bw2Var) {
                                                    return bw2Var;
                                                }
                                                d99Var8 = d99Var3;
                                                d99Var7 = d99Var8;
                                            } else {
                                                d99Var7 = d99Var3;
                                            }
                                            xofVar = this.a;
                                            m9Var2.L$0 = null;
                                            m9Var2.L$1 = null;
                                            m9Var2.L$2 = null;
                                            m9Var2.L$3 = d99Var7;
                                            m9Var2.L$4 = d99Var5;
                                            m9Var2.L$5 = null;
                                            m9Var2.L$6 = null;
                                            m9Var2.L$7 = null;
                                            m9Var2.J$0 = j3;
                                            m9Var2.label = 5;
                                            if (xofVar.e(str7, m9Var2) == bw2Var) {
                                                return bw2Var;
                                            }
                                            d99Var6 = d99Var5;
                                        } else {
                                            obj2 = null;
                                            d99Var5.h(null);
                                        }
                                        th = th;
                                        obj = null;
                                        d99Var3.h(obj);
                                        throw th;
                                    }
                                    d99Var3 = d99Var4;
                                    obj2 = null;
                                    Boolean boolValueOf = Boolean.valueOf(z3);
                                    d99Var3.h(obj2);
                                    return boolValueOf;
                                } catch (Throwable th) {
                                    th = th;
                                    d99Var3 = d99Var4;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                d99Var3 = d99Var4;
                            }
                        } else {
                            if (i2 == 3) {
                                long j4 = m9Var2.J$0;
                                PendingUserProfile pendingUserProfile3 = (PendingUserProfile) m9Var2.L$6;
                                d99 d99Var9 = (d99) m9Var2.L$4;
                                d99Var3 = (d99) m9Var2.L$3;
                                str6 = (String) m9Var2.L$1;
                                str5 = (String) m9Var2.L$0;
                                try {
                                    jzb.q(obj4);
                                    pendingUserProfile = pendingUserProfile3;
                                    j3 = j4;
                                    z2 = true;
                                    bw2Var = bw2Var2;
                                    d99Var5 = d99Var9;
                                    str7 = str6;
                                    try {
                                        if (e(j3, str5)) {
                                            obj2 = null;
                                            d99Var5.h(null);
                                            Boolean boolValueOf2 = Boolean.valueOf(z3);
                                            d99Var3.h(obj2);
                                            return boolValueOf2;
                                        }
                                        this.w.incrementAndGet();
                                        if (pendingUserProfile != null) {
                                            m9Var2.L$0 = null;
                                            m9Var2.L$1 = str7;
                                            m9Var2.L$2 = null;
                                            m9Var2.L$3 = d99Var3;
                                            m9Var2.L$4 = d99Var5;
                                            m9Var2.L$5 = null;
                                            m9Var2.L$6 = null;
                                            m9Var2.L$7 = null;
                                            m9Var2.J$0 = j3;
                                            m9Var2.label = 4;
                                            if (ypa.a.a(new e8a(new z7a(pendingUserProfile, null), null), m9Var2) == bw2Var) {
                                                return bw2Var;
                                            }
                                            d99Var8 = d99Var3;
                                            d99Var7 = d99Var8;
                                        } else {
                                            d99Var7 = d99Var3;
                                        }
                                        xofVar = this.a;
                                        m9Var2.L$0 = null;
                                        m9Var2.L$1 = null;
                                        m9Var2.L$2 = null;
                                        m9Var2.L$3 = d99Var7;
                                        m9Var2.L$4 = d99Var5;
                                        m9Var2.L$5 = null;
                                        m9Var2.L$6 = null;
                                        m9Var2.L$7 = null;
                                        m9Var2.J$0 = j3;
                                        m9Var2.label = 5;
                                        if (xofVar.e(str7, m9Var2) == bw2Var) {
                                            return bw2Var;
                                        }
                                        d99Var6 = d99Var5;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        d99Var6 = d99Var5;
                                        d99Var7 = d99Var3;
                                        obj3 = null;
                                        d99Var6.h(obj3);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                                th = th;
                                obj = null;
                                d99Var3.h(obj);
                                throw th;
                            }
                            if (i2 == 4) {
                                j3 = m9Var2.J$0;
                                d99Var6 = (d99) m9Var2.L$4;
                                d99Var8 = (d99) m9Var2.L$3;
                                str7 = (String) m9Var2.L$1;
                                try {
                                    jzb.q(obj4);
                                    d99Var5 = d99Var6;
                                    z2 = true;
                                    bw2Var = bw2Var2;
                                    d99Var7 = d99Var8;
                                    try {
                                        xofVar = this.a;
                                        m9Var2.L$0 = null;
                                        m9Var2.L$1 = null;
                                        m9Var2.L$2 = null;
                                        m9Var2.L$3 = d99Var7;
                                        m9Var2.L$4 = d99Var5;
                                        m9Var2.L$5 = null;
                                        m9Var2.L$6 = null;
                                        m9Var2.L$7 = null;
                                        m9Var2.J$0 = j3;
                                        m9Var2.label = 5;
                                        if (xofVar.e(str7, m9Var2) == bw2Var) {
                                            return bw2Var;
                                        }
                                        d99Var6 = d99Var5;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        d99Var6 = d99Var5;
                                        obj3 = null;
                                        d99Var6.h(obj3);
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    d99Var7 = d99Var8;
                                }
                            } else {
                                if (i2 != 5) {
                                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                d99Var6 = (d99) m9Var2.L$4;
                                d99Var7 = (d99) m9Var2.L$3;
                                try {
                                    jzb.q(obj4);
                                    z2 = true;
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                            }
                            obj3 = null;
                            try {
                                d99Var6.h(obj3);
                                throw th;
                            } catch (Throwable th8) {
                                th = th8;
                                d99Var3 = d99Var7;
                            }
                        }
                        obj = null;
                        d99Var3.h(obj);
                        throw th;
                    }
                    long j5 = m9Var2.J$0;
                    d99 d99Var10 = (d99) m9Var2.L$3;
                    a26Var2 = (a26) m9Var2.L$2;
                    String str8 = (String) m9Var2.L$1;
                    String str9 = (String) m9Var2.L$0;
                    jzb.q(obj4);
                    j = j5;
                    str3 = str8;
                    str4 = str9;
                    d99Var = d99Var10;
                    d99Var5.h(null);
                    Boolean boolValueOf3 = Boolean.valueOf(z3);
                    d99Var3.h(obj2);
                    return boolValueOf3;
                } catch (Throwable th9) {
                    th = th9;
                }
                d99Var5 = d99Var6;
                d99Var3 = d99Var7;
                z3 = z2;
                obj2 = null;
            } else {
                jzb.q(obj4);
                long j6 = this.g.get();
                m9Var2.L$0 = str;
                str3 = str2;
                m9Var2.L$1 = str3;
                a26Var2 = a26Var;
                m9Var2.L$2 = a26Var2;
                f99 f99Var = this.f;
                m9Var2.L$3 = f99Var;
                m9Var2.J$0 = j6;
                m9Var2.label = 1;
                if (f99Var.b(m9Var2) == bw2Var2) {
                    return bw2Var2;
                }
                j = j6;
                str4 = str;
                d99Var = f99Var;
            }
            if (e(j, str4)) {
                PendingUserProfile pendingUserProfileC = f8a.c();
                if (pendingUserProfileC != null) {
                    try {
                        if (!pa7.t(pendingUserProfileC.getAccountId(), str4)) {
                            pendingUserProfileC = null;
                        }
                    } catch (Throwable th10) {
                        th = th10;
                        obj = null;
                        d99Var3 = d99Var;
                    }
                } else {
                    pendingUserProfileC = null;
                }
                gpf gpfVar = this.b;
                m9Var2.L$0 = str4;
                m9Var2.L$1 = str3;
                m9Var2.L$2 = null;
                m9Var2.L$3 = d99Var;
                m9Var2.L$4 = pendingUserProfileC;
                m9Var2.J$0 = j;
                m9Var2.label = 2;
                long j7 = j;
                d99Var2 = d99Var;
                z2 = true;
                String str10 = str3;
                PendingUserProfile pendingUserProfile4 = pendingUserProfileC;
                bw2Var = bw2Var2;
                try {
                    Object objA = gpf.a(gpfVar, null, null, str10, null, null, null, null, null, null, a26Var3, m9Var2, 4091);
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                    str5 = str4;
                    obj4 = objA;
                    str6 = str10;
                    j2 = j7;
                    d99Var4 = d99Var2;
                    pendingUserProfile = pendingUserProfile4;
                    if (!((Boolean) obj4).booleanValue()) {
                        d99Var5 = this.e;
                        m9Var2.L$0 = str5;
                        m9Var2.L$1 = str6;
                        m9Var2.L$2 = null;
                        m9Var2.L$3 = d99Var4;
                        m9Var2.L$4 = d99Var5;
                        m9Var2.L$5 = null;
                        m9Var2.L$6 = pendingUserProfile;
                        m9Var2.J$0 = j2;
                        m9Var2.label = 3;
                        if (d99Var5.b(m9Var2) == bw2Var) {
                            return bw2Var;
                        }
                        j3 = j2;
                        d99Var3 = d99Var4;
                        str7 = str6;
                        if (e(j3, str5)) {
                            obj2 = null;
                            d99Var5.h(null);
                        } else {
                            this.w.incrementAndGet();
                            if (pendingUserProfile != null) {
                                m9Var2.L$0 = null;
                                m9Var2.L$1 = str7;
                                m9Var2.L$2 = null;
                                m9Var2.L$3 = d99Var3;
                                m9Var2.L$4 = d99Var5;
                                m9Var2.L$5 = null;
                                m9Var2.L$6 = null;
                                m9Var2.L$7 = null;
                                m9Var2.J$0 = j3;
                                m9Var2.label = 4;
                                if (ypa.a.a(new e8a(new z7a(pendingUserProfile, null), null), m9Var2) == bw2Var) {
                                    return bw2Var;
                                }
                                d99Var8 = d99Var3;
                                d99Var7 = d99Var8;
                            } else {
                                d99Var7 = d99Var3;
                            }
                            xofVar = this.a;
                            m9Var2.L$0 = null;
                            m9Var2.L$1 = null;
                            m9Var2.L$2 = null;
                            m9Var2.L$3 = d99Var7;
                            m9Var2.L$4 = d99Var5;
                            m9Var2.L$5 = null;
                            m9Var2.L$6 = null;
                            m9Var2.L$7 = null;
                            m9Var2.J$0 = j3;
                            m9Var2.label = 5;
                            if (xofVar.e(str7, m9Var2) == bw2Var) {
                                return bw2Var;
                            }
                            d99Var6 = d99Var5;
                            d99Var5 = d99Var6;
                            d99Var3 = d99Var7;
                            z3 = z2;
                            obj2 = null;
                            d99Var5.h(null);
                        }
                        th = th9;
                        obj = null;
                        d99Var3.h(obj);
                        throw th;
                    }
                    d99Var3 = d99Var4;
                    obj2 = null;
                } catch (Throwable th11) {
                    th = th11;
                    d99Var3 = d99Var2;
                }
            } else {
                obj2 = null;
                d99Var3 = d99Var;
            }
            Boolean boolValueOf4 = Boolean.valueOf(z3);
            d99Var3.h(obj2);
            return boolValueOf4;
        } catch (Throwable th12) {
            th = th12;
            d99Var2 = d99Var;
        }
        a26Var3 = a26Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(Boolean bool, Boolean bool2, Boolean bool3, zn2 zn2Var) throws Throwable {
        n9 n9Var;
        Boolean bool4;
        d99 d99Var;
        Boolean bool5;
        String str;
        Throwable th;
        d99 d99Var2;
        if (zn2Var instanceof n9) {
            n9Var = (n9) zn2Var;
            int i = n9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                n9Var.label = i - Integer.MIN_VALUE;
            } else {
                n9Var = new n9(this, zn2Var);
            }
        } else {
            n9Var = new n9(this, zn2Var);
        }
        Object obj = n9Var.result;
        int i2 = n9Var.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                String strA = s7.a();
                if (strA.length() == 0) {
                    return wefVar;
                }
                this.w.incrementAndGet();
                n9Var.L$0 = bool;
                n9Var.L$1 = bool2;
                n9Var.L$2 = bool3;
                n9Var.L$3 = strA;
                f99 f99Var = this.e;
                n9Var.L$4 = f99Var;
                n9Var.label = 1;
                if (f99Var.b(n9Var) != bw2Var) {
                    bool4 = bool;
                    d99Var = f99Var;
                    bool5 = bool2;
                    str = strA;
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) n9Var.L$4;
                try {
                    jzb.q(obj);
                    d99Var = d99Var2;
                    d99Var.h(null);
                    return wefVar;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99Var = (d99) n9Var.L$4;
            str = (String) n9Var.L$3;
            bool3 = (Boolean) n9Var.L$2;
            bool5 = (Boolean) n9Var.L$1;
            bool4 = (Boolean) n9Var.L$0;
            jzb.q(obj);
            if (pa7.t(s7.a(), str)) {
                xof xofVar = this.a;
                n9Var.L$0 = null;
                n9Var.L$1 = null;
                n9Var.L$2 = null;
                n9Var.L$3 = null;
                n9Var.L$4 = d99Var;
                n9Var.label = 2;
                if (xofVar.i(bool4, bool5, bool3, n9Var) != bw2Var) {
                    d99Var2 = d99Var;
                    d99Var = d99Var2;
                }
                return bw2Var;
            }
            d99Var.h(null);
            return wefVar;
        } catch (Throwable th3) {
            d99 d99Var3 = d99Var;
            th = th3;
            d99Var2 = d99Var3;
            d99Var2.h(null);
            throw th;
        }
    }
}
