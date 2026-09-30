package defpackage;

import android.os.Build;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v8g implements u8g {
    public final tw3 b;

    public v8g() {
        this.b = Build.VERSION.SDK_INT >= 34 ? uw3.a : ndb.O0;
        t72.q(1, 2, 4, 8, 16, 32, 64, Integer.valueOf(UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
    }
}
