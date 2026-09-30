package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qqe extends gbe implements l26 {
    /* synthetic */ long J$0;
    int label;
    final /* synthetic */ cre this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qqe(cre creVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = creVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        qqe qqeVar = new qqe(this.this$0, xn2Var);
        qqeVar.J$0 = ((hl9) obj).a;
        return qqeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            long j = this.J$0;
            cre creVar = this.this$0;
            this.J$0 = j;
            this.label = 1;
            if (creVar.t(this) != bw2Var) {
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
        iy9 iy9VarF = this.this$0.f();
        if (iy9VarF != null) {
            cre creVar2 = this.this$0;
            String str = (String) iy9VarF.a();
            long j2 = ((eue) iy9VarF.b()).a;
            rfa rfaVar = creVar2.i;
            if (rfaVar != null) {
                this.label = 2;
                Object objE = ((yfa) rfaVar).e(str, j2, this);
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
        qqe qqeVar = new qqe(this.this$0, (xn2) obj2);
        qqeVar.J$0 = j;
        return qqeVar.r(wef.a);
    }
}
