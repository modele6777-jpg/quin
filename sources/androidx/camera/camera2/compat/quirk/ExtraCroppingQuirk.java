package androidx.camera.camera2.compat.quirk;

import android.util.Range;
import android.util.Size;
import defpackage.bm8;
import defpackage.g9b;
import defpackage.iy9;
import defpackage.vd0;
import defpackage.y9e;
import defpackage.z7c;
import java.util.LinkedHashMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/camera/camera2/compat/quirk/ExtraCroppingQuirk;", "Lg9b;", "vd0", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class ExtraCroppingQuirk implements g9b {
    public static final LinkedHashMap a = bm8.I(new iy9("SM-T580", null), new iy9("SM-J710MN", new Range(21, 26)), new iy9("SM-A320FL", null), new iy9("SM-G570M", null), new iy9("SM-G610F", null), new iy9("SM-G610M", new Range(21, 26)));

    public static Size b(y9e y9eVar) {
        if (!vd0.g0()) {
            return null;
        }
        int iOrdinal = y9eVar.ordinal();
        if (iOrdinal == 0) {
            return new Size(1920, 1080);
        }
        if (iOrdinal == 1) {
            return new Size(1280, 720);
        }
        if (iOrdinal != 2) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
