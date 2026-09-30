package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ym extends gbe implements o26 {
    final /* synthetic */ ph3 $decayAnimationSpec;
    final /* synthetic */ jmb $remainingVelocity;
    final /* synthetic */ vz $snapAnimationSpec;
    final /* synthetic */ mo $this_animateToWithDecay;
    final /* synthetic */ float $velocity;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym(mo moVar, float f, vz vzVar, jmb jmbVar, ph3 ph3Var, xn2 xn2Var) {
        super(4, xn2Var);
        this.$this_animateToWithDecay = moVar;
        this.$velocity = f;
        this.$snapAnimationSpec = vzVar;
        this.$remainingVelocity = jmbVar;
        this.$decayAnimationSpec = ph3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ae, code lost:
    
        if (defpackage.hkg.T(r0, r1, false, r6, r14) == r13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c0, code lost:
    
        if (defpackage.jn.a(r6, r7, r8, r9, r10, r11, r12) == r13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d6, code lost:
    
        if (defpackage.jn.a(r6, r7, r8, r9, r10, r11, r12) == r13) goto L43;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ym.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        ym ymVar = new ym(this.$this_animateToWithDecay, this.$velocity, this.$snapAnimationSpec, this.$remainingVelocity, this.$decayAnimationSpec, (xn2) obj4);
        ymVar.L$0 = (ho) obj;
        ymVar.L$1 = (hq3) obj2;
        ymVar.L$2 = obj3;
        return ymVar.r(wef.a);
    }
}
