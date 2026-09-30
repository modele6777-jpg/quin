package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class r57 {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        if (r7 == r5) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r8v0, types: [of5] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v20 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.of5 r8, defpackage.zn2 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.q57
            if (r0 == 0) goto L13
            r0 = r9
            q57 r0 = (defpackage.q57) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            q57 r0 = new q57
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.result
            int r9 = r0.label
            java.lang.String r1 = "FirebaseSessions"
            r2 = 2
            r3 = 1
            java.lang.String r4 = ""
            bw2 r5 = defpackage.bw2.a
            if (r9 == 0) goto L46
            if (r9 == r3) goto L3c
            if (r9 != r2) goto L35
            java.lang.Object r8 = r0.L$0
            java.lang.String r8 = (java.lang.String) r8
            defpackage.jzb.q(r7)     // Catch: java.lang.Exception -> L32
            goto L8b
        L32:
            r7 = move-exception
            goto L92
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L3c:
            java.lang.Object r8 = r0.L$0
            of5 r8 = (defpackage.of5) r8
            defpackage.jzb.q(r7)     // Catch: java.lang.Exception -> L44
            goto L61
        L44:
            r7 = move-exception
            goto L70
        L46:
            defpackage.jzb.q(r7)
            r7 = r8
            nf5 r7 = (defpackage.nf5) r7     // Catch: java.lang.Exception -> L44
            gfh r8 = r7.d()     // Catch: java.lang.Exception -> L44
            r8.getClass()     // Catch: java.lang.Exception -> L6c
            r0.L$0 = r7     // Catch: java.lang.Exception -> L6c
            r0.label = r3     // Catch: java.lang.Exception -> L6c
            java.lang.Object r8 = defpackage.jcc.c(r8, r0)     // Catch: java.lang.Exception -> L6c
            if (r8 != r5) goto L5e
            goto L8a
        L5e:
            r6 = r8
            r8 = r7
            r7 = r6
        L61:
            ip0 r7 = (defpackage.ip0) r7     // Catch: java.lang.Exception -> L44
            java.lang.String r7 = r7.a     // Catch: java.lang.Exception -> L44
            r7.getClass()     // Catch: java.lang.Exception -> L44
            r6 = r8
            r8 = r7
            r7 = r6
            goto L77
        L6c:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L70:
            java.lang.String r9 = "Error getting authentication token."
            io.sentry.android.core.b1.n(r1, r9, r7)
            r7 = r8
            r8 = r4
        L77:
            nf5 r7 = (defpackage.nf5) r7     // Catch: java.lang.Exception -> L32
            gfh r7 = r7.c()     // Catch: java.lang.Exception -> L32
            r7.getClass()     // Catch: java.lang.Exception -> L32
            r0.L$0 = r8     // Catch: java.lang.Exception -> L32
            r0.label = r2     // Catch: java.lang.Exception -> L32
            java.lang.Object r7 = defpackage.jcc.c(r7, r0)     // Catch: java.lang.Exception -> L32
            if (r7 != r5) goto L8b
        L8a:
            return r5
        L8b:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
            if (r7 != 0) goto L90
            goto L97
        L90:
            r4 = r7
            goto L97
        L92:
            java.lang.String r9 = "Error getting Firebase installation id ."
            io.sentry.android.core.b1.n(r1, r9, r7)
        L97:
            s57 r7 = new s57
            r7.<init>(r4, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r57.a(of5, zn2):java.lang.Object");
    }
}
