package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jda implements kg1, yff {
    public final gh1 a;
    public final ace b = new ace(new zv6(27, this));

    public jda(gh1 gh1Var) {
        this.a = gh1Var;
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        kob kobVar = job.a;
        if (em7Var.equals(kobVar.b(lc1.class))) {
            lc1 lc1Var = (lc1) this.b.getValue();
            lc1Var.getClass();
            return lc1Var;
        }
        boolean zEquals = em7Var.equals(kobVar.b(gh1.class));
        gh1 gh1Var = this.a;
        if (zEquals) {
            return gh1Var;
        }
        boolean zEquals2 = em7Var.equals(kobVar.b(CameraMetadata.class));
        yg1 yg1Var = gh1Var.b;
        if (!zEquals2) {
            return ((nc1) yg1Var).H0(em7Var);
        }
        yg1Var.getClass();
        return yg1Var;
    }

    @Override // defpackage.kg1
    public final int b() {
        return p(0);
    }

    @Override // defpackage.kg1
    public final q98 e() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
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
        if (iIntValue == 1) {
            return 1;
        }
        if (iIntValue == 2) {
            return 2;
        }
        qc0.j(tec.f(iIntValue, "The specified lens facing integer ", " can not be recognized."));
        return 0;
    }

    @Override // defpackage.kg1
    public final String n() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
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

    @Override // defpackage.kg1
    public final boolean r() {
        throw new UnsupportedOperationException("Physical camera doesn't support this function");
    }
}
