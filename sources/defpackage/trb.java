package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class trb implements ep4, h1a, te6, zt0, zl2 {
    public final Matrix a = new Matrix();
    public final Path b = new Path();
    public final oi8 c;
    public final eu0 d;
    public final boolean e;
    public final f82 f;
    public final f82 g;
    public final q2f h;
    public km2 i;

    public trb(oi8 oi8Var, eu0 eu0Var, lkb lkbVar) {
        this.c = oi8Var;
        this.d = eu0Var;
        this.e = lkbVar.c;
        f82 f82VarC0 = lkbVar.b.c0();
        this.f = f82VarC0;
        eu0Var.d(f82VarC0);
        f82VarC0.a(this);
        f82 f82VarC1 = ((lx) lkbVar.d).c0();
        this.g = f82VarC1;
        eu0Var.d(f82VarC1);
        f82VarC1.a(this);
        qx qxVar = (qx) lkbVar.e;
        qxVar.getClass();
        q2f q2fVar = new q2f(qxVar);
        this.h = q2fVar;
        q2fVar.a(eu0Var);
        q2fVar.b(this);
    }

    @Override // defpackage.zt0
    public final void a() {
        this.c.invalidateSelf();
    }

    @Override // defpackage.zl2
    public final void b(List list, List list2) {
        this.i.b(list, list2);
    }

    @Override // defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        this.i.c(rectF, matrix, z);
    }

    @Override // defpackage.te6
    public final void d(ListIterator listIterator) {
        if (this.i != null) {
            return;
        }
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        ArrayList arrayList = new ArrayList();
        while (listIterator.hasPrevious()) {
            arrayList.add((zl2) listIterator.previous());
            listIterator.remove();
        }
        Collections.reverse(arrayList);
        this.i = new km2(this.c, this.d, this.e, arrayList, null);
    }

    @Override // defpackage.h1a
    public final Path e() {
        Path pathE = this.i.e();
        Path path = this.b;
        path.reset();
        float fFloatValue = ((Float) this.f.d()).floatValue();
        float fFloatValue2 = ((Float) this.g.d()).floatValue();
        for (int i = ((int) fFloatValue) - 1; i >= 0; i--) {
            Matrix matrixE = this.h.e(i + fFloatValue2);
            Matrix matrix = this.a;
            matrix.set(matrixE);
            path.addPath(pathE, matrix);
        }
        return path;
    }

    @Override // defpackage.ep4
    public final void f(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        float fFloatValue = ((Float) this.f.d()).floatValue();
        float fFloatValue2 = ((Float) this.g.d()).floatValue();
        q2f q2fVar = this.h;
        float fFloatValue3 = ((Float) q2fVar.v.d()).floatValue() / 100.0f;
        float fFloatValue4 = ((Float) q2fVar.w.d()).floatValue() / 100.0f;
        for (int i2 = ((int) fFloatValue) - 1; i2 >= 0; i2--) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f = i2;
            matrix2.preConcat(q2fVar.e(f + fFloatValue2));
            this.i.f(canvas, matrix2, (int) (aw8.e(fFloatValue3, fFloatValue4, f / fFloatValue) * i), kq4Var);
        }
    }
}
