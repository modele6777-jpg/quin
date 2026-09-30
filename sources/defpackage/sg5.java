package defpackage;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sg5 implements f1b {
    public final /* synthetic */ int a;
    public final ze b;
    public final f1b c;

    public /* synthetic */ sg5(ze zeVar, f1b f1bVar, int i) {
        this.a = i;
        this.b = zeVar;
        this.c = f1bVar;
    }

    @Override // defpackage.h1b
    public final Object get() {
        int i = this.a;
        f1b f1bVar = this.c;
        ze zeVar = this.b;
        switch (i) {
            case 0:
                Context context = (Context) zeVar.a;
                pv2 pv2Var = (pv2) f1bVar.get();
                context.getClass();
                pv2Var.getClass();
                return hj6.q(qfc.b, new vrb(0, new hl4(17)), jgb.k(pv2Var), new u8(context, 23));
            default:
                return new iva((Context) zeVar.a, (grf) f1bVar.get());
        }
    }
}
