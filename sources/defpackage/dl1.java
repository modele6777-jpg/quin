package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dl1 extends gbe implements l26 {
    final /* synthetic */ mmb $snapshotImplementationMode;
    final /* synthetic */ wae $surfaceRequest;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl1(mmb mmbVar, wae waeVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$snapshotImplementationMode = mmbVar;
        this.$surfaceRequest = waeVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        dl1 dl1Var = new dl1(this.$snapshotImplementationMode, this.$surfaceRequest, xn2Var);
        dl1Var.L$0 = obj;
        return dl1Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        wy6 wy6Var = (wy6) ((iy9) this.L$0).a();
        mmb mmbVar = this.$snapshotImplementationMode;
        Object obj2 = mmbVar.element;
        boolean z = (obj2 == null || wy6Var == obj2) ? false : true;
        if (z) {
            wae waeVar = this.$surfaceRequest;
            waeVar.c();
            waeVar.i.b(null);
        } else {
            mmbVar.element = wy6Var;
        }
        return Boolean.valueOf(!z);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dl1) k((xn2) obj2, (iy9) obj)).r(wef.a);
    }
}
