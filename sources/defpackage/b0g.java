package defpackage;

import android.util.Pair;
import com.adjust.sdk.sig.r3;
import java.nio.ByteOrder;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b0g implements l95 {
    public n95 a;
    public k1f b;
    public zzf e;
    public int c = 0;
    public long d = -1;
    public int f = -1;
    public long g = -1;

    @Override // defpackage.l95
    public final boolean b(m95 m95Var) {
        return kn2.B(m95Var);
    }

    @Override // defpackage.l95
    public final void c(long j, long j2) {
        this.c = j == 0 ? 0 : 4;
        zzf zzfVar = this.e;
        if (zzfVar != null) {
            zzfVar.a(j2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:67:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:70:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:74:0x0206  */
    /* JADX WARN: Code duplicated, block: B:75:0x0208 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x020c  */
    /* JADX WARN: Code duplicated, block: B:78:0x020f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0218  */
    /* JADX WARN: Code duplicated, block: B:82:0x0221  */
    /* JADX WARN: Code duplicated, block: B:85:0x0237  */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x0237, please report this as an issue */
    @Override // defpackage.l95
    public final int e(m95 m95Var, d82 d82Var) throws l0a {
        byte[] bArr;
        int i;
        int i2;
        byte[] bArr2;
        c0g c0gVar;
        int iW;
        int i3;
        this.b.getClass();
        String str = pqf.a;
        int i4 = this.c;
        if (i4 == 0) {
            pa7.J(m95Var.getPosition() == 0);
            int i5 = this.f;
            if (i5 != -1) {
                m95Var.l(i5);
                this.c = 4;
                return 0;
            }
            if (!kn2.B(m95Var)) {
                throw l0a.a(null, "Unsupported or unrecognized wav file type.");
            }
            m95Var.l((int) (m95Var.e() - m95Var.getPosition()));
            this.c = 1;
            return 0;
        }
        long jP = -1;
        if (i4 == 1) {
            d0a d0aVar = new d0a(8);
            a67 a67VarC = a67.c(m95Var, d0aVar);
            if (a67VarC.a != 1685272116) {
                m95Var.k();
            } else {
                m95Var.f(8);
                d0aVar.M(0);
                m95Var.o(d0aVar.a, 0, 8);
                jP = d0aVar.p();
                m95Var.l(((int) a67VarC.b) + 8);
            }
            this.d = jP;
            this.c = 2;
            return 0;
        }
        if (i4 != 2) {
            if (i4 != 3) {
                if (i4 != 4) {
                    r3.l();
                    return 0;
                }
                pa7.J(this.g != -1);
                long position = this.g - m95Var.getPosition();
                zzf zzfVar = this.e;
                zzfVar.getClass();
                return zzfVar.b(m95Var, position) ? -1 : 0;
            }
            m95Var.k();
            a67 a67VarX = kn2.X(1684108385, m95Var, new d0a(8));
            m95Var.l(8);
            Pair pairCreate = Pair.create(Long.valueOf(m95Var.getPosition()), Long.valueOf(a67VarX.b));
            this.f = ((Long) pairCreate.first).intValue();
            long jLongValue = ((Long) pairCreate.second).longValue();
            long j = this.d;
            if (j != -1 && jLongValue == 4294967295L) {
                jLongValue = j;
            }
            this.g = ((long) this.f) + jLongValue;
            long length = m95Var.getLength();
            if (length != -1 && this.g > length) {
                xo1.V("WavExtractor", "Data exceeds input length: " + this.g + ", " + length);
                this.g = length;
            }
            zzf zzfVar2 = this.e;
            zzfVar2.getClass();
            zzfVar2.c(this.f, this.g);
            this.c = 4;
            return 0;
        }
        d0a d0aVar2 = new d0a(16);
        long j2 = kn2.X(1718449184, m95Var, d0aVar2).b;
        pa7.J(j2 >= 16);
        m95Var.o(d0aVar2.a, 0, 16);
        d0aVar2.M(0);
        int iS = d0aVar2.s();
        int iS2 = d0aVar2.s();
        int iR = d0aVar2.r();
        d0aVar2.r();
        int iS3 = d0aVar2.s();
        int iS4 = d0aVar2.s();
        int i6 = ((int) j2) - 16;
        if (i6 > 0) {
            bArr = new byte[i6];
            m95Var.o(bArr, 0, i6);
            if (iS == 65534 && i6 == 24) {
                d0a d0aVar3 = new d0a(bArr);
                d0aVar3.s();
                int iS5 = d0aVar3.s();
                if (iS5 != 0 && iS5 != iS4) {
                    throw l0a.b("validBits ( " + iS5 + ")  != bitsPerSample( " + iS4 + ") are not supported");
                }
                int iR2 = d0aVar3.r();
                if ((iR2 >> 18) != 0 || (iR2 != 0 && Integer.bitCount(iR2) != iS2)) {
                    throw l0a.b("Channel mask " + iR2 + " is invalid or does not match channel count " + iS2);
                }
                int iS6 = d0aVar3.s();
                byte[] bArr3 = new byte[14];
                d0aVar3.k(bArr3, 0, 14);
                if (!Arrays.equals(bArr3, kn2.Y) && !Arrays.equals(bArr3, kn2.Z)) {
                    throw l0a.b("invalid wav format extension guid");
                }
                i2 = iR2;
                bArr2 = bArr;
                i = iS6;
            }
            m95Var.l((int) (m95Var.e() - m95Var.getPosition()));
            c0gVar = new c0g(i, iS2, iR, iS3, iS4, bArr2, i2);
            if (i == 17) {
                this.e = new yzf(this.a, this.b, c0gVar);
            } else if (i == 6) {
                this.e = new a0g(this.a, this.b, c0gVar, "audio/g711-alaw", -1);
            } else if (i == 7) {
                this.e = new a0g(this.a, this.b, c0gVar, "audio/g711-mlaw", -1);
            } else {
                if (i == 1) {
                    iW = pqf.w(iS4, ByteOrder.LITTLE_ENDIAN);
                    i3 = iW;
                } else if (i != 3) {
                    iW = pqf.u(iS4, ByteOrder.LITTLE_ENDIAN);
                    i3 = iW;
                } else if (i != 65534) {
                    i3 = 0;
                } else {
                    iW = pqf.w(iS4, ByteOrder.LITTLE_ENDIAN);
                    i3 = iW;
                }
                if (i3 != 0) {
                    throw l0a.b("Unsupported WAV format type: " + i);
                }
                this.e = new a0g(this.a, this.b, c0gVar, "audio/raw", i3);
            }
            this.c = 3;
            return 0;
        }
        bArr = pqf.b;
        i = iS;
        i2 = 0;
        bArr2 = bArr;
        m95Var.l((int) (m95Var.e() - m95Var.getPosition()));
        c0gVar = new c0g(i, iS2, iR, iS3, iS4, bArr2, i2);
        if (i == 17) {
            this.e = new yzf(this.a, this.b, c0gVar);
        } else if (i == 6) {
            this.e = new a0g(this.a, this.b, c0gVar, "audio/g711-alaw", -1);
        } else if (i == 7) {
            this.e = new a0g(this.a, this.b, c0gVar, "audio/g711-mlaw", -1);
        } else {
            if (i == 1) {
                iW = pqf.w(iS4, ByteOrder.LITTLE_ENDIAN);
                i3 = iW;
            } else if (i != 3) {
                iW = pqf.u(iS4, ByteOrder.LITTLE_ENDIAN);
                i3 = iW;
            } else if (i != 65534) {
                i3 = 0;
            } else {
                iW = pqf.w(iS4, ByteOrder.LITTLE_ENDIAN);
                i3 = iW;
            }
            if (i3 != 0) {
                throw l0a.b("Unsupported WAV format type: " + i);
            }
            this.e = new a0g(this.a, this.b, c0gVar, "audio/raw", i3);
        }
        this.c = 3;
        return 0;
    }

    @Override // defpackage.l95
    public final void f(n95 n95Var) {
        this.a = n95Var;
        this.b = n95Var.n(0, 1);
        n95Var.j();
    }

    @Override // defpackage.l95
    public final void a() {
    }
}
