package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ux extends gbe implements l26 {
    final /* synthetic */ h0e $animSpec$delegate;
    final /* synthetic */ jx $animatable;
    final /* synthetic */ yv1 $channel;
    final /* synthetic */ h0e $listener$delegate;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux(yv1 yv1Var, jx jxVar, h0e h0eVar, h0e h0eVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$channel = yv1Var;
        this.$animatable = jxVar;
        this.$animSpec$delegate = h0eVar;
        this.$listener$delegate = h0eVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ux uxVar = new ux(this.$channel, this.$animatable, this.$animSpec$delegate, this.$listener$delegate, xn2Var);
        uxVar.L$0 = obj;
        return uxVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0036 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0034 -> B:12:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0036
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L14
            java.lang.Object r0 = r11.L$1
            k41 r0 = (defpackage.k41) r0
            java.lang.Object r3 = r11.L$0
            aw2 r3 = (defpackage.aw2) r3
            defpackage.jzb.q(r12)
            goto L37
        L14:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            return r1
        L1a:
            defpackage.jzb.q(r12)
            java.lang.Object r12 = r11.L$0
            aw2 r12 = (defpackage.aw2) r12
            yv1 r0 = r11.$channel
            k41 r0 = r0.iterator()
            r3 = r12
        L28:
            r11.L$0 = r3
            r11.L$1 = r0
            r11.label = r2
            java.lang.Object r12 = r0.b(r11)
            bw2 r4 = defpackage.bw2.a
            if (r12 != r4) goto L37
            return r4
        L37:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L63
            java.lang.Object r12 = r0.c()
            yv1 r4 = r11.$channel
            java.lang.Object r4 = r4.k()
            java.lang.Object r4 = defpackage.rw1.b(r4)
            if (r4 != 0) goto L51
            r6 = r12
            goto L52
        L51:
            r6 = r4
        L52:
            tx r5 = new tx
            jx r7 = r11.$animatable
            h0e r8 = r11.$animSpec$delegate
            h0e r9 = r11.$listener$delegate
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 3
            defpackage.ynb.V(r3, r1, r1, r5, r12)
            goto L28
        L63:
            wef r11 = defpackage.wef.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ux.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ux) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
