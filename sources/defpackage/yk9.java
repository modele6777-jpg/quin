package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yk9 {
    public final s0e a;

    public yk9(int i) {
        this.a = t0e.a(new int[i]);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void a(y4f y4fVar, zn2 zn2Var) {
        xk9 xk9Var;
        if (zn2Var instanceof xk9) {
            xk9Var = (xk9) zn2Var;
            int i = xk9Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                xk9Var.label = i - Integer.MIN_VALUE;
            } else {
                xk9Var = new xk9(this, zn2Var);
            }
        } else {
            xk9Var = new xk9(this, zn2Var);
        }
        Object obj = xk9Var.result;
        int i2 = xk9Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            xk9Var.label = 1;
            this.a.b(y4fVar, xk9Var);
        } else if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
        } else {
            jzb.q(obj);
            oo3.f();
        }
    }
}
