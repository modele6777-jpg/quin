package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pk5 extends gbe implements n26 {

    /* JADX INFO: renamed from: $$v$c$kotlin-time-Duration$-timeout$0, reason: not valid java name */
    final /* synthetic */ long f4$$v$c$kotlintimeDuration$timeout$0;
    final /* synthetic */ wj5 $this_timeoutInternal;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pk5(long j, wj5 wj5Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.f4$$v$c$kotlintimeDuration$timeout$0 = j;
        this.$this_timeoutInternal = wj5Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        pk5 pk5Var = new pk5(this.f4$$v$c$kotlintimeDuration$timeout$0, this.$this_timeoutInternal, (xn2) obj3);
        pk5Var.L$0 = (aw2) obj;
        pk5Var.L$1 = (xj5) obj2;
        return pk5Var.r(wef.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0094 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:22:0x009d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0092 -> B:20:0x0095). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            aw2 r0 = (defpackage.aw2) r0
            java.lang.Object r1 = r12.L$1
            xj5 r1 = (defpackage.xj5) r1
            int r2 = r12.label
            r3 = 1
            r4 = 0
            r5 = 0
            if (r2 == 0) goto L28
            if (r2 != r3) goto L22
            int r0 = r12.I$0
            long r6 = r12.J$0
            java.lang.Object r2 = r12.L$3
            ytc r2 = (defpackage.ytc) r2
            java.lang.Object r2 = r12.L$2
            yv1 r2 = (defpackage.yv1) r2
            defpackage.jzb.q(r13)
            goto L95
        L22:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r5
        L28:
            defpackage.jzb.q(r13)
            long r6 = r12.f4$$v$c$kotlintimeDuration$timeout$0
            r8 = 0
            int r13 = defpackage.ar4.c(r6, r8)
            if (r13 <= 0) goto La0
            wj5 r13 = r12.$this_timeoutInternal
            wj5 r7 = defpackage.ym8.q(r13, r4)
            boolean r13 = r7 instanceof defpackage.cw1
            if (r13 == 0) goto L43
            r13 = r7
            cw1 r13 = (defpackage.cw1) r13
            goto L44
        L43:
            r13 = r5
        L44:
            if (r13 != 0) goto L51
            hw1 r6 = new hw1
            r10 = 0
            r11 = 14
            r8 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r13 = r6
        L51:
            yv1 r13 = r13.k(r0)
            long r6 = r12.f4$$v$c$kotlintimeDuration$timeout$0
            r2 = r13
            r0 = r4
        L59:
            ytc r13 = new ytc
            pv2 r8 = r12.getContext()
            r13.<init>(r8)
            kxa r8 = r2.i()
            nk5 r9 = new nk5
            r9.<init>(r1, r5)
            r13.g(r8, r9)
            ok5 r8 = new ok5
            r8.<init>(r6, r5)
            long r9 = defpackage.vfh.R(r6)
            defpackage.t72.L(r13, r9, r8)
            r12.L$0 = r5
            r12.L$1 = r1
            r12.L$2 = r2
            r12.L$3 = r5
            r12.J$0 = r6
            r12.I$0 = r0
            r12.I$1 = r4
            r12.I$2 = r4
            r12.label = r3
            java.lang.Object r13 = defpackage.ytc.d(r13, r12)
            bw2 r8 = defpackage.bw2.a
            if (r13 != r8) goto L95
            return r8
        L95:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 != 0) goto L59
            wef r12 = defpackage.wef.a
            return r12
        La0:
            kye r12 = new kye
            java.lang.String r13 = "Timed out immediately"
            r12.<init>(r13, r5)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk5.r(java.lang.Object):java.lang.Object");
    }
}
