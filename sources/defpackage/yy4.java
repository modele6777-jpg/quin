package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import android.util.Rational;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yy4 {
    public final lkf a;
    public final w92 b;
    public final Range c;
    public final boolean d;
    public final Rational e;
    public za2 f;
    public xy4 g;

    public yy4(gh1 gh1Var, lkf lkfVar, w92 w92Var) {
        Integer num;
        Rational rational;
        gh1Var.getClass();
        lkfVar.getClass();
        w92Var.getClass();
        this.a = lkfVar;
        this.b = w92Var;
        yg1 yg1Var = gh1Var.b;
        CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_COMPENSATION_RANGE;
        key.getClass();
        Object obj = vy4.a;
        nc1 nc1Var = (nc1) yg1Var;
        nc1Var.getClass();
        Object objC = nc1Var.c(key);
        obj = objC != null ? objC : obj;
        obj.getClass();
        Range range = (Range) obj;
        this.c = range;
        Integer num2 = (Integer) range.getUpper();
        boolean z = (num2 == null || num2.intValue() != 0) && ((num = (Integer) range.getLower()) == null || num.intValue() != 0);
        this.d = z;
        if (z) {
            CameraCharacteristics.Key key2 = CameraCharacteristics.CONTROL_AE_COMPENSATION_STEP;
            key2.getClass();
            Object objC2 = nc1Var.c(key2);
            objC2.getClass();
            rational = (Rational) objC2;
        } else {
            rational = Rational.ZERO;
            rational.getClass();
        }
        this.e = rational;
    }
}
