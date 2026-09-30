package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wk5 implements xj5 {
    public final /* synthetic */ imb a;
    public final /* synthetic */ xj5 b;

    public wk5(imb imbVar, xj5 xj5Var) {
        this.a = imbVar;
        this.b = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        vk5 vk5Var;
        if (xn2Var instanceof vk5) {
            vk5Var = (vk5) xn2Var;
            int i = vk5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vk5Var.label = i - Integer.MIN_VALUE;
            } else {
                vk5Var = new vk5(this, xn2Var);
            }
        } else {
            vk5Var = new vk5(this, xn2Var);
        }
        Object obj2 = vk5Var.result;
        int i2 = vk5Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            this.a.element = false;
            vk5Var.L$0 = null;
            vk5Var.label = 1;
            Object objA = this.b.a(obj, vk5Var);
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
