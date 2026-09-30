package defpackage;

import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class es8 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ fs8 a;

    public es8(fs8 fs8Var) {
        this.a = fs8Var;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        this.a.c();
    }
}
