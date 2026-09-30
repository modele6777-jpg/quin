package defpackage;

import ai.askquin.R;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kcg implements kg2, u48 {
    public final AndroidComposeView a;
    public final rg2 b;
    public boolean c;
    public h48 d;
    public dd2 e = abg.g;

    public kcg(AndroidComposeView androidComposeView, rg2 rg2Var) {
        this.a = androidComposeView;
        this.b = rg2Var;
    }

    public final void a() {
        if (!this.c) {
            this.c = true;
            AndroidComposeView androidComposeView = this.a;
            androidComposeView.getView().setTag(R.id.wrapped_composition_tag, null);
            h48 h48Var = this.d;
            if (h48Var != null) {
                h48Var.b(this);
            }
            this.d = null;
            ua4 ua4Var = androidComposeView.g;
            if (ua4Var != null) {
                ua4Var.b.invoke();
            }
            androidComposeView.g = null;
        }
        this.b.p();
    }

    public final void b(l26 l26Var) {
        this.a.setOnReadyForComposition(new p0g(11, this, (dd2) l26Var));
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        if (f48Var == f48.ON_DESTROY) {
            a();
        } else {
            if (f48Var != f48.ON_CREATE || this.c) {
                return;
            }
            b(this.e);
        }
    }
}
