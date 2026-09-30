package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pe5 implements ep4, zt0, zl2 {
    public final Path a;
    public final du7 b;
    public final eu0 c;
    public final boolean d;
    public final ArrayList e;
    public final f82 f;
    public final f82 g;
    public final oi8 h;
    public final f82 i;
    public float j;

    public pe5(oi8 oi8Var, eu0 eu0Var, c5d c5dVar) {
        Path path = new Path();
        this.a = path;
        this.b = new du7(1, 0);
        this.e = new ArrayList();
        this.c = eu0Var;
        kx kxVar = c5dVar.d;
        kx kxVar2 = c5dVar.c;
        this.d = c5dVar.e;
        this.h = oi8Var;
        if (eu0Var.j() != null) {
            f82 f82VarC0 = ((lx) eu0Var.j().b).c0();
            this.i = f82VarC0;
            f82VarC0.a(this);
            eu0Var.d(f82VarC0);
        }
        if (kxVar2 == null) {
            this.f = null;
            this.g = null;
            return;
        }
        path.setFillType(c5dVar.b);
        du0 du0VarC0 = kxVar2.c0();
        this.f = (f82) du0VarC0;
        du0VarC0.a(this);
        eu0Var.d(du0VarC0);
        du0 du0VarC1 = kxVar.c0();
        this.g = (f82) du0VarC1;
        du0VarC1.a(this);
        eu0Var.d(du0VarC1);
    }

    @Override // defpackage.zt0
    public final void a() {
        this.h.invalidateSelf();
    }

    @Override // defpackage.zl2
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            zl2 zl2Var = (zl2) list2.get(i);
            if (zl2Var instanceof h1a) {
                this.e.add((h1a) zl2Var);
            }
        }
    }

    @Override // defpackage.ep4
    public final void c(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.a;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((h1a) arrayList.get(i)).e(), matrix);
                i++;
            }
        }
    }

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
    @Override // defpackage.ep4
    public final void f(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        MaskFilter maskFilter;
        if (this.d) {
            return;
        }
        f82 f82Var = this.f;
        int iK = f82Var.k(f82Var.c.p(), f82Var.b());
        float fIntValue = ((Integer) this.g.d()).intValue() / 100.0f;
        int iC = (aw8.c((int) (i * fIntValue)) << 24) | (iK & 16777215);
        du7 du7Var = this.b;
        du7Var.setColor(iC);
        f82 f82Var2 = this.i;
        if (f82Var2 != null) {
            float fFloatValue = ((Float) f82Var2.d()).floatValue();
            if (fFloatValue == 0.0f) {
                du7Var.setMaskFilter(null);
            } else if (fFloatValue != this.j) {
                eu0 eu0Var = this.c;
                if (eu0Var.A == fFloatValue) {
                    maskFilter = eu0Var.B;
                } else {
                    BlurMaskFilter blurMaskFilter = new BlurMaskFilter(fFloatValue / 2.0f, BlurMaskFilter.Blur.NORMAL);
                    eu0Var.B = blurMaskFilter;
                    eu0Var.A = fFloatValue;
                    maskFilter = blurMaskFilter;
                }
                du7Var.setMaskFilter(maskFilter);
            }
            this.j = fFloatValue;
        }
        if (kq4Var != null) {
            kq4Var.a((int) (fIntValue * 255.0f), du7Var);
        } else {
            du7Var.clearShadowLayer();
        }
        Path path = this.a;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.e;
            if (i2 >= arrayList.size()) {
                canvas.drawPath(path, du7Var);
                return;
            } else {
                path.addPath(((h1a) arrayList.get(i2)).e(), matrix);
                i2++;
            }
        }
    }
}
