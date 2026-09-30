package defpackage;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sp8 implements ql {
    public int A;
    public boolean B;
    public final Context a;
    public final gs3 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public lga o;
    public w84 p;
    public w84 q;
    public w84 r;
    public rr5 s;
    public rr5 t;
    public rr5 u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = rs0.A();
    public final fye f = new fye();
    public final eye g = new eye();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public sp8(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        gs3 gs3Var = new gs3();
        this.c = gs3Var;
        gs3Var.d = this;
    }

    public static sp8 b(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new sp8(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean a(w84 w84Var) {
        String str;
        if (w84Var == null) {
            return false;
        }
        String str2 = (String) w84Var.c;
        gs3 gs3Var = this.c;
        synchronized (gs3Var) {
            str = gs3Var.f;
        }
        return str2.equals(str);
    }

    public final void c() {
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            this.k.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = (Long) this.i.get(this.j);
            this.k.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.k.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.b.execute(new ny2(27, this, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final LogSessionId d() {
        return this.d.getSessionId();
    }

    public final /* synthetic */ void e(PlaybackMetrics playbackMetrics) {
        this.d.reportPlaybackMetrics(playbackMetrics);
    }

    public final /* synthetic */ void f(NetworkEvent networkEvent) {
        this.d.reportNetworkEvent(networkEvent);
    }

    public final /* synthetic */ void g(PlaybackErrorEvent playbackErrorEvent) {
        this.d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public final /* synthetic */ void h(PlaybackStateEvent playbackStateEvent) {
        this.d.reportPlaybackStateEvent(playbackStateEvent);
    }

    public final /* synthetic */ void i(TrackChangeEvent trackChangeEvent) {
        this.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public final void j(gye gyeVar, zp8 zp8Var) {
        int iB;
        PlaybackMetrics.Builder builder = this.k;
        if (zp8Var == null || (iB = gyeVar.b(zp8Var.a)) == -1) {
            return;
        }
        eye eyeVar = this.g;
        int i = 0;
        gyeVar.f(iB, eyeVar, false);
        int i2 = eyeVar.c;
        fye fyeVar = this.f;
        gyeVar.n(i2, fyeVar);
        lp8 lp8Var = fyeVar.b.b;
        if (lp8Var != null) {
            int iB2 = pqf.B(lp8Var.a, lp8Var.b);
            if (iB2 == 0) {
                i = 3;
            } else if (iB2 != 1) {
                i = iB2 != 2 ? 1 : 4;
            } else {
                i = 5;
            }
        }
        builder.setStreamType(i);
        if (fyeVar.k != -9223372036854775807L && !fyeVar.i && !fyeVar.g && !fyeVar.a()) {
            builder.setMediaDurationMillis(pqf.R(fyeVar.k));
        }
        builder.setPlaybackType(fyeVar.a() ? 2 : 1);
        this.B = true;
    }

    /* JADX WARN: Code duplicated, block: B:355:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:358:0x05f5  */
    /* JADX WARN: Code duplicated, block: B:362:0x0609 A[Catch: all -> 0x0618, TryCatch #2 {all -> 0x0618, blocks: (B:360:0x0605, B:362:0x0609, B:365:0x061a, B:366:0x0624, B:368:0x062a, B:370:0x0637, B:372:0x063b), top: B:383:0x0605 }] */
    /* JADX WARN: Code duplicated, block: B:368:0x062a A[Catch: all -> 0x0618, TryCatch #2 {all -> 0x0618, blocks: (B:360:0x0605, B:362:0x0609, B:365:0x061a, B:366:0x0624, B:368:0x062a, B:370:0x0637, B:372:0x063b), top: B:383:0x0605 }] */
    /* JADX WARN: Code duplicated, block: B:378:0x0645 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:383:0x0605 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final void k(zga zgaVar, a90 a90Var) {
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        h71 h71Var;
        int i7;
        h71 h71Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        h71 h71Var3;
        int i13;
        int i14;
        int i15;
        boolean z2;
        gs3 gs3Var;
        String str;
        Iterator it;
        fs3 fs3Var;
        sp8 sp8Var;
        rr5 rr5Var;
        xp4 xp4Var;
        int i16;
        if (((ki5) a90Var.b).a.size() == 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            boolean z3 = true;
            if (i17 >= ((ki5) a90Var.b).a.size()) {
                break;
            }
            SparseBooleanArray sparseBooleanArray = ((ki5) a90Var.b).a;
            pa7.C(i17, sparseBooleanArray.size());
            int iKeyAt = sparseBooleanArray.keyAt(i17);
            pl plVar = (pl) ((SparseArray) a90Var.c).get(iKeyAt);
            plVar.getClass();
            gs3 gs3Var2 = this.c;
            if (iKeyAt == 0) {
                synchronized (gs3Var2) {
                    try {
                        gs3Var2.d.getClass();
                        gye gyeVar = gs3Var2.e;
                        gs3Var2.e = plVar.b;
                        Iterator it2 = gs3Var2.c.values().iterator();
                        while (it2.hasNext()) {
                            fs3 fs3Var2 = (fs3) it2.next();
                            if (!fs3Var2.b(gyeVar, gs3Var2.e) || fs3Var2.a(plVar)) {
                                it2.remove();
                                if (fs3Var2.a.equals(gs3Var2.f)) {
                                    gs3Var2.a(fs3Var2);
                                }
                                if (fs3Var2.e) {
                                    gs3Var2.d.m(plVar, fs3Var2.a);
                                }
                            }
                        }
                        gs3Var2.d(plVar);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } else if (iKeyAt == 11) {
                int i18 = this.l;
                synchronized (gs3Var2) {
                    try {
                        gs3Var2.d.getClass();
                        if (i18 != 0) {
                            z3 = false;
                        }
                        Iterator it3 = gs3Var2.c.values().iterator();
                        while (it3.hasNext()) {
                            fs3 fs3Var3 = (fs3) it3.next();
                            if (fs3Var3.a(plVar)) {
                                it3.remove();
                                boolean zEquals = fs3Var3.a.equals(gs3Var2.f);
                                if (zEquals) {
                                    gs3Var2.a(fs3Var3);
                                }
                                if (fs3Var3.e) {
                                    if (z3 && zEquals) {
                                        boolean z4 = fs3Var3.f;
                                    }
                                    gs3Var2.d.m(plVar, fs3Var3.a);
                                }
                            }
                        }
                        gs3Var2.d(plVar);
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            } else {
                gs3Var2.e(plVar);
            }
            i17++;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (a90Var.B(0)) {
            pl plVar2 = (pl) ((SparseArray) a90Var.c).get(0);
            plVar2.getClass();
            if (this.k != null) {
                j(plVar2.b, plVar2.d);
            }
        }
        if (a90Var.B(2) && this.k != null) {
            ey6 ey6VarListIterator = ((y45) zgaVar).n().a.listIterator(0);
            loop3: while (true) {
                if (!ey6VarListIterator.hasNext()) {
                    xp4Var = null;
                    break;
                }
                e2f e2fVar = (e2f) ey6VarListIterator.next();
                for (int i19 = 0; i19 < e2fVar.a; i19++) {
                    if (e2fVar.e[i19] && (xp4Var = e2fVar.b.d[i19].t) != null) {
                        break loop3;
                    }
                }
            }
            if (xp4Var != null) {
                PlaybackMetrics.Builder builder = this.k;
                String str2 = pqf.a;
                int i20 = 0;
                while (true) {
                    if (i20 >= xp4Var.d) {
                        i16 = 1;
                        break;
                    }
                    UUID uuid = xp4Var.a[i20].b;
                    if (uuid.equals(d71.d)) {
                        i16 = 3;
                        break;
                    } else if (uuid.equals(d71.e)) {
                        i16 = 2;
                        break;
                    } else {
                        if (uuid.equals(d71.c)) {
                            i16 = 6;
                            break;
                        }
                        i20++;
                    }
                }
                builder.setDrmType(i16);
            }
        }
        if (a90Var.B(1011)) {
            this.A++;
        }
        lga lgaVar = this.o;
        if (lgaVar == null) {
            i13 = 1;
            i6 = 13;
            i2 = 8;
            i3 = 7;
            i4 = 6;
            i5 = 9;
        } else {
            Context context = this.a;
            boolean z5 = this.w == 4;
            if (lgaVar.errorCode == 1001) {
                h71Var = new h71(20, 0, 2);
            } else {
                if (lgaVar instanceof g45) {
                    g45 g45Var = (g45) lgaVar;
                    z = g45Var.type == 1;
                    i = g45Var.rendererFormatSupport;
                } else {
                    i = 0;
                    z = false;
                }
                Throwable cause = lgaVar.getCause();
                cause.getClass();
                if (cause instanceof IOException) {
                    if (cause instanceof ps6) {
                        h71Var3 = new h71(5, ((ps6) cause).responseCode, 2);
                    } else {
                        if ((cause instanceof os6) || (cause instanceof l0a)) {
                            i8 = 8;
                            i9 = 9;
                            i10 = 6;
                            i11 = 7;
                            h71Var = new h71(z5 ? 10 : 11, 0, 2);
                        } else {
                            boolean z6 = cause instanceof ns6;
                            if (z6 || (cause instanceof raf)) {
                                i9 = 9;
                                if (te9.a(context).b() == 1) {
                                    h71Var = new h71(3, 0, 2);
                                } else {
                                    Throwable cause2 = cause.getCause();
                                    if (cause2 instanceof UnknownHostException) {
                                        h71Var = new h71(6, 0, 2);
                                        i5 = 9;
                                        i4 = 6;
                                        i6 = 13;
                                        i2 = 8;
                                        i3 = 7;
                                    } else {
                                        i10 = 6;
                                        if (cause2 instanceof SocketTimeoutException) {
                                            i11 = 7;
                                            h71Var = new h71(7, 0, 2);
                                        } else {
                                            i11 = 7;
                                            if (z6 && ((ns6) cause).type == 1) {
                                                h71Var = new h71(4, 0, 2);
                                            } else {
                                                i8 = 8;
                                                h71Var = new h71(8, 0, 2);
                                            }
                                        }
                                        i5 = 9;
                                        i4 = 6;
                                        i3 = i11;
                                        i6 = 13;
                                        i2 = 8;
                                    }
                                }
                            } else if (lgaVar.errorCode == 1002) {
                                h71Var = new h71(21, 0, 2);
                            } else if (cause instanceof yp4) {
                                Throwable cause3 = cause.getCause();
                                cause3.getClass();
                                if (cause3 instanceof MediaDrm.MediaDrmStateException) {
                                    int iT = pqf.t(((MediaDrm.MediaDrmStateException) cause3).getDiagnosticInfo());
                                    switch (pqf.s(iT)) {
                                        case 6002:
                                            i12 = 24;
                                            break;
                                        case 6003:
                                            i12 = 28;
                                            break;
                                        case 6004:
                                            i12 = 25;
                                            break;
                                        case 6005:
                                            i12 = 26;
                                            break;
                                        default:
                                            i12 = 27;
                                            break;
                                    }
                                    h71Var3 = new h71(i12, iT, 2);
                                } else if (cause3 instanceof MediaDrmResetException) {
                                    h71Var = new h71(27, 0, 2);
                                } else if (cause3 instanceof NotProvisionedException) {
                                    h71Var = new h71(24, 0, 2);
                                } else if (cause3 instanceof DeniedByServerException) {
                                    h71Var = new h71(29, 0, 2);
                                } else if (cause3 instanceof igf) {
                                    h71Var = new h71(23, 0, 2);
                                } else {
                                    h71Var = cause3 instanceof kq3 ? new h71(28, 0, 2) : new h71(30, 0, 2);
                                }
                            } else if ((cause instanceof fd5) && (cause.getCause() instanceof FileNotFoundException)) {
                                Throwable cause4 = cause.getCause();
                                cause4.getClass();
                                Throwable cause5 = cause4.getCause();
                                h71Var = ((cause5 instanceof ErrnoException) && ((ErrnoException) cause5).errno == OsConstants.EACCES) ? new h71(32, 0, 2) : new h71(31, 0, 2);
                            } else {
                                i9 = 9;
                                h71Var = new h71(9, 0, 2);
                            }
                            i5 = i9;
                            i6 = 13;
                            i2 = 8;
                            i3 = 7;
                            i4 = 6;
                        }
                        i2 = i8;
                        i5 = i9;
                        i4 = i10;
                        i3 = i11;
                        i6 = 13;
                    }
                    h71Var = h71Var3;
                } else {
                    i2 = 8;
                    i3 = 7;
                    i4 = 6;
                    i5 = 9;
                    if (z && (i == 0 || i == 1)) {
                        h71Var = new h71(35, 0, 2);
                    } else if (z && i == 3) {
                        h71Var = new h71(15, 0, 2);
                    } else if (z && i == 2) {
                        h71Var = new h71(23, 0, 2);
                    } else {
                        if (cause instanceof uo8) {
                            i6 = 13;
                            h71Var2 = new h71(13, pqf.t(((uo8) cause).diagnosticInfo), 2);
                        } else {
                            i6 = 13;
                            if (cause instanceof so8) {
                                h71Var2 = new h71(14, ((so8) cause).errorCode, 2);
                            } else if (cause instanceof OutOfMemoryError) {
                                h71Var = new h71(14, 0, 2);
                            } else if (cause instanceof pk0) {
                                h71Var2 = new h71(17, ((pk0) cause).audioTrackState, 2);
                            } else if (cause instanceof rk0) {
                                h71Var2 = new h71(18, ((rk0) cause).errorCode, 2);
                            } else if (cause instanceof MediaCodec.CryptoException) {
                                int errorCode = ((MediaCodec.CryptoException) cause).getErrorCode();
                                switch (pqf.s(errorCode)) {
                                    case 6002:
                                        i7 = 24;
                                        break;
                                    case 6003:
                                        i7 = 28;
                                        break;
                                    case 6004:
                                        i7 = 25;
                                        break;
                                    case 6005:
                                        i7 = 26;
                                        break;
                                    default:
                                        i7 = 27;
                                        break;
                                }
                                h71Var2 = new h71(i7, errorCode, 2);
                            } else {
                                h71Var = new h71(22, 0, 2);
                            }
                        }
                        h71Var = h71Var2;
                    }
                    i6 = 13;
                }
                this.b.execute(new ny2(26, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(h71Var.b).setSubErrorCode(h71Var.c).setException(lgaVar).build()));
                i13 = 1;
                this.B = true;
                this.o = null;
            }
            i6 = 13;
            i2 = 8;
            i3 = 7;
            i4 = 6;
            i5 = 9;
            this.b.execute(new ny2(26, this, new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(jElapsedRealtime - this.e).setErrorCode(h71Var.b).setSubErrorCode(h71Var.c).setException(lgaVar).build()));
            i13 = 1;
            this.B = true;
            this.o = null;
        }
        if (a90Var.B(2)) {
            f2f f2fVarN = ((y45) zgaVar).n();
            boolean zA = f2fVarN.a(2);
            boolean zA2 = f2fVarN.a(i13);
            boolean zA3 = f2fVarN.a(3);
            if (zA || zA2 || zA3) {
                if (zA) {
                    rr5Var = null;
                } else {
                    rr5Var = null;
                    if (!Objects.equals(this.s, null)) {
                        this.s = null;
                        n(1, jElapsedRealtime, null);
                    }
                }
                if (!zA2 && !Objects.equals(this.t, rr5Var)) {
                    this.t = rr5Var;
                    n(0, jElapsedRealtime, rr5Var);
                }
                if (!zA3 && !Objects.equals(this.u, rr5Var)) {
                    this.u = rr5Var;
                    n(2, jElapsedRealtime, rr5Var);
                }
            }
        }
        if (a(this.p)) {
            rr5 rr5Var2 = (rr5) this.p.b;
            if (rr5Var2.x != -1) {
                if (!Objects.equals(this.s, rr5Var2)) {
                    this.s = rr5Var2;
                    n(1, jElapsedRealtime, rr5Var2);
                }
                this.p = null;
            }
        }
        if (a(this.q)) {
            rr5 rr5Var3 = (rr5) this.q.b;
            if (!Objects.equals(this.t, rr5Var3)) {
                this.t = rr5Var3;
                n(0, jElapsedRealtime, rr5Var3);
            }
            this.q = null;
        }
        if (a(this.r)) {
            rr5 rr5Var4 = (rr5) this.r.b;
            if (!Objects.equals(this.u, rr5Var4)) {
                this.u = rr5Var4;
                n(2, jElapsedRealtime, rr5Var4);
            }
            this.r = null;
        }
        switch (te9.a(this.a).b()) {
            case 0:
                i14 = 0;
                break;
            case 1:
                i14 = i5;
                break;
            case 2:
                i14 = 2;
                break;
            case 3:
                i14 = 4;
                break;
            case 4:
                i14 = 5;
                break;
            case 5:
                i14 = i4;
                break;
            case 6:
            case 8:
            default:
                i14 = 1;
                break;
            case 7:
                i14 = 3;
                break;
            case 9:
                i14 = i2;
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                i14 = i3;
                break;
        }
        if (i14 != this.n) {
            this.n = i14;
            this.b.execute(new ny2(25, this, new NetworkEvent.Builder().setNetworkType(i14).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
        }
        y45 y45Var = (y45) zgaVar;
        if (y45Var.r() != 2) {
            this.v = false;
        }
        y45Var.Z();
        if (y45Var.n0.f == null) {
            this.x = false;
            i15 = 10;
        } else {
            i15 = 10;
            if (a90Var.B(10)) {
                this.x = true;
            }
        }
        int iR = y45Var.r();
        if (this.v) {
            i15 = 5;
        } else if (this.x) {
            i15 = i6;
        } else if (iR == 4) {
            i15 = 11;
        } else {
            if (iR != 2) {
                i15 = 3;
                if (iR != 3) {
                    z2 = true;
                    i15 = (iR != 1 || this.m == 0) ? this.m : 12;
                } else if (!y45Var.q()) {
                    i15 = 4;
                } else if (y45Var.s() != 0) {
                    i15 = i5;
                }
                if (this.m != i15) {
                    this.m = i15;
                    this.B = z2;
                    this.b.execute(new ny2(28, this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
                }
                if (a90Var.B(1028)) {
                    gs3Var = this.c;
                    pl plVar3 = (pl) ((SparseArray) a90Var.c).get(1028);
                    plVar3.getClass();
                    synchronized (gs3Var) {
                        try {
                            str = gs3Var.f;
                            if (str != null) {
                                fs3 fs3Var4 = (fs3) gs3Var.c.get(str);
                                fs3Var4.getClass();
                                gs3Var.a(fs3Var4);
                            }
                            it = gs3Var.c.values().iterator();
                            while (it.hasNext()) {
                                fs3Var = (fs3) it.next();
                                it.remove();
                                if (!fs3Var.e && (sp8Var = gs3Var.d) != null) {
                                    sp8Var.m(plVar3, fs3Var.a);
                                }
                            }
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            int i21 = this.m;
            if (i21 == 0 || i21 == 2 || i21 == 12) {
                i15 = 2;
            } else if (!y45Var.q()) {
                i15 = i3;
            } else if (y45Var.s() == 0) {
                i15 = i4;
            }
        }
        z2 = true;
        if (this.m != i15) {
            this.m = i15;
            this.B = z2;
            this.b.execute(new ny2(28, this, new PlaybackStateEvent.Builder().setState(this.m).setTimeSinceCreatedMillis(jElapsedRealtime - this.e).build()));
        }
        if (a90Var.B(1028)) {
            gs3Var = this.c;
            pl plVar4 = (pl) ((SparseArray) a90Var.c).get(1028);
            plVar4.getClass();
            synchronized (gs3Var) {
                str = gs3Var.f;
                if (str != null) {
                    fs3 fs3Var5 = (fs3) gs3Var.c.get(str);
                    fs3Var5.getClass();
                    gs3Var.a(fs3Var5);
                }
                it = gs3Var.c.values().iterator();
                while (it.hasNext()) {
                    fs3Var = (fs3) it.next();
                    it.remove();
                    if (!fs3Var.e) {
                    }
                }
            }
        }
    }

    public final void l(pl plVar, String str) {
        zp8 zp8Var = plVar.d;
        if (zp8Var == null || !zp8Var.c()) {
            c();
            this.j = str;
            this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.11.0");
            j(plVar.b, zp8Var);
        }
    }

    public final void m(pl plVar, String str) {
        zp8 zp8Var = plVar.d;
        if ((zp8Var == null || !zp8Var.c()) && str.equals(this.j)) {
            c();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void n(int i, long j, rr5 rr5Var) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (rr5Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(2);
            String str = rr5Var.o;
            if (str != null) {
                timeSinceCreatedMillis.setContainerMimeType(str);
            }
            String str2 = rr5Var.p;
            if (str2 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str2);
            }
            String str3 = rr5Var.l;
            if (str3 != null) {
                timeSinceCreatedMillis.setCodecName(str3);
            }
            int i2 = rr5Var.k;
            if (i2 != -1) {
                timeSinceCreatedMillis.setBitrate(i2);
            }
            int i3 = rr5Var.w;
            if (i3 != -1) {
                timeSinceCreatedMillis.setWidth(i3);
            }
            int i4 = rr5Var.x;
            if (i4 != -1) {
                timeSinceCreatedMillis.setHeight(i4);
            }
            int i5 = rr5Var.J;
            if (i5 != -1) {
                timeSinceCreatedMillis.setChannelCount(i5);
            }
            int i6 = rr5Var.L;
            if (i6 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i6);
            }
            String str4 = rr5Var.d;
            if (str4 != null) {
                String str5 = pqf.a;
                String[] strArrSplit = str4.split("-", -1);
                Pair pairCreate = Pair.create(strArrSplit[0], strArrSplit.length >= 2 ? strArrSplit[1] : null);
                timeSinceCreatedMillis.setLanguage((String) pairCreate.first);
                Object obj = pairCreate.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = rr5Var.B;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new ny2(24, this, timeSinceCreatedMillis.build()));
    }
}
