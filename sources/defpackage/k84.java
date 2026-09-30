package defpackage;

import android.app.Dialog;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k84 extends qk2 {
    public final /* synthetic */ int G0 = 1;
    public final /* synthetic */ kx5 H0;

    public k84(l84 l84Var, k84 k84Var) {
        super(19);
        this.H0 = l84Var;
    }

    @Override // defpackage.qk2
    public final View H(int i) {
        int i2 = this.G0;
        kx5 kx5Var = this.H0;
        switch (i2) {
            case 0:
                Dialog dialog = ((l84) kx5Var).s1;
                if (dialog != null) {
                    return dialog.findViewById(i);
                }
                return null;
            default:
                throw new IllegalStateException("Fragment " + kx5Var + " does not have a view");
        }
    }

    @Override // defpackage.qk2
    public final boolean I() {
        switch (this.G0) {
            case 0:
                return ((l84) this.H0).w1;
            default:
                return false;
        }
    }

    public k84(kx5 kx5Var) {
        super(19);
        this.H0 = kx5Var;
    }
}
