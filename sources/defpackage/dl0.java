package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dl0 {
    public boolean A;
    public long B;
    public final mjg a;
    public final ece b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final uk0 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public dl0(mjg mjgVar, ece eceVar, AudioTrack audioTrack, int i, int i2, int i3) {
        this.a = mjgVar;
        this.b = eceVar;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new uk0(audioTrack, mjgVar);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean zE = pqf.E(i);
        this.g = zE;
        this.f = zE ? pqf.L(sampleRate, i3 / i2) : -9223372036854775807L;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    public final long a() {
        long j;
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        this.b.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.p >= 5) {
            AudioTrack audioTrack = this.d;
            int playState = audioTrack.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
                if (Build.VERSION.SDK_INT > 29) {
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (playbackHeadPosition != 0 || this.q <= 0 || playState != 3) {
                    this.v = -9223372036854775807L;
                    j = this.q;
                    if (j > playbackHeadPosition) {
                        if (this.A) {
                            this.B += j;
                            this.A = false;
                        } else {
                            this.r++;
                        }
                    }
                    this.q = playbackHeadPosition;
                } else if (this.v == -9223372036854775807L) {
                    this.v = jElapsedRealtime;
                }
            }
            this.p = jElapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        long jV;
        int i = this.t;
        int i2 = this.e;
        if (i == 0) {
            jV = this.u != -9223372036854775807L ? pqf.L(i2, c()) : pqf.L(i2, a());
        } else {
            jV = pqf.v(j + this.k, this.i);
        }
        long jMax = Math.max(0L, jV - this.n);
        return this.u != -9223372036854775807L ? Math.min(pqf.L(i2, this.x), jMax) : jMax;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + pqf.N(pqf.v(pqf.H(SystemClock.elapsedRealtime()) - this.u, this.i), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 == -9223372036854775807L || j < j2) {
            return;
        }
        long jRound = j - j2;
        float f = this.i;
        String str = pqf.a;
        if (f != 1.0f) {
            jRound = Math.round(jRound / ((double) f));
        }
        this.b.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis() - pqf.R(jRound);
        this.j = -9223372036854775807L;
        f98 f98Var = ((al0) this.a.a).i;
        f98Var.getClass();
        if (Thread.currentThread() == f98Var.a) {
            f98Var.e(-1, new c98() { // from class: wk0
                @Override // defpackage.c98
                public final void d(Object obj) {
                    m6c m6cVar;
                    ep3 ep3Var = (ep3) obj;
                    jp3 jp3Var = ep3Var.a;
                    if (ep3Var == jp3Var.j && (m6cVar = jp3Var.n) != null) {
                        qo8 qo8Var = (qo8) m6cVar.b;
                        qo8Var.g2 = true;
                        k47 k47Var = qo8Var.V1;
                        Handler handler = (Handler) k47Var.b;
                        if (handler != null) {
                            handler.post(new hk0(k47Var, jCurrentTimeMillis));
                        }
                    }
                }
            });
        }
    }

    public final void e() {
        this.k = 0L;
        this.t = 0;
        this.s = 0;
        this.l = 0L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
    }
}
