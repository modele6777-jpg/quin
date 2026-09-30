package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Pair;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wo8 extends hu0 {
    public static final byte[] T1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public boolean A1;
    public boolean B1;
    public long C1;
    public long D1;
    public boolean E1;
    public boolean F1;
    public boolean G1;
    public boolean H1;
    public final Context I0;
    public g45 I1;
    public final oo8 J0;
    public qm3 J1;
    public final tm3 K0;
    public vo8 K1;
    public final tm3 L0;
    public long L1;
    public final tm3 M0;
    public boolean M1;
    public final sw0 N0;
    public boolean N1;
    public final MediaCodec.BufferInfo O0;
    public boolean O1;
    public final ArrayDeque P0;
    public long P1;
    public final yl9 Q0;
    public b72 Q1;
    public final AtomicInteger R0;
    public b72 R1;
    public rr5 S0;
    public ry6 S1;
    public rr5 T0;
    public ssg U0;
    public ssg V0;
    public b55 W0;
    public MediaCrypto X0;
    public float Y0;
    public float Z0;
    public po8 a1;
    public rr5 b1;
    public MediaFormat c1;
    public boolean d1;
    public float e1;
    public ArrayDeque f1;
    public uo8 g1;
    public to8 h1;
    public boolean i1;
    public boolean j1;
    public boolean k1;
    public boolean l1;
    public long m1;
    public boolean n1;
    public long o1;
    public int p1;
    public int q1;
    public ByteBuffer r1;
    public boolean s1;
    public boolean t1;
    public boolean u1;
    public boolean v1;
    public int w1;
    public int x1;
    public int y1;
    public boolean z1;

    public wo8(Context context, int i, oo8 oo8Var) {
        super(i);
        this.I0 = context.getApplicationContext();
        this.J0 = oo8Var;
        this.R0 = new AtomicInteger();
        this.K0 = new tm3(0);
        this.L0 = new tm3(0);
        this.M0 = new tm3(2);
        sw0 sw0Var = new sw0(2);
        sw0Var.z = 32;
        this.N0 = sw0Var;
        this.O0 = new MediaCodec.BufferInfo();
        this.Y0 = 1.0f;
        this.Z0 = 1.0f;
        this.P0 = new ArrayDeque();
        this.K1 = vo8.i;
        sw0Var.h(0);
        sw0Var.e.order(ByteOrder.nativeOrder());
        yl9 yl9Var = new yl9(0);
        yl9Var.d = ak0.a;
        yl9Var.c = 0;
        yl9Var.b = 2;
        this.Q0 = yl9Var;
        this.e1 = -1.0f;
        this.w1 = 0;
        this.p1 = -1;
        this.q1 = -1;
        this.o1 = -9223372036854775807L;
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        this.L1 = -9223372036854775807L;
        this.m1 = -9223372036854775807L;
        this.x1 = 0;
        this.y1 = 0;
        this.J1 = new qm3();
        this.O1 = false;
        this.P1 = 0L;
        int i2 = ry6.c;
        this.S1 = fpb.x;
        b72 b72Var = b72.b;
        this.Q1 = b72Var;
        this.R1 = b72Var;
    }

    public boolean A0() {
        int i = this.y1;
        if (i == 3 || (this.i1 && !this.B1)) {
            return true;
        }
        if (i != 2) {
            return false;
        }
        try {
            E0();
            return false;
        } catch (g45 e) {
            xo1.W("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
            return true;
        }
    }

    public boolean B0(rr5 rr5Var) {
        return false;
    }

    @Override // defpackage.hu0
    public void C(float f, float f2) {
        this.Y0 = f;
        this.Z0 = f2;
        D0(this.b1);
    }

    public abstract int C0(rr5 rr5Var);

    @Override // defpackage.hu0
    public final int D(rr5 rr5Var) throws g45 {
        try {
            return C0(rr5Var);
        } catch (yo8 e) {
            throw g(e, rr5Var, false, 4002);
        }
    }

    public final void D0(rr5 rr5Var) {
        if (this.a1 == null || this.y1 == 3 || this.v == 0) {
            return;
        }
        float f = this.Z0;
        rr5Var.getClass();
        rr5[] rr5VarArr = this.x;
        rr5VarArr.getClass();
        float fS = S(f, rr5Var, rr5VarArr);
        float f2 = this.e1;
        if (f2 == fS || fS == -1.0f) {
            return;
        }
        if (f2 != -1.0f || fS > 0.0f) {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", fS);
            po8 po8Var = this.a1;
            po8Var.getClass();
            po8Var.b(bundle);
            this.e1 = fS;
        }
    }

    @Override // defpackage.hu0
    public final int E() {
        return 8;
    }

    public final void E0() {
        ssg ssgVar = this.V0;
        ssgVar.getClass();
        ssgVar.F();
        v0(this.V0);
        this.x1 = 0;
        this.y1 = 0;
    }

    public final void F0(long j) {
        rr5 rr5Var = (rr5) this.K1.d.X(j);
        if (rr5Var == null && this.M1 && this.c1 != null) {
            rr5Var = (rr5) this.K1.d.W();
        }
        if (rr5Var != null) {
            this.T0 = rr5Var;
        } else if (!this.d1 || (rr5Var = this.T0) == null) {
            return;
        }
        i0(rr5Var, this.c1);
        this.d1 = false;
        this.M1 = false;
    }

    public final void H(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.Q1.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x02f0  */
    public final boolean I(long j, long j2) {
        sw0 sw0Var;
        int length;
        ByteBuffer byteBuffer;
        pa7.J(!this.F1);
        sw0 sw0Var2 = this.N0;
        if (sw0Var2.m()) {
            ByteBuffer byteBuffer2 = sw0Var2.e;
            int i = this.q1;
            int i2 = sw0Var2.y;
            long j3 = sw0Var2.g;
            boolean Z = Z(this.z, sw0Var2.x);
            boolean zD = sw0Var2.d(4);
            rr5 rr5Var = this.T0;
            rr5Var.getClass();
            sw0Var = sw0Var2;
            if (!o0(j, j2, null, byteBuffer2, i, 0, i2, j3, Z, zD, rr5Var)) {
                return false;
            }
            k0(sw0Var.x);
            sw0Var.e();
        } else {
            sw0Var = sw0Var2;
        }
        if (this.E1) {
            this.F1 = true;
            return false;
        }
        boolean z = this.t1;
        tm3 tm3Var = this.M0;
        if (z) {
            pa7.J(sw0Var.k(tm3Var));
            this.t1 = false;
        }
        if (this.u1) {
            if (sw0Var.m()) {
                return true;
            }
            this.s1 = false;
            s0();
            this.u1 = false;
            a0();
            if (!this.s1) {
                return false;
            }
        }
        pa7.J(!this.E1);
        fz3 fz3Var = this.c;
        fz3Var.l();
        tm3Var.e();
        while (true) {
            tm3Var.e();
            int iY = y(fz3Var, tm3Var, 0);
            if (iY == -5) {
                h0(fz3Var);
                break;
            }
            if (iY != -4) {
                if (iY != -3) {
                    r3.l();
                    return false;
                }
                if (!l()) {
                    break;
                }
                V().h = this.C1;
                break;
            }
            if (tm3Var.d(4)) {
                this.E1 = true;
                V().h = this.C1;
                break;
            }
            this.C1 = Math.max(this.C1, tm3Var.g);
            if (l() || this.L0.d(536870912)) {
                V().h = this.C1;
            }
            byte[] bArr = null;
            if (this.G1) {
                rr5 rr5Var2 = this.S0;
                rr5Var2.getClass();
                this.T0 = rr5Var2;
                if (Objects.equals(rr5Var2.p, "audio/opus") && !this.T0.s.isEmpty()) {
                    byte[] bArr2 = (byte[]) this.T0.s.get(0);
                    int i3 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                    qr5 qr5VarA = this.T0.a();
                    qr5VarA.M = i3;
                    this.T0 = new rr5(qr5VarA);
                }
                i0(this.T0, null);
                this.G1 = false;
            }
            tm3Var.i();
            rr5 rr5Var3 = this.T0;
            if (rr5Var3 == null || !Objects.equals(rr5Var3.p, "audio/opus")) {
                sw0Var = sw0Var;
            } else {
                if (tm3Var.d(268435456)) {
                    tm3Var.c = this.T0;
                    X(tm3Var);
                }
                if (this.z - tm3Var.g <= 80000) {
                    List list = this.T0.s;
                    tm3Var.e.getClass();
                    if (tm3Var.e.limit() - tm3Var.e.position() == 0) {
                        sw0Var = sw0Var;
                    } else {
                        yl9 yl9Var = this.Q0;
                        if (yl9Var.b == 2 && (list.size() == 1 || list.size() == 3)) {
                            bArr = (byte[]) list.get(0);
                        }
                        ByteBuffer byteBuffer3 = tm3Var.e;
                        int iPosition = byteBuffer3.position();
                        int iLimit = byteBuffer3.limit();
                        int i4 = iLimit - iPosition;
                        int i5 = (i4 + 255) / 255;
                        int i6 = i5 + 27 + i4;
                        if (yl9Var.b == 2) {
                            length = bArr != null ? bArr.length + 28 : 47;
                            i6 = length + 44 + i6;
                        } else {
                            length = 0;
                        }
                        if (((ByteBuffer) yl9Var.d).capacity() < i6) {
                            yl9Var.d = ByteBuffer.allocate(i6).order(ByteOrder.LITTLE_ENDIAN);
                        } else {
                            ((ByteBuffer) yl9Var.d).clear();
                        }
                        ByteBuffer byteBuffer4 = (ByteBuffer) yl9Var.d;
                        if (yl9Var.b == 2) {
                            if (bArr != null) {
                                yl9.y(byteBuffer4, 0L, 0, 1, true);
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(ndc.a(bArr.length));
                                byteBuffer.put(bArr);
                                byteBuffer.putInt(22, pqf.m(byteBuffer.arrayOffset(), byteBuffer.array(), bArr.length + 28, 0));
                                byteBuffer.position(bArr.length + 28);
                            } else {
                                byteBuffer = byteBuffer4;
                                byteBuffer.put(yl9.e);
                            }
                            byteBuffer.put(yl9.f);
                        } else {
                            sw0Var = sw0Var;
                            byteBuffer = byteBuffer4;
                        }
                        int iY2 = yl9Var.c + ((int) ((vd0.Y(byteBuffer3.get(0), byteBuffer3.limit() > 1 ? byteBuffer3.get(1) : (byte) 0) * 48000) / 1000000));
                        yl9Var.c = iY2;
                        yl9.y(byteBuffer, iY2, yl9Var.b, i5, false);
                        for (int i7 = 0; i7 < i5; i7++) {
                            if (i4 >= 255) {
                                byteBuffer.put((byte) -1);
                                i4 -= 255;
                            } else {
                                byteBuffer.put((byte) i4);
                                i4 = 0;
                            }
                        }
                        while (iPosition < iLimit) {
                            byteBuffer.put(byteBuffer3.get(iPosition));
                            iPosition++;
                        }
                        byteBuffer3.position(byteBuffer3.limit());
                        byteBuffer.flip();
                        if (yl9Var.b == 2) {
                            byteBuffer.putInt(length + 66, pqf.m(byteBuffer.arrayOffset() + length + 44, byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), 0));
                        } else {
                            byteBuffer.putInt(22, pqf.m(byteBuffer.arrayOffset(), byteBuffer.array(), byteBuffer.limit() - byteBuffer.position(), 0));
                        }
                        yl9Var.b++;
                        yl9Var.d = byteBuffer;
                        tm3Var.e();
                        tm3Var.h(((ByteBuffer) yl9Var.d).remaining());
                        tm3Var.e.put((ByteBuffer) yl9Var.d);
                        tm3Var.i();
                    }
                } else {
                    sw0Var = sw0Var;
                }
            }
            if (sw0Var.m()) {
                long j4 = this.z;
                sw0Var = sw0Var;
                if (Z(j4, sw0Var.x) == Z(j4, tm3Var.g)) {
                }
                this.t1 = true;
                break;
            }
            sw0Var = sw0Var;
            if (!sw0Var.k(tm3Var)) {
                this.t1 = true;
                break;
            }
        }
        if (sw0Var.m()) {
            sw0Var.i();
        }
        return sw0Var.m() || this.E1 || this.u1;
    }

    public abstract vm3 J(to8 to8Var, rr5 rr5Var, rr5 rr5Var2, boolean z);

    public so8 K(IllegalStateException illegalStateException, to8 to8Var) {
        return new so8(illegalStateException, to8Var);
    }

    public final boolean L() {
        if (!this.z1) {
            E0();
            return true;
        }
        this.x1 = 1;
        if (A0()) {
            this.y1 = 3;
            return false;
        }
        this.y1 = 2;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00e0  */
    public final boolean M(long j, long j2) {
        boolean z;
        po8 po8Var = this.a1;
        po8Var.getClass();
        int i = this.q1;
        MediaCodec.BufferInfo bufferInfo = this.O0;
        if (i < 0) {
            int iL = po8Var.l(bufferInfo);
            if (iL < 0) {
                if (iL != -2) {
                    if (this.l1 && (this.E1 || this.x1 == 2)) {
                        n0();
                    }
                    long j3 = this.m1;
                    if (j3 != -9223372036854775807L) {
                        long j4 = j3 + 100;
                        this.g.getClass();
                        if (j4 < System.currentTimeMillis()) {
                            n0();
                            return false;
                        }
                    }
                    return false;
                }
                this.B1 = true;
                po8 po8Var2 = this.a1;
                po8Var2.getClass();
                MediaFormat mediaFormatH = po8Var2.h();
                if (Build.VERSION.SDK_INT >= 29 && !this.S1.isEmpty()) {
                    b72 b72Var = new b72((HashMap) b72.a(mediaFormatH, this.S1).b);
                    if (!b72Var.equals(this.R1)) {
                        this.R1 = b72Var;
                        f0(b72Var);
                    }
                }
                this.c1 = mediaFormatH;
                this.d1 = true;
                return true;
            }
            bufferInfo.presentationTimeUs -= this.P1;
            if (this.k1) {
                this.k1 = false;
                po8Var.f(iL);
                return true;
            }
            if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                n0();
                return false;
            }
            this.q1 = iL;
            ByteBuffer byteBufferP = po8Var.p(iL);
            this.r1 = byteBufferP;
            if (byteBufferP != null) {
                byteBufferP.position(bufferInfo.offset);
                this.r1.limit(bufferInfo.offset + bufferInfo.size);
            }
            F0(bufferInfo.presentationTimeUs);
        }
        vo8 vo8Var = this.K1;
        vo8 vo8Var2 = vo8.i;
        if ((vo8Var.f & 1) != 0) {
            long j5 = vo8Var.e;
            if (j5 == -9223372036854775807L || bufferInfo.presentationTimeUs - vo8Var.c < j5) {
                z = false;
            } else {
                z = true;
            }
        } else {
            z = false;
        }
        boolean z2 = this.O1 || bufferInfo.presentationTimeUs < this.z || z;
        long j6 = vo8Var.h;
        boolean z3 = (j6 == -9223372036854775807L || j6 > bufferInfo.presentationTimeUs || z) ? false : true;
        ByteBuffer byteBuffer = this.r1;
        int i2 = this.q1;
        int i3 = bufferInfo.flags;
        long j7 = bufferInfo.presentationTimeUs;
        rr5 rr5Var = this.T0;
        rr5Var.getClass();
        if (!o0(j, j2, po8Var, byteBuffer, i2, i3, 1, j7, z2, z3, rr5Var)) {
            return false;
        }
        k0(bufferInfo.presentationTimeUs);
        boolean z4 = (bufferInfo.flags & 4) != 0;
        if (!z4 && this.A1 && z3) {
            this.g.getClass();
            this.m1 = System.currentTimeMillis();
        }
        this.q1 = -1;
        this.r1 = null;
        if (!z4) {
            return true;
        }
        n0();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:106:0x01da  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:111:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:120:0x0217  */
    /* JADX WARN: Code duplicated, block: B:121:0x021f  */
    /* JADX WARN: Code duplicated, block: B:130:0x00a4 A[EDGE_INSN: B:130:0x00a4->B:33:0x00a4 BREAK  A[LOOP:0: B:30:0x0082->B:32:0x008f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0045  */
    /* JADX WARN: Code duplicated, block: B:20:0x004a  */
    /* JADX WARN: Code duplicated, block: B:23:0x005c  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:32:0x008f A[LOOP:0: B:30:0x0082->B:32:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:43:0x00df  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:57:0x010a  */
    /* JADX WARN: Code duplicated, block: B:58:0x010d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0120  */
    /* JADX WARN: Code duplicated, block: B:66:0x0124  */
    /* JADX WARN: Code duplicated, block: B:69:0x012a  */
    /* JADX WARN: Code duplicated, block: B:71:0x013a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0155  */
    /* JADX WARN: Code duplicated, block: B:82:0x015e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0166 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:92:0x017e  */
    /* JADX WARN: Code duplicated, block: B:95:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b2  */
    public final boolean N() {
        int iPosition;
        fz3 fz3Var;
        int i;
        long j;
        boolean zD;
        long j2;
        boolean z;
        vo8 vo8VarV;
        long j3;
        int iR;
        long j4;
        int i2;
        long j5;
        int[] iArr;
        vo8 vo8VarV2;
        long j6;
        vo8 vo8VarV3;
        long j7;
        int i3;
        rr5 rr5Var;
        tm3 tm3Var = this.L0;
        n03 n03Var = tm3Var.d;
        vo8 vo8VarV4 = V();
        occ occVar = this.w;
        occVar.getClass();
        vo8VarV4.f = occVar.b();
        po8 po8Var = this.a1;
        if (po8Var != null && this.x1 != 2 && !this.E1) {
            if (this.p1 < 0) {
                int iK = po8Var.k();
                this.p1 = iK;
                if (iK >= 0) {
                    tm3Var.e = po8Var.n(iK);
                    tm3Var.e();
                    if (this.x1 == 1) {
                        if (!this.l1) {
                            this.A1 = true;
                            po8Var.e(this.p1, 0, 4, 0L);
                            this.p1 = -1;
                            tm3Var.e = null;
                        }
                        this.x1 = 2;
                        return false;
                    }
                    if (this.j1) {
                        this.j1 = false;
                        ByteBuffer byteBuffer = tm3Var.e;
                        byteBuffer.getClass();
                        byteBuffer.put(T1);
                        po8Var.e(this.p1, 38, 0, 0L);
                        this.p1 = -1;
                        tm3Var.e = null;
                        this.z1 = true;
                        return true;
                    }
                    if (this.w1 == 1) {
                        i3 = 0;
                        while (true) {
                            rr5Var = this.b1;
                            rr5Var.getClass();
                            if (i3 < rr5Var.s.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.b1.s.get(i3);
                            ByteBuffer byteBuffer2 = tm3Var.e;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i3++;
                        }
                        this.w1 = 2;
                    }
                    ByteBuffer byteBuffer3 = tm3Var.e;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    fz3Var = this.c;
                    fz3Var.l();
                    try {
                        po8Var.g(new ny2(23, this, fz3Var));
                        i = this.R0.get();
                        if (i == -3) {
                            if (l()) {
                                vo8 vo8VarV5 = V();
                                vo8VarV3 = V();
                                vo8 vo8Var = vo8.i;
                                if ((vo8VarV3.f & 1) != 0) {
                                    j7 = this.D1;
                                } else {
                                    j7 = this.C1;
                                }
                                vo8VarV5.h = j7;
                                return false;
                            }
                        } else {
                            if (i == -5) {
                                if (this.w1 == 2) {
                                    tm3Var.e();
                                    this.w1 = 1;
                                }
                                h0(fz3Var);
                                return true;
                            }
                            if (tm3Var.d(4)) {
                                if (!this.z1 || tm3Var.d(1)) {
                                    j = tm3Var.g;
                                    if (!x0(tm3Var)) {
                                        zD = tm3Var.d(1073741824);
                                        if (zD && iPosition != 0) {
                                            iArr = n03Var.d;
                                            if (iArr == null) {
                                                iArr = new int[1];
                                                n03Var.d = iArr;
                                                n03Var.i.numBytesOfClearData = iArr;
                                            }
                                            iArr[0] = iArr[0] + iPosition;
                                        }
                                        if (this.G1) {
                                            vo8 vo8VarV6 = V();
                                            p90 p90Var = vo8VarV6.d;
                                            rr5 rr5Var2 = this.S0;
                                            rr5Var2.getClass();
                                            p90Var.f(j, rr5Var2);
                                            vo8VarV6.g = true;
                                            this.G1 = false;
                                        }
                                        this.C1 = Math.max(this.C1, j);
                                        j2 = this.G0;
                                        if (j2 != -9223372036854775807L) {
                                            z = true;
                                            if (j - V().c < j2) {
                                            }
                                            if (l() || tm3Var.d(536870912)) {
                                                vo8 vo8VarV7 = V();
                                                vo8VarV = V();
                                                vo8 vo8Var2 = vo8.i;
                                                if ((vo8VarV.f & 1) != 0) {
                                                    j3 = this.D1;
                                                } else {
                                                    j3 = this.C1;
                                                }
                                                vo8VarV7.h = j3;
                                            }
                                            tm3Var.i();
                                            if (tm3Var.d(268435456)) {
                                                X(tm3Var);
                                            }
                                            if (this.O1) {
                                                j5 = this.C1;
                                                if (j <= j5) {
                                                    this.P1 = (j5 - j) + 1 + this.P1;
                                                }
                                                this.C1 = j;
                                                this.D1 = j;
                                                this.O1 = false;
                                            }
                                            m0(tm3Var);
                                            iR = R(tm3Var);
                                            j4 = this.P1 + j;
                                            i2 = this.p1;
                                            if (zD) {
                                                po8Var.d(i2, n03Var, j4, iR);
                                            } else {
                                                ByteBuffer byteBuffer4 = tm3Var.e;
                                                byteBuffer4.getClass();
                                                po8Var.e(i2, byteBuffer4.limit(), iR, j4);
                                            }
                                            this.p1 = -1;
                                            tm3Var.e = null;
                                            boolean z2 = z;
                                            this.z1 = z2;
                                            this.w1 = 0;
                                            this.J1.c += z2 ? 1 : 0;
                                            return z2;
                                        }
                                        z = true;
                                        this.D1 = Math.max(this.D1, j);
                                        if (l()) {
                                            vo8 vo8VarV8 = V();
                                            vo8VarV = V();
                                            vo8 vo8Var3 = vo8.i;
                                            if ((vo8VarV.f & 1) != 0) {
                                                j3 = this.D1;
                                            } else {
                                                j3 = this.C1;
                                            }
                                            vo8VarV8.h = j3;
                                        } else {
                                            vo8 vo8VarV9 = V();
                                            vo8VarV = V();
                                            vo8 vo8Var4 = vo8.i;
                                            if ((vo8VarV.f & 1) != 0) {
                                                j3 = this.D1;
                                            } else {
                                                j3 = this.C1;
                                            }
                                            vo8VarV9.h = j3;
                                        }
                                        tm3Var.i();
                                        if (tm3Var.d(268435456)) {
                                            X(tm3Var);
                                        }
                                        if (this.O1) {
                                            j5 = this.C1;
                                            if (j <= j5) {
                                                this.P1 = (j5 - j) + 1 + this.P1;
                                            }
                                            this.C1 = j;
                                            this.D1 = j;
                                            this.O1 = false;
                                        }
                                        m0(tm3Var);
                                        iR = R(tm3Var);
                                        j4 = this.P1 + j;
                                        i2 = this.p1;
                                        if (zD) {
                                            po8Var.d(i2, n03Var, j4, iR);
                                        } else {
                                            ByteBuffer byteBuffer5 = tm3Var.e;
                                            byteBuffer5.getClass();
                                            po8Var.e(i2, byteBuffer5.limit(), iR, j4);
                                        }
                                        this.p1 = -1;
                                        tm3Var.e = null;
                                        boolean z3 = z;
                                        this.z1 = z3;
                                        this.w1 = 0;
                                        this.J1.c += z3 ? 1 : 0;
                                        return z3;
                                    }
                                } else {
                                    tm3Var.e();
                                    this.J1.d++;
                                    if (this.w1 == 2) {
                                        this.w1 = 1;
                                        return true;
                                    }
                                }
                                return true;
                            }
                            vo8 vo8VarV10 = V();
                            vo8VarV2 = V();
                            vo8 vo8Var5 = vo8.i;
                            if ((vo8VarV2.f & 1) != 0) {
                                j6 = this.D1;
                            } else {
                                j6 = this.C1;
                            }
                            vo8VarV10.h = j6;
                            if (this.w1 == 2) {
                                tm3Var.e();
                                this.w1 = 1;
                            }
                            this.E1 = true;
                            if (!this.z1) {
                                n0();
                                return false;
                            }
                            if (!this.l1) {
                                this.A1 = true;
                                po8Var.e(this.p1, 0, 4, 0L);
                                this.p1 = -1;
                                tm3Var.e = null;
                                return false;
                            }
                        }
                    } catch (sm3 e) {
                        d0(e);
                        p0(0);
                        O();
                        return true;
                    }
                }
            } else {
                if (this.x1 == 1) {
                    if (!this.l1) {
                        this.A1 = true;
                        po8Var.e(this.p1, 0, 4, 0L);
                        this.p1 = -1;
                        tm3Var.e = null;
                    }
                    this.x1 = 2;
                    return false;
                }
                if (this.j1) {
                    this.j1 = false;
                    ByteBuffer byteBuffer6 = tm3Var.e;
                    byteBuffer6.getClass();
                    byteBuffer6.put(T1);
                    po8Var.e(this.p1, 38, 0, 0L);
                    this.p1 = -1;
                    tm3Var.e = null;
                    this.z1 = true;
                    return true;
                }
                if (this.w1 == 1) {
                    i3 = 0;
                    while (true) {
                        rr5Var = this.b1;
                        rr5Var.getClass();
                        if (i3 < rr5Var.s.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.b1.s.get(i3);
                        ByteBuffer byteBuffer7 = tm3Var.e;
                        byteBuffer7.getClass();
                        byteBuffer7.put(bArr2);
                        i3++;
                    }
                    this.w1 = 2;
                }
                ByteBuffer byteBuffer8 = tm3Var.e;
                byteBuffer8.getClass();
                iPosition = byteBuffer8.position();
                fz3Var = this.c;
                fz3Var.l();
                po8Var.g(new ny2(23, this, fz3Var));
                i = this.R0.get();
                if (i == -3) {
                    if (l()) {
                        vo8 vo8VarV11 = V();
                        vo8VarV3 = V();
                        vo8 vo8Var6 = vo8.i;
                        if ((vo8VarV3.f & 1) != 0) {
                            j7 = this.D1;
                        } else {
                            j7 = this.C1;
                        }
                        vo8VarV11.h = j7;
                        return false;
                    }
                } else {
                    if (i == -5) {
                        if (this.w1 == 2) {
                            tm3Var.e();
                            this.w1 = 1;
                        }
                        h0(fz3Var);
                        return true;
                    }
                    if (tm3Var.d(4)) {
                        if (this.z1) {
                            j = tm3Var.g;
                            if (!x0(tm3Var)) {
                                zD = tm3Var.d(1073741824);
                                if (zD) {
                                    iArr = n03Var.d;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                        n03Var.d = iArr;
                                        n03Var.i.numBytesOfClearData = iArr;
                                    }
                                    iArr[0] = iArr[0] + iPosition;
                                }
                                if (this.G1) {
                                    vo8 vo8VarV12 = V();
                                    p90 p90Var2 = vo8VarV12.d;
                                    rr5 rr5Var3 = this.S0;
                                    rr5Var3.getClass();
                                    p90Var2.f(j, rr5Var3);
                                    vo8VarV12.g = true;
                                    this.G1 = false;
                                }
                                this.C1 = Math.max(this.C1, j);
                                j2 = this.G0;
                                if (j2 != -9223372036854775807L) {
                                    z = true;
                                    if (j - V().c < j2) {
                                    }
                                    if (l()) {
                                        vo8 vo8VarV13 = V();
                                        vo8VarV = V();
                                        vo8 vo8Var7 = vo8.i;
                                        if ((vo8VarV.f & 1) != 0) {
                                            j3 = this.D1;
                                        } else {
                                            j3 = this.C1;
                                        }
                                        vo8VarV13.h = j3;
                                    } else {
                                        vo8 vo8VarV14 = V();
                                        vo8VarV = V();
                                        vo8 vo8Var8 = vo8.i;
                                        if ((vo8VarV.f & 1) != 0) {
                                            j3 = this.D1;
                                        } else {
                                            j3 = this.C1;
                                        }
                                        vo8VarV14.h = j3;
                                    }
                                    tm3Var.i();
                                    if (tm3Var.d(268435456)) {
                                        X(tm3Var);
                                    }
                                    if (this.O1) {
                                        j5 = this.C1;
                                        if (j <= j5) {
                                            this.P1 = (j5 - j) + 1 + this.P1;
                                        }
                                        this.C1 = j;
                                        this.D1 = j;
                                        this.O1 = false;
                                    }
                                    m0(tm3Var);
                                    iR = R(tm3Var);
                                    j4 = this.P1 + j;
                                    i2 = this.p1;
                                    if (zD) {
                                        po8Var.d(i2, n03Var, j4, iR);
                                    } else {
                                        ByteBuffer byteBuffer9 = tm3Var.e;
                                        byteBuffer9.getClass();
                                        po8Var.e(i2, byteBuffer9.limit(), iR, j4);
                                    }
                                    this.p1 = -1;
                                    tm3Var.e = null;
                                    boolean z4 = z;
                                    this.z1 = z4;
                                    this.w1 = 0;
                                    this.J1.c += z4 ? 1 : 0;
                                    return z4;
                                }
                                z = true;
                                this.D1 = Math.max(this.D1, j);
                                if (l()) {
                                    vo8 vo8VarV15 = V();
                                    vo8VarV = V();
                                    vo8 vo8Var9 = vo8.i;
                                    if ((vo8VarV.f & 1) != 0) {
                                        j3 = this.D1;
                                    } else {
                                        j3 = this.C1;
                                    }
                                    vo8VarV15.h = j3;
                                } else {
                                    vo8 vo8VarV16 = V();
                                    vo8VarV = V();
                                    vo8 vo8Var10 = vo8.i;
                                    if ((vo8VarV.f & 1) != 0) {
                                        j3 = this.D1;
                                    } else {
                                        j3 = this.C1;
                                    }
                                    vo8VarV16.h = j3;
                                }
                                tm3Var.i();
                                if (tm3Var.d(268435456)) {
                                    X(tm3Var);
                                }
                                if (this.O1) {
                                    j5 = this.C1;
                                    if (j <= j5) {
                                        this.P1 = (j5 - j) + 1 + this.P1;
                                    }
                                    this.C1 = j;
                                    this.D1 = j;
                                    this.O1 = false;
                                }
                                m0(tm3Var);
                                iR = R(tm3Var);
                                j4 = this.P1 + j;
                                i2 = this.p1;
                                if (zD) {
                                    po8Var.d(i2, n03Var, j4, iR);
                                } else {
                                    ByteBuffer byteBuffer10 = tm3Var.e;
                                    byteBuffer10.getClass();
                                    po8Var.e(i2, byteBuffer10.limit(), iR, j4);
                                }
                                this.p1 = -1;
                                tm3Var.e = null;
                                boolean z5 = z;
                                this.z1 = z5;
                                this.w1 = 0;
                                this.J1.c += z5 ? 1 : 0;
                                return z5;
                            }
                        } else {
                            j = tm3Var.g;
                            if (!x0(tm3Var)) {
                                zD = tm3Var.d(1073741824);
                                if (zD) {
                                    iArr = n03Var.d;
                                    if (iArr == null) {
                                        iArr = new int[1];
                                        n03Var.d = iArr;
                                        n03Var.i.numBytesOfClearData = iArr;
                                    }
                                    iArr[0] = iArr[0] + iPosition;
                                }
                                if (this.G1) {
                                    vo8 vo8VarV17 = V();
                                    p90 p90Var3 = vo8VarV17.d;
                                    rr5 rr5Var4 = this.S0;
                                    rr5Var4.getClass();
                                    p90Var3.f(j, rr5Var4);
                                    vo8VarV17.g = true;
                                    this.G1 = false;
                                }
                                this.C1 = Math.max(this.C1, j);
                                j2 = this.G0;
                                if (j2 != -9223372036854775807L) {
                                    z = true;
                                    if (j - V().c < j2) {
                                    }
                                    if (l()) {
                                        vo8 vo8VarV18 = V();
                                        vo8VarV = V();
                                        vo8 vo8Var11 = vo8.i;
                                        if ((vo8VarV.f & 1) != 0) {
                                            j3 = this.D1;
                                        } else {
                                            j3 = this.C1;
                                        }
                                        vo8VarV18.h = j3;
                                    } else {
                                        vo8 vo8VarV19 = V();
                                        vo8VarV = V();
                                        vo8 vo8Var12 = vo8.i;
                                        if ((vo8VarV.f & 1) != 0) {
                                            j3 = this.D1;
                                        } else {
                                            j3 = this.C1;
                                        }
                                        vo8VarV19.h = j3;
                                    }
                                    tm3Var.i();
                                    if (tm3Var.d(268435456)) {
                                        X(tm3Var);
                                    }
                                    if (this.O1) {
                                        j5 = this.C1;
                                        if (j <= j5) {
                                            this.P1 = (j5 - j) + 1 + this.P1;
                                        }
                                        this.C1 = j;
                                        this.D1 = j;
                                        this.O1 = false;
                                    }
                                    m0(tm3Var);
                                    iR = R(tm3Var);
                                    j4 = this.P1 + j;
                                    i2 = this.p1;
                                    if (zD) {
                                        po8Var.d(i2, n03Var, j4, iR);
                                    } else {
                                        ByteBuffer byteBuffer11 = tm3Var.e;
                                        byteBuffer11.getClass();
                                        po8Var.e(i2, byteBuffer11.limit(), iR, j4);
                                    }
                                    this.p1 = -1;
                                    tm3Var.e = null;
                                    boolean z6 = z;
                                    this.z1 = z6;
                                    this.w1 = 0;
                                    this.J1.c += z6 ? 1 : 0;
                                    return z6;
                                }
                                z = true;
                                this.D1 = Math.max(this.D1, j);
                                if (l()) {
                                    vo8 vo8VarV110 = V();
                                    vo8VarV = V();
                                    vo8 vo8Var13 = vo8.i;
                                    if ((vo8VarV.f & 1) != 0) {
                                        j3 = this.D1;
                                    } else {
                                        j3 = this.C1;
                                    }
                                    vo8VarV110.h = j3;
                                } else {
                                    vo8 vo8VarV111 = V();
                                    vo8VarV = V();
                                    vo8 vo8Var14 = vo8.i;
                                    if ((vo8VarV.f & 1) != 0) {
                                        j3 = this.D1;
                                    } else {
                                        j3 = this.C1;
                                    }
                                    vo8VarV111.h = j3;
                                }
                                tm3Var.i();
                                if (tm3Var.d(268435456)) {
                                    X(tm3Var);
                                }
                                if (this.O1) {
                                    j5 = this.C1;
                                    if (j <= j5) {
                                        this.P1 = (j5 - j) + 1 + this.P1;
                                    }
                                    this.C1 = j;
                                    this.D1 = j;
                                    this.O1 = false;
                                }
                                m0(tm3Var);
                                iR = R(tm3Var);
                                j4 = this.P1 + j;
                                i2 = this.p1;
                                if (zD) {
                                    po8Var.d(i2, n03Var, j4, iR);
                                } else {
                                    ByteBuffer byteBuffer12 = tm3Var.e;
                                    byteBuffer12.getClass();
                                    po8Var.e(i2, byteBuffer12.limit(), iR, j4);
                                }
                                this.p1 = -1;
                                tm3Var.e = null;
                                boolean z7 = z;
                                this.z1 = z7;
                                this.w1 = 0;
                                this.J1.c += z7 ? 1 : 0;
                                return z7;
                            }
                        }
                        return true;
                    }
                    vo8 vo8VarV112 = V();
                    vo8VarV2 = V();
                    vo8 vo8Var15 = vo8.i;
                    if ((vo8VarV2.f & 1) != 0) {
                        j6 = this.D1;
                    } else {
                        j6 = this.C1;
                    }
                    vo8VarV112.h = j6;
                    if (this.w1 == 2) {
                        tm3Var.e();
                        this.w1 = 1;
                    }
                    this.E1 = true;
                    if (!this.z1) {
                        n0();
                        return false;
                    }
                    if (!this.l1) {
                        this.A1 = true;
                        po8Var.e(this.p1, 0, 4, 0L);
                        this.p1 = -1;
                        tm3Var.e = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    public final void O() {
        try {
            po8 po8Var = this.a1;
            po8Var.getClass();
            po8Var.flush();
        } finally {
            t0();
        }
    }

    public final boolean P() {
        if (this.a1 != null) {
            if (A0()) {
                q0();
                return true;
            }
            if (y0()) {
                O();
                return false;
            }
            if (this.z1) {
                this.O1 = true;
            }
        }
        return false;
    }

    public final List Q(boolean z) {
        rr5 rr5Var = this.S0;
        rr5Var.getClass();
        ArrayList arrayListT = T(rr5Var, z);
        if (!arrayListT.isEmpty() || !z) {
            return arrayListT;
        }
        ArrayList arrayListT2 = T(rr5Var, false);
        if (!arrayListT2.isEmpty()) {
            xo1.V("MediaCodecRenderer", "Drm session requires secure decoder for " + rr5Var.p + ", but no secure decoder available. Trying to proceed with " + arrayListT2 + ".");
        }
        return arrayListT2;
    }

    public int R(tm3 tm3Var) {
        return 0;
    }

    public abstract float S(float f, rr5 rr5Var, rr5[] rr5VarArr);

    public abstract ArrayList T(rr5 rr5Var, boolean z);

    public long U(long j, long j2, boolean z) {
        return super.i(j, j2);
    }

    public final vo8 V() {
        ArrayDeque arrayDeque = this.P0;
        return !arrayDeque.isEmpty() ? (vo8) arrayDeque.getLast() : this.K1;
    }

    public abstract hbc W(to8 to8Var, rr5 rr5Var, MediaCrypto mediaCrypto, float f);

    public abstract void X(tm3 tm3Var);

    public final void Y(to8 to8Var, MediaCrypto mediaCrypto) {
        this.h1 = to8Var;
        rr5 rr5Var = this.S0;
        rr5Var.getClass();
        String str = to8Var.a;
        float f = this.Z0;
        rr5[] rr5VarArr = this.x;
        rr5VarArr.getClass();
        float fS = S(f, rr5Var, rr5VarArr);
        if (fS <= 0.0f) {
            fS = -1.0f;
        }
        this.g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        hbc hbcVarW = W(to8Var, rr5Var, mediaCrypto, fS);
        int i = Build.VERSION.SDK_INT;
        if (i >= 31) {
            uha uhaVar = this.f;
            uhaVar.getClass();
            xq.y(hbcVarW, uhaVar);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            po8 po8VarF = this.J0.f(hbcVarW);
            this.a1 = po8VarF;
            this.n1 = po8VarF.s(new kb6(22, this));
            Trace.endSection();
            this.g.getClass();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!to8Var.e(this.I0, rr5Var)) {
                String strC = rr5.c(rr5Var);
                Locale locale = Locale.US;
                xo1.V("MediaCodecRenderer", tec.m("Format exceeds selected codec's capabilities [", strC, ", ", str, "]"));
            }
            this.e1 = fS;
            this.b1 = rr5Var;
            HashSet hashSet = pp8.a;
            boolean z = false;
            this.i1 = i == 29 && "c2.android.aac.decoder".equals(str);
            String str2 = to8Var.a;
            if ((i <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str2) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str2) || "OMX.bcm.vdec.avc.tunnel".equals(str2) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str2) || "OMX.bcm.vdec.hevc.tunnel".equals(str2) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str2))) || ("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && to8Var.f)) {
                z = true;
            }
            this.l1 = z;
            this.a1.getClass();
            if (this.v == 2) {
                this.g.getClass();
                this.o1 = SystemClock.elapsedRealtime() + 1000;
            }
            this.J1.a++;
            long j = jElapsedRealtime2 - jElapsedRealtime;
            if (i >= 31 && !this.S1.isEmpty()) {
                po8 po8Var = this.a1;
                po8Var.getClass();
                po8Var.q(new ArrayList(this.S1));
            }
            e0(str, jElapsedRealtime2, j);
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    public final boolean Z(long j, long j2) {
        if (j2 >= j) {
            return false;
        }
        rr5 rr5Var = this.T0;
        return rr5Var == null || !Objects.equals(rr5Var.p, "audio/opus") || j - j2 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void a0() {
        rr5 rr5Var;
        ssg ssgVar;
        if (this.a1 != null || this.s1 || (rr5Var = this.S0) == null) {
            return;
        }
        String str = rr5Var.p;
        if (this.V0 == null && B0(rr5Var)) {
            this.s1 = false;
            s0();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            sw0 sw0Var = this.N0;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                sw0Var.z = 32;
            } else {
                sw0Var.z = 1;
            }
            this.s1 = true;
            return;
        }
        v0(this.V0);
        if (this.U0 == null) {
            try {
                ssgVar = this.U0;
                if (ssgVar != null && (ssgVar.I() == 3 || this.U0.I() == 4)) {
                    ssg ssgVar2 = this.U0;
                    str.getClass();
                    ssgVar2.getClass();
                }
                b0(this.X0, false);
            } catch (uo8 e) {
                throw g(e, rr5Var, false, 4001);
            }
        } else {
            pa7.J(this.X0 == null);
            ssg ssgVar3 = this.U0;
            ssgVar3.getClass();
            HashSet hashSet = pp8.a;
            boolean z = ez5.a;
            if (ssgVar3.G() != null) {
                ssgVar = this.U0;
                if (ssgVar != null) {
                    ssg ssgVar4 = this.U0;
                    str.getClass();
                    ssgVar4.getClass();
                }
                b0(this.X0, false);
            }
        }
        MediaCrypto mediaCrypto = this.X0;
        if (mediaCrypto == null || this.a1 != null) {
            return;
        }
        mediaCrypto.release();
        this.X0 = null;
    }

    public final void b0(MediaCrypto mediaCrypto, boolean z) throws uo8 {
        rr5 rr5Var = this.S0;
        rr5Var.getClass();
        if (this.f1 == null) {
            try {
                List listQ = Q(z);
                this.f1 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listQ;
                if (!arrayList.isEmpty()) {
                    this.f1.add((to8) arrayList.get(0));
                }
                this.g1 = null;
            } catch (yo8 e) {
                throw new uo8(rr5Var, e, z, -49998);
            }
        }
        if (this.f1.isEmpty()) {
            throw new uo8(rr5Var, null, z, -49999);
        }
        ArrayDeque arrayDeque = this.f1;
        arrayDeque.getClass();
        while (this.a1 == null) {
            to8 to8Var = (to8) arrayDeque.peekFirst();
            to8Var.getClass();
            if (!c0(rr5Var) || !z0(to8Var)) {
                return;
            }
            try {
                Y(to8Var, mediaCrypto);
            } catch (Exception e2) {
                xo1.W("MediaCodecRenderer", "Failed to initialize decoder: " + to8Var, e2);
                arrayDeque.removeFirst();
                uo8 uo8Var = new uo8("Decoder init failed: " + to8Var.a + ", " + rr5Var, e2, rr5Var.p, z, to8Var, e2 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e2).getDiagnosticInfo() : null, null);
                d0(uo8Var);
                uo8 uo8Var2 = this.g1;
                if (uo8Var2 == null) {
                    this.g1 = uo8Var;
                } else {
                    this.g1 = new uo8(uo8Var2.getMessage(), uo8Var2.getCause(), uo8Var2.mimeType, uo8Var2.secureDecoderRequired, uo8Var2.codecInfo, uo8Var2.diagnosticInfo, uo8Var);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.g1;
                }
            }
        }
        this.f1 = null;
    }

    public boolean c0(rr5 rr5Var) {
        return true;
    }

    @Override // defpackage.hu0, defpackage.vha
    public void d(int i, Object obj) {
        int i2;
        if (i == 11) {
            b55 b55Var = (b55) obj;
            b55Var.getClass();
            this.W0 = b55Var;
            return;
        }
        if (i != 21) {
            if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                obj.getClass();
                ry6 ry6Var = (ry6) obj;
                if (this.S1.equals(ry6Var)) {
                    return;
                }
                if (i2 >= 31) {
                    HashSet hashSet = new HashSet(ry6Var);
                    HashSet hashSet2 = new HashSet();
                    gff it = this.S1.iterator();
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        if (!hashSet.remove(str)) {
                            hashSet2.add(str);
                        }
                    }
                    po8 po8Var = this.a1;
                    if (po8Var != null) {
                        if (!hashSet2.isEmpty()) {
                            po8Var.t(new ArrayList(hashSet2));
                        }
                        if (!hashSet.isEmpty()) {
                            po8Var.q(new ArrayList(hashSet));
                        }
                    }
                }
                this.S1 = ry6Var;
                return;
            }
            return;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            obj.getClass();
            b72 b72Var = (b72) obj;
            this.Q1 = b72Var;
            po8 po8Var2 = this.a1;
            if (po8Var2 != null) {
                Bundle bundle = new Bundle();
                for (Map.Entry entry : b72Var.a.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value != null) {
                        if (value instanceof Integer) {
                            bundle.putInt(str2, ((Integer) value).intValue());
                        } else if (value instanceof Long) {
                            bundle.putLong(str2, ((Long) value).longValue());
                        } else if (value instanceof Float) {
                            bundle.putFloat(str2, ((Float) value).floatValue());
                        } else if (value instanceof String) {
                            bundle.putString(str2, (String) value);
                        } else if (value instanceof ByteBuffer) {
                            ByteBuffer byteBuffer = (ByteBuffer) value;
                            byte[] bArr = new byte[byteBuffer.remaining()];
                            byteBuffer.duplicate().get(bArr);
                            bundle.putByteArray(str2, bArr);
                        }
                    }
                }
                po8Var2.b(bundle);
            }
        }
    }

    public abstract void d0(Exception exc);

    public abstract void e0(String str, long j, long j2);

    public abstract void f0(b72 b72Var);

    public abstract void g0(String str);

    /* JADX WARN: Code duplicated, block: B:12:0x0030  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00d0  */
    public vm3 h0(fz3 fz3Var) {
        rr5 rr5Var;
        int i;
        Pair pairB;
        String str;
        this.G1 = true;
        rr5 rr5Var2 = (rr5) fz3Var.c;
        rr5Var2.getClass();
        String str2 = rr5Var2.p;
        if (str2 == null) {
            throw g(new IllegalArgumentException("Sample MIME type is null."), rr5Var2, false, 4005);
        }
        if (!str2.equals("video/av01") && !str2.equals("video/x-vnd.on2.vp9")) {
            if (str2.equals("video/dolby-vision")) {
                byte[] bArr = d72.a;
                if (str2.equals("video/dolby-vision") && (pairB = d72.b(rr5Var2)) != null) {
                    int iIntValue = ((Integer) pairB.first).intValue();
                    if (iIntValue == 16 || iIntValue == 32 || iIntValue == 256) {
                        str = "video/hevc";
                    } else if (iIntValue == 512) {
                        str = "video/avc";
                    } else if (iIntValue != 1024) {
                        str = null;
                    } else {
                        str = "video/av01";
                    }
                } else {
                    str = null;
                }
                if (Objects.equals(str, "video/av01")) {
                    if (rr5Var2.s.isEmpty()) {
                        qr5 qr5VarA = rr5Var2.a();
                        qr5VarA.r = null;
                        rr5Var = new rr5(qr5VarA);
                    }
                }
            }
            rr5Var = rr5Var2;
        } else if (rr5Var2.s.isEmpty()) {
            rr5Var = rr5Var2;
        } else {
            qr5 qr5VarA2 = rr5Var2.a();
            qr5VarA2.r = null;
            rr5Var = new rr5(qr5VarA2);
        }
        ssg ssgVar = (ssg) fz3Var.b;
        ssg ssgVar2 = this.V0;
        this.V0 = ssgVar;
        this.S0 = rr5Var;
        if (this.s1) {
            this.u1 = true;
            return null;
        }
        po8 po8Var = this.a1;
        if (po8Var == null) {
            this.f1 = null;
            a0();
            return null;
        }
        to8 to8Var = this.h1;
        to8Var.getClass();
        rr5 rr5Var3 = this.b1;
        rr5Var3.getClass();
        if (this.U0 != this.V0) {
            if (this.z1) {
                this.x1 = 1;
                this.y1 = 3;
            } else {
                q0();
                a0();
            }
            return new vm3(to8Var.a, rr5Var3, rr5Var, 0, UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        boolean z = this.V0 != this.U0;
        vm3 vm3VarJ = J(to8Var, rr5Var3, rr5Var, V().g);
        int i2 = vm3VarJ.d;
        if (i2 != 0) {
            if (i2 == 1) {
                D0(rr5Var);
                this.b1 = rr5Var;
                if (z) {
                    if (!L()) {
                        i = 2;
                    }
                } else if (this.z1) {
                    this.x1 = 1;
                    if (A0()) {
                        this.y1 = 3;
                        i = 2;
                    } else {
                        this.y1 = 1;
                    }
                }
            } else if (i2 == 2) {
                D0(rr5Var);
                this.v1 = true;
                this.w1 = 1;
                this.j1 = false;
                this.b1 = rr5Var;
                if (z && !L()) {
                    i = 2;
                }
            } else {
                if (i2 != 3) {
                    r3.l();
                    return null;
                }
                D0(rr5Var);
                this.b1 = rr5Var;
                if (z && !L()) {
                    i = 2;
                }
            }
            return (i2 != 0 || (this.a1 == po8Var && this.y1 != 3)) ? vm3VarJ : new vm3(to8Var.a, rr5Var3, rr5Var, 0, i);
        }
        if (this.z1) {
            this.x1 = 1;
            this.y1 = 3;
        } else {
            q0();
            a0();
        }
        i = 0;
        if (i2 != 0) {
        }
    }

    @Override // defpackage.hu0
    public final long i(long j, long j2) {
        return U(j, j2, this.n1);
    }

    public abstract void i0(rr5 rr5Var, MediaFormat mediaFormat);

    public void k0(long j) {
        this.L1 = Math.max(j, this.L1);
        while (true) {
            ArrayDeque arrayDeque = this.P0;
            if (arrayDeque.isEmpty() || j < ((vo8) arrayDeque.peek()).a) {
                return;
            }
            vo8 vo8Var = (vo8) arrayDeque.poll();
            vo8Var.getClass();
            w0(vo8Var);
            l0();
        }
    }

    public abstract void l0();

    public final void n0() {
        int i = this.y1;
        if (i == 1) {
            O();
            return;
        }
        if (i == 2) {
            O();
            E0();
        } else if (i != 3) {
            this.F1 = true;
            r0();
        } else {
            q0();
            a0();
        }
    }

    public abstract boolean o0(long j, long j2, po8 po8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, rr5 rr5Var);

    @Override // defpackage.hu0
    public void p() {
        this.S0 = null;
        w0(vo8.i);
        this.P0.clear();
        if (!this.s1) {
            P();
        } else {
            this.s1 = false;
            s0();
        }
    }

    public final boolean p0(int i) {
        fz3 fz3Var = this.c;
        fz3Var.l();
        tm3 tm3Var = this.K0;
        tm3Var.e();
        int iY = y(fz3Var, tm3Var, i | 4);
        if (iY == -5) {
            h0(fz3Var);
            return true;
        }
        if (iY != -4 || !tm3Var.d(4)) {
            return false;
        }
        this.E1 = true;
        n0();
        return false;
    }

    public final void q0() {
        try {
            po8 po8Var = this.a1;
            if (po8Var != null) {
                po8Var.a();
                this.J1.b++;
                to8 to8Var = this.h1;
                to8Var.getClass();
                g0(to8Var.a);
            }
            this.a1 = null;
            try {
                MediaCrypto mediaCrypto = this.X0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.X0 = null;
                v0(null);
                u0();
            }
        } catch (Throwable th) {
            this.a1 = null;
            try {
                MediaCrypto mediaCrypto2 = this.X0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
                this.X0 = null;
                v0(null);
                u0();
            }
        }
    }

    @Override // defpackage.hu0
    public void r(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.P0;
        if (!arrayDeque.isEmpty()) {
            this.K1 = (vo8) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (z2) {
            this.E1 = false;
            this.F1 = false;
            this.H1 = false;
            if (this.s1) {
                s0();
            } else if (P()) {
                a0();
            }
            if (this.K1.d.d0() > 0) {
                this.G1 = true;
            }
            this.K1.d.m();
            this.K1.g = false;
        }
    }

    public abstract void r0();

    public final void s0() {
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        V().h = -9223372036854775807L;
        this.L1 = -9223372036854775807L;
        this.u1 = false;
        this.N0.e();
        this.M0.e();
        this.t1 = false;
        ByteBuffer byteBuffer = ak0.a;
        yl9 yl9Var = this.Q0;
        yl9Var.d = byteBuffer;
        yl9Var.c = 0;
        yl9Var.b = 2;
    }

    public void t0() {
        this.p1 = -1;
        this.L0.e = null;
        this.q1 = -1;
        this.r1 = null;
        this.C1 = -9223372036854775807L;
        this.D1 = -9223372036854775807L;
        V().h = -9223372036854775807L;
        this.L1 = -9223372036854775807L;
        this.o1 = -9223372036854775807L;
        this.A1 = false;
        this.m1 = -9223372036854775807L;
        this.z1 = false;
        this.j1 = false;
        this.k1 = false;
        this.x1 = 0;
        this.y1 = 0;
        this.w1 = this.v1 ? 1 : 0;
        this.O1 = false;
        this.P1 = 0L;
    }

    public final void u0() {
        t0();
        this.I1 = null;
        this.f1 = null;
        this.h1 = null;
        this.b1 = null;
        this.c1 = null;
        this.d1 = false;
        this.B1 = false;
        this.e1 = -1.0f;
        this.i1 = false;
        this.l1 = false;
        this.n1 = false;
        this.v1 = false;
        this.w1 = 0;
    }

    public final void v0(ssg ssgVar) {
        ssg ssgVar2 = this.U0;
        this.U0 = ssgVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0048, code lost:
    
        if (r2 >= r0) goto L16;
     */
    @Override // defpackage.hu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void w(defpackage.rr5[] r13, long r14, long r16, defpackage.zp8 r18) {
        /*
            r12 = this;
            long r7 = r12.G0
            occ r13 = r12.w
            r13.getClass()
            occ r13 = (defpackage.occ) r13
            int r9 = r13.b()
            vo8 r13 = r12.K1
            long r0 = r13.c
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 != 0) goto L32
            vo8 r0 = new vo8
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.w0(r0)
            boolean r13 = r12.N1
            if (r13 == 0) goto L65
            r12.l0()
            return
        L32:
            java.util.ArrayDeque r13 = r12.P0
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L66
            long r0 = r12.C1
            int r2 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r2 == 0) goto L4a
            long r2 = r12.L1
            int r4 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r4 == 0) goto L66
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 < 0) goto L66
        L4a:
            vo8 r0 = new vo8
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r12.w0(r0)
            vo8 r13 = r12.K1
            long r0 = r13.c
            int r13 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r13 == 0) goto L65
            r12.l0()
        L65:
            return
        L66:
            vo8 r0 = new vo8
            long r1 = r12.C1
            r3 = r14
            r5 = r16
            r0.<init>(r1, r3, r5, r7, r9)
            r13.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wo8.w(rr5[], long, long, zp8):void");
    }

    public final void w0(vo8 vo8Var) {
        this.K1 = vo8Var;
        long j = vo8Var.c;
        if (j != -9223372036854775807L) {
            this.M1 = true;
            j0(j);
        }
    }

    @Override // defpackage.hu0
    public final void x() {
        V().e = this.G0;
    }

    public boolean x0(tm3 tm3Var) {
        return false;
    }

    public boolean y0() {
        return this.z1;
    }

    @Override // defpackage.hu0
    public void z(long j, long j2) {
        boolean z = false;
        if (this.H1) {
            this.H1 = false;
            n0();
        }
        g45 g45Var = this.I1;
        if (g45Var != null) {
            this.I1 = null;
            throw g45Var;
        }
        try {
            if (this.F1) {
                r0();
                return;
            }
            if (this.S0 != null || p0(2)) {
                a0();
                if (this.s1) {
                    Trace.beginSection("bypassRender");
                    while (I(j, j2)) {
                    }
                    Trace.endSection();
                } else if (this.a1 != null) {
                    this.g.getClass();
                    SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (M(j, j2)) {
                    }
                    while (N()) {
                    }
                    Trace.endSection();
                } else {
                    qm3 qm3Var = this.J1;
                    int i = qm3Var.d;
                    occ occVar = this.w;
                    occVar.getClass();
                    qm3Var.d = i + occVar.e(j - this.y);
                    p0(1);
                }
                synchronized (this.J1) {
                }
            }
        } catch (MediaCodec.CryptoException e) {
            throw g(e, this.S0, false, pqf.s(e.getErrorCode()));
        } catch (IllegalStateException e2) {
            boolean z2 = e2 instanceof MediaCodec.CodecException;
            if (!z2) {
                StackTraceElement[] stackTrace = e2.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e2;
                }
            }
            d0(e2);
            if (z2 && ((MediaCodec.CodecException) e2).isRecoverable()) {
                z = true;
            }
            if (z) {
                q0();
            }
            so8 so8VarK = K(e2, this.h1);
            throw g(so8VarK, this.S0, z, so8VarK.errorCode == 1101 ? 4006 : 4003);
        }
    }

    public boolean z0(to8 to8Var) {
        return true;
    }

    public void j0(long j) {
    }

    public void m0(tm3 tm3Var) {
    }
}
