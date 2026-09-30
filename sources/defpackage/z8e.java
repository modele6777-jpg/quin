package defpackage;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class z8e extends l84 {
    public Dialog x1;
    public DialogInterface.OnCancelListener y1;
    public AlertDialog z1;

    @Override // defpackage.l84
    public final Dialog D() {
        Dialog dialog = this.x1;
        if (dialog != null) {
            return dialog;
        }
        this.o1 = false;
        AlertDialog alertDialog = this.z1;
        if (alertDialog != null) {
            return alertDialog;
        }
        mx5 mx5Var = this.J0;
        Context context = mx5Var == null ? null : mx5Var.H0;
        oa7.A(context);
        AlertDialog alertDialogCreate = new AlertDialog.Builder(context).create();
        this.z1 = alertDialogCreate;
        return alertDialogCreate;
    }

    @Override // defpackage.l84, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.y1;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
