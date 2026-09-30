package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h99 {
    public final /* synthetic */ int a;
    public final sh0 b;
    public final Object c;

    public h99(d99 d99Var) {
        this.a = 0;
        d99Var.getClass();
        this.c = d99Var;
        this.b = vpf.m(false);
    }

    public final boolean a() {
        int i = this.a;
        sh0 sh0Var = this.b;
        switch (i) {
            case 0:
                break;
        }
        return sh0Var.b();
    }

    public final boolean b() {
        switch (this.a) {
            case 0:
                if (!this.b.a()) {
                    return false;
                }
                ((d99) this.c).h(null);
                return true;
            default:
                if (!this.b.a()) {
                    return false;
                }
                kzf kzfVar = (kzf) this.c;
                synchronized (kzfVar.c) {
                    int i = kzfVar.d - 1;
                    kzfVar.d = i;
                    if (i == 0 && !kzfVar.f) {
                        kzfVar.e = ynb.V(kzfVar.a, null, null, new izf(kzfVar, null), 3);
                    }
                    break;
                }
                return true;
        }
    }

    public h99(kzf kzfVar) {
        this.a = 1;
        this.c = kzfVar;
        this.b = vpf.m(false);
    }
}
