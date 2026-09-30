package defpackage;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ym5 implements xle {
    public final boolean a;
    public final boolean b;

    public ym5(k9b k9bVar) {
        boolean z;
        k9bVar.getClass();
        Iterator it = k9bVar.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                z = true;
                this.a = z;
                this.b = k9bVar.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
            }
        }
        z = false;
        this.a = z;
        this.b = k9bVar.a(ImageCaptureFailedForVideoSnapshotQuirk.class);
    }

    @Override // defpackage.xle
    public Map a(ttb ttbVar) {
        if (ttbVar != null && ttbVar.a == 3 && this.a) {
            return bm8.G(new iy9(CaptureRequest.CONTROL_CAPTURE_INTENT, 1));
        }
        return (ttbVar != null && ttbVar.a == 4 && this.b) ? bm8.G(new iy9(CaptureRequest.CONTROL_CAPTURE_INTENT, 2)) : qu4.a;
    }

    public ym5(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }
}
