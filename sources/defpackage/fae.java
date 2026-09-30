package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fae implements tg0 {
    public final /* synthetic */ iae a;
    public final /* synthetic */ hae b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iq0 d;
    public final /* synthetic */ iq0 e;

    public /* synthetic */ fae(iae iaeVar, hae haeVar, int i, iq0 iq0Var, iq0 iq0Var2) {
        this.a = iaeVar;
        this.b = haeVar;
        this.c = i;
        this.d = iq0Var;
        this.e = iq0Var2;
    }

    @Override // defpackage.tg0
    /* JADX INFO: renamed from: apply */
    public final m88 mo34apply(Object obj) {
        hae haeVar = this.b;
        Surface surface = (Surface) obj;
        iae iaeVar = this.a;
        iaeVar.getClass();
        surface.getClass();
        try {
            haeVar.d();
            oae oaeVar = new oae(surface, this.c, iaeVar.g.a, this.d, this.e);
            oaeVar.y.b.b(new cae(haeVar, 1), g94.a());
            ok8.o("Consumer can only be linked once.", haeVar.q == null);
            haeVar.q = oaeVar;
            return bm8.C(oaeVar);
        } catch (ju3 e) {
            return new tx6(1, e);
        }
    }
}
