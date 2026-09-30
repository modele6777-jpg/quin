package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zl3 extends gbe implements l26 {
    final /* synthetic */ ph3 $decaySpec;
    final /* synthetic */ h0e $focusIndexState;
    final /* synthetic */ gh6 $haptic;
    final /* synthetic */ s69 $lastFocus$delegate;
    final /* synthetic */ int $n;
    final /* synthetic */ n69 $offset$delegate;
    final /* synthetic */ h0e $onFocusIndexChangeState;
    final /* synthetic */ float $velocityPxPerSec;
    float F$0;
    float F$1;
    float F$2;
    float F$3;
    float F$4;
    int I$0;
    int I$1;
    int I$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl3(ph3 ph3Var, float f, int i, h0e h0eVar, gh6 gh6Var, h0e h0eVar2, n69 n69Var, s69 s69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$decaySpec = ph3Var;
        this.$velocityPxPerSec = f;
        this.$n = i;
        this.$focusIndexState = h0eVar;
        this.$haptic = gh6Var;
        this.$onFocusIndexChangeState = h0eVar2;
        this.$offset$delegate = n69Var;
        this.$lastFocus$delegate = s69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zl3(this.$decaySpec, this.$velocityPxPerSec, this.$n, this.$focusIndexState, this.$haptic, this.$onFocusIndexChangeState, this.$offset$delegate, this.$lastFocus$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f9, code lost:
    
        if (defpackage.hkg.S(((defpackage.qz9) r16.$offset$delegate).j(), r7, r10, r3, r16, 4) == r12) goto L22;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl3.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zl3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
