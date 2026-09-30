package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z47 extends i09 implements i4f {
    public g7g E0;
    public g7g Z;

    public z47() {
        rh5 rh5Var = m93.l;
        this.Z = rh5Var;
        this.E0 = rh5Var;
    }

    @Override // defpackage.i09
    public void d1() {
        n3d.s(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new y47(this, 1));
        m1();
    }

    @Override // defpackage.i09
    public void e1() {
        this.E0 = this.Z;
        n3d.u(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new y47(this, 0));
    }

    @Override // defpackage.i09
    public final void f1() {
        this.Z = m93.l;
    }

    public abstract g7g l1(g7g g7gVar);

    public void m1() {
        this.E0 = l1(this.Z);
        n3d.u(this, "androidx.compose.foundation.layout.ConsumedInsetsProvider", new y47(this, 0));
    }

    @Override // defpackage.i4f
    public final Object q() {
        return "androidx.compose.foundation.layout.ConsumedInsetsProvider";
    }
}
