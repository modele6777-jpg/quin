package defpackage;

import android.view.ActionMode;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rv implements ene {
    public final View a;
    public final a26 b;
    public final x16 c;
    public final b99 d = new b99();
    public final nsd e = new nsd(new lv(this, 0));
    public final lv f = new lv(this, 1);
    public final lv g = new lv(this, 2);
    public ActionMode h;
    public c0 i;
    public Runnable j;

    public rv(View view, a26 a26Var, x16 x16Var) {
        this.a = view;
        this.b = a26Var;
        this.c = x16Var;
    }

    @Override // defpackage.ene
    public final Object a(ume umeVar, zn2 zn2Var) {
        Object objA = b99.a(this.d, new qv(this, umeVar, null), zn2Var);
        return objA == bw2.a ? objA : wef.a;
    }
}
