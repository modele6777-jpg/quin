package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ux9 extends gbe implements l26 {
    final /* synthetic */ vz $animationSpec;
    final /* synthetic */ int $targetPage;
    final /* synthetic */ float $targetPageOffsetToSnappedPosition;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yx9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux9(yx9 yx9Var, int i, float f, vz vzVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yx9Var;
        this.$targetPage = i;
        this.$targetPageOffsetToSnappedPosition = f;
        this.$animationSpec = vzVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ux9 ux9Var = new ux9(this.this$0, this.$targetPage, this.$targetPageOffsetToSnappedPosition, this.$animationSpec, xn2Var);
        ux9Var.L$0 = obj;
        return ux9Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006f A[PHI: r0
  0x006f: PHI (r0v4 int) = (r0v3 int), (r0v5 int) binds: [B:27:0x0074, B:24:0x006d] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i;
        int i2;
        int i3 = this.label;
        wef wefVar = wef.a;
        int i4 = 1;
        if (i3 != 0) {
            if (i3 == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        fhc fhcVar = (fhc) this.L$0;
        yx9 yx9Var = this.this$0;
        d18 d18Var = new d18(fhcVar, yx9Var, i4);
        int i5 = this.$targetPage;
        float f = this.$targetPageOffsetToSnappedPosition;
        vz vzVar = this.$animationSpec;
        this.label = 1;
        zx9 zx9Var = ay9.a;
        yx9Var.q.k(yx9Var.j(new Integer(i5).intValue()));
        boolean z = i5 > yx9Var.e;
        int iE = (d18Var.e() - yx9Var.e) + 1;
        if (((z && i5 > d18Var.e()) || (!z && i5 < yx9Var.e)) && Math.abs(i5 - yx9Var.e) >= 3) {
            if (z) {
                i2 = i5 - iE;
                i = yx9Var.e;
                if (i2 < i) {
                    i2 = i;
                }
            } else {
                int i6 = iE + i5;
                i = yx9Var.e;
                if (i6 > i) {
                    i2 = i;
                } else {
                    i2 = i6;
                }
            }
            d18Var.f(i2, 0);
        }
        Object objS = hkg.S(0.0f, d18Var.b(i5) + f, vzVar, new rk6(18, new jmb(), d18Var), this, 4);
        bw2 bw2Var = bw2.a;
        if (objS != bw2Var) {
            objS = wefVar;
        }
        return objS == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ux9) k((xn2) obj2, (fhc) obj)).r(wef.a);
    }
}
