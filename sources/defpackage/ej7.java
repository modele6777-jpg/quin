package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ej7 extends h2 {
    public final yg7 f;
    public final int g;
    public int h;

    public ej7(wg7 wg7Var, yg7 yg7Var) {
        super(wg7Var, null);
        this.f = yg7Var;
        this.g = yg7Var.a.size();
        this.h = -1;
    }

    @Override // defpackage.h2
    public final nh7 F(String str) {
        str.getClass();
        return (nh7) this.f.a.get(Integer.parseInt(str));
    }

    @Override // defpackage.h2
    public final String R(nyc nycVar, int i) {
        nycVar.getClass();
        return String.valueOf(i);
    }

    @Override // defpackage.h2
    public final nh7 T() {
        return this.f;
    }

    @Override // defpackage.zf2
    public final int j(nyc nycVar) {
        nycVar.getClass();
        int i = this.h;
        if (i >= this.g - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.h = i2;
        return i2;
    }
}
