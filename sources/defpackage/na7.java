package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import android.util.Size;
import android.util.SizeF;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class na7 {
    public final mf1 a;

    public na7(mf1 mf1Var) {
        this.a = mf1Var;
    }

    public static int a(float f, float f2) {
        ok8.k("Focal length should be positive.", f > 0.0f);
        ok8.k("Sensor length should be positive.", f2 > 0.0f);
        int degrees = (int) Math.toDegrees(Math.atan(f2 / (2.0f * f)) * 2.0d);
        ok8.m("The provided focal length and sensor length result in an invalid view angle degrees.", degrees, 0, 360);
        return degrees;
    }

    public static float c(yg1 yg1Var) {
        CameraCharacteristics.Key key = CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS;
        key.getClass();
        Object objC = ((nc1) yg1Var).c(key);
        ok8.n(objC, "The focal lengths can not be empty.");
        float[] fArr = (float[]) objC;
        ok8.o("The focal lengths can not be empty.", !(fArr.length == 0));
        return fArr[0];
    }

    public static float d(yg1 yg1Var) {
        CameraCharacteristics.Key key = CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE;
        key.getClass();
        nc1 nc1Var = (nc1) yg1Var;
        Object objC = nc1Var.c(key);
        ok8.n(objC, "The sensor size can't be null.");
        SizeF sizeF = (SizeF) objC;
        CameraCharacteristics.Key key2 = CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE;
        key2.getClass();
        Object objC2 = nc1Var.c(key2);
        ok8.n(objC2, "The sensor orientation can't be null.");
        CameraCharacteristics.Key key3 = CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE;
        key3.getClass();
        Object objC3 = nc1Var.c(key3);
        ok8.n(objC3, "The active array size can't be null.");
        Size size = (Size) objC3;
        CameraCharacteristics.Key key4 = CameraCharacteristics.SENSOR_ORIENTATION;
        key4.getClass();
        Object objC4 = nc1Var.c(key4);
        ok8.n(objC4, "The pixel array size can't be null.");
        int iIntValue = ((Number) objC4).intValue();
        Size sizeF2 = s2f.f((Rect) objC2);
        if (s2f.c(iIntValue)) {
            SizeF sizeF3 = new SizeF(sizeF.getHeight(), sizeF.getWidth());
            Size size2 = new Size(sizeF2.getHeight(), sizeF2.getWidth());
            size = new Size(size.getHeight(), size.getWidth());
            sizeF2 = size2;
            sizeF = sizeF3;
        }
        return (sizeF.getWidth() * sizeF2.getWidth()) / size.getWidth();
    }

    public final int b(yg1 yg1Var) {
        mf1 mf1Var = this.a;
        try {
            ArrayList arrayListA = mf1.a(mf1Var);
            ok8.n(arrayListA, "Failed to get available camera IDs");
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                String str = ((ig1) it.next()).a;
                yg1 yg1VarB = mf1.b(mf1Var, str);
                ig1.b(str);
                CameraCharacteristics.Key key = CameraCharacteristics.LENS_FACING;
                key.getClass();
                Object objC = ((nc1) yg1VarB).c(key);
                ok8.n(objC, "Failed to get CameraCharacteristics.LENS_FACING for " + ((Object) ig1.b(str)));
                int iIntValue = ((Number) objC).intValue();
                nc1 nc1Var = (nc1) yg1Var;
                Object objC2 = nc1Var.c(key);
                ok8.n(objC2, "Failed to get the required LENS_FACING for " + ((Object) ig1.b(nc1Var.a)));
                if (iIntValue == ((Number) objC2).intValue()) {
                    return a(c(yg1VarB), d(yg1VarB));
                }
            }
            throw new IllegalStateException("Could not find the default camera for " + ((Object) ig1.b(((nc1) yg1Var).a)));
        } catch (Exception e) {
            ho7.r("Failed to get a valid view angle", e);
            return 0;
        }
    }
}
