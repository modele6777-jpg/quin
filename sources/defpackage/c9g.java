package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c9g extends gbe implements l26 {
    final /* synthetic */ mmb $motionDurationScaleImpl;
    final /* synthetic */ xjb $recomposer;
    final /* synthetic */ d9g $self;
    final /* synthetic */ x48 $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9g(mmb mmbVar, xjb xjbVar, x48 x48Var, d9g d9gVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$motionDurationScaleImpl = mmbVar;
        this.$recomposer = xjbVar;
        this.$source = x48Var;
        this.$self = d9gVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c9g(this.$motionDurationScaleImpl, this.$recomposer, this.$source, this.$self, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [d9g, w48] */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                l39 l39Var = (l39) this.$motionDurationScaleImpl.element;
                if (l39Var != null) {
                    l39Var.b = jgb.k(this.$recomposer.x);
                }
                xjb xjbVar = this.$recomposer;
                this.label = 1;
                xjbVar.getClass();
                Object objP0 = ynb.p0(xjbVar.a, new vjb(xjbVar, new wjb(xjbVar, null), tm7.J(getContext()), null), this);
                bw2 bw2Var = bw2.a;
                if (objP0 != bw2Var) {
                    objP0 = wefVar;
                }
                if (objP0 != bw2Var) {
                    objP0 = wefVar;
                }
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            h48 h48VarK = this.$source.k();
            this = this.$self;
            h48VarK.b(this);
            return wefVar;
        } catch (Throwable th) {
            this.$source.k().b(this.$self);
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c9g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
