package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hlc implements xj5 {
    public final /* synthetic */ ghc a;

    public hlc(ghc ghcVar) {
        this.a = ghcVar;
    }

    @Override // defpackage.xj5
    public final /* bridge */ /* synthetic */ Object a(Object obj, xn2 xn2Var) {
        return b(((Number) obj).intValue(), xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i, xn2 xn2Var) {
        glc glcVar;
        if (xn2Var instanceof glc) {
            glcVar = (glc) xn2Var;
            int i2 = glcVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                glcVar.label = i2 - Integer.MIN_VALUE;
            } else {
                glcVar = new glc(this, xn2Var);
            }
        } else {
            glcVar = new glc(this, xn2Var);
        }
        Object obj = glcVar.result;
        int i3 = glcVar.label;
        if (i3 == 0) {
            jzb.q(obj);
            glcVar.I$0 = i;
            glcVar.label = 1;
            ghc ghcVar = this.a;
            Object objS = eb3.S(ghcVar, i - ghcVar.a.j(), glcVar);
            bw2 bw2Var = bw2.a;
            if (objS == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
