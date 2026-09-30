package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p98 {
    public final zk9 a;
    public boolean b;
    public int c = -1;
    public final /* synthetic */ q98 d;

    public p98(q98 q98Var, zk9 zk9Var) {
        this.d = q98Var;
        this.a = zk9Var;
    }

    public final void a(boolean z) {
        if (z == this.b) {
            return;
        }
        this.b = z;
        int i = z ? 1 : -1;
        q98 q98Var = this.d;
        int i2 = q98Var.c;
        q98Var.c = i + i2;
        if (!q98Var.d) {
            q98Var.d = true;
            while (true) {
                try {
                    int i3 = q98Var.c;
                    if (i2 == i3) {
                        break;
                    }
                    boolean z2 = i2 == 0 && i3 > 0;
                    boolean z3 = i2 > 0 && i3 == 0;
                    if (z2) {
                        q98Var.g();
                    } else if (z3) {
                        q98Var.h();
                    }
                    i2 = i3;
                } catch (Throwable th) {
                    q98Var.d = false;
                    throw th;
                }
            }
            q98Var.d = false;
        }
        if (this.b) {
            q98Var.c(this);
        }
    }

    public boolean c(x48 x48Var) {
        return false;
    }

    public abstract boolean d();

    public void b() {
    }
}
