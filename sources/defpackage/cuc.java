package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cuc extends gbe implements l26 {
    final /* synthetic */ jx $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ l77 $interaction;
    final /* synthetic */ e89 $lastInteraction$delegate;
    final /* synthetic */ float $target;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuc(jx jxVar, float f, boolean z, l77 l77Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$animatable = jxVar;
        this.$target = f;
        this.$enabled = z;
        this.$interaction = l77Var;
        this.$lastInteraction$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new cuc(this.$animatable, this.$target, this.$enabled, this.$interaction, this.$lastInteraction$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
    
        if (r6.g(r5, r3) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (defpackage.ys4.a(r2, r3, r6, r4, r5) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        return r0;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L12:
            defpackage.jzb.q(r6)
            goto L5c
        L16:
            defpackage.jzb.q(r6)
            jx r6 = r5.$animatable
            vz9 r6 = r6.e
            java.lang.Object r6 = r6.getValue()
            yi4 r6 = (defpackage.yi4) r6
            float r6 = r6.a
            float r0 = r5.$target
            boolean r6 = defpackage.yi4.b(r6, r0)
            if (r6 != 0) goto L63
            boolean r6 = r5.$enabled
            bw2 r0 = defpackage.bw2.a
            if (r6 != 0) goto L45
            jx r6 = r5.$animatable
            float r1 = r5.$target
            yi4 r3 = new yi4
            r3.<init>(r1)
            r5.label = r2
            java.lang.Object r6 = r6.g(r5, r3)
            if (r6 != r0) goto L5c
            goto L5b
        L45:
            e89 r6 = r5.$lastInteraction$delegate
            java.lang.Object r6 = r6.getValue()
            l77 r6 = (defpackage.l77) r6
            jx r2 = r5.$animatable
            float r3 = r5.$target
            l77 r4 = r5.$interaction
            r5.label = r1
            java.lang.Object r6 = defpackage.ys4.a(r2, r3, r6, r4, r5)
            if (r6 != r0) goto L5c
        L5b:
            return r0
        L5c:
            e89 r6 = r5.$lastInteraction$delegate
            l77 r5 = r5.$interaction
            r6.setValue(r5)
        L63:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cuc.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((cuc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
