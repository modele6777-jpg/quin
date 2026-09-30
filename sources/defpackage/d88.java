package defpackage;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d88 extends DataSetObserver {
    public final /* synthetic */ g88 a;

    public d88(g88 g88Var) {
        this.a = g88Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        g88 g88Var = this.a;
        if (g88Var.N0.isShowing()) {
            g88Var.f();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.a.dismiss();
    }
}
