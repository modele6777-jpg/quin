package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q95 {
    public Object a;

    public q95(Object obj) {
        this.a = obj;
    }

    public void a(l77 l77Var) {
        Object obj = this.a;
        if (obj == null) {
            this.a = l77Var;
            return;
        }
        if (obj instanceof x79) {
            ((x79) obj).e(l77Var);
            return;
        }
        if (obj.equals(l77Var)) {
            return;
        }
        x79 x79Var = mec.a;
        x79 x79Var2 = new x79(2);
        x79Var2.l((l77) obj);
        x79Var2.l(l77Var);
        this.a = x79Var2;
    }

    public void b(l77 l77Var) {
        Object obj = this.a;
        if (pa7.t(obj, l77Var)) {
            this.a = null;
            return;
        }
        if (obj instanceof x79) {
            x79 x79Var = (x79) obj;
            x79Var.m(l77Var);
            int i = x79Var.d;
            if (i == 0) {
                this.a = null;
            } else {
                if (i != 1) {
                    return;
                }
                this.a = x79Var.b();
            }
        }
    }
}
