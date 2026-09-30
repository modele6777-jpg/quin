package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l4a extends gbe implements l26 {
    final /* synthetic */ h0e $currentIsReady$delegate;
    final /* synthetic */ h0e $currentOnExposure$delegate;
    final /* synthetic */ boolean $isReady;
    final /* synthetic */ h48 $lifecycle;
    final /* synthetic */ h0e $lifecycleState$delegate;
    final /* synthetic */ e89 $reported$delegate;
    int I$0;
    int I$1;
    int I$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4a(boolean z, h48 h48Var, e89 e89Var, h0e h0eVar, h0e h0eVar2, h0e h0eVar3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isReady = z;
        this.$lifecycle = h48Var;
        this.$reported$delegate = e89Var;
        this.$lifecycleState$delegate = h0eVar;
        this.$currentIsReady$delegate = h0eVar2;
        this.$currentOnExposure$delegate = h0eVar3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new l4a(this.$isReady, this.$lifecycle, this.$reported$delegate, this.$lifecycleState$delegate, this.$currentIsReady$delegate, this.$currentOnExposure$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    /* JADX WARN: Code duplicated, block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x005c -> B:20:0x005f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            g48 r1 = defpackage.g48.e
            wef r2 = defpackage.wef.a
            r3 = 1
            if (r0 == 0) goto L1a
            if (r0 != r3) goto L13
            int r0 = r6.I$1
            int r4 = r6.I$0
            defpackage.jzb.q(r7)
            goto L5f
        L13:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L1a:
            defpackage.jzb.q(r7)
            boolean r7 = r6.$isReady
            if (r7 == 0) goto L89
            e89 r7 = r6.$reported$delegate
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L89
            h0e r7 = r6.$lifecycleState$delegate
            java.lang.Object r7 = r7.getValue()
            g48 r7 = (defpackage.g48) r7
            if (r7 == r1) goto L3a
            goto L89
        L3a:
            r7 = 2
            r0 = 0
            r4 = r7
        L3d:
            if (r0 >= r4) goto L61
            xn9 r7 = new xn9
            r5 = 28
            r7.<init>(r5)
            r6.I$0 = r4
            r6.I$1 = r0
            r6.I$2 = r0
            r6.label = r3
            pv2 r5 = r6.getContext()
            z09 r5 = defpackage.tm7.J(r5)
            java.lang.Object r7 = r5.g0(r6, r7)
            bw2 r5 = defpackage.bw2.a
            if (r7 != r5) goto L5f
            return r5
        L5f:
            int r0 = r0 + r3
            goto L3d
        L61:
            h0e r7 = r6.$currentIsReady$delegate
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L89
            h48 r7 = r6.$lifecycle
            a58 r7 = (defpackage.a58) r7
            g48 r7 = r7.i
            if (r7 != r1) goto L89
            e89 r7 = r6.$reported$delegate
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r7.setValue(r0)
            h0e r6 = r6.$currentOnExposure$delegate
            java.lang.Object r6 = r6.getValue()
            x16 r6 = (defpackage.x16) r6
            r6.invoke()
        L89:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l4a.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((l4a) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
