package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ga2 extends gbe implements l26 {
    final /* synthetic */ jse $selectionState;
    /* synthetic */ long J$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga2(jse jseVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$selectionState = jseVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ga2 ga2Var = new ga2(this.$selectionState, xn2Var);
        ga2Var.J$0 = ((hl9) obj).a;
        return ga2Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            long j = this.J$0;
            jse jseVar = this.$selectionState;
            this.J$0 = j;
            this.label = 1;
            jseVar.z();
            if (wefVar != bw2Var) {
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        jse jseVar2 = this.$selectionState;
        rfa rfaVar = jseVar2.f;
        if (rfaVar != null) {
            CharSequence charSequence = jseVar2.a.d().c;
            long j2 = this.$selectionState.a.d().d;
            this.label = 2;
            Object objE = ((yfa) rfaVar).e(charSequence, j2, this);
            if (objE != bw2Var) {
                objE = wefVar;
            }
            if (objE == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        long j = ((hl9) obj).a;
        ga2 ga2Var = new ga2(this.$selectionState, (xn2) obj2);
        ga2Var.J$0 = j;
        return ga2Var.r(wef.a);
    }
}
