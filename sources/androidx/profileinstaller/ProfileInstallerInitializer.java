package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import defpackage.c37;
import defpackage.yx4;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements c37 {
    @Override // defpackage.c37
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.c37
    public final Object b(Context context) {
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback(this) { // from class: nwa
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                (Build.VERSION.SDK_INT >= 28 ? s.k(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new kh(applicationContext, 3), new Random().nextInt(Math.max(1000, 1)) + 5000);
            }
        });
        return new yx4(20);
    }
}
