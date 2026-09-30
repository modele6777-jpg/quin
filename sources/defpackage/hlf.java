package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hlf implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ awe b;

    public hlf(xj5 xj5Var, awe aweVar) {
        this.a = xj5Var;
        this.b = aweVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        glf glfVar;
        if (xn2Var instanceof glf) {
            glfVar = (glf) xn2Var;
            int i = glfVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                glfVar.label = i - Integer.MIN_VALUE;
            } else {
                glfVar = new glf(this, xn2Var);
            }
        } else {
            glfVar = new glf(this, xn2Var);
        }
        Object obj2 = glfVar.result;
        int i2 = glfVar.label;
        if (i2 == 0) {
            jzb.q(obj2);
            iy9 iy9Var = new iy9(this.b.b(), (zve) obj);
            glfVar.L$0 = null;
            glfVar.L$1 = null;
            glfVar.L$2 = null;
            glfVar.L$3 = null;
            glfVar.label = 1;
            Object objA = this.a.a(iy9Var, glfVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
