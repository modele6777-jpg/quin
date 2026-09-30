package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qo8 extends wo8 implements no8 {
    public final Context U1;
    public final k47 V1;
    public final jp3 W1;
    public final zi8 X1;
    public int Y1;
    public boolean Z1;
    public rr5 a2;
    public rr5 b2;
    public long c2;
    public boolean d2;
    public boolean e2;
    public boolean f2;
    public boolean g2;
    public int h2;
    public boolean i2;
    public long j2;
    public long k2;
    public boolean l2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo8(Context context, oo8 oo8Var, Handler handler, t45 t45Var, jp3 jp3Var) {
        super(context.getApplicationContext(), 1, oo8Var);
        zi8 zi8Var = Build.VERSION.SDK_INT >= 35 ? new zi8() : null;
        this.U1 = context.getApplicationContext();
        this.W1 = jp3Var;
        this.X1 = zi8Var;
        this.h2 = -1000;
        this.V1 = new k47(12, handler, t45Var);
        this.j2 = -9223372036854775807L;
        this.k2 = -9223372036854775807L;
        this.l2 = false;
    }

    public static yob H0(rr5 rr5Var, boolean z, jp3 jp3Var) {
        if (rr5Var.p == null) {
            ey6 ey6Var = jy6.b;
            return yob.e;
        }
        if (jp3Var.h(rr5Var) != 0) {
            List listE = ap8.e("audio/raw", false, false);
            to8 to8Var = listE.isEmpty() ? null : (to8) listE.get(0);
            if (to8Var != null) {
                return jy6.s(to8Var);
            }
        }
        return ap8.g(rr5Var, z, false);
    }

    @Override // defpackage.wo8
    public final boolean B0(rr5 rr5Var) {
        frb frbVar = this.d;
        frbVar.getClass();
        if (frbVar.a != 0) {
            int iG0 = G0(rr5Var);
            if ((iG0 & 512) != 0) {
                frb frbVar2 = this.d;
                frbVar2.getClass();
                if (frbVar2.a == 2 || (iG0 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 || (rr5Var.N == 0 && rr5Var.O == 0)) {
                    return true;
                }
            }
        }
        return this.W1.h(rr5Var) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    @Override // defpackage.wo8
    public final int C0(rr5 rr5Var) {
        int iG0;
        boolean z;
        boolean z2 = true;
        int iF = hu0.f(1, 0, 0, 0);
        if (!qv8.h(rr5Var.p)) {
            return hu0.f(0, 0, 0, 0);
        }
        int i = rr5Var.T;
        boolean z3 = i != 0;
        boolean z4 = i == 0 || i == 2;
        int i2 = 8;
        jp3 jp3Var = this.W1;
        if (z4) {
            if (z3) {
                List listE = ap8.e("audio/raw", false, false);
                if ((listE.isEmpty() ? null : (to8) listE.get(0)) == null) {
                    iG0 = 0;
                }
            }
            iG0 = G0(rr5Var);
            if (jp3Var.h(rr5Var) != 0) {
                return hu0.f(4, 8, 32, iG0);
            }
        } else {
            iG0 = 0;
        }
        if (!"audio/raw".equals(rr5Var.p) || jp3Var.h(rr5Var) != 0) {
            int i3 = rr5Var.J;
            int i4 = rr5Var.L;
            qr5 qr5Var = new qr5();
            qr5Var.o = qv8.l("audio/raw");
            qr5Var.I = i3;
            qr5Var.K = i4;
            qr5Var.L = 2;
            if (jp3Var.h(new rr5(qr5Var)) != 0) {
                yob yobVarH0 = H0(rr5Var, false, jp3Var);
                if (!yobVarH0.isEmpty()) {
                    if (!z4) {
                        return hu0.f(2, 0, 0, 0);
                    }
                    to8 to8Var = (to8) yobVarH0.get(0);
                    Context context = this.U1;
                    boolean zE = to8Var.e(context, rr5Var);
                    if (!zE) {
                        int i5 = 1;
                        while (true) {
                            if (i5 >= yobVarH0.d) {
                                z = true;
                                z2 = zE;
                                break;
                            }
                            to8 to8Var2 = (to8) yobVarH0.get(i5);
                            if (to8Var2.e(context, rr5Var)) {
                                z = false;
                                to8Var = to8Var2;
                                break;
                            }
                            i5++;
                        }
                    } else {
                        z = true;
                        z2 = zE;
                        break;
                    }
                    int i6 = z2 ? 4 : 3;
                    if (z2 && to8Var.f(rr5Var)) {
                        i2 = 16;
                    }
                    return i6 | i2 | 32 | (to8Var.g ? 64 : 0) | (z ? UserMetadata.MAX_ROLLOUT_ASSIGNMENTS : 0) | iG0;
                }
            }
        }
        return iF;
    }

    public final int G0(rr5 rr5Var) {
        mj0 mj0VarA;
        jp3 jp3Var = this.W1;
        if (jp3Var.Y) {
            mj0VarA = mj0.d;
        } else {
            qj0 qj0VarB = ((cl0) jp3Var.r).b(jp3Var.g(rr5Var));
            lj0 lj0Var = new lj0();
            lj0Var.a = qj0VarB.a;
            lj0Var.b = qj0VarB.b;
            lj0Var.c = qj0VarB.c;
            mj0VarA = lj0Var.a();
        }
        if (!mj0VarA.a) {
            return 0;
        }
        int i = mj0VarA.b ? 1536 : 512;
        return mj0VarA.c ? i | 2048 : i;
    }

    public final void I0() {
        long j;
        long jMax;
        long j2;
        m();
        jp3 jp3Var = this.W1;
        ta0 ta0Var = jp3Var.b;
        if (!jp3Var.n() || jp3Var.F) {
            j = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            long jMin = Math.min(jp3Var.t.a(), pqf.L(((tj0) jp3Var.p.e).b, jp3Var.j()));
            ArrayDeque arrayDeque = jp3Var.h;
            while (!arrayDeque.isEmpty() && jMin >= ((hp3) arrayDeque.getFirst()).c) {
                jp3Var.w = (hp3) arrayDeque.remove();
            }
            hp3 hp3Var = jp3Var.w;
            long jN = jMin - hp3Var.c;
            long jV = pqf.v(jN, hp3Var.a.a);
            if (arrayDeque.isEmpty()) {
                jtd jtdVar = (jtd) ta0Var.b;
                if (!jtdVar.b()) {
                    j = Long.MIN_VALUE;
                } else if (jtdVar.m >= 1024) {
                    long j3 = jtdVar.l;
                    itd itdVar = jtdVar.i;
                    itdVar.getClass();
                    long jO = j3 - ((long) (itdVar.i.o() * (itdVar.j * itdVar.b)));
                    int i = jtdVar.g.a;
                    int i2 = jtdVar.f.a;
                    j = Long.MIN_VALUE;
                    long j4 = jtdVar.m;
                    jN = i == i2 ? pqf.N(jN, jO, j4, RoundingMode.DOWN) : pqf.N(jN, jO * ((long) i), j4 * ((long) i2), RoundingMode.DOWN);
                } else {
                    j = Long.MIN_VALUE;
                    jN = (long) (((double) jtdVar.b) * jN);
                }
                hp3 hp3Var2 = jp3Var.w;
                j2 = hp3Var2.b + jN;
                hp3Var2.d = jN - jV;
            } else {
                j = Long.MIN_VALUE;
                hp3 hp3Var3 = jp3Var.w;
                j2 = hp3Var3.b + jV + hp3Var3.d;
            }
            long j5 = ((tid) ta0Var.d).l;
            jMax = pqf.L(((tj0) jp3Var.p.e).b, j5) + j2;
            long j6 = jp3Var.a0;
            if (j5 > j6) {
                long jL = pqf.L(((tj0) jp3Var.p.e).b, j5 - j6);
                jp3Var.a0 = j5;
                jp3Var.b0 += jL;
                Handler handler = jp3Var.c0;
                if (handler == null) {
                    handler = new Handler(Looper.myLooper());
                    jp3Var.c0 = handler;
                }
                handler.removeCallbacksAndMessages(null);
                jp3Var.c0.postDelayed(new j1(21, jp3Var), 100L);
            }
        }
        if (jMax != j) {
            if (!this.d2) {
                jMax = Math.max(this.c2, jMax);
            }
            this.c2 = jMax;
            this.d2 = false;
        }
    }

    @Override // defpackage.wo8
    public final vm3 J(to8 to8Var, rr5 rr5Var, rr5 rr5Var2, boolean z) {
        vm3 vm3VarB = to8Var.b(rr5Var, rr5Var2);
        int i = vm3VarB.e;
        if (this.V0 == null && B0(rr5Var2)) {
            i |= 32768;
        }
        "OMX.google.raw.decoder".equals(to8Var.a);
        if (rr5Var2.q > this.Y1) {
            i |= 64;
        }
        int i2 = i;
        return new vm3(to8Var.a, rr5Var, rr5Var2, i2 != 0 ? 0 : vm3VarB.d, i2);
    }

    @Override // defpackage.wo8
    public final float S(float f, rr5 rr5Var, rr5[] rr5VarArr) {
        MediaFormat mediaFormat;
        int integer = -1;
        for (rr5 rr5Var2 : rr5VarArr) {
            int i = rr5Var2.L;
            if (i != -1) {
                integer = Math.max(integer, i);
            }
        }
        if (integer == -1 && (mediaFormat = this.c1) != null && mediaFormat.containsKey("sample-rate")) {
            integer = mediaFormat.getInteger("sample-rate");
        }
        if (integer == -1) {
            return -1.0f;
        }
        return integer * f;
    }

    @Override // defpackage.wo8
    public final ArrayList T(rr5 rr5Var, boolean z) {
        yob yobVarH0 = H0(rr5Var, z, this.W1);
        HashMap map = ap8.a;
        ArrayList arrayList = new ArrayList(yobVarH0);
        Collections.sort(arrayList, new va2(1, new bo1(15, this.U1, rr5Var)));
        return arrayList;
    }

    @Override // defpackage.wo8
    public final long U(long j, long j2, boolean z) {
        long jN;
        jp3 jp3Var = this.W1;
        boolean z2 = jp3Var.l() && this.j2 != -9223372036854775807L;
        if (this.i2) {
            if (!jp3Var.n()) {
                jN = -9223372036854775807L;
            } else if (jp3Var.p.g()) {
                jN = pqf.L(((tj0) jp3Var.p.e).b, jp3Var.t.a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = jp3Var.t.a.getBufferSizeInFrames();
                int iD = rs0.D(((tj0) jp3Var.p.e).a);
                pa7.J(iD != -2147483647);
                jN = pqf.N(bufferSizeInFrames, 1000000L, iD, RoundingMode.DOWN);
            }
            if (this.g2 && z2 && jN != -9223372036854775807L) {
                float fMin = Math.min(jN, this.j2 - j);
                nga ngaVar = jp3Var.x;
                return Math.max(10000L, (long) ((fMin / (ngaVar != null ? ngaVar.a : 1.0f)) / 2.0f));
            }
        } else if (z2 || this.F1) {
            return 1000000L;
        }
        return 10000L;
    }

    @Override // defpackage.wo8
    public final hbc W(to8 to8Var, rr5 rr5Var, MediaCrypto mediaCrypto, float f) {
        int iIntValue;
        Integer num;
        rr5[] rr5VarArr = this.x;
        rr5VarArr.getClass();
        String str = to8Var.a;
        "OMX.google.raw.decoder".equals(str);
        int iMax = rr5Var.q;
        String str2 = rr5Var.p;
        int i = rr5Var.J;
        int i2 = 0;
        if (rr5VarArr.length != 1) {
            for (rr5 rr5Var2 : rr5VarArr) {
                if (to8Var.b(rr5Var, rr5Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    iMax = Math.max(iMax, rr5Var2.q);
                }
            }
        }
        this.Y1 = iMax;
        HashSet hashSet = pp8.a;
        this.Z1 = str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
        String str3 = to8Var.c;
        int i3 = this.Y1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i);
        int i4 = rr5Var.L;
        mediaFormat.setInteger("sample-rate", i4);
        jgb.g0(mediaFormat, rr5Var.s);
        jgb.a0(mediaFormat, "max-input-size", i3);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair pairB = d72.b(rr5Var);
            if (pairB != null) {
                jgb.a0(mediaFormat, "profile", ((Integer) pairB.first).intValue());
                jgb.a0(mediaFormat, "level", ((Integer) pairB.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        qr5 qr5Var = new qr5();
        qr5Var.o = qv8.l("audio/raw");
        qr5Var.I = i;
        qr5Var.K = i4;
        qr5Var.L = 4;
        rr5 rr5Var3 = new rr5(qr5Var);
        jp3 jp3Var = this.W1;
        if (jp3Var.h(rr5Var3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i5 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.h2));
        }
        rr5 rr5Var4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            uj0 uj0Var = jp3Var.r;
            bj0 bj0Var = uj0Var instanceof cl0 ? ((cl0) uj0Var).g : null;
            int i6 = 12;
            if (bj0Var == null) {
                xo1.V("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                ry6 ry6Var = zt6.a;
                Iterator it = bj0Var.d.iterator();
                do {
                    if (!it.hasNext()) {
                        iIntValue = 0;
                        break;
                    }
                    num = (Integer) it.next();
                    iIntValue = num.intValue();
                } while (!zt6.a.contains(num));
                if (iIntValue != 0) {
                    i6 = iIntValue;
                } else {
                    for (Integer num2 : bj0Var.c) {
                        int iIntValue2 = num2.intValue();
                        if (zt6.a.contains(num2)) {
                            i2 = iIntValue2;
                            break;
                        }
                    }
                    if (i2 != 0) {
                        i6 = i2;
                    }
                }
                int iBitCount = Integer.bitCount(i6);
                mediaFormat.setInteger("channel-mask", i6);
                mediaFormat.setInteger("max-output-channel-count", iBitCount);
            }
        }
        H(mediaFormat);
        if ("audio/raw".equals(to8Var.b) && !"audio/raw".equals(str2)) {
            rr5Var4 = rr5Var;
        }
        this.b2 = rr5Var4;
        return new hbc(to8Var, mediaFormat, rr5Var, null, mediaCrypto, this.X1);
    }

    @Override // defpackage.wo8
    public final void X(tm3 tm3Var) {
        rr5 rr5Var;
        gp3 gp3Var;
        if (Build.VERSION.SDK_INT < 29 || (rr5Var = tm3Var.c) == null || !Objects.equals(rr5Var.p, "audio/opus") || !this.s1) {
            return;
        }
        ByteBuffer byteBuffer = tm3Var.v;
        byteBuffer.getClass();
        rr5 rr5Var2 = tm3Var.c;
        rr5Var2.getClass();
        int i = rr5Var2.N;
        if (byteBuffer.remaining() == 8) {
            int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
            jp3 jp3Var = this.W1;
            al0 al0Var = jp3Var.t;
            if (al0Var == null || !al0Var.c() || (gp3Var = jp3Var.p) == null || !((tj0) gp3Var.e).k) {
                return;
            }
            jp3Var.t.d(i, i2);
        }
    }

    @Override // defpackage.no8
    public final void a(nga ngaVar) {
        jp3 jp3Var = this.W1;
        if (jp3Var.w()) {
            jp3Var.x = ngaVar;
            jp3Var.t();
            return;
        }
        nga ngaVar2 = new nga(pqf.g(ngaVar.a, 0.1f, 8.0f), pqf.g(ngaVar.b, 0.1f, 8.0f));
        jp3Var.x = ngaVar2;
        hp3 hp3Var = new hp3(ngaVar2, -9223372036854775807L, -9223372036854775807L);
        if (jp3Var.n()) {
            jp3Var.v = hp3Var;
        } else {
            jp3Var.w = hp3Var;
        }
    }

    @Override // defpackage.no8
    public final long b() {
        if (this.v == 2) {
            I0();
        }
        return this.c2;
    }

    @Override // defpackage.no8
    public final boolean c() {
        boolean z = this.f2;
        this.f2 = false;
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    @Override // defpackage.wo8, defpackage.hu0, defpackage.vha
    public final void d(int i, Object obj) {
        zi8 zi8Var;
        jp3 jp3Var = this.W1;
        if (i == 2) {
            obj.getClass();
            float fFloatValue = ((Float) obj).floatValue();
            if (jp3Var.I != fFloatValue) {
                jp3Var.I = fFloatValue;
                if (jp3Var.n()) {
                    jp3Var.t.a.setVolume(jp3Var.I);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 3) {
            xi0 xi0Var = (xi0) obj;
            xi0Var.getClass();
            if (jp3Var.u.equals(xi0Var)) {
                return;
            }
            jp3Var.u = xi0Var;
            if (jp3Var.W) {
                return;
            }
            jp3Var.r();
            return;
        }
        if (i == 6) {
            dr0 dr0Var = (dr0) obj;
            dr0Var.getClass();
            if (jp3Var.T.equals(dr0Var)) {
                return;
            }
            if (jp3Var.t != null) {
                jp3Var.T.getClass();
            }
            jp3Var.T = dr0Var;
            return;
        }
        if (i == 12) {
            AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
            jp3Var.U = audioDeviceInfo;
            al0 al0Var = jp3Var.t;
            if (al0Var != null) {
                al0Var.a.setPreferredDevice(audioDeviceInfo);
                return;
            }
            return;
        }
        if (i == 16) {
            obj.getClass();
            this.h2 = ((Integer) obj).intValue();
            po8 po8Var = this.a1;
            if (po8Var != null && Build.VERSION.SDK_INT >= 35) {
                Bundle bundle = new Bundle();
                bundle.putInt("importance", Math.max(0, -this.h2));
                po8Var.b(bundle);
                return;
            }
            return;
        }
        if (i == 9) {
            obj.getClass();
            jp3Var.y = ((Boolean) obj).booleanValue();
            hp3 hp3Var = new hp3(jp3Var.w() ? nga.d : jp3Var.x, -9223372036854775807L, -9223372036854775807L);
            if (jp3Var.n()) {
                jp3Var.v = hp3Var;
                return;
            } else {
                jp3Var.w = hp3Var;
                return;
            }
        }
        if (i == 10) {
            obj.getClass();
            int iIntValue = ((Integer) obj).intValue();
            if (jp3Var.S) {
                if (jp3Var.R == iIntValue) {
                    jp3Var.S = false;
                    if (jp3Var.R != iIntValue) {
                        jp3Var.R = iIntValue;
                        jp3Var.Q = iIntValue != 0;
                        jp3Var.r();
                    }
                }
            } else if (jp3Var.R != iIntValue) {
                jp3Var.R = iIntValue;
                jp3Var.Q = iIntValue != 0;
                jp3Var.r();
            }
            if (Build.VERSION.SDK_INT < 35 || (zi8Var = this.X1) == null) {
                return;
            }
            zi8Var.v(iIntValue);
            return;
        }
        if (i == 19) {
            obj.getClass();
            int iIntValue2 = ((Integer) obj).intValue();
            AtomicInteger atomicInteger = jp3.d0;
            if (iIntValue2 == 0 || iIntValue2 == -1) {
                iIntValue2 = -1;
            }
            if (jp3Var.V == iIntValue2) {
                return;
            }
            jp3Var.V = iIntValue2;
            jp3Var.r();
            return;
        }
        if (i != 20) {
            super.d(i, obj);
            return;
        }
        obj.getClass();
        uj0 uj0Var = (uj0) obj;
        if (uj0Var.equals(jp3Var.r)) {
            return;
        }
        ((cl0) jp3Var.r).d();
        jp3Var.r = uj0Var;
        cp3 cp3Var = jp3Var.s;
        if (cp3Var != null) {
            cl0 cl0Var = (cl0) uj0Var;
            cl0Var.f();
            f98 f98Var = cl0Var.e;
            if (f98Var == null) {
                f98Var = new f98(Thread.currentThread());
                cl0Var.e = f98Var;
            }
            f98Var.a(cp3Var);
        }
        jp3Var.r();
    }

    @Override // defpackage.wo8
    public final void d0(Exception exc) {
        xo1.y("MediaCodecAudioRenderer", "Audio codec error", exc);
        k47 k47Var = this.V1;
        Handler handler = (Handler) k47Var.b;
        if (handler != null) {
            handler.post(new hk0(k47Var, exc, 0));
        }
    }

    @Override // defpackage.no8
    public final nga e() {
        return this.W1.x;
    }

    @Override // defpackage.wo8
    public final void e0(String str, long j, long j2) {
        k47 k47Var = this.V1;
        Handler handler = (Handler) k47Var.b;
        if (handler != null) {
            handler.post(new hk0(k47Var, str, j, j2));
        }
    }

    @Override // defpackage.wo8
    public final void f0(b72 b72Var) {
        k47 k47Var = this.V1;
        Handler handler = (Handler) k47Var.b;
        if (handler != null) {
            handler.post(new fe(10, k47Var, b72Var));
        }
    }

    @Override // defpackage.wo8
    public final void g0(String str) {
        k47 k47Var = this.V1;
        Handler handler = (Handler) k47Var.b;
        if (handler != null) {
            handler.post(new hk0(k47Var, str, 5));
        }
    }

    @Override // defpackage.wo8
    public final vm3 h0(fz3 fz3Var) {
        rr5 rr5Var = (rr5) fz3Var.c;
        rr5Var.getClass();
        this.a2 = rr5Var;
        vm3 vm3VarH0 = super.h0(fz3Var);
        k47 k47Var = this.V1;
        Handler handler = (Handler) k47Var.b;
        if (handler != null) {
            handler.post(new hk0(k47Var, rr5Var, vm3VarH0));
        }
        return vm3VarH0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00fd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:66:0x0101  */
    @Override // defpackage.wo8
    public final void i0(rr5 rr5Var, MediaFormat mediaFormat) throws g45 {
        int iW;
        int integer;
        zp8 zp8Var;
        boolean z;
        rr5 rr5Var2 = this.b2;
        cy6 cy6Var = null;
        if (rr5Var2 != null) {
            rr5Var = rr5Var2;
        } else if (this.a1 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(rr5Var.p)) {
                iW = rr5Var.M;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                iW = mediaFormat.getInteger("pcm-encoding");
            } else {
                iW = mediaFormat.containsKey("v-bits-per-sample") ? pqf.w(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN) : 2;
            }
            int integer2 = mediaFormat.getInteger("channel-count");
            int i = rr5Var.K;
            if (i == -1 || rr5Var.J != integer2) {
                i = -1;
            }
            if (mediaFormat.containsKey("channel-mask") && (integer = mediaFormat.getInteger("channel-mask")) != 0 && Integer.bitCount(integer) == integer2) {
                i = integer;
            }
            qr5 qr5Var = new qr5();
            qr5Var.o = qv8.l("audio/raw");
            qr5Var.L = iW;
            qr5Var.M = rr5Var.N;
            qr5Var.N = rr5Var.O;
            qr5Var.l = rr5Var.m;
            qr5Var.a = rr5Var.a;
            qr5Var.b = rr5Var.b;
            qr5Var.c = jy6.o(rr5Var.c);
            qr5Var.d = rr5Var.d;
            qr5Var.e = rr5Var.e;
            qr5Var.f = rr5Var.f;
            qr5Var.I = integer2;
            qr5Var.J = i;
            qr5Var.K = mediaFormat.getInteger("sample-rate");
            rr5Var = new rr5(qr5Var);
            if (this.Z1) {
                int i2 = rr5Var.J;
                if (i2 == 3) {
                    cy6Var = dzf.a;
                } else if (i2 == 5) {
                    cy6Var = dzf.b;
                } else if (i2 == 6) {
                    cy6Var = dzf.c;
                } else if (i2 == 7) {
                    cy6Var = dzf.d;
                } else if (i2 != 8) {
                    cy6 cy6Var2 = dzf.a;
                } else {
                    cy6Var = dzf.e;
                }
            }
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            boolean z2 = true;
            jp3 jp3Var = this.W1;
            if (i3 >= 29) {
                if (this.s1) {
                    frb frbVar = this.d;
                    frbVar.getClass();
                    if (frbVar.a != 0) {
                        frb frbVar2 = this.d;
                        frbVar2.getClass();
                        int i4 = frbVar2.a;
                        pa7.J(i3 >= 29);
                        jp3Var.i = i4;
                    } else {
                        if (i3 >= 29) {
                            z = true;
                        } else {
                            z = false;
                        }
                        pa7.J(z);
                        jp3Var.i = 0;
                    }
                } else {
                    if (i3 >= 29) {
                        z = true;
                    } else {
                        z = false;
                    }
                    pa7.J(z);
                    jp3Var.i = 0;
                }
            }
            szc szcVar = new szc(rr5Var);
            szcVar.c = cy6Var;
            gye gyeVar = this.E0;
            szcVar.d = gyeVar;
            szcVar.e = this.F0;
            if (!gyeVar.p() && (zp8Var = (zp8) szcVar.e) != null) {
                if (((gye) szcVar.d).b(zp8Var.a) == -1) {
                    z2 = false;
                }
                pa7.A(z2);
            }
            jp3Var.c(new nk0(szcVar));
            D0(this.b1);
        } catch (ok0 e) {
            throw g(e, e.format, false, 5001);
        }
    }

    @Override // defpackage.wo8
    public final void j0(long j) {
        this.W1.H = j;
    }

    @Override // defpackage.hu0
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.wo8
    public final void l0() {
        this.W1.E = true;
    }

    @Override // defpackage.hu0
    public final boolean m() {
        if (!this.F1) {
            return false;
        }
        jp3 jp3Var = this.W1;
        if (jp3Var.n()) {
            return jp3Var.M && !jp3Var.l();
        }
        return true;
    }

    @Override // defpackage.hu0
    public final boolean o() {
        boolean zA;
        if (this.W1.l()) {
            this.k2 = -9223372036854775807L;
            this.l2 = true;
            return true;
        }
        if (!this.l2 || !this.i2) {
            return false;
        }
        if (l()) {
            zA = this.Y;
        } else {
            occ occVar = this.w;
            occVar.getClass();
            zA = occVar.a();
        }
        if (!zA || l()) {
            return false;
        }
        this.g.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = this.k2;
        if (j != -9223372036854775807L) {
            return jElapsedRealtime - j < 100;
        }
        this.k2 = jElapsedRealtime;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    @Override // defpackage.wo8
    public final boolean o0(long j, long j2, po8 po8Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, rr5 rr5Var) throws g45 {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.j2 = -9223372036854775807L;
        if (this.b2 != null && (i2 & 2) != 0) {
            po8Var.getClass();
            po8Var.f(i);
            return true;
        }
        jp3 jp3Var = this.W1;
        if (z) {
            if (po8Var != null) {
                po8Var.f(i);
            }
            this.J1.f += i3;
            jp3Var.E = true;
            return true;
        }
        try {
            if (!jp3Var.k(i3, j3, byteBuffer)) {
                this.j2 = j3;
                return false;
            }
            if (po8Var != null) {
                po8Var.f(i);
            }
            this.J1.e += i3;
            return true;
        } catch (pk0 e) {
            rr5 rr5Var2 = this.a2;
            boolean z3 = e.isRecoverable;
            if (this.s1) {
                frb frbVar = this.d;
                frbVar.getClass();
                if (frbVar.a != 0) {
                    i5 = 5004;
                } else {
                    i5 = 5001;
                }
            } else {
                i5 = 5001;
            }
            throw g(e, rr5Var2, z3, i5);
        } catch (rk0 e2) {
            boolean z4 = e2.isRecoverable;
            if (this.s1) {
                frb frbVar2 = this.d;
                frbVar2.getClass();
                if (frbVar2.a != 0) {
                    i4 = 5003;
                } else {
                    i4 = 5002;
                }
            } else {
                i4 = 5002;
            }
            throw g(e2, rr5Var, z4, i4);
        }
    }

    @Override // defpackage.wo8, defpackage.hu0
    public final void p() {
        k47 k47Var = this.V1;
        this.e2 = true;
        this.a2 = null;
        this.j2 = -9223372036854775807L;
        this.g2 = false;
        try {
            this.W1.f();
            try {
                super.p();
            } finally {
                k47Var.y(this.J1);
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
                k47Var.y(this.J1);
            }
        }
    }

    @Override // defpackage.hu0
    public final void q(boolean z, boolean z2) {
        qm3 qm3Var = new qm3();
        this.J1 = qm3Var;
        k47 k47Var = this.V1;
        Handler handler = (Handler) k47Var.b;
        if (handler != null) {
            handler.post(new hk0(k47Var, qm3Var, 6));
        }
        frb frbVar = this.d;
        frbVar.getClass();
        boolean z3 = frbVar.b;
        jp3 jp3Var = this.W1;
        if (z3) {
            pa7.J(jp3Var.Q);
            if (!jp3Var.W) {
                jp3Var.W = true;
                jp3Var.r();
            }
        } else if (jp3Var.W) {
            jp3Var.W = false;
            jp3Var.r();
        }
        uha uhaVar = this.f;
        uhaVar.getClass();
        jp3Var.m = uhaVar;
        ece eceVar = this.g;
        eceVar.getClass();
        ((cl0) jp3Var.r).f = eceVar;
        jp3Var.n = new m6c(23, this);
    }

    @Override // defpackage.wo8, defpackage.hu0
    public final void r(long j, boolean z, boolean z2) {
        super.r(j, z, z2);
        this.W1.f();
        this.c2 = j;
        this.j2 = -9223372036854775807L;
        this.k2 = -9223372036854775807L;
        this.l2 = false;
        this.f2 = false;
        this.g2 = false;
        this.d2 = true;
    }

    @Override // defpackage.wo8
    public final void r0() throws g45 {
        try {
            jp3 jp3Var = this.W1;
            if (!jp3Var.M && jp3Var.n() && jp3Var.e()) {
                jp3Var.p();
                jp3Var.M = true;
            }
            long j = this.K1.h;
            if (j != -9223372036854775807L) {
                this.j2 = j;
            }
        } catch (rk0 e) {
            throw g(e, e.format, e.isRecoverable, this.s1 ? 5003 : 5002);
        }
    }

    @Override // defpackage.hu0
    public final void s() {
        zi8 zi8Var;
        ((cl0) this.W1.r).d();
        if (Build.VERSION.SDK_INT < 35 || (zi8Var = this.X1) == null) {
            return;
        }
        zi8Var.a();
    }

    @Override // defpackage.hu0
    public final void t() {
        jp3 jp3Var = this.W1;
        this.f2 = false;
        this.g2 = false;
        this.j2 = -9223372036854775807L;
        try {
            try {
                this.s1 = false;
                s0();
                q0();
                ssg ssgVar = this.V0;
                if (ssgVar != null) {
                    ssgVar.M(null);
                }
                this.V0 = null;
                if (this.e2) {
                    this.e2 = false;
                    jp3Var.s();
                }
            } catch (Throwable th) {
                ssg ssgVar2 = this.V0;
                if (ssgVar2 != null) {
                    ssgVar2.M(null);
                }
                this.V0 = null;
                throw th;
            }
        } catch (Throwable th2) {
            if (this.e2) {
                this.e2 = false;
                jp3Var.s();
            }
            throw th2;
        }
    }

    @Override // defpackage.hu0
    public final void u() {
        this.W1.o();
        this.i2 = true;
    }

    @Override // defpackage.hu0
    public final void v() {
        I0();
        this.i2 = false;
        jp3 jp3Var = this.W1;
        jp3Var.P = false;
        if (jp3Var.n()) {
            al0 al0Var = jp3Var.t;
            dl0 dl0Var = al0Var.e;
            dl0Var.e();
            if (dl0Var.u == -9223372036854775807L) {
                dl0Var.h.a(0);
            }
            dl0Var.w = dl0Var.a();
            if (!al0Var.j || al0Var.c()) {
                al0Var.a.pause();
            }
        }
        this.g2 = false;
        this.k2 = -9223372036854775807L;
        this.l2 = false;
    }

    @Override // defpackage.hu0
    public final no8 j() {
        return this;
    }
}
