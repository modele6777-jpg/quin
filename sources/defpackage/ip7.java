package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ip7 extends czb implements l26 {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ jp7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip7(jp7 jp7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = jp7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ip7 ip7Var = new ip7(this.this$0, xn2Var);
        ip7Var.L$0 = obj;
        return ip7Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0052  */
    /* JADX WARN: Code duplicated, block: B:20:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0090  */
    /* JADX WARN: Code duplicated, block: B:23:0x0096  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0050 -> B:22:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0052 -> B:14:0x0063). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006c -> B:19:0x008b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            int r1 = r0.label
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2d
            if (r1 != r4) goto L26
            int r1 = r0.I$3
            int r5 = r0.I$2
            long r6 = r0.J$0
            int r8 = r0.I$1
            int r9 = r0.I$0
            java.lang.Object r10 = r0.L$2
            long[] r10 = (long[]) r10
            java.lang.Object r11 = r0.L$1
            java.lang.Object[] r11 = (java.lang.Object[]) r11
            java.lang.Object r12 = r0.L$0
            dyc r12 = (defpackage.dyc) r12
            defpackage.jzb.q(r20)
            goto L8b
        L26:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r0)
            r0 = 0
            return r0
        L2d:
            defpackage.jzb.q(r20)
            java.lang.Object r1 = r0.L$0
            dyc r1 = (defpackage.dyc) r1
            jp7 r5 = r0.this$0
            w79 r5 = r5.a
            java.lang.Object[] r6 = r5.b
            long[] r5 = r5.a
            int r7 = r5.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L99
            r8 = r2
        L42:
            r9 = r5[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L94
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r1
            r1 = r2
            r17 = r9
            r10 = r5
            r9 = r7
            r5 = r11
            r11 = r6
            r6 = r17
        L63:
            if (r1 >= r5) goto L8e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r6
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L8b
            int r2 = r8 << 3
            int r2 = r2 + r1
            r2 = r11[r2]
            r0.L$0 = r12
            r0.L$1 = r11
            r0.L$2 = r10
            r0.I$0 = r9
            r0.I$1 = r8
            r0.J$0 = r6
            r0.I$2 = r5
            r0.I$3 = r1
            r0.label = r4
            r12.c(r0, r2)
            bw2 r0 = defpackage.bw2.a
            return r0
        L8b:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L63
        L8e:
            if (r5 != r3) goto L99
            r7 = r9
            r5 = r10
            r6 = r11
            r1 = r12
        L94:
            if (r8 == r7) goto L99
            int r8 = r8 + 1
            goto L42
        L99:
            wef r0 = defpackage.wef.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip7.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ip7) k((xn2) obj2, (dyc) obj)).r(wef.a);
    }
}
