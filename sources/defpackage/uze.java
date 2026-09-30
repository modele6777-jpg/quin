package defpackage;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uze implements View.OnClickListener {
    public final sc a;
    public final /* synthetic */ wze b;

    public uze(wze wzeVar) {
        this.b = wzeVar;
        Context context = wzeVar.a.getContext();
        CharSequence charSequence = wzeVar.h;
        sc scVar = new sc();
        scVar.e = 4096;
        scVar.g = 4096;
        scVar.l = null;
        scVar.m = null;
        scVar.n = false;
        scVar.o = false;
        scVar.p = 16;
        scVar.i = context;
        scVar.a = charSequence;
        this.a = scVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wze wzeVar = this.b;
        Window.Callback callback = wzeVar.k;
        if (callback == null || !wzeVar.l) {
            return;
        }
        callback.onMenuItemSelected(0, this.a);
    }
}
