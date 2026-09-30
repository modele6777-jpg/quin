package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.util.Log;
import android.util.Size;
import io.sentry.android.core.b1;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mg1 implements ng1, yff {
    public final gh1 a;
    public final ue1 b;
    public final aj1 c;
    public final ff1 d;
    public final ui1 e;
    public final w2e f;
    public final ace g;
    public final ace v;

    public mg1(gh1 gh1Var, ue1 ue1Var, aj1 aj1Var, ff1 ff1Var, ge1 ge1Var, yn5 yn5Var, ui1 ui1Var, hv4 hv4Var, w2e w2eVar, na7 na7Var, vea veaVar) {
        String str;
        gh1Var.getClass();
        ue1Var.getClass();
        aj1Var.getClass();
        ff1Var.getClass();
        ge1Var.getClass();
        yn5Var.getClass();
        ui1Var.getClass();
        hv4Var.getClass();
        w2eVar.getClass();
        na7Var.getClass();
        veaVar.getClass();
        this.a = gh1Var;
        this.b = ue1Var;
        this.c = aj1Var;
        this.d = ff1Var;
        this.e = ui1Var;
        this.f = w2eVar;
        yg1 yg1Var = gh1Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL;
        key.getClass();
        nc1 nc1Var = (nc1) yg1Var;
        nc1Var.getClass();
        Object objC = nc1Var.c(key);
        Integer num = (Integer) (objC != null ? objC : -1);
        final int i = 1;
        final int i2 = 2;
        if (num.intValue() == 2) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY";
        } else if (num.intValue() == 4) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_EXTERNAL";
        } else if (num.intValue() == 0) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED";
        } else if (num.intValue() == 1) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_FULL";
        } else if (num.intValue() == 3) {
            str = "INFO_SUPPORTED_HARDWARE_LEVEL_3";
        } else {
            str = "Unknown value: " + num;
        }
        if (b21.F(4, "CXCP")) {
            Log.i("CXCP", "Device Level: ".concat(str));
        }
        final int i3 = 0;
        new ace(new x16(this) { // from class: lg1
            public final /* synthetic */ mg1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i3;
                mg1 mg1Var = this.b;
                switch (i4) {
                    case 0:
                        gh1 gh1Var2 = mg1Var.a;
                        Set<ig1> set = (Set) ((nc1) gh1Var2.b).v.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (ig1 ig1Var : set) {
                            String str2 = ig1Var.a;
                            ue1 ue1Var2 = new ue1(str2, 0);
                            nc1 nc1Var2 = (nc1) gh1Var2.b;
                            nc1Var2.getClass();
                            if (!((Set) nc1Var2.v.getValue()).contains(ig1Var)) {
                                throw new IllegalStateException((((Object) ig1.b(str2)) + " is not a valid physical camera on " + nc1Var2).toString());
                            }
                            linkedHashSet.add(new jda(new gh1(ue1Var2, nc1Var2.c.a(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        xg1 xg1Var = yg1.o;
                        yg1 yg1Var2 = mg1Var.a.b;
                        xg1Var.getClass();
                        return Boolean.valueOf(xg1.c(yg1Var2));
                    default:
                        gh1 gh1Var3 = mg1Var.a;
                        gh1Var3.getClass();
                        lc1 lc1Var = new lc1();
                        String str3 = gh1Var3.a.a;
                        return lc1Var;
                }
            }
        });
        this.g = new ace(new x16(this) { // from class: lg1
            public final /* synthetic */ mg1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i;
                mg1 mg1Var = this.b;
                switch (i4) {
                    case 0:
                        gh1 gh1Var2 = mg1Var.a;
                        Set<ig1> set = (Set) ((nc1) gh1Var2.b).v.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (ig1 ig1Var : set) {
                            String str2 = ig1Var.a;
                            ue1 ue1Var2 = new ue1(str2, 0);
                            nc1 nc1Var2 = (nc1) gh1Var2.b;
                            nc1Var2.getClass();
                            if (!((Set) nc1Var2.v.getValue()).contains(ig1Var)) {
                                throw new IllegalStateException((((Object) ig1.b(str2)) + " is not a valid physical camera on " + nc1Var2).toString());
                            }
                            linkedHashSet.add(new jda(new gh1(ue1Var2, nc1Var2.c.a(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        xg1 xg1Var = yg1.o;
                        yg1 yg1Var2 = mg1Var.a.b;
                        xg1Var.getClass();
                        return Boolean.valueOf(xg1.c(yg1Var2));
                    default:
                        gh1 gh1Var3 = mg1Var.a;
                        gh1Var3.getClass();
                        lc1 lc1Var = new lc1();
                        String str3 = gh1Var3.a.a;
                        return lc1Var;
                }
            }
        });
        this.v = new ace(new x16(this) { // from class: lg1
            public final /* synthetic */ mg1 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i4 = i2;
                mg1 mg1Var = this.b;
                switch (i4) {
                    case 0:
                        gh1 gh1Var2 = mg1Var.a;
                        Set<ig1> set = (Set) ((nc1) gh1Var2.b).v.getValue();
                        LinkedHashSet linkedHashSet = new LinkedHashSet();
                        for (ig1 ig1Var : set) {
                            String str2 = ig1Var.a;
                            ue1 ue1Var2 = new ue1(str2, 0);
                            nc1 nc1Var2 = (nc1) gh1Var2.b;
                            nc1Var2.getClass();
                            if (!((Set) nc1Var2.v.getValue()).contains(ig1Var)) {
                                throw new IllegalStateException((((Object) ig1.b(str2)) + " is not a valid physical camera on " + nc1Var2).toString());
                            }
                            linkedHashSet.add(new jda(new gh1(ue1Var2, nc1Var2.c.a(str2))));
                        }
                        return linkedHashSet;
                    case 1:
                        xg1 xg1Var = yg1.o;
                        yg1 yg1Var2 = mg1Var.a.b;
                        xg1Var.getClass();
                        return Boolean.valueOf(xg1.c(yg1Var2));
                    default:
                        gh1 gh1Var3 = mg1Var.a;
                        gh1Var3.getClass();
                        lc1 lc1Var = new lc1();
                        String str3 = gh1Var3.a.a;
                        return lc1Var;
                }
            }
        });
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        kob kobVar = job.a;
        if (em7Var.equals(kobVar.b(lc1.class))) {
            lc1 lc1Var = (lc1) this.v.getValue();
            lc1Var.getClass();
            return lc1Var;
        }
        boolean zEquals = em7Var.equals(kobVar.b(gh1.class));
        gh1 gh1Var = this.a;
        if (zEquals) {
            gh1Var.getClass();
            return gh1Var;
        }
        if (!em7Var.equals(kobVar.b(yg1.class))) {
            return ((nc1) gh1Var.b).H0(em7Var);
        }
        yg1 yg1Var = gh1Var.b;
        yg1Var.getClass();
        return yg1Var;
    }

    @Override // defpackage.ng1
    public final Set a() {
        return ((tr4) q6.g(this.a.b).b).a();
    }

    @Override // defpackage.kg1
    public final int b() {
        return p(0);
    }

    @Override // defpackage.ng1
    public final boolean c() {
        yg1 yg1Var = this.a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES;
        key.getClass();
        int[] iArr = (int[]) ((nc1) yg1Var).c(key);
        return iArr != null && qd0.T(iArr, 1);
    }

    @Override // defpackage.ng1
    public final String d() {
        return this.b.a;
    }

    @Override // defpackage.kg1
    public final q98 e() {
        return this.d.a.e;
    }

    @Override // defpackage.ng1
    public final Rect g() {
        yg1 yg1Var = this.a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key.getClass();
        Rect rect = (Rect) ((nc1) yg1Var).c(key);
        if ("robolectric".equals(Build.FINGERPRINT) && rect == null) {
            return new Rect(0, 0, 4000, 3000);
        }
        rect.getClass();
        return rect;
    }

    @Override // defpackage.kg1
    public final q98 i() {
        return this.c.c;
    }

    @Override // defpackage.kg1
    public final int m() {
        yg1 yg1Var = this.a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
        key.getClass();
        Object objC = ((nc1) yg1Var).c(key);
        objC.getClass();
        int iIntValue = ((Number) objC).intValue();
        if (iIntValue == 0) {
            return 0;
        }
        int i = 1;
        if (iIntValue != 1) {
            i = 2;
            if (iIntValue != 2) {
                if (!b21.F(5, "CXCP")) {
                    return -1;
                }
                b1.l("CXCP", "Unrecognized lens facing: " + iIntValue + '!');
                return -1;
            }
        }
        return i;
    }

    @Override // defpackage.kg1
    public final String n() {
        return ((Boolean) this.g.getValue()).booleanValue() ? "androidx.camera.camera2.legacy" : "androidx.camera.camera2";
    }

    @Override // defpackage.ng1
    public final List o(int i) {
        Size[] sizeArrA = this.f.a(i);
        return sizeArrA != null ? qd0.G0(sizeArrA) : pu4.a;
    }

    @Override // defpackage.kg1
    public final int p(int i) {
        yg1 yg1Var = this.a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_ORIENTATION;
        key.getClass();
        Object objC = ((nc1) yg1Var).c(key);
        objC.getClass();
        return od4.v(od4.G(i), ((Number) objC).intValue(), 1 == m());
    }

    @Override // defpackage.ng1
    public final Object q() {
        Object objH0 = ((nc1) this.a.b).H0(job.a.b(CameraCharacteristics.class));
        objH0.getClass();
        return (CameraCharacteristics) objH0;
    }

    @Override // defpackage.kg1
    public final boolean r() {
        return oa7.T(this.a);
    }

    @Override // defpackage.ng1
    public final k9b s() {
        return this.e.a();
    }

    @Override // defpackage.ng1
    public final List t(int i) {
        Size[] sizeArrB = this.f.b(i);
        return sizeArrB != null ? qd0.G0(sizeArrB) : pu4.a;
    }

    public final String toString() {
        return "CameraInfoAdapter<" + this.b + ".cameraId>";
    }

    @Override // defpackage.ng1
    public final Set v() {
        int length;
        yg1 yg1Var = this.a.b;
        CameraCharacteristics.Key key = CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES;
        key.getClass();
        int[] iArr = (int[]) ((nc1) yg1Var).c(key);
        xu4 xu4Var = xu4.a;
        if (iArr == null || (length = iArr.length) == 0) {
            return xu4Var;
        }
        if (length == 1) {
            return n3d.p(Integer.valueOf(iArr[0]));
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(bm8.F(iArr.length));
        for (int i : iArr) {
            linkedHashSet.add(Integer.valueOf(i));
        }
        return linkedHashSet;
    }

    @Override // defpackage.ng1
    public final Set w() {
        Integer[] numArrG = this.f.d.g();
        return numArrG != null ? qd0.I0(numArrG) : xu4.a;
    }

    @Override // defpackage.ng1
    public final boolean y() {
        xg1 xg1Var = yg1.o;
        yg1 yg1Var = this.a.b;
        xg1Var.getClass();
        return xg1.b(yg1Var);
    }
}
