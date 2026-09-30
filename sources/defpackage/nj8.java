package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nj8 extends gbe implements l26 {
    int label;
    final /* synthetic */ oj8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj8(oj8 oj8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = oj8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new nj8(this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    /* JADX WARN: Code duplicated, block: B:13:0x0024  */
    /* JADX WARN: Code duplicated, block: B:16:0x002d  */
    /* JADX WARN: Code duplicated, block: B:18:0x0033  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0031 -> B:11:0x001e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x003f -> B:21:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.jzb.q(r5)
            goto L42
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L17:
            defpackage.jzb.q(r5)
            goto L2d
        L1b:
            defpackage.jzb.q(r5)
        L1e:
            oj8 r5 = r4.this$0
            r41 r5 = r5.T0
            if (r5 == 0) goto L2d
            r4.label = r2
            java.lang.Object r5 = r5.m(r4)
            if (r5 != r3) goto L2d
            goto L41
        L2d:
            oj8 r5 = r4.this$0
            dfa r5 = r5.O0
            if (r5 == 0) goto L1e
            nd8 r5 = new nd8
            r0 = 5
            r5.<init>(r0)
            r4.label = r1
            java.lang.Object r5 = defpackage.tm7.Q(r5, r4)
            if (r5 != r3) goto L42
        L41:
            return r3
        L42:
            oj8 r5 = r4.this$0
            dfa r5 = r5.O0
            if (r5 == 0) goto L1e
            ffa r5 = (defpackage.ffa) r5
            r5.d()
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nj8.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((nj8) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
