package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lse extends gbe implements l26 {
    final /* synthetic */ kta $$this$detectTapAndPress;
    final /* synthetic */ t69 $interactionSource;
    final /* synthetic */ long $offset;
    final /* synthetic */ jse $this_defaultDetectTextFieldTapGestures;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lse(kta ktaVar, jse jseVar, long j, t69 t69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$$this$detectTapAndPress = ktaVar;
        this.$this_defaultDetectTextFieldTapGestures = jseVar;
        this.$offset = j;
        this.$interactionSource = t69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lse lseVar = new lse(this.$$this$detectTapAndPress, this.$this_defaultDetectTextFieldTapGestures, this.$offset, this.$interactionSource, xn2Var);
        lseVar.L$0 = obj;
        return lseVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        if (((defpackage.u69) r3).a(r12, r11) == r4) goto L21;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r12)
            goto L65
        L11:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            return r1
        L17:
            defpackage.jzb.q(r12)
            goto L3f
        L1b:
            defpackage.jzb.q(r12)
            java.lang.Object r12 = r11.L$0
            aw2 r12 = (defpackage.aw2) r12
            kse r5 = new kse
            jse r6 = r11.$this_defaultDetectTextFieldTapGestures
            long r7 = r11.$offset
            t69 r9 = r11.$interactionSource
            r10 = 0
            r5.<init>(r6, r7, r9, r10)
            r0 = 3
            defpackage.ynb.V(r12, r1, r1, r5, r0)
            kta r12 = r11.$$this$detectTapAndPress
            r11.label = r3
            nta r12 = (defpackage.nta) r12
            java.lang.Object r12 = r12.d(r11)
            if (r12 != r4) goto L3f
            goto L64
        L3f:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            jse r0 = r11.$this_defaultDetectTextFieldTapGestures
            pta r0 = r0.w
            if (r0 == 0) goto L65
            t69 r3 = r11.$interactionSource
            if (r12 == 0) goto L55
            qta r12 = new qta
            r12.<init>(r0)
            goto L5a
        L55:
            ota r12 = new ota
            r12.<init>(r0)
        L5a:
            r11.label = r2
            u69 r3 = (defpackage.u69) r3
            java.lang.Object r12 = r3.a(r12, r11)
            if (r12 != r4) goto L65
        L64:
            return r4
        L65:
            jse r11 = r11.$this_defaultDetectTextFieldTapGestures
            r11.w = r1
            wef r11 = defpackage.wef.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lse.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lse) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
