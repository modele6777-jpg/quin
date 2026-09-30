package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x1b extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ z1b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x1b(z1b z1bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = z1bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        x1b x1bVar = new x1b(this.this$0, xn2Var);
        x1bVar.L$0 = obj;
        return x1bVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object objF;
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
        wi1 wi1Var = (wi1) this.L$0;
        z1b z1bVar = this.this$0;
        this.label = 1;
        boolean z = wi1Var instanceof stb;
        bw2 bw2Var = bw2.a;
        if (z) {
            objF = z1bVar.h((stb) wi1Var, this);
            if (objF != bw2Var) {
                objF = wefVar;
            }
        } else if (wi1Var instanceof itb) {
            objF = z1bVar.e((itb) wi1Var, this);
            if (objF != bw2Var) {
                objF = wefVar;
            }
        } else if (wi1Var instanceof ktb) {
            objF = z1bVar.g((ktb) wi1Var, this);
            if (objF != bw2Var) {
                objF = wefVar;
            }
        } else {
            if (!(wi1Var instanceof jtb)) {
                z1bVar.getClass();
                ap.c();
                return null;
            }
            objF = z1bVar.f((jtb) wi1Var, this);
            if (objF != bw2Var) {
                objF = wefVar;
            }
        }
        return objF == bw2Var ? bw2Var : wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((x1b) k((xn2) obj2, (wi1) obj)).r(wef.a);
    }
}
