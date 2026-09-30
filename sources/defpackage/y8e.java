package defpackage;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y8e extends ActionMode {
    public final Context a;
    public final cd b;

    public y8e(Context context, cd cdVar) {
        this.a = context;
        this.b = cdVar;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.b.b();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.b.d();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new ps8(this.a, this.b.f());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.b.g();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.b.h();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.b.c;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.b.i();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.b.b;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.b.j();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.b.k();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.b.m(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.b.c = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.b.q(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.b.r(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.b.n(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.b.p(i);
    }
}
