package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yt5 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ s7 $accountIds;
    final /* synthetic */ gmc $exposures;
    final /* synthetic */ h48 $lifecycle;
    final /* synthetic */ String $seasonalPeriod;
    final /* synthetic */ String $source;
    final /* synthetic */ e89 $successfullyExposed$delegate;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt5(h48 h48Var, s7 s7Var, String str, gmc gmcVar, String str2, String str3, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$lifecycle = h48Var;
        this.$accountIds = s7Var;
        this.$accountId = str;
        this.$exposures = gmcVar;
        this.$seasonalPeriod = str2;
        this.$source = str3;
        this.$successfullyExposed$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yt5(this.$lifecycle, this.$accountIds, this.$accountId, this.$exposures, this.$seasonalPeriod, this.$source, this.$successfullyExposed$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x005e  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a6, code lost:
    
        if (r9.b(r0, r2, r5, r8) == r4) goto L27;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L2c
            if (r0 == r2) goto L18
            if (r0 != r1) goto L12
            defpackage.jzb.q(r9)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            goto Lbd
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r3
        L18:
            java.lang.Object r0 = r8.L$3
            wg6 r0 = (defpackage.wg6) r0
            java.lang.Object r0 = r8.L$2
            g48 r0 = (defpackage.g48) r0
            java.lang.Object r0 = r8.L$1
            h48 r0 = (defpackage.h48) r0
            java.lang.Object r0 = r8.L$0
            h48 r0 = (defpackage.h48) r0
            defpackage.jzb.q(r9)
            goto L78
        L2c:
            defpackage.jzb.q(r9)
            h48 r9 = r8.$lifecycle
            js3 r0 = defpackage.ga4.a
            wg6 r0 = defpackage.mk8.a
            wg6 r0 = r0.f
            pv2 r5 = r8.getContext()
            boolean r5 = r0.b1(r5)
            if (r5 != 0) goto L5e
            r6 = r9
            a58 r6 = (defpackage.a58) r6
            g48 r6 = r6.i
            g48 r7 = defpackage.g48.a
            if (r6 == r7) goto L58
            r6 = r9
            a58 r6 = (defpackage.a58) r6
            g48 r6 = r6.i
            g48 r7 = defpackage.g48.e
            int r6 = r6.compareTo(r7)
            if (r6 < 0) goto L5e
            goto L78
        L58:
            p48 r8 = new p48
            r8.<init>(r3)
            throw r8
        L5e:
            tq0 r6 = new tq0
            r7 = 18
            r6.<init>(r7)
            r8.L$0 = r3
            r8.L$1 = r3
            r8.L$2 = r3
            r8.L$3 = r3
            r8.Z$0 = r5
            r8.label = r2
            java.lang.Object r9 = defpackage.p8c.w(r9, r5, r0, r6, r8)
            if (r9 != r4) goto L78
            goto La8
        L78:
            e89 r9 = r8.$successfullyExposed$delegate
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r9.setValue(r0)
            s7 r9 = r8.$accountIds
            r9.getClass()
            java.lang.String r9 = defpackage.s7.a()
            java.lang.String r0 = r8.$accountId
            boolean r9 = defpackage.pa7.t(r9, r0)
            if (r9 == 0) goto Lbd
            gmc r9 = r8.$exposures     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            java.lang.String r0 = r8.$accountId     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            java.lang.String r2 = r8.$seasonalPeriod     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            java.lang.String r5 = r8.$source     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            r8.L$0 = r3     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            r8.L$1 = r3     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            r8.L$2 = r3     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            r8.L$3 = r3     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            r8.label = r1     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            java.lang.Object r8 = r9.b(r0, r2, r5, r8)     // Catch: java.lang.Exception -> La9 java.util.concurrent.CancellationException -> Lbb
            if (r8 != r4) goto Lbd
        La8:
            return r4
        La9:
            r8 = move-exception
            ef8 r9 = defpackage.hf8.Q
            r9.getClass()
            java.lang.String r9 = "SeasonalIntro"
            m8b r9 = defpackage.ef8.a(r9)
            java.lang.String r0 = "Failed to persist intro exposure"
            r9.h(r0, r8)
            goto Lbd
        Lbb:
            r8 = move-exception
            throw r8
        Lbd:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yt5.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yt5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
