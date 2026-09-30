package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x6f implements br4 {
    public final int a;
    public final int b;
    public final fs4 c;

    public x6f(int i, int i2, fs4 fs4Var) {
        this.a = i;
        this.b = i2;
        this.c = fs4Var;
    }

    @Override // defpackage.vz
    public final psf a(y6f y6fVar) {
        return new yl9(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x6f) {
            x6f x6fVar = (x6f) obj;
            if (x6fVar.a == this.a && x6fVar.b == this.b && pa7.t(x6fVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ze5
    public final ssf f() {
        return new yl9(this.a, this.b, this.c);
    }

    public final int hashCode() {
        return ((this.c.hashCode() + (this.a * 31)) * 31) + this.b;
    }

    @Override // defpackage.br4, defpackage.vz
    public final rsf a(y6f y6fVar) {
        return new yl9(this.a, this.b, this.c);
    }
}
