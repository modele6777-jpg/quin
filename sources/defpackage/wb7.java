package defpackage;

import android.content.ClipData;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wb7 extends gcg {
    public final bc7 d;
    public final t7 e;
    public final ncd f = ocd.b(0, 0, null, 7);
    public final vz9 g = q1c.f("");
    public final vz9 v = q1c.f(Boolean.FALSE);
    public final vz9 w = q1c.f(null);

    public wb7(bc7 bc7Var, t7 t7Var) {
        this.d = bc7Var;
        this.e = t7Var;
    }

    public static void g() {
        if (Build.VERSION.SDK_INT >= 28) {
            tce.a().clearPrimaryClip();
        } else {
            tce.a().setPrimaryClip(ClipData.newPlainText("label", ""));
        }
    }
}
