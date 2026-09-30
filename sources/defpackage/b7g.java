package defpackage;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b7g extends cd implements or8 {
    public final Context d;
    public final qr8 e;
    public a90 f;
    public WeakReference g;
    public final /* synthetic */ c7g v;

    public b7g(c7g c7gVar, Context context, a90 a90Var) {
        this.v = c7gVar;
        this.d = context;
        this.f = a90Var;
        qr8 qr8Var = new qr8(context);
        qr8Var.l = 1;
        this.e = qr8Var;
        qr8Var.e = this;
    }

    @Override // defpackage.or8
    public final void B(qr8 qr8Var) {
        if (this.f == null) {
            return;
        }
        j();
        yc ycVar = this.v.f.d;
        if (ycVar != null) {
            ycVar.l();
        }
    }

    @Override // defpackage.cd
    public final void b() {
        c7g c7gVar = this.v;
        if (c7gVar.i != this) {
            return;
        }
        if (c7gVar.p) {
            c7gVar.j = this;
            c7gVar.k = this.f;
        } else {
            this.f.L(this);
        }
        this.f = null;
        c7gVar.a(false);
        ActionBarContextView actionBarContextView = c7gVar.f;
        if (actionBarContextView.y == null) {
            actionBarContextView.e();
        }
        c7gVar.c.setHideOnContentScrollEnabled(c7gVar.u);
        c7gVar.i = null;
    }

    @Override // defpackage.or8
    public final boolean c(qr8 qr8Var, MenuItem menuItem) {
        a90 a90Var = this.f;
        if (a90Var != null) {
            return ((kxa) a90Var.b).h(this, menuItem);
        }
        return false;
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
        return this.e;
    }

    @Override // defpackage.cd
    public final MenuInflater g() {
        return new c9e(this.d);
    }

    @Override // defpackage.cd
    public final CharSequence h() {
        return this.v.f.getSubtitle();
    }

    @Override // defpackage.cd
    public final CharSequence i() {
        return this.v.f.getTitle();
    }

    @Override // defpackage.cd
    public final void j() {
        if (this.v.i != this) {
            return;
        }
        qr8 qr8Var = this.e;
        qr8Var.w();
        try {
            this.f.M(this, qr8Var);
        } finally {
            qr8Var.v();
        }
    }

    @Override // defpackage.cd
    public final boolean k() {
        return this.v.f.K0;
    }

    @Override // defpackage.cd
    public final void m(View view) {
        this.v.f.setCustomView(view);
        this.g = new WeakReference(view);
    }

    @Override // defpackage.cd
    public final void n(int i) {
        o(this.v.a.getResources().getString(i));
    }

    @Override // defpackage.cd
    public final void o(CharSequence charSequence) {
        this.v.f.setSubtitle(charSequence);
    }

    @Override // defpackage.cd
    public final void p(int i) {
        q(this.v.a.getResources().getString(i));
    }

    @Override // defpackage.cd
    public final void q(CharSequence charSequence) {
        this.v.f.setTitle(charSequence);
    }

    @Override // defpackage.cd
    public final void r(boolean z) {
        this.b = z;
        this.v.f.setTitleOptional(z);
    }
}
