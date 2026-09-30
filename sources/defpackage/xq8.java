package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class xq8 implements x16 {
    public final /* synthetic */ int a;
    public final yq8 b;
    public final m0b c;
    public final ut8 d;
    public final int e;
    public final int f;
    public final d0b g;

    public /* synthetic */ xq8(yq8 yq8Var, m0b m0bVar, ut8 ut8Var, int i, int i2, d0b d0bVar, int i3) {
        this.a = i3;
        this.b = yq8Var;
        this.c = m0bVar;
        this.d = ut8Var;
        this.e = i;
        this.f = i2;
        this.g = d0bVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        yq8 yq8Var = this.b;
        switch (i) {
            case 0:
                return s72.j1(((tz3) yq8Var.a.b).e.n(this.c, this.d, this.e, this.f, this.g));
            default:
                return s72.j1(((tz3) yq8Var.a.b).e.m(this.c, this.d, this.e, this.f, this.g));
        }
    }
}
