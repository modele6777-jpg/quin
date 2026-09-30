package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xu2 extends gbe implements l26 {
    final /* synthetic */ k31 $bringIntoViewRequester;
    final /* synthetic */ tte $layoutResult;
    final /* synthetic */ sl9 $offsetMapping;
    final /* synthetic */ r38 $state;
    final /* synthetic */ zse $value;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu2(k31 k31Var, zse zseVar, r38 r38Var, tte tteVar, sl9 sl9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$bringIntoViewRequester = k31Var;
        this.$value = zseVar;
        this.$state = r38Var;
        this.$layoutResult = tteVar;
        this.$offsetMapping = sl9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xu2(this.$bringIntoViewRequester, this.$value, this.$state, this.$layoutResult, this.$offsetMapping, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        hkb hkbVarB;
        int i = this.label;
        wef wefVar = wef.a;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        k31 k31Var = this.$bringIntoViewRequester;
        zse zseVar = this.$value;
        o74 o74Var = this.$state.a;
        ste steVar = this.$layoutResult.a;
        sl9 sl9Var = this.$offsetMapping;
        this.label = 1;
        int iV = sl9Var.v(eue.f(zseVar.b));
        if (iV < steVar.a.a.b.length()) {
            hkbVarB = steVar.b(iV);
        } else {
            hkbVarB = iV != 0 ? steVar.b(iV - 1) : new hkb(0.0f, 0.0f, 1.0f, (int) (dpe.a((mue) o74Var.c, (sw3) o74Var.d, (xp5) o74Var.e) & 4294967295L));
        }
        Object objA = ((n31) k31Var).a(hkbVarB, this);
        bw2 bw2Var = bw2.a;
        if (objA != bw2Var) {
            objA = wefVar;
        }
        return objA == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xu2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
