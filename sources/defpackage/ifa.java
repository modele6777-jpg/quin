package defpackage;

import android.os.Build;
import android.view.SurfaceControl;
import android.view.View;
import android.widget.Magnifier;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ifa implements efa {
    public static final ifa a = new ifa();

    public static bae b(exf exfVar) {
        exfVar.getClass();
        if (Build.VERSION.SDK_INT < 29) {
            return qfc.f;
        }
        SurfaceControl surfaceControl = exfVar.getSurfaceControl();
        surfaceControl.getClass();
        return new aae(surfaceControl);
    }

    @Override // defpackage.efa
    public boolean a() {
        return true;
    }

    @Override // defpackage.efa
    public dfa c(View view, boolean z, long j, float f, float f2, boolean z2, sw3 sw3Var, float f3) {
        if (z) {
            return new hfa(new Magnifier(view));
        }
        long jN0 = sw3Var.N0(j);
        float fP0 = sw3Var.p0(f);
        float fP1 = sw3Var.p0(f2);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jN0 != 9205357640488583168L) {
            builder.setSize(ym8.L(Float.intBitsToFloat((int) (jN0 >> 32))), ym8.L(Float.intBitsToFloat((int) (jN0 & 4294967295L))));
        }
        if (!Float.isNaN(fP0)) {
            builder.setCornerRadius(fP0);
        }
        if (!Float.isNaN(fP1)) {
            builder.setElevation(fP1);
        }
        if (!Float.isNaN(f3)) {
            builder.setInitialZoom(f3);
        }
        builder.setClippingEnabled(z2);
        return new hfa(builder.build());
    }
}
