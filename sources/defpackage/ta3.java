package defpackage;

import android.content.Context;
import java.time.LocalTime;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ta3 implements hf8 {
    public static final ta3 a = new ta3();
    public static final f99 b = new f99();
    public static final AtomicLong c = new AtomicLong();
    public static final AtomicLong d = new AtomicLong();

    public static Object b(Context context, boolean z, zn2 zn2Var) {
        y93 y93Var = y93.a;
        if (z) {
            return y93Var.a(context, zn2Var);
        }
        iy9 iy9VarE = y93.e();
        if (iy9VarE == null && (iy9VarE = y93.f()) == null) {
            iy9VarE = new iy9(new Integer(9), new Integer(0));
        }
        return y93Var.l(context, ((Number) iy9VarE.a()).intValue(), ((Number) iy9VarE.b()).intValue(), zn2Var);
    }

    public static Object l(Context context, iy9 iy9Var, zn2 zn2Var) {
        y93 y93Var = y93.a;
        return iy9Var == null ? y93Var.a(context, zn2Var) : y93Var.l(context, ((Number) iy9Var.d()).intValue(), ((Number) iy9Var.e()).intValue(), zn2Var);
    }

    public static /* synthetic */ Object p(gpf gpfVar, Boolean bool, Boolean bool2, zn2 zn2Var, int i) {
        if ((i & 2) != 0) {
            bool = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        return a.o(gpfVar, bool, bool2, zn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Context context, boolean z, zn2 zn2Var) throws Throwable {
        z93 z93Var;
        d99 d99Var;
        d99 d99Var2;
        Throwable th;
        if (zn2Var instanceof z93) {
            z93Var = (z93) zn2Var;
            int i = z93Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                z93Var.label = i - Integer.MIN_VALUE;
            } else {
                z93Var = new z93(this, zn2Var);
            }
        } else {
            z93Var = new z93(this, zn2Var);
        }
        Object obj = z93Var.result;
        int i2 = z93Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                c.incrementAndGet();
                z93Var.L$0 = context;
                d99Var = b;
                z93Var.L$1 = d99Var;
                z93Var.Z$0 = z;
                z93Var.label = 1;
                if (d99Var.b(z93Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) z93Var.L$1;
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
            z = z93Var.Z$0;
            d99 d99Var3 = (d99) z93Var.L$1;
            Context context2 = (Context) z93Var.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            context = context2;
            z93Var.L$0 = null;
            z93Var.L$1 = d99Var;
            z93Var.Z$0 = z;
            z93Var.label = 2;
            if (b(context, z, z93Var) != bw2Var) {
                d99Var2 = d99Var;
                d99Var2.h(null);
                return wef.a;
            }
            return bw2Var;
        } catch (Throwable th3) {
            d99Var2 = d99Var;
            th = th3;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Context context, boolean z, zn2 zn2Var) throws Throwable {
        aa3 aa3Var;
        d99 d99Var;
        d99 d99Var2;
        Throwable th;
        if (zn2Var instanceof aa3) {
            aa3Var = (aa3) zn2Var;
            int i = aa3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aa3Var.label = i - Integer.MIN_VALUE;
            } else {
                aa3Var = new aa3(this, zn2Var);
            }
        } else {
            aa3Var = new aa3(this, zn2Var);
        }
        Object obj = aa3Var.result;
        int i2 = aa3Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                d.incrementAndGet();
                aa3Var.L$0 = context;
                d99Var = b;
                aa3Var.L$1 = d99Var;
                aa3Var.Z$0 = z;
                aa3Var.label = 1;
                if (d99Var.b(aa3Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) aa3Var.L$1;
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
            z = aa3Var.Z$0;
            d99 d99Var3 = (d99) aa3Var.L$1;
            Context context2 = (Context) aa3Var.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            context = context2;
            ta3 ta3Var = a;
            aa3Var.L$0 = null;
            aa3Var.L$1 = d99Var;
            aa3Var.Z$0 = z;
            aa3Var.label = 2;
            if (ta3Var.e(context, z, aa3Var) != bw2Var) {
                d99Var2 = d99Var;
                d99Var2.h(null);
                return wef.a;
            }
            return bw2Var;
        } catch (Throwable th3) {
            d99Var2 = d99Var;
            th = th3;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0093, code lost:
    
        if (r6.n(r7, r4, r3, r0) == r9) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(android.content.Context r7, boolean r8, defpackage.zn2 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ba3
            if (r0 == 0) goto L13
            r0 = r9
            ba3 r0 = (defpackage.ba3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            ba3 r0 = new ba3
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r6 = r0.result
            int r9 = r0.label
            r1 = 0
            r2 = 2
            r3 = 1
            if (r9 == 0) goto L3b
            if (r9 == r3) goto L33
            if (r9 != r2) goto L2d
            java.lang.Object r7 = r0.L$0
            android.content.Context r7 = (android.content.Context) r7
            defpackage.jzb.q(r6)
            goto L96
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L33:
            java.lang.Object r7 = r0.L$0
            android.content.Context r7 = (android.content.Context) r7
            defpackage.jzb.q(r6)
            return r6
        L3b:
            defpackage.jzb.q(r6)
            y93 r6 = defpackage.y93.a
            bw2 r9 = defpackage.bw2.a
            if (r8 == 0) goto L52
            r0.L$0 = r1
            r0.Z$0 = r8
            r0.label = r3
            java.lang.Object r6 = r6.c(r7, r0)
            if (r6 != r9) goto L51
            goto L95
        L51:
            return r6
        L52:
            iy9 r3 = defpackage.y93.h()
            if (r3 != 0) goto L71
            iy9 r3 = defpackage.y93.g()
            if (r3 != 0) goto L71
            java.lang.Integer r3 = new java.lang.Integer
            r4 = 20
            r3.<init>(r4)
            java.lang.Integer r4 = new java.lang.Integer
            r5 = 0
            r4.<init>(r5)
            iy9 r5 = new iy9
            r5.<init>(r3, r4)
            r3 = r5
        L71:
            java.lang.Object r4 = r3.a()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            java.lang.Object r3 = r3.b()
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r0.L$0 = r1
            r0.Z$0 = r8
            r0.I$0 = r4
            r0.I$1 = r3
            r0.label = r2
            java.lang.Object r6 = r6.n(r7, r4, r3, r0)
            if (r6 != r9) goto L96
        L95:
            return r9
        L96:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta3.e(android.content.Context, boolean, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:57:0x013d A[Catch: all -> 0x0071, CancellationException -> 0x0154, TRY_LEAVE, TryCatch #0 {all -> 0x0071, blocks: (B:23:0x006c, B:69:0x0166, B:30:0x008b, B:55:0x0135, B:57:0x013d), top: B:76:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:72:0x0182  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x014f, code lost:
    
        if (l(r8, r3, r1) == r10) goto L71;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.concurrent.atomic.AtomicLong] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v28 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v9, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(android.content.Context r19, defpackage.gpf r20, defpackage.zn2 r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta3.f(android.content.Context, gpf, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:56:0x013a  */
    /* JADX WARN: Code duplicated, block: B:59:0x0143 A[Catch: all -> 0x0057, CancellationException -> 0x015d, TRY_LEAVE, TryCatch #3 {CancellationException -> 0x015d, blocks: (B:57:0x013b, B:59:0x0143), top: B:81:0x013b }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x0189 A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #4 {all -> 0x0057, blocks: (B:18:0x0052, B:74:0x0189, B:66:0x0161, B:71:0x016d, B:57:0x013b, B:59:0x0143, B:53:0x0125), top: B:83:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final Object g(Context context, gpf gpfVar, zn2 zn2Var) throws Throwable {
        ea3 ea3Var;
        long jIncrementAndGet;
        gpf gpfVar2;
        d99 d99Var;
        Context context2;
        iy9 iy9VarH;
        gpf gpfVar3;
        d99 d99Var2;
        boolean zBooleanValue;
        CancellationException cancellationException;
        iy9 iy9Var;
        Context context3;
        boolean z;
        d99 d99Var3;
        fg9 fg9Var;
        fa3 fa3Var;
        ta3 ta3Var = a;
        if (zn2Var instanceof ea3) {
            ea3Var = (ea3) zn2Var;
            int i = ea3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ea3Var.label = i - Integer.MIN_VALUE;
            } else {
                ea3Var = new ea3(this, zn2Var);
            }
        } else {
            ea3Var = new ea3(this, zn2Var);
        }
        Object objP = ea3Var.result;
        ?? r3 = ea3Var.label;
        AtomicLong atomicLong = d;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (r3 == 0) {
                    jzb.q(objP);
                    jIncrementAndGet = atomicLong.incrementAndGet();
                    ea3Var.L$0 = context;
                    gpfVar2 = gpfVar;
                    ea3Var.L$1 = gpfVar2;
                    f99 f99Var = b;
                    ea3Var.L$2 = f99Var;
                    ea3Var.J$0 = jIncrementAndGet;
                    ea3Var.label = 1;
                    if (f99Var.b(ea3Var) != bw2Var) {
                        d99Var = f99Var;
                        context2 = context;
                    }
                    return bw2Var;
                }
                if (r3 != 1) {
                    if (r3 != 2) {
                        if (r3 == 3) {
                            long j = ea3Var.J$0;
                            iy9 iy9Var2 = (iy9) ea3Var.L$3;
                            d99 d99Var4 = (d99) ea3Var.L$2;
                            Context context4 = (Context) ea3Var.L$0;
                            try {
                                jzb.q(objP);
                                jIncrementAndGet = j;
                                iy9VarH = iy9Var2;
                                d99Var2 = d99Var4;
                                context3 = context4;
                                try {
                                    zBooleanValue = ((Boolean) objP).booleanValue();
                                    if (!zBooleanValue) {
                                        ea3Var.L$0 = context3;
                                        ea3Var.L$1 = null;
                                        ea3Var.L$2 = d99Var2;
                                        ea3Var.L$3 = iy9VarH;
                                        ea3Var.J$0 = jIncrementAndGet;
                                        ea3Var.Z$0 = zBooleanValue;
                                        ea3Var.label = 4;
                                        if (ta3Var.m(context3, iy9VarH, ea3Var) != bw2Var) {
                                            z = zBooleanValue;
                                            d99Var3 = d99Var2;
                                            zBooleanValue = z;
                                            d99Var2 = d99Var3;
                                        }
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                                    d99Var2.h(null);
                                    return boolValueOf;
                                } catch (CancellationException e) {
                                    cancellationException = e;
                                    iy9Var = iy9VarH;
                                    fg9Var = fg9.b;
                                    fa3Var = new fa3(context3, iy9Var, null);
                                    ea3Var.L$0 = null;
                                    ea3Var.L$1 = null;
                                    ea3Var.L$2 = d99Var2;
                                    ea3Var.L$3 = null;
                                    ea3Var.L$4 = cancellationException;
                                    ea3Var.J$0 = jIncrementAndGet;
                                    ea3Var.label = 5;
                                    if (ynb.p0(fg9Var, fa3Var, ea3Var) != bw2Var) {
                                        throw cancellationException;
                                    }
                                }
                            } catch (CancellationException e2) {
                                cancellationException = e2;
                                jIncrementAndGet = j;
                                iy9Var = iy9Var2;
                                d99Var2 = d99Var4;
                                context3 = context4;
                                fg9Var = fg9.b;
                                fa3Var = new fa3(context3, iy9Var, null);
                                ea3Var.L$0 = null;
                                ea3Var.L$1 = null;
                                ea3Var.L$2 = d99Var2;
                                ea3Var.L$3 = null;
                                ea3Var.L$4 = cancellationException;
                                ea3Var.J$0 = jIncrementAndGet;
                                ea3Var.label = 5;
                                if (ynb.p0(fg9Var, fa3Var, ea3Var) != bw2Var) {
                                    throw cancellationException;
                                }
                                return bw2Var;
                            } catch (Throwable th) {
                                th = th;
                                r3 = d99Var4;
                            }
                        } else {
                            if (r3 != 4) {
                                if (r3 != 5) {
                                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                CancellationException cancellationException2 = (CancellationException) ea3Var.L$4;
                                jzb.q(objP);
                                throw cancellationException2;
                            }
                            z = ea3Var.Z$0;
                            long j2 = ea3Var.J$0;
                            iy9Var = (iy9) ea3Var.L$3;
                            d99Var3 = (d99) ea3Var.L$2;
                            context3 = (Context) ea3Var.L$0;
                            try {
                                jzb.q(objP);
                                zBooleanValue = z;
                                d99Var2 = d99Var3;
                                Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                                d99Var2.h(null);
                                return boolValueOf2;
                            } catch (CancellationException e3) {
                                cancellationException = e3;
                                jIncrementAndGet = j2;
                                d99Var2 = d99Var3;
                                fg9Var = fg9.b;
                                fa3Var = new fa3(context3, iy9Var, null);
                                ea3Var.L$0 = null;
                                ea3Var.L$1 = null;
                                ea3Var.L$2 = d99Var2;
                                ea3Var.L$3 = null;
                                ea3Var.L$4 = cancellationException;
                                ea3Var.J$0 = jIncrementAndGet;
                                ea3Var.label = 5;
                                if (ynb.p0(fg9Var, fa3Var, ea3Var) != bw2Var) {
                                    throw cancellationException;
                                }
                                return bw2Var;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = d99Var3;
                            }
                        }
                        return bw2Var;
                    }
                    long j3 = ea3Var.J$0;
                    iy9 iy9Var3 = (iy9) ea3Var.L$3;
                    d99 d99Var5 = (d99) ea3Var.L$2;
                    gpf gpfVar4 = (gpf) ea3Var.L$1;
                    context2 = (Context) ea3Var.L$0;
                    try {
                        jzb.q(objP);
                        gpfVar3 = gpfVar4;
                        iy9VarH = iy9Var3;
                        d99Var2 = d99Var5;
                        jIncrementAndGet = j3;
                        try {
                            Boolean bool = Boolean.TRUE;
                            ea3Var.L$0 = context2;
                            ea3Var.L$1 = null;
                            ea3Var.L$2 = d99Var2;
                            ea3Var.L$3 = iy9VarH;
                            ea3Var.J$0 = jIncrementAndGet;
                            ea3Var.label = 3;
                            objP = p(gpfVar3, null, bool, ea3Var, 2);
                            if (objP != bw2Var) {
                                context3 = context2;
                                zBooleanValue = ((Boolean) objP).booleanValue();
                                if (!zBooleanValue) {
                                    ea3Var.L$0 = context3;
                                    ea3Var.L$1 = null;
                                    ea3Var.L$2 = d99Var2;
                                    ea3Var.L$3 = iy9VarH;
                                    ea3Var.J$0 = jIncrementAndGet;
                                    ea3Var.Z$0 = zBooleanValue;
                                    ea3Var.label = 4;
                                    if (ta3Var.m(context3, iy9VarH, ea3Var) != bw2Var) {
                                        z = zBooleanValue;
                                        d99Var3 = d99Var2;
                                        zBooleanValue = z;
                                        d99Var2 = d99Var3;
                                    }
                                }
                                Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                                d99Var2.h(null);
                                return boolValueOf3;
                            }
                        } catch (CancellationException e4) {
                            cancellationException = e4;
                            iy9Var = iy9VarH;
                            context3 = context2;
                            fg9Var = fg9.b;
                            fa3Var = new fa3(context3, iy9Var, null);
                            ea3Var.L$0 = null;
                            ea3Var.L$1 = null;
                            ea3Var.L$2 = d99Var2;
                            ea3Var.L$3 = null;
                            ea3Var.L$4 = cancellationException;
                            ea3Var.J$0 = jIncrementAndGet;
                            ea3Var.label = 5;
                            if (ynb.p0(fg9Var, fa3Var, ea3Var) != bw2Var) {
                                throw cancellationException;
                            }
                            return bw2Var;
                        }
                        return bw2Var;
                    } catch (Throwable th3) {
                        th = th3;
                        r3 = d99Var5;
                    }
                    r3.h(null);
                    throw th;
                }
                jIncrementAndGet = ea3Var.J$0;
                d99 d99Var6 = (d99) ea3Var.L$2;
                gpf gpfVar5 = (gpf) ea3Var.L$1;
                context2 = (Context) ea3Var.L$0;
                jzb.q(objP);
                d99Var = d99Var6;
                gpfVar2 = gpfVar5;
                if (jIncrementAndGet == atomicLong.get()) {
                    y93 y93Var = y93.a;
                    iy9VarH = y93.h();
                    ea3Var.L$0 = context2;
                    ea3Var.L$1 = gpfVar2;
                    ea3Var.L$2 = d99Var;
                    ea3Var.L$3 = iy9VarH;
                    ea3Var.J$0 = jIncrementAndGet;
                    ea3Var.label = 2;
                    if (y93Var.c(context2, ea3Var) != bw2Var) {
                        gpfVar3 = gpfVar2;
                        d99Var2 = d99Var;
                        Boolean bool2 = Boolean.TRUE;
                        ea3Var.L$0 = context2;
                        ea3Var.L$1 = null;
                        ea3Var.L$2 = d99Var2;
                        ea3Var.L$3 = iy9VarH;
                        ea3Var.J$0 = jIncrementAndGet;
                        ea3Var.label = 3;
                        objP = p(gpfVar3, null, bool2, ea3Var, 2);
                        if (objP != bw2Var) {
                            context3 = context2;
                            zBooleanValue = ((Boolean) objP).booleanValue();
                            if (!zBooleanValue) {
                                ea3Var.L$0 = context3;
                                ea3Var.L$1 = null;
                                ea3Var.L$2 = d99Var2;
                                ea3Var.L$3 = iy9VarH;
                                ea3Var.J$0 = jIncrementAndGet;
                                ea3Var.Z$0 = zBooleanValue;
                                ea3Var.label = 4;
                                if (ta3Var.m(context3, iy9VarH, ea3Var) != bw2Var) {
                                    z = zBooleanValue;
                                    d99Var3 = d99Var2;
                                    zBooleanValue = z;
                                    d99Var2 = d99Var3;
                                }
                            }
                        }
                    }
                    return bw2Var;
                }
                zBooleanValue = false;
                d99Var2 = d99Var;
                Boolean boolValueOf4 = Boolean.valueOf(zBooleanValue);
                d99Var2.h(null);
                return boolValueOf4;
            } catch (Throwable th4) {
                th = th4;
                r3 = d99Var;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x015e  */
    /* JADX WARN: Code duplicated, block: B:55:0x015f A[Catch: all -> 0x0055, CancellationException -> 0x0185, PHI: r0 r2 r3 r7 r8 r11 r14
  0x015f: PHI (r0v15 java.lang.Object) = (r0v19 java.lang.Object), (r0v1 java.lang.Object) binds: [B:53:0x015c, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r2v9 int) = (r2v11 int), (r2v15 int) binds: [B:53:0x015c, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r3v12 d99) = (r3v13 d99), (r3v15 d99) binds: [B:53:0x015c, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r7v4 int) = (r7v5 int), (r7v6 int) binds: [B:53:0x015c, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r8v5 iy9) = (r8v6 iy9), (r8v9 iy9) binds: [B:53:0x015c, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r11v5 long) = (r11v7 long), (r11v12 long) binds: [B:53:0x015c, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE]
  0x015f: PHI (r14v5 android.content.Context) = (r14v6 android.content.Context), (r14v11 android.content.Context) binds: [B:53:0x015c, B:32:0x009d] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {all -> 0x0055, blocks: (B:18:0x0050, B:70:0x01b1, B:64:0x0189, B:67:0x0191, B:55:0x015f, B:57:0x0167, B:52:0x0146), top: B:78:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0167 A[Catch: all -> 0x0055, CancellationException -> 0x0185, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:18:0x0050, B:70:0x01b1, B:64:0x0189, B:67:0x0191, B:55:0x015f, B:57:0x0167, B:52:0x0146), top: B:78:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:60:0x0180  */
    /* JADX WARN: Code duplicated, block: B:70:0x01b1 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #2 {all -> 0x0055, blocks: (B:18:0x0050, B:70:0x01b1, B:64:0x0189, B:67:0x0191, B:55:0x015f, B:57:0x0167, B:52:0x0146), top: B:78:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0076: MOVE (r3 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:119), block:B:26:0x0076 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.concurrent.atomic.AtomicLong] */
    /* JADX WARN: Type inference failed for: r3v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v22 */
    public final Object h(Context context, int i, int i2, gpf gpfVar, zn2 zn2Var) throws Throwable {
        ga3 ga3Var;
        long jIncrementAndGet;
        d99 d99Var;
        int i3;
        Context context2;
        gpf gpfVar2;
        int i4;
        iy9 iy9VarE;
        d99 d99Var2;
        int i5;
        Context context3;
        gpf gpfVar3;
        boolean zBooleanValue;
        int i6;
        CancellationException cancellationException;
        fg9 fg9Var;
        ha3 ha3Var;
        d99 d99Var3;
        boolean z;
        Object obj;
        long j;
        if (zn2Var instanceof ga3) {
            ga3Var = (ga3) zn2Var;
            int i7 = ga3Var.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ga3Var.label = i7 - Integer.MIN_VALUE;
            } else {
                ga3Var = new ga3(this, zn2Var);
            }
        } else {
            ga3Var = new ga3(this, zn2Var);
        }
        Object objP = ga3Var.result;
        int i8 = ga3Var.label;
        ?? r3 = c;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i8 == 0) {
                    jzb.q(objP);
                    jIncrementAndGet = r3.incrementAndGet();
                    ga3Var.L$0 = context;
                    ga3Var.L$1 = gpfVar;
                    d99Var = b;
                    ga3Var.L$2 = d99Var;
                    i3 = i;
                    ga3Var.I$0 = i3;
                    ga3Var.I$1 = i2;
                    ga3Var.J$0 = jIncrementAndGet;
                    ga3Var.label = 1;
                    if (d99Var.b(ga3Var) != bw2Var) {
                        context2 = context;
                        gpfVar2 = gpfVar;
                        i4 = i2;
                    }
                    return bw2Var;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        try {
                            if (i8 == 3) {
                                long j2 = ga3Var.J$0;
                                i6 = ga3Var.I$1;
                                i5 = ga3Var.I$0;
                                iy9VarE = (iy9) ga3Var.L$3;
                                d99Var3 = (d99) ga3Var.L$2;
                                Context context4 = (Context) ga3Var.L$0;
                                try {
                                    jzb.q(objP);
                                    context3 = context4;
                                    i4 = i6;
                                    d99Var2 = d99Var3;
                                    jIncrementAndGet = j2;
                                    zBooleanValue = ((Boolean) objP).booleanValue();
                                    if (!zBooleanValue) {
                                        ga3Var.L$0 = context3;
                                        ga3Var.L$1 = null;
                                        ga3Var.L$2 = d99Var2;
                                        ga3Var.L$3 = iy9VarE;
                                        ga3Var.I$0 = i5;
                                        ga3Var.I$1 = i4;
                                        ga3Var.J$0 = jIncrementAndGet;
                                        ga3Var.Z$0 = zBooleanValue;
                                        ga3Var.label = 4;
                                        if (l(context3, iy9VarE, ga3Var) != bw2Var) {
                                            z = zBooleanValue;
                                            d99Var3 = d99Var2;
                                            zBooleanValue = z;
                                            d99Var2 = d99Var3;
                                        }
                                        return bw2Var;
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                                    d99Var2.h(null);
                                    return boolValueOf;
                                } catch (CancellationException e) {
                                    context3 = context4;
                                    j = j2;
                                    cancellationException = e;
                                    d99Var2 = d99Var3;
                                    jIncrementAndGet = j;
                                    fg9Var = fg9.b;
                                    ha3Var = new ha3(context3, iy9VarE, null);
                                    ga3Var.L$0 = null;
                                    ga3Var.L$1 = null;
                                    ga3Var.L$2 = d99Var2;
                                    ga3Var.L$3 = null;
                                    ga3Var.L$4 = cancellationException;
                                    ga3Var.I$0 = i5;
                                    ga3Var.I$1 = i6;
                                    ga3Var.J$0 = jIncrementAndGet;
                                    ga3Var.label = 5;
                                    if (ynb.p0(fg9Var, ha3Var, ga3Var) != bw2Var) {
                                        throw cancellationException;
                                    }
                                }
                            } else {
                                if (i8 != 4) {
                                    if (i8 != 5) {
                                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    CancellationException cancellationException2 = (CancellationException) ga3Var.L$4;
                                    jzb.q(objP);
                                    throw cancellationException2;
                                }
                                z = ga3Var.Z$0;
                                long j3 = ga3Var.J$0;
                                int i9 = ga3Var.I$1;
                                i5 = ga3Var.I$0;
                                iy9VarE = (iy9) ga3Var.L$3;
                                d99Var3 = (d99) ga3Var.L$2;
                                Context context5 = (Context) ga3Var.L$0;
                                try {
                                    jzb.q(objP);
                                    zBooleanValue = z;
                                    d99Var2 = d99Var3;
                                    Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
                                    d99Var2.h(null);
                                    return boolValueOf2;
                                } catch (CancellationException e2) {
                                    cancellationException = e2;
                                    context3 = context5;
                                    j = j3;
                                    i6 = i9;
                                }
                            }
                            d99Var2 = d99Var3;
                            jIncrementAndGet = j;
                            return bw2Var;
                        } catch (Throwable th) {
                            th = th;
                            r3 = obj;
                        }
                        fg9Var = fg9.b;
                        ha3Var = new ha3(context3, iy9VarE, null);
                        ga3Var.L$0 = null;
                        ga3Var.L$1 = null;
                        ga3Var.L$2 = d99Var2;
                        ga3Var.L$3 = null;
                        ga3Var.L$4 = cancellationException;
                        ga3Var.I$0 = i5;
                        ga3Var.I$1 = i6;
                        ga3Var.J$0 = jIncrementAndGet;
                        ga3Var.label = 5;
                        if (ynb.p0(fg9Var, ha3Var, ga3Var) != bw2Var) {
                            throw cancellationException;
                        }
                    } else {
                        long j4 = ga3Var.J$0;
                        int i10 = ga3Var.I$1;
                        int i11 = ga3Var.I$0;
                        iy9 iy9Var = (iy9) ga3Var.L$3;
                        d99 d99Var4 = (d99) ga3Var.L$2;
                        gpfVar3 = (gpf) ga3Var.L$1;
                        context3 = (Context) ga3Var.L$0;
                        try {
                            jzb.q(objP);
                            i4 = i10;
                            i5 = i11;
                            iy9VarE = iy9Var;
                            d99Var2 = d99Var4;
                            jIncrementAndGet = j4;
                            try {
                                Boolean bool = Boolean.FALSE;
                                ga3Var.L$0 = context3;
                                ga3Var.L$1 = null;
                                ga3Var.L$2 = d99Var2;
                                ga3Var.L$3 = iy9VarE;
                                ga3Var.I$0 = i5;
                                ga3Var.I$1 = i4;
                                ga3Var.J$0 = jIncrementAndGet;
                                ga3Var.label = 3;
                                objP = p(gpfVar3, bool, null, ga3Var, 4);
                                if (objP == bw2Var) {
                                    zBooleanValue = ((Boolean) objP).booleanValue();
                                    if (!zBooleanValue) {
                                        ga3Var.L$0 = context3;
                                        ga3Var.L$1 = null;
                                        ga3Var.L$2 = d99Var2;
                                        ga3Var.L$3 = iy9VarE;
                                        ga3Var.I$0 = i5;
                                        ga3Var.I$1 = i4;
                                        ga3Var.J$0 = jIncrementAndGet;
                                        ga3Var.Z$0 = zBooleanValue;
                                        ga3Var.label = 4;
                                        if (l(context3, iy9VarE, ga3Var) != bw2Var) {
                                            z = zBooleanValue;
                                            d99Var3 = d99Var2;
                                            zBooleanValue = z;
                                            d99Var2 = d99Var3;
                                        }
                                    }
                                    Boolean boolValueOf3 = Boolean.valueOf(zBooleanValue);
                                    d99Var2.h(null);
                                    return boolValueOf3;
                                }
                            } catch (CancellationException e3) {
                                i6 = i4;
                                cancellationException = e3;
                                fg9Var = fg9.b;
                                ha3Var = new ha3(context3, iy9VarE, null);
                                ga3Var.L$0 = null;
                                ga3Var.L$1 = null;
                                ga3Var.L$2 = d99Var2;
                                ga3Var.L$3 = null;
                                ga3Var.L$4 = cancellationException;
                                ga3Var.I$0 = i5;
                                ga3Var.I$1 = i6;
                                ga3Var.J$0 = jIncrementAndGet;
                                ga3Var.label = 5;
                                if (ynb.p0(fg9Var, ha3Var, ga3Var) != bw2Var) {
                                    throw cancellationException;
                                }
                            }
                            return bw2Var;
                        } catch (Throwable th2) {
                            th = th2;
                            r3 = d99Var4;
                        }
                    }
                    r3.h(null);
                    throw th;
                }
                jIncrementAndGet = ga3Var.J$0;
                i4 = ga3Var.I$1;
                int i12 = ga3Var.I$0;
                d99Var = (d99) ga3Var.L$2;
                gpf gpfVar4 = (gpf) ga3Var.L$1;
                context2 = (Context) ga3Var.L$0;
                jzb.q(objP);
                gpfVar2 = gpfVar4;
                i3 = i12;
                if (jIncrementAndGet == r3.get()) {
                    y93 y93Var = y93.a;
                    iy9VarE = y93.e();
                    ga3Var.L$0 = context2;
                    ga3Var.L$1 = gpfVar2;
                    ga3Var.L$2 = d99Var;
                    ga3Var.L$3 = iy9VarE;
                    ga3Var.I$0 = i3;
                    ga3Var.I$1 = i4;
                    ga3Var.J$0 = jIncrementAndGet;
                    ga3Var.label = 2;
                    if (y93Var.l(context2, i3, i4, ga3Var) != bw2Var) {
                        d99Var2 = d99Var;
                        i5 = i3;
                        context3 = context2;
                        gpfVar3 = gpfVar2;
                        Boolean bool2 = Boolean.FALSE;
                        ga3Var.L$0 = context3;
                        ga3Var.L$1 = null;
                        ga3Var.L$2 = d99Var2;
                        ga3Var.L$3 = iy9VarE;
                        ga3Var.I$0 = i5;
                        ga3Var.I$1 = i4;
                        ga3Var.J$0 = jIncrementAndGet;
                        ga3Var.label = 3;
                        objP = p(gpfVar3, bool2, null, ga3Var, 4);
                        if (objP == bw2Var) {
                            zBooleanValue = ((Boolean) objP).booleanValue();
                            if (!zBooleanValue) {
                                ga3Var.L$0 = context3;
                                ga3Var.L$1 = null;
                                ga3Var.L$2 = d99Var2;
                                ga3Var.L$3 = iy9VarE;
                                ga3Var.I$0 = i5;
                                ga3Var.I$1 = i4;
                                ga3Var.J$0 = jIncrementAndGet;
                                ga3Var.Z$0 = zBooleanValue;
                                ga3Var.label = 4;
                                if (l(context3, iy9VarE, ga3Var) != bw2Var) {
                                    z = zBooleanValue;
                                    d99Var3 = d99Var2;
                                    zBooleanValue = z;
                                    d99Var2 = d99Var3;
                                }
                            }
                        }
                    }
                    return bw2Var;
                }
                zBooleanValue = false;
                d99Var2 = d99Var;
                Boolean boolValueOf4 = Boolean.valueOf(zBooleanValue);
                d99Var2.h(null);
                return boolValueOf4;
            } catch (Throwable th3) {
                th = th3;
                r3 = d99Var;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0181 A[Catch: all -> 0x017b, TryCatch #7 {all -> 0x017b, blocks: (B:57:0x016e, B:63:0x0181, B:66:0x0190, B:68:0x019c, B:71:0x01a6, B:73:0x01ae), top: B:120:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    /* JADX WARN: Code duplicated, block: B:68:0x019c A[Catch: all -> 0x017b, TryCatch #7 {all -> 0x017b, blocks: (B:57:0x016e, B:63:0x0181, B:66:0x0190, B:68:0x019c, B:71:0x01a6, B:73:0x01ae), top: B:120:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a6 A[Catch: all -> 0x017b, TryCatch #7 {all -> 0x017b, blocks: (B:57:0x016e, B:63:0x0181, B:66:0x0190, B:68:0x019c, B:71:0x01a6, B:73:0x01ae), top: B:120:0x016e }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:76:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:82:0x01df  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:86:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:90:0x0202  */
    /* JADX WARN: Code duplicated, block: B:93:0x020f A[Catch: all -> 0x006a, CancellationException -> 0x0231, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0231, blocks: (B:91:0x0207, B:93:0x020f), top: B:112:0x0207 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x022d  */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0261, code lost:
    
        if (defpackage.ynb.p0(r7, r8, r3) == r15) goto L108;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(android.content.Context r20, boolean r21, boolean r22, defpackage.gpf r23, defpackage.zn2 r24) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta3.i(android.content.Context, boolean, boolean, gpf, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0170  */
    /* JADX WARN: Code duplicated, block: B:63:0x0179 A[Catch: all -> 0x0057, CancellationException -> 0x0197, TRY_LEAVE, TryCatch #4 {all -> 0x0057, blocks: (B:18:0x0052, B:80:0x01ca, B:72:0x019d, B:77:0x01a9, B:61:0x0171, B:63:0x0179, B:54:0x014e, B:57:0x0157), top: B:87:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0192  */
    /* JADX WARN: Code duplicated, block: B:71:0x019c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ca A[Catch: all -> 0x0057, TRY_LEAVE, TryCatch #4 {all -> 0x0057, blocks: (B:18:0x0052, B:80:0x01ca, B:72:0x019d, B:77:0x01a9, B:61:0x0171, B:63:0x0179, B:54:0x014e, B:57:0x0157), top: B:87:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0157 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public final Object j(Context context, int i, int i2, gpf gpfVar, zn2 zn2Var) throws Throwable {
        ka3 ka3Var;
        long jIncrementAndGet;
        d99 d99Var;
        int i3;
        gpf gpfVar2;
        int i4;
        Context context2;
        iy9 iy9Var;
        int i5;
        d99 d99Var2;
        gpf gpfVar3;
        long j;
        boolean z;
        CancellationException cancellationException;
        iy9 iy9Var2;
        int i6;
        Context context3;
        boolean zBooleanValue;
        boolean z2;
        d99 d99Var3;
        fg9 fg9Var;
        la3 la3Var;
        ta3 ta3Var = a;
        if (zn2Var instanceof ka3) {
            ka3Var = (ka3) zn2Var;
            int i7 = ka3Var.label;
            if ((i7 & Integer.MIN_VALUE) != 0) {
                ka3Var.label = i7 - Integer.MIN_VALUE;
            } else {
                ka3Var = new ka3(this, zn2Var);
            }
        } else {
            ka3Var = new ka3(this, zn2Var);
        }
        Object objN = ka3Var.result;
        ?? r3 = ka3Var.label;
        AtomicLong atomicLong = d;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (r3 == 0) {
                    jzb.q(objN);
                    jIncrementAndGet = atomicLong.incrementAndGet();
                    ka3Var.L$0 = context;
                    ka3Var.L$1 = gpfVar;
                    d99Var = b;
                    ka3Var.L$2 = d99Var;
                    ka3Var.I$0 = i;
                    ka3Var.I$1 = i2;
                    ka3Var.J$0 = jIncrementAndGet;
                    ka3Var.label = 1;
                    if (d99Var.b(ka3Var) != bw2Var) {
                        i3 = i;
                        gpfVar2 = gpfVar;
                        i4 = i2;
                        context2 = context;
                    }
                    return bw2Var;
                }
                if (r3 != 1) {
                    if (r3 != 2) {
                        if (r3 == 3) {
                            long j2 = ka3Var.J$0;
                            i5 = ka3Var.I$1;
                            int i8 = ka3Var.I$0;
                            iy9 iy9Var3 = (iy9) ka3Var.L$3;
                            d99 d99Var4 = (d99) ka3Var.L$2;
                            Context context4 = (Context) ka3Var.L$0;
                            try {
                                jzb.q(objN);
                                context2 = context4;
                                j = j2;
                                d99Var2 = d99Var4;
                                i3 = i8;
                                iy9Var2 = iy9Var3;
                                try {
                                    zBooleanValue = ((Boolean) objN).booleanValue();
                                    if (zBooleanValue) {
                                        z = zBooleanValue;
                                    } else {
                                        ka3Var.L$0 = context2;
                                        ka3Var.L$1 = null;
                                        ka3Var.L$2 = d99Var2;
                                        ka3Var.L$3 = iy9Var2;
                                        ka3Var.I$0 = i3;
                                        ka3Var.I$1 = i5;
                                        ka3Var.J$0 = j;
                                        ka3Var.Z$0 = zBooleanValue;
                                        ka3Var.label = 4;
                                        if (ta3Var.m(context2, iy9Var2, ka3Var) != bw2Var) {
                                            z2 = zBooleanValue;
                                            d99Var3 = d99Var2;
                                            z = z2;
                                            d99Var2 = d99Var3;
                                        }
                                    }
                                    Boolean boolValueOf = Boolean.valueOf(z);
                                    d99Var2.h(null);
                                    return boolValueOf;
                                } catch (CancellationException e) {
                                    cancellationException = e;
                                    i6 = i3;
                                    context3 = context2;
                                    fg9Var = fg9.b;
                                    la3Var = new la3(context3, iy9Var2, null);
                                    ka3Var.L$0 = null;
                                    ka3Var.L$1 = null;
                                    ka3Var.L$2 = d99Var2;
                                    ka3Var.L$3 = null;
                                    ka3Var.L$4 = cancellationException;
                                    ka3Var.I$0 = i6;
                                    ka3Var.I$1 = i5;
                                    ka3Var.J$0 = j;
                                    ka3Var.label = 5;
                                    if (ynb.p0(fg9Var, la3Var, ka3Var) != bw2Var) {
                                        throw cancellationException;
                                    }
                                }
                            } catch (CancellationException e2) {
                                d99Var2 = d99Var4;
                                context3 = context4;
                                j = j2;
                                cancellationException = e2;
                                i6 = i8;
                                iy9Var2 = iy9Var3;
                                fg9Var = fg9.b;
                                la3Var = new la3(context3, iy9Var2, null);
                                ka3Var.L$0 = null;
                                ka3Var.L$1 = null;
                                ka3Var.L$2 = d99Var2;
                                ka3Var.L$3 = null;
                                ka3Var.L$4 = cancellationException;
                                ka3Var.I$0 = i6;
                                ka3Var.I$1 = i5;
                                ka3Var.J$0 = j;
                                ka3Var.label = 5;
                                if (ynb.p0(fg9Var, la3Var, ka3Var) != bw2Var) {
                                    throw cancellationException;
                                }
                            } catch (Throwable th) {
                                th = th;
                                r3 = d99Var4;
                            }
                        } else {
                            if (r3 != 4) {
                                if (r3 != 5) {
                                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                CancellationException cancellationException2 = (CancellationException) ka3Var.L$4;
                                jzb.q(objN);
                                throw cancellationException2;
                            }
                            z2 = ka3Var.Z$0;
                            long j3 = ka3Var.J$0;
                            i5 = ka3Var.I$1;
                            i6 = ka3Var.I$0;
                            iy9Var2 = (iy9) ka3Var.L$3;
                            d99Var3 = (d99) ka3Var.L$2;
                            context3 = (Context) ka3Var.L$0;
                            try {
                                jzb.q(objN);
                                z = z2;
                                d99Var2 = d99Var3;
                                Boolean boolValueOf2 = Boolean.valueOf(z);
                                d99Var2.h(null);
                                return boolValueOf2;
                            } catch (CancellationException e3) {
                                cancellationException = e3;
                                j = j3;
                                d99Var2 = d99Var3;
                                fg9Var = fg9.b;
                                la3Var = new la3(context3, iy9Var2, null);
                                ka3Var.L$0 = null;
                                ka3Var.L$1 = null;
                                ka3Var.L$2 = d99Var2;
                                ka3Var.L$3 = null;
                                ka3Var.L$4 = cancellationException;
                                ka3Var.I$0 = i6;
                                ka3Var.I$1 = i5;
                                ka3Var.J$0 = j;
                                ka3Var.label = 5;
                                if (ynb.p0(fg9Var, la3Var, ka3Var) != bw2Var) {
                                    throw cancellationException;
                                }
                                return bw2Var;
                            } catch (Throwable th2) {
                                th = th2;
                                r3 = d99Var3;
                            }
                        }
                        return bw2Var;
                    }
                    j = ka3Var.J$0;
                    int i9 = ka3Var.I$1;
                    int i10 = ka3Var.I$0;
                    iy9 iy9Var4 = (iy9) ka3Var.L$3;
                    d99 d99Var5 = (d99) ka3Var.L$2;
                    gpfVar3 = (gpf) ka3Var.L$1;
                    Context context5 = (Context) ka3Var.L$0;
                    try {
                        jzb.q(objN);
                        i5 = i9;
                        d99Var2 = d99Var5;
                        context2 = context5;
                        iy9Var = iy9Var4;
                        i3 = i10;
                        if (!((Boolean) objN).booleanValue()) {
                            try {
                                Boolean bool = Boolean.FALSE;
                                ka3Var.L$0 = context2;
                                ka3Var.L$1 = null;
                                ka3Var.L$2 = d99Var2;
                                ka3Var.L$3 = iy9Var;
                                ka3Var.I$0 = i3;
                                ka3Var.I$1 = i5;
                                ka3Var.J$0 = j;
                                ka3Var.label = 3;
                                objN = p(gpfVar3, null, bool, ka3Var, 2);
                                if (objN != bw2Var) {
                                    iy9Var2 = iy9Var;
                                    zBooleanValue = ((Boolean) objN).booleanValue();
                                    if (zBooleanValue) {
                                        ka3Var.L$0 = context2;
                                        ka3Var.L$1 = null;
                                        ka3Var.L$2 = d99Var2;
                                        ka3Var.L$3 = iy9Var2;
                                        ka3Var.I$0 = i3;
                                        ka3Var.I$1 = i5;
                                        ka3Var.J$0 = j;
                                        ka3Var.Z$0 = zBooleanValue;
                                        ka3Var.label = 4;
                                        if (ta3Var.m(context2, iy9Var2, ka3Var) != bw2Var) {
                                            z2 = zBooleanValue;
                                            d99Var3 = d99Var2;
                                            z = z2;
                                            d99Var2 = d99Var3;
                                        }
                                    } else {
                                        z = zBooleanValue;
                                    }
                                }
                            } catch (CancellationException e4) {
                                cancellationException = e4;
                                iy9Var2 = iy9Var;
                                i6 = i3;
                                context3 = context2;
                                fg9Var = fg9.b;
                                la3Var = new la3(context3, iy9Var2, null);
                                ka3Var.L$0 = null;
                                ka3Var.L$1 = null;
                                ka3Var.L$2 = d99Var2;
                                ka3Var.L$3 = null;
                                ka3Var.L$4 = cancellationException;
                                ka3Var.I$0 = i6;
                                ka3Var.I$1 = i5;
                                ka3Var.J$0 = j;
                                ka3Var.label = 5;
                                if (ynb.p0(fg9Var, la3Var, ka3Var) != bw2Var) {
                                    throw cancellationException;
                                }
                                return bw2Var;
                            }
                            return bw2Var;
                        }
                        z = false;
                        Boolean boolValueOf3 = Boolean.valueOf(z);
                        d99Var2.h(null);
                        return boolValueOf3;
                    } catch (Throwable th3) {
                        th = th3;
                        r3 = d99Var5;
                    }
                    r3.h(null);
                    throw th;
                }
                jIncrementAndGet = ka3Var.J$0;
                i4 = ka3Var.I$1;
                i3 = ka3Var.I$0;
                d99Var = (d99) ka3Var.L$2;
                gpfVar2 = (gpf) ka3Var.L$1;
                context2 = (Context) ka3Var.L$0;
                jzb.q(objN);
                if (jIncrementAndGet == atomicLong.get()) {
                    y93 y93Var = y93.a;
                    iy9 iy9VarH = y93.h();
                    ka3Var.L$0 = context2;
                    ka3Var.L$1 = gpfVar2;
                    ka3Var.L$2 = d99Var;
                    ka3Var.L$3 = iy9VarH;
                    ka3Var.I$0 = i3;
                    ka3Var.I$1 = i4;
                    ka3Var.J$0 = jIncrementAndGet;
                    ka3Var.label = 2;
                    objN = y93Var.n(context2, i3, i4, ka3Var);
                    if (objN != bw2Var) {
                        int i11 = i4;
                        iy9Var = iy9VarH;
                        i5 = i11;
                        long j4 = jIncrementAndGet;
                        d99Var2 = d99Var;
                        gpfVar3 = gpfVar2;
                        j = j4;
                        if (!((Boolean) objN).booleanValue()) {
                            Boolean bool2 = Boolean.FALSE;
                            ka3Var.L$0 = context2;
                            ka3Var.L$1 = null;
                            ka3Var.L$2 = d99Var2;
                            ka3Var.L$3 = iy9Var;
                            ka3Var.I$0 = i3;
                            ka3Var.I$1 = i5;
                            ka3Var.J$0 = j;
                            ka3Var.label = 3;
                            objN = p(gpfVar3, null, bool2, ka3Var, 2);
                            if (objN != bw2Var) {
                                iy9Var2 = iy9Var;
                                zBooleanValue = ((Boolean) objN).booleanValue();
                                if (zBooleanValue) {
                                    ka3Var.L$0 = context2;
                                    ka3Var.L$1 = null;
                                    ka3Var.L$2 = d99Var2;
                                    ka3Var.L$3 = iy9Var2;
                                    ka3Var.I$0 = i3;
                                    ka3Var.I$1 = i5;
                                    ka3Var.J$0 = j;
                                    ka3Var.Z$0 = zBooleanValue;
                                    ka3Var.label = 4;
                                    if (ta3Var.m(context2, iy9Var2, ka3Var) != bw2Var) {
                                        z2 = zBooleanValue;
                                        d99Var3 = d99Var2;
                                        z = z2;
                                        d99Var2 = d99Var3;
                                    }
                                } else {
                                    z = zBooleanValue;
                                }
                            }
                        }
                        Boolean boolValueOf4 = Boolean.valueOf(z);
                        d99Var2.h(null);
                        return boolValueOf4;
                    }
                    return bw2Var;
                }
                d99Var2 = d99Var;
                z = false;
                Boolean boolValueOf5 = Boolean.valueOf(z);
                d99Var2.h(null);
                return boolValueOf5;
            } catch (Throwable th4) {
                th = th4;
                r3 = d99Var;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(Context context, iy9 iy9Var, iy9 iy9Var2, zn2 zn2Var) {
        ma3 ma3Var;
        if (zn2Var instanceof ma3) {
            ma3Var = (ma3) zn2Var;
            int i = ma3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ma3Var.label = i - Integer.MIN_VALUE;
            } else {
                ma3Var = new ma3(this, zn2Var);
            }
        } else {
            ma3Var = new ma3(this, zn2Var);
        }
        Object obj = ma3Var.result;
        int i2 = ma3Var.label;
        Object obj2 = bw2.a;
        if (i2 == 0) {
            jzb.q(obj);
            ma3Var.L$0 = context;
            ma3Var.L$1 = null;
            ma3Var.L$2 = iy9Var2;
            ma3Var.label = 1;
            if (l(context, iy9Var, ma3Var) != obj2) {
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            return obj;
        }
        iy9Var2 = (iy9) ma3Var.L$2;
        context = (Context) ma3Var.L$0;
        jzb.q(obj);
        ma3Var.L$0 = null;
        ma3Var.L$1 = null;
        ma3Var.L$2 = null;
        ma3Var.label = 2;
        Object objM = m(context, iy9Var2, ma3Var);
        return objM == obj2 ? obj2 : objM;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0078, code lost:
    
        if (r4.n(r5, r2, r6, r0) == r7) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m(android.content.Context r5, defpackage.iy9 r6, defpackage.zn2 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.na3
            if (r0 == 0) goto L13
            r0 = r7
            na3 r0 = (defpackage.na3) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            na3 r0 = new na3
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.result
            int r7 = r0.label
            r1 = 2
            r2 = 1
            r3 = 0
            if (r7 == 0) goto L43
            if (r7 == r2) goto L37
            if (r7 != r1) goto L31
            java.lang.Object r5 = r0.L$1
            iy9 r5 = (defpackage.iy9) r5
            java.lang.Object r5 = r0.L$0
            android.content.Context r5 = (android.content.Context) r5
            defpackage.jzb.q(r4)
            goto L7b
        L31:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            return r3
        L37:
            java.lang.Object r5 = r0.L$1
            iy9 r5 = (defpackage.iy9) r5
            java.lang.Object r5 = r0.L$0
            android.content.Context r5 = (android.content.Context) r5
            defpackage.jzb.q(r4)
            return r4
        L43:
            defpackage.jzb.q(r4)
            y93 r4 = defpackage.y93.a
            bw2 r7 = defpackage.bw2.a
            if (r6 != 0) goto L5a
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r2
            java.lang.Object r4 = r4.c(r5, r0)
            if (r4 != r7) goto L59
            goto L7a
        L59:
            return r4
        L5a:
            java.lang.Object r2 = r6.d()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r6 = r6.e()
            java.lang.Number r6 = (java.lang.Number) r6
            int r6 = r6.intValue()
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r1
            java.lang.Object r4 = r4.n(r5, r2, r6, r0)
            if (r4 != r7) goto L7b
        L7a:
            return r7
        L7b:
            wef r4 = defpackage.wef.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta3.m(android.content.Context, iy9, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0135  */
    /* JADX WARN: Code duplicated, block: B:56:0x0150 A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #1 {all -> 0x00c1, blocks: (B:81:0x01e3, B:85:0x01f3, B:89:0x01fc, B:77:0x01ca, B:28:0x00bc, B:62:0x018c, B:64:0x0190, B:66:0x0196, B:68:0x019a, B:70:0x01a0, B:56:0x0150, B:57:0x015d, B:59:0x0161), top: B:102:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:57:0x015d A[Catch: all -> 0x00c1, TryCatch #1 {all -> 0x00c1, blocks: (B:81:0x01e3, B:85:0x01f3, B:89:0x01fc, B:77:0x01ca, B:28:0x00bc, B:62:0x018c, B:64:0x0190, B:66:0x0196, B:68:0x019a, B:70:0x01a0, B:56:0x0150, B:57:0x015d, B:59:0x0161), top: B:102:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:59:0x0161 A[Catch: all -> 0x00c1, TryCatch #1 {all -> 0x00c1, blocks: (B:81:0x01e3, B:85:0x01f3, B:89:0x01fc, B:77:0x01ca, B:28:0x00bc, B:62:0x018c, B:64:0x0190, B:66:0x0196, B:68:0x019a, B:70:0x01a0, B:56:0x0150, B:57:0x015d, B:59:0x0161), top: B:102:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:61:0x018a  */
    /* JADX WARN: Code duplicated, block: B:62:0x018c A[Catch: all -> 0x00c1, PHI: r2 r11 r12 r13
  0x018c: PHI (r2v19 yof) = (r2v13 yof), (r2v13 yof), (r2v28 yof) binds: [B:58:0x015f, B:60:0x0188, B:28:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x018c: PHI (r11v13 ??) = (r11v25 ??), (r11v26 ??), (r11v27 ??) binds: [B:58:0x015f, B:60:0x0188, B:28:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x018c: PHI (r12v18 o26) = (r12v11 o26), (r12v11 o26), (r12v21 o26) binds: [B:58:0x015f, B:60:0x0188, B:28:0x00bc] A[DONT_GENERATE, DONT_INLINE]
  0x018c: PHI (r13v10 android.content.Context) = (r13v8 android.content.Context), (r13v8 android.content.Context), (r13v15 android.content.Context) binds: [B:58:0x015f, B:60:0x0188, B:28:0x00bc] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00c1, blocks: (B:81:0x01e3, B:85:0x01f3, B:89:0x01fc, B:77:0x01ca, B:28:0x00bc, B:62:0x018c, B:64:0x0190, B:66:0x0196, B:68:0x019a, B:70:0x01a0, B:56:0x0150, B:57:0x015d, B:59:0x0161), top: B:102:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:64:0x0190 A[Catch: all -> 0x00c1, TryCatch #1 {all -> 0x00c1, blocks: (B:81:0x01e3, B:85:0x01f3, B:89:0x01fc, B:77:0x01ca, B:28:0x00bc, B:62:0x018c, B:64:0x0190, B:66:0x0196, B:68:0x019a, B:70:0x01a0, B:56:0x0150, B:57:0x015d, B:59:0x0161), top: B:102:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0195  */
    /* JADX WARN: Code duplicated, block: B:68:0x019a A[Catch: all -> 0x00c1, TryCatch #1 {all -> 0x00c1, blocks: (B:81:0x01e3, B:85:0x01f3, B:89:0x01fc, B:77:0x01ca, B:28:0x00bc, B:62:0x018c, B:64:0x0190, B:66:0x0196, B:68:0x019a, B:70:0x01a0, B:56:0x0150, B:57:0x015d, B:59:0x0161), top: B:102:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:69:0x019f  */
    /* JADX WARN: Code duplicated, block: B:72:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x01be  */
    /* JADX WARN: Code duplicated, block: B:75:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:76:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Code duplicated, block: B:80:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:92:0x0218  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00c2: MOVE (r2 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:195), block:B:31:0x00c2 */
    /* JADX WARN: Type inference failed for: r0v24, types: [int] */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v19, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v26 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v18, types: [d99] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v29, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32, types: [int] */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [d99] */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v4, types: [d99] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v51 */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int] */
    /* JADX WARN: Type inference failed for: r6v5 */
    public final Object n(Context context, gpf gpfVar, o26 o26Var, zn2 zn2Var) throws Throwable {
        oa3 oa3Var;
        Object obj;
        o26 o26Var2;
        gpf gpfVar2;
        Context context2;
        Context context3;
        Context context4;
        o26 o26Var3;
        ?? r11;
        yof yofVar;
        Boolean bool;
        Boolean boolValueOf;
        isa isaVar;
        ?? r2;
        boolean z;
        ?? r12;
        Boolean bool2;
        boolean zBooleanValue;
        Boolean bool3;
        ?? BooleanValue;
        yof yofVar2;
        ?? r3;
        Context context5;
        o26 o26Var4;
        ?? r13;
        ?? r0;
        boolean z2;
        ?? r6;
        ?? r14;
        ?? r4;
        Boolean bool4;
        boolean z3;
        Boolean boolValueOf2;
        boolean z4;
        Boolean boolValueOf3;
        ?? r5;
        if (zn2Var instanceof oa3) {
            oa3Var = (oa3) zn2Var;
            int i = oa3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                oa3Var.label = i - Integer.MIN_VALUE;
            } else {
                oa3Var = new oa3(this, zn2Var);
            }
        } else {
            oa3Var = new oa3(this, zn2Var);
        }
        Object objP0 = oa3Var.result;
        ?? r7 = oa3Var.label;
        ya3 ya3Var = ya3.Tomorrow;
        ya3 ya3Var2 = ya3.Today;
        y93 y93Var = y93.a;
        ta3 ta3Var = a;
        bw2 bw2Var = bw2.a;
        try {
            try {
                try {
                    switch (r7) {
                        case 0:
                            jzb.q(objP0);
                            oa3Var.L$0 = context;
                            oa3Var.L$1 = gpfVar;
                            o26Var2 = o26Var;
                            oa3Var.L$2 = o26Var2;
                            f99 f99Var = b;
                            oa3Var.L$3 = f99Var;
                            oa3Var.label = 1;
                            if (f99Var.b(oa3Var) != bw2Var) {
                                gpfVar2 = gpfVar;
                                r7 = f99Var;
                                context2 = context;
                                try {
                                    oa3Var.L$0 = context2;
                                    oa3Var.L$1 = null;
                                    oa3Var.L$2 = o26Var2;
                                    oa3Var.L$3 = r7;
                                    oa3Var.label = 2;
                                    npf npfVar = (npf) gpfVar2;
                                    npfVar.getClass();
                                    js3 js3Var = ga4.a;
                                    objP0 = ynb.p0(hr3.c, new jpf(npfVar, null), oa3Var);
                                    if (objP0 != bw2Var) {
                                        context3 = context2;
                                        r7 = r7;
                                        context4 = context3;
                                        o26Var3 = o26Var2;
                                        r11 = r7;
                                        yofVar = (yof) objP0;
                                        if (yofVar != null) {
                                            context4.getClass();
                                            y93Var.i(context4, ya3Var2);
                                            y93Var.i(context4, ya3Var);
                                            r2 = r11;
                                            z = false;
                                        } else {
                                            bool = yofVar.j;
                                            if (bool != null) {
                                                boolean zBooleanValue2 = bool.booleanValue();
                                                hs3 hs3Var = xqa.W0;
                                                boolValueOf = Boolean.valueOf(!zBooleanValue2);
                                                isaVar = hs3Var.a;
                                                oa3Var.L$0 = context4;
                                                oa3Var.L$1 = null;
                                                oa3Var.L$2 = o26Var3;
                                                oa3Var.L$3 = r11;
                                                oa3Var.L$4 = yofVar;
                                                oa3Var.L$5 = null;
                                                oa3Var.L$6 = null;
                                                oa3Var.L$7 = null;
                                                oa3Var.Z$0 = zBooleanValue2;
                                                oa3Var.label = 3;
                                                if (bsa.n(isaVar, boolValueOf, oa3Var) == bw2Var) {
                                                    r12 = r11;
                                                    r12 = r11;
                                                } else {
                                                    r12 = r11;
                                                    r12 = r11;
                                                    r12 = r11;
                                                    bool2 = yofVar.k;
                                                    if (bool2 != null) {
                                                        zBooleanValue = bool2.booleanValue();
                                                    } else {
                                                        zBooleanValue = false;
                                                    }
                                                    bool3 = yofVar.l;
                                                    if (bool3 != null) {
                                                        BooleanValue = bool3.booleanValue();
                                                    } else {
                                                        BooleanValue = 1;
                                                    }
                                                    oa3Var.L$0 = context4;
                                                    oa3Var.L$1 = null;
                                                    oa3Var.L$2 = o26Var3;
                                                    oa3Var.L$3 = r12;
                                                    oa3Var.L$4 = yofVar;
                                                    oa3Var.L$5 = null;
                                                    oa3Var.L$6 = null;
                                                    oa3Var.L$7 = null;
                                                    oa3Var.I$0 = zBooleanValue ? 1 : 0;
                                                    oa3Var.I$1 = BooleanValue;
                                                    oa3Var.label = 4;
                                                    if (b(context4, zBooleanValue, oa3Var) != bw2Var) {
                                                        o26 o26Var5 = o26Var3;
                                                        yofVar2 = yofVar;
                                                        r3 = BooleanValue;
                                                        context5 = context4;
                                                        o26Var4 = o26Var5;
                                                        if (r3 != 0) {
                                                            r0 = zBooleanValue;
                                                            r13 = r12;
                                                            z2 = true;
                                                        } else {
                                                            r0 = zBooleanValue;
                                                            r13 = r12;
                                                            z2 = false;
                                                        }
                                                        oa3Var.L$0 = context5;
                                                        oa3Var.L$1 = null;
                                                        oa3Var.L$2 = o26Var4;
                                                        oa3Var.L$3 = r13;
                                                        oa3Var.L$4 = yofVar2;
                                                        oa3Var.I$0 = r0;
                                                        oa3Var.I$1 = r3;
                                                        oa3Var.label = 5;
                                                        if (ta3Var.e(context5, z2, oa3Var) == bw2Var) {
                                                            r6 = r0;
                                                            r4 = r3;
                                                            r14 = r13;
                                                            context5.getClass();
                                                            y93Var.i(context5, ya3Var2);
                                                            y93Var.i(context5, ya3Var);
                                                            bool4 = yofVar2.j;
                                                            if (r6 != 0) {
                                                                z3 = true;
                                                            } else {
                                                                z3 = false;
                                                            }
                                                            boolValueOf2 = Boolean.valueOf(z3);
                                                            if (r4 != 0) {
                                                                z4 = true;
                                                            } else {
                                                                z4 = false;
                                                            }
                                                            boolValueOf3 = Boolean.valueOf(z4);
                                                            oa3Var.L$0 = null;
                                                            oa3Var.L$1 = null;
                                                            oa3Var.L$2 = null;
                                                            oa3Var.L$3 = r14;
                                                            oa3Var.L$4 = null;
                                                            oa3Var.I$0 = r6;
                                                            oa3Var.I$1 = r4;
                                                            oa3Var.label = 6;
                                                            if (o26Var4.t(bool4, boolValueOf2, boolValueOf3, oa3Var) != bw2Var) {
                                                                r5 = r14;
                                                                z = true;
                                                                r2 = r5;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                r12 = r11;
                                                r12 = r11;
                                                r12 = r11;
                                                bool2 = yofVar.k;
                                                if (bool2 != null) {
                                                    zBooleanValue = bool2.booleanValue();
                                                } else {
                                                    zBooleanValue = false;
                                                }
                                                bool3 = yofVar.l;
                                                if (bool3 != null) {
                                                    BooleanValue = bool3.booleanValue();
                                                } else {
                                                    BooleanValue = 1;
                                                }
                                                oa3Var.L$0 = context4;
                                                oa3Var.L$1 = null;
                                                oa3Var.L$2 = o26Var3;
                                                oa3Var.L$3 = r12;
                                                oa3Var.L$4 = yofVar;
                                                oa3Var.L$5 = null;
                                                oa3Var.L$6 = null;
                                                oa3Var.L$7 = null;
                                                oa3Var.I$0 = zBooleanValue ? 1 : 0;
                                                oa3Var.I$1 = BooleanValue;
                                                oa3Var.label = 4;
                                                if (b(context4, zBooleanValue, oa3Var) != bw2Var) {
                                                    o26 o26Var6 = o26Var3;
                                                    yofVar2 = yofVar;
                                                    r3 = BooleanValue;
                                                    context5 = context4;
                                                    o26Var4 = o26Var6;
                                                    if (r3 != 0) {
                                                        r0 = zBooleanValue;
                                                        r13 = r12;
                                                        z2 = true;
                                                    } else {
                                                        r0 = zBooleanValue;
                                                        r13 = r12;
                                                        z2 = false;
                                                    }
                                                    oa3Var.L$0 = context5;
                                                    oa3Var.L$1 = null;
                                                    oa3Var.L$2 = o26Var4;
                                                    oa3Var.L$3 = r13;
                                                    oa3Var.L$4 = yofVar2;
                                                    oa3Var.I$0 = r0;
                                                    oa3Var.I$1 = r3;
                                                    oa3Var.label = 5;
                                                    if (ta3Var.e(context5, z2, oa3Var) == bw2Var) {
                                                        r6 = r0;
                                                        r4 = r3;
                                                        r14 = r13;
                                                        context5.getClass();
                                                        y93Var.i(context5, ya3Var2);
                                                        y93Var.i(context5, ya3Var);
                                                        bool4 = yofVar2.j;
                                                        if (r6 != 0) {
                                                            z3 = true;
                                                        } else {
                                                            z3 = false;
                                                        }
                                                        boolValueOf2 = Boolean.valueOf(z3);
                                                        if (r4 != 0) {
                                                            z4 = true;
                                                        } else {
                                                            z4 = false;
                                                        }
                                                        boolValueOf3 = Boolean.valueOf(z4);
                                                        oa3Var.L$0 = null;
                                                        oa3Var.L$1 = null;
                                                        oa3Var.L$2 = null;
                                                        oa3Var.L$3 = r14;
                                                        oa3Var.L$4 = null;
                                                        oa3Var.I$0 = r6;
                                                        oa3Var.I$1 = r4;
                                                        oa3Var.label = 6;
                                                        if (o26Var4.t(bool4, boolValueOf2, boolValueOf3, oa3Var) != bw2Var) {
                                                            r5 = r14;
                                                            z = true;
                                                            r2 = r5;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        Boolean boolValueOf4 = Boolean.valueOf(z);
                                        r2.h(null);
                                        return boolValueOf4;
                                    }
                                } catch (Exception e) {
                                    e = e;
                                    context3 = context2;
                                    ta3Var.d().c("Failed to fetch user profile for notification opt-out sync", e);
                                    context4 = context3;
                                    o26Var3 = o26Var2;
                                    r11 = r7;
                                    yofVar = null;
                                }
                            }
                            return bw2Var;
                        case 1:
                            d99 d99Var = (d99) oa3Var.L$3;
                            o26Var2 = (o26) oa3Var.L$2;
                            gpfVar2 = (gpf) oa3Var.L$1;
                            context2 = (Context) oa3Var.L$0;
                            jzb.q(objP0);
                            r7 = d99Var;
                            oa3Var.L$0 = context2;
                            oa3Var.L$1 = null;
                            oa3Var.L$2 = o26Var2;
                            oa3Var.L$3 = r7;
                            oa3Var.label = 2;
                            npf npfVar2 = (npf) gpfVar2;
                            npfVar2.getClass();
                            js3 js3Var2 = ga4.a;
                            objP0 = ynb.p0(hr3.c, new jpf(npfVar2, null), oa3Var);
                            if (objP0 != bw2Var) {
                                context3 = context2;
                                r7 = r7;
                                context4 = context3;
                                o26Var3 = o26Var2;
                                r11 = r7;
                                yofVar = (yof) objP0;
                                if (yofVar != null) {
                                    context4.getClass();
                                    y93Var.i(context4, ya3Var2);
                                    y93Var.i(context4, ya3Var);
                                    r2 = r11;
                                    z = false;
                                } else {
                                    bool = yofVar.j;
                                    if (bool != null) {
                                        boolean zBooleanValue3 = bool.booleanValue();
                                        hs3 hs3Var2 = xqa.W0;
                                        boolValueOf = Boolean.valueOf(!zBooleanValue3);
                                        isaVar = hs3Var2.a;
                                        oa3Var.L$0 = context4;
                                        oa3Var.L$1 = null;
                                        oa3Var.L$2 = o26Var3;
                                        oa3Var.L$3 = r11;
                                        oa3Var.L$4 = yofVar;
                                        oa3Var.L$5 = null;
                                        oa3Var.L$6 = null;
                                        oa3Var.L$7 = null;
                                        oa3Var.Z$0 = zBooleanValue3;
                                        oa3Var.label = 3;
                                        if (bsa.n(isaVar, boolValueOf, oa3Var) == bw2Var) {
                                            r12 = r11;
                                            r12 = r11;
                                        } else {
                                            r12 = r11;
                                            r12 = r11;
                                            r12 = r11;
                                            bool2 = yofVar.k;
                                            if (bool2 != null) {
                                                zBooleanValue = bool2.booleanValue();
                                            } else {
                                                zBooleanValue = false;
                                            }
                                            bool3 = yofVar.l;
                                            if (bool3 != null) {
                                                BooleanValue = bool3.booleanValue();
                                            } else {
                                                BooleanValue = 1;
                                            }
                                            oa3Var.L$0 = context4;
                                            oa3Var.L$1 = null;
                                            oa3Var.L$2 = o26Var3;
                                            oa3Var.L$3 = r12;
                                            oa3Var.L$4 = yofVar;
                                            oa3Var.L$5 = null;
                                            oa3Var.L$6 = null;
                                            oa3Var.L$7 = null;
                                            oa3Var.I$0 = zBooleanValue ? 1 : 0;
                                            oa3Var.I$1 = BooleanValue;
                                            oa3Var.label = 4;
                                            if (b(context4, zBooleanValue, oa3Var) != bw2Var) {
                                                o26 o26Var7 = o26Var3;
                                                yofVar2 = yofVar;
                                                r3 = BooleanValue;
                                                context5 = context4;
                                                o26Var4 = o26Var7;
                                                if (r3 != 0) {
                                                    r0 = zBooleanValue;
                                                    r13 = r12;
                                                    z2 = true;
                                                } else {
                                                    r0 = zBooleanValue;
                                                    r13 = r12;
                                                    z2 = false;
                                                }
                                                oa3Var.L$0 = context5;
                                                oa3Var.L$1 = null;
                                                oa3Var.L$2 = o26Var4;
                                                oa3Var.L$3 = r13;
                                                oa3Var.L$4 = yofVar2;
                                                oa3Var.I$0 = r0;
                                                oa3Var.I$1 = r3;
                                                oa3Var.label = 5;
                                                if (ta3Var.e(context5, z2, oa3Var) == bw2Var) {
                                                    r6 = r0;
                                                    r4 = r3;
                                                    r14 = r13;
                                                    context5.getClass();
                                                    y93Var.i(context5, ya3Var2);
                                                    y93Var.i(context5, ya3Var);
                                                    bool4 = yofVar2.j;
                                                    if (r6 != 0) {
                                                        z3 = true;
                                                    } else {
                                                        z3 = false;
                                                    }
                                                    boolValueOf2 = Boolean.valueOf(z3);
                                                    if (r4 != 0) {
                                                        z4 = true;
                                                    } else {
                                                        z4 = false;
                                                    }
                                                    boolValueOf3 = Boolean.valueOf(z4);
                                                    oa3Var.L$0 = null;
                                                    oa3Var.L$1 = null;
                                                    oa3Var.L$2 = null;
                                                    oa3Var.L$3 = r14;
                                                    oa3Var.L$4 = null;
                                                    oa3Var.I$0 = r6;
                                                    oa3Var.I$1 = r4;
                                                    oa3Var.label = 6;
                                                    if (o26Var4.t(bool4, boolValueOf2, boolValueOf3, oa3Var) != bw2Var) {
                                                        r5 = r14;
                                                        z = true;
                                                        r2 = r5;
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        r12 = r11;
                                        r12 = r11;
                                        r12 = r11;
                                        bool2 = yofVar.k;
                                        if (bool2 != null) {
                                            zBooleanValue = bool2.booleanValue();
                                        } else {
                                            zBooleanValue = false;
                                        }
                                        bool3 = yofVar.l;
                                        if (bool3 != null) {
                                            BooleanValue = bool3.booleanValue();
                                        } else {
                                            BooleanValue = 1;
                                        }
                                        oa3Var.L$0 = context4;
                                        oa3Var.L$1 = null;
                                        oa3Var.L$2 = o26Var3;
                                        oa3Var.L$3 = r12;
                                        oa3Var.L$4 = yofVar;
                                        oa3Var.L$5 = null;
                                        oa3Var.L$6 = null;
                                        oa3Var.L$7 = null;
                                        oa3Var.I$0 = zBooleanValue ? 1 : 0;
                                        oa3Var.I$1 = BooleanValue;
                                        oa3Var.label = 4;
                                        if (b(context4, zBooleanValue, oa3Var) != bw2Var) {
                                            o26 o26Var8 = o26Var3;
                                            yofVar2 = yofVar;
                                            r3 = BooleanValue;
                                            context5 = context4;
                                            o26Var4 = o26Var8;
                                            if (r3 != 0) {
                                                r0 = zBooleanValue;
                                                r13 = r12;
                                                z2 = true;
                                            } else {
                                                r0 = zBooleanValue;
                                                r13 = r12;
                                                z2 = false;
                                            }
                                            oa3Var.L$0 = context5;
                                            oa3Var.L$1 = null;
                                            oa3Var.L$2 = o26Var4;
                                            oa3Var.L$3 = r13;
                                            oa3Var.L$4 = yofVar2;
                                            oa3Var.I$0 = r0;
                                            oa3Var.I$1 = r3;
                                            oa3Var.label = 5;
                                            if (ta3Var.e(context5, z2, oa3Var) == bw2Var) {
                                                r6 = r0;
                                                r4 = r3;
                                                r14 = r13;
                                                context5.getClass();
                                                y93Var.i(context5, ya3Var2);
                                                y93Var.i(context5, ya3Var);
                                                bool4 = yofVar2.j;
                                                if (r6 != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                boolValueOf2 = Boolean.valueOf(z3);
                                                if (r4 != 0) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                boolValueOf3 = Boolean.valueOf(z4);
                                                oa3Var.L$0 = null;
                                                oa3Var.L$1 = null;
                                                oa3Var.L$2 = null;
                                                oa3Var.L$3 = r14;
                                                oa3Var.L$4 = null;
                                                oa3Var.I$0 = r6;
                                                oa3Var.I$1 = r4;
                                                oa3Var.label = 6;
                                                if (o26Var4.t(bool4, boolValueOf2, boolValueOf3, oa3Var) != bw2Var) {
                                                    r5 = r14;
                                                    z = true;
                                                    r2 = r5;
                                                }
                                            }
                                        }
                                    }
                                }
                                Boolean boolValueOf5 = Boolean.valueOf(z);
                                r2.h(null);
                                return boolValueOf5;
                            }
                            return bw2Var;
                        case 2:
                            r7 = (d99) oa3Var.L$3;
                            o26Var2 = (o26) oa3Var.L$2;
                            context3 = (Context) oa3Var.L$0;
                            try {
                                jzb.q(objP0);
                                r7 = r7;
                                context4 = context3;
                                o26Var3 = o26Var2;
                                r11 = r7;
                                yofVar = (yof) objP0;
                            } catch (Exception e2) {
                                e = e2;
                                ta3Var.d().c("Failed to fetch user profile for notification opt-out sync", e);
                                context4 = context3;
                                o26Var3 = o26Var2;
                                r11 = r7;
                                yofVar = null;
                            }
                            if (yofVar != null) {
                                bool = yofVar.j;
                                if (bool != null) {
                                    boolean zBooleanValue4 = bool.booleanValue();
                                    hs3 hs3Var3 = xqa.W0;
                                    boolValueOf = Boolean.valueOf(!zBooleanValue4);
                                    isaVar = hs3Var3.a;
                                    oa3Var.L$0 = context4;
                                    oa3Var.L$1 = null;
                                    oa3Var.L$2 = o26Var3;
                                    oa3Var.L$3 = r11;
                                    oa3Var.L$4 = yofVar;
                                    oa3Var.L$5 = null;
                                    oa3Var.L$6 = null;
                                    oa3Var.L$7 = null;
                                    oa3Var.Z$0 = zBooleanValue4;
                                    oa3Var.label = 3;
                                    if (bsa.n(isaVar, boolValueOf, oa3Var) == bw2Var) {
                                        r12 = r11;
                                        r12 = r11;
                                    } else {
                                        r12 = r11;
                                        r12 = r11;
                                        r12 = r11;
                                        bool2 = yofVar.k;
                                        if (bool2 != null) {
                                            zBooleanValue = bool2.booleanValue();
                                        } else {
                                            zBooleanValue = false;
                                        }
                                        bool3 = yofVar.l;
                                        if (bool3 != null) {
                                            BooleanValue = bool3.booleanValue();
                                        } else {
                                            BooleanValue = 1;
                                        }
                                        oa3Var.L$0 = context4;
                                        oa3Var.L$1 = null;
                                        oa3Var.L$2 = o26Var3;
                                        oa3Var.L$3 = r12;
                                        oa3Var.L$4 = yofVar;
                                        oa3Var.L$5 = null;
                                        oa3Var.L$6 = null;
                                        oa3Var.L$7 = null;
                                        oa3Var.I$0 = zBooleanValue ? 1 : 0;
                                        oa3Var.I$1 = BooleanValue;
                                        oa3Var.label = 4;
                                        if (b(context4, zBooleanValue, oa3Var) != bw2Var) {
                                            o26 o26Var9 = o26Var3;
                                            yofVar2 = yofVar;
                                            r3 = BooleanValue;
                                            context5 = context4;
                                            o26Var4 = o26Var9;
                                            if (r3 != 0) {
                                                r0 = zBooleanValue;
                                                r13 = r12;
                                                z2 = true;
                                            } else {
                                                r0 = zBooleanValue;
                                                r13 = r12;
                                                z2 = false;
                                            }
                                            oa3Var.L$0 = context5;
                                            oa3Var.L$1 = null;
                                            oa3Var.L$2 = o26Var4;
                                            oa3Var.L$3 = r13;
                                            oa3Var.L$4 = yofVar2;
                                            oa3Var.I$0 = r0;
                                            oa3Var.I$1 = r3;
                                            oa3Var.label = 5;
                                            if (ta3Var.e(context5, z2, oa3Var) == bw2Var) {
                                                r6 = r0;
                                                r4 = r3;
                                                r14 = r13;
                                                context5.getClass();
                                                y93Var.i(context5, ya3Var2);
                                                y93Var.i(context5, ya3Var);
                                                bool4 = yofVar2.j;
                                                if (r6 != 0) {
                                                    z3 = true;
                                                } else {
                                                    z3 = false;
                                                }
                                                boolValueOf2 = Boolean.valueOf(z3);
                                                if (r4 != 0) {
                                                    z4 = true;
                                                } else {
                                                    z4 = false;
                                                }
                                                boolValueOf3 = Boolean.valueOf(z4);
                                                oa3Var.L$0 = null;
                                                oa3Var.L$1 = null;
                                                oa3Var.L$2 = null;
                                                oa3Var.L$3 = r14;
                                                oa3Var.L$4 = null;
                                                oa3Var.I$0 = r6;
                                                oa3Var.I$1 = r4;
                                                oa3Var.label = 6;
                                                if (o26Var4.t(bool4, boolValueOf2, boolValueOf3, oa3Var) != bw2Var) {
                                                    r5 = r14;
                                                    z = true;
                                                    r2 = r5;
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    r12 = r11;
                                    r12 = r11;
                                    r12 = r11;
                                    bool2 = yofVar.k;
                                    if (bool2 != null) {
                                        zBooleanValue = bool2.booleanValue();
                                    } else {
                                        zBooleanValue = false;
                                    }
                                    bool3 = yofVar.l;
                                    if (bool3 != null) {
                                        BooleanValue = bool3.booleanValue();
                                    } else {
                                        BooleanValue = 1;
                                    }
                                    oa3Var.L$0 = context4;
                                    oa3Var.L$1 = null;
                                    oa3Var.L$2 = o26Var3;
                                    oa3Var.L$3 = r12;
                                    oa3Var.L$4 = yofVar;
                                    oa3Var.L$5 = null;
                                    oa3Var.L$6 = null;
                                    oa3Var.L$7 = null;
                                    oa3Var.I$0 = zBooleanValue ? 1 : 0;
                                    oa3Var.I$1 = BooleanValue;
                                    oa3Var.label = 4;
                                    if (b(context4, zBooleanValue, oa3Var) != bw2Var) {
                                        o26 o26Var10 = o26Var3;
                                        yofVar2 = yofVar;
                                        r3 = BooleanValue;
                                        context5 = context4;
                                        o26Var4 = o26Var10;
                                        if (r3 != 0) {
                                            r0 = zBooleanValue;
                                            r13 = r12;
                                            z2 = true;
                                        } else {
                                            r0 = zBooleanValue;
                                            r13 = r12;
                                            z2 = false;
                                        }
                                        oa3Var.L$0 = context5;
                                        oa3Var.L$1 = null;
                                        oa3Var.L$2 = o26Var4;
                                        oa3Var.L$3 = r13;
                                        oa3Var.L$4 = yofVar2;
                                        oa3Var.I$0 = r0;
                                        oa3Var.I$1 = r3;
                                        oa3Var.label = 5;
                                        if (ta3Var.e(context5, z2, oa3Var) == bw2Var) {
                                            r6 = r0;
                                            r4 = r3;
                                            r14 = r13;
                                            context5.getClass();
                                            y93Var.i(context5, ya3Var2);
                                            y93Var.i(context5, ya3Var);
                                            bool4 = yofVar2.j;
                                            if (r6 != 0) {
                                                z3 = true;
                                            } else {
                                                z3 = false;
                                            }
                                            boolValueOf2 = Boolean.valueOf(z3);
                                            if (r4 != 0) {
                                                z4 = true;
                                            } else {
                                                z4 = false;
                                            }
                                            boolValueOf3 = Boolean.valueOf(z4);
                                            oa3Var.L$0 = null;
                                            oa3Var.L$1 = null;
                                            oa3Var.L$2 = null;
                                            oa3Var.L$3 = r14;
                                            oa3Var.L$4 = null;
                                            oa3Var.I$0 = r6;
                                            oa3Var.I$1 = r4;
                                            oa3Var.label = 6;
                                            if (o26Var4.t(bool4, boolValueOf2, boolValueOf3, oa3Var) != bw2Var) {
                                                r5 = r14;
                                                z = true;
                                                r2 = r5;
                                            }
                                        }
                                    }
                                }
                                return bw2Var;
                            }
                            context4.getClass();
                            y93Var.i(context4, ya3Var2);
                            y93Var.i(context4, ya3Var);
                            r2 = r11;
                            z = false;
                            Boolean boolValueOf6 = Boolean.valueOf(z);
                            r2.h(null);
                            return boolValueOf6;
                        case 3:
                            yofVar = (yof) oa3Var.L$4;
                            d99 d99Var2 = (d99) oa3Var.L$3;
                            o26Var3 = (o26) oa3Var.L$2;
                            context4 = (Context) oa3Var.L$0;
                            jzb.q(objP0);
                            r12 = d99Var2;
                            r12 = r11;
                            r12 = r11;
                            r12 = r11;
                            bool2 = yofVar.k;
                            if (bool2 != null) {
                                zBooleanValue = bool2.booleanValue();
                            } else {
                                zBooleanValue = false;
                            }
                            bool3 = yofVar.l;
                            if (bool3 != null) {
                                BooleanValue = bool3.booleanValue();
                            } else {
                                BooleanValue = 1;
                            }
                            oa3Var.L$0 = context4;
                            oa3Var.L$1 = null;
                            oa3Var.L$2 = o26Var3;
                            oa3Var.L$3 = r12;
                            oa3Var.L$4 = yofVar;
                            oa3Var.L$5 = null;
                            oa3Var.L$6 = null;
                            oa3Var.L$7 = null;
                            oa3Var.I$0 = zBooleanValue ? 1 : 0;
                            oa3Var.I$1 = BooleanValue;
                            oa3Var.label = 4;
                            if (b(context4, zBooleanValue, oa3Var) != bw2Var) {
                                o26 o26Var11 = o26Var3;
                                yofVar2 = yofVar;
                                r3 = BooleanValue;
                                context5 = context4;
                                o26Var4 = o26Var11;
                                if (r3 != 0) {
                                    r0 = zBooleanValue;
                                    r13 = r12;
                                    z2 = true;
                                } else {
                                    r0 = zBooleanValue;
                                    r13 = r12;
                                    z2 = false;
                                }
                                oa3Var.L$0 = context5;
                                oa3Var.L$1 = null;
                                oa3Var.L$2 = o26Var4;
                                oa3Var.L$3 = r13;
                                oa3Var.L$4 = yofVar2;
                                oa3Var.I$0 = r0;
                                oa3Var.I$1 = r3;
                                oa3Var.label = 5;
                                if (ta3Var.e(context5, z2, oa3Var) == bw2Var) {
                                    r6 = r0;
                                    r4 = r3;
                                    r14 = r13;
                                    context5.getClass();
                                    y93Var.i(context5, ya3Var2);
                                    y93Var.i(context5, ya3Var);
                                    bool4 = yofVar2.j;
                                    if (r6 != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    boolValueOf2 = Boolean.valueOf(z3);
                                    if (r4 != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    boolValueOf3 = Boolean.valueOf(z4);
                                    oa3Var.L$0 = null;
                                    oa3Var.L$1 = null;
                                    oa3Var.L$2 = null;
                                    oa3Var.L$3 = r14;
                                    oa3Var.L$4 = null;
                                    oa3Var.I$0 = r6;
                                    oa3Var.I$1 = r4;
                                    oa3Var.label = 6;
                                    if (o26Var4.t(bool4, boolValueOf2, boolValueOf3, oa3Var) != bw2Var) {
                                        r5 = r14;
                                        z = true;
                                        r2 = r5;
                                        Boolean boolValueOf7 = Boolean.valueOf(z);
                                        r2.h(null);
                                        return boolValueOf7;
                                    }
                                }
                            }
                            return bw2Var;
                        case 4:
                            int i2 = oa3Var.I$1;
                            int i3 = oa3Var.I$0;
                            yofVar2 = (yof) oa3Var.L$4;
                            d99 d99Var3 = (d99) oa3Var.L$3;
                            o26 o26Var12 = (o26) oa3Var.L$2;
                            Context context6 = (Context) oa3Var.L$0;
                            try {
                                jzb.q(objP0);
                                r0 = i3;
                                r13 = d99Var3;
                                o26Var4 = o26Var12;
                                context5 = context6;
                                r3 = i2;
                                if (r3 != 0) {
                                    r0 = zBooleanValue;
                                    r13 = r12;
                                    z2 = true;
                                } else {
                                    r0 = zBooleanValue;
                                    r13 = r12;
                                    z2 = false;
                                }
                                oa3Var.L$0 = context5;
                                oa3Var.L$1 = null;
                                oa3Var.L$2 = o26Var4;
                                oa3Var.L$3 = r13;
                                oa3Var.L$4 = yofVar2;
                                oa3Var.I$0 = r0;
                                oa3Var.I$1 = r3;
                                oa3Var.label = 5;
                                if (ta3Var.e(context5, z2, oa3Var) == bw2Var) {
                                    r6 = r0;
                                    r4 = r3;
                                    r14 = r13;
                                    context5.getClass();
                                    y93Var.i(context5, ya3Var2);
                                    y93Var.i(context5, ya3Var);
                                    bool4 = yofVar2.j;
                                    if (r6 != 0) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    boolValueOf2 = Boolean.valueOf(z3);
                                    if (r4 != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    boolValueOf3 = Boolean.valueOf(z4);
                                    oa3Var.L$0 = null;
                                    oa3Var.L$1 = null;
                                    oa3Var.L$2 = null;
                                    oa3Var.L$3 = r14;
                                    oa3Var.L$4 = null;
                                    oa3Var.I$0 = r6;
                                    oa3Var.I$1 = r4;
                                    oa3Var.label = 6;
                                    if (o26Var4.t(bool4, boolValueOf2, boolValueOf3, oa3Var) != bw2Var) {
                                        r5 = r14;
                                        z = true;
                                        r2 = r5;
                                        Boolean boolValueOf8 = Boolean.valueOf(z);
                                        r2.h(null);
                                        return boolValueOf8;
                                    }
                                }
                                return bw2Var;
                            } catch (Throwable th) {
                                th = th;
                                r7 = d99Var3;
                                r7.h(null);
                                throw th;
                            }
                        case 5:
                            int i4 = oa3Var.I$1;
                            int i5 = oa3Var.I$0;
                            yof yofVar3 = (yof) oa3Var.L$4;
                            d99 d99Var4 = (d99) oa3Var.L$3;
                            o26Var4 = (o26) oa3Var.L$2;
                            context5 = (Context) oa3Var.L$0;
                            try {
                                jzb.q(objP0);
                                yofVar2 = yofVar3;
                                r14 = d99Var4;
                                r4 = i4;
                                r6 = i5;
                                context5.getClass();
                                y93Var.i(context5, ya3Var2);
                                y93Var.i(context5, ya3Var);
                                bool4 = yofVar2.j;
                                if (r6 != 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                boolValueOf2 = Boolean.valueOf(z3);
                                if (r4 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                boolValueOf3 = Boolean.valueOf(z4);
                                oa3Var.L$0 = null;
                                oa3Var.L$1 = null;
                                oa3Var.L$2 = null;
                                oa3Var.L$3 = r14;
                                oa3Var.L$4 = null;
                                oa3Var.I$0 = r6;
                                oa3Var.I$1 = r4;
                                oa3Var.label = 6;
                                if (o26Var4.t(bool4, boolValueOf2, boolValueOf3, oa3Var) != bw2Var) {
                                    r5 = r14;
                                    z = true;
                                    r2 = r5;
                                    Boolean boolValueOf9 = Boolean.valueOf(z);
                                    r2.h(null);
                                    return boolValueOf9;
                                }
                                return bw2Var;
                            } catch (Throwable th2) {
                                th = th2;
                                r7 = d99Var4;
                                r7.h(null);
                                throw th;
                            }
                        case 6:
                            d99 d99Var5 = (d99) oa3Var.L$3;
                            jzb.q(objP0);
                            r5 = d99Var5;
                            z = true;
                            r2 = r5;
                            Boolean boolValueOf10 = Boolean.valueOf(z);
                            r2.h(null);
                            return boolValueOf10;
                        default:
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (CancellationException e3) {
                throw e3;
            }
        } catch (Throwable th4) {
            th = th4;
            r7 = obj;
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object o(gpf gpfVar, Boolean bool, Boolean bool2, zn2 zn2Var) {
        qa3 qa3Var;
        ta3 ta3Var;
        Boolean bool3;
        Boolean bool4;
        boolean zBooleanValue;
        if (zn2Var instanceof qa3) {
            qa3Var = (qa3) zn2Var;
            int i = qa3Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa3Var.label = i - Integer.MIN_VALUE;
                ta3Var = this;
            } else {
                ta3Var = this;
                qa3Var = new qa3(ta3Var, zn2Var);
            }
        } else {
            ta3Var = this;
            qa3Var = new qa3(ta3Var, zn2Var);
        }
        qa3 qa3Var2 = qa3Var;
        Object objA = qa3Var2.result;
        int i2 = qa3Var2.label;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                try {
                    qa3Var2.L$0 = null;
                    qa3Var2.L$1 = bool;
                    qa3Var2.L$2 = bool2;
                    qa3Var2.label = 1;
                    objA = gpf.a(gpfVar, null, null, null, null, null, null, null, bool, bool2, null, qa3Var2, 5119);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                    bool3 = bool;
                    bool4 = bool2;
                } catch (Exception e) {
                    e = e;
                    bool3 = bool;
                    bool4 = bool2;
                    ta3Var.d().c("Failed to sync fortune reminder opt-outs: today=" + bool3 + ", tomorrow=" + bool4, e);
                    zBooleanValue = false;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                bool4 = (Boolean) qa3Var2.L$2;
                bool3 = (Boolean) qa3Var2.L$1;
                try {
                    jzb.q(objA);
                } catch (Exception e2) {
                    e = e2;
                    ta3Var.d().c("Failed to sync fortune reminder opt-outs: today=" + bool3 + ", tomorrow=" + bool4, e);
                    zBooleanValue = false;
                }
            }
            zBooleanValue = ((Boolean) objA).booleanValue();
            return Boolean.valueOf(zBooleanValue);
        } catch (CancellationException e3) {
            throw e3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
    
        if (r2.l(r12, r0, r1, r3) == r9) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object q(android.content.Context r18, int r19, int r20, defpackage.zn2 r21) throws java.lang.Throwable {
        /*
            r17 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            boolean r3 = r2 instanceof defpackage.ra3
            if (r3 == 0) goto L19
            r3 = r2
            ra3 r3 = (defpackage.ra3) r3
            int r4 = r3.label
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.label = r4
            goto L20
        L19:
            ra3 r3 = new ra3
            r4 = r17
            r3.<init>(r4, r2)
        L20:
            java.lang.Object r2 = r3.result
            int r4 = r3.label
            java.util.concurrent.atomic.AtomicLong r5 = defpackage.ta3.c
            r6 = 2
            r7 = 1
            r8 = 0
            bw2 r9 = defpackage.bw2.a
            if (r4 == 0) goto L5f
            if (r4 == r7) goto L48
            if (r4 != r6) goto L42
            java.lang.Object r0 = r3.L$1
            r1 = r0
            d99 r1 = (defpackage.d99) r1
            java.lang.Object r0 = r3.L$0
            android.content.Context r0 = (android.content.Context) r0
            defpackage.jzb.q(r2)     // Catch: java.lang.Throwable -> L3f
            goto Laa
        L3f:
            r0 = move-exception
            goto Lb4
        L42:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r0)
            return r8
        L48:
            long r0 = r3.J$0
            int r4 = r3.I$1
            int r10 = r3.I$0
            java.lang.Object r11 = r3.L$1
            d99 r11 = (defpackage.d99) r11
            java.lang.Object r12 = r3.L$0
            android.content.Context r12 = (android.content.Context) r12
            defpackage.jzb.q(r2)
            r15 = r0
            r1 = r4
            r0 = r10
            r4 = r11
            r10 = r15
            goto L8a
        L5f:
            defpackage.jzb.q(r2)
            if (r0 < 0) goto Lb8
            r2 = 24
            if (r0 >= r2) goto Lb8
            if (r1 < 0) goto Lb8
            r2 = 60
            if (r1 >= r2) goto Lb8
            long r10 = r5.incrementAndGet()
            r2 = r18
            r3.L$0 = r2
            f99 r4 = defpackage.ta3.b
            r3.L$1 = r4
            r3.I$0 = r0
            r3.I$1 = r1
            r3.J$0 = r10
            r3.label = r7
            java.lang.Object r12 = r4.b(r3)
            if (r12 != r9) goto L89
            goto La9
        L89:
            r12 = r2
        L8a:
            long r13 = r5.get()     // Catch: java.lang.Throwable -> Lb2
            int r2 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r2 == 0) goto L95
            r7 = 0
        L93:
            r1 = r4
            goto Laa
        L95:
            y93 r2 = defpackage.y93.a     // Catch: java.lang.Throwable -> Lb2
            r3.L$0 = r8     // Catch: java.lang.Throwable -> Lb2
            r3.L$1 = r4     // Catch: java.lang.Throwable -> Lb2
            r3.I$0 = r0     // Catch: java.lang.Throwable -> Lb2
            r3.I$1 = r1     // Catch: java.lang.Throwable -> Lb2
            r3.J$0 = r10     // Catch: java.lang.Throwable -> Lb2
            r3.label = r6     // Catch: java.lang.Throwable -> Lb2
            java.lang.Object r0 = r2.l(r12, r0, r1, r3)     // Catch: java.lang.Throwable -> Lb2
            if (r0 != r9) goto L93
        La9:
            return r9
        Laa:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L3f
            r1.h(r8)
            return r0
        Lb2:
            r0 = move-exception
            r1 = r4
        Lb4:
            r1.h(r8)
            throw r0
        Lb8:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ta3.q(android.content.Context, int, int, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object r(Context context, int i, int i2, zn2 zn2Var) throws Throwable {
        sa3 sa3Var;
        LocalTime localTimeA;
        long jIncrementAndGet;
        int i3;
        d99 d99Var;
        int i4;
        Context context2;
        Throwable th;
        d99 d99Var2;
        boolean zBooleanValue;
        if (zn2Var instanceof sa3) {
            sa3Var = (sa3) zn2Var;
            int i5 = sa3Var.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                sa3Var.label = i5 - Integer.MIN_VALUE;
            } else {
                sa3Var = new sa3(this, zn2Var);
            }
        } else {
            sa3Var = new sa3(this, zn2Var);
        }
        Object objN = sa3Var.result;
        int i6 = sa3Var.label;
        AtomicLong atomicLong = d;
        bw2 bw2Var = bw2.a;
        try {
            if (i6 == 0) {
                jzb.q(objN);
                localTimeA = lze.a(i, i2);
                if (localTimeA == null) {
                    return Boolean.FALSE;
                }
                jIncrementAndGet = atomicLong.incrementAndGet();
                sa3Var.L$0 = context;
                sa3Var.L$1 = localTimeA;
                f99 f99Var = b;
                sa3Var.L$2 = f99Var;
                sa3Var.I$0 = i;
                sa3Var.I$1 = i2;
                sa3Var.J$0 = jIncrementAndGet;
                sa3Var.label = 1;
                if (f99Var.b(sa3Var) != bw2Var) {
                    i3 = i;
                    d99Var = f99Var;
                    i4 = i2;
                    context2 = context;
                }
                return bw2Var;
            }
            if (i6 != 1) {
                if (i6 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) sa3Var.L$2;
                try {
                    jzb.q(objN);
                    zBooleanValue = ((Boolean) objN).booleanValue();
                    Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
                    d99Var2.h(null);
                    return boolValueOf;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            jIncrementAndGet = sa3Var.J$0;
            i4 = sa3Var.I$1;
            i3 = sa3Var.I$0;
            d99Var = (d99) sa3Var.L$2;
            localTimeA = (LocalTime) sa3Var.L$1;
            context2 = (Context) sa3Var.L$0;
            jzb.q(objN);
            if (jIncrementAndGet == atomicLong.get()) {
                y93 y93Var = y93.a;
                int hour = localTimeA.getHour();
                int minute = localTimeA.getMinute();
                sa3Var.L$0 = null;
                sa3Var.L$1 = null;
                sa3Var.L$2 = d99Var;
                sa3Var.I$0 = i3;
                sa3Var.I$1 = i4;
                sa3Var.J$0 = jIncrementAndGet;
                sa3Var.label = 2;
                objN = y93Var.n(context2, hour, minute, sa3Var);
                if (objN != bw2Var) {
                    d99Var2 = d99Var;
                    zBooleanValue = ((Boolean) objN).booleanValue();
                }
                return bw2Var;
            }
            zBooleanValue = false;
            d99Var2 = d99Var;
            Boolean boolValueOf2 = Boolean.valueOf(zBooleanValue);
            d99Var2.h(null);
            return boolValueOf2;
        } catch (Throwable th3) {
            th = th3;
            d99Var2 = d99Var;
            d99Var2.h(null);
            throw th;
        }
    }
}
