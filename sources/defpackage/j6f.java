package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j6f extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ t6f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6f(t6f t6fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = t6fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        j6f j6fVar = new j6f(this.this$0, xn2Var);
        j6fVar.L$0 = obj;
        return j6fVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object value;
        w6f w6fVarA;
        xha xhaVar = (xha) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        w6f w6fVar = (w6f) this.this$0.X.getValue();
        String str = w6fVar.a;
        wef wefVar = wef.a;
        if (str != null) {
            String str2 = xhaVar.f;
            if (str2 != null && w6fVar.b != d6f.d) {
                t6f t6fVar = this.this$0;
                t6fVar.a(str, str2, t6fVar.g);
                return wefVar;
            }
            s0e s0eVar = this.this$0.X;
            do {
                value = s0eVar.getValue();
                w6fVarA = (w6f) value;
                if (w6fVarA.a != null) {
                    w6fVarA = w6f.a(w6fVarA, null, xhaVar.c, xhaVar.d, xhaVar.e, 3);
                }
            } while (!s0eVar.l(value, w6fVarA));
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        j6f j6fVar = (j6f) k((xn2) obj2, (xha) obj);
        wef wefVar = wef.a;
        j6fVar.r(wefVar);
        return wefVar;
    }
}
