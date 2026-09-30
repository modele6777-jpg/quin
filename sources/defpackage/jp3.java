package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jp3 {
    public static final AtomicInteger d0 = new AtomicInteger();
    public long A;
    public long B;
    public long C;
    public int D;
    public boolean E;
    public boolean F;
    public long G;
    public long H;
    public float I;
    public ByteBuffer J;
    public int K;
    public ByteBuffer L;
    public boolean M;
    public boolean N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public int R;
    public boolean S;
    public dr0 T;
    public AudioDeviceInfo U;
    public int V;
    public boolean W;
    public long X;
    public boolean Y;
    public boolean Z;
    public final Context a;
    public long a0;
    public final ta0 b;
    public long b0;
    public final ow1 c;
    public Handler c0;
    public final l5f d;
    public final uye e;
    public final uye f;
    public final yob g;
    public final ArrayDeque h;
    public int i;
    public ep3 j;
    public final ip3 k;
    public final ip3 l;
    public uha m;
    public m6c n;
    public gp3 o;
    public gp3 p;
    public vj0 q;
    public uj0 r;
    public cp3 s;
    public al0 t;
    public xi0 u;
    public hp3 v;
    public hp3 w;
    public nga x;
    public boolean y;
    public long z;

    public jp3(fp3 fp3Var) {
        int deviceId;
        Context context = fp3Var.a;
        this.a = context == null ? null : context.getApplicationContext();
        this.u = xi0.b;
        this.b = (ta0) fp3Var.d;
        this.i = 0;
        this.r = (cl0) fp3Var.f;
        ow1 ow1Var = new ow1();
        this.c = ow1Var;
        l5f l5fVar = new l5f();
        l5fVar.m = pqf.b;
        this.d = l5fVar;
        this.e = new uye(1);
        this.f = new uye(0);
        this.g = jy6.t(l5fVar, ow1Var);
        this.I = 1.0f;
        this.R = 0;
        this.T = new dr0();
        nga ngaVar = nga.d;
        this.w = new hp3(ngaVar, 0L, 0L);
        this.x = ngaVar;
        this.y = false;
        this.h = new ArrayDeque();
        this.k = new ip3();
        this.l = new ip3();
        int i = -1;
        if (Build.VERSION.SDK_INT >= 34 && context != null && (deviceId = context.getDeviceId()) != 0 && deviceId != -1) {
            i = deviceId;
        }
        this.V = i;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00c0  */
    public static int i(int i, ByteBuffer byteBuffer) {
        int i2;
        int i3;
        byte b;
        int i4;
        byte b2;
        int i5;
        int i6;
        int i7;
        int i8;
        if (i == 20) {
            if ((byteBuffer.get(5) & 2) == 0) {
                i2 = 0;
            } else {
                byte b3 = byteBuffer.get(26);
                int i9 = 28;
                int i10 = 28;
                for (int i11 = 0; i11 < b3; i11++) {
                    i10 += byteBuffer.get(i11 + 27);
                }
                byte b4 = byteBuffer.get(i10 + 26);
                for (int i12 = 0; i12 < b4; i12++) {
                    i9 += byteBuffer.get(i10 + 27 + i12);
                }
                i2 = i10 + i9;
            }
            int i13 = byteBuffer.get(i2 + 26) + 27 + i2;
            return (int) ((vd0.Y(byteBuffer.get(i13), byteBuffer.limit() - i13 > 1 ? byteBuffer.get(i13 + 1) : (byte) 0) * 48000) / 1000000);
        }
        if (i != 30) {
            switch (i) {
                case 5:
                case 6:
                    break;
                case 7:
                case 8:
                    break;
                case 9:
                    int iPosition = byteBuffer.position();
                    String str = pqf.a;
                    int iReverseBytes = byteBuffer.getInt(iPosition);
                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                        iReverseBytes = Integer.reverseBytes(iReverseBytes);
                    }
                    if ((iReverseBytes & (-2097152)) != -2097152 || (i6 = (iReverseBytes >>> 19) & 3) == 1 || (i7 = (iReverseBytes >>> 17) & 3) == 0) {
                        i5 = -1;
                    } else {
                        int i14 = (iReverseBytes >>> 12) & 15;
                        int i15 = (iReverseBytes >>> 10) & 3;
                        if (i14 == 0 || i14 == 15 || i15 == 3) {
                            i5 = -1;
                        } else {
                            i5 = 1152;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    if (i7 != 3) {
                                        cva.s();
                                        return 0;
                                    }
                                    i5 = 384;
                                }
                            } else if (i6 != 3) {
                                i5 = 576;
                            }
                        }
                    }
                    if (i5 != -1) {
                        return i5;
                    }
                    cva.s();
                    return 0;
                case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                    return UserMetadata.MAX_ATTRIBUTE_SIZE;
                case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    return 2048;
                default:
                    switch (i) {
                        case 14:
                            int iPosition2 = byteBuffer.position();
                            int iLimit = byteBuffer.limit() - 10;
                            int i16 = iPosition2;
                            while (true) {
                                if (i16 <= iLimit) {
                                    String str2 = pqf.a;
                                    int iReverseBytes2 = byteBuffer.getInt(i16 + 4);
                                    if (byteBuffer.order() != ByteOrder.BIG_ENDIAN) {
                                        iReverseBytes2 = Integer.reverseBytes(iReverseBytes2);
                                    }
                                    if ((iReverseBytes2 & (-2)) == -126718022) {
                                        i8 = i16 - iPosition2;
                                    } else {
                                        i16++;
                                    }
                                } else {
                                    i8 = -1;
                                }
                            }
                            if (i8 == -1) {
                                return 0;
                            }
                            return (40 << ((byteBuffer.get((byteBuffer.position() + i8) + (((byteBuffer.get((byteBuffer.position() + i8) + 7) & 255) == 187 ? (byte) 1 : (byte) 0) != 0 ? 9 : 8)) >> 4) & 7)) * 16;
                        case 15:
                            return 512;
                        case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            return UserMetadata.MAX_ATTRIBUTE_SIZE;
                        case 17:
                            byte[] bArr = new byte[16];
                            int iPosition3 = byteBuffer.position();
                            byteBuffer.get(bArr);
                            byteBuffer.position(iPosition3);
                            return g21.T(new zu1(bArr, 16)).c;
                        case 18:
                            break;
                        default:
                            qc0.p(tec.e(i, "Unexpected audio encoding: "));
                            return 0;
                    }
                    break;
            }
            if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
                return b21.a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4 : 3] * 256;
            }
            return 1536;
        }
        if (byteBuffer.getInt(0) == -233094848 || byteBuffer.getInt(0) == -398277519) {
            return UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (byteBuffer.getInt(0) == 622876772) {
            return 4096;
        }
        int iPosition4 = byteBuffer.position();
        byte b5 = byteBuffer.get(iPosition4);
        if (b5 != -2) {
            if (b5 == -1) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 7);
            } else if (b5 != 31) {
                i3 = (byteBuffer.get(iPosition4 + 4) & 1) << 6;
                b = byteBuffer.get(iPosition4 + 5);
            } else {
                i3 = (byteBuffer.get(iPosition4 + 5) & 7) << 4;
                b2 = byteBuffer.get(iPosition4 + 6);
            }
            i4 = b2 & 60;
            return (((i4 >> 2) | i3) + 1) * 32;
        }
        i3 = (byteBuffer.get(iPosition4 + 5) & 1) << 6;
        b = byteBuffer.get(iPosition4 + 4);
        i4 = b & 252;
        return (((i4 >> 2) | i3) + 1) * 32;
    }

    public final void a(long j) {
        nga ngaVar;
        boolean zW = w();
        int i = 1;
        boolean z = false;
        ta0 ta0Var = this.b;
        if (zW) {
            ngaVar = nga.d;
        } else {
            if (this.W || !this.p.g()) {
                ngaVar = nga.d;
            } else {
                int i2 = ((rr5) this.p.c).M;
                ngaVar = this.x;
                jtd jtdVar = (jtd) ta0Var.b;
                float f = ngaVar.a;
                pa7.A(f > 0.0f);
                if (jtdVar.b != f) {
                    jtdVar.b = f;
                    jtdVar.h = true;
                }
                float f2 = ngaVar.b;
                pa7.A(f2 > 0.0f);
                if (jtdVar.c != f2) {
                    jtdVar.c = f2;
                    jtdVar.h = true;
                }
            }
            this.x = ngaVar;
        }
        nga ngaVar2 = ngaVar;
        if (!this.W && this.p.g()) {
            int i3 = ((rr5) this.p.c).M;
            z = this.y;
            ((tid) ta0Var.d).j = z;
        }
        this.y = z;
        this.h.add(new hp3(ngaVar2, Math.max(0L, j), pqf.L(((tj0) this.p.e).b, j())));
        v(j);
        m6c m6cVar = this.n;
        if (m6cVar != null) {
            boolean z2 = this.y;
            k47 k47Var = ((qo8) m6cVar.b).V1;
            Handler handler = (Handler) k47Var.b;
            if (handler != null) {
                handler.post(new tj(k47Var, z2, i));
            }
        }
    }

    public final al0 b(tj0 tj0Var) throws pk0 {
        try {
            return ((cl0) this.r).a(tj0Var);
        } catch (rj0 e) {
            pk0 pk0Var = new pk0(tj0Var.b, tj0Var.c, tj0Var.a, tj0Var.f, (rr5) this.p.c, tj0Var.e, e);
            m6c m6cVar = this.n;
            if (m6cVar == null) {
                throw pk0Var;
            }
            m6cVar.K(pk0Var);
            throw pk0Var;
        }
    }

    public final void c(nk0 nk0Var) {
        int i;
        vj0 vj0Var;
        rr5 rr5Var;
        int iQ;
        if (this.s == null && this.a != null) {
            cp3 cp3Var = new cp3(this);
            this.s = cp3Var;
            cl0 cl0Var = (cl0) this.r;
            cl0Var.f();
            f98 f98Var = cl0Var.e;
            if (f98Var == null) {
                f98Var = new f98(Thread.currentThread());
                cl0Var.e = f98Var;
            }
            f98Var.a(cp3Var);
        }
        rr5 rr5Var2 = nk0Var.a;
        String str = rr5Var2.p;
        int i2 = rr5Var2.J;
        int i3 = rr5Var2.M;
        if ("audio/raw".equals(str)) {
            pa7.A(pqf.E(i3));
            int iQ2 = pqf.q(i3) * i2;
            dy6 dy6Var = new dy6(4);
            dy6Var.d(this.g);
            dy6Var.b(this.e);
            dy6Var.c((ak0[]) this.b.c);
            vj0 vj0Var2 = new vj0(dy6Var.g());
            if (vj0Var2.equals(this.q)) {
                vj0Var2 = this.q;
            }
            int i4 = rr5Var2.N;
            int i5 = rr5Var2.O;
            l5f l5fVar = this.d;
            l5fVar.i = i4;
            l5fVar.j = i5;
            this.c.i = nk0Var.b;
            wj0 wj0Var = new wj0(rr5Var2.L, i2, i3);
            try {
                jy6 jy6Var = vj0Var2.a;
                if (wj0Var.equals(wj0.e)) {
                    throw new zj0(wj0Var);
                }
                for (int i6 = 0; i6 < jy6Var.size(); i6++) {
                    ak0 ak0Var = (ak0) jy6Var.get(i6);
                    wj0 wj0VarG = ak0Var.g(wj0Var);
                    if (ak0Var.b()) {
                        pa7.J(!wj0VarG.equals(wj0.e));
                        wj0Var = wj0VarG;
                    }
                }
                int i7 = wj0Var.b;
                int i8 = wj0Var.c;
                qr5 qr5VarA = rr5Var2.a();
                qr5VarA.L = i8;
                qr5VarA.K = wj0Var.a;
                qr5VarA.I = i7;
                qr5VarA.J = i7 == i2 ? rr5Var2.K : -1;
                rr5 rr5Var3 = new rr5(qr5VarA);
                i = iQ2;
                vj0Var = vj0Var2;
                iQ = pqf.q(i8) * i7;
                rr5Var = rr5Var3;
            } catch (zj0 e) {
                throw new ok0(e, rr5Var2);
            }
        } else {
            ey6 ey6Var = jy6.b;
            i = -1;
            vj0Var = new vj0(yob.e);
            rr5Var = rr5Var2;
            iQ = -1;
        }
        pj0 pj0VarG = g(rr5Var);
        rr5 rr5Var4 = pj0VarG.a;
        try {
            tj0 tj0VarC = ((cl0) this.r).c(pj0VarG);
            boolean z = tj0VarC.e;
            if (tj0VarC.a == 0) {
                throw new ok0("Invalid output encoding (isOffload=" + z + ")", rr5Var4);
            }
            if (tj0VarC.c == 0) {
                throw new ok0("Invalid output channel config (isOffload=" + z + ")", rr5Var4);
            }
            this.Y = false;
            gye gyeVar = nk0Var.c;
            zp8 zp8Var = nk0Var.d;
            gp3 gp3Var = new gp3(rr5Var2, rr5Var, i, iQ, tj0VarC, vj0Var, gyeVar, zp8Var != null ? zp8Var.a : null);
            if (n()) {
                this.o = gp3Var;
            } else {
                this.p = gp3Var;
            }
        } catch (oj0 e2) {
            throw new ok0(e2, rr5Var2);
        }
    }

    public final void d(long j) throws rk0 {
        m6c m6cVar;
        b55 b55Var;
        if (this.L == null) {
            return;
        }
        ip3 ip3Var = this.l;
        if (((Exception) ip3Var.c) != null && (d0.get() > 0 || SystemClock.elapsedRealtime() < ip3Var.b)) {
            return;
        }
        int iRemaining = this.L.remaining();
        boolean z = false;
        try {
            boolean zG = this.t.g(this.K, j, this.L);
            this.X = SystemClock.elapsedRealtime();
            ip3Var.c = null;
            ip3Var.a = -9223372036854775807L;
            ip3Var.b = -9223372036854775807L;
            if (this.t.c()) {
                if (this.C > 0) {
                    this.Z = false;
                }
                if (this.P && (m6cVar = this.n) != null && !zG && !this.Z && (b55Var = ((qo8) m6cVar.b).W0) != null) {
                    b55Var.a.e1 = true;
                }
            }
            if (this.p.g()) {
                this.B += (long) (iRemaining - this.L.remaining());
            }
            if (zG) {
                if (!this.p.g()) {
                    pa7.J(this.L == this.J);
                    this.C = (((long) this.D) * ((long) this.K)) + this.C;
                }
                this.L = null;
            }
        } catch (nj0 e) {
            if (e.isRecoverable) {
                if (j() > 0) {
                    z = true;
                } else if (this.t.c()) {
                    if (((tj0) this.p.e).e) {
                        this.Y = true;
                    }
                    z = true;
                }
            }
            rk0 rk0Var = new rk0(e.errorCode, (rr5) this.p.c, z);
            m6c m6cVar2 = this.n;
            if (m6cVar2 != null) {
                m6cVar2.K(rk0Var);
            }
            if (e.isRecoverable) {
                throw rk0Var;
            }
            ip3Var.a(rk0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0044 A[RETURN] */
    public final boolean e() throws rk0 {
        ByteBuffer byteBuffer;
        if (!this.q.c()) {
            d(Long.MIN_VALUE);
            if (this.L == null) {
                return true;
            }
            return false;
        }
        vj0 vj0Var = this.q;
        if (vj0Var.c() && !vj0Var.d) {
            vj0Var.d = true;
            ((ak0) vj0Var.b.get(0)).h();
        }
        q(Long.MIN_VALUE);
        if (!this.q.b() || ((byteBuffer = this.L) != null && byteBuffer.hasRemaining())) {
            return false;
        }
        return true;
    }

    public final void f() {
        if (n()) {
            this.z = 0L;
            this.A = 0L;
            this.B = 0L;
            this.C = 0L;
            this.Z = false;
            this.D = 0;
            this.w = new hp3(this.x, 0L, 0L);
            this.G = 0L;
            this.v = null;
            this.h.clear();
            this.J = null;
            this.K = 0;
            this.L = null;
            this.N = false;
            this.M = false;
            this.O = false;
            this.d.o = 0L;
            v(-9223372036854775807L);
            this.j = null;
            gp3 gp3Var = this.o;
            if (gp3Var != null) {
                this.p = gp3Var;
                this.o = null;
            }
            d0.incrementAndGet();
            al0 al0Var = this.t;
            if (al0Var.e.d.getPlayState() == 3) {
                al0Var.a.pause();
            }
            if (Build.VERSION.SDK_INT >= 29 && al0Var.c()) {
                zk0 zk0Var = al0Var.h;
                zk0Var.getClass();
                zk0Var.a();
            }
            szc szcVar = al0Var.d;
            if (szcVar != null) {
                AudioTrack audioTrack = (AudioTrack) szcVar.b;
                vk0 vk0Var = (vk0) szcVar.e;
                vk0Var.getClass();
                audioTrack.removeOnRoutingChangedListener(vk0Var);
                szcVar.e = null;
                al0Var.d = null;
            }
            AudioTrack audioTrack2 = al0Var.a;
            f98 f98Var = al0Var.i;
            Handler handlerN = pqf.n(null);
            synchronized (al0.p) {
                try {
                    ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = al0.q;
                    if (scheduledExecutorServiceNewSingleThreadScheduledExecutor == null) {
                        scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new iw2(1));
                        al0.q = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                    }
                    al0.r++;
                    scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new c0(audioTrack2, handlerN, f98Var, 2), 20L, TimeUnit.MILLISECONDS);
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.t = null;
        }
        ip3 ip3Var = this.l;
        ip3Var.c = null;
        ip3Var.a = -9223372036854775807L;
        ip3Var.b = -9223372036854775807L;
        ip3 ip3Var2 = this.k;
        ip3Var2.c = null;
        ip3Var2.a = -9223372036854775807L;
        ip3Var2.b = -9223372036854775807L;
        this.a0 = 0L;
        this.b0 = 0L;
        Handler handler = this.c0;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    public final pj0 g(rr5 rr5Var) {
        pj0 pj0Var = new pj0(rr5Var);
        pj0Var.b = this.u;
        pj0Var.d = this.i != 0;
        pj0Var.c = this.U;
        pj0Var.e = this.R;
        pj0Var.g = this.W;
        pj0Var.f = this.V;
        return new pj0(pj0Var);
    }

    public final int h(rr5 rr5Var) {
        boolean z;
        if (!pqf.E(rr5Var.M) || rr5Var.M == 2) {
            z = false;
        } else {
            qr5 qr5VarA = rr5Var.a();
            qr5VarA.L = 2;
            rr5Var = new rr5(qr5VarA);
            z = true;
        }
        int i = ((cl0) this.r).b(g(rr5Var)).d;
        if (i != 1) {
            if (i != 2) {
                return 0;
            }
            if (!z) {
                return 2;
            }
        }
        return 1;
    }

    public final long j() {
        if (!this.p.g()) {
            return this.C;
        }
        long j = this.B;
        long j2 = this.p.b;
        return ((j + j2) - 1) / j2;
    }

    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /* JADX WARN: Failed to calculate best type for var: r18v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v1 ??, new type: long
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException
     */
    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r18v0 ??, new type: long
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    public final boolean k(int r21, long r22, java.nio.ByteBuffer r24) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jp3.k(int, long, java.nio.ByteBuffer):boolean");
    }

    public final boolean l() {
        if (!n()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 29 && this.t.c() && this.O) {
            return false;
        }
        long j = j();
        long jA = this.t.a();
        al0 al0Var = this.t;
        al0Var.getClass();
        return j > pqf.N(jA, (long) al0Var.a.getSampleRate(), 1000000L, RoundingMode.UP);
    }

    public final boolean m() throws pk0 {
        int iD;
        al0 al0VarB;
        zi8 zi8Var;
        ip3 ip3Var = this.k;
        if (((Exception) ip3Var.c) != null && (d0.get() > 0 || SystemClock.elapsedRealtime() < ip3Var.b)) {
            return false;
        }
        try {
            al0VarB = b((tj0) this.p.e);
        } catch (pk0 e) {
            tj0 tj0Var = (tj0) this.p.e;
            int iMax = tj0Var.f;
            boolean zE = pqf.E(tj0Var.a);
            gp3 gp3Var = this.p;
            if (zE) {
                iD = ((tj0) gp3Var.e).b * gp3Var.b;
            } else {
                int i = ((rr5) gp3Var.c).k;
                if (i != -1) {
                    iD = i / 8;
                } else {
                    iD = rs0.D(((tj0) gp3Var.e).a);
                    if (iD == -2147483647) {
                        iD = 1000000;
                    }
                }
            }
            tj0 tj0Var2 = (tj0) this.p.e;
            int iMax2 = Math.max(iD, AudioTrack.getMinBufferSize(tj0Var2.b, tj0Var2.c, tj0Var2.a));
            int i2 = this.p.b;
            if (i2 == -1) {
                i2 = 1;
            }
            while (true) {
                if (iMax <= iMax2) {
                    if (!((tj0) this.p.e).e) {
                        throw e;
                    }
                    this.Y = true;
                    throw e;
                }
                iMax = Math.max(iMax2, iMax / 2);
                int i3 = iMax % i2;
                if (i3 != 0) {
                    iMax = (i2 - i3) + iMax;
                }
                sj0 sj0VarA = ((tj0) this.p.e).a();
                sj0VarA.f = iMax;
                tj0 tj0Var3 = new tj0(sj0VarA);
                try {
                    al0 al0VarB2 = b(tj0Var3);
                    this.p = this.p.c(tj0Var3);
                    al0VarB = al0VarB2;
                    break;
                } catch (pk0 e2) {
                    e.addSuppressed(e2);
                }
            }
        }
        this.t = al0VarB;
        ep3 ep3Var = new ep3(this, (tj0) this.p.e);
        this.j = ep3Var;
        al0VarB.i.a(ep3Var);
        if (this.t.c()) {
            gp3 gp3Var2 = this.p;
            if (((tj0) gp3Var2.e).k) {
                al0 al0Var = this.t;
                rr5 rr5Var = (rr5) gp3Var2.c;
                al0Var.d(rr5Var.N, rr5Var.O);
            }
        }
        uha uhaVar = this.m;
        if (uhaVar != null) {
            this.t.f(uhaVar);
        }
        if (n()) {
            this.t.a.setVolume(this.I);
        }
        this.T.getClass();
        AudioDeviceInfo audioDeviceInfo = this.U;
        if (audioDeviceInfo != null) {
            this.t.a.setPreferredDevice(audioDeviceInfo);
        }
        this.F = true;
        int audioSessionId = this.t.a.getAudioSessionId();
        boolean z = audioSessionId != this.R;
        this.R = audioSessionId;
        m6c m6cVar = this.n;
        if (m6cVar != null) {
            Object obj = this.p.e;
            qfc qfcVar = new qfc();
            k47 k47Var = ((qo8) m6cVar.b).V1;
            Handler handler = (Handler) k47Var.b;
            if (handler != null) {
                handler.post(new hk0(k47Var, qfcVar, 7));
            }
            if (z) {
                this.S = true;
                gp3 gp3Var3 = this.p;
                sj0 sj0VarA2 = ((tj0) gp3Var3.e).a();
                sj0VarA2.h = this.R;
                this.p = gp3Var3.c(new tj0(sj0VarA2));
                gp3 gp3Var4 = this.o;
                if (gp3Var4 != null) {
                    sj0 sj0VarA3 = ((tj0) gp3Var4.e).a();
                    sj0VarA3.h = this.R;
                    this.o = gp3Var4.c(new tj0(sj0VarA3));
                }
                m6c m6cVar2 = this.n;
                int i4 = this.R;
                qo8 qo8Var = (qo8) m6cVar2.b;
                if (Build.VERSION.SDK_INT >= 35 && (zi8Var = qo8Var.X1) != null) {
                    zi8Var.v(i4);
                }
                k47 k47Var2 = qo8Var.V1;
                Handler handler2 = (Handler) k47Var2.b;
                if (handler2 != null) {
                    handler2.post(new hw(k47Var2, i4, 1));
                }
            }
        }
        return true;
    }

    public final boolean n() {
        return this.t != null;
    }

    public final void o() {
        this.P = true;
        if (n()) {
            al0 al0Var = this.t;
            dl0 dl0Var = al0Var.e;
            if (dl0Var.u != -9223372036854775807L) {
                dl0Var.b.getClass();
                dl0Var.u = pqf.H(SystemClock.elapsedRealtime());
            }
            dl0Var.j = pqf.L(dl0Var.e, dl0Var.a());
            dl0Var.h.a(0);
            if (!al0Var.j || al0Var.c()) {
                al0Var.a.play();
            }
        }
    }

    public final void p() {
        if (this.N) {
            return;
        }
        this.N = true;
        if (this.t.c()) {
            this.O = false;
        }
        al0 al0Var = this.t;
        if (al0Var.j) {
            return;
        }
        al0Var.j = true;
        dl0 dl0Var = al0Var.e;
        long jB = al0Var.b();
        dl0Var.w = dl0Var.a();
        dl0Var.b.getClass();
        dl0Var.u = pqf.H(SystemClock.elapsedRealtime());
        dl0Var.x = jB;
        al0Var.a.stop();
    }

    public final void q(long j) throws rk0 {
        ByteBuffer byteBuffer;
        d(j);
        if (this.L != null) {
            return;
        }
        if (!this.q.c()) {
            ByteBuffer byteBuffer2 = this.J;
            if (byteBuffer2 != null) {
                u(byteBuffer2);
                d(j);
                return;
            }
            return;
        }
        while (!this.q.b()) {
            do {
                vj0 vj0Var = this.q;
                if (vj0Var.c()) {
                    ByteBuffer byteBuffer3 = vj0Var.c[vj0Var.a()];
                    if (byteBuffer3.hasRemaining()) {
                        byteBuffer = byteBuffer3;
                    } else {
                        vj0Var.d(ak0.a);
                        byteBuffer = vj0Var.c[vj0Var.a()];
                    }
                } else {
                    byteBuffer = ak0.a;
                }
                if (byteBuffer.hasRemaining()) {
                    u(byteBuffer);
                    d(j);
                } else {
                    ByteBuffer byteBuffer4 = this.J;
                    if (byteBuffer4 == null || !byteBuffer4.hasRemaining()) {
                        return;
                    }
                    vj0 vj0Var2 = this.q;
                    ByteBuffer byteBuffer5 = this.J;
                    if (vj0Var2.c() && !vj0Var2.d) {
                        vj0Var2.d(byteBuffer5);
                    }
                }
            } while (this.L == null);
            return;
        }
    }

    public final void r() {
        gp3 gp3Var = this.p;
        if (gp3Var != null) {
            gp3 gp3Var2 = this.o;
            if (gp3Var2 != null) {
                this.p = gp3Var2;
                this.o = null;
                gp3Var = gp3Var2;
            }
            try {
                this.p = this.p.c(((cl0) this.r).c(g((rr5) gp3Var.d)));
            } catch (oj0 e) {
                throw new IllegalStateException(new ok0(e, (rr5) this.p.c));
            }
        }
        f();
    }

    public final void s() {
        f();
        ey6 ey6VarListIterator = this.g.listIterator(0);
        while (ey6VarListIterator.hasNext()) {
            ((ak0) ey6VarListIterator.next()).reset();
        }
        this.e.reset();
        this.f.reset();
        vj0 vj0Var = this.q;
        if (vj0Var != null) {
            jy6 jy6Var = vj0Var.a;
            for (int i = 0; i < jy6Var.size(); i++) {
                ak0 ak0Var = (ak0) jy6Var.get(i);
                ak0Var.e(yj0.d);
                ak0Var.reset();
            }
            vj0Var.b.clear();
            vj0Var.c = new ByteBuffer[0];
            wj0 wj0Var = wj0.e;
            vj0Var.d = false;
        }
        this.P = false;
        this.Y = false;
    }

    public final void t() {
        if (n()) {
            al0 al0Var = this.t;
            nga ngaVar = this.x;
            AudioTrack audioTrack = al0Var.a;
            try {
                audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(pqf.g(ngaVar.a, 0.1f, 8.0f)).setPitch(pqf.g(ngaVar.b, 0.1f, 8.0f)).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e) {
                xo1.W("AudioTrackAudioOutput", "Failed to set playback params", e);
            }
            dl0 dl0Var = al0Var.e;
            dl0Var.i = audioTrack.getPlaybackParams().getSpeed();
            dl0Var.h.a(0);
            dl0Var.e();
            PlaybackParams playbackParams = this.t.a.getPlaybackParams();
            this.x = new nga(playbackParams.getSpeed(), playbackParams.getPitch());
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0243  */
    /* JADX WARN: Code duplicated, block: B:101:0x0250  */
    /* JADX WARN: Code duplicated, block: B:102:0x0267  */
    /* JADX WARN: Code duplicated, block: B:103:0x027a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x027c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0284  */
    /* JADX WARN: Code duplicated, block: B:106:0x028b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0292  */
    /* JADX WARN: Code duplicated, block: B:117:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:0x02a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:0x0061 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1 A[PHI: r9
  0x00c1: PHI (r9v92 double) = (r9v87 double), (r9v99 double) binds: [B:49:0x00f9, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c7 A[PHI: r9
  0x00c7: PHI (r9v88 double) = (r9v87 double), (r9v99 double) binds: [B:49:0x00f9, B:37:0x00bf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:45:0x00e2 A[PHI: r9
  0x00e2: PHI (r9v63 float) = (r9v58 float), (r9v98 float) binds: [B:59:0x018b, B:44:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8 A[PHI: r9
  0x00e8: PHI (r9v59 float) = (r9v58 float), (r9v98 float) binds: [B:59:0x018b, B:44:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:65:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:71:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:73:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:87:0x01da  */
    /* JADX WARN: Code duplicated, block: B:91:0x01ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:95:0x0205 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x0207  */
    /* JADX WARN: Code duplicated, block: B:97:0x0210  */
    /* JADX WARN: Code duplicated, block: B:98:0x0218  */
    /* JADX WARN: Code duplicated, block: B:99:0x0230  */
    public final void u(ByteBuffer byteBuffer) {
        ByteBuffer byteBufferOrder;
        int i;
        byte b;
        int i2;
        int i3;
        int i4;
        float f;
        double d;
        float fG;
        float f2;
        double dMax;
        double d2;
        pa7.J(this.L == null);
        if (byteBuffer.hasRemaining()) {
            if (this.p.g()) {
                int iN = (int) pqf.N(pqf.H(20L), ((tj0) this.p.e).b, 1000000L, RoundingMode.UP);
                long j = j();
                long j2 = iN;
                if (j >= j2) {
                    byteBufferOrder = byteBuffer;
                } else {
                    gp3 gp3Var = this.p;
                    int i5 = ((tj0) gp3Var.e).a;
                    int i6 = gp3Var.b;
                    int i7 = (int) j;
                    byteBufferOrder = ByteBuffer.allocateDirect(byteBuffer.remaining()).order(ByteOrder.nativeOrder());
                    int iPosition = byteBuffer.position();
                    while (byteBuffer.hasRemaining() && i7 < iN) {
                        if (i5 != 2) {
                            if (i5 == 3) {
                                i3 = (byteBuffer.get() & 255) << 24;
                            } else if (i5 == 4) {
                                fG = pqf.g(byteBuffer.getFloat(), -1.0f, 1.0f);
                                if (fG < 0.0f) {
                                    f2 = (-fG) * (-2.1474836E9f);
                                } else {
                                    f2 = fG * 2.1474836E9f;
                                }
                                i3 = (int) f2;
                            } else if (i5 == 21) {
                                i = ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            } else if (i5 != 22) {
                                if (i5 == 268435456) {
                                    i = (byteBuffer.get() & 255) << 24;
                                    i2 = (byteBuffer.get() & 255) << 16;
                                } else if (i5 == 1342177280) {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16);
                                    i2 = (byteBuffer.get() & 255) << 8;
                                } else if (i5 != 1610612736) {
                                    if (i5 == 1879048192) {
                                        dMax = Math.max(-1.0d, Math.min(byteBuffer.getDouble(), 1.0d));
                                        if (dMax < 0.0d) {
                                            d2 = (-dMax) * (-2.147483648E9d);
                                        } else {
                                            d2 = dMax * 2.147483647E9d;
                                        }
                                    } else if (i5 == 1895825408) {
                                        fG = pqf.g(Float.intBitsToFloat(Integer.reverseBytes(byteBuffer.getInt())), -1.0f, 1.0f);
                                        if (fG < 0.0f) {
                                            f2 = (-fG) * (-2.1474836E9f);
                                        } else {
                                            f2 = fG * 2.1474836E9f;
                                        }
                                        i3 = (int) f2;
                                    } else {
                                        if (i5 != 1912602624) {
                                            r3.l();
                                            return;
                                        }
                                        dMax = Math.max(-1.0d, Math.min(Double.longBitsToDouble(Long.reverseBytes(byteBuffer.getLong())), 1.0d));
                                        if (dMax < 0.0d) {
                                            d2 = (-dMax) * (-2.147483648E9d);
                                        } else {
                                            d2 = dMax * 2.147483647E9d;
                                        }
                                    }
                                    i3 = (int) d2;
                                } else {
                                    i = ((byteBuffer.get() & 255) << 24) | ((byteBuffer.get() & 255) << 16) | ((byteBuffer.get() & 255) << 8);
                                    i2 = byteBuffer.get() & 255;
                                }
                                i3 = i | i2;
                            } else {
                                i = (byteBuffer.get() & 255) | ((byteBuffer.get() & 255) << 8) | ((byteBuffer.get() & 255) << 16);
                                b = byteBuffer.get();
                            }
                            i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                            if (i5 != 2) {
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 3) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 4) {
                                if (i5 != 21) {
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 22) {
                                    byteBufferOrder.put((byte) i4);
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                } else if (i5 != 268435456) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                } else if (i5 != 1342177280) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                } else if (i5 != 1610612736) {
                                    byteBufferOrder.put((byte) (i4 >> 24));
                                    byteBufferOrder.put((byte) (i4 >> 16));
                                    byteBufferOrder.put((byte) (i4 >> 8));
                                    byteBufferOrder.put((byte) i4);
                                } else if (i5 != 1879048192) {
                                    if (i5 != 1895825408) {
                                        if (i4 < 0) {
                                            f = (-i4) / (-2.1474836E9f);
                                        } else {
                                            f = i4 / 2.1474836E9f;
                                        }
                                        byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                    } else {
                                        if (i5 == 1912602624) {
                                            r3.l();
                                            return;
                                        }
                                        if (i4 < 0) {
                                            d = (-i4) / (-2.147483648E9d);
                                        } else {
                                            d = ((double) i4) / 2.147483647E9d;
                                        }
                                        byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                    }
                                } else if (i4 < 0) {
                                    byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                                } else {
                                    byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                            } else {
                                byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                            }
                            if (byteBuffer.position() == iPosition + i6) {
                                i7++;
                                iPosition = byteBuffer.position();
                            }
                        } else {
                            i = (byteBuffer.get() & 255) << 16;
                            b = byteBuffer.get();
                        }
                        i2 = (b & 255) << 24;
                        i3 = i | i2;
                        i4 = (int) ((((long) i3) * ((long) i7)) / j2);
                        if (i5 != 2) {
                            byteBufferOrder.put((byte) (i4 >> 16));
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 3) {
                            byteBufferOrder.put((byte) (i4 >> 24));
                        } else if (i5 != 4) {
                            if (i5 != 21) {
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 22) {
                                byteBufferOrder.put((byte) i4);
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 24));
                            } else if (i5 != 268435456) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                            } else if (i5 != 1342177280) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                            } else if (i5 != 1610612736) {
                                byteBufferOrder.put((byte) (i4 >> 24));
                                byteBufferOrder.put((byte) (i4 >> 16));
                                byteBufferOrder.put((byte) (i4 >> 8));
                                byteBufferOrder.put((byte) i4);
                            } else if (i5 != 1879048192) {
                                if (i5 != 1895825408) {
                                    if (i4 < 0) {
                                        f = (-i4) / (-2.1474836E9f);
                                    } else {
                                        f = i4 / 2.1474836E9f;
                                    }
                                    byteBufferOrder.putInt(Integer.reverseBytes(Float.floatToIntBits(f)));
                                } else {
                                    if (i5 == 1912602624) {
                                        r3.l();
                                        return;
                                    }
                                    if (i4 < 0) {
                                        d = (-i4) / (-2.147483648E9d);
                                    } else {
                                        d = ((double) i4) / 2.147483647E9d;
                                    }
                                    byteBufferOrder.putLong(Long.reverseBytes(Double.doubleToLongBits(d)));
                                }
                            } else if (i4 < 0) {
                                byteBufferOrder.putDouble((-i4) / (-2.147483648E9d));
                            } else {
                                byteBufferOrder.putDouble(((double) i4) / 2.147483647E9d);
                            }
                        } else if (i4 < 0) {
                            byteBufferOrder.putFloat((-i4) / (-2.1474836E9f));
                        } else {
                            byteBufferOrder.putFloat(i4 / 2.1474836E9f);
                        }
                        if (byteBuffer.position() == iPosition + i6) {
                            i7++;
                            iPosition = byteBuffer.position();
                        }
                    }
                    byteBufferOrder.put(byteBuffer);
                    byteBufferOrder.flip();
                }
            } else {
                byteBufferOrder = byteBuffer;
            }
            this.L = byteBufferOrder;
        }
    }

    public final void v(long j) {
        long j2;
        gp3 gp3Var = this.p;
        this.q = (vj0) gp3Var.f;
        if (j == -9223372036854775807L) {
            j2 = 0;
        } else {
            j2 = j - this.H;
            if (((gye) gp3Var.g) != gye.a && gp3Var.h != null) {
                eye eyeVar = new eye();
                gp3 gp3Var2 = this.p;
                ((gye) gp3Var2.g).g(gp3Var2.h, eyeVar);
                j2 += eyeVar.e;
            }
        }
        vj0 vj0Var = this.q;
        xj0 xj0Var = new xj0(0);
        gp3 gp3Var3 = this.p;
        xj0Var.b = (gye) gp3Var3.g;
        xj0Var.c = gp3Var3.h;
        xj0Var.a = j2;
        yj0 yj0VarD = xj0Var.d();
        jy6 jy6Var = vj0Var.a;
        ArrayList arrayList = vj0Var.b;
        arrayList.clear();
        vj0Var.d = false;
        for (int i = 0; i < jy6Var.size(); i++) {
            ak0 ak0Var = (ak0) jy6Var.get(i);
            ak0Var.e(yj0VarD);
            if (ak0Var.b()) {
                xj0 xj0Var2 = new xj0();
                long j3 = yj0VarD.a;
                xj0Var2.a = j3;
                xj0Var2.b = yj0VarD.b;
                xj0Var2.c = yj0VarD.c;
                xj0Var2.a = ak0Var.i(j3);
                yj0VarD = xj0Var2.d();
                arrayList.add(ak0Var);
            }
        }
        vj0Var.c = new ByteBuffer[arrayList.size()];
        for (int i2 = 0; i2 <= vj0Var.a(); i2++) {
            vj0Var.c[i2] = ((ak0) arrayList.get(i2)).d();
        }
    }

    public final boolean w() {
        gp3 gp3Var = this.p;
        return gp3Var != null && ((tj0) gp3Var.e).j;
    }
}
