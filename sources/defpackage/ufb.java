package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ufb {
    public final View a;
    public final vz9 b;
    public boolean c;
    public hl9 d;
    public jr e;

    public ufb(View view) {
        view.getClass();
        this.a = view;
        this.b = q1c.f(null);
        this.c = true;
    }

    public final void a() {
        vz9 vz9Var = this.b;
        ActionMode actionMode = (ActionMode) vz9Var.getValue();
        if (actionMode != null) {
            actionMode.finish();
        }
        vz9Var.setValue(null);
        jr jrVar = this.e;
        if (jrVar != null) {
            jrVar.invoke();
        }
        this.e = null;
    }
}
