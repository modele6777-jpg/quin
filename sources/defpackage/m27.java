package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m27 implements h0e {
    public Float a;
    public Float b;
    public final vz9 c;
    public jfe d;
    public boolean e;
    public boolean f;
    public long g;
    public final /* synthetic */ p27 v;

    public m27(p27 p27Var, Float f, Float f2, l27 l27Var) {
        this.v = p27Var;
        this.a = f;
        this.b = f2;
        this.c = q1c.f(f);
        this.d = new jfe(l27Var, xo1.g, this.a, this.b, null);
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        return this.c.getValue();
    }
}
