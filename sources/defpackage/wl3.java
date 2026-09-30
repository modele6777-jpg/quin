package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wl3 extends gbe implements l26 {
    final /* synthetic */ int $focusIndex;
    final /* synthetic */ s69 $lastFocus$delegate;
    final /* synthetic */ int $n;
    final /* synthetic */ n69 $offset$delegate;
    final /* synthetic */ yl3 $offsetAnim;
    final /* synthetic */ aw2 $scope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wl3(int i, int i2, yl3 yl3Var, aw2 aw2Var, s69 s69Var, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$focusIndex = i;
        this.$n = i2;
        this.$offsetAnim = yl3Var;
        this.$scope = aw2Var;
        this.$lastFocus$delegate = s69Var;
        this.$offset$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wl3(this.$focusIndex, this.$n, this.$offsetAnim, this.$scope, this.$lastFocus$delegate, this.$offset$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        int i = this.$focusIndex;
        s69 s69Var = this.$lastFocus$delegate;
        q03 q03Var = am3.a;
        int iJ = ((sz9) s69Var).j();
        wef wefVar = wef.a;
        if (i == iJ) {
            return wefVar;
        }
        int iJ2 = this.$focusIndex - ((sz9) this.$lastFocus$delegate).j();
        int i2 = this.$n;
        int i3 = iJ2 % i2;
        if (i3 > i2 / 2) {
            i3 -= i2;
        }
        if (i3 < (-i2) / 2) {
            i3 += i2;
        }
        float f = i2;
        float f2 = this.$focusIndex;
        float f3 = f / 2.0f;
        float fJ = ((((qz9) this.$offset$delegate).j() - this.$focusIndex) + f3) % f;
        if (fJ != 0.0f && Math.signum(fJ) != Math.signum(f)) {
            fJ += f;
        }
        float f4 = (fJ - f3) + f2;
        float f5 = this.$focusIndex;
        lyd lydVar = this.$offsetAnim.a;
        if (lydVar != null) {
            lydVar.h(null);
        }
        am3.b(this.$offset$delegate, f4);
        int iAbs = Math.abs(i3) - 1;
        if (iAbs < 0) {
            iAbs = 0;
        }
        int i4 = (iAbs * 30) + 300;
        this.$offsetAnim.a = ynb.V(this.$scope, null, null, new vl3(f4, f5, i4 > 700 ? 700 : i4, this.$offset$delegate, null), 3);
        ((sz9) this.$lastFocus$delegate).k(this.$focusIndex);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        wl3 wl3Var = (wl3) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        wl3Var.r(wefVar);
        return wefVar;
    }
}
