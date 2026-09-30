package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kqe extends gbe implements l26 {
    final /* synthetic */ t69 $interactionSource;
    final /* synthetic */ long $it;
    final /* synthetic */ e89 $pressedInteraction;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqe(e89 e89Var, long j, t69 t69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$pressedInteraction = e89Var;
        this.$it = j;
        this.$interactionSource = t69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kqe(this.$pressedInteraction, this.$it, this.$interactionSource, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0058  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (((defpackage.u69) r8).a(r0, r7) == r4) goto L24;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            java.lang.Object r0 = r7.L$0
            pta r0 = (defpackage.pta) r0
            defpackage.jzb.q(r8)
            goto L65
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L1b:
            java.lang.Object r0 = r7.L$0
            e89 r0 = (defpackage.e89) r0
            defpackage.jzb.q(r8)
            goto L49
        L23:
            defpackage.jzb.q(r8)
            e89 r8 = r7.$pressedInteraction
            java.lang.Object r8 = r8.getValue()
            pta r8 = (defpackage.pta) r8
            if (r8 == 0) goto L4d
            t69 r0 = r7.$interactionSource
            e89 r5 = r7.$pressedInteraction
            ota r6 = new ota
            r6.<init>(r8)
            if (r0 == 0) goto L4a
            r7.L$0 = r5
            r7.label = r3
            u69 r0 = (defpackage.u69) r0
            java.lang.Object r8 = r0.a(r6, r7)
            if (r8 != r4) goto L48
            goto L64
        L48:
            r0 = r5
        L49:
            r5 = r0
        L4a:
            r5.setValue(r1)
        L4d:
            pta r0 = new pta
            long r5 = r7.$it
            r0.<init>(r5)
            t69 r8 = r7.$interactionSource
            if (r8 == 0) goto L65
            r7.L$0 = r0
            r7.label = r2
            u69 r8 = (defpackage.u69) r8
            java.lang.Object r8 = r8.a(r0, r7)
            if (r8 != r4) goto L65
        L64:
            return r4
        L65:
            e89 r7 = r7.$pressedInteraction
            r7.setValue(r0)
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqe.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kqe) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
