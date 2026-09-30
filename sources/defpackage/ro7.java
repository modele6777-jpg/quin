package defpackage;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ro7 extends i09 implements qo7 {
    public a26 E0;
    public a26 Z;

    @Override // defpackage.qo7
    public final boolean M(KeyEvent keyEvent) {
        a26 a26Var = this.Z;
        if (a26Var != null) {
            return ((Boolean) a26Var.d(new mo7(keyEvent))).booleanValue();
        }
        return false;
    }

    @Override // defpackage.qo7
    public final boolean l(KeyEvent keyEvent) {
        a26 a26Var = this.E0;
        if (a26Var != null) {
            return ((Boolean) a26Var.d(new mo7(keyEvent))).booleanValue();
        }
        return false;
    }
}
