package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kyd extends cd implements or8 {
    public Context d;
    public ActionBarContextView e;
    public a90 f;
    public WeakReference g;
    public boolean v;
    public qr8 w;

    @Override // defpackage.or8
    public final void B(qr8 qr8Var) {
        j();
        yc ycVar = this.e.d;
        if (ycVar != null) {
            ycVar.l();
        }
    }

    @Override // defpackage.cd
    public final void b() {
        if (this.v) {
            return;
        }
        this.v = true;
        this.f.L(this);
    }

    @Override // defpackage.or8
    public final boolean c(qr8 qr8Var, MenuItem menuItem) {
        return ((kxa) this.f.b).h(this, menuItem);
    }

    @Override // defpackage.cd
    public final View d() {
        WeakReference weakReference = this.g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // defpackage.cd
    public final qr8 f() {
        return this.w;
    }

    @Override // defpackage.cd
    public final MenuInflater g() {
        return new c9e(this.e.getContext());
    }

    @Override // defpackage.cd
    public final CharSequence h() {
        return this.e.getSubtitle();
    }

    @Override // defpackage.cd
    public final CharSequence i() {
        return this.e.getTitle();
    }

    @Override // defpackage.cd
    public final void j() {
        this.f.M(this, this.w);
    }

    @Override // defpackage.cd
    public final boolean k() {
        return this.e.K0;
    }

    @Override // defpackage.cd
    public final void m(View view) {
        this.e.setCustomView(view);
        this.g = view != null ? new WeakReference(view) : null;
    }

    @Override // defpackage.cd
    public final void n(int i) {
        o(this.d.getString(i));
    }

    @Override // defpackage.cd
    public final void o(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    @Override // defpackage.cd
    public final void p(int i) {
        q(this.d.getString(i));
    }

    @Override // defpackage.cd
    public final void q(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override // defpackage.cd
    public final void r(boolean z) {
        this.b = z;
        this.e.setTitleOptional(z);
    }
}
