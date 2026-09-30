package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j1a extends cp7 {
    public final PointF h;
    public final float[] i;
    public final float[] j;
    public final PathMeasure k;
    public i1a l;

    public j1a(ArrayList arrayList) {
        super(arrayList);
        this.h = new PointF();
        this.i = new float[2];
        this.j = new float[2];
        this.k = new PathMeasure();
    }

    @Override // defpackage.du0
    public final Object e(bp7 bp7Var, float f) {
        i1a i1aVar = (i1a) bp7Var;
        Path path = i1aVar.q;
        if (path == null) {
            return (PointF) bp7Var.b;
        }
        i1a i1aVar2 = this.l;
        PathMeasure pathMeasure = this.k;
        if (i1aVar2 != i1aVar) {
            pathMeasure.setPath(path, false);
            this.l = i1aVar;
        }
        float length = pathMeasure.getLength();
        float f2 = f * length;
        float[] fArr = this.i;
        float[] fArr2 = this.j;
        pathMeasure.getPosTan(f2, fArr, fArr2);
        float f3 = fArr[0];
        float f4 = fArr[1];
        PointF pointF = this.h;
        pointF.set(f3, f4);
        if (f2 < 0.0f) {
            pointF.offset(fArr2[0] * f2, fArr2[1] * f2);
            return pointF;
        }
        if (f2 > length) {
            float f5 = f2 - length;
            pointF.offset(fArr2[0] * f5, fArr2[1] * f5);
        }
        return pointF;
    }
}
