package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
import android.text.TextPaint;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ew extends TextPaint {
    public rt a;
    public mne b;
    public int c;
    public o4d d;
    public y72 e;
    public b41 f;
    public mx3 g;
    public ald h;
    public un4 i;

    public final dy9 a() {
        rt rtVar = this.a;
        if (rtVar != null) {
            return rtVar;
        }
        rt rtVar2 = new rt(this);
        this.a = rtVar2;
        return rtVar2;
    }

    public final void b(int i) {
        if (i == this.c) {
            return;
        }
        ((rt) a()).e(i);
        this.c = i;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0041  */
    public final void c(b41 b41Var, long j, float f) {
        if (b41Var == null) {
            this.g = null;
            this.f = null;
            this.h = null;
            setShader(null);
            return;
        }
        if (b41Var instanceof dtd) {
            d(ndc.h(((dtd) b41Var).a, f));
            return;
        }
        if (!(b41Var instanceof l4d)) {
            ap.c();
            return;
        }
        int i = 0;
        if (pa7.t(this.f, b41Var)) {
            ald aldVar = this.h;
            if (!(aldVar == null ? false : ald.a(aldVar.a, j))) {
                if (j != 9205357640488583168L) {
                    this.f = b41Var;
                    this.h = new ald(j);
                    this.g = zrd.b(new dw(b41Var, j, i));
                }
            }
        } else if (j != 9205357640488583168L) {
            this.f = b41Var;
            this.h = new ald(j);
            this.g = zrd.b(new dw(b41Var, j, i));
        }
        dy9 dy9VarA = a();
        mx3 mx3Var = this.g;
        ((rt) dy9VarA).j(mx3Var != null ? (Shader) mx3Var.getValue() : null);
        this.e = null;
        tq.N(this, f);
    }

    public final void d(long j) {
        y72 y72Var = this.e;
        if ((y72Var == null ? false : faf.a(y72Var.a, j)) || j == 16) {
            return;
        }
        this.e = new y72(j);
        setColor(abg.Z(j));
        this.g = null;
        this.f = null;
        this.h = null;
        setShader(null);
    }

    public final void e(un4 un4Var) {
        if (un4Var == null || pa7.t(this.i, un4Var)) {
            return;
        }
        this.i = un4Var;
        if (un4Var.equals(oe5.a)) {
            setStyle(Paint.Style.FILL);
            return;
        }
        if (!(un4Var instanceof d5e)) {
            ap.c();
            return;
        }
        ((rt) a()).n(1);
        d5e d5eVar = (d5e) un4Var;
        ((rt) a()).m(d5eVar.a);
        dy9 dy9VarA = a();
        ((rt) dy9VarA).a.setStrokeMiter(d5eVar.b);
        ((rt) a()).l(d5eVar.d);
        ((rt) a()).k(d5eVar.c);
        ((rt) a()).i(d5eVar.e);
    }

    public final void f(o4d o4dVar) {
        if (o4dVar == null || pa7.t(this.d, o4dVar)) {
            return;
        }
        this.d = o4dVar;
        if (o4dVar.equals(o4d.d)) {
            clearShadowLayer();
            return;
        }
        o4d o4dVar2 = this.d;
        float f = o4dVar2.c;
        if (f == 0.0f) {
            f = Float.MIN_VALUE;
        }
        setShadowLayer(f, Float.intBitsToFloat((int) (o4dVar2.b >> 32)), Float.intBitsToFloat((int) (this.d.b & 4294967295L)), abg.Z(this.d.a));
    }

    public final void g(mne mneVar) {
        if (mneVar == null || pa7.t(this.b, mneVar)) {
            return;
        }
        this.b = mneVar;
        int i = mneVar.a;
        setUnderlineText((i | 1) == i);
        int i2 = this.b.a;
        setStrikeThruText((i2 | 2) == i2);
    }
}
