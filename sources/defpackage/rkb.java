package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class rkb {
    public kb6 a;
    public ArrayList b;
    public long c;
    public long d;
    public long e;
    public long f;

    public static void b(flb flbVar) {
        RecyclerView recyclerView;
        int i = flbVar.i;
        if (flbVar.e() || (i & 4) != 0 || (recyclerView = flbVar.q) == null) {
            return;
        }
        recyclerView.D(flbVar);
    }

    public abstract boolean a(flb flbVar, flb flbVar2, h71 h71Var, h71 h71Var2);

    public final void c(flb flbVar) {
        kb6 kb6Var = this.a;
        if (kb6Var != null) {
            RecyclerView recyclerView = (RecyclerView) kb6Var.b;
            boolean z = true;
            flbVar.m(true);
            View view = flbVar.a;
            if (flbVar.g != null && flbVar.h == null) {
                flbVar.g = null;
            }
            flbVar.h = null;
            if ((flbVar.i & 16) != 0) {
                return;
            }
            gp3 gp3Var = recyclerView.c;
            recyclerView.Z();
            ta0 ta0Var = recyclerView.f;
            zy1 zy1Var = (zy1) ta0Var.d;
            g5b g5bVar = (g5b) ta0Var.c;
            int iIndexOfChild = ((RecyclerView) g5bVar.b).indexOfChild(view);
            if (iIndexOfChild == -1) {
                ta0Var.U(view);
            } else if (zy1Var.u(iIndexOfChild)) {
                zy1Var.w(iIndexOfChild);
                ta0Var.U(view);
                g5bVar.r(iIndexOfChild);
            } else {
                z = false;
            }
            if (z) {
                flb flbVarF = RecyclerView.F(view);
                gp3Var.q(flbVarF);
                gp3Var.n(flbVarF);
            }
            recyclerView.a0(!z);
            if (z || !flbVar.i()) {
                return;
            }
            recyclerView.removeDetachedView(view, false);
        }
    }

    public abstract void d(flb flbVar);

    public abstract void e();

    public abstract boolean f();
}
