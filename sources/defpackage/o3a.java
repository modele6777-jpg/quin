package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o3a extends yu0 {
    public final t7 P0;
    public final fab Q0;
    public final vz9 R0;

    public o3a(t7 t7Var, fab fabVar) {
        super(t7Var, null);
        this.P0 = t7Var;
        this.Q0 = fabVar;
        this.R0 = q1c.f(null);
    }

    @Override // defpackage.g4
    public final void D(ArrayList arrayList) {
        for (Object obj : arrayList) {
            if (((z6e) obj).h() == u7e.b) {
                z6e z6eVar = (z6e) obj;
                d().e("onSubscriptionPricesUpdate: " + z6eVar);
                this.R0.setValue(z6eVar);
            }
        }
        obj = null;
        z6e z6eVar2 = (z6e) obj;
        d().e("onSubscriptionPricesUpdate: " + z6eVar2);
        this.R0.setValue(z6eVar2);
    }

    @Override // defpackage.g4
    public final void E(String str) {
        str.getClass();
        x1f x1fVar = x1f.a;
        x1f.k(new r05("subscribe_succeeded"), new bt5(str, 20), 2);
    }

    @Override // defpackage.g4
    public final void M(vb2 vb2Var) {
        ((rab) this.Q0).f();
        super.M(vb2Var);
    }

    @Override // defpackage.g4
    public final void z() {
    }
}
