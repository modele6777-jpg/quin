package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class eu0 implements ep4, zt0 {
    public float A;
    public BlurMaskFilter B;
    public du7 C;
    public final Path a = new Path();
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final du7 d = new du7(1, 0);
    public final du7 e;
    public final du7 f;
    public final du7 g;
    public final du7 h;
    public final RectF i;
    public final RectF j;
    public final RectF k;
    public final RectF l;
    public final RectF m;
    public final Matrix n;
    public final oi8 o;
    public final tu7 p;
    public final gg7 q;
    public final f82 r;
    public eu0 s;
    public eu0 t;
    public List u;
    public final ArrayList v;
    public final q2f w;
    public boolean x;
    public boolean y;
    public du7 z;

    public eu0(oi8 oi8Var, tu7 tu7Var) {
        boolean z = true;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.e = new du7(mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f = new du7(mode2);
        du7 du7Var = new du7(1, 0);
        this.g = du7Var;
        PorterDuff.Mode mode3 = PorterDuff.Mode.CLEAR;
        du7 du7Var2 = new du7();
        du7Var2.setXfermode(new PorterDuffXfermode(mode3));
        this.h = du7Var2;
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new RectF();
        this.m = new RectF();
        this.n = new Matrix();
        this.v = new ArrayList();
        this.x = true;
        this.A = 0.0f;
        this.o = oi8Var;
        this.p = tu7Var;
        List list = tu7Var.h;
        int i = 3;
        if (tu7Var.u == 3) {
            du7Var.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            du7Var.setXfermode(new PorterDuffXfermode(mode));
        }
        qx qxVar = tu7Var.i;
        qxVar.getClass();
        q2f q2fVar = new q2f(qxVar);
        this.w = q2fVar;
        q2fVar.b(this);
        if (list != null && !list.isEmpty()) {
            gg7 gg7Var = new gg7(list);
            this.q = gg7Var;
            Iterator it = ((ArrayList) gg7Var.b).iterator();
            while (it.hasNext()) {
                ((du0) it.next()).a(this);
            }
            for (du0 du0Var : (ArrayList) this.q.c) {
                d(du0Var);
                du0Var.a(this);
            }
        }
        tu7 tu7Var2 = this.p;
        if (tu7Var2.t.isEmpty()) {
            if (true != this.x) {
                this.x = true;
                this.o.invalidateSelf();
                return;
            }
            return;
        }
        f82 f82Var = new f82(tu7Var2.t, z ? 1 : 0);
        this.r = f82Var;
        f82Var.b = true;
        f82Var.a(new p2f(i, this));
        boolean z2 = ((Float) this.r.d()).floatValue() == 1.0f;
        if (z2 != this.x) {
            this.x = z2;
            this.o.invalidateSelf();
        }
        d(this.r);
    }

    @Override // defpackage.zt0
    public final void a() {
        this.o.invalidateSelf();
    }

    @Override // defpackage.ep4
    public void c(RectF rectF, Matrix matrix, boolean z) {
        this.i.set(0.0f, 0.0f, 0.0f, 0.0f);
        g();
        Matrix matrix2 = this.n;
        matrix2.set(matrix);
        if (z) {
            List list = this.u;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    matrix2.preConcat(((eu0) this.u.get(size)).w.d());
                }
            } else {
                eu0 eu0Var = this.t;
                if (eu0Var != null) {
                    matrix2.preConcat(eu0Var.w.d());
                }
            }
        }
        matrix2.preConcat(this.w.d());
    }

    public final void d(du0 du0Var) {
        if (du0Var == null) {
            return;
        }
        this.v.add(du0Var);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0216  */
    /* JADX WARN: Code duplicated, block: B:105:0x0221  */
    /* JADX WARN: Code duplicated, block: B:109:0x0233  */
    /* JADX WARN: Code duplicated, block: B:111:0x025a  */
    /* JADX WARN: Code duplicated, block: B:113:0x025f  */
    /* JADX WARN: Code duplicated, block: B:115:0x0262  */
    /* JADX WARN: Code duplicated, block: B:117:0x0265  */
    /* JADX WARN: Code duplicated, block: B:118:0x026c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0272  */
    /* JADX WARN: Code duplicated, block: B:121:0x0274  */
    /* JADX WARN: Code duplicated, block: B:124:0x027b  */
    /* JADX WARN: Code duplicated, block: B:128:0x028c A[LOOP:2: B:122:0x0275->B:128:0x028c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x0299  */
    /* JADX WARN: Code duplicated, block: B:132:0x029d  */
    /* JADX WARN: Code duplicated, block: B:134:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:135:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:137:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:138:0x030b  */
    /* JADX WARN: Code duplicated, block: B:140:0x030f  */
    /* JADX WARN: Code duplicated, block: B:141:0x033b  */
    /* JADX WARN: Code duplicated, block: B:142:0x034b  */
    /* JADX WARN: Code duplicated, block: B:144:0x0352  */
    /* JADX WARN: Code duplicated, block: B:145:0x037e  */
    /* JADX WARN: Code duplicated, block: B:150:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:160:0x03a4 A[EDGE_INSN: B:160:0x03a4->B:147:0x03a4 BREAK  A[LOOP:1: B:107:0x0225->B:146:0x039e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0286 A[EDGE_INSN: B:168:0x0286->B:126:0x0286 BREAK  A[LOOP:2: B:122:0x0275->B:128:0x028c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0112  */
    /* JADX WARN: Code duplicated, block: B:57:0x0116  */
    @Override // defpackage.ep4
    public final void f(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        gg7 gg7Var;
        Path path;
        float f;
        int i2;
        RectF rectF;
        du7 du7Var;
        float f2;
        int i3;
        Paint paint;
        int i4;
        List list;
        ArrayList arrayList;
        du0 du0Var;
        du0 du0Var2;
        boolean z;
        int iB;
        int i5;
        Paint paint2;
        Path path2;
        Path path3;
        int i6;
        Integer num;
        if (this.x) {
            tu7 tu7Var = this.p;
            boolean z2 = tu7Var.v;
            int i7 = tu7Var.y;
            if (z2) {
                return;
            }
            g();
            Matrix matrix2 = this.b;
            matrix2.reset();
            matrix2.set(matrix);
            for (int size = this.u.size() - 1; size >= 0; size--) {
                matrix2.preConcat(((eu0) this.u.get(size)).w.d());
            }
            q2f q2fVar = this.w;
            f82 f82Var = q2fVar.p;
            int iIntValue = (int) ((((i / 255.0f) * ((f82Var == null || (num = (Integer) f82Var.d()) == null) ? 100 : num.intValue())) / 100.0f) * 255.0f);
            if (this.s == null && !k() && i7 == 1) {
                matrix2.preConcat(q2fVar.d());
                i(canvas, matrix2, iIntValue, kq4Var);
                l();
                return;
            }
            RectF rectF2 = this.i;
            c(rectF2, matrix2, false);
            if (this.s != null && tu7Var.u != 3) {
                RectF rectF3 = this.l;
                rectF3.set(0.0f, 0.0f, 0.0f, 0.0f);
                this.s.c(rectF3, matrix, true);
                if (!rectF2.intersect(rectF3)) {
                    rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
            matrix2.preConcat(q2fVar.d());
            RectF rectF4 = this.k;
            rectF4.set(0.0f, 0.0f, 0.0f, 0.0f);
            boolean zK = k();
            gg7 gg7Var2 = this.q;
            Path path4 = this.a;
            if (zK) {
                int size2 = ((List) gg7Var2.d).size();
                int i8 = 0;
                while (true) {
                    if (i8 < size2) {
                        mm8 mm8Var = (mm8) ((List) gg7Var2.d).get(i8);
                        Path path5 = (Path) ((du0) ((ArrayList) gg7Var2.b).get(i8)).d();
                        if (path5 == null) {
                            i2 = size2;
                        } else {
                            path4.set(path5);
                            path4.transform(matrix2);
                            int iB2 = kv2.B(mm8Var.a);
                            i2 = size2;
                            if (iB2 != 0) {
                                if (iB2 != 1) {
                                    if (iB2 != 2) {
                                        if (iB2 == 3) {
                                        }
                                        rectF = this.m;
                                        path4.computeBounds(rectF, false);
                                        if (i8 == 0) {
                                            rectF4.set(rectF);
                                        } else {
                                            rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                                        }
                                        i8++;
                                        size2 = i2;
                                        gg7Var2 = gg7Var2;
                                        path4 = path4;
                                    }
                                }
                                gg7Var = gg7Var2;
                                path = path4;
                                f = 0.0f;
                            }
                            if (mm8Var.d) {
                                gg7Var = gg7Var2;
                                path = path4;
                                f = 0.0f;
                            }
                            rectF = this.m;
                            path4.computeBounds(rectF, false);
                            if (i8 == 0) {
                                rectF4.set(rectF);
                            } else {
                                rectF4.set(Math.min(rectF4.left, rectF.left), Math.min(rectF4.top, rectF.top), Math.max(rectF4.right, rectF.right), Math.max(rectF4.bottom, rectF.bottom));
                            }
                            i8++;
                            size2 = i2;
                            gg7Var2 = gg7Var2;
                            path4 = path4;
                        }
                        i8++;
                        size2 = i2;
                        gg7Var2 = gg7Var2;
                        path4 = path4;
                    } else {
                        gg7Var = gg7Var2;
                        path = path4;
                        if (rectF2.intersect(rectF4)) {
                            f = 0.0f;
                        } else {
                            f = 0.0f;
                            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
                        }
                    }
                }
            } else {
                gg7Var = gg7Var2;
                path = path4;
                f = 0.0f;
            }
            float width = canvas.getWidth();
            float height = canvas.getHeight();
            RectF rectF5 = this.j;
            rectF5.set(f, f, width, height);
            Matrix matrix3 = this.c;
            canvas.getMatrix(matrix3);
            if (!matrix3.isIdentity()) {
                matrix3.invert(matrix3);
                matrix3.mapRect(rectF5);
            }
            if (!rectF2.intersect(rectF5)) {
                rectF2.set(f, f, f, f);
            }
            if (rectF2.width() >= 1.0f && rectF2.height() >= 1.0f) {
                du7 du7Var2 = this.d;
                du7Var2.setAlpha(255);
                int iB3 = kv2.B(i7);
                if (iB3 == 1) {
                    f2 = 1.0f;
                    i3 = Build.VERSION.SDK_INT >= 29 ? 25 : 14;
                } else if (iB3 != 2) {
                    i3 = 16;
                    f2 = 1.0f;
                    if (iB3 != 3) {
                        if (iB3 == 4) {
                            i3 = 17;
                        } else if (iB3 != 5) {
                            i3 = iB3 != 16 ? 0 : 13;
                        } else {
                            i3 = 18;
                        }
                    }
                } else {
                    f2 = 1.0f;
                    i3 = 15;
                }
                eb3.T(i3, du7Var2);
                Matrix matrix4 = xqf.a;
                canvas.saveLayer(rectF2, du7Var2);
                if (i7 != 2) {
                    h(canvas);
                } else {
                    if (Build.VERSION.SDK_INT < 29) {
                        if (this.C == null) {
                            du7 du7Var3 = new du7();
                            this.C = du7Var3;
                            du7Var3.setColor(-1);
                        }
                        canvas.drawRect(rectF2.left - f2, rectF2.top - f2, rectF2.right + f2, rectF2.bottom + f2, this.C);
                    }
                    i(canvas, matrix2, iIntValue, kq4Var);
                    if (k()) {
                        paint = this.e;
                        canvas.saveLayer(rectF2, paint);
                        if (Build.VERSION.SDK_INT < 28) {
                            h(canvas);
                        }
                        i4 = 0;
                        while (true) {
                            list = (List) gg7Var.d;
                            arrayList = (ArrayList) gg7Var.b;
                            if (i4 < list.size()) {
                                break;
                            }
                            mm8 mm8Var2 = (mm8) list.get(i4);
                            du0Var = (du0) arrayList.get(i4);
                            du0Var2 = (du0) ((ArrayList) gg7Var.c).get(i4);
                            int i9 = mm8Var2.a;
                            z = mm8Var2.d;
                            iB = kv2.B(i9);
                            i5 = i4;
                            paint2 = this.f;
                            if (iB != 0) {
                                path2 = path;
                                if (z) {
                                    Matrix matrix5 = xqf.a;
                                    canvas.saveLayer(rectF2, du7Var2);
                                    canvas.drawRect(rectF2, du7Var2);
                                    path2.set((Path) du0Var.d());
                                    path2.transform(matrix2);
                                    du7Var2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) du0Var.d());
                                    path2.transform(matrix2);
                                    du7Var2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                    canvas.drawPath(path2, du7Var2);
                                }
                            } else if (iB != 1) {
                                path2 = path;
                                if (i5 == 0) {
                                    du7Var2.setColor(-16777216);
                                    du7Var2.setAlpha(255);
                                    canvas.drawRect(rectF2, du7Var2);
                                }
                                if (z) {
                                    Matrix matrix6 = xqf.a;
                                    canvas.saveLayer(rectF2, paint2);
                                    canvas.drawRect(rectF2, du7Var2);
                                    paint2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                    path2.set((Path) du0Var.d());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                    canvas.restore();
                                } else {
                                    path2.set((Path) du0Var.d());
                                    path2.transform(matrix2);
                                    canvas.drawPath(path2, paint2);
                                }
                            } else if (iB != 2) {
                                if (z) {
                                    Matrix matrix7 = xqf.a;
                                    canvas.saveLayer(rectF2, paint);
                                    canvas.drawRect(rectF2, du7Var2);
                                    paint2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                    path3 = path;
                                    path3.set((Path) du0Var.d());
                                    path3.transform(matrix2);
                                    canvas.drawPath(path3, paint2);
                                    canvas.restore();
                                } else {
                                    path3 = path;
                                    Matrix matrix8 = xqf.a;
                                    canvas.saveLayer(rectF2, paint);
                                    path3.set((Path) du0Var.d());
                                    path3.transform(matrix2);
                                    du7Var2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                    canvas.drawPath(path3, du7Var2);
                                    canvas.restore();
                                }
                                path2 = path3;
                            } else if (iB != 3) {
                                path2 = path;
                            } else {
                                if (arrayList.isEmpty()) {
                                    i6 = 0;
                                    while (true) {
                                        if (i6 < list.size()) {
                                            du7Var2.setAlpha(255);
                                            canvas.drawRect(rectF2, du7Var2);
                                            break;
                                        } else if (((mm8) list.get(i6)).a != 4) {
                                            break;
                                        } else {
                                            i6++;
                                        }
                                    }
                                }
                                path2 = path;
                            }
                            i4 = i5 + 1;
                            path = path2;
                        }
                        canvas.restore();
                    }
                    if (this.s != null) {
                        canvas.saveLayer(rectF2, this.g);
                        h(canvas);
                        this.s.f(canvas, matrix, i, null);
                        canvas.restore();
                    }
                    canvas.restore();
                }
                i(canvas, matrix2, iIntValue, kq4Var);
                if (k()) {
                    paint = this.e;
                    canvas.saveLayer(rectF2, paint);
                    if (Build.VERSION.SDK_INT < 28) {
                        h(canvas);
                    }
                    i4 = 0;
                    while (true) {
                        list = (List) gg7Var.d;
                        arrayList = (ArrayList) gg7Var.b;
                        if (i4 < list.size()) {
                            break;
                            break;
                        }
                        mm8 mm8Var3 = (mm8) list.get(i4);
                        du0Var = (du0) arrayList.get(i4);
                        du0Var2 = (du0) ((ArrayList) gg7Var.c).get(i4);
                        int i10 = mm8Var3.a;
                        z = mm8Var3.d;
                        iB = kv2.B(i10);
                        i5 = i4;
                        paint2 = this.f;
                        if (iB != 0) {
                            path2 = path;
                            if (z) {
                                Matrix matrix9 = xqf.a;
                                canvas.saveLayer(rectF2, du7Var2);
                                canvas.drawRect(rectF2, du7Var2);
                                path2.set((Path) du0Var.d());
                                path2.transform(matrix2);
                                du7Var2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) du0Var.d());
                                path2.transform(matrix2);
                                du7Var2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                canvas.drawPath(path2, du7Var2);
                            }
                        } else if (iB != 1) {
                            path2 = path;
                            if (i5 == 0) {
                                du7Var2.setColor(-16777216);
                                du7Var2.setAlpha(255);
                                canvas.drawRect(rectF2, du7Var2);
                            }
                            if (z) {
                                Matrix matrix10 = xqf.a;
                                canvas.saveLayer(rectF2, paint2);
                                canvas.drawRect(rectF2, du7Var2);
                                paint2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                path2.set((Path) du0Var.d());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                                canvas.restore();
                            } else {
                                path2.set((Path) du0Var.d());
                                path2.transform(matrix2);
                                canvas.drawPath(path2, paint2);
                            }
                        } else if (iB != 2) {
                            if (z) {
                                Matrix matrix11 = xqf.a;
                                canvas.saveLayer(rectF2, paint);
                                canvas.drawRect(rectF2, du7Var2);
                                paint2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                path3 = path;
                                path3.set((Path) du0Var.d());
                                path3.transform(matrix2);
                                canvas.drawPath(path3, paint2);
                                canvas.restore();
                            } else {
                                path3 = path;
                                Matrix matrix12 = xqf.a;
                                canvas.saveLayer(rectF2, paint);
                                path3.set((Path) du0Var.d());
                                path3.transform(matrix2);
                                du7Var2.setAlpha((int) (((Integer) du0Var2.d()).intValue() * 2.55f));
                                canvas.drawPath(path3, du7Var2);
                                canvas.restore();
                            }
                            path2 = path3;
                        } else if (iB != 3) {
                            path2 = path;
                        } else {
                            if (arrayList.isEmpty()) {
                                i6 = 0;
                                while (true) {
                                    if (i6 < list.size()) {
                                        du7Var2.setAlpha(255);
                                        canvas.drawRect(rectF2, du7Var2);
                                        break;
                                    } else {
                                        if (((mm8) list.get(i6)).a != 4) {
                                            break;
                                            break;
                                        }
                                        i6++;
                                    }
                                }
                            }
                            path2 = path;
                        }
                        i4 = i5 + 1;
                        path = path2;
                    }
                    canvas.restore();
                }
                if (this.s != null) {
                    canvas.saveLayer(rectF2, this.g);
                    h(canvas);
                    this.s.f(canvas, matrix, i, null);
                    canvas.restore();
                }
                canvas.restore();
            }
            if (this.y && (du7Var = this.z) != null) {
                du7Var.setStyle(Paint.Style.STROKE);
                this.z.setColor(-251901);
                this.z.setStrokeWidth(4.0f);
                canvas.drawRect(rectF2, this.z);
                this.z.setStyle(Paint.Style.FILL);
                this.z.setColor(1357638635);
                canvas.drawRect(rectF2, this.z);
            }
            l();
        }
    }

    public final void g() {
        if (this.u != null) {
            return;
        }
        if (this.t == null) {
            this.u = Collections.EMPTY_LIST;
            return;
        }
        this.u = new ArrayList();
        for (eu0 eu0Var = this.t; eu0Var != null; eu0Var = eu0Var.t) {
            this.u.add(eu0Var);
        }
    }

    public final void h(Canvas canvas) {
        RectF rectF = this.i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.h);
    }

    public abstract void i(Canvas canvas, Matrix matrix, int i, kq4 kq4Var);

    public vd9 j() {
        return this.p.w;
    }

    public final boolean k() {
        gg7 gg7Var = this.q;
        return (gg7Var == null || ((ArrayList) gg7Var.b).isEmpty()) ? false : true;
    }

    public final void l() {
        y25 y25Var = this.o.a.a;
        String str = this.p.c;
    }

    public void m(boolean z) {
        if (z && this.z == null) {
            this.z = new du7();
        }
        this.y = z;
    }

    public void n(float f) {
        q2f q2fVar = this.w;
        f82 f82Var = q2fVar.p;
        if (f82Var != null) {
            f82Var.g(f);
        }
        f82 f82Var2 = q2fVar.v;
        if (f82Var2 != null) {
            f82Var2.g(f);
        }
        f82 f82Var3 = q2fVar.w;
        if (f82Var3 != null) {
            f82Var3.g(f);
        }
        cp7 cp7Var = q2fVar.l;
        if (cp7Var != null) {
            cp7Var.g(f);
        }
        du0 du0Var = q2fVar.m;
        if (du0Var != null) {
            du0Var.g(f);
        }
        xc6 xc6Var = q2fVar.n;
        if (xc6Var != null) {
            xc6Var.g(f);
        }
        f82 f82Var4 = q2fVar.o;
        if (f82Var4 != null) {
            f82Var4.g(f);
        }
        f82 f82Var5 = q2fVar.q;
        if (f82Var5 != null) {
            f82Var5.g(f);
        }
        f82 f82Var6 = q2fVar.r;
        if (f82Var6 != null) {
            f82Var6.g(f);
        }
        f82 f82Var7 = q2fVar.s;
        if (f82Var7 != null) {
            f82Var7.g(f);
        }
        f82 f82Var8 = q2fVar.t;
        if (f82Var8 != null) {
            f82Var8.g(f);
        }
        f82 f82Var9 = q2fVar.u;
        if (f82Var9 != null) {
            f82Var9.g(f);
        }
        int i = 0;
        gg7 gg7Var = this.q;
        if (gg7Var != null) {
            ArrayList arrayList = (ArrayList) gg7Var.b;
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                ((du0) arrayList.get(i2)).g(f);
            }
        }
        f82 f82Var10 = this.r;
        if (f82Var10 != null) {
            f82Var10.g(f);
        }
        eu0 eu0Var = this.s;
        if (eu0Var != null) {
            eu0Var.n(f);
        }
        while (true) {
            ArrayList arrayList2 = this.v;
            if (i >= arrayList2.size()) {
                return;
            }
            ((du0) arrayList2.get(i)).g(f);
            i++;
        }
    }

    @Override // defpackage.zl2
    public final void b(List list, List list2) {
    }
}
