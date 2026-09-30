package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ku0 implements zt0, zl2, ep4 {
    public final oi8 e;
    public final eu0 f;
    public final float[] h;
    public final du7 i;
    public final f82 j;
    public final f82 k;
    public final ArrayList l;
    public final f82 m;
    public final f82 n;
    public float o;
    public final PathMeasure a = new PathMeasure();
    public final Path b = new Path();
    public final Path c = new Path();
    public final RectF d = new RectF();
    public final ArrayList g = new ArrayList();

    public ku0(oi8 oi8Var, eu0 eu0Var, Paint.Cap cap, Paint.Join join, float f, kx kxVar, lx lxVar, ArrayList arrayList, lx lxVar2) {
        du7 du7Var = new du7(1, 0);
        this.i = du7Var;
        this.o = 0.0f;
        this.e = oi8Var;
        this.f = eu0Var;
        du7Var.setStyle(Paint.Style.STROKE);
        du7Var.setStrokeCap(cap);
        du7Var.setStrokeJoin(join);
        du7Var.setStrokeMiter(f);
        this.k = (f82) kxVar.c0();
        this.j = lxVar.c0();
        if (lxVar2 == null) {
            this.m = null;
        } else {
            this.m = lxVar2.c0();
        }
        this.l = new ArrayList(arrayList.size());
        this.h = new float[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            this.l.add(((lx) arrayList.get(i)).c0());
        }
        eu0Var.d(this.k);
        eu0Var.d(this.j);
        for (int i2 = 0; i2 < this.l.size(); i2++) {
            eu0Var.d((du0) this.l.get(i2));
        }
        du0 du0Var = this.m;
        if (du0Var != null) {
            eu0Var.d(du0Var);
        }
        this.k.a(this);
        this.j.a(this);
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            ((du0) this.l.get(i3)).a(this);
        }
        f82 f82Var = this.m;
        if (f82Var != null) {
            f82Var.a(this);
        }
        if (eu0Var.j() != null) {
            f82 f82VarC0 = ((lx) eu0Var.j().b).c0();
            this.n = f82VarC0;
            f82VarC0.a(this);
            eu0Var.d(f82VarC0);
        }
    }

    @Override // defpackage.zt0
    public final void a() {
        this.e.invalidateSelf();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0050  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:39:0x0062 A[SYNTHETIC] */
    @Override // defpackage.zl2
    public final void b(List list, List list2) {
        ArrayList arrayList;
        ArrayList arrayList2 = (ArrayList) list;
        ju0 ju0Var = null;
        k5f k5fVar = null;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            zl2 zl2Var = (zl2) arrayList2.get(size);
            if (zl2Var instanceof k5f) {
                k5f k5fVar2 = (k5f) zl2Var;
                if (k5fVar2.c == 2) {
                    k5fVar = k5fVar2;
                }
            }
        }
        if (k5fVar != null) {
            k5fVar.d(this);
        }
        int size2 = list2.size();
        while (true) {
            size2--;
            arrayList = this.g;
            if (size2 < 0) {
                break;
            }
            zl2 zl2Var2 = (zl2) list2.get(size2);
            if (zl2Var2 instanceof k5f) {
                k5f k5fVar3 = (k5f) zl2Var2;
                if (k5fVar3.c == 2) {
                    if (ju0Var != null) {
                        arrayList.add(ju0Var);
                    }
                    ju0 ju0Var2 = new ju0(k5fVar3);
                    k5fVar3.d(this);
                    ju0Var = ju0Var2;
                } else if (!(zl2Var2 instanceof h1a)) {
                    if (ju0Var == null) {
                        ju0Var = new ju0(k5fVar);
                    }
                    ju0Var.a.add((h1a) zl2Var2);
                }
            } else if (!(zl2Var2 instanceof h1a)) {
                if (ju0Var == null) {
                    ju0Var = new ju0(k5fVar);
                }
                ju0Var.a.add((h1a) zl2Var2);
            }
        }
        if (ju0Var != null) {
            arrayList.add(ju0Var);
        }
    }

    @Override // defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.b;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.g;
            if (i >= arrayList.size()) {
                RectF rectF2 = this.d;
                path.computeBounds(rectF2, false);
                float fI = this.j.i() / 2.0f;
                rectF2.set(rectF2.left - fI, rectF2.top - fI, rectF2.right + fI, rectF2.bottom + fI);
                rectF.set(rectF2);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            }
            ju0 ju0Var = (ju0) arrayList.get(i);
            for (int i2 = 0; i2 < ju0Var.a.size(); i2++) {
                path.addPath(((h1a) ju0Var.a.get(i2)).e(), matrix);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:76:0x01e3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void f(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        int i2;
        float f;
        MaskFilter maskFilter;
        float[] fArr;
        ku0 ku0Var = this;
        float[] fArr2 = (float[]) xqf.e.get();
        boolean z = false;
        fArr2[0] = 0.0f;
        int i3 = 1;
        fArr2[1] = 0.0f;
        fArr2[2] = 37394.73f;
        fArr2[3] = 39575.234f;
        matrix.mapPoints(fArr2);
        if (fArr2[0] == fArr2[2] || fArr2[1] == fArr2[3]) {
            return;
        }
        float f2 = 100.0f;
        float fIntValue = ((Integer) ku0Var.k.d()).intValue() / 100.0f;
        int iC = aw8.c((int) (i * fIntValue));
        du7 du7Var = ku0Var.i;
        du7Var.setAlpha(iC);
        du7Var.setStrokeWidth(ku0Var.j.i());
        if (du7Var.getStrokeWidth() <= 0.0f) {
            return;
        }
        ArrayList arrayList = ku0Var.l;
        if (!arrayList.isEmpty()) {
            int i4 = 0;
            while (true) {
                int size = arrayList.size();
                fArr = ku0Var.h;
                if (i4 >= size) {
                    break;
                }
                float fFloatValue = ((Float) ((du0) arrayList.get(i4)).d()).floatValue();
                fArr[i4] = fFloatValue;
                if (i4 % 2 == 0) {
                    if (fFloatValue < 1.0f) {
                        fArr[i4] = 1.0f;
                    }
                } else if (fFloatValue < 0.1f) {
                    fArr[i4] = 0.1f;
                }
                i4++;
            }
            f82 f82Var = ku0Var.m;
            du7Var.setPathEffect(new DashPathEffect(fArr, f82Var == null ? 0.0f : ((Float) f82Var.d()).floatValue()));
        }
        f82 f82Var2 = ku0Var.n;
        if (f82Var2 != null) {
            float fFloatValue2 = ((Float) f82Var2.d()).floatValue();
            if (fFloatValue2 == 0.0f) {
                du7Var.setMaskFilter(null);
            } else if (fFloatValue2 != ku0Var.o) {
                eu0 eu0Var = ku0Var.f;
                if (eu0Var.A == fFloatValue2) {
                    maskFilter = eu0Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue2 / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    eu0Var.B = blurMaskFilter;
                    eu0Var.A = fFloatValue2;
                    maskFilter = blurMaskFilter;
                }
                du7Var.setMaskFilter(maskFilter);
            }
            ku0Var.o = fFloatValue2;
        }
        if (kq4Var != null) {
            kq4Var.a((int) (fIntValue * 255.0f), du7Var);
        }
        canvas.save();
        canvas.concat(matrix);
        int i5 = 0;
        while (true) {
            ArrayList arrayList2 = ku0Var.g;
            if (i5 >= arrayList2.size()) {
                canvas.restore();
                return;
            }
            ju0 ju0Var = (ju0) arrayList2.get(i5);
            k5f k5fVar = ju0Var.b;
            ArrayList arrayList3 = ju0Var.a;
            Path path = ku0Var.b;
            if (k5fVar != null) {
                path.reset();
                for (int size2 = arrayList3.size() - i3; size2 >= 0; size2--) {
                    path.addPath(((h1a) arrayList3.get(size2)).e());
                }
                float fFloatValue3 = ((Float) k5fVar.d.d()).floatValue() / f2;
                float fFloatValue4 = ((Float) k5fVar.e.d()).floatValue() / f2;
                float fFloatValue5 = ((Float) k5fVar.f.d()).floatValue() / 360.0f;
                if (fFloatValue3 >= 0.01f || fFloatValue4 <= 0.99f) {
                    PathMeasure pathMeasure = ku0Var.a;
                    pathMeasure.setPath(path, z);
                    float length = pathMeasure.getLength();
                    while (pathMeasure.nextContour()) {
                        length += pathMeasure.getLength();
                    }
                    float f3 = fFloatValue5 * length;
                    float f4 = (fFloatValue3 * length) + f3;
                    float fMin = Math.min((fFloatValue4 * length) + f3, (f4 + length) - 1.0f);
                    int size3 = arrayList3.size() - i3;
                    float f5 = 0.0f;
                    while (size3 >= 0) {
                        int i6 = i3;
                        Path pathE = ((h1a) arrayList3.get(size3)).e();
                        Path path2 = ku0Var.c;
                        path2.set(pathE);
                        pathMeasure.setPath(path2, z);
                        float length2 = pathMeasure.getLength();
                        if (fMin > length) {
                            float f6 = fMin - length;
                            if (f6 >= f5 + length2 || f5 >= f6) {
                                f = f5 + length2;
                                if (f < f4 && f5 <= fMin) {
                                    if (f > fMin || f4 >= f5) {
                                        xqf.a(path2, f4 < f5 ? 0.0f : (f4 - f5) / length2, fMin > f ? 1.0f : (fMin - f5) / length2, 0.0f);
                                        canvas.drawPath(path2, du7Var);
                                    } else {
                                        canvas.drawPath(path2, du7Var);
                                    }
                                }
                            } else {
                                xqf.a(path2, f4 > length ? (f4 - length) / length2 : 0.0f, Math.min(f6 / length2, 1.0f), 0.0f);
                                canvas.drawPath(path2, du7Var);
                            }
                        } else {
                            f = f5 + length2;
                            if (f < f4) {
                            }
                        }
                        f5 += length2;
                        size3--;
                        ku0Var = this;
                        i3 = i6;
                        z = false;
                    }
                } else {
                    canvas.drawPath(path, du7Var);
                }
                i2 = i3;
            } else {
                i2 = i3;
                path.reset();
                for (int size4 = arrayList3.size() - 1; size4 >= 0; size4--) {
                    path.addPath(((h1a) arrayList3.get(size4)).e());
                }
                canvas.drawPath(path, du7Var);
            }
            i5++;
            ku0Var = this;
            i3 = i2;
            z = false;
            f2 = 100.0f;
        }
    }
}
