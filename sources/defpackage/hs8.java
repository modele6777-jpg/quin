package defpackage;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hs8 extends g88 implements ur8 {
    public static final Method R0;
    public kb6 Q0;

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                R0 = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    @Override // defpackage.ur8
    public final void c(qr8 qr8Var, MenuItem menuItem) {
        kb6 kb6Var = this.Q0;
        if (kb6Var != null) {
            kb6Var.c(qr8Var, menuItem);
        }
    }

    @Override // defpackage.ur8
    public final void k(qr8 qr8Var, vr8 vr8Var) {
        kb6 kb6Var = this.Q0;
        if (kb6Var != null) {
            kb6Var.k(qr8Var, vr8Var);
        }
    }

    @Override // defpackage.g88
    public final hq4 q(Context context, boolean z) {
        gs8 gs8Var = new gs8(context, z);
        gs8Var.setHoverListener(this);
        return gs8Var;
    }
}
