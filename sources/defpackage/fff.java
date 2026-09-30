package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class fff extends sv2 {
    public static final fff c = new fff();

    @Override // defpackage.sv2
    public final void Z0(pv2 pv2Var, Runnable runnable) {
        js3.d.c.h(runnable, true, false);
    }

    @Override // defpackage.sv2
    public final void a1(pv2 pv2Var, Runnable runnable) {
        js3.d.c.h(runnable, true, true);
    }

    @Override // defpackage.sv2
    public final sv2 c1(int i) {
        abg.p(i);
        return i >= lle.d ? this : super.c1(i);
    }

    @Override // defpackage.sv2
    public final String toString() {
        return "Dispatchers.IO";
    }
}
