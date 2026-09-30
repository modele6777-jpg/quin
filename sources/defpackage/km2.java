package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class km2 implements ep4, h1a, zt0 {
    public final sug a;
    public final RectF b;
    public final gl9 c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final boolean g;
    public final ArrayList h;
    public final oi8 i;
    public ArrayList j;
    public final q2f k;

    public km2(oi8 oi8Var, eu0 eu0Var, boolean z, ArrayList arrayList, qx qxVar) {
        this.a = new sug(11, (byte) 0);
        this.b = new RectF();
        this.c = new gl9();
        this.d = new Matrix();
        this.e = new Path();
        this.f = new RectF();
        this.i = oi8Var;
        this.g = z;
        this.h = arrayList;
        if (qxVar != null) {
            q2f q2fVar = new q2f(qxVar);
            this.k = q2fVar;
            q2fVar.a(eu0Var);
            q2fVar.b(this);
        }
        ArrayList arrayList2 = new ArrayList();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zl2 zl2Var = (zl2) arrayList.get(size);
            if (zl2Var instanceof te6) {
                arrayList2.add((te6) zl2Var);
            }
        }
        for (int size2 = arrayList2.size() - 1; size2 >= 0; size2--) {
            ((te6) arrayList2.get(size2)).d(arrayList.listIterator(arrayList.size()));
        }
    }

    @Override // defpackage.zt0
    public final void a() {
        this.i.invalidateSelf();
    }

    @Override // defpackage.zl2
    public final void b(List list, List list2) {
        int size = list.size();
        ArrayList arrayList = this.h;
        ArrayList arrayList2 = new ArrayList(arrayList.size() + size);
        arrayList2.addAll(list);
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            zl2 zl2Var = (zl2) arrayList.get(size2);
            zl2Var.b(arrayList2, arrayList.subList(0, size2));
            arrayList2.add(zl2Var);
        }
    }

    @Override // defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        q2f q2fVar = this.k;
        if (q2fVar != null) {
            matrix2.preConcat(q2fVar.d());
        }
        RectF rectF2 = this.f;
        rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            zl2 zl2Var = (zl2) arrayList.get(size);
            if (zl2Var instanceof ep4) {
                ((ep4) zl2Var).c(rectF2, matrix2, z);
                rectF.union(rectF2);
            }
        }
    }

    public final List d() {
        if (this.j == null) {
            this.j = new ArrayList();
            int i = 0;
            while (true) {
                ArrayList arrayList = this.h;
                if (i >= arrayList.size()) {
                    break;
                }
                zl2 zl2Var = (zl2) arrayList.get(i);
                if (zl2Var instanceof h1a) {
                    this.j.add((h1a) zl2Var);
                }
                i++;
            }
        }
        return this.j;
    }

    @Override // defpackage.h1a
    public final Path e() {
        Matrix matrix = this.d;
        matrix.reset();
        q2f q2fVar = this.k;
        if (q2fVar != null) {
            matrix.set(q2fVar.d());
        }
        Path path = this.e;
        path.reset();
        if (!this.g) {
            ArrayList arrayList = this.h;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                zl2 zl2Var = (zl2) arrayList.get(size);
                if (zl2Var instanceof h1a) {
                    path.addPath(((h1a) zl2Var).e(), matrix);
                }
            }
        }
        return path;
    }

    @Override // defpackage.ep4
    public final void f(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        if (this.g) {
            return;
        }
        Matrix matrix2 = this.d;
        matrix2.set(matrix);
        q2f q2fVar = this.k;
        if (q2fVar != null) {
            matrix2.preConcat(q2fVar.d());
            f82 f82Var = q2fVar.p;
            i = (int) (((((f82Var == null ? 100 : ((Integer) f82Var.d()).intValue()) / 100.0f) * i) / 255.0f) * 255.0f);
        }
        oi8 oi8Var = this.i;
        boolean z = (oi8Var.Z && g() && i != 255) || (kq4Var != null && oi8Var.E0 && g());
        int i2 = z ? 255 : i;
        gl9 gl9Var = this.c;
        if (z) {
            RectF rectF = this.b;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            c(rectF, matrix, true);
            sug sugVar = this.a;
            sugVar.b = i;
            if (kq4Var != null) {
                if (Color.alpha(kq4Var.d) > 0) {
                    sugVar.c = kq4Var;
                } else {
                    sugVar.c = null;
                }
                kq4Var = null;
            } else {
                sugVar.c = null;
            }
            canvas = gl9Var.e(canvas, rectF, sugVar);
        } else if (kq4Var != null) {
            kq4 kq4Var2 = new kq4(kq4Var);
            kq4Var2.b(i2);
            kq4Var = kq4Var2;
        }
        ArrayList arrayList = this.h;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            Object obj = arrayList.get(size);
            if (obj instanceof ep4) {
                ((ep4) obj).f(canvas, matrix2, i2, kq4Var);
            }
        }
        if (z) {
            gl9Var.c();
        }
    }

    public final boolean g() {
        int i = 0;
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.h;
            if (i >= arrayList.size()) {
                return false;
            }
            if ((arrayList.get(i) instanceof ep4) && (i2 = i2 + 1) >= 2) {
                return true;
            }
            i++;
        }
    }

    public km2(oi8 oi8Var, eu0 eu0Var, e5d e5dVar, uh8 uh8Var) {
        qx qxVar;
        String str = e5dVar.a;
        boolean z = e5dVar.c;
        List list = e5dVar.b;
        ArrayList arrayList = new ArrayList(list.size());
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            zl2 zl2VarA = ((wm2) list.get(i2)).a(oi8Var, uh8Var, eu0Var);
            if (zl2VarA != null) {
                arrayList.add(zl2VarA);
            }
        }
        while (true) {
            if (i >= list.size()) {
                qxVar = null;
                break;
            }
            wm2 wm2Var = (wm2) list.get(i);
            if (wm2Var instanceof qx) {
                qxVar = (qx) wm2Var;
                break;
            }
            i++;
        }
        this(oi8Var, eu0Var, z, arrayList, qxVar);
    }
}
