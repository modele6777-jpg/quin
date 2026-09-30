package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rab implements fab, hf8 {
    public static final /* synthetic */ int w = 0;
    public final t7 a;
    public final xt6 b;
    public final eab c;
    public final sf6 d;
    public final f99 e = new f99();
    public pu3 f;
    public final ncd g;
    public final vz9 v;

    public rab(t7 t7Var, xt6 xt6Var, eab eabVar, sf6 sf6Var) {
        this.a = t7Var;
        this.b = xt6Var;
        this.c = eabVar;
        this.d = sf6Var;
        ncd ncdVarA = ocd.a(1, 1, i41.b);
        this.g = ncdVarA;
        pv2 pv2Var = lw2.a.a;
        js3 js3Var = ga4.a;
        qn2 qn2VarK = jgb.k(pv2Var.p0(mk8.a));
        ynb.V(qn2VarK, null, null, new gab(this, null), 3);
        ok8.C(ym8.x(new kl5(k99.z(ncdVarA, 200L), new hab(this, null), 1), hr3.c), qn2VarK);
        f();
        this.v = q1c.f(Boolean.FALSE);
    }

    public final void a() {
        g(false);
        eab eabVar = this.c;
        if (eabVar.c) {
            eabVar.l(eabVar.d, false);
        } else {
            eabVar.b = null;
        }
        ynb.V(lw2.a, null, null, new kab(xqa.C.a, "", null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cc A[Catch: all -> 0x00cf, TRY_LEAVE, TryCatch #4 {all -> 0x00cf, blocks: (B:50:0x00c8, B:52:0x00cc), top: B:88:0x00c8 }] */
    /* JADX WARN: Code duplicated, block: B:60:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:64:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00f5 A[Catch: all -> 0x00f8, TRY_LEAVE, TryCatch #0 {all -> 0x00f8, blocks: (B:68:0x00f1, B:70:0x00f5), top: B:80:0x00f1 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r12v10, types: [dg7, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v16 */
    /* JADX WARN: Type inference failed for: r12v5, types: [pu3] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Object, rg7] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v7, types: [dg7, java.lang.Object] */
    public final Object b(xn2 xn2Var) {
        lab labVar;
        d99 d99Var;
        pu3 pu3Var;
        ?? Y;
        ?? r1;
        ?? r0;
        ?? r2;
        Object obj;
        if (xn2Var instanceof lab) {
            labVar = (lab) xn2Var;
            int i = labVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                labVar.label = i - Integer.MIN_VALUE;
            } else {
                labVar = new lab(this, xn2Var);
            }
        } else {
            labVar = new lab(this, xn2Var);
        }
        Object obj2 = labVar.result;
        int i2 = labVar.label;
        d99 d99Var2 = this.e;
        bw2 bw2Var = bw2.a;
        try {
            try {
                if (i2 == 0) {
                    jzb.q(obj2);
                    labVar.L$0 = d99Var2;
                    labVar.label = 1;
                    if (d99Var2.b(labVar) != bw2Var) {
                        d99Var = d99Var2;
                    }
                    return bw2Var;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        nu3 nu3Var = (nu3) labVar.L$0;
                        try {
                            jzb.q(obj2);
                            r1 = nu3Var;
                            if (!r1.b()) {
                                return obj2;
                            }
                            labVar.L$0 = r1;
                            labVar.L$1 = obj2;
                            labVar.L$2 = d99Var2;
                            labVar.label = 3;
                            if (d99Var2.b(labVar) != bw2Var) {
                                r2 = r1;
                                obj = obj2;
                            }
                            return bw2Var;
                        } catch (Throwable th) {
                            th = th;
                            Y = nu3Var;
                            if (!Y.b()) {
                                labVar.L$0 = Y;
                                labVar.L$1 = th;
                                labVar.L$2 = d99Var2;
                                labVar.label = 4;
                                if (d99Var2.b(labVar) != bw2Var) {
                                    r0 = Y;
                                    if (this.f == r0) {
                                        this.f = null;
                                    }
                                }
                            }
                            throw th;
                        }
                    }
                    if (i2 != 3) {
                        if (i2 != 4) {
                            qc0.p("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        d99Var2 = (d99) labVar.L$2;
                        th = (Throwable) labVar.L$1;
                        nu3 nu3Var2 = (nu3) labVar.L$0;
                        jzb.q(obj2);
                        r0 = nu3Var2;
                        try {
                            if (this.f == r0) {
                                this.f = null;
                            }
                            throw th;
                        } finally {
                            d99Var2.h(null);
                        }
                    }
                    d99Var2 = (d99) labVar.L$2;
                    obj = labVar.L$1;
                    nu3 nu3Var3 = (nu3) labVar.L$0;
                    jzb.q(obj2);
                    r2 = nu3Var3;
                    try {
                        if (this.f == r2) {
                            this.f = null;
                        }
                        return obj;
                    } finally {
                        d99Var2.h(null);
                    }
                }
                d99Var = (d99) labVar.L$0;
                jzb.q(obj2);
                if (pu3Var != null) {
                    if (!pu3Var.b()) {
                        Y = 0;
                    }
                    if (Y == 0) {
                        Y = pu3Var;
                        qn2 qn2Var = lw2.a;
                        js3 js3Var = ga4.a;
                        Y = ynb.y(qn2Var, hr3.c, new mab(this, null), 2);
                        this.f = Y;
                    }
                    return bw2Var;
                }
                qn2 qn2Var2 = lw2.a;
                js3 js3Var2 = ga4.a;
                Y = ynb.y(qn2Var2, hr3.c, new mab(this, null), 2);
                this.f = Y;
                labVar.L$0 = Y;
                labVar.label = 2;
                Object objS = Y.s(labVar);
                if (objS != bw2Var) {
                    r1 = Y;
                    obj2 = objS;
                    if (!r1.b()) {
                        return obj2;
                    }
                    labVar.L$0 = r1;
                    labVar.L$1 = obj2;
                    labVar.L$2 = d99Var2;
                    labVar.label = 3;
                    if (d99Var2.b(labVar) != bw2Var) {
                        r2 = r1;
                        obj = obj2;
                        if (this.f == r2) {
                            this.f = null;
                        }
                        return obj;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                if (!Y.b()) {
                    labVar.L$0 = Y;
                    labVar.L$1 = th;
                    labVar.L$2 = d99Var2;
                    labVar.label = 4;
                    if (d99Var2.b(labVar) != bw2Var) {
                        r0 = Y;
                        if (this.f == r0) {
                            this.f = null;
                        }
                    }
                }
                throw th;
            }
            pu3Var = this.f;
            Y = pu3Var;
            d99Var.h(null);
            return bw2Var;
        } catch (Throwable th3) {
            d99Var.h(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var) {
        nab nabVar;
        mmb mmbVar;
        if (zn2Var instanceof nab) {
            nabVar = (nab) zn2Var;
            int i = nabVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                nabVar.label = i - Integer.MIN_VALUE;
            } else {
                nabVar = new nab(this, zn2Var);
            }
        } else {
            nabVar = new nab(this, zn2Var);
        }
        Object obj = nabVar.result;
        int i2 = nabVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            d().e("start fetchQuota");
            mmb mmbVar2 = new mmb();
            al5 al5Var = new al5(new ybc(new u3e(null, new qfe((sfe) this.b, null))), new v3e(3, null));
            js3 js3Var = ga4.a;
            wj5 wj5VarX = ym8.x(al5Var, hr3.c);
            pab pabVar = new pab(this, mmbVar2);
            nabVar.L$0 = mmbVar2;
            nabVar.label = 1;
            Object objB = wj5VarX.b(pabVar, nabVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
            mmbVar = mmbVar2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mmbVar = (mmb) nabVar.L$0;
            jzb.q(obj);
        }
        d().e("finish fetchQuota");
        return mmbVar.element;
    }

    public final boolean e() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    public final void f() {
        ynb.V(lw2.a, null, null, new qab(this, null), 3);
    }

    public final void g(boolean z) {
        this.v.setValue(Boolean.valueOf(z));
    }
}
