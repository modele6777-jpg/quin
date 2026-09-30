package defpackage;

import android.view.DragEvent;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pr implements View.OnDragListener, kj4 {
    public final lj4 a = new lj4(null, 3);
    public final od0 b = new od0(0);
    public final or c = new or(this);

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        fj4 fj4Var = new fj4(dragEvent);
        int action = dragEvent.getAction();
        od0 od0Var = this.b;
        lj4 lj4Var = this.a;
        switch (action) {
            case 1:
                imb imbVar = new imb();
                it3 it3Var = new it3(fj4Var, lj4Var, imbVar, 2);
                if (it3Var.d(lj4Var) == h4f.a) {
                    n3d.v(lj4Var, it3Var);
                }
                boolean z = imbVar.element;
                fd0 fd0Var = new fd0(od0Var);
                while (fd0Var.hasNext()) {
                    ((mj4) fd0Var.next()).B0(fj4Var);
                }
                return z;
            case 2:
                lj4Var.C0(fj4Var);
                return false;
            case 3:
                return lj4Var.U0(fj4Var);
            case 4:
                lj4Var.J(fj4Var);
                od0Var.clear();
                return false;
            case 5:
                lj4Var.v(fj4Var);
                return false;
            case 6:
                lj4Var.q0(fj4Var);
                return false;
            default:
                return false;
        }
    }
}
