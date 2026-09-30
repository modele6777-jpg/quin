package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class br1 extends gbe implements l26 {
    final /* synthetic */ jx $animatable;
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ l77 $interaction;
    final /* synthetic */ float $target;
    int label;
    final /* synthetic */ cr1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public br1(jx jxVar, float f, boolean z, cr1 cr1Var, l77 l77Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$animatable = jxVar;
        this.$target = f;
        this.$enabled = z;
        this.this$0 = cr1Var;
        this.$interaction = l77Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new br1(this.$animatable, this.$target, this.$enabled, this.this$0, this.$interaction, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0043, code lost:
    
        if (r0.g(r7, r1) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a0, code lost:
    
        if (defpackage.ys4.a(r8, r0, r1, r3, r7) == r4) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a2, code lost:
    
        return r4;
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
            if (r0 == 0) goto L17
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L12:
            defpackage.jzb.q(r8)
            goto La3
        L17:
            defpackage.jzb.q(r8)
            jx r8 = r7.$animatable
            vz9 r8 = r8.e
            java.lang.Object r8 = r8.getValue()
            yi4 r8 = (defpackage.yi4) r8
            float r8 = r8.a
            float r0 = r7.$target
            boolean r8 = defpackage.yi4.b(r8, r0)
            if (r8 != 0) goto La3
            boolean r8 = r7.$enabled
            jx r0 = r7.$animatable
            bw2 r4 = defpackage.bw2.a
            if (r8 != 0) goto L46
            float r8 = r7.$target
            yi4 r1 = new yi4
            r1.<init>(r8)
            r7.label = r3
            java.lang.Object r7 = r0.g(r7, r1)
            if (r7 != r4) goto La3
            goto La2
        L46:
            vz9 r8 = r0.e
            java.lang.Object r8 = r8.getValue()
            yi4 r8 = (defpackage.yi4) r8
            float r8 = r8.a
            cr1 r0 = r7.this$0
            r0.getClass()
            r0 = 0
            boolean r3 = defpackage.yi4.b(r8, r0)
            if (r3 == 0) goto L64
            pta r1 = new pta
            r5 = 0
            r1.<init>(r5)
            goto L94
        L64:
            cr1 r3 = r7.this$0
            float r3 = r3.b
            boolean r3 = defpackage.yi4.b(r8, r3)
            if (r3 == 0) goto L74
            yq6 r1 = new yq6
            r1.<init>()
            goto L94
        L74:
            cr1 r3 = r7.this$0
            r3.getClass()
            boolean r0 = defpackage.yi4.b(r8, r0)
            if (r0 == 0) goto L85
            rn5 r1 = new rn5
            r1.<init>()
            goto L94
        L85:
            cr1 r0 = r7.this$0
            float r0 = r0.c
            boolean r8 = defpackage.yi4.b(r8, r0)
            if (r8 == 0) goto L94
            al4 r1 = new al4
            r1.<init>()
        L94:
            jx r8 = r7.$animatable
            float r0 = r7.$target
            l77 r3 = r7.$interaction
            r7.label = r2
            java.lang.Object r7 = defpackage.ys4.a(r8, r0, r1, r3, r7)
            if (r7 != r4) goto La3
        La2:
            return r4
        La3:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.br1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((br1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
