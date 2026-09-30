package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eh8 implements ug8 {
    public final mx3 X;
    public final b99 Y;
    public final vz9 a;
    public final vz9 b;
    public final vz9 c;
    public final vz9 d;
    public final vz9 e;
    public final vz9 f;
    public final vz9 g;
    public final mx3 v;
    public final vz9 w;
    public final vz9 x;
    public final vz9 y;
    public final vz9 z;

    public eh8() {
        Boolean bool = Boolean.FALSE;
        this.a = q1c.f(bool);
        this.b = q1c.f(1);
        this.c = q1c.f(1);
        this.d = q1c.f(bool);
        this.e = q1c.f(null);
        this.f = q1c.f(Float.valueOf(1.0f));
        this.g = q1c.f(bool);
        this.v = zrd.b(new bh8(this));
        this.w = q1c.f(null);
        Float fValueOf = Float.valueOf(0.0f);
        this.x = q1c.f(fValueOf);
        this.y = q1c.f(fValueOf);
        this.z = q1c.f(Long.MIN_VALUE);
        this.X = zrd.b(new ah8(this));
        zrd.b(new ch8(this));
        this.Y = new b99();
    }

    public final int c() {
        return ((Number) this.b.getValue()).intValue();
    }

    public final float d() {
        return ((Number) this.y.getValue()).floatValue();
    }

    public final boolean f(int i, long j) {
        uh8 uh8Var = (uh8) this.w.getValue();
        if (uh8Var == null) {
            return true;
        }
        vz9 vz9Var = this.z;
        long jLongValue = ((Number) vz9Var.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) vz9Var.getValue()).longValue();
        vz9Var.setValue(Long.valueOf(j));
        vz9 vz9Var2 = this.e;
        if (vz9Var2.getValue() != null) {
            r3.f();
            return false;
        }
        if (vz9Var2.getValue() != null) {
            r3.f();
            return false;
        }
        float fB = (jLongValue / 1000000) / uh8Var.b();
        mx3 mx3Var = this.v;
        float fFloatValue = ((Number) mx3Var.getValue()).floatValue() * fB;
        float fFloatValue2 = ((Number) mx3Var.getValue()).floatValue();
        vz9 vz9Var3 = this.x;
        float fFloatValue3 = fFloatValue2 < 0.0f ? 0.0f - (((Number) vz9Var3.getValue()).floatValue() + fFloatValue) : (((Number) vz9Var3.getValue()).floatValue() + fFloatValue) - 1.0f;
        if (fFloatValue3 < 0.0f) {
            j(mh3.n(((Number) vz9Var3.getValue()).floatValue(), 0.0f, 1.0f) + fFloatValue);
            return true;
        }
        int i2 = (int) (fFloatValue3 / 1.0f);
        int i3 = i2 + 1;
        if (c() + i3 > i) {
            j(((Number) this.X.getValue()).floatValue());
            h(i);
            return false;
        }
        h(c() + i3);
        float f = fFloatValue3 - (i2 * 1.0f);
        j(((Number) mx3Var.getValue()).floatValue() < 0.0f ? 1.0f - f : 0.0f + f);
        return true;
    }

    @Override // defpackage.h0e
    public final Object getValue() {
        return Float.valueOf(d());
    }

    public final void h(int i) {
        this.b.setValue(Integer.valueOf(i));
    }

    public final void i(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public final void j(float f) {
        uh8 uh8Var;
        this.x.setValue(Float.valueOf(f));
        if (((Boolean) this.g.getValue()).booleanValue() && (uh8Var = (uh8) this.w.getValue()) != null) {
            f -= f % (1.0f / uh8Var.n);
        }
        this.y.setValue(Float.valueOf(f));
    }
}
