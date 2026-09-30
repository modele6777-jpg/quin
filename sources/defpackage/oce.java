package defpackage;

import android.view.View;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oce extends e57 {
    public a26 G0;
    public m8g H0;

    @Override // defpackage.z47, defpackage.i09
    public final void d1() {
        View viewX0 = kj0.x0(this);
        WeakHashMap weakHashMap = m8g.w;
        m8g m8gVarM = q7c.m(viewX0);
        m8gVarM.a(viewX0);
        g7g g7gVar = (g7g) this.G0.d(m8gVarM);
        if (!pa7.t(g7gVar, this.F0)) {
            this.F0 = g7gVar;
            m1();
        }
        this.H0 = m8gVarM;
        super.d1();
    }

    @Override // defpackage.z47, defpackage.i09
    public final void e1() {
        View viewX0 = kj0.x0(this);
        m8g m8gVar = this.H0;
        if (m8gVar != null) {
            int i = m8gVar.u - 1;
            m8gVar.u = i;
            if (i == 0) {
                WeakHashMap weakHashMap = nvf.a;
                fvf.c(viewX0, null);
                n7g.a(viewX0, null);
                viewX0.removeOnAttachStateChangeListener(m8gVar.v);
            }
        }
        super.e1();
    }
}
