package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a5d implements yrf {
    public static final a5d a = new a5d();
    public static final w84 b = w84.b1("c", "v", "i", "o");

    @Override // defpackage.yrf
    public final Object x(cj7 cj7Var, float f) {
        if (cj7Var.l() == 1) {
            cj7Var.beginArray();
        }
        cj7Var.beginObject();
        ArrayList arrayListC = null;
        ArrayList arrayListC2 = null;
        ArrayList arrayListC3 = null;
        boolean zH = false;
        while (cj7Var.hasNext()) {
            int iX = cj7Var.x(b);
            if (iX == 0) {
                zH = cj7Var.h();
            } else if (iX == 1) {
                arrayListC = lj7.c(cj7Var, f);
            } else if (iX == 2) {
                arrayListC2 = lj7.c(cj7Var, f);
            } else if (iX != 3) {
                cj7Var.E();
                cj7Var.skipValue();
            } else {
                arrayListC3 = lj7.c(cj7Var, f);
            }
        }
        cj7Var.endObject();
        if (cj7Var.l() == 2) {
            cj7Var.endArray();
        }
        if (arrayListC == null || arrayListC2 == null || arrayListC3 == null) {
            qc0.j("Shape data was missing information.");
            return null;
        }
        if (arrayListC.isEmpty()) {
            return new z4d(new PointF(), false, Collections.EMPTY_LIST);
        }
        int size = arrayListC.size();
        PointF pointF = (PointF) arrayListC.get(0);
        ArrayList arrayList = new ArrayList(size);
        for (int i = 1; i < size; i++) {
            PointF pointF2 = (PointF) arrayListC.get(i);
            int i2 = i - 1;
            arrayList.add(new r03(aw8.a((PointF) arrayListC.get(i2), (PointF) arrayListC3.get(i2)), aw8.a(pointF2, (PointF) arrayListC2.get(i)), pointF2));
        }
        if (zH) {
            PointF pointF3 = (PointF) arrayListC.get(0);
            int i3 = size - 1;
            arrayList.add(new r03(aw8.a((PointF) arrayListC.get(i3), (PointF) arrayListC3.get(i3)), aw8.a(pointF3, (PointF) arrayListC2.get(0)), pointF3));
        }
        return new z4d(pointF, zH, arrayList);
    }
}
