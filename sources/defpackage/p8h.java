package defpackage;

import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class p8h implements u8e {
    public final /* synthetic */ int a;
    public final /* synthetic */ u8e b;

    public /* synthetic */ p8h(u8e u8eVar, int i) {
        this.a = i;
        this.b = u8eVar;
    }

    @Override // defpackage.u8e
    public final Object get() {
        int i = this.a;
        u8e u8eVar = this.b;
        switch (i) {
            case 0:
                Object obj = f8h.j;
                return (edh) ((vr9) u8eVar.get()).c();
            default:
                i39 i39Var = (i39) u8eVar.get();
                i39Var.getClass();
                s5f s5fVar = new s5f(ixg.c);
                return new g39(s5fVar, i39Var.b.schedule(s5fVar, 10000L, TimeUnit.MILLISECONDS));
        }
    }
}
