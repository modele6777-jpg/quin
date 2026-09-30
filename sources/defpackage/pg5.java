package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pg5 extends gbe implements l26 {
    final /* synthetic */ k1d $sessionsActivityLifecycleCallbacks;
    int label;
    final /* synthetic */ qg5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg5(qg5 qg5Var, k1d k1dVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = qg5Var;
        this.$sessionsActivityLifecycleCallbacks = k1dVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pg5(this.this$0, this.$sessionsActivityLifecycleCallbacks, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0061, code lost:
    
        if (r6.b(r5) == r4) goto L25;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            java.lang.String r1 = "FirebaseSessions"
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.jzb.q(r6)
            goto L64
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L19:
            defpackage.jzb.q(r6)
            goto L2b
        L1d:
            defpackage.jzb.q(r6)
            xg5 r6 = defpackage.xg5.a
            r5.label = r3
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r4) goto L2b
            goto L63
        L2b:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Collection r6 = r6.values()
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            boolean r0 = r6 instanceof java.util.Collection
            if (r0 == 0) goto L41
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L41
            goto La1
        L41:
            java.util.Iterator r6 = r6.iterator()
        L45:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto La1
            java.lang.Object r0 = r6.next()
            com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber r0 = (com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber) r0
            boolean r0 = r0.isDataCollectionEnabled()
            if (r0 == 0) goto L45
            qg5 r6 = r5.this$0
            m1d r6 = r6.b
            r5.label = r2
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r4) goto L64
        L63:
            return r4
        L64:
            qg5 r6 = r5.this$0
            m1d r6 = r6.b
            d4d r0 = r6.a
            java.lang.Boolean r0 = r0.a()
            if (r0 == 0) goto L75
            boolean r3 = r0.booleanValue()
            goto L81
        L75:
            d4d r6 = r6.b
            java.lang.Boolean r6 = r6.a()
            if (r6 == 0) goto L81
            boolean r3 = r6.booleanValue()
        L81:
            if (r3 != 0) goto L8d
            java.lang.String r5 = "Sessions SDK disabled. Not listening to lifecycle events."
            int r5 = android.util.Log.d(r1, r5)
            defpackage.ok8.j(r5)
            goto Laa
        L8d:
            qg5 r5 = r5.this$0
            ff5 r5 = r5.a
            pd4 r6 = new pd4
            r0 = 29
            r6.<init>(r0)
            r5.a()
            java.util.concurrent.CopyOnWriteArrayList r5 = r5.j
            r5.add(r6)
            goto Laa
        La1:
            java.lang.String r5 = "No Sessions subscribers. Not listening to lifecycle events."
            int r5 = android.util.Log.d(r1, r5)
            defpackage.ok8.j(r5)
        Laa:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pg5.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pg5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
