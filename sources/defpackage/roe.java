package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class roe extends gbe implements l26 {
    final /* synthetic */ boolean $isFromHardwareSource;
    final /* synthetic */ lo7 $keyCommand;
    int label;
    final /* synthetic */ ape this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roe(lo7 lo7Var, ape apeVar, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.$keyCommand = lo7Var;
        this.this$0 = apeVar;
        this.$isFromHardwareSource = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new roe(this.$keyCommand, this.this$0, this.$isFromHardwareSource, xn2Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
    
        if (r5.d(r4) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        if (r5.s(r2, r4) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        if (r5.c(false, r4) == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        return r0;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 3
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L19
            if (r0 == r3) goto L15
            if (r0 == r2) goto L15
            if (r0 != r1) goto Le
            goto L15
        Le:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L15:
            defpackage.jzb.q(r5)
            goto L52
        L19:
            defpackage.jzb.q(r5)
            lo7 r5 = r4.$keyCommand
            int r5 = r5.ordinal()
            bw2 r0 = defpackage.bw2.a
            switch(r5) {
                case 17: goto L44;
                case 18: goto L35;
                case 19: goto L28;
                default: goto L27;
            }
        L27:
            goto L52
        L28:
            ape r5 = r4.this$0
            jse r5 = r5.H0
            r4.label = r2
            java.lang.Object r4 = r5.d(r4)
            if (r4 != r0) goto L52
            goto L51
        L35:
            ape r5 = r4.this$0
            jse r5 = r5.H0
            boolean r2 = r4.$isFromHardwareSource
            r4.label = r1
            java.lang.Object r4 = r5.s(r2, r4)
            if (r4 != r0) goto L52
            goto L51
        L44:
            ape r5 = r4.this$0
            jse r5 = r5.H0
            r4.label = r3
            r1 = 0
            java.lang.Object r4 = r5.c(r1, r4)
            if (r4 != r0) goto L52
        L51:
            return r0
        L52:
            wef r4 = defpackage.wef.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roe.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((roe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
