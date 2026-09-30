package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lle6;", "Ls09;", "Lijd;", "ui"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
final /* data */ class le6 extends s09 {
    public final long E0;
    public final int F0;
    public final int G0;
    public final c82 H0;
    public final uu7 I0;
    public final boolean X;
    public final nqb Y;
    public final long Z;
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float v;
    public final float w;
    public final float x;
    public final long y;
    public final x4d z;

    public le6(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, long j, x4d x4dVar, boolean z, nqb nqbVar, long j2, long j3, int i, int i2, c82 c82Var, uu7 uu7Var) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.v = f8;
        this.w = f9;
        this.x = f10;
        this.y = j;
        this.z = x4dVar;
        this.X = z;
        this.Y = nqbVar;
        this.Z = j2;
        this.E0 = j3;
        this.F0 = i;
        this.G0 = i2;
        this.H0 = c82Var;
        this.I0 = uu7Var;
    }

    @Override // defpackage.s09
    public final i09 create() {
        ijd ijdVar = new ijd();
        ijdVar.Z = this.a;
        ijdVar.E0 = this.b;
        ijdVar.F0 = this.c;
        ijdVar.G0 = this.d;
        ijdVar.H0 = this.e;
        ijdVar.I0 = this.f;
        ijdVar.J0 = this.g;
        ijdVar.K0 = this.v;
        ijdVar.L0 = this.w;
        ijdVar.M0 = this.x;
        ijdVar.N0 = this.y;
        ijdVar.O0 = this.z;
        ijdVar.P0 = this.X;
        ijdVar.Q0 = this.Y;
        ijdVar.R0 = this.Z;
        ijdVar.S0 = this.E0;
        ijdVar.T0 = this.F0;
        ijdVar.U0 = this.G0;
        ijdVar.V0 = this.H0;
        ijdVar.W0 = this.I0;
        ijdVar.X0 = new ckb(24, ijdVar);
        return ijdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof le6)) {
            return false;
        }
        le6 le6Var = (le6) obj;
        if (Float.compare(this.a, le6Var.a) != 0 || Float.compare(this.b, le6Var.b) != 0 || Float.compare(this.c, le6Var.c) != 0 || Float.compare(this.d, le6Var.d) != 0 || Float.compare(this.e, le6Var.e) != 0 || Float.compare(this.f, le6Var.f) != 0 || Float.compare(this.g, le6Var.g) != 0 || Float.compare(this.v, le6Var.v) != 0 || Float.compare(this.w, le6Var.w) != 0 || Float.compare(this.x, le6Var.x) != 0 || !r2f.a(this.y, le6Var.y) || !pa7.t(this.z, le6Var.z) || this.X != le6Var.X || !pa7.t(this.Y, le6Var.Y)) {
            return false;
        }
        long j = le6Var.Z;
        int i = y72.l;
        return faf.a(this.Z, j) && faf.a(this.E0, le6Var.E0) && this.F0 == le6Var.F0 && this.G0 == le6Var.G0 && pa7.t(this.H0, le6Var.H0) && pa7.t(this.I0, le6Var.I0);
    }

    public final int hashCode() {
        int iA = ub3.a(this.x, ub3.a(this.w, ub3.a(this.v, ub3.a(this.g, ub3.a(this.f, ub3.a(this.e, ub3.a(this.d, ub3.a(this.c, ub3.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = r2f.c;
        int iD = ub3.d((this.z.hashCode() + ib8.b(iA, 31, this.y)) * 31, 31, this.X);
        nqb nqbVar = this.Y;
        int iHashCode = (iD + (nqbVar == null ? 0 : nqbVar.hashCode())) * 31;
        int i2 = y72.l;
        int iB = ub3.b(this.G0, ub3.b(this.F0, ib8.b(ib8.b(iHashCode, 31, this.Z), 31, this.E0), 31), 31);
        c82 c82Var = this.H0;
        return this.I0.hashCode() + ((iB + (c82Var != null ? c82Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String strD = r2f.d(this.y);
        String strH = y72.h(this.Z);
        String strH2 = y72.h(this.E0);
        String strF = tec.f(this.F0, "CompositingStrategy(value=", ")");
        String strZ = kn2.Z(this.G0);
        StringBuilder sbO = tec.o("GraphicsLayerElement(scaleX=", this.a, ", scaleY=", this.b, ", alpha=");
        ks0.w(sbO, this.c, ", translationX=", this.d, ", translationY=");
        ks0.w(sbO, this.e, ", shadowElevation=", this.f, ", rotationX=");
        ks0.w(sbO, this.g, ", rotationY=", this.v, ", rotationZ=");
        ks0.w(sbO, this.w, ", cameraDistance=", this.x, ", transformOrigin=");
        sbO.append(strD);
        sbO.append(", shape=");
        sbO.append(this.z);
        sbO.append(", clip=");
        sbO.append(this.X);
        sbO.append(", renderEffect=");
        sbO.append(this.Y);
        sbO.append(", ambientShadowColor=");
        ub3.v(sbO, strH, ", spotShadowColor=", strH2, ", compositingStrategy=");
        ub3.v(sbO, strF, ", blendMode=", strZ, ", colorFilter=");
        sbO.append(this.H0);
        sbO.append(", outsets=");
        sbO.append(this.I0);
        sbO.append(")");
        return sbO.toString();
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        ijd ijdVar = (ijd) i09Var;
        ijdVar.Z = this.a;
        ijdVar.E0 = this.b;
        ijdVar.F0 = this.c;
        ijdVar.G0 = this.d;
        ijdVar.H0 = this.e;
        ijdVar.I0 = this.f;
        ijdVar.J0 = this.g;
        ijdVar.K0 = this.v;
        ijdVar.L0 = this.w;
        ijdVar.M0 = this.x;
        ijdVar.N0 = this.y;
        ijdVar.O0 = this.z;
        ijdVar.P0 = this.X;
        ijdVar.Q0 = this.Y;
        ijdVar.R0 = this.Z;
        ijdVar.S0 = this.E0;
        ijdVar.T0 = this.F0;
        ijdVar.U0 = this.G0;
        ijdVar.V0 = this.H0;
        ijdVar.W0 = this.I0;
        rs0.Q(ijdVar, ijdVar.X0);
    }
}
