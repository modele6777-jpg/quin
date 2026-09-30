package defpackage;

import android.hardware.camera2.CameraManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ob1 extends CameraManager.AvailabilityCallback {
    public final /* synthetic */ awa a;

    public ob1(awa awaVar) {
        this.a = awaVar;
    }

    @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
    public final void onCameraAvailable(String str) {
        str.getClass();
        ig1.a(str);
        rxg.b0(this.a, new ig1(str));
    }
}
