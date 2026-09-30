package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fxd implements ze5 {
    public final float a;
    public final float b;
    public final Object c;

    public /* synthetic */ fxd(int i, Object obj) {
        this(1.0f, 1500.0f, (i & 4) != 0 ? null : obj);
    }

    @Override // defpackage.vz
    public final psf a(y6f y6fVar) {
        Object obj = this.c;
        return new ysd(this.a, this.b, obj == null ? null : (b00) y6fVar.a.d(obj));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof fxd) {
            fxd fxdVar = (fxd) obj;
            if (fxdVar.a == this.a && fxdVar.b == this.b && pa7.t(fxdVar.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ze5
    public final ssf f() {
        y6f y6fVar = xo1.g;
        Object obj = this.c;
        return new ysd(this.a, this.b, obj == null ? null : (b00) y6fVar.a.d(obj));
    }

    public final int hashCode() {
        Object obj = this.c;
        return Float.hashCode(this.b) + ub3.a(this.a, (obj != null ? obj.hashCode() : 0) * 31, 31);
    }

    public fxd(float f, float f2, Object obj) {
        this.a = f;
        this.b = f2;
        this.c = obj;
    }
}
