package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y79 extends czb implements l26 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a89 this$0;
    final /* synthetic */ z79 this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y79(a89 a89Var, z79 z79Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = a89Var;
        this.this$1 = z79Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        y79 y79Var = new y79(this.this$0, this.this$1, xn2Var);
        y79Var.L$0 = obj;
        return y79Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0057  */
    /* JADX WARN: Code duplicated, block: B:20:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0055 -> B:22:0x00a7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0057 -> B:14:0x006b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0074 -> B:19:0x009b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.label
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L32
            if (r1 != r4) goto L2b
            int r1 = r0.I$3
            int r5 = r0.I$2
            long r6 = r0.J$0
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$3
            long[] r10 = (long[]) r10
            java.lang.Object r11 = r0.L$2
            a89 r11 = (defpackage.a89) r11
            java.lang.Object r12 = r0.L$1
            z79 r12 = (defpackage.z79) r12
            java.lang.Object r13 = r0.L$0
            dyc r13 = (defpackage.dyc) r13
            defpackage.jzb.q(r21)
            goto L9b
        L2b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r0)
            r0 = 0
            return r0
        L32:
            defpackage.jzb.q(r21)
            java.lang.Object r1 = r0.L$0
            dyc r1 = (defpackage.dyc) r1
            a89 r5 = r0.this$0
            x79 r6 = r5.b
            z79 r7 = r0.this$1
            long[] r6 = r6.a
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto Lac
            r9 = r2
        L47:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La7
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r9
            r9 = r8
            r8 = r13
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r7
            r6 = r18
        L6b:
            if (r1 >= r5) goto L9e
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L9b
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.a = r2
            x79 r3 = r11.b
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.L$3 = r10
            r0.I$0 = r9
            r0.I$1 = r8
            r0.J$0 = r6
            r0.I$2 = r5
            r0.I$3 = r1
            r0.label = r4
            r13.c(r0, r2)
            bw2 r0 = defpackage.bw2.a
            return r0
        L9b:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L6b
        L9e:
            if (r5 != r3) goto Lac
            r1 = r9
            r9 = r8
            r8 = r1
            r6 = r10
            r5 = r11
            r7 = r12
            r1 = r13
        La7:
            if (r9 == r8) goto Lac
            int r9 = r9 + 1
            goto L47
        Lac:
            wef r0 = defpackage.wef.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y79.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y79) k((xn2) obj2, (dyc) obj)).r(wef.a);
    }
}
