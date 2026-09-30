package defpackage;

import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tfb extends ActionMode.Callback2 {
    public final /* synthetic */ rhb a;
    public final /* synthetic */ ufb b;
    public final /* synthetic */ heb c;
    public final /* synthetic */ Rect d;

    public tfb(rhb rhbVar, ufb ufbVar, heb hebVar, Rect rect) {
        this.a = rhbVar;
        this.b = ufbVar;
        this.c = hebVar;
        this.d = rect;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        actionMode.getClass();
        menuItem.getClass();
        actionMode.finish();
        qhb qhbVar = (qhb) qhb.f.get(menuItem.getItemId());
        if (qhbVar == qhb.c && !this.b.c) {
            return true;
        }
        this.c.d(qhbVar);
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        rhb rhbVar = this.a;
        int i = 0;
        for (Object obj : t72.I(new iy9(qhb.a, rhbVar.a), new iy9(qhb.b, rhbVar.b), new iy9(qhb.c, rhbVar.c), new iy9(qhb.d, rhbVar.d))) {
            int i2 = i + 1;
            if (i < 0) {
                t72.Z();
                throw null;
            }
            iy9 iy9Var = (iy9) obj;
            menu.add(0, ((qhb) iy9Var.a()).ordinal(), i, (String) iy9Var.b()).setShowAsAction(1);
            i = i2;
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        actionMode.getClass();
        ufb ufbVar = this.b;
        if (((ActionMode) ufbVar.b.getValue()) == actionMode) {
            ufbVar.b.setValue(null);
        }
        jr jrVar = ufbVar.e;
        if (jrVar != null) {
            jrVar.invoke();
        }
        ufbVar.e = null;
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        actionMode.getClass();
        view.getClass();
        rect.getClass();
        rect.set(this.d);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        actionMode.getClass();
        menu.getClass();
        return false;
    }
}
