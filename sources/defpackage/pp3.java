package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pp3 implements u91 {
    public final Executor a;
    public final u91 b;

    public pp3(Executor executor, u91 u91Var) {
        this.a = executor;
        this.b = u91Var;
    }

    @Override // defpackage.u91
    public final btb C0() {
        return this.b.C0();
    }

    @Override // defpackage.u91
    public final boolean U() {
        return this.b.U();
    }

    @Override // defpackage.u91
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.u91
    public final u91 clone() {
        return new pp3(this.a, this.b.clone());
    }

    @Override // defpackage.u91
    public final void x(ha1 ha1Var) {
        this.b.x(new k47(this, ha1Var));
    }
}
