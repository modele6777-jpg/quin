package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dp7 {
    public static fud b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final w84 c = w84.b1("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final w84 d = w84.b1("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = aw8.b(pointF.x, -1.0f, 1.0f);
        pointF.y = aw8.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = aw8.b(pointF2.x, -1.0f, 1.0f);
        float fB = aw8.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = xqf.a;
        int i = f != 0.0f ? (int) (527.0f * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (fB != 0.0f) {
            i = (int) (i * 31 * fB);
        }
        synchronized (dp7.class) {
            fud fudVar = b;
            if (fudVar == null) {
                fudVar = new fud(0);
                b = fudVar;
            }
            weakReference = (WeakReference) abg.q(fudVar, i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference weakReference2 = new WeakReference(pathInterpolator);
            synchronized (dp7.class) {
                b.c(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Code duplicated, block: B:99:0x01f6  */
    /* JADX WARN: Failed to find 'out' block for switch in B:9:0x002d. Please report as an issue. */
    public static bp7 b(cj7 cj7Var, uh8 uh8Var, float f, yrf yrfVar, boolean z, boolean z2) {
        Object obj;
        Interpolator interpolatorA;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        Object obj2;
        bp7 bp7Var;
        w84 w84Var;
        w84 w84Var2;
        PointF pointF;
        w84 w84Var3 = c;
        LinearInterpolator linearInterpolator = a;
        if (!z || !z2) {
            w84 w84Var4 = w84Var3;
            if (!z) {
                return new bp7(yrfVar.x(cj7Var, f));
            }
            cj7Var.beginObject();
            PointF pointFB = null;
            PointF pointFB2 = null;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            boolean z3 = false;
            Object objX = null;
            float fNextDouble = 0.0f;
            Object objX2 = null;
            while (cj7Var.hasNext()) {
                w84Var4 = w84Var4;
                switch (cj7Var.x(w84Var4)) {
                    case 0:
                        fNextDouble = (float) cj7Var.nextDouble();
                        continue;
                    case 1:
                        objX = yrfVar.x(cj7Var, f);
                        break;
                    case 2:
                        objX2 = yrfVar.x(cj7Var, f);
                        break;
                    case 3:
                        pointFB4 = lj7.b(cj7Var, 1.0f);
                        break;
                    case 4:
                        pointFB = lj7.b(cj7Var, 1.0f);
                        break;
                    case 5:
                        z3 = cj7Var.nextInt() == 1;
                        break;
                    case 6:
                        pointFB2 = lj7.b(cj7Var, f);
                        break;
                    case 7:
                        pointFB3 = lj7.b(cj7Var, f);
                        break;
                    default:
                        cj7Var.skipValue();
                        break;
                }
            }
            cj7Var.endObject();
            if (!z3) {
                if (pointFB4 == null || pointFB == null) {
                    obj = objX2;
                } else {
                    interpolatorA = a(pointFB4, pointFB);
                    obj = objX2;
                }
                bp7 bp7Var2 = new bp7(uh8Var, objX, obj, interpolatorA, fNextDouble, (Float) null);
                bp7Var2.o = pointFB2;
                bp7Var2.p = pointFB3;
                return bp7Var2;
            }
            obj = objX;
            interpolatorA = linearInterpolator;
            bp7 bp7Var3 = new bp7(uh8Var, objX, obj, interpolatorA, fNextDouble, (Float) null);
            bp7Var3.o = pointFB2;
            bp7Var3.p = pointFB3;
            return bp7Var3;
        }
        cj7Var.beginObject();
        PointF pointF2 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z4 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF3 = null;
        Object objX3 = null;
        PointF pointF4 = null;
        PointF pointF5 = null;
        float fNextDouble2 = 0.0f;
        Object objX4 = null;
        while (cj7Var.hasNext()) {
            int iX = cj7Var.x(w84Var3);
            w84 w84Var5 = d;
            linearInterpolator = linearInterpolator;
            switch (iX) {
                case 0:
                    w84Var = w84Var3;
                    fNextDouble2 = (float) cj7Var.nextDouble();
                    w84Var3 = w84Var;
                    break;
                case 1:
                    w84Var = w84Var3;
                    objX3 = yrfVar.x(cj7Var, f);
                    w84Var3 = w84Var;
                    break;
                case 2:
                    w84Var = w84Var3;
                    objX4 = yrfVar.x(cj7Var, f);
                    w84Var3 = w84Var;
                    break;
                case 3:
                    w84Var = w84Var3;
                    boolean z5 = z4;
                    Object obj3 = objX3;
                    PointF pointF6 = pointF4;
                    if (cj7Var.l() == 3) {
                        cj7Var.beginObject();
                        float fNextDouble3 = 0.0f;
                        float fNextDouble4 = 0.0f;
                        float fNextDouble5 = 0.0f;
                        float fNextDouble6 = 0.0f;
                        while (cj7Var.hasNext()) {
                            int iX2 = cj7Var.x(w84Var5);
                            if (iX2 != 0) {
                                if (iX2 != 1) {
                                    cj7Var.skipValue();
                                } else if (cj7Var.l() == 7) {
                                    fNextDouble6 = (float) cj7Var.nextDouble();
                                    fNextDouble4 = fNextDouble6;
                                } else {
                                    cj7Var.beginArray();
                                    fNextDouble4 = (float) cj7Var.nextDouble();
                                    fNextDouble6 = cj7Var.l() == 7 ? (float) cj7Var.nextDouble() : fNextDouble4;
                                    cj7Var.endArray();
                                }
                            } else if (cj7Var.l() == 7) {
                                fNextDouble5 = (float) cj7Var.nextDouble();
                                fNextDouble3 = fNextDouble5;
                            } else {
                                cj7Var.beginArray();
                                fNextDouble3 = (float) cj7Var.nextDouble();
                                fNextDouble5 = cj7Var.l() == 7 ? (float) cj7Var.nextDouble() : fNextDouble3;
                                cj7Var.endArray();
                            }
                        }
                        PointF pointF7 = new PointF(fNextDouble3, fNextDouble4);
                        pointF4 = new PointF(fNextDouble5, fNextDouble6);
                        cj7Var.endObject();
                        pointF3 = pointF7;
                    } else {
                        pointFB7 = lj7.b(cj7Var, f);
                        pointF4 = pointF6;
                    }
                    z4 = z5;
                    objX3 = obj3;
                    w84Var3 = w84Var;
                    break;
                case 4:
                    boolean z6 = z4;
                    if (cj7Var.l() == 3) {
                        cj7Var.beginObject();
                        float fNextDouble7 = 0.0f;
                        float fNextDouble8 = 0.0f;
                        float fNextDouble9 = 0.0f;
                        float fNextDouble10 = 0.0f;
                        while (cj7Var.hasNext()) {
                            Object obj4 = objX3;
                            int iX3 = cj7Var.x(w84Var5);
                            if (iX3 != 0) {
                                w84Var2 = w84Var3;
                                if (iX3 != 1) {
                                    cj7Var.skipValue();
                                } else if (cj7Var.l() == 7) {
                                    fNextDouble10 = (float) cj7Var.nextDouble();
                                    pointF4 = pointF4;
                                    fNextDouble8 = fNextDouble10;
                                } else {
                                    pointF = pointF4;
                                    cj7Var.beginArray();
                                    fNextDouble8 = (float) cj7Var.nextDouble();
                                    fNextDouble10 = cj7Var.l() == 7 ? (float) cj7Var.nextDouble() : fNextDouble8;
                                    cj7Var.endArray();
                                    pointF4 = pointF;
                                }
                            } else {
                                w84Var2 = w84Var3;
                                pointF = pointF4;
                                if (cj7Var.l() == 7) {
                                    fNextDouble9 = (float) cj7Var.nextDouble();
                                    pointF4 = pointF;
                                    fNextDouble7 = fNextDouble9;
                                } else {
                                    cj7Var.beginArray();
                                    fNextDouble7 = (float) cj7Var.nextDouble();
                                    fNextDouble9 = cj7Var.l() == 7 ? (float) cj7Var.nextDouble() : fNextDouble7;
                                    cj7Var.endArray();
                                    pointF4 = pointF;
                                }
                            }
                            objX3 = obj4;
                            w84Var3 = w84Var2;
                        }
                        w84Var = w84Var3;
                        PointF pointF8 = new PointF(fNextDouble7, fNextDouble8);
                        pointF2 = new PointF(fNextDouble9, fNextDouble10);
                        cj7Var.endObject();
                        pointF5 = pointF8;
                    } else {
                        w84Var = w84Var3;
                        pointFB8 = lj7.b(cj7Var, f);
                    }
                    z4 = z6;
                    w84Var3 = w84Var;
                    break;
                case 5:
                    z4 = cj7Var.nextInt() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = lj7.b(cj7Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = lj7.b(cj7Var, f);
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    cj7Var.skipValue();
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        Interpolator interpolatorA4 = linearInterpolator;
        boolean z7 = z4;
        Object obj5 = objX3;
        PointF pointF9 = pointF4;
        cj7Var.endObject();
        if (z7) {
            obj2 = obj5;
        } else {
            if (pointFB7 == null || pointFB8 == null) {
                if (pointF3 != null && pointF9 != null && pointF5 != null && pointF2 != null) {
                    interpolatorA2 = a(pointF3, pointF5);
                    interpolatorA3 = a(pointF9, pointF2);
                    obj2 = objX4;
                    interpolatorA4 = null;
                }
                if (interpolatorA2 != null || interpolatorA3 == null) {
                    bp7Var = new bp7(uh8Var, obj5, obj2, interpolatorA4, fNextDouble2, (Float) null);
                } else {
                    bp7Var = new bp7(uh8Var, obj5, obj2, interpolatorA2, interpolatorA3, fNextDouble2);
                }
                bp7Var.o = pointFB5;
                bp7Var.p = pointFB6;
                return bp7Var;
            }
            interpolatorA4 = a(pointFB7, pointFB8);
            obj2 = objX4;
        }
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            bp7Var = new bp7(uh8Var, obj5, obj2, interpolatorA4, fNextDouble2, (Float) null);
        } else {
            bp7Var = new bp7(uh8Var, obj5, obj2, interpolatorA4, fNextDouble2, (Float) null);
        }
        bp7Var.o = pointFB5;
        bp7Var.p = pointFB6;
        return bp7Var;
    }
}
