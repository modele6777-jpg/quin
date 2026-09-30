package defpackage;

import android.hardware.camera2.CaptureResult;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aj8 implements atb {
    public final /* synthetic */ dj8 a;

    public aj8(dj8 dj8Var) {
        this.a = dj8Var;
    }

    @Override // defpackage.atb
    public final void R(qtb qtbVar, long j, ds dsVar) {
        if (Build.VERSION.SDK_INT >= 35) {
            dj8 dj8Var = this.a;
            if (dj8Var.c == null || !dj8Var.e) {
                return;
            }
            es esVar = dsVar.b;
            CaptureResult.Key key = CaptureResult.CONTROL_LOW_LIGHT_BOOST_STATE;
            key.getClass();
            esVar.getClass();
            Integer num = (Integer) esVar.a.get(key);
            if (num != null) {
                dj8Var.c(dj8Var.f, num.intValue() != 1 ? 0 : 1);
            }
        }
    }
}
