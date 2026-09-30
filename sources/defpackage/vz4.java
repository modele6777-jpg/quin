package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class vz4 extends sv2 {
    public static final /* synthetic */ int f = 0;
    public long c;
    public boolean d;
    public ad0 e;

    @Override // defpackage.sv2
    public final sv2 c1(int i) {
        abg.p(i);
        return this;
    }

    public final void d1(boolean z) {
        long j = this.c - (z ? 4294967296L : 1L);
        this.c = j;
        if (j <= 0 && this.d) {
            shutdown();
        }
    }

    public final void e1(ca4 ca4Var) {
        ad0 ad0Var = this.e;
        if (ad0Var == null) {
            ad0Var = new ad0();
            this.e = ad0Var;
        }
        ad0Var.addLast(ca4Var);
    }

    public final void f1(boolean z) {
        this.c = (z ? 4294967296L : 1L) + this.c;
        if (z) {
            return;
        }
        this.d = true;
    }

    public abstract long g1();

    public final boolean h1() {
        ad0 ad0Var = this.e;
        if (ad0Var == null) {
            return false;
        }
        ca4 ca4Var = (ca4) (ad0Var.isEmpty() ? null : ad0Var.removeFirst());
        if (ca4Var == null) {
            return false;
        }
        ca4Var.run();
        return true;
    }

    public abstract void shutdown();
}
