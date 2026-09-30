package defpackage;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class lj7 {
    public static final w84 a = w84.b1("x", "y");

    public static int a(cj7 cj7Var) {
        cj7Var.beginArray();
        int iNextDouble = (int) (cj7Var.nextDouble() * 255.0d);
        int iNextDouble2 = (int) (cj7Var.nextDouble() * 255.0d);
        int iNextDouble3 = (int) (cj7Var.nextDouble() * 255.0d);
        while (cj7Var.hasNext()) {
            cj7Var.skipValue();
        }
        cj7Var.endArray();
        return Color.argb(255, iNextDouble, iNextDouble2, iNextDouble3);
    }

    public static PointF b(cj7 cj7Var, float f) {
        int iB = kv2.B(cj7Var.l());
        if (iB == 0) {
            cj7Var.beginArray();
            float fNextDouble = (float) cj7Var.nextDouble();
            float fNextDouble2 = (float) cj7Var.nextDouble();
            while (cj7Var.l() != 2) {
                cj7Var.skipValue();
            }
            cj7Var.endArray();
            return new PointF(fNextDouble * f, fNextDouble2 * f);
        }
        if (iB != 2) {
            if (iB != 6) {
                qc0.j("Unknown point starts with ".concat(ub3.w(cj7Var.l())));
                return null;
            }
            float fNextDouble3 = (float) cj7Var.nextDouble();
            float fNextDouble4 = (float) cj7Var.nextDouble();
            while (cj7Var.hasNext()) {
                cj7Var.skipValue();
            }
            return new PointF(fNextDouble3 * f, fNextDouble4 * f);
        }
        cj7Var.beginObject();
        float fD = 0.0f;
        float fD2 = 0.0f;
        while (cj7Var.hasNext()) {
            int iX = cj7Var.x(a);
            if (iX == 0) {
                fD = d(cj7Var);
            } else if (iX != 1) {
                cj7Var.E();
                cj7Var.skipValue();
            } else {
                fD2 = d(cj7Var);
            }
        }
        cj7Var.endObject();
        return new PointF(fD * f, fD2 * f);
    }

    public static ArrayList c(cj7 cj7Var, float f) {
        ArrayList arrayList = new ArrayList();
        cj7Var.beginArray();
        while (cj7Var.l() == 1) {
            cj7Var.beginArray();
            arrayList.add(b(cj7Var, f));
            cj7Var.endArray();
        }
        cj7Var.endArray();
        return arrayList;
    }

    public static float d(cj7 cj7Var) {
        int iL = cj7Var.l();
        int iB = kv2.B(iL);
        if (iB != 0) {
            if (iB == 6) {
                return (float) cj7Var.nextDouble();
            }
            qc0.j("Unknown value for token of type ".concat(ub3.w(iL)));
            return 0.0f;
        }
        cj7Var.beginArray();
        float fNextDouble = (float) cj7Var.nextDouble();
        while (cj7Var.hasNext()) {
            cj7Var.skipValue();
        }
        cj7Var.endArray();
        return fNextDouble;
    }
}
