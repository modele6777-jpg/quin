package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ijd extends i09 implements kv7, wwc {
    public float E0;
    public float F0;
    public float G0;
    public float H0;
    public float I0;
    public float J0;
    public float K0;
    public float L0;
    public float M0;
    public long N0;
    public x4d O0;
    public boolean P0;
    public nqb Q0;
    public long R0;
    public long S0;
    public int T0;
    public int U0;
    public c82 V0;
    public uu7 W0;
    public ckb X0;
    public float Z;

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        if (this.P0) {
            exc.n(hxcVar, this.O0);
        }
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, long j) {
        cea ceaVarV = tn8Var.v(j);
        return zn8Var.n0(ceaVarV.a, ceaVarV.b, qu4.a, new h6b(25, ceaVarV, this));
    }

    @Override // defpackage.wwc
    public final boolean k() {
        return false;
    }

    public final String toString() {
        float f = this.Z;
        float f2 = this.E0;
        float f3 = this.F0;
        float f4 = this.G0;
        float f5 = this.H0;
        float f6 = this.I0;
        float f7 = this.J0;
        float f8 = this.K0;
        float f9 = this.L0;
        float f10 = this.M0;
        String strD = r2f.d(this.N0);
        x4d x4dVar = this.O0;
        boolean z = this.P0;
        nqb nqbVar = this.Q0;
        String strH = y72.h(this.R0);
        String strH2 = y72.h(this.S0);
        String strF = tec.f(this.T0, "CompositingStrategy(value=", ")");
        String strZ = kn2.Z(this.U0);
        c82 c82Var = this.V0;
        uu7 uu7Var = this.W0;
        StringBuilder sbO = tec.o("SimpleGraphicsLayerModifier(scaleX=", f, ", scaleY=", f2, ", alpha = ");
        ks0.w(sbO, f3, ", translationX=", f4, ", translationY=");
        ks0.w(sbO, f5, ", shadowElevation=", f6, ", rotationX=");
        ks0.w(sbO, f7, ", rotationY=", f8, ", rotationZ=");
        ks0.w(sbO, f9, ", cameraDistance=", f10, ", transformOrigin=");
        sbO.append(strD);
        sbO.append(", shape=");
        sbO.append(x4dVar);
        sbO.append(", clip=");
        sbO.append(z);
        sbO.append(", renderEffect=");
        sbO.append(nqbVar);
        sbO.append(", ambientShadowColor=");
        ub3.v(sbO, strH, ", spotShadowColor=", strH2, ", compositingStrategy=");
        ub3.v(sbO, strF, ", blendMode=", strZ, ", colorFilter=");
        sbO.append(c82Var);
        sbO.append("outsets=");
        sbO.append(uu7Var);
        sbO.append(")");
        return sbO.toString();
    }
}
