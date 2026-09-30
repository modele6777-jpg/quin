package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0d {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final ff5 a;
    public final of5 b;
    public final m1d c;
    public final iz4 d;
    public final pv2 e;

    public s0d(ff5 ff5Var, of5 of5Var, m1d m1dVar, iz4 iz4Var, pv2 pv2Var) {
        ff5Var.getClass();
        of5Var.getClass();
        m1dVar.getClass();
        iz4Var.getClass();
        pv2Var.getClass();
        this.a = ff5Var;
        this.b = of5Var;
        this.c = m1dVar;
        this.d = iz4Var;
        this.e = pv2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0079, code lost:
    
        if (r6.b(r0) == r5) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.zn2 r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof defpackage.r0d
            if (r0 == 0) goto L13
            r0 = r7
            r0d r0 = (defpackage.r0d) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            r0d r0 = new r0d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            java.lang.String r4 = "FirebaseSessions"
            m1d r6 = r6.c
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L39
            if (r1 == r3) goto L35
            if (r1 != r2) goto L2e
            defpackage.jzb.q(r7)
            goto L7c
        L2e:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L35:
            defpackage.jzb.q(r7)
            goto L47
        L39:
            defpackage.jzb.q(r7)
            xg5 r7 = defpackage.xg5.a
            r0.label = r3
            java.lang.Object r7 = r7.b(r0)
            if (r7 != r5) goto L47
            goto L7b
        L47:
            java.util.Map r7 = (java.util.Map) r7
            java.util.Collection r7 = r7.values()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            boolean r1 = r7 instanceof java.util.Collection
            if (r1 == 0) goto L5d
            r1 = r7
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L5d
            goto Lb1
        L5d:
            java.util.Iterator r7 = r7.iterator()
        L61:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto Lb1
            java.lang.Object r1 = r7.next()
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r1 = (com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber) r1
            boolean r1 = r1.isDataCollectionEnabled()
            if (r1 == 0) goto L61
            r0.label = r2
            java.lang.Object r7 = r6.b(r0)
            if (r7 != r5) goto L7c
        L7b:
            return r5
        L7c:
            d4d r7 = r6.a
            java.lang.Boolean r7 = r7.a()
            if (r7 == 0) goto L89
        L84:
            boolean r3 = r7.booleanValue()
            goto L92
        L89:
            d4d r7 = r6.b
            java.lang.Boolean r7 = r7.a()
            if (r7 == 0) goto L92
            goto L84
        L92:
            if (r3 != 0) goto L9c
            java.lang.String r6 = "Sessions SDK disabled through settings API. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        L9c:
            double r0 = defpackage.s0d.f
            double r6 = r6.a()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 > 0) goto La9
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            return r6
        La9:
            java.lang.String r6 = "Sessions SDK has dropped this session due to sampling."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        Lb1:
            java.lang.String r6 = "Sessions SDK disabled through data collection. Events will not be sent."
            android.util.Log.d(r4, r6)
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s0d.a(zn2):java.lang.Object");
    }
}
