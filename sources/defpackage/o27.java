package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o27 extends gbe implements l26 {
    final /* synthetic */ e89 $toolingOverride;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ p27 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o27(e89 e89Var, p27 p27Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$toolingOverride = e89Var;
        this.this$0 = p27Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        o27 o27Var = new o27(this.$toolingOverride, this.this$0, xn2Var);
        o27Var.L$0 = obj;
        return o27Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0041 A[PHI: r9 r10
  0x0041: PHI (r9v2 jmb) = (r9v0 jmb), (r9v1 jmb), (r9v1 jmb), (r9v4 jmb) binds: [B:10:0x002f, B:15:0x005e, B:17:0x0078, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]
  0x0041: PHI (r10v2 aw2) = (r10v0 aw2), (r10v1 aw2), (r10v1 aw2), (r10v4 aw2) binds: [B:10:0x002f, B:15:0x005e, B:17:0x0078, B:6:0x000d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:14:0x0059 A[PHI: r9 r10
  0x0059: PHI (r9v1 jmb) = (r9v2 jmb), (r9v3 jmb) binds: [B:12:0x0056, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r10v1 aw2) = (r10v2 aw2), (r10v3 aw2) binds: [B:12:0x0056, B:9:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:16:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x005e -> B:11:0x0041). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0078 -> B:11:0x0041). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 0
            r2 = 1
            r3 = 2
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L21
            if (r0 != r3) goto L1b
            java.lang.Object r0 = r12.L$1
            jmb r0 = (defpackage.jmb) r0
            java.lang.Object r5 = r12.L$0
            aw2 r5 = (defpackage.aw2) r5
            defpackage.jzb.q(r13)
            r9 = r0
            r10 = r5
            goto L41
        L1b:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r1
        L21:
            java.lang.Object r0 = r12.L$1
            jmb r0 = (defpackage.jmb) r0
            java.lang.Object r5 = r12.L$0
            aw2 r5 = (defpackage.aw2) r5
            defpackage.jzb.q(r13)
            r9 = r0
            r10 = r5
            goto L59
        L2f:
            defpackage.jzb.q(r13)
            java.lang.Object r13 = r12.L$0
            aw2 r13 = (defpackage.aw2) r13
            jmb r0 = new jmb
            r0.<init>()
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.element = r5
            r10 = r13
            r9 = r0
        L41:
            e89 r7 = r12.$toolingOverride
            p27 r8 = r12.this$0
            wg r6 = new wg
            r11 = 17
            r6.<init>(r7, r8, r9, r10, r11)
            r12.L$0 = r10
            r12.L$1 = r9
            r12.label = r2
            java.lang.Object r13 = defpackage.y41.W(r6, r12)
            if (r13 != r4) goto L59
            goto L7a
        L59:
            float r13 = r9.element
            r0 = 0
            int r13 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r13 != 0) goto L41
            z04 r13 = new z04
            r13.<init>(r10, r2)
            ybc r13 = defpackage.jzb.p(r13)
            n27 r0 = new n27
            r0.<init>(r3, r1)
            r12.L$0 = r10
            r12.L$1 = r9
            r12.label = r3
            java.lang.Object r13 = defpackage.tm7.C(r13, r0, r12)
            if (r13 != r4) goto L41
        L7a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o27.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((o27) k((xn2) obj2, (aw2) obj)).r(wef.a);
        return bw2.a;
    }
}
