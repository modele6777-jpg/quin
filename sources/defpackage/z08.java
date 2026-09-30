package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z08 extends m4 {
    public final /* synthetic */ int X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ j18 Z;
    public final w08 c;
    public final uz7 d;
    public final long e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ uz7 g;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;
    public final /* synthetic */ xi x;
    public final /* synthetic */ kx0 y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z08(long j, boolean z, w08 w08Var, uz7 uz7Var, int i, int i2, xi xiVar, kx0 kx0Var, int i3, int i4, long j2, j18 j18Var) {
        super(3);
        this.f = z;
        this.g = uz7Var;
        this.v = i;
        this.w = i2;
        this.x = xiVar;
        this.y = kx0Var;
        this.z = i3;
        this.X = i4;
        this.Y = j2;
        this.Z = j18Var;
        this.c = w08Var;
        this.d = uz7Var;
        this.e = ll2.b(0, z ? kl2.h(j) : Integer.MAX_VALUE, 0, z ? Integer.MAX_VALUE : kl2.g(j), 5);
    }

    public final c18 B0(int i, long j) {
        w08 w08Var = this.c;
        Object objB = w08Var.b(i);
        Object objZ = w08Var.b.z(i);
        return new c18(i, s0(this.d, i, j), this.f, this.x, this.y, this.g.b.getLayoutDirection(), this.z, this.X, i == this.v + (-1) ? 0 : this.w, this.Y, objB, objZ, this.Z.o, j);
    }

    @Override // defpackage.m4
    public final vz7 q0(int i, int i2, int i3, long j) {
        return B0(i, j);
    }
}
