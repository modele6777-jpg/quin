package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dl5 implements xj5 {
    public final /* synthetic */ xj5 a;
    public final /* synthetic */ mmb b;

    public dl5(xj5 xj5Var, mmb mmbVar) {
        this.a = xj5Var;
        this.b = mmbVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, wef] */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        cl5 cl5Var;
        if (xn2Var instanceof cl5) {
            cl5Var = (cl5) xn2Var;
            int i = cl5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cl5Var.label = i - Integer.MIN_VALUE;
            } else {
                cl5Var = new cl5(this, xn2Var);
            }
        } else {
            cl5Var = new cl5(this, xn2Var);
        }
        Object obj2 = cl5Var.result;
        int i2 = cl5Var.label;
        try {
            if (i2 == 0) {
                jzb.q(obj2);
                xj5 xj5Var = this.a;
                cl5Var.L$0 = null;
                cl5Var.label = 1;
                Object objA = xj5Var.a(obj, cl5Var);
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
            this = wef.a;
            return this;
        } catch (Throwable th) {
            this.b.element = th;
            throw th;
        }
    }
}
