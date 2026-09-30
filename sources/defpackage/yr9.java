package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yr9 implements i1b, ou3 {
    public static final ho7 c = new ho7(24);
    public static final fc2 d = new fc2(9);
    public mu3 a;
    public volatile i1b b;

    public yr9(ho7 ho7Var, i1b i1bVar) {
        this.a = ho7Var;
        this.b = i1bVar;
    }

    public final void a(mu3 mu3Var) {
        i1b i1bVar;
        i1b i1bVar2;
        i1b i1bVar3 = this.b;
        fc2 fc2Var = d;
        if (i1bVar3 != fc2Var) {
            mu3Var.i(i1bVar3);
            return;
        }
        synchronized (this) {
            i1bVar = this.b;
            if (i1bVar != fc2Var) {
                i1bVar2 = i1bVar;
            } else {
                this.a = new bo1(18, this.a, mu3Var);
                i1bVar2 = null;
            }
        }
        if (i1bVar2 != null) {
            mu3Var.i(i1bVar);
        }
    }

    @Override // defpackage.i1b
    public final Object get() {
        return this.b.get();
    }
}
