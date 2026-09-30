package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rc1 implements AutoCloseable {
    public final qwe a;
    public final String b;
    public final CameraManager c;
    public final qn2 d;
    public final sh0 e;
    public final s0e f;
    public final whb g;
    public final ncd v;
    public final uhb w;
    public final ka1 x;
    public final lyd y;

    public rc1(h1b h1bVar, qwe qweVar, String str, dg7 dg7Var) {
        h1bVar.getClass();
        str.getClass();
        this.a = qweVar;
        this.b = str;
        this.c = (CameraManager) h1bVar.get();
        qn2 qn2VarK = jgb.k(i7h.I(new t8e(dg7Var), i7h.I(qweVar.h, new wv2("CXCP-CameraStatusMonitor"))));
        this.d = qn2VarK;
        this.e = vpf.m(false);
        s0e s0eVarA = t0e.a(uj1.a);
        this.f = s0eVarA;
        this.g = if9.n(s0eVarA);
        ncd ncdVarB = ocd.b(0, 0, null, 7);
        this.v = ncdVarB;
        this.w = if9.m(ncdVarB);
        this.x = nk8.m(new pc1(this, null));
        this.y = ynb.V(qn2VarK, null, null, new qc1(this, null), 3);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e.a()) {
            this.y.h(null);
            jgb.I(this.d, null);
        }
    }
}
