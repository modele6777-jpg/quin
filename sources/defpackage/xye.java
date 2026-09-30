package defpackage;

import android.view.autofill.AutofillValue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xye extends s42 {
    public boolean b1;
    public a26 c1;
    public final h2e d1;

    public xye(boolean z, t69 t69Var, r17 r17Var, boolean z2, boolean z3, i5c i5cVar, a26 a26Var) {
        super(t69Var, r17Var, z2, z3, null, i5cVar, new oy1(6, a26Var, z));
        this.b1 = z;
        this.c1 = a26Var;
        this.d1 = new h2e(14, this);
    }

    @Override // defpackage.b1
    public final void o1(hxc hxcVar) {
        exc.o(hxcVar, this.b1 ? yye.a : yye.b);
        exc.e(hxcVar, ndb.M0);
        exc.h(hxcVar, new yr(AutofillValue.forToggle(this.b1)));
        exc.b(hxcVar, new bz1(hxcVar, 1));
    }
}
