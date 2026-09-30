package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cgd extends gbe implements l26 {
    final /* synthetic */ x16 $onUserCutCompleted;
    final /* synthetic */ a26 $playCutAnimation;
    final /* synthetic */ a26 $setCutCardStage;
    final /* synthetic */ boolean $userAction;
    int label;
    final /* synthetic */ egd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cgd(a26 a26Var, a26 a26Var2, egd egdVar, boolean z, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$playCutAnimation = a26Var;
        this.$setCutCardStage = a26Var2;
        this.this$0 = egdVar;
        this.$userAction = z;
        this.$onUserCutCompleted = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cgd(this.$playCutAnimation, this.$setCutCardStage, this.this$0, this.$userAction, this.$onUserCutCompleted, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x005c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: all -> 0x001b, TRY_LEAVE, TryCatch #0 {all -> 0x001b, blocks: (B:14:0x0025, B:29:0x005d, B:32:0x006d, B:34:0x0081, B:15:0x0029, B:26:0x004d, B:8:0x0017, B:18:0x0030, B:20:0x0034, B:23:0x003d), top: B:39:0x000d }] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (defpackage.vfh.q(200, r10) == r9) goto L31;
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
            s13 r1 = defpackage.s13.a
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 200(0xc8, double:9.9E-322)
            r8 = 1
            bw2 r9 = defpackage.bw2.a
            if (r0 == 0) goto L2d
            if (r0 == r8) goto L17
            if (r0 == r5) goto L29
            if (r0 == r4) goto L25
            if (r0 != r3) goto L1e
        L17:
            defpackage.jzb.q(r11)     // Catch: java.lang.Throwable -> L1b
            goto L6d
        L1b:
            r11 = move-exception
            goto L93
        L1e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r10)
            r10 = 0
            return r10
        L25:
            defpackage.jzb.q(r11)     // Catch: java.lang.Throwable -> L1b
            goto L5d
        L29:
            defpackage.jzb.q(r11)     // Catch: java.lang.Throwable -> L1b
            goto L4d
        L2d:
            defpackage.jzb.q(r11)
            a26 r11 = r10.$playCutAnimation     // Catch: java.lang.Throwable -> L1b
            if (r11 == 0) goto L3d
            r10.label = r8     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r11 = r11.d(r10)     // Catch: java.lang.Throwable -> L1b
            if (r11 != r9) goto L6d
            goto L6c
        L3d:
            a26 r11 = r10.$setCutCardStage     // Catch: java.lang.Throwable -> L1b
            s13 r0 = defpackage.s13.b     // Catch: java.lang.Throwable -> L1b
            r11.d(r0)     // Catch: java.lang.Throwable -> L1b
            r10.label = r5     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r11 = defpackage.vfh.q(r6, r10)     // Catch: java.lang.Throwable -> L1b
            if (r11 != r9) goto L4d
            goto L6c
        L4d:
            a26 r11 = r10.$setCutCardStage     // Catch: java.lang.Throwable -> L1b
            s13 r0 = defpackage.s13.c     // Catch: java.lang.Throwable -> L1b
            r11.d(r0)     // Catch: java.lang.Throwable -> L1b
            r10.label = r4     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r11 = defpackage.vfh.q(r6, r10)     // Catch: java.lang.Throwable -> L1b
            if (r11 != r9) goto L5d
            goto L6c
        L5d:
            a26 r11 = r10.$setCutCardStage     // Catch: java.lang.Throwable -> L1b
            s13 r0 = defpackage.s13.d     // Catch: java.lang.Throwable -> L1b
            r11.d(r0)     // Catch: java.lang.Throwable -> L1b
            r10.label = r3     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r11 = defpackage.vfh.q(r6, r10)     // Catch: java.lang.Throwable -> L1b
            if (r11 != r9) goto L6d
        L6c:
            return r9
        L6d:
            egd r11 = r10.this$0     // Catch: java.lang.Throwable -> L1b
            sz9 r11 = r11.d     // Catch: java.lang.Throwable -> L1b
            int r11 = r11.j()     // Catch: java.lang.Throwable -> L1b
            egd r0 = r10.this$0     // Catch: java.lang.Throwable -> L1b
            int r11 = r11 + r8
            sz9 r0 = r0.d     // Catch: java.lang.Throwable -> L1b
            r0.k(r11)     // Catch: java.lang.Throwable -> L1b
            boolean r11 = r10.$userAction     // Catch: java.lang.Throwable -> L1b
            if (r11 == 0) goto L86
            x16 r11 = r10.$onUserCutCompleted     // Catch: java.lang.Throwable -> L1b
            r11.invoke()     // Catch: java.lang.Throwable -> L1b
        L86:
            a26 r11 = r10.$setCutCardStage
            r11.d(r1)
            egd r10 = r10.this$0
            r10.d(r2)
            wef r10 = defpackage.wef.a
            return r10
        L93:
            a26 r0 = r10.$setCutCardStage
            r0.d(r1)
            egd r10 = r10.this$0
            r10.d(r2)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgd.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cgd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
