package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ikd implements k77 {
    public final f99 a = new f99();
    public final uh0 b = new uh0(0);
    public final ybc c = new ybc(new hkd(2, null));

    public ikd(String str) {
    }

    @Override // defpackage.k77
    public final Object a(zn2 zn2Var) {
        return new Integer(this.b.a.get());
    }

    @Override // defpackage.k77
    public final Object b(nd3 nd3Var) {
        return new Integer(this.b.a.incrementAndGet());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005f, code lost:
    
        if (r8 == r5) goto L25;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ikd] */
    /* JADX WARN: Type inference failed for: r6v1, types: [d99] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v4, types: [d99] */
    @Override // defpackage.k77
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.a26 r7, defpackage.zn2 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.fkd
            if (r0 == 0) goto L13
            r0 = r8
            fkd r0 = (defpackage.fkd) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            fkd r0 = new fkd
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L43
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            java.lang.Object r6 = r0.L$0
            d99 r6 = (defpackage.d99) r6
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L2f
            goto L62
        L2f:
            r7 = move-exception
            goto L66
        L31:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r4
        L37:
            java.lang.Object r6 = r0.L$1
            d99 r6 = (defpackage.d99) r6
            java.lang.Object r7 = r0.L$0
            a26 r7 = (defpackage.a26) r7
            defpackage.jzb.q(r8)
            goto L55
        L43:
            defpackage.jzb.q(r8)
            r0.L$0 = r7
            f99 r6 = r6.a
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r8 = r6.b(r0)
            if (r8 != r5) goto L55
            goto L61
        L55:
            r0.L$0 = r6     // Catch: java.lang.Throwable -> L2f
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L2f
            r0.label = r2     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r8 = r7.d(r0)     // Catch: java.lang.Throwable -> L2f
            if (r8 != r5) goto L62
        L61:
            return r5
        L62:
            r6.h(r4)
            return r8
        L66:
            r6.h(r4)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ikd.c(a26, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x0061  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.k77
    public final Object d(l26 l26Var, zn2 zn2Var) throws Throwable {
        gkd gkdVar;
        d99 d99Var;
        boolean z;
        Throwable th;
        if (zn2Var instanceof gkd) {
            gkdVar = (gkd) zn2Var;
            int i = gkdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                gkdVar.label = i - Integer.MIN_VALUE;
            } else {
                gkdVar = new gkd(this, zn2Var);
            }
        } else {
            gkdVar = new gkd(this, zn2Var);
        }
        Object obj = gkdVar.result;
        int i2 = gkdVar.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = gkdVar.Z$0;
            d99Var = (d99) gkdVar.L$0;
            try {
                jzb.q(obj);
                if (z) {
                    d99Var.h(null);
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (z) {
                    d99Var.h(null);
                }
                throw th;
            }
        }
        jzb.q(obj);
        f99 f99Var = this.a;
        boolean zF = f99Var.f();
        try {
            Object objValueOf = Boolean.valueOf(zF);
            gkdVar.L$0 = f99Var;
            gkdVar.Z$0 = zF;
            gkdVar.label = 1;
            Object objZ = l26Var.z(objValueOf, gkdVar);
            Object obj2 = bw2.a;
            if (objZ == obj2) {
                return obj2;
            }
            d99Var = f99Var;
            z = zF;
            obj = objZ;
            if (z) {
                d99Var.h(null);
            }
            return obj;
        } catch (Throwable th3) {
            d99Var = f99Var;
            z = zF;
            th = th3;
            if (z) {
                d99Var.h(null);
            }
            throw th;
        }
    }

    @Override // defpackage.k77
    public final wj5 e() {
        return this.c;
    }
}
