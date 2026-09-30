package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lq6 extends gbe implements l26 {
    final /* synthetic */ e3b $clock;
    final /* synthetic */ x16 $refreshTargets;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lq6(x16 x16Var, e3b e3bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$refreshTargets = x16Var;
        this.$clock = e3bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lq6 lq6Var = new lq6(this.$refreshTargets, this.$clock, xn2Var);
        lq6Var.L$0 = obj;
        return lq6Var;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    /* JADX WARN: Code duplicated, block: B:22:0x006c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0077 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0075 -> B:26:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            java.lang.Long r0 = (java.lang.Long) r0
            int r1 = r8.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L22
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            defpackage.jzb.q(r9)
            goto L78
        L15:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r4
        L1b:
            defpackage.jzb.q(r9)
            defpackage.oo3.f()
            return r4
        L22:
            defpackage.jzb.q(r9)
            x16 r9 = r8.$refreshTargets
            r9.invoke()
            if (r0 == 0) goto L34
            r8.L$0 = r4
            r8.label = r3
            defpackage.vfh.o(r8)
            return r5
        L34:
            java.time.LocalTime r9 = defpackage.e73.a
            e3b r9 = r8.$clock
            java.time.LocalDateTime r9 = defpackage.e3b.a(r9)
            java.time.LocalDate r0 = r9.toLocalDate()
            java.time.LocalTime r1 = defpackage.e73.a
            java.time.LocalDateTime r0 = r0.atTime(r1)
            int r1 = r9.compareTo(r0)
            r6 = 1
            if (r1 >= 0) goto L52
        L4e:
            r0.getClass()
            goto L5f
        L52:
            java.time.LocalDate r0 = r9.toLocalDate()
            java.time.LocalDate r0 = r0.plusDays(r6)
            java.time.LocalDateTime r0 = r0.atStartOfDay()
            goto L4e
        L5f:
            java.time.Duration r9 = java.time.Duration.between(r9, r0)
            long r0 = r9.toMillis()
            int r9 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r9 >= 0) goto L6c
            goto L6d
        L6c:
            r6 = r0
        L6d:
            r8.L$0 = r4
            r8.label = r2
            java.lang.Object r9 = defpackage.vfh.q(r6, r8)
            if (r9 != r5) goto L78
            return r5
        L78:
            x16 r9 = r8.$refreshTargets
            r9.invoke()
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lq6.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((lq6) k((xn2) obj2, (Long) obj)).r(wef.a);
        return bw2.a;
    }
}
