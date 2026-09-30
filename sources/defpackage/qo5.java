package defpackage;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qo5 extends i09 implements eo5 {
    @Override // defpackage.eo5
    public final void K(co5 co5Var) {
        View viewS = bzd.s(this);
        co5Var.c(this.a.Y && bzd.s(this).hasFocusable());
        View viewFindFocus = viewS.findFocus();
        if (viewFindFocus != null) {
            co5Var.d(un5.a(viewFindFocus, viewS));
        }
    }
}
