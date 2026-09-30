package defpackage;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ke6 {
    public boolean A;
    public RectF B;
    public final me6 a;
    public Outline f;
    public float j;
    public vs9 k;
    public zt l;
    public zt m;
    public boolean n;
    public xl1 o;
    public rt p;
    public int q;
    public boolean s;
    public long t;
    public long u;
    public int v;
    public int w;
    public int x;
    public int y;
    public long z;
    public sw3 b = rs0.n;
    public cv7 c = cv7.a;
    public a26 d = xx.R0;
    public final je6 e = new je6(this);
    public boolean g = true;
    public long h = 0;
    public long i = 9205357640488583168L;
    public final kv r = new kv();

    static {
        pa7.t(Build.FINGERPRINT, "robolectric");
    }

    public ke6(me6 me6Var) {
        this.a = me6Var;
        me6Var.F(false);
        this.t = 0L;
        this.u = 0L;
        this.z = 9205357640488583168L;
    }

    public final void a() {
        Outline outline;
        if (this.g) {
            boolean z = this.A;
            Outline outline2 = null;
            me6 me6Var = this.a;
            if (z || me6Var.M() > 0.0f) {
                zt ztVar = this.l;
                if (ztVar != null) {
                    RectF rectF = this.B;
                    if (rectF == null) {
                        rectF = new RectF();
                        this.B = rectF;
                    }
                    boolean z2 = ztVar instanceof zt;
                    if (!z2) {
                        s8f.i("Unable to obtain android.graphics.Path");
                        return;
                    }
                    Path path = ztVar.a;
                    path.computeBounds(rectF, false);
                    int i = Build.VERSION.SDK_INT;
                    if (i > 28 || path.isConvex()) {
                        outline = this.f;
                        if (outline == null) {
                            outline = new Outline();
                            this.f = outline;
                        }
                        if (i >= 30) {
                            p6.s(outline, ztVar);
                        } else {
                            if (!z2) {
                                s8f.i("Unable to obtain android.graphics.Path");
                                return;
                            }
                            outline.setConvexPath(path);
                        }
                        outline.offset(this.v, this.w);
                        this.n = !outline.canClip();
                    } else {
                        Outline outline3 = this.f;
                        if (outline3 != null) {
                            outline3.setEmpty();
                        }
                        this.n = true;
                        outline = null;
                    }
                    this.l = ztVar;
                    if (outline != null) {
                        outline.setAlpha(me6Var.a());
                        outline2 = outline;
                    }
                    me6Var.h(outline2, (4294967295L & ((long) Math.round(rectF.height()))) | (((long) Math.round(rectF.width())) << 32));
                    if (this.n && this.A) {
                        me6Var.F(false);
                        me6Var.k();
                    } else {
                        me6Var.F(this.A);
                    }
                } else {
                    me6Var.F(this.A);
                    Outline outline4 = this.f;
                    if (outline4 == null) {
                        outline4 = new Outline();
                        this.f = outline4;
                    }
                    Outline outline5 = outline4;
                    long jY0 = db6.Y0(this.u);
                    long j = this.h;
                    long j2 = this.i;
                    long j3 = j2 == 9205357640488583168L ? jY0 : j2;
                    int i2 = (int) (j >> 32);
                    int i3 = (int) (j & 4294967295L);
                    outline5.setRoundRect(Math.round(Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat(i3)), Math.round(Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2)), Math.round(Float.intBitsToFloat((int) (4294967295L & j3)) + Float.intBitsToFloat(i3)), this.j);
                    outline5.setAlpha(me6Var.a());
                    me6Var.h(outline5, db6.J0(j3));
                }
            } else {
                me6Var.F(false);
                me6Var.h(null, 0L);
            }
        }
        this.g = false;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:0: B:14:0x002d->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:0: B:14:0x002d->B:24:0x006a], SYNTHETIC] */
    public final void b() {
        if (this.s && this.q == 0) {
            kv kvVar = this.r;
            ke6 ke6Var = (ke6) kvVar.b;
            if (ke6Var != null) {
                ke6Var.q--;
                ke6Var.b();
                kvVar.b = null;
            }
            x79 x79Var = (x79) kvVar.d;
            if (x79Var != null) {
                Object[] objArr = x79Var.b;
                long[] jArr = x79Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i != length) {
                                break;
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    ke6 ke6Var2 = (ke6) objArr[(i << 3) + i3];
                                    ke6Var2.q--;
                                    ke6Var2.b();
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            } else if (i != length) {
                                break;
                            } else {
                                i++;
                            }
                        }
                    }
                }
                x79Var.f();
            }
            this.a.k();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[LOOP:0: B:20:0x0059->B:30:0x0096, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x0099 A[EDGE_INSN: B:34:0x0099->B:31:0x0099 BREAK  A[LOOP:0: B:20:0x0059->B:30:0x0096], SYNTHETIC] */
    public final void c(sn4 sn4Var) {
        kv kvVar = this.r;
        kvVar.c = (ke6) kvVar.b;
        x79 x79Var = (x79) kvVar.d;
        if (x79Var != null && x79Var.d()) {
            x79 x79Var2 = (x79) kvVar.e;
            if (x79Var2 == null) {
                x79 x79Var3 = mec.a;
                x79Var2 = new x79();
                kvVar.e = x79Var2;
            }
            x79Var2.k(x79Var);
            x79Var.f();
        }
        kvVar.a = true;
        this.d.d(sn4Var);
        kvVar.a = false;
        ke6 ke6Var = (ke6) kvVar.c;
        if (ke6Var != null) {
            ke6Var.q--;
            ke6Var.b();
        }
        x79 x79Var4 = (x79) kvVar.e;
        if (x79Var4 == null || !x79Var4.d()) {
            return;
        }
        Object[] objArr = x79Var4.b;
        long[] jArr = x79Var4.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            ke6 ke6Var2 = (ke6) objArr[(i << 3) + i3];
                            ke6Var2.q--;
                            ke6Var2.b();
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        x79Var4.f();
    }

    public final vs9 d() {
        vs9 ts9Var;
        vs9 vs9Var = this.k;
        zt ztVar = this.l;
        if (vs9Var != null) {
            return vs9Var;
        }
        if (ztVar != null) {
            ss9 ss9Var = new ss9(ztVar);
            this.k = ss9Var;
            return ss9Var;
        }
        long jY0 = db6.Y0(this.u);
        long j = this.h;
        long j2 = this.i;
        if (j2 != 9205357640488583168L) {
            jY0 = j2;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jY0 >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jY0 & 4294967295L)) + fIntBitsToFloat2;
        float f = this.j;
        if (f > 0.0f) {
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
            ts9Var = new us9(w6c.a(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)), Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L))));
        } else {
            ts9Var = new ts9(new hkb(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.k = ts9Var;
        return ts9Var;
    }

    public final void e(sw3 sw3Var, cv7 cv7Var, long j, a26 a26Var) {
        boolean zB = e77.b(this.u, j);
        me6 me6Var = this.a;
        if (!zB) {
            this.u = j;
            long j2 = this.t;
            me6Var.p((int) (j2 >> 32), (int) (j2 & 4294967295L), j);
            if (this.i == 9205357640488583168L) {
                this.g = true;
                a();
            }
        }
        this.b = sw3Var;
        this.c = cv7Var;
        this.d = a26Var;
        me6Var.D(sw3Var, cv7Var, this, this.e);
    }

    public final void f(float f) {
        me6 me6Var = this.a;
        if (me6Var.a() == f) {
            return;
        }
        me6Var.v(f);
    }

    public final void g(boolean z) {
        if (this.A != z) {
            this.A = z;
            this.g = true;
            a();
        }
    }

    public final void h(nqb nqbVar) {
        me6 me6Var = this.a;
        if (pa7.t(me6Var.e(), nqbVar)) {
            return;
        }
        me6Var.i(nqbVar);
    }

    public final void i(long j, long j2, float f) {
        float f2 = this.v;
        long jG = hl9.g(j, (((long) Float.floatToRawIntBits(this.w)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32));
        if (hl9.c(this.h, jG) && ald.a(this.i, j2) && this.j == f && this.l == null) {
            return;
        }
        this.k = null;
        this.l = null;
        this.g = true;
        this.n = false;
        this.h = jG;
        this.i = j2;
        this.j = f;
        a();
    }
}
