package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nfe extends gbe implements l26 {
    final /* synthetic */ String $patternId;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nfe(String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$patternId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nfe nfeVar = new nfe(this.$patternId, xn2Var);
        nfeVar.L$0 = obj;
        return nfeVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (this.$patternId != null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (String str2 : v4e.U(str)) {
            if (v4e.e0(str2, '#')) {
                break;
            }
            sb.append(str2);
            sb.append("\n");
        }
        return new e2a(sb.toString(), null, pu4.a);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nfe) k((xn2) obj2, (String) obj)).r(wef.a);
    }
}
