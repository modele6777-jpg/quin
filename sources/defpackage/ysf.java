package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ysf extends i09 implements pn4 {
    public bx4 E0;
    public e45 F0;
    public scd G0;
    public g3f Z;

    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        vv7 vv7Var = (vv7) im2Var;
        vv7Var.a();
        g3f g3fVar = this.Z;
        wsf wsfVar = new wsf(this);
        scd scdVar = this.G0;
        f3f f3fVarA = g3fVar.a(wsfVar, scdVar.c() ? new y72(scdVar.f) : null, null, new xsf(this));
        scd scdVar2 = this.G0;
        long j = ((y72) f3fVarA.getValue()).a;
        di2 di2Var = scdVar2.c;
        if (scdVar2.d() && ((Boolean) ((vz9) di2Var.g).getValue()).booleanValue()) {
            j = ((y72) ((vz9) di2Var.v).getValue()).a;
        }
        if (scdVar2.d()) {
            scdVar2.f = j;
        }
        if (y72.c(j) == 0.0f) {
            return;
        }
        o3f o3fVar = ((cx4) this.E0).b;
        o3f o3fVar2 = ((f45) this.F0).c;
        sn4.y0(vv7Var, j, 0L, 0L, 0.0f, null, 0, 126);
    }
}
