package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cl0 implements uj0 {
    public static final u8e k = vtb.r(new bl0(0));
    public final Context a;
    public final ndb b;
    public final dp3 c;
    public final ssg d;
    public f98 e;
    public ece f;
    public bj0 g;
    public ej0 h;
    public Looper i;
    public Context j;

    public cl0(szc szcVar) {
        Context context = (Context) szcVar.b;
        this.a = context;
        dp3 dp3Var = (dp3) szcVar.c;
        dp3Var.getClass();
        this.c = dp3Var;
        this.b = (ndb) szcVar.d;
        this.g = (bj0) szcVar.e;
        this.d = context == null ? null : new ssg(4, this);
        this.f = ece.a;
    }

    public final al0 a(tj0 tj0Var) throws rj0 {
        Context context;
        Context context2;
        try {
            int i = tj0Var.h;
            int i2 = tj0Var.i;
            if (i2 == -1 || (context2 = this.a) == null || Build.VERSION.SDK_INT < 34) {
                context = null;
            } else {
                Context context3 = this.j;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.j = context2.createDeviceContext(i2);
                }
                context = this.j;
                i = 0;
            }
            try {
                AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(tj0Var.d ? new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build() : tj0Var.g.a()).setAudioFormat(new AudioFormat.Builder().setSampleRate(tj0Var.b).setChannelMask(tj0Var.c).setEncoding(tj0Var.a).build()).setTransferMode(1).setBufferSizeInBytes(tj0Var.f).setSessionId(i);
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 29) {
                    sessionId.setOffloadedPlayback(tj0Var.e);
                }
                if (i3 >= 34 && context != null) {
                    sessionId.setContext(context);
                }
                AudioTrack audioTrackBuild = sessionId.build();
                if (audioTrackBuild.getState() == 1) {
                    return new al0(audioTrackBuild, tj0Var, this.d, this.f);
                }
                try {
                    audioTrackBuild.release();
                } catch (Exception unused) {
                }
                throw new rj0();
            } catch (IllegalArgumentException e) {
                e = e;
                throw new rj0(e);
            }
        } catch (IllegalArgumentException | UnsupportedOperationException e2) {
            e = e2;
        }
    }

    public final qj0 b(pj0 pj0Var) {
        e(pj0Var);
        rr5 rr5Var = pj0Var.a;
        xi0 xi0Var = pj0Var.b;
        mj0 mj0VarA = ((so3) this.c).a(xi0Var, rr5Var);
        qj0 qj0Var = new qj0();
        int i = 0;
        qj0Var.d = 0;
        String str = rr5Var.p;
        int i2 = rr5Var.M;
        if (!Objects.equals(str, "audio/raw") ? this.g.c(xi0Var, rr5Var) != null : i2 == 2) {
            i = 2;
        }
        qj0Var.d = i;
        boolean z = mj0VarA.a;
        qj0Var.a = z;
        boolean z2 = mj0VarA.b;
        qj0Var.b = z2;
        boolean z3 = mj0VarA.c;
        qj0Var.c = z3;
        if (!z && (z2 || z3)) {
            qc0.p("Secondary offload attribute fields are true but primary isFormatSupportedForOffload is false");
            return null;
        }
        qj0 qj0Var2 = new qj0();
        qj0Var2.a = qj0Var.a;
        qj0Var2.b = qj0Var.b;
        qj0Var2.c = qj0Var.c;
        qj0Var2.d = qj0Var.d;
        return qj0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:46:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:55:0x00db  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:64:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:67:0x0100  */
    /* JADX WARN: Code duplicated, block: B:70:0x0113  */
    /* JADX WARN: Code duplicated, block: B:72:0x0118  */
    /* JADX WARN: Code duplicated, block: B:74:0x0120  */
    /* JADX WARN: Code duplicated, block: B:75:0x0123  */
    /* JADX WARN: Code duplicated, block: B:77:0x0134  */
    /* JADX WARN: Code duplicated, block: B:80:0x016c  */
    /* JADX WARN: Code duplicated, block: B:81:0x016e  */
    public final tj0 c(pj0 pj0Var) throws oj0 {
        char c;
        int iQ;
        boolean z;
        boolean z2;
        int i;
        int minBufferSize;
        boolean z3;
        double d;
        boolean z4;
        int iB;
        boolean z5;
        boolean z6;
        int iD;
        boolean z7;
        int i2;
        int iD2;
        boolean z8;
        int iN;
        rr5 rr5Var = pj0Var.a;
        boolean z9 = pj0Var.d;
        xi0 xi0Var = pj0Var.b;
        e(pj0Var);
        String str = rr5Var.p;
        int iIntValue = rr5Var.K;
        int i3 = rr5Var.J;
        int i4 = rr5Var.L;
        int iIntValue2 = rr5Var.M;
        if (!Objects.equals(str, "audio/raw")) {
            mj0 mj0VarA = z9 ? ((so3) this.c).a(xi0Var, rr5Var) : mj0.d;
            if (z9 && mj0VarA.a) {
                str.getClass();
                int iB2 = qv8.b(str, rr5Var.l);
                if (iIntValue == -1) {
                    iIntValue = pqf.p(i3);
                }
                if ((iB2 == 11 || iB2 == 12) && i4 >= 16000 && !((Boolean) k.get()).booleanValue()) {
                    if (iB2 == 12 && i3 == 2) {
                        iIntValue = 4;
                    }
                    i4 /= 2;
                    iB2 = 10;
                }
                z = mj0VarA.b;
                iIntValue2 = iB2;
                iQ = -1;
                c = 1;
                z2 = true;
            } else {
                Pair pairC = this.g.c(xi0Var, rr5Var);
                if (pairC == null) {
                    throw new oj0("Unable to configure passthrough for: " + rr5Var);
                }
                iIntValue2 = ((Integer) pairC.first).intValue();
                iIntValue = ((Integer) pairC.second).intValue();
                c = 2;
                iQ = -1;
                z = false;
            }
            i = rr5Var.k;
            if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr") && i == -1) {
                i = 768000;
            }
            minBufferSize = AudioTrack.getMinBufferSize(i4, iIntValue, iIntValue2);
            if (minBufferSize != -2) {
                z3 = true;
            } else {
                z3 = false;
            }
            pa7.J(z3);
            if (iQ == -1) {
                iQ = 1;
            }
            if (z2) {
                d = 8.0d;
            } else {
                d = 1.0d;
            }
            this.b.getClass();
            if (c != 0) {
                z4 = true;
                iB = rxg.B(((500000 * ((long) i4)) * ((long) iQ)) / 1000000);
            } else if (c != 1) {
                z4 = true;
                iD = rs0.D(iIntValue2);
                if (iD != -2147483647) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                pa7.J(z7);
                iB = rxg.B((50000000 * ((long) iD)) / 1000000);
            } else {
                if (c == 2) {
                    cva.s();
                    return null;
                }
                if (iIntValue2 == 5) {
                    i2 = 500000;
                } else if (iIntValue2 == 8) {
                    i2 = 1000000;
                } else {
                    i2 = 250000;
                }
                if (i != -1) {
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    iN = od4.n(i, 8);
                } else {
                    iD2 = rs0.D(iIntValue2);
                    if (iD2 != -2147483647) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    pa7.J(z8);
                    iN = iD2;
                }
                z4 = true;
                iB = rxg.B((((long) i2) * ((long) iN)) / 1000000);
            }
            int iMax = (((Math.max(minBufferSize, (int) (((double) iB) * d)) + iQ) - 1) / iQ) * iQ;
            sj0 sj0Var = new sj0();
            xi0 xi0Var2 = xi0.b;
            sj0Var.i = -1;
            sj0Var.b = i4;
            sj0Var.c = iIntValue;
            sj0Var.a = iIntValue2;
            sj0Var.f = iMax;
            sj0Var.h = pj0Var.e;
            sj0Var.g = xi0Var;
            z5 = z4;
            if (c == z5) {
                z6 = z5;
            } else {
                z6 = false;
            }
            sj0Var.e = z6;
            sj0Var.d = pj0Var.g;
            sj0Var.j = z2;
            sj0Var.k = z;
            sj0Var.i = pj0Var.f;
            return new tj0(sj0Var);
        }
        pa7.A(pqf.E(iIntValue2));
        if (iIntValue == -1) {
            iIntValue = pqf.p(i3);
        }
        iQ = pqf.q(iIntValue2) * i3;
        z = false;
        c = 0;
        z2 = false;
        i = rr5Var.k;
        if (Objects.equals(str, "audio/vnd.dts.hd;profile=lbr")) {
            i = 768000;
        }
        minBufferSize = AudioTrack.getMinBufferSize(i4, iIntValue, iIntValue2);
        if (minBufferSize != -2) {
            z3 = true;
        } else {
            z3 = false;
        }
        pa7.J(z3);
        if (iQ == -1) {
            iQ = 1;
        }
        if (z2) {
            d = 8.0d;
        } else {
            d = 1.0d;
        }
        this.b.getClass();
        if (c != 0) {
            z4 = true;
            iB = rxg.B(((500000 * ((long) i4)) * ((long) iQ)) / 1000000);
        } else if (c != 1) {
            z4 = true;
            iD = rs0.D(iIntValue2);
            if (iD != -2147483647) {
                z7 = true;
            } else {
                z7 = false;
            }
            pa7.J(z7);
            iB = rxg.B((50000000 * ((long) iD)) / 1000000);
        } else {
            if (c == 2) {
                cva.s();
                return null;
            }
            if (iIntValue2 == 5) {
                i2 = 500000;
            } else if (iIntValue2 == 8) {
                i2 = 1000000;
            } else {
                i2 = 250000;
            }
            if (i != -1) {
                RoundingMode roundingMode2 = RoundingMode.CEILING;
                iN = od4.n(i, 8);
            } else {
                iD2 = rs0.D(iIntValue2);
                if (iD2 != -2147483647) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                pa7.J(z8);
                iN = iD2;
            }
            z4 = true;
            iB = rxg.B((((long) i2) * ((long) iN)) / 1000000);
        }
        int iMax2 = (((Math.max(minBufferSize, (int) (((double) iB) * d)) + iQ) - 1) / iQ) * iQ;
        sj0 sj0Var2 = new sj0();
        xi0 xi0Var3 = xi0.b;
        sj0Var2.i = -1;
        sj0Var2.b = i4;
        sj0Var2.c = iIntValue;
        sj0Var2.a = iIntValue2;
        sj0Var2.f = iMax2;
        sj0Var2.h = pj0Var.e;
        sj0Var2.g = xi0Var;
        z5 = z4;
        if (c == z5) {
            z6 = z5;
        } else {
            z6 = false;
        }
        sj0Var2.e = z6;
        sj0Var2.d = pj0Var.g;
        sj0Var2.j = z2;
        sj0Var2.k = z;
        sj0Var2.i = pj0Var.f;
        return new tj0(sj0Var2);
    }

    public final void d() {
        iud iudVar;
        f98 f98Var = this.e;
        if (f98Var != null) {
            f98Var.d();
        }
        ej0 ej0Var = this.h;
        if (ej0Var != null) {
            Context context = (Context) ej0Var.b;
            if (ej0Var.a) {
                ej0Var.w = null;
                kj0.d0(context).unregisterAudioDeviceCallback((cj0) ej0Var.e);
                if (Build.VERSION.SDK_INT >= 32 && (iudVar = (iud) ej0Var.v) != null) {
                    iudVar.e();
                    ej0Var.v = null;
                }
                context.unregisterReceiver((n80) ej0Var.f);
                dj0 dj0Var = (dj0) ej0Var.g;
                if (dj0Var != null) {
                    dj0Var.a.unregisterContentObserver(dj0Var);
                }
                ej0Var.a = false;
            }
        }
    }

    public final void e(pj0 pj0Var) {
        Context context;
        bj0 bj0VarB;
        AudioDeviceInfo audioDeviceInfo = pj0Var.c;
        xi0 xi0Var = pj0Var.b;
        f();
        ej0 ej0Var = this.h;
        if (ej0Var == null && (context = this.a) != null) {
            ej0 ej0Var2 = new ej0(context, new jv2(4, this), xi0Var, audioDeviceInfo);
            this.h = ej0Var2;
            Handler handler = (Handler) ej0Var2.d;
            Context context2 = (Context) ej0Var2.b;
            if (ej0Var2.a) {
                bj0VarB = (bj0) ej0Var2.w;
                bj0VarB.getClass();
            } else {
                ej0Var2.a = true;
                dj0 dj0Var = (dj0) ej0Var2.g;
                if (dj0Var != null) {
                    dj0Var.a.registerContentObserver(dj0Var.b, false, dj0Var);
                }
                kj0.d0(context2).registerAudioDeviceCallback((cj0) ej0Var2.e, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((iud) ej0Var2.v) == null) {
                    ej0Var2.v = new iud(context2, new j1(9, ej0Var2), Boolean.valueOf(pqf.G(context2)));
                }
                bj0VarB = bj0.b(context2, context2.registerReceiver((n80) ej0Var2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (xi0) ej0Var2.y, (AudioDeviceInfo) ej0Var2.x, ej0Var2.a());
                ej0Var2.w = bj0VarB;
            }
            this.g = bj0VarB;
        } else if (ej0Var != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) ej0Var.x)) {
                ej0Var.x = audioDeviceInfo;
                Context context3 = (Context) ej0Var.b;
                xi0 xi0Var2 = (xi0) ej0Var.y;
                List listA = ej0Var.a();
                yob yobVar = bj0.e;
                ej0Var.b(bj0.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), xi0Var2, audioDeviceInfo, listA));
            }
            ej0 ej0Var3 = this.h;
            if (!Objects.equals(xi0Var, (xi0) ej0Var3.y)) {
                ej0Var3.y = xi0Var;
                Context context4 = (Context) ej0Var3.b;
                AudioDeviceInfo audioDeviceInfo2 = (AudioDeviceInfo) ej0Var3.x;
                List listA2 = ej0Var3.a();
                yob yobVar2 = bj0.e;
                ej0Var3.b(bj0.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), xi0Var, audioDeviceInfo2, listA2));
            }
        }
        this.g.getClass();
    }

    public final void f() {
        if (this.a == null) {
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.i;
        boolean z = looper == null || looper == looperMyLooper;
        String name = looper == null ? "null" : looper.getThread().getName();
        String name2 = looperMyLooper != null ? looperMyLooper.getThread().getName() : "null";
        if (z) {
            this.i = looperMyLooper;
        } else {
            qc0.p(rfc.l("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, name2));
        }
    }
}
