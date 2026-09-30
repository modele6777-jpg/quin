package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k6e extends qr8 implements SubMenu {
    public final vr8 A;
    public final qr8 z;

    public k6e(Context context, qr8 qr8Var, vr8 vr8Var) {
        super(context);
        this.z = qr8Var;
        this.A = vr8Var;
    }

    @Override // defpackage.qr8
    public final boolean d(vr8 vr8Var) {
        return this.z.d(vr8Var);
    }

    @Override // defpackage.qr8
    public final boolean e(qr8 qr8Var, MenuItem menuItem) {
        return super.e(qr8Var, menuItem) || this.z.e(qr8Var, menuItem);
    }

    @Override // defpackage.qr8
    public final boolean f(vr8 vr8Var) {
        return this.z.f(vr8Var);
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return this.A;
    }

    @Override // defpackage.qr8
    public final String j() {
        int i = this.A.a;
        if (i == 0) {
            return null;
        }
        return tec.e(i, "android:menu:actionviewstates:");
    }

    @Override // defpackage.qr8
    public final qr8 k() {
        return this.z.k();
    }

    @Override // defpackage.qr8
    public final boolean m() {
        return this.z.m();
    }

    @Override // defpackage.qr8
    public final boolean n() {
        return this.z.n();
    }

    @Override // defpackage.qr8
    public final boolean o() {
        return this.z.o();
    }

    @Override // defpackage.qr8, android.view.Menu
    public final void setGroupDividerEnabled(boolean z) {
        this.z.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        u(0, null, 0, drawable, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        u(0, charSequence, 0, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        u(0, null, 0, null, view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.A.setIcon(drawable);
        return this;
    }

    @Override // defpackage.qr8, android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.z.setQwertyMode(z);
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.A.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        u(0, null, i, null, null);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        u(i, null, 0, null, null);
        return this;
    }
}
