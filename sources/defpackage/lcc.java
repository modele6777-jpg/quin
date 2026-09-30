package defpackage;

import android.media.MediaCodec;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lcc {
    public final ta0 a;
    public final int b;
    public final d0a c;
    public y21 d;
    public y21 e;
    public y21 f;
    public long g;

    public lcc(ta0 ta0Var) {
        this.a = ta0Var;
        synchronized (ta0Var) {
            k01 k01Var = ((ur3) ta0Var.b).c;
        }
        this.b = 65536;
        this.c = new d0a(32);
        y21 y21Var = new y21(0L, 65536);
        this.d = y21Var;
        this.e = y21Var;
        this.f = y21Var;
    }

    public static y21 c(y21 y21Var, long j, ByteBuffer byteBuffer, int i) {
        while (j >= y21Var.b) {
            y21Var = (y21) y21Var.d;
        }
        while (i > 0) {
            int iMin = Math.min(i, (int) (y21Var.b - j));
            mj mjVar = (mj) y21Var.c;
            byteBuffer.put(mjVar.a, ((int) (j - y21Var.a)) + mjVar.b, iMin);
            i -= iMin;
            j += (long) iMin;
            if (j == y21Var.b) {
                y21Var = (y21) y21Var.d;
            }
        }
        return y21Var;
    }

    public static y21 d(y21 y21Var, long j, byte[] bArr, int i) {
        while (j >= y21Var.b) {
            y21Var = (y21) y21Var.d;
        }
        int i2 = i;
        while (i2 > 0) {
            int iMin = Math.min(i2, (int) (y21Var.b - j));
            mj mjVar = (mj) y21Var.c;
            System.arraycopy(mjVar.a, ((int) (j - y21Var.a)) + mjVar.b, bArr, i - i2, iMin);
            i2 -= iMin;
            j += (long) iMin;
            if (j == y21Var.b) {
                y21Var = (y21) y21Var.d;
            }
        }
        return y21Var;
    }

    public static y21 e(y21 y21Var, tm3 tm3Var, ri1 ri1Var, d0a d0aVar) {
        if (tm3Var.d(1073741824)) {
            long j = ri1Var.b;
            int iG = 1;
            d0aVar.J(1);
            y21 y21VarD = d(y21Var, j, d0aVar.a, 1);
            long j2 = j + 1;
            byte b = d0aVar.a[0];
            boolean z = (b & 128) != 0;
            int i = b & 127;
            n03 n03Var = tm3Var.d;
            byte[] bArr = n03Var.a;
            if (bArr == null) {
                n03Var.a = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            y21Var = d(y21VarD, j2, n03Var.a, i);
            long j3 = j2 + ((long) i);
            if (z) {
                d0aVar.J(2);
                y21Var = d(y21Var, j3, d0aVar.a, 2);
                j3 += 2;
                iG = d0aVar.G();
            }
            int[] iArr = n03Var.d;
            if (iArr == null || iArr.length < iG) {
                iArr = new int[iG];
            }
            int[] iArr2 = n03Var.e;
            if (iArr2 == null || iArr2.length < iG) {
                iArr2 = new int[iG];
            }
            if (z) {
                int i2 = iG * 6;
                d0aVar.J(i2);
                y21Var = d(y21Var, j3, d0aVar.a, i2);
                j3 += (long) i2;
                d0aVar.M(0);
                for (int i3 = 0; i3 < iG; i3++) {
                    iArr[i3] = d0aVar.G();
                    iArr2[i3] = d0aVar.D();
                }
            } else {
                iArr[0] = 0;
                iArr2[0] = ri1Var.a - ((int) (j3 - ri1Var.b));
            }
            j1f j1fVar = (j1f) ri1Var.c;
            String str = pqf.a;
            byte[] bArr2 = j1fVar.b;
            byte[] bArr3 = n03Var.a;
            int i4 = j1fVar.a;
            int i5 = j1fVar.c;
            int i6 = j1fVar.d;
            n03Var.f = iG;
            n03Var.d = iArr;
            n03Var.e = iArr2;
            n03Var.b = bArr2;
            n03Var.a = bArr3;
            n03Var.c = i4;
            n03Var.g = i5;
            n03Var.h = i6;
            MediaCodec.CryptoInfo cryptoInfo = n03Var.i;
            cryptoInfo.numSubSamples = iG;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr2;
            cryptoInfo.iv = bArr3;
            cryptoInfo.mode = i4;
            a90 a90Var = n03Var.j;
            MediaCodec.CryptoInfo.Pattern pattern = (MediaCodec.CryptoInfo.Pattern) a90Var.c;
            pattern.set(i5, i6);
            ((MediaCodec.CryptoInfo) a90Var.b).setPattern(pattern);
            long j4 = ri1Var.b;
            int i7 = (int) (j3 - j4);
            ri1Var.b = j4 + ((long) i7);
            ri1Var.a -= i7;
        }
        if (!tm3Var.d(268435456)) {
            tm3Var.h(ri1Var.a);
            return c(y21Var, ri1Var.b, tm3Var.e, ri1Var.a);
        }
        d0aVar.J(4);
        y21 y21VarD2 = d(y21Var, ri1Var.b, d0aVar.a, 4);
        int iD = d0aVar.D();
        ri1Var.b += 4;
        ri1Var.a -= 4;
        tm3Var.h(iD);
        y21 y21VarC = c(y21VarD2, ri1Var.b, tm3Var.e, iD);
        ri1Var.b += (long) iD;
        int i8 = ri1Var.a - iD;
        ri1Var.a = i8;
        ByteBuffer byteBuffer = tm3Var.v;
        if (byteBuffer == null || byteBuffer.capacity() < i8) {
            tm3Var.v = ByteBuffer.allocate(i8);
        } else {
            tm3Var.v.clear();
        }
        return c(y21VarC, ri1Var.b, tm3Var.v, ri1Var.a);
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0042 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(long r7) {
        /*
            r6 = this;
            r0 = -1
            int r0 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r0 != 0) goto L7
            goto L55
        L7:
            y21 r0 = r6.d
            long r1 = r0.b
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 < 0) goto L49
            ta0 r1 = r6.a
            java.lang.Object r0 = r0.c
            mj r0 = (defpackage.mj) r0
            monitor-enter(r1)
            java.lang.Object r2 = r1.b     // Catch: java.lang.Throwable -> L42
            ur3 r2 = (defpackage.ur3) r2     // Catch: java.lang.Throwable -> L42
            k01 r2 = r2.c     // Catch: java.lang.Throwable -> L42
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L42
            java.lang.Object r3 = r2.d     // Catch: java.lang.Throwable -> L44
            mj[] r3 = (defpackage.mj[]) r3     // Catch: java.lang.Throwable -> L44
            int r4 = r2.c     // Catch: java.lang.Throwable -> L44
            int r5 = r4 + 1
            r2.c = r5     // Catch: java.lang.Throwable -> L44
            r3[r4] = r0     // Catch: java.lang.Throwable -> L44
            int r3 = r2.b     // Catch: java.lang.Throwable -> L44
            int r3 = r3 + (-1)
            r2.b = r3     // Catch: java.lang.Throwable -> L44
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L42
            r1.L(r0)     // Catch: java.lang.Throwable -> L42
            monitor-exit(r1)
            y21 r0 = r6.d
            r1 = 0
            r0.c = r1
            java.lang.Object r2 = r0.d
            y21 r2 = (defpackage.y21) r2
            r0.d = r1
            r6.d = r2
            goto L7
        L42:
            r6 = move-exception
            goto L47
        L44:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L44
            throw r6     // Catch: java.lang.Throwable -> L42
        L47:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L42
            throw r6
        L49:
            y21 r7 = r6.e
            long r7 = r7.a
            long r1 = r0.a
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L55
            r6.e = r0
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lcc.a(long):void");
    }

    public final int b(int i) {
        mj mjVarA;
        y21 y21Var = this.f;
        if (((mj) y21Var.c) == null) {
            ta0 ta0Var = this.a;
            synchronized (ta0Var) {
                mjVarA = ((ur3) ta0Var.b).c.a();
                ((HashMap) ta0Var.c).put(mjVarA, (uha) ta0Var.d);
                tr3 tr3Var = (tr3) ((ur3) ta0Var.b).n.get((uha) ta0Var.d);
                if (tr3Var != null) {
                    synchronized (tr3Var) {
                        tr3Var.d++;
                    }
                }
            }
            y21 y21Var2 = new y21(this.f.b, this.b);
            y21Var.c = mjVarA;
            y21Var.d = y21Var2;
        }
        return Math.min(i, (int) (this.f.b - this.g));
    }
}
