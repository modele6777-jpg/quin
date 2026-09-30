package defpackage;

import android.os.Build;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gh6 {
    public final View a;

    public gh6(View view) {
        view.getClass();
        this.a = view;
    }

    public final void a() {
        b(hh6.c);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0023  */
    public final void b(hh6 hh6Var) {
        int iOrdinal = hh6Var.ordinal();
        int i = 16;
        if (iOrdinal == 0) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 < 30) {
                if (i2 >= 29) {
                    i = 3;
                } else {
                    i = 1;
                }
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                i = 4;
            } else if (iOrdinal != 3) {
                if (iOrdinal != 4) {
                    ap.c();
                    return;
                }
                i = 4;
            } else {
                i = 0;
            }
        } else if (Build.VERSION.SDK_INT < 30) {
            i = 1;
        }
        this.a.performHapticFeedback(i);
    }

    public final void c() {
        b(hh6.a);
    }
}
