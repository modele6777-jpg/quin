package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Range;
import androidx.camera.camera2.compat.quirk.CaptureIntentPreviewQuirk;
import androidx.camera.camera2.compat.quirk.ImageCaptureFailedForVideoSnapshotQuirk;
import io.sentry.android.core.b1;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o23 {
    public final g1b A;
    public final g1b B;
    public final g1b C;
    public final g1b D;
    public final g1b E;
    public final g1b F;
    public final g1b G;
    public final g1b H;
    public final g1b I;
    public final ue1 a;
    public final vea b;
    public final n23 c;
    public final g1b d;
    public final g1b e;
    public final g1b f;
    public final g1b g;
    public final g1b h;
    public final g1b i;
    public final g1b j;
    public final g1b k;
    public final g1b l;
    public final g1b m;
    public final g1b n;
    public final g1b o;
    public final g1b p;
    public final g1b q;
    public final g1b r;
    public final g1b s;
    public final g1b t;
    public final g1b u;
    public final g1b v;
    public final g1b w;
    public final g1b x;
    public final g1b y;
    public final vd9 z = new vd9(15);

    public o23(n23 n23Var, ue1 ue1Var, vea veaVar) {
        this.c = n23Var;
        this.a = ue1Var;
        this.b = veaVar;
        this.d = ks0.b(n23Var, this, 4);
        this.e = ks0.b(n23Var, this, 3);
        this.f = ks0.b(n23Var, this, 2);
        this.g = ks0.b(n23Var, this, 9);
        this.h = ks0.b(n23Var, this, 10);
        this.i = ks0.b(n23Var, this, 8);
        this.j = ks0.b(n23Var, this, 7);
        this.k = ks0.b(n23Var, this, 11);
        this.l = ks0.b(n23Var, this, 6);
        this.m = ks0.b(n23Var, this, 12);
        this.n = ks0.b(n23Var, this, 5);
        this.o = ks0.b(n23Var, this, 14);
        this.p = ks0.b(n23Var, this, 13);
        this.q = ks0.b(n23Var, this, 16);
        this.r = ks0.b(n23Var, this, 15);
        this.s = ks0.b(n23Var, this, 17);
        this.t = ks0.b(n23Var, this, 18);
        this.u = ks0.b(n23Var, this, 19);
        this.v = ks0.b(n23Var, this, 20);
        this.w = ks0.b(n23Var, this, 22);
        this.x = ks0.b(n23Var, this, 21);
        this.y = ks0.b(n23Var, this, 23);
        this.A = ks0.b(n23Var, this, 25);
        this.B = ks0.b(n23Var, this, 26);
        this.C = ks0.b(n23Var, this, 28);
        this.D = ks0.b(n23Var, this, 27);
        this.E = ks0.b(n23Var, this, 29);
        this.F = ks0.b(n23Var, this, 24);
        this.G = ks0.b(n23Var, this, 30);
        this.H = ks0.b(n23Var, this, 1);
        this.I = ks0.b(n23Var, this, 31);
        vd9.H(this.z, qi4.a(new os(n23Var, this, 0, 2)));
    }

    public final xle a() {
        ui1 ui1Var = (ui1) this.j.get();
        ui1Var.getClass();
        k9b k9bVarA = ui1Var.a();
        k9bVarA.getClass();
        Iterator it = k9bVarA.c(CaptureIntentPreviewQuirk.class).iterator();
        while (it.hasNext()) {
            if (((CaptureIntentPreviewQuirk) it.next()).a()) {
                return new ym5(k9bVarA);
            }
        }
        if (!k9bVarA.a(ImageCaptureFailedForVideoSnapshotQuirk.class)) {
            return ndb.e1;
        }
        return new ym5(k9bVarA);
    }

    public final ydg b() {
        Range rangeE;
        gh1 gh1Var = (gh1) this.e.get();
        gh1Var.getClass();
        yg1 yg1Var = gh1Var.b;
        if ("robolectric".equals(Build.FINGERPRINT)) {
            List<CameraCharacteristics.Key> list = of9.a;
            if (list == null || !list.isEmpty()) {
                for (CameraCharacteristics.Key key : list) {
                    if (b21.F(5, "CXCP")) {
                        b1.l("CXCP", "Failed to read " + key + " for zoom features.");
                    }
                    key.getClass();
                    if (((nc1) yg1Var).c(key) == null) {
                        return new of9();
                    }
                }
            }
        } else if (Build.VERSION.SDK_INT >= 30 && (rangeE = p6.e(yg1Var)) != null) {
            return new su(gh1Var, rangeE);
        }
        return new a90(gh1Var);
    }
}
