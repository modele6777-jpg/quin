package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class zb9 {
    public szc a;
    public boolean b;

    public final void a() {
        szc szcVar = this.a;
        if (szcVar == null) {
            qc0.p("This input is not added to any dispatcher.");
            return;
        }
        if (!this.b) {
            szcVar.D(this, null);
        }
        ac9 ac9Var = (ac9) szcVar.c;
        r45 r45Var = (r45) szcVar.b;
        if (equals(ac9Var.h) && -1 == ac9Var.g) {
            xb9 xb9VarC = ac9Var.f;
            if (xb9VarC == null) {
                xb9VarC = ac9Var.c(-1);
            }
            ac9Var.f = null;
            ac9Var.g = 0;
            ac9Var.h = null;
            if (xb9VarC == null) {
                ((um9) r45Var.b).a.run();
            } else {
                xb9VarC.b();
            }
            ac9Var.a.n(null, bc9.Z);
        }
        this.b = false;
    }

    public void b(boolean z) {
    }
}
