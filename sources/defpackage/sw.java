package defpackage;

import android.os.Build;
import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sw implements rvf {
    public final ViewConfiguration a;

    public sw(ViewConfiguration viewConfiguration) {
        this.a = viewConfiguration;
    }

    @Override // defpackage.rvf
    public final long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // defpackage.rvf
    public final long b() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // defpackage.rvf
    public final float c() {
        if (Build.VERSION.SDK_INT >= 34) {
            return hgc.s(this.a);
        }
        return 2.0f;
    }

    @Override // defpackage.rvf
    public final float e() {
        return this.a.getScaledMaximumFlingVelocity();
    }

    @Override // defpackage.rvf
    public final float f() {
        return this.a.getScaledTouchSlop();
    }

    @Override // defpackage.rvf
    public final float g() {
        if (Build.VERSION.SDK_INT >= 34) {
            return hgc.r(this.a);
        }
        return 16.0f;
    }
}
