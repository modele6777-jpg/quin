package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g27 implements rl4 {
    public final yk4 a;
    public b27 b;
    public e27 c;
    public d27 d;
    public c27 e;
    public b21 f;
    public ctf g;
    public u0f v;
    public final sug w;
    public final sug x;

    public g27(yk4 yk4Var) {
        this.a = yk4Var;
        char c = 0;
        sug sugVar = new sug(6, c);
        sugVar.c = new i79();
        this.w = sugVar;
        sug sugVar2 = new sug(12, c);
        sugVar2.c = new x69();
        this.x = sugVar2;
    }

    public static void c(g27 g27Var, z17 z17Var, long j, long j2, int i) {
        if ((i & 4) != 0) {
            j2 = 0;
        }
        yk4 yk4Var = g27Var.a;
        d27 d27Var = g27Var.d;
        if (d27Var == null) {
            d27Var = new d27();
            d27Var.o = null;
            d27Var.p = Long.MAX_VALUE;
            d27Var.q = false;
            g27Var.d = d27Var;
        }
        d27Var.o = z17Var;
        d27Var.p = j;
        u0f u0fVar = g27Var.v;
        ks9 ks9Var = yk4Var.F0;
        if (u0fVar == null) {
            g27Var.v = new u0f(ks9Var, 2);
        } else {
            u0fVar.a = ks9Var;
            u0fVar.b = j2;
        }
        d27Var.q = false;
        g27Var.f = d27Var;
    }

    @Override // defpackage.t66
    public final String Y() {
        b21 b21Var = this.f;
        if (b21Var instanceof b27) {
            return ((b27) b21Var).q ? "waiting" : "idle";
        }
        if ((b21Var instanceof d27) || (b21Var instanceof c27)) {
            return "waiting";
        }
        return b21Var instanceof e27 ? "recognized" : "idle";
    }

    public final void a() {
        b27 b27Var = this.b;
        a27 a27Var = a27.c;
        if (b27Var == null) {
            b27Var = new b27();
            b27Var.o = a27Var;
            b27Var.p = false;
            b27Var.q = false;
            this.b = b27Var;
        }
        b27Var.o = a27Var;
        b27Var.p = false;
        b27Var.q = false;
        this.f = b27Var;
    }

    public final void b(z17 z17Var, long j, u0f u0fVar) {
        c27 c27Var = this.e;
        if (c27Var == null) {
            c27Var = new c27();
            c27Var.o = null;
            c27Var.p = Long.MAX_VALUE;
            this.e = c27Var;
        }
        c27Var.o = z17Var;
        c27Var.p = j;
        u0fVar.b = 0L;
        this.f = c27Var;
    }

    public final ctf d() {
        ctf ctfVar = this.g;
        if (ctfVar != null) {
            return ctfVar;
        }
        qc0.j("Velocity Tracker not initialized.");
        return null;
    }

    public final void e(z17 z17Var, y17 y17Var, long j) {
        long j2;
        float fIntBitsToFloat;
        long j3 = z17Var.c;
        yk4 yk4Var = this.a;
        ks9 ks9Var = yk4Var.F0;
        ks9Var.getClass();
        sl4 sl4Var = ul4.a;
        long j4 = 4294967295L;
        if (Math.abs(Float.intBitsToFloat((int) (ks9Var == ks9.a ? j & 4294967295L : j >> 32))) > 2.0f) {
            ctf ctfVarD = d();
            ks9 ks9Var2 = yk4Var.F0;
            sug sugVar = this.w;
            i79 i79Var = (i79) sugVar.c;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j3 >> 32));
            float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 & 4294967295L));
            if (g21.z(z17Var)) {
                sugVar.b = 0;
                i79Var.k();
            }
            float fIntBitsToFloat4 = 0.0f;
            if (g21.A(z17Var) || g21.z(z17Var)) {
                j2 = 4294967295L;
            } else {
                if (i79Var.b == 3) {
                    int i = sugVar.b;
                    sugVar.b = i + 1;
                    i79Var.p(i, z17Var);
                } else {
                    i79Var.h(z17Var);
                }
                if (sugVar.b == 3) {
                    sugVar.b = 0;
                }
                Object[] objArr = i79Var.a;
                int i2 = i79Var.b;
                int i3 = 0;
                float fIntBitsToFloat5 = 0.0f;
                while (i3 < i2) {
                    fIntBitsToFloat5 += Float.intBitsToFloat((int) (((z17) objArr[i3]).c >> 32));
                    i3++;
                    j4 = j4;
                }
                j2 = j4;
                int i4 = i79Var.b;
                fIntBitsToFloat2 = fIntBitsToFloat5 / i4;
                Object[] objArr2 = i79Var.a;
                float fIntBitsToFloat6 = 0.0f;
                for (int i5 = 0; i5 < i4; i5++) {
                    fIntBitsToFloat6 += Float.intBitsToFloat((int) (((z17) objArr2[i5]).c & j2));
                }
                fIntBitsToFloat3 = fIntBitsToFloat6 / i79Var.b;
            }
            long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << 32);
            if (ks9Var2 != null) {
                int i6 = y17Var.a;
                if (i6 == 1) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                } else if (i6 == 2) {
                    fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
                }
                jFloatToRawIntBits = ks9Var2 == ks9.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2) | (((long) Float.floatToRawIntBits(0.0f)) << 32);
            }
            ctfVarD.a.a(z17Var.b, jFloatToRawIntBits);
            sug sugVar2 = this.x;
            x69 x69Var = (x69) sugVar2.c;
            if (x69Var.b == 3) {
                int i7 = sugVar2.b;
                sugVar2.b = i7 + 1;
                x69Var.f(i7, j);
            } else {
                x69Var.a(j);
            }
            if (sugVar2.b == 3) {
                sugVar2.b = 0;
            }
            long[] jArr = x69Var.a;
            int i8 = x69Var.b;
            float fIntBitsToFloat7 = 0.0f;
            for (int i9 = 0; i9 < i8; i9++) {
                fIntBitsToFloat7 += Float.intBitsToFloat((int) (jArr[i9] >> 32));
            }
            int i10 = x69Var.b;
            float f = fIntBitsToFloat7 / i10;
            long[] jArr2 = x69Var.a;
            for (int i11 = 0; i11 < i10; i11++) {
                fIntBitsToFloat4 = Float.intBitsToFloat((int) (jArr2[i11] & j2)) + fIntBitsToFloat4;
            }
            yk4Var.t1(new uj4((((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4 / x69Var.b)) & j2), true));
        }
    }

    public final void f(z17 z17Var, z17 z17Var2, y17 y17Var, long j) {
        char c;
        long j2;
        float fIntBitsToFloat;
        if (this.g == null) {
            this.g = new ctf();
        }
        ctf ctfVarD = d();
        yk4 yk4Var = this.a;
        ks9 ks9Var = yk4Var.F0;
        sug sugVar = this.w;
        i79 i79Var = (i79) sugVar.c;
        char c2 = ' ';
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (z17Var.c >> 32));
        long j3 = 4294967295L;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (z17Var.c & 4294967295L));
        if (g21.z(z17Var)) {
            sugVar.b = 0;
            i79Var.k();
        }
        if (g21.A(z17Var) || g21.z(z17Var)) {
            c = ' ';
            j2 = 4294967295L;
        } else {
            if (i79Var.b == 3) {
                int i = sugVar.b;
                sugVar.b = i + 1;
                i79Var.p(i, z17Var);
            } else {
                i79Var.h(z17Var);
            }
            if (sugVar.b == 3) {
                sugVar.b = 0;
            }
            Object[] objArr = i79Var.a;
            int i2 = i79Var.b;
            int i3 = 0;
            float fIntBitsToFloat4 = 0.0f;
            while (i3 < i2) {
                char c3 = c2;
                fIntBitsToFloat4 += Float.intBitsToFloat((int) (((z17) objArr[i3]).c >> c3));
                i3++;
                c2 = c3;
                j3 = j3;
            }
            c = c2;
            j2 = j3;
            int i4 = i79Var.b;
            fIntBitsToFloat2 = fIntBitsToFloat4 / i4;
            Object[] objArr2 = i79Var.a;
            float fIntBitsToFloat5 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                fIntBitsToFloat5 += Float.intBitsToFloat((int) (((z17) objArr2[i5]).c & j2));
            }
            fIntBitsToFloat3 = fIntBitsToFloat5 / i79Var.b;
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) & j2);
        if (ks9Var != null) {
            int i6 = y17Var.a;
            if (i6 == 1) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits >> c));
            } else if (i6 == 2) {
                fIntBitsToFloat = Float.intBitsToFloat((int) (jFloatToRawIntBits & j2));
            }
            jFloatToRawIntBits = ks9Var == ks9.b ? (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << c) | (((long) Float.floatToRawIntBits(0.0f)) & j2) : (((long) Float.floatToRawIntBits(0.0f)) << c) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & j2);
        }
        ctfVarD.a.a(z17Var.b, jFloatToRawIntBits);
        long jF = hl9.f(g21.Y(z17Var2, yk4Var.F0, y17Var), j);
        if (((Boolean) yk4Var.G0.d(new xia(1))).booleanValue()) {
            yk4Var.t1(new vj4(jF));
        }
        sug sugVar2 = this.x;
        sugVar2.b = 0;
        ((x69) sugVar2.c).b = 0;
    }

    @Override // defpackage.rl4
    public final ks9 f0() {
        return this.a.F0;
    }
}
