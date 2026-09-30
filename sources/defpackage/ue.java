package defpackage;

import android.app.ActivityOptions;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ue extends eb3 {
    public final ActivityOptions Z;

    public ue(ActivityOptions activityOptions) {
        this.Z = activityOptions;
    }

    public final ue Z(int i) {
        int i2 = Build.VERSION.SDK_INT;
        ActivityOptions activityOptions = this.Z;
        if (i2 >= 34) {
            activityOptions.setPendingIntentBackgroundActivityStartMode(i);
            return this;
        }
        if (i2 >= 33) {
            activityOptions.setPendingIntentBackgroundActivityLaunchAllowed(i != 2);
        }
        return this;
    }
}
