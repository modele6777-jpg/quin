package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dd6 extends ku0 {
    public final boolean p;
    public final gg8 q;
    public final gg8 r;
    public final RectF s;
    public final int t;
    public final int u;
    public final xc6 v;
    public final xc6 w;
    public final xc6 x;

    /* JADX WARN: Illegal instructions before constructor call */
    public dd6(oi8 oi8Var, eu0 eu0Var, cd6 cd6Var) {
        Paint.Join join;
        Paint.Join join2;
        int iB = kv2.B(cd6Var.g);
        Paint.Cap cap = iB != 0 ? iB != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iB2 = kv2.B(cd6Var.h);
        Object obj = null;
        if (iB2 == 0) {
            join = Paint.Join.MITER;
        } else {
            if (iB2 != 1) {
                if (iB2 != 2) {
                    join2 = null;
                } else {
                    join = Paint.Join.BEVEL;
                }
                super(oi8Var, eu0Var, cap, join2, cd6Var.i, cd6Var.c, cd6Var.f, cd6Var.j, cd6Var.k);
                this.q = new gg8(obj);
                this.r = new gg8(obj);
                this.s = new RectF();
                this.t = cd6Var.a;
                this.p = cd6Var.l;
                this.u = (int) (oi8Var.a.b() / 32.0f);
                du0 du0VarC0 = cd6Var.b.c0();
                this.v = (xc6) du0VarC0;
                du0VarC0.a(this);
                eu0Var.d(du0VarC0);
                du0 du0VarC1 = cd6Var.d.c0();
                this.w = (xc6) du0VarC1;
                du0VarC1.a(this);
                eu0Var.d(du0VarC1);
                du0 du0VarC2 = cd6Var.e.c0();
                this.x = (xc6) du0VarC2;
                du0VarC2.a(this);
                eu0Var.d(du0VarC2);
            }
            join = Paint.Join.ROUND;
        }
        join2 = join;
        super(oi8Var, eu0Var, cap, join2, cd6Var.i, cd6Var.c, cd6Var.f, cd6Var.j, cd6Var.k);
        this.q = new gg8(obj);
        this.r = new gg8(obj);
        this.s = new RectF();
        this.t = cd6Var.a;
        this.p = cd6Var.l;
        this.u = (int) (oi8Var.a.b() / 32.0f);
        du0 du0VarC3 = cd6Var.b.c0();
        this.v = (xc6) du0VarC3;
        du0VarC3.a(this);
        eu0Var.d(du0VarC3);
        du0 du0VarC4 = cd6Var.d.c0();
        this.w = (xc6) du0VarC4;
        du0VarC4.a(this);
        eu0Var.d(du0VarC4);
        du0 du0VarC5 = cd6Var.e.c0();
        this.x = (xc6) du0VarC5;
        du0VarC5.a(this);
        eu0Var.d(du0VarC5);
    }

    public final int d() {
        float f = this.w.d;
        float f2 = this.u;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.x.d * f2);
        int iRound3 = Math.round(this.v.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
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
    @Override // defpackage.ku0, defpackage.ep4
    public final void f(Canvas canvas, Matrix matrix, int i, kq4 kq4Var) {
        Shader radialGradient;
        if (this.p) {
            return;
        }
        c(this.s, matrix, false);
        int i2 = this.t;
        xc6 xc6Var = this.v;
        xc6 xc6Var2 = this.x;
        xc6 xc6Var3 = this.w;
        if (i2 == 1) {
            long jD = d();
            gg8 gg8Var = this.q;
            radialGradient = (LinearGradient) gg8Var.c(jD);
            if (radialGradient == null) {
                PointF pointF = (PointF) xc6Var3.d();
                PointF pointF2 = (PointF) xc6Var2.d();
                wc6 wc6Var = (wc6) xc6Var.d();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, wc6Var.b, wc6Var.a, Shader.TileMode.CLAMP);
                gg8Var.e(jD, radialGradient);
            }
        } else {
            long jD2 = d();
            gg8 gg8Var2 = this.r;
            radialGradient = (RadialGradient) gg8Var2.c(jD2);
            if (radialGradient == null) {
                PointF pointF3 = (PointF) xc6Var3.d();
                PointF pointF4 = (PointF) xc6Var2.d();
                wc6 wc6Var2 = (wc6) xc6Var.d();
                int[] iArr = wc6Var2.b;
                float[] fArr = wc6Var2.a;
                float f = pointF3.x;
                float f2 = pointF3.y;
                radialGradient = new RadialGradient(f, f2, (float) Math.hypot(pointF4.x - f, pointF4.y - f2), iArr, fArr, Shader.TileMode.CLAMP);
                gg8Var2.e(jD2, radialGradient);
            }
        }
        this.i.setShader(radialGradient);
        super.f(canvas, matrix, i, kq4Var);
    }
}
