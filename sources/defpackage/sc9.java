package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sc9 {
    public wc9 a;
    public wc9 b;
    public x16 c = new zv6(19, this);
    public aw2 d;

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0052, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006b, code lost:
    
        if (r0 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006d, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(long r8, long r10, defpackage.zn2 r12) {
        /*
            r7 = this;
            boolean r0 = r12 instanceof defpackage.qc9
            if (r0 == 0) goto L14
            r0 = r12
            qc9 r0 = (defpackage.qc9) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            qc9 r0 = new qc9
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.result
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L35
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.jzb.q(r0)
            goto L6e
        L2b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r2
        L31:
            defpackage.jzb.q(r0)
            goto L55
        L35:
            defpackage.jzb.q(r0)
            wc9 r0 = r7.a
            if (r0 == 0) goto L41
            wc9 r0 = r0.m1()
            goto L42
        L41:
            r0 = r2
        L42:
            r5 = 0
            bw2 r1 = defpackage.bw2.a
            if (r0 != 0) goto L5a
            wc9 r7 = r7.b
            if (r7 == 0) goto L72
            r12.label = r4
            java.lang.Object r0 = r7.H(r8, r10, r12)
            if (r0 != r1) goto L55
            goto L6d
        L55:
            zsf r0 = (defpackage.zsf) r0
            long r5 = r0.a
            goto L72
        L5a:
            wc9 r7 = r7.a
            if (r7 == 0) goto L62
            wc9 r2 = r7.m1()
        L62:
            r7 = r2
            if (r7 == 0) goto L72
            r12.label = r3
            java.lang.Object r0 = r7.H(r8, r10, r12)
            if (r0 != r1) goto L6e
        L6d:
            return r1
        L6e:
            zsf r0 = (defpackage.zsf) r0
            long r5 = r0.a
        L72:
            zsf r7 = new zsf
            r7.<init>(r5)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sc9.a(long, long, zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(long j, zn2 zn2Var) {
        rc9 rc9Var;
        long j2;
        if (zn2Var instanceof rc9) {
            rc9Var = (rc9) zn2Var;
            int i = rc9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                rc9Var.label = i - Integer.MIN_VALUE;
            } else {
                rc9Var = new rc9(this, zn2Var);
            }
        } else {
            rc9Var = new rc9(this, zn2Var);
        }
        Object objG0 = rc9Var.result;
        int i2 = rc9Var.label;
        if (i2 == 0) {
            jzb.q(objG0);
            wc9 wc9Var = this.a;
            wc9 wc9VarM1 = wc9Var != null ? wc9Var.m1() : null;
            if (wc9VarM1 != null) {
                rc9Var.label = 1;
                objG0 = wc9VarM1.G0(j, rc9Var);
                bw2 bw2Var = bw2.a;
                if (objG0 == bw2Var) {
                    return bw2Var;
                }
            } else {
                j2 = 0;
            }
            return new zsf(j2);
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(objG0);
        j2 = ((zsf) objG0).a;
        return new zsf(j2);
    }

    public final aw2 c() {
        aw2 aw2Var = (aw2) this.c.invoke();
        if (aw2Var != null) {
            return aw2Var;
        }
        qc0.p("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }
}
