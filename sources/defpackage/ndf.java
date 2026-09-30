package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ndf extends gbe implements l26 {
    final /* synthetic */ e89 $previewContentReady$delegate;
    final /* synthetic */ vad $session;
    final /* synthetic */ boolean $sheetSettled;
    final /* synthetic */ mmb $sheetState;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ndf(boolean z, vad vadVar, mmb mmbVar, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sheetSettled = z;
        this.$session = vadVar;
        this.$sheetState = mmbVar;
        this.$previewContentReady$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ndf ndfVar = new ndf(this.$sheetSettled, this.$session, this.$sheetState, this.$previewContentReady$delegate, xn2Var);
        ndfVar.L$0 = obj;
        return ndfVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            if (this.$sheetSettled) {
                try {
                    Object obj2 = this.$sheetState.element;
                    if (obj2 == null) {
                        pa7.g0("sheetState");
                        throw null;
                    }
                    dzbVar = new Float(((ted) obj2).d.f());
                    if (dzbVar instanceof dzb) {
                        dzbVar = null;
                    }
                    Float f = (Float) dzbVar;
                    if (f != null) {
                        this.$session.g = Float.valueOf(f.floatValue());
                    }
                    if (!((Boolean) this.$previewContentReady$delegate.getValue()).booleanValue()) {
                        k8f k8fVar = new k8f(4);
                        this.L$0 = null;
                        this.label = 1;
                        Object objG0 = tm7.J(getContext()).g0(this, k8fVar);
                        bw2 bw2Var = bw2.a;
                        if (objG0 == bw2Var) {
                            return bw2Var;
                        }
                    }
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
            }
            return wefVar;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$previewContentReady$delegate.setValue(Boolean.TRUE);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ndf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
