package defpackage;

import android.util.Size;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public enum w9e {
    VGA(0, new Size(640, 480)),
    X_VGA(1, new Size(UserMetadata.MAX_ATTRIBUTE_SIZE, 768)),
    S720P_16_9(2, new Size(1280, 720)),
    PREVIEW(3, null),
    S1080P_4_3(4, new Size(1440, 1080)),
    S1080P_16_9(5, new Size(1920, 1080)),
    S1440P_4_3(6, new Size(1920, 1440)),
    S1440P_16_9(7, new Size(2560, 1440)),
    UHD(8, new Size(3840, 2160)),
    RECORD(9, null),
    MAXIMUM(10, null),
    MAXIMUM_4_3(11, null),
    MAXIMUM_16_9(12, null),
    ULTRA_MAXIMUM(13, null),
    NOT_SUPPORT(14, null);

    private final int id;
    private final Size relatedFixedSize;

    w9e(int i, Size size) {
        this.id = i;
        this.relatedFixedSize = size;
    }

    public final int a() {
        return this.id;
    }

    public final Size b() {
        return this.relatedFixedSize;
    }
}
