package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zfd extends czb implements l26 {
    final /* synthetic */ long $longPressTimeout;
    final /* synthetic */ x16 $onHaptic;
    final /* synthetic */ egd $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zfd(egd egdVar, long j, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = egdVar;
        this.$longPressTimeout = j;
        this.$onHaptic = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        zfd zfdVar = new zfd(this.$state, this.$longPressTimeout, this.$onHaptic, xn2Var);
        zfdVar.L$0 = obj;
        return zfdVar;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f A[Catch: jia -> 0x0075, TRY_LEAVE, TryCatch #0 {jia -> 0x0075, blocks: (B:10:0x0025, B:22:0x0058, B:24:0x005c, B:26:0x0064, B:28:0x006f, B:19:0x0046), top: B:44:0x000e }] */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008a, code lost:
    
        if (r11 == r7) goto L35;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r11) throws java.lang.Exception {
        /*
            r10 = this;
            java.lang.Object r0 = r10.L$0
            mbe r0 = (defpackage.mbe) r0
            int r1 = r10.label
            wef r2 = defpackage.wef.a
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            bw2 r7 = defpackage.bw2.a
            if (r1 == 0) goto L2d
            if (r1 == r5) goto L29
            if (r1 == r4) goto L25
            if (r1 != r3) goto L1f
            java.lang.Object r0 = r10.L$1
            jia r0 = (defpackage.jia) r0
            defpackage.jzb.q(r11)
            goto L8d
        L1f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r10)
            return r6
        L25:
            defpackage.jzb.q(r11)     // Catch: defpackage.jia -> L75
            goto L58
        L29:
            defpackage.jzb.q(r11)
            goto L3b
        L2d:
            defpackage.jzb.q(r11)
            r10.L$0 = r0
            r10.label = r5
            java.lang.Object r11 = defpackage.ffe.b(r0, r10, r4)
            if (r11 != r7) goto L3b
            goto L8c
        L3b:
            egd r11 = r10.$state
            hgd r11 = r11.a()
            hgd r1 = defpackage.hgd.b
            if (r11 == r1) goto L46
            goto La0
        L46:
            long r8 = r10.$longPressTimeout     // Catch: defpackage.jia -> L75
            yfd r11 = new yfd     // Catch: defpackage.jia -> L75
            r11.<init>(r4, r6)     // Catch: defpackage.jia -> L75
            r10.L$0 = r0     // Catch: defpackage.jia -> L75
            r10.label = r4     // Catch: defpackage.jia -> L75
            java.lang.Object r11 = r0.d(r8, r11, r10)     // Catch: defpackage.jia -> L75
            if (r11 != r7) goto L58
            goto L8c
        L58:
            oia r11 = (defpackage.oia) r11     // Catch: defpackage.jia -> L75
            if (r11 == 0) goto La0
            egd r11 = r10.$state     // Catch: defpackage.jia -> L75
            boolean r11 = r11.b()     // Catch: defpackage.jia -> L75
            if (r11 != 0) goto La0
            x16 r11 = r10.$onHaptic     // Catch: defpackage.jia -> L75
            r11.invoke()     // Catch: defpackage.jia -> L75
            egd r11 = r10.$state     // Catch: defpackage.jia -> L75
            bv9 r11 = r11.h     // Catch: defpackage.jia -> L75
            if (r11 == 0) goto La0
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch: defpackage.jia -> L75
            r11.d(r1)     // Catch: defpackage.jia -> L75
            return r2
        L75:
            egd r11 = r10.$state
            ffd r11 = r11.i
            if (r11 == 0) goto L7e
            r11.invoke()
        L7e:
            r10.L$0 = r6
            r10.L$1 = r6
            r10.label = r3
            iia r11 = defpackage.iia.b
            java.lang.Object r11 = defpackage.ffe.j(r0, r11, r10)
            if (r11 != r7) goto L8d
        L8c:
            return r7
        L8d:
            oia r11 = (defpackage.oia) r11
            egd r10 = r10.$state
            if (r11 == 0) goto L94
            goto L95
        L94:
            r5 = 0
        L95:
            h6b r10 = r10.j
            if (r10 == 0) goto La0
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r5)
            r10.d(r11)
        La0:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zfd.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zfd) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
