package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zt {
    public final Path a;
    public RectF b;
    public float[] c;
    public Matrix d;

    public zt(Path path) {
        this.a = path;
    }

    public static void a(zt ztVar, zt ztVar2) {
        Path path = ztVar.a;
        if (ztVar2 instanceof zt) {
            path.addPath(ztVar2.a, Float.intBitsToFloat(0), Float.intBitsToFloat(0));
        } else {
            s8f.i("Unable to obtain android.graphics.Path");
        }
    }

    public static void b(zt ztVar, hkb hkbVar) {
        float f = hkbVar.a;
        float f2 = hkbVar.d;
        float f3 = hkbVar.c;
        float f4 = hkbVar.b;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            cu.b("Invalid rectangle, make sure no value is NaN");
        }
        RectF rectF = ztVar.b;
        if (rectF == null) {
            rectF = new RectF();
            ztVar.b = rectF;
        }
        rectF.set(f, f4, f3, f2);
        Path path = ztVar.a;
        RectF rectF2 = ztVar.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
    }

    public static void c(zt ztVar, v6c v6cVar) {
        RectF rectF = ztVar.b;
        if (rectF == null) {
            rectF = new RectF();
            ztVar.b = rectF;
        }
        float f = v6cVar.a;
        long j = v6cVar.h;
        long j2 = v6cVar.g;
        long j3 = v6cVar.f;
        long j4 = v6cVar.e;
        rectF.set(f, v6cVar.b, v6cVar.c, v6cVar.d);
        float[] fArr = ztVar.c;
        if (fArr == null) {
            fArr = new float[8];
            ztVar.c = fArr;
        }
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        Path path = ztVar.a;
        RectF rectF2 = ztVar.b;
        rectF2.getClass();
        float[] fArr2 = ztVar.c;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, Path.Direction.CCW);
    }

    public final void d(hkb hkbVar, float f, float f2, boolean z) {
        float f3 = hkbVar.a;
        float f4 = hkbVar.b;
        float f5 = hkbVar.c;
        float f6 = hkbVar.d;
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        rectF.set(f3, f4, f5, f6);
        RectF rectF2 = this.b;
        rectF2.getClass();
        this.a.arcTo(rectF2, f, f2, z);
    }

    public final void e() {
        this.a.close();
    }

    public final hkb f() {
        RectF rectF = this.b;
        if (rectF == null) {
            rectF = new RectF();
            this.b = rectF;
        }
        this.a.computeBounds(rectF, true);
        return new hkb(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final void g(float f, float f2) {
        this.a.lineTo(f, f2);
    }

    public final void h(float f, float f2) {
        this.a.moveTo(f, f2);
    }

    public final boolean i(zt ztVar, zt ztVar2, int i) {
        Path.Op op;
        if (i == 0) {
            op = Path.Op.DIFFERENCE;
        } else if (i == 1) {
            op = Path.Op.INTERSECT;
        } else if (i == 4) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = i == 2 ? Path.Op.UNION : Path.Op.XOR;
        }
        if (!(ztVar instanceof zt)) {
            s8f.i("Unable to obtain android.graphics.Path");
            return false;
        }
        Path path = ztVar.a;
        if (ztVar2 instanceof zt) {
            return this.a.op(path, ztVar2.a, op);
        }
        s8f.i("Unable to obtain android.graphics.Path");
        return false;
    }

    public final void j(float f, float f2, float f3, float f4) {
        this.a.quadTo(f, f2, f3, f4);
    }

    public final void k() {
        this.a.reset();
    }

    public final void l() {
        this.a.rewind();
    }

    public final void m(long j) {
        Matrix matrix = this.d;
        if (matrix == null) {
            this.d = new Matrix();
        } else {
            matrix.reset();
        }
        Matrix matrix2 = this.d;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)));
        Matrix matrix3 = this.d;
        matrix3.getClass();
        this.a.transform(matrix3);
    }
}
