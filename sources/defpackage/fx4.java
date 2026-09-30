package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fx4 extends czb implements l26 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ gx4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx4(gx4 gx4Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = gx4Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        fx4 fx4Var = new fx4(this.this$0, xn2Var);
        fx4Var.L$0 = obj;
        return fx4Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x009b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x009d  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x00a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:19:0x0098). Please report as a decompilation issue!!! */
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
            r2 = 2
            r3 = 0
            r4 = 8
            r5 = 1
            if (r1 == 0) goto L2f
            if (r1 != r5) goto L28
            int r1 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            gx4 r12 = (defpackage.gx4) r12
            java.lang.Object r13 = r0.L$0
            dyc r13 = (defpackage.dyc) r13
            defpackage.jzb.q(r21)
            goto L98
        L28:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r0)
            r0 = 0
            return r0
        L2f:
            defpackage.jzb.q(r21)
            java.lang.Object r1 = r0.L$0
            dyc r1 = (defpackage.dyc) r1
            gx4 r6 = r0.this$0
            w79 r7 = r6.a
            long[] r7 = r7.a
            int r8 = r7.length
            int r8 = r8 - r2
            if (r8 < 0) goto La6
            r9 = r3
        L41:
            r10 = r7[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto La1
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r12
            r12 = r6
            r6 = r13
            r13 = r1
            r1 = r3
            r18 = r10
            r11 = r7
            r10 = r8
            r7 = r18
        L63:
            if (r1 >= r6) goto L9b
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L98
            int r3 = r9 << 3
            int r3 = r3 + r1
            kl8 r4 = new kl8
            w79 r14 = r12.a
            java.lang.Object[] r15 = r14.b
            r15 = r15[r3]
            java.lang.Object[] r14 = r14.c
            r3 = r14[r3]
            r4.<init>(r2, r15, r3)
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r1
            r0.label = r5
            r13.c(r0, r4)
            bw2 r0 = defpackage.bw2.a
            return r0
        L98:
            long r7 = r7 >> r4
            int r1 = r1 + r5
            goto L63
        L9b:
            if (r6 != r4) goto La6
            r8 = r10
            r7 = r11
            r6 = r12
            r1 = r13
        La1:
            if (r9 == r8) goto La6
            int r9 = r9 + 1
            goto L41
        La6:
            wef r0 = defpackage.wef.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fx4) k((xn2) obj2, (dyc) obj)).r(wef.a);
    }
}
