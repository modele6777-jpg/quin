package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bwc extends gbe implements a26 {
    int label;
    final /* synthetic */ fwc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bwc(fwc fwcVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = fwcVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new bwc(this.this$0, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        if (i == 0) {
            jzb.q(obj);
            iy9 iy9VarH = this.this$0.h();
            if (iy9VarH != null) {
                fwc fwcVar = this.this$0;
                k00 k00Var = (k00) iy9VarH.a();
                long j = ((eue) iy9VarH.b()).a;
                rfa rfaVar = fwcVar.J0;
                if (rfaVar != null) {
                    this.label = 1;
                    Object objE = ((yfa) rfaVar).e(k00Var, j, this);
                    bw2 bw2Var = bw2.a;
                    if (objE != bw2Var) {
                        objE = wefVar;
                    }
                    if (objE == bw2Var) {
                        return bw2Var;
                    }
                }
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wefVar;
    }
}
