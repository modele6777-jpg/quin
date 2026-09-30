package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.widget.ListAdapter;
import androidx.appcompat.app.AlertController$RecycleListView;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h90 implements n90, DialogInterface.OnClickListener {
    public ui a;
    public i90 b;
    public CharSequence c;
    public final /* synthetic */ o90 d;

    public h90(o90 o90Var) {
        this.d = o90Var;
    }

    @Override // defpackage.n90
    public final boolean a() {
        ui uiVar = this.a;
        if (uiVar != null) {
            return uiVar.isShowing();
        }
        return false;
    }

    @Override // defpackage.n90
    public final int b() {
        return 0;
    }

    @Override // defpackage.n90
    public final void d(int i) {
        b1.d("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.n90
    public final void dismiss() {
        ui uiVar = this.a;
        if (uiVar != null) {
            uiVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.n90
    public final CharSequence e() {
        return this.c;
    }

    @Override // defpackage.n90
    public final Drawable g() {
        return null;
    }

    @Override // defpackage.n90
    public final void h(CharSequence charSequence) {
        this.c = charSequence;
    }

    @Override // defpackage.n90
    public final void i(Drawable drawable) {
        b1.d("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.n90
    public final void l(int i) {
        b1.d("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.n90
    public final void m(int i) {
        b1.d("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.n90
    public final void n(int i, int i2) {
        if (this.b == null) {
            return;
        }
        o90 o90Var = this.d;
        ti tiVar = new ti(o90Var.getPopupContext());
        CharSequence charSequence = this.c;
        if (charSequence != null) {
            tiVar.setTitle(charSequence);
        }
        i90 i90Var = this.b;
        int selectedItemPosition = o90Var.getSelectedItemPosition();
        pi piVar = tiVar.a;
        piVar.m = i90Var;
        piVar.n = this;
        piVar.q = selectedItemPosition;
        piVar.p = true;
        ui uiVarCreate = tiVar.create();
        this.a = uiVarCreate;
        AlertController$RecycleListView alertController$RecycleListView = uiVarCreate.g.e;
        alertController$RecycleListView.setTextDirection(i);
        alertController$RecycleListView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // defpackage.n90
    public final int o() {
        return 0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        o90 o90Var = this.d;
        o90Var.setSelection(i);
        if (o90Var.getOnItemClickListener() != null) {
            o90Var.performItemClick(null, i, this.b.getItemId(i));
        }
        dismiss();
    }

    @Override // defpackage.n90
    public final void p(ListAdapter listAdapter) {
        this.b = (i90) listAdapter;
    }
}
