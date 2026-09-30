package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gl5 implements wj5 {
    public final /* synthetic */ wj5 a;
    public final /* synthetic */ o26 b;

    public gl5(wj5 wj5Var, o26 o26Var) {
        this.a = wj5Var;
        this.b = o26Var;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x007f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b0 A[PHI: r0 r7 r9 r14 r15
  0x00b0: PHI (r0v5 fl5) = (r0v3 fl5), (r0v8 fl5) binds: [B:22:0x0084, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r7v3 long) = (r7v1 long), (r7v5 long) binds: [B:22:0x0084, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r9v2 xj5) = (r9v0 xj5), (r9v3 xj5) binds: [B:22:0x0084, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r14v4 int) = (r14v1 int), (r14v6 int) binds: [B:22:0x0084, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE]
  0x00b0: PHI (r15v8 int) = (r15v3 int), (r15v13 int) binds: [B:22:0x0084, B:28:0x00ac] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0084 -> B:29:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x00a1 -> B:26:0x00a4). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.wj5
    public final java.lang.Object b(defpackage.xj5 r14, defpackage.xn2 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.fl5
            if (r0 == 0) goto L13
            r0 = r15
            fl5 r0 = (defpackage.fl5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            fl5 r0 = new fl5
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.result
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L60
            if (r1 == r4) goto L46
            if (r1 != r3) goto L40
            long r7 = r0.J$0
            int r14 = r0.I$0
            java.lang.Object r1 = r0.L$3
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r9 = r0.L$2
            xj5 r9 = (defpackage.xj5) r9
            java.lang.Object r10 = r0.L$1
            xn2 r10 = (defpackage.xn2) r10
            java.lang.Object r10 = r0.L$0
            xj5 r10 = (defpackage.xj5) r10
            defpackage.jzb.q(r15)
            goto La4
        L40:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            return r5
        L46:
            int r14 = r0.I$1
            long r7 = r0.J$0
            int r1 = r0.I$0
            java.lang.Object r9 = r0.L$2
            xj5 r9 = (defpackage.xj5) r9
            java.lang.Object r10 = r0.L$1
            xn2 r10 = (defpackage.xn2) r10
            java.lang.Object r10 = r0.L$0
            xj5 r10 = (defpackage.xj5) r10
            defpackage.jzb.q(r15)
            r12 = r15
            r15 = r14
            r14 = r1
            r1 = r12
            goto L82
        L60:
            defpackage.jzb.q(r15)
            r7 = 0
            r15 = r2
        L66:
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r14
            r0.L$3 = r5
            r0.I$0 = r15
            r0.J$0 = r7
            r0.I$1 = r2
            r0.label = r4
            wj5 r1 = r13.a
            java.io.Serializable r1 = defpackage.oa7.t(r1, r14, r0)
            if (r1 != r6) goto L7f
            goto La3
        L7f:
            r9 = r14
            r14 = r15
            r15 = r2
        L82:
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto Lb0
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r7)
            r0.L$0 = r5
            r0.L$1 = r5
            r0.L$2 = r9
            r0.L$3 = r1
            r0.I$0 = r14
            r0.J$0 = r7
            r0.I$1 = r15
            r0.label = r3
            o26 r15 = r13.b
            java.lang.Object r15 = r15.t(r9, r1, r10, r0)
            if (r15 != r6) goto La4
        La3:
            return r6
        La4:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto Lb4
            r10 = 1
            long r7 = r7 + r10
            r15 = r4
        Lb0:
            r1 = r0
            r0 = r14
            r14 = r9
            goto Lb5
        Lb4:
            throw r1
        Lb5:
            if (r15 != 0) goto Lba
            wef r13 = defpackage.wef.a
            return r13
        Lba:
            r15 = r0
            r0 = r1
            goto L66
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gl5.b(xj5, xn2):java.lang.Object");
    }
}
