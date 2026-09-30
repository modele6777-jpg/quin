package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class awc extends gbe implements l26 {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ fwc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awc(fwc fwcVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = fwcVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        awc awcVar = new awc(this.this$0, xn2Var);
        awcVar.J$0 = ((hl9) obj).a;
        return awcVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
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
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        long j = ((hl9) obj).a;
        awc awcVar = new awc(this.this$0, (xn2) obj2);
        awcVar.J$0 = j;
        return awcVar.r(wef.a);
    }
}
