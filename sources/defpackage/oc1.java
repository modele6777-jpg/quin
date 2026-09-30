package defpackage;

import android.hardware.camera2.CameraManager;
import android.util.Log;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oc1 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ awa b;
    public final /* synthetic */ Object c;

    public oc1(awa awaVar, rc1 rc1Var) {
        this.b = awaVar;
        this.c = rc1Var;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public void onCameraAccessPrioritiesChanged() {
        switch (this.a) {
            case 0:
                Log.d("CXCP", "Camera access priorities have changed");
                if (rxg.b0(this.b, sj1.a) instanceof qw1) {
                    b1.l("CXCP", "Failed to emit CameraPrioritiesChanged");
                }
                break;
            default:
                super.onCameraAccessPrioritiesChanged();
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        int i = this.a;
        awa awaVar = this.b;
        Object obj = this.c;
        str.getClass();
        switch (i) {
            case 0:
                if (str.equals(((rc1) obj).b)) {
                    Log.d("CXCP", "Camera " + str + " has become available");
                    ig1.a(str);
                    if (rxg.b0(awaVar, new rj1(str)) instanceof qw1) {
                        b1.l("CXCP", "Failed to emit CameraAvailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                ((gd1) obj).c(awaVar, str, true);
                break;
        }
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraUnavailable(String str) {
        int i = this.a;
        awa awaVar = this.b;
        Object obj = this.c;
        str.getClass();
        switch (i) {
            case 0:
                if (str.equals(((rc1) obj).b)) {
                    Log.d("CXCP", "Camera " + str + " has become unavailable");
                    ig1.a(str);
                    if (rxg.b0(awaVar, new tj1(str)) instanceof qw1) {
                        b1.l("CXCP", "Failed to emit CameraUnavailable(" + str + ')');
                    }
                    break;
                }
                break;
            default:
                ((gd1) obj).c(awaVar, str, false);
                break;
        }
    }

    public oc1(gd1 gd1Var, awa awaVar) {
        this.c = gd1Var;
        this.b = awaVar;
    }
}
