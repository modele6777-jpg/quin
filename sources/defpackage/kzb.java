package defpackage;

import android.hardware.camera2.CaptureResult;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kzb implements atb {
    public final long a;
    public final a26 b;
    public final za2 c;
    public volatile Long d;

    public kzb(long j, a26 a26Var) {
        a26Var.getClass();
        this.a = j;
        this.b = a26Var;
        this.c = new za2();
    }

    @Override // defpackage.atb
    public final void R(qtb qtbVar, long j, ds dsVar) {
        if (this.c.L0() || this.c.isCancelled()) {
            return;
        }
        es esVar = dsVar.b;
        CaptureResult.Key key = CaptureResult.SENSOR_TIMESTAMP;
        key.getClass();
        esVar.getClass();
        Long l = (Long) esVar.a.get(key);
        if (l != null && this.d == null) {
            this.d = l;
        }
        Long l2 = this.d;
        if (this.a == 0 || l2 == null || l == null || l.longValue() - l2.longValue() <= this.a) {
            if (((Boolean) this.b.d(dsVar)).booleanValue()) {
                this.c.R(dsVar);
                return;
            }
            return;
        }
        this.c.R(null);
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Wait for capture result timeout, current: " + l.longValue() + " first: " + l2.longValue());
        }
    }
}
