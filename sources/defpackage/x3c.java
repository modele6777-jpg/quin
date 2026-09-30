package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x3c extends p82 {
    public static final cva r = new cva(10);
    public final y3g d;
    public final float e;
    public final float f;
    public final m2f g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final si4 k;
    public final w3c l;
    public final r3c m;
    public final si4 n;
    public final v3c o;
    public final r3c p;
    public final boolean q;

    /* JADX WARN: Code duplicated, block: B:41:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:42:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:47:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:53:0x0214  */
    /* JADX WARN: Code duplicated, block: B:56:0x021d  */
    /* JADX WARN: Code duplicated, block: B:63:0x0231  */
    /* JADX WARN: Code duplicated, block: B:65:0x0249  */
    /* JADX WARN: Code duplicated, block: B:75:0x0214 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x020e A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public x3c(String str, float[] fArr, y3g y3gVar, float[] fArr2, si4 si4Var, si4 si4Var2, float f, float f2, m2f m2fVar, int i) {
        int i2;
        float f3;
        float[] fArr3;
        float f4;
        float[] fArr4;
        x3c x3cVar;
        double d;
        boolean z;
        int i3;
        super(i, 12884901888L, str);
        this.d = y3gVar;
        this.e = f;
        this.f = f2;
        this.g = m2fVar;
        this.k = si4Var;
        this.l = new w3c(this);
        this.m = new r3c(this, 0);
        this.n = si4Var2;
        this.o = new v3c(this);
        this.p = new r3c(this, 1);
        if (fArr.length != 6 && fArr.length != 9) {
            qc0.j("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
            throw null;
        }
        if (f >= f2) {
            qc0.j(kv2.k("Invalid range: min=", f, ", max=", f2, "; min must be strictly < max"));
            throw null;
        }
        float[] fArr5 = new float[6];
        if (fArr.length == 9) {
            float f5 = fArr[0];
            float f6 = fArr[1];
            float f7 = f5 + f6 + fArr[2];
            fArr5[0] = f5 / f7;
            fArr5[1] = f6 / f7;
            float f8 = fArr[3];
            float f9 = fArr[4];
            float f10 = f8 + f9 + fArr[5];
            fArr5[2] = f8 / f10;
            fArr5[3] = f9 / f10;
            float f11 = fArr[6];
            float f12 = fArr[7];
            float f13 = f11 + f12 + fArr[8];
            fArr5[4] = f11 / f13;
            fArr5[5] = f12 / f13;
        } else {
            System.arraycopy(fArr, 0, fArr5, 0, 6);
        }
        this.h = fArr5;
        if (fArr2 == null) {
            float f14 = fArr5[0];
            float f15 = fArr5[1];
            float f16 = fArr5[2];
            float f17 = fArr5[3];
            float f18 = fArr5[4];
            float f19 = fArr5[5];
            f3 = 1.0f;
            float f20 = y3gVar.a;
            i2 = 0;
            float f21 = y3gVar.b;
            float f22 = 1.0f - f14;
            float f23 = f22 / f15;
            float f24 = 1.0f - f16;
            float f25 = 1.0f - f18;
            float f26 = (1.0f - f20) / f21;
            float f27 = f14 / f15;
            float f28 = (f16 / f17) - f27;
            float f29 = (f20 / f21) - f27;
            float f30 = (f24 / f17) - f23;
            float f31 = (f18 / f19) - f27;
            float f32 = (((f26 - f23) * f28) - (f29 * f30)) / ((((f25 / f19) - f23) * f28) - (f30 * f31));
            float f33 = (f29 - (f31 * f32)) / f28;
            float f34 = (1.0f - f33) - f32;
            float f35 = f34 / f15;
            float f36 = f33 / f17;
            float f37 = f32 / f19;
            fArr3 = new float[]{f14 * f35, f34, (f22 - f15) * f35, f16 * f36, f33, (f24 - f17) * f36, f18 * f37, f32, (f25 - f19) * f37};
            this.i = fArr3;
        } else {
            i2 = 0;
            f3 = 1.0f;
            if (fArr2.length != 9) {
                qc0.j(tec.e(fArr2.length, "Transform must have 9 entries! Has "));
                throw null;
            }
            this.i = fArr2;
            fArr3 = fArr2;
        }
        this.j = hkg.y0(fArr3);
        float fC = u3c.c(fArr5);
        float[] fArr6 = s82.a;
        if (fC / u3c.c(s82.b) > 0.9f) {
            float[] fArr7 = s82.a;
            float f38 = fArr5[i2];
            float f39 = fArr7[i2];
            float f40 = fArr5[1];
            float f41 = fArr7[1];
            float f42 = fArr5[2];
            float f43 = fArr7[2];
            float f44 = fArr5[3];
            float f45 = fArr7[3];
            float f46 = fArr5[4];
            float f47 = fArr7[4];
            float f48 = fArr5[5];
            float f49 = fArr7[5];
            f4 = 0.0f;
            float[] fArr8 = new float[6];
            fArr8[i2] = f38 - f39;
            fArr8[1] = f40 - f41;
            fArr8[2] = f42 - f43;
            fArr8[3] = f44 - f45;
            fArr8[4] = f46 - f47;
            fArr8[5] = f48 - f49;
            float f50 = fArr8[i2];
            float f51 = fArr8[1];
            if (((f41 - f49) * f50) - ((f39 - f47) * f51) >= 0.0f && ((f39 - f43) * f51) - ((f41 - f45) * f50) >= 0.0f) {
                float f52 = fArr8[2];
                float f53 = fArr8[3];
                if (((f45 - f41) * f52) - ((f43 - f39) * f53) >= 0.0f && ((f43 - f47) * f53) - ((f45 - f49) * f52) >= 0.0f) {
                    float f54 = fArr8[4];
                    float f55 = fArr8[5];
                    if (((f49 - f45) * f54) - ((f47 - f43) * f55) < 0.0f || ((f47 - f39) * f55) - ((f49 - f41) * f54) < 0.0f) {
                    }
                }
            }
            if (i != 0) {
                fArr4 = s82.a;
                if (fArr5 == fArr4) {
                    i3 = i2;
                    while (true) {
                        if (i3 < 6) {
                            if (Float.compare(fArr5[i3], fArr4[i3]) != 0 || Math.abs(fArr5[i3] - fArr4[i3]) <= 0.001f) {
                                i3++;
                            }
                        } else if (hkg.f0(y3gVar, cgg.m)) {
                            float[] fArr9 = s82.a;
                            x3cVar = s82.e;
                            d = 0.0d;
                            while (true) {
                                if (d <= 1.0d) {
                                    z = 1;
                                } else if (Math.abs(si4Var.b(d) - x3cVar.k.b(d)) > 0.001d) {
                                }
                                d += 0.00392156862745098d;
                            }
                        }
                    }
                } else if (hkg.f0(y3gVar, cgg.m) && f == f4 && f2 == f3) {
                    float[] fArr10 = s82.a;
                    x3cVar = s82.e;
                    d = 0.0d;
                    while (true) {
                        if (d <= 1.0d) {
                            z = 1;
                        } else if (Math.abs(si4Var.b(d) - x3cVar.k.b(d)) > 0.001d && Math.abs(si4Var2.b(d) - x3cVar.n.b(d)) <= 0.001d) {
                            d += 0.00392156862745098d;
                        }
                    }
                }
                z = i2;
            } else {
                z = 1;
            }
            this.q = z;
        }
        f4 = 0.0f;
        int i4 = (f > f4 ? 1 : (f == f4 ? 0 : -1));
        if (i != 0) {
            fArr4 = s82.a;
            if (fArr5 == fArr4) {
                i3 = i2;
                while (true) {
                    if (i3 < 6) {
                        if (Float.compare(fArr5[i3], fArr4[i3]) != 0) {
                        }
                        i3++;
                    } else if (hkg.f0(y3gVar, cgg.m)) {
                        float[] fArr11 = s82.a;
                        x3cVar = s82.e;
                        d = 0.0d;
                        while (true) {
                            if (d <= 1.0d) {
                                z = 1;
                            } else if (Math.abs(si4Var.b(d) - x3cVar.k.b(d)) > 0.001d) {
                            }
                            d += 0.00392156862745098d;
                        }
                    }
                }
            } else if (hkg.f0(y3gVar, cgg.m)) {
                float[] fArr12 = s82.a;
                x3cVar = s82.e;
                d = 0.0d;
                while (true) {
                    if (d <= 1.0d) {
                        z = 1;
                    } else if (Math.abs(si4Var.b(d) - x3cVar.k.b(d)) > 0.001d) {
                    }
                    d += 0.00392156862745098d;
                }
            }
            z = i2;
        } else {
            z = 1;
        }
        this.q = z;
    }

    @Override // defpackage.p82
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.p82
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.p82
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.p82
    public final long d(float f, float f2, float f3) {
        double d = f;
        r3c r3cVar = this.p;
        float fB = (float) r3cVar.b(d);
        float fB2 = (float) r3cVar.b(f2);
        float fB3 = (float) r3cVar.b(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        return (((long) Float.floatToRawIntBits((fArr[6] * fB3) + ((fArr[3] * fB2) + (fArr[0] * fB)))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits((fArr[7] * fB3) + (fArr[4] * fB2) + (fArr[1] * fB))));
    }

    @Override // defpackage.p82
    public final float e(float f, float f2, float f3) {
        double d = f;
        r3c r3cVar = this.p;
        float fB = (float) r3cVar.b(d);
        float fB2 = (float) r3cVar.b(f2);
        float fB3 = (float) r3cVar.b(f3);
        float[] fArr = this.i;
        return (fArr[8] * fB3) + (fArr[5] * fB2) + (fArr[2] * fB);
    }

    @Override // defpackage.p82
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x3c.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        x3c x3cVar = (x3c) obj;
        if (Float.compare(x3cVar.e, this.e) != 0 || Float.compare(x3cVar.f, this.f) != 0 || !pa7.t(this.d, x3cVar.d) || !Arrays.equals(this.h, x3cVar.h)) {
            return false;
        }
        m2f m2fVar = x3cVar.g;
        m2f m2fVar2 = this.g;
        if (m2fVar2 != null) {
            return pa7.t(m2fVar2, m2fVar);
        }
        if (m2fVar == null) {
            return true;
        }
        if (pa7.t(this.k, x3cVar.k)) {
            return pa7.t(this.n, x3cVar.n);
        }
        return false;
    }

    @Override // defpackage.p82
    public final long f(float f, float f2, float f3, float f4, p82 p82Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        r3c r3cVar = this.m;
        return abg.b((float) r3cVar.b(f5), (float) r3cVar.b(f6), (float) r3cVar.b(f7), f4, p82Var);
    }

    @Override // defpackage.p82
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        m2f m2fVar = this.g;
        int iHashCode2 = iFloatToIntBits2 + (m2fVar != null ? m2fVar.hashCode() : 0);
        if (m2fVar != null) {
            return iHashCode2;
        }
        return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
    }

    public x3c(String str, float[] fArr, y3g y3gVar, final m2f m2fVar, int i) {
        double d;
        si4 si4Var;
        si4 si4Var2;
        double d2 = m2fVar.a;
        final int i2 = 0;
        final int i3 = 1;
        boolean z = d2 == -3.0d;
        double d3 = m2fVar.g;
        double d4 = m2fVar.f;
        if (z) {
            d = -3.0d;
            final int i4 = 4;
            si4Var = new si4() { // from class: t3c
                @Override // defpackage.si4
                public final double b(double d5) {
                    int i5 = i4;
                    m2f m2fVar2 = m2fVar;
                    switch (i5) {
                        case 0:
                            float[] fArr2 = s82.a;
                            return s82.a(m2fVar2, d5);
                        case 1:
                            float[] fArr3 = s82.a;
                            return s82.c(m2fVar2, d5);
                        case 2:
                            double d6 = m2fVar2.b;
                            return d5 >= m2fVar2.e ? Math.pow((d6 * d5) + m2fVar2.c, m2fVar2.a) : m2fVar2.d * d5;
                        case 3:
                            double d7 = m2fVar2.b;
                            double d8 = m2fVar2.c;
                            double d9 = m2fVar2.d;
                            return d5 >= m2fVar2.e ? Math.pow((d7 * d5) + d8, m2fVar2.a) + m2fVar2.f : (d9 * d5) + m2fVar2.g;
                        case 4:
                            float[] fArr4 = s82.a;
                            return s82.b(m2fVar2, d5);
                        case 5:
                            float[] fArr5 = s82.a;
                            return s82.d(m2fVar2, d5);
                        case 6:
                            double d10 = m2fVar2.b;
                            double d11 = m2fVar2.c;
                            double d12 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d12 ? (Math.pow(d5, 1.0d / m2fVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = m2fVar2.b;
                            double d14 = m2fVar2.c;
                            double d15 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d15 ? (Math.pow(d5 - m2fVar2.f, 1.0d / m2fVar2.a) - d14) / d13 : (d5 - m2fVar2.g) / d15;
                    }
                }
            };
        } else {
            d = -3.0d;
            if (d2 == -2.0d) {
                final int i5 = 5;
                si4Var = new si4() { // from class: t3c
                    @Override // defpackage.si4
                    public final double b(double d5) {
                        int i6 = i5;
                        m2f m2fVar2 = m2fVar;
                        switch (i6) {
                            case 0:
                                float[] fArr2 = s82.a;
                                return s82.a(m2fVar2, d5);
                            case 1:
                                float[] fArr3 = s82.a;
                                return s82.c(m2fVar2, d5);
                            case 2:
                                double d6 = m2fVar2.b;
                                return d5 >= m2fVar2.e ? Math.pow((d6 * d5) + m2fVar2.c, m2fVar2.a) : m2fVar2.d * d5;
                            case 3:
                                double d7 = m2fVar2.b;
                                double d8 = m2fVar2.c;
                                double d9 = m2fVar2.d;
                                return d5 >= m2fVar2.e ? Math.pow((d7 * d5) + d8, m2fVar2.a) + m2fVar2.f : (d9 * d5) + m2fVar2.g;
                            case 4:
                                float[] fArr4 = s82.a;
                                return s82.b(m2fVar2, d5);
                            case 5:
                                float[] fArr5 = s82.a;
                                return s82.d(m2fVar2, d5);
                            case 6:
                                double d10 = m2fVar2.b;
                                double d11 = m2fVar2.c;
                                double d12 = m2fVar2.d;
                                return d5 >= m2fVar2.e * d12 ? (Math.pow(d5, 1.0d / m2fVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = m2fVar2.b;
                                double d14 = m2fVar2.c;
                                double d15 = m2fVar2.d;
                                return d5 >= m2fVar2.e * d15 ? (Math.pow(d5 - m2fVar2.f, 1.0d / m2fVar2.a) - d14) / d13 : (d5 - m2fVar2.g) / d15;
                        }
                    }
                };
            } else if (d4 == 0.0d && d3 == 0.0d) {
                final int i6 = 6;
                si4Var = new si4() { // from class: t3c
                    @Override // defpackage.si4
                    public final double b(double d5) {
                        int i7 = i6;
                        m2f m2fVar2 = m2fVar;
                        switch (i7) {
                            case 0:
                                float[] fArr2 = s82.a;
                                return s82.a(m2fVar2, d5);
                            case 1:
                                float[] fArr3 = s82.a;
                                return s82.c(m2fVar2, d5);
                            case 2:
                                double d6 = m2fVar2.b;
                                return d5 >= m2fVar2.e ? Math.pow((d6 * d5) + m2fVar2.c, m2fVar2.a) : m2fVar2.d * d5;
                            case 3:
                                double d7 = m2fVar2.b;
                                double d8 = m2fVar2.c;
                                double d9 = m2fVar2.d;
                                return d5 >= m2fVar2.e ? Math.pow((d7 * d5) + d8, m2fVar2.a) + m2fVar2.f : (d9 * d5) + m2fVar2.g;
                            case 4:
                                float[] fArr4 = s82.a;
                                return s82.b(m2fVar2, d5);
                            case 5:
                                float[] fArr5 = s82.a;
                                return s82.d(m2fVar2, d5);
                            case 6:
                                double d10 = m2fVar2.b;
                                double d11 = m2fVar2.c;
                                double d12 = m2fVar2.d;
                                return d5 >= m2fVar2.e * d12 ? (Math.pow(d5, 1.0d / m2fVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = m2fVar2.b;
                                double d14 = m2fVar2.c;
                                double d15 = m2fVar2.d;
                                return d5 >= m2fVar2.e * d15 ? (Math.pow(d5 - m2fVar2.f, 1.0d / m2fVar2.a) - d14) / d13 : (d5 - m2fVar2.g) / d15;
                        }
                    }
                };
            } else {
                final int i7 = 7;
                si4Var = new si4() { // from class: t3c
                    @Override // defpackage.si4
                    public final double b(double d5) {
                        int i8 = i7;
                        m2f m2fVar2 = m2fVar;
                        switch (i8) {
                            case 0:
                                float[] fArr2 = s82.a;
                                return s82.a(m2fVar2, d5);
                            case 1:
                                float[] fArr3 = s82.a;
                                return s82.c(m2fVar2, d5);
                            case 2:
                                double d6 = m2fVar2.b;
                                return d5 >= m2fVar2.e ? Math.pow((d6 * d5) + m2fVar2.c, m2fVar2.a) : m2fVar2.d * d5;
                            case 3:
                                double d7 = m2fVar2.b;
                                double d8 = m2fVar2.c;
                                double d9 = m2fVar2.d;
                                return d5 >= m2fVar2.e ? Math.pow((d7 * d5) + d8, m2fVar2.a) + m2fVar2.f : (d9 * d5) + m2fVar2.g;
                            case 4:
                                float[] fArr4 = s82.a;
                                return s82.b(m2fVar2, d5);
                            case 5:
                                float[] fArr5 = s82.a;
                                return s82.d(m2fVar2, d5);
                            case 6:
                                double d10 = m2fVar2.b;
                                double d11 = m2fVar2.c;
                                double d12 = m2fVar2.d;
                                return d5 >= m2fVar2.e * d12 ? (Math.pow(d5, 1.0d / m2fVar2.a) - d11) / d10 : d5 / d12;
                            default:
                                double d13 = m2fVar2.b;
                                double d14 = m2fVar2.c;
                                double d15 = m2fVar2.d;
                                return d5 >= m2fVar2.e * d15 ? (Math.pow(d5 - m2fVar2.f, 1.0d / m2fVar2.a) - d14) / d13 : (d5 - m2fVar2.g) / d15;
                        }
                    }
                };
            }
        }
        if (d2 == d) {
            si4Var2 = new si4() { // from class: t3c
                @Override // defpackage.si4
                public final double b(double d5) {
                    int i8 = i2;
                    m2f m2fVar2 = m2fVar;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = s82.a;
                            return s82.a(m2fVar2, d5);
                        case 1:
                            float[] fArr3 = s82.a;
                            return s82.c(m2fVar2, d5);
                        case 2:
                            double d6 = m2fVar2.b;
                            return d5 >= m2fVar2.e ? Math.pow((d6 * d5) + m2fVar2.c, m2fVar2.a) : m2fVar2.d * d5;
                        case 3:
                            double d7 = m2fVar2.b;
                            double d8 = m2fVar2.c;
                            double d9 = m2fVar2.d;
                            return d5 >= m2fVar2.e ? Math.pow((d7 * d5) + d8, m2fVar2.a) + m2fVar2.f : (d9 * d5) + m2fVar2.g;
                        case 4:
                            float[] fArr4 = s82.a;
                            return s82.b(m2fVar2, d5);
                        case 5:
                            float[] fArr5 = s82.a;
                            return s82.d(m2fVar2, d5);
                        case 6:
                            double d10 = m2fVar2.b;
                            double d11 = m2fVar2.c;
                            double d12 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d12 ? (Math.pow(d5, 1.0d / m2fVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = m2fVar2.b;
                            double d14 = m2fVar2.c;
                            double d15 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d15 ? (Math.pow(d5 - m2fVar2.f, 1.0d / m2fVar2.a) - d14) / d13 : (d5 - m2fVar2.g) / d15;
                    }
                }
            };
        } else if (d2 == -2.0d) {
            si4Var2 = new si4() { // from class: t3c
                @Override // defpackage.si4
                public final double b(double d5) {
                    int i8 = i3;
                    m2f m2fVar2 = m2fVar;
                    switch (i8) {
                        case 0:
                            float[] fArr2 = s82.a;
                            return s82.a(m2fVar2, d5);
                        case 1:
                            float[] fArr3 = s82.a;
                            return s82.c(m2fVar2, d5);
                        case 2:
                            double d6 = m2fVar2.b;
                            return d5 >= m2fVar2.e ? Math.pow((d6 * d5) + m2fVar2.c, m2fVar2.a) : m2fVar2.d * d5;
                        case 3:
                            double d7 = m2fVar2.b;
                            double d8 = m2fVar2.c;
                            double d9 = m2fVar2.d;
                            return d5 >= m2fVar2.e ? Math.pow((d7 * d5) + d8, m2fVar2.a) + m2fVar2.f : (d9 * d5) + m2fVar2.g;
                        case 4:
                            float[] fArr4 = s82.a;
                            return s82.b(m2fVar2, d5);
                        case 5:
                            float[] fArr5 = s82.a;
                            return s82.d(m2fVar2, d5);
                        case 6:
                            double d10 = m2fVar2.b;
                            double d11 = m2fVar2.c;
                            double d12 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d12 ? (Math.pow(d5, 1.0d / m2fVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = m2fVar2.b;
                            double d14 = m2fVar2.c;
                            double d15 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d15 ? (Math.pow(d5 - m2fVar2.f, 1.0d / m2fVar2.a) - d14) / d13 : (d5 - m2fVar2.g) / d15;
                    }
                }
            };
        } else if (d4 == 0.0d && d3 == 0.0d) {
            final int i8 = 2;
            si4Var2 = new si4() { // from class: t3c
                @Override // defpackage.si4
                public final double b(double d5) {
                    int i9 = i8;
                    m2f m2fVar2 = m2fVar;
                    switch (i9) {
                        case 0:
                            float[] fArr2 = s82.a;
                            return s82.a(m2fVar2, d5);
                        case 1:
                            float[] fArr3 = s82.a;
                            return s82.c(m2fVar2, d5);
                        case 2:
                            double d6 = m2fVar2.b;
                            return d5 >= m2fVar2.e ? Math.pow((d6 * d5) + m2fVar2.c, m2fVar2.a) : m2fVar2.d * d5;
                        case 3:
                            double d7 = m2fVar2.b;
                            double d8 = m2fVar2.c;
                            double d9 = m2fVar2.d;
                            return d5 >= m2fVar2.e ? Math.pow((d7 * d5) + d8, m2fVar2.a) + m2fVar2.f : (d9 * d5) + m2fVar2.g;
                        case 4:
                            float[] fArr4 = s82.a;
                            return s82.b(m2fVar2, d5);
                        case 5:
                            float[] fArr5 = s82.a;
                            return s82.d(m2fVar2, d5);
                        case 6:
                            double d10 = m2fVar2.b;
                            double d11 = m2fVar2.c;
                            double d12 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d12 ? (Math.pow(d5, 1.0d / m2fVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = m2fVar2.b;
                            double d14 = m2fVar2.c;
                            double d15 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d15 ? (Math.pow(d5 - m2fVar2.f, 1.0d / m2fVar2.a) - d14) / d13 : (d5 - m2fVar2.g) / d15;
                    }
                }
            };
        } else {
            final int i9 = 3;
            si4Var2 = new si4() { // from class: t3c
                @Override // defpackage.si4
                public final double b(double d5) {
                    int i10 = i9;
                    m2f m2fVar2 = m2fVar;
                    switch (i10) {
                        case 0:
                            float[] fArr2 = s82.a;
                            return s82.a(m2fVar2, d5);
                        case 1:
                            float[] fArr3 = s82.a;
                            return s82.c(m2fVar2, d5);
                        case 2:
                            double d6 = m2fVar2.b;
                            return d5 >= m2fVar2.e ? Math.pow((d6 * d5) + m2fVar2.c, m2fVar2.a) : m2fVar2.d * d5;
                        case 3:
                            double d7 = m2fVar2.b;
                            double d8 = m2fVar2.c;
                            double d9 = m2fVar2.d;
                            return d5 >= m2fVar2.e ? Math.pow((d7 * d5) + d8, m2fVar2.a) + m2fVar2.f : (d9 * d5) + m2fVar2.g;
                        case 4:
                            float[] fArr4 = s82.a;
                            return s82.b(m2fVar2, d5);
                        case 5:
                            float[] fArr5 = s82.a;
                            return s82.d(m2fVar2, d5);
                        case 6:
                            double d10 = m2fVar2.b;
                            double d11 = m2fVar2.c;
                            double d12 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d12 ? (Math.pow(d5, 1.0d / m2fVar2.a) - d11) / d10 : d5 / d12;
                        default:
                            double d13 = m2fVar2.b;
                            double d14 = m2fVar2.c;
                            double d15 = m2fVar2.d;
                            return d5 >= m2fVar2.e * d15 ? (Math.pow(d5 - m2fVar2.f, 1.0d / m2fVar2.a) - d14) / d13 : (d5 - m2fVar2.g) / d15;
                    }
                }
            };
        }
        this(str, fArr, y3gVar, null, si4Var, si4Var2, 0.0f, 1.0f, m2fVar, i);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x3c(String str, float[] fArr, y3g y3gVar, final double d, float f, float f2, int i) {
        si4 si4Var;
        si4 si4Var2 = r;
        if (d == 1.0d) {
            si4Var = si4Var2;
        } else {
            final int i2 = 0;
            si4Var = new si4() { // from class: s3c
                @Override // defpackage.si4
                public final double b(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            si4Var2 = new si4() { // from class: s3c
                @Override // defpackage.si4
                public final double b(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        si4 si4Var3 = si4Var2;
        this(str, fArr, y3gVar, null, si4Var, si4Var3, f, f2, new m2f(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
