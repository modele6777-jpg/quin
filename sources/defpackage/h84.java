package defpackage;

import android.app.Dialog;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h84 implements DialogInterface.OnCancelListener {
    public final /* synthetic */ l84 a;

    public h84(l84 l84Var) {
        this.a = l84Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        l84 l84Var = this.a;
        Dialog dialog = l84Var.s1;
        if (dialog != null) {
            l84Var.onCancel(dialog);
        }
    }
}
