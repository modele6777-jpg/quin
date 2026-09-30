package defpackage;

import android.content.res.Resources;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l88 implements View.OnTouchListener {
    public static final int F0 = ViewConfiguration.getTapTimeout();
    public final hq4 E0;
    public boolean X;
    public boolean Y;
    public boolean Z;
    public final vn0 a;
    public final AccelerateInterpolator b;
    public final hq4 c;
    public wwg d;
    public final float[] e;
    public final float[] f;
    public final int g;
    public final float[] v;
    public final float[] w;
    public final float[] x;
    public boolean y;
    public boolean z;

    public l88(hq4 hq4Var) {
        vn0 vn0Var = new vn0();
        vn0Var.e = Long.MIN_VALUE;
        vn0Var.g = -1L;
        vn0Var.f = 0L;
        this.a = vn0Var;
        this.b = new AccelerateInterpolator();
        float[] fArr = {0.0f, 0.0f};
        this.e = fArr;
        float[] fArr2 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.f = fArr2;
        float[] fArr3 = {0.0f, 0.0f};
        this.v = fArr3;
        float[] fArr4 = {0.0f, 0.0f};
        this.w = fArr4;
        float[] fArr5 = {Float.MAX_VALUE, Float.MAX_VALUE};
        this.x = fArr5;
        this.c = hq4Var;
        float f = Resources.getSystem().getDisplayMetrics().density;
        float f2 = ((int) ((1575.0f * f) + 0.5f)) / 1000.0f;
        fArr5[0] = f2;
        fArr5[1] = f2;
        float f3 = ((int) ((f * 315.0f) + 0.5f)) / 1000.0f;
        fArr4[0] = f3;
        fArr4[1] = f3;
        fArr2[0] = Float.MAX_VALUE;
        fArr2[1] = Float.MAX_VALUE;
        fArr[0] = 0.2f;
        fArr[1] = 0.2f;
        fArr3[0] = 0.001f;
        fArr3[1] = 0.001f;
        this.g = F0;
        vn0Var.a = 500;
        vn0Var.b = 500;
        this.E0 = hq4Var;
    }

    public static float b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        return f < f2 ? f2 : f;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:13:0x003c  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b  */
    /* JADX WARN: Code duplicated, block: B:17:0x0051  */
    public final float a(float f, float f2, float f3, int i) {
        float fB;
        float interpolation;
        float fB2 = b(this.e[i] * f2, 0.0f, this.f[i]);
        float fC = c(f2 - f, fB2) - c(f, fB2);
        AccelerateInterpolator accelerateInterpolator = this.b;
        if (fC >= 0.0f) {
            if (fC > 0.0f) {
                interpolation = accelerateInterpolator.getInterpolation(fC);
            } else {
                fB = 0.0f;
            }
            if (fB == 0.0f) {
                return 0.0f;
            }
            float f4 = this.v[i];
            float f5 = this.w[i];
            float f6 = this.x[i];
            float f7 = f4 * f3;
            return fB > 0.0f ? b(fB * f7, f5, f6) : -b((-fB) * f7, f5, f6);
        }
        interpolation = -accelerateInterpolator.getInterpolation(-fC);
        fB = b(interpolation, -1.0f, 1.0f);
        if (fB == 0.0f) {
            return 0.0f;
        }
        float f8 = this.v[i];
        float f9 = this.w[i];
        float f10 = this.x[i];
        float f11 = f8 * f3;
        if (fB > 0.0f) {
        }
    }

    public final float c(float f, float f2) {
        if (f2 != 0.0f && f < f2) {
            if (f >= 0.0f) {
                return 1.0f - (f / f2);
            }
            if (this.Y) {
                return 1.0f;
            }
        }
        return 0.0f;
    }

    public final void d() {
        int i = 0;
        if (this.z) {
            this.Y = false;
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        vn0 vn0Var = this.a;
        int i2 = (int) (jCurrentAnimationTimeMillis - vn0Var.e);
        int i3 = vn0Var.b;
        if (i2 > i3) {
            i = i3;
        } else if (i2 >= 0) {
            i = i2;
        }
        vn0Var.i = i;
        vn0Var.h = vn0Var.a(jCurrentAnimationTimeMillis);
        vn0Var.g = jCurrentAnimationTimeMillis;
    }

    public final boolean e() {
        hq4 hq4Var;
        int count;
        vn0 vn0Var = this.a;
        float f = vn0Var.d;
        int iAbs = (int) (f / Math.abs(f));
        Math.abs(vn0Var.c);
        if (iAbs != 0 && (count = (hq4Var = this.E0).getCount()) != 0) {
            int childCount = hq4Var.getChildCount();
            int firstVisiblePosition = hq4Var.getFirstVisiblePosition();
            int i = firstVisiblePosition + childCount;
            if (iAbs <= 0 ? !(iAbs >= 0 || (firstVisiblePosition <= 0 && hq4Var.getChildAt(0).getTop() >= 0)) : !(i >= count && hq4Var.getChildAt(childCount - 1).getBottom() <= hq4Var.getHeight())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0014, code lost:
    
        if (r0 != 3) goto L30;
     */
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
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouch(android.view.View r8, android.view.MotionEvent r9) {
        /*
            r7 = this;
            boolean r0 = r7.Z
            r1 = 0
            if (r0 != 0) goto L7
            goto L79
        L7:
            int r0 = r9.getActionMasked()
            r2 = 1
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            r3 = 2
            if (r0 == r3) goto L1f
            r8 = 3
            if (r0 == r8) goto L17
            goto L79
        L17:
            r7.d()
            return r1
        L1b:
            r7.X = r2
            r7.y = r1
        L1f:
            float r0 = r9.getX()
            int r3 = r8.getWidth()
            float r3 = (float) r3
            hq4 r4 = r7.c
            int r5 = r4.getWidth()
            float r5 = (float) r5
            float r0 = r7.a(r0, r3, r5, r1)
            float r9 = r9.getY()
            int r8 = r8.getHeight()
            float r8 = (float) r8
            int r3 = r4.getHeight()
            float r3 = (float) r3
            float r8 = r7.a(r9, r8, r3, r2)
            vn0 r9 = r7.a
            r9.c = r0
            r9.d = r8
            boolean r8 = r7.Y
            if (r8 != 0) goto L79
            boolean r8 = r7.e()
            if (r8 == 0) goto L79
            wwg r8 = r7.d
            if (r8 != 0) goto L61
            wwg r8 = new wwg
            r9 = 6
            r8.<init>(r9, r7)
            r7.d = r8
        L61:
            r7.Y = r2
            r7.z = r2
            boolean r9 = r7.y
            if (r9 != 0) goto L74
            int r9 = r7.g
            if (r9 <= 0) goto L74
            long r5 = (long) r9
            java.util.WeakHashMap r9 = defpackage.nvf.a
            r4.postOnAnimationDelayed(r8, r5)
            goto L77
        L74:
            r8.run()
        L77:
            r7.y = r2
        L79:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l88.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }
}
