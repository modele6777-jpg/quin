package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class j8g extends o7c {
    public final WindowInsetsController a;
    public final Window b;

    public j8g(Window window) {
        this.a = window.getInsetsController();
        this.b = window;
    }

    @Override // defpackage.o7c
    public void A(boolean z) {
        G(16, 16, z);
    }

    @Override // defpackage.o7c
    public void B(boolean z) {
        G(UserMetadata.MAX_INTERNAL_KEY_SIZE, 8, z);
    }

    public final void G(int i, int i2, boolean z) {
        Window window = this.b;
        if (window == null) {
            WindowInsetsController windowInsetsController = this.a;
            if (z) {
                windowInsetsController.setSystemBarsAppearance(i2, i2);
                return;
            } else {
                windowInsetsController.setSystemBarsAppearance(0, i2);
                return;
            }
        }
        if (z) {
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        } else {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility((~i) & decorView2.getSystemUiVisibility());
        }
    }
}
