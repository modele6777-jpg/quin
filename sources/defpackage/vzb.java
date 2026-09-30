package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vzb extends gbe implements l26 {
    final /* synthetic */ hd1 $camera2DeviceCloser;
    final /* synthetic */ String $cameraId;
    Object L$0;
    int label;
    final /* synthetic */ xzb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzb(xzb xzbVar, String str, hd1 hd1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = xzbVar;
        this.$cameraId = str;
        this.$camera2DeviceCloser = hd1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new vzb(this.this$0, this.$cameraId, this.$camera2DeviceCloser, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0071, code lost:
    
        if (r11 == r7) goto L19;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 33
            java.lang.String r2 = "Failed to open "
            r3 = 1
            java.lang.String r4 = "CXCP"
            r5 = 2
            r6 = 0
            bw2 r7 = defpackage.bw2.a
            if (r0 == 0) goto L25
            if (r0 == r3) goto L21
            if (r0 != r5) goto L1b
            java.lang.Object r0 = r10.L$0
            kp r0 = (defpackage.kp) r0
            defpackage.jzb.q(r11)
            goto L74
        L1b:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r10)
            return r6
        L21:
            defpackage.jzb.q(r11)
            goto L3e
        L25:
            defpackage.jzb.q(r11)
            xzb r11 = r10.this$0
            java.lang.String r0 = r10.$cameraId
            hd1 r8 = r10.$camera2DeviceCloser
            r10.label = r3
            z8b r3 = new z8b
            r9 = 22
            r3.<init>(r9)
            java.lang.Object r11 = r11.b(r0, r8, r3, r10)
            if (r11 != r7) goto L3e
            goto L73
        L3e:
            eq9 r11 = (defpackage.eq9) r11
            kp r0 = r11.a
            if (r0 != 0) goto L62
            java.lang.String r10 = r10.$cameraId
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r2)
            java.lang.String r10 = defpackage.ig1.b(r10)
            r11.append(r10)
            r11.append(r1)
            java.lang.String r10 = r11.toString()
            io.sentry.android.core.b1.d(r4, r10)
            tr0 r10 = new tr0
            r10.<init>(r6, r6)
            return r10
        L62:
            s0e r11 = r0.u
            uzb r3 = new uzb
            r3.<init>(r5, r6)
            r10.L$0 = r0
            r10.label = r5
            java.lang.Object r11 = defpackage.tm7.C(r11, r3, r10)
            if (r11 != r7) goto L74
        L73:
            return r7
        L74:
            yi1 r11 = (defpackage.yi1) r11
            boolean r3 = r11 instanceof defpackage.dj1
            java.lang.String r10 = r10.$cameraId
            if (r3 == 0) goto L9e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r10 = defpackage.ig1.b(r10)
            r1.append(r10)
            java.lang.String r10 = " opened successfully."
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            android.util.Log.i(r4, r10)
            tr0 r10 = new tr0
            dj1 r11 = (defpackage.dj1) r11
            lf1 r11 = r11.a
            r10.<init>(r11, r0)
            return r10
        L9e:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>(r2)
            java.lang.String r10 = defpackage.ig1.b(r10)
            r11.append(r10)
            r11.append(r1)
            java.lang.String r10 = r11.toString()
            io.sentry.android.core.b1.d(r4, r10)
            tr0 r10 = new tr0
            r10.<init>(r6, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzb.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vzb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
