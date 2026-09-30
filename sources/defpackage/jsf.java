package defpackage;

import android.graphics.Bitmap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jsf extends lrf {
    public final df6 b;
    public String c;
    public boolean d;
    public final im4 e;
    public x16 f;
    public final vz9 g;
    public xz0 h;
    public final vz9 i;
    public long j;
    public float k;
    public float l;
    public final isf m;

    public jsf(df6 df6Var) {
        this.b = df6Var;
        df6Var.i = new isf(this, 0);
        this.c = "";
        this.d = true;
        this.e = new im4();
        this.f = new yqf(1);
        this.g = q1c.f(null);
        this.i = q1c.f(new ald(0L));
        this.j = 9205357640488583168L;
        this.k = 1.0f;
        this.l = 1.0f;
        this.m = new isf(this, 1);
    }

    @Override // defpackage.lrf
    public final void a(sn4 sn4Var) {
        e(sn4Var, 1.0f, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0042  */
    /* JADX WARN: Code duplicated, block: B:34:0x0063 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    public final void e(sn4 sn4Var, float f, c82 c82Var) {
        int i;
        xz0 xz0Var;
        ks ksVarE;
        char c;
        long j;
        long jB;
        c82 c82Var2;
        int i2;
        int i3;
        df6 df6Var = this.b;
        boolean z = df6Var.d;
        vz9 vz9Var = this.g;
        if (!z || df6Var.e == 16) {
            i = 0;
        } else {
            c82 c82Var3 = (c82) vz9Var.getValue();
            int i4 = msf.a;
            if (!(c82Var3 instanceof xz0) ? c82Var3 == null : (i3 = ((xz0) c82Var3).c) == 5 || i3 == 3) {
                i = 0;
            } else if (!(c82Var instanceof xz0) ? c82Var == null : (i2 = ((xz0) c82Var).c) == 5 || i2 == 3) {
                i = 0;
            } else {
                i = 1;
            }
        }
        boolean z2 = this.d;
        im4 im4Var = this.e;
        if (z2 || !ald.a(this.j, sn4Var.f())) {
            if (i == 1) {
                jB = df6Var.e;
                int i5 = msf.a;
                if (y72.c(jB) != 1.0f) {
                    jB = y72.b(jB, 1.0f);
                }
                xz0Var = new xz0(jB, 5);
            } else {
                xz0Var = null;
            }
            this.h = xz0Var;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
            vz9 vz9Var2 = this.i;
            this.k = fIntBitsToFloat / Float.intBitsToFloat((int) (((ald) vz9Var2.getValue()).a >> 32));
            this.l = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / Float.intBitsToFloat((int) (((ald) vz9Var2.getValue()).a & 4294967295L));
            long jCeil = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sn4Var.f() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L))))) & 4294967295L);
            cv7 layoutDirection = sn4Var.getLayoutDirection();
            ksVarE = im4Var.a;
            lp lpVarA = im4Var.b;
            if (ksVarE != null || lpVarA == null) {
                c = ' ';
                j = 4294967295L;
            } else {
                int i6 = (int) (jCeil >> 32);
                Bitmap bitmap = ksVarE.a;
                c = ' ';
                j = 4294967295L;
                if (i6 > bitmap.getWidth() || ((int) (jCeil & 4294967295L)) > bitmap.getHeight() || im4Var.d != i) {
                }
                im4Var.c = jCeil;
                xl1 xl1Var = im4Var.e;
                wl1 wl1Var = xl1Var.a;
                long jY0 = db6.Y0(jCeil);
                sw3 sw3Var = wl1Var.a;
                cv7 cv7Var = wl1Var.b;
                vl1 vl1Var = wl1Var.c;
                lp lpVar = lpVarA;
                long j2 = wl1Var.d;
                wl1Var.a = sn4Var;
                wl1Var.b = layoutDirection;
                wl1Var.c = lpVar;
                wl1Var.d = jY0;
                lpVar.g();
                sn4.y0(xl1Var, y72.b, 0L, 0L, 0.0f, null, 0, 62);
                this.m.d(xl1Var);
                lpVar.o();
                wl1Var.a = sw3Var;
                wl1Var.b = cv7Var;
                wl1Var.c = vl1Var;
                wl1Var.d = j2;
                ksVarE.a.prepareToDraw();
                this.d = false;
                this.j = sn4Var.f();
            }
            ksVarE = vpf.e((int) (jCeil >> c), (int) (jCeil & j), i);
            lpVarA = mp.a(ksVarE);
            im4Var.a = ksVarE;
            im4Var.b = lpVarA;
            im4Var.d = i;
            im4Var.c = jCeil;
            xl1 xl1Var2 = im4Var.e;
            wl1 wl1Var2 = xl1Var2.a;
            long jY1 = db6.Y0(jCeil);
            sw3 sw3Var2 = wl1Var2.a;
            cv7 cv7Var2 = wl1Var2.b;
            vl1 vl1Var2 = wl1Var2.c;
            lp lpVar2 = lpVarA;
            long j3 = wl1Var2.d;
            wl1Var2.a = sn4Var;
            wl1Var2.b = layoutDirection;
            wl1Var2.c = lpVar2;
            wl1Var2.d = jY1;
            lpVar2.g();
            sn4.y0(xl1Var2, y72.b, 0L, 0L, 0.0f, null, 0, 62);
            this.m.d(xl1Var2);
            lpVar2.o();
            wl1Var2.a = sw3Var2;
            wl1Var2.b = cv7Var2;
            wl1Var2.c = vl1Var2;
            wl1Var2.d = j3;
            ksVarE.a.prepareToDraw();
            this.d = false;
            this.j = sn4Var.f();
        } else {
            ks ksVar = im4Var.a;
            if (i != (ksVar != null ? ksVar.a() : 0)) {
                if (i == 1) {
                    jB = df6Var.e;
                    int i7 = msf.a;
                    if (y72.c(jB) != 1.0f) {
                        jB = y72.b(jB, 1.0f);
                    }
                    xz0Var = new xz0(jB, 5);
                } else {
                    xz0Var = null;
                }
                this.h = xz0Var;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                vz9 vz9Var3 = this.i;
                this.k = fIntBitsToFloat2 / Float.intBitsToFloat((int) (((ald) vz9Var3.getValue()).a >> 32));
                this.l = Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) / Float.intBitsToFloat((int) (((ald) vz9Var3.getValue()).a & 4294967295L));
                long jCeil2 = (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sn4Var.f() >> 32))))) << 32) | (((long) ((int) Math.ceil(Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L))))) & 4294967295L);
                cv7 layoutDirection2 = sn4Var.getLayoutDirection();
                ksVarE = im4Var.a;
                lp lpVarA2 = im4Var.b;
                if (ksVarE != null) {
                    c = ' ';
                    j = 4294967295L;
                    ksVarE = vpf.e((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    lpVarA2 = mp.a(ksVarE);
                    im4Var.a = ksVarE;
                    im4Var.b = lpVarA2;
                    im4Var.d = i;
                } else {
                    c = ' ';
                    j = 4294967295L;
                    ksVarE = vpf.e((int) (jCeil2 >> c), (int) (jCeil2 & j), i);
                    lpVarA2 = mp.a(ksVarE);
                    im4Var.a = ksVarE;
                    im4Var.b = lpVarA2;
                    im4Var.d = i;
                }
                im4Var.c = jCeil2;
                xl1 xl1Var3 = im4Var.e;
                wl1 wl1Var3 = xl1Var3.a;
                long jY2 = db6.Y0(jCeil2);
                sw3 sw3Var3 = wl1Var3.a;
                cv7 cv7Var3 = wl1Var3.b;
                vl1 vl1Var3 = wl1Var3.c;
                lp lpVar3 = lpVarA2;
                long j4 = wl1Var3.d;
                wl1Var3.a = sn4Var;
                wl1Var3.b = layoutDirection2;
                wl1Var3.c = lpVar3;
                wl1Var3.d = jY2;
                lpVar3.g();
                sn4.y0(xl1Var3, y72.b, 0L, 0L, 0.0f, null, 0, 62);
                this.m.d(xl1Var3);
                lpVar3.o();
                wl1Var3.a = sw3Var3;
                wl1Var3.b = cv7Var3;
                wl1Var3.c = vl1Var3;
                wl1Var3.d = j4;
                ksVarE.a.prepareToDraw();
                this.d = false;
                this.j = sn4Var.f();
            }
        }
        if (c82Var != null) {
            c82Var2 = c82Var;
        } else {
            c82Var2 = ((c82) vz9Var.getValue()) != null ? (c82) vz9Var.getValue() : this.h;
        }
        ks ksVar2 = im4Var.a;
        if (ksVar2 == null) {
            i37.c("drawCachedImage must be invoked first before attempting to draw the result into another destination");
        }
        sn4.g0(sn4Var, ksVar2, 0L, im4Var.c, 0L, 0L, f, c82Var2, 0, 858);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params: \tname: ");
        sb.append(this.c);
        sb.append("\n\tviewportWidth: ");
        vz9 vz9Var = this.i;
        sb.append(Float.intBitsToFloat((int) (((ald) vz9Var.getValue()).a >> 32)));
        sb.append("\n\tviewportHeight: ");
        sb.append(Float.intBitsToFloat((int) (((ald) vz9Var.getValue()).a & 4294967295L)));
        sb.append("\n");
        return sb.toString();
    }
}
