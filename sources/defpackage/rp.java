package defpackage;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rp implements c52 {
    public final k47 a;

    public rp(k47 k47Var) {
        this.a = k47Var;
    }

    @Override // defpackage.c52
    public final Object a(a52 a52Var, zn2 zn2Var) {
        k47 k47Var = this.a;
        if (a52Var != null) {
            k47Var.A().setPrimaryClip(a52Var.a);
        } else if (Build.VERSION.SDK_INT >= 28) {
            s.f(k47Var.A());
        } else {
            k47Var.A().setPrimaryClip(ClipData.newPlainText("", ""));
        }
        return wef.a;
    }

    @Override // defpackage.c52
    public final Object b(zn2 zn2Var) {
        ClipData primaryClip = this.a.A().getPrimaryClip();
        if (primaryClip != null) {
            return new a52(primaryClip);
        }
        return null;
    }
}
