package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tu5 extends gbe implements l26 {
    final /* synthetic */ imb $firstResume;
    long J$0;
    int label;
    final /* synthetic */ vu5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tu5(vu5 vu5Var, imb imbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = vu5Var;
        this.$firstResume = imbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new tu5(this.this$0, this.$firstResume, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0076  */
    /* JADX WARN: Code duplicated, block: B:28:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
    
        if (r1.g(r18) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0092, code lost:
    
        if (defpackage.vfh.q(r6, r18) == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0094, code lost:
    
        return r5;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:28:0x007e, please report this as an issue */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0092 -> B:35:0x0095). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r0.label
            r2 = 0
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L1f
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L14
            defpackage.jzb.q(r19)
            goto L95
        L14:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r0)
            r0 = 0
            return r0
        L1b:
            defpackage.jzb.q(r19)
            goto L33
        L1f:
            defpackage.jzb.q(r19)
            vu5 r1 = r0.this$0
            boolean r6 = r1.W0
            if (r6 == 0) goto L33
            r1.W0 = r2
            r0.label = r4
            java.lang.Object r1 = r1.g(r0)
            if (r1 != r5) goto L33
            goto L94
        L33:
            imb r1 = r0.$firstResume
            boolean r1 = r1.element
            if (r1 != 0) goto L46
            vu5 r1 = r0.this$0
            java.lang.String r1 = r1.l()
            if (r1 == 0) goto L46
            vu5 r1 = r0.this$0
            r1.I()
        L46:
            imb r1 = r0.$firstResume
            r1.element = r2
        L4a:
            vu5 r1 = r0.this$0
            s0e r2 = r1.U0
        L4e:
            java.lang.Object r6 = r2.getValue()
            r7 = r6
            ju5 r7 = (defpackage.ju5) r7
            ax5 r8 = r7.d
            qs5 r12 = r1.P(r8)
            r16 = 0
            r17 = 1007(0x3ef, float:1.411E-42)
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            ju5 r7 = defpackage.ju5.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            boolean r6 = r2.l(r6, r7)
            if (r6 == 0) goto L4e
            vu5 r1 = r0.this$0
            mic r1 = r1.T0
            if (r1 == 0) goto La3
            java.time.LocalDateTime r2 = defpackage.xs5.a
            java.lang.Long r1 = defpackage.xs5.b(r1, r4)
            if (r1 == 0) goto La3
            long r1 = r1.longValue()
            r6 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r8 >= 0) goto L89
            goto L8a
        L89:
            r6 = r1
        L8a:
            r0.J$0 = r1
            r0.label = r3
            java.lang.Object r1 = defpackage.vfh.q(r6, r0)
            if (r1 != r5) goto L95
        L94:
            return r5
        L95:
            vu5 r1 = r0.this$0
            java.lang.String r1 = r1.l()
            if (r1 == 0) goto L4a
            vu5 r1 = r0.this$0
            r1.I()
            goto L4a
        La3:
            wef r0 = defpackage.wef.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tu5.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((tu5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
