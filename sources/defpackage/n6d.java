package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n6d extends gbe implements l26 {
    final /* synthetic */ a26 $reportGenerationStatus;
    final /* synthetic */ lbd $shareViewModel;
    final /* synthetic */ boolean $useUnifiedPreview;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n6d(boolean z, a26 a26Var, lbd lbdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$useUnifiedPreview = z;
        this.$reportGenerationStatus = a26Var;
        this.$shareViewModel = lbdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new n6d(this.$useUnifiedPreview, this.$reportGenerationStatus, this.$shareViewModel, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object ladVar;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        boolean z = this.$useUnifiedPreview;
        wef wefVar = wef.a;
        if (!z) {
            return wefVar;
        }
        a26 a26Var = this.$reportGenerationStatus;
        int iOrdinal = ((abd) this.$shareViewModel.v.getValue()).ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            ladVar = mad.a;
        } else if (iOrdinal == 2) {
            ladVar = nad.a;
        } else {
            if (iOrdinal != 3) {
                ap.c();
                return null;
            }
            ladVar = new lad(new yv9(0, this.$shareViewModel, lbd.class, "load", "load()V", 0, 11));
        }
        a26Var.d(ladVar);
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        n6d n6dVar = (n6d) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        n6dVar.r(wefVar);
        return wefVar;
    }
}
