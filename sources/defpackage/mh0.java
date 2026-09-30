package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mh0 implements po8 {
    public final MediaCodec a;
    public final ph0 b;
    public final ro8 c;
    public final zi8 d;
    public boolean e;
    public int f = 0;

    public mh0(MediaCodec mediaCodec, HandlerThread handlerThread, ro8 ro8Var, zi8 zi8Var) {
        this.a = mediaCodec;
        this.b = new ph0(handlerThread);
        this.c = ro8Var;
        this.d = zi8Var;
    }

    public static String c(int i, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (i == 1) {
            sb.append("Audio");
        } else if (i == 2) {
            sb.append("Video");
        } else {
            sb.append("Unknown(");
            sb.append(i);
            sb.append(")");
        }
        return sb.toString();
    }

    @Override // defpackage.po8
    public final void a() {
        zi8 zi8Var;
        zi8 zi8Var2;
        try {
            if (this.f == 1) {
                this.c.shutdown();
                ph0 ph0Var = this.b;
                synchronized (ph0Var.a) {
                    ph0Var.m = true;
                    ph0Var.b.quit();
                    ph0Var.a();
                }
            }
            this.f = 2;
            if (this.e) {
                return;
            }
            try {
                int i = Build.VERSION.SDK_INT;
                if (i >= 30 && i < 33) {
                    this.a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (zi8Var2 = this.d) != null) {
                    zi8Var2.u(this.a);
                }
                this.a.release();
                this.e = true;
            }
        } catch (Throwable th) {
            if (!this.e) {
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        this.a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (zi8Var = this.d) != null) {
                        zi8Var.u(this.a);
                    }
                    this.a.release();
                    this.e = true;
                }
            }
            throw th;
        }
    }

    @Override // defpackage.po8
    public final void b(Bundle bundle) {
        this.c.b(bundle);
    }

    @Override // defpackage.po8
    public final void d(int i, n03 n03Var, long j, int i2) {
        this.c.d(i, n03Var, j, i2);
    }

    @Override // defpackage.po8
    public final void e(int i, int i2, int i3, long j) {
        this.c.e(i, i2, i3, j);
    }

    @Override // defpackage.po8
    public final void f(int i) {
        this.a.releaseOutputBuffer(i, false);
    }

    @Override // defpackage.po8
    public final void flush() {
        this.c.flush();
        this.a.flush();
        ph0 ph0Var = this.b;
        synchronized (ph0Var.a) {
            ph0Var.l++;
            Handler handler = ph0Var.c;
            String str = pqf.a;
            handler.post(new j1(6, ph0Var));
        }
        this.a.start();
    }

    @Override // defpackage.po8
    public final void g(ny2 ny2Var) {
        ph0 ph0Var = this.b;
        fe feVar = new fe(7, this, ny2Var);
        synchronized (ph0Var.a) {
            ph0Var.b();
            feVar.run();
        }
    }

    @Override // defpackage.po8
    public final MediaFormat h() {
        MediaFormat mediaFormat;
        ph0 ph0Var = this.b;
        synchronized (ph0Var.a) {
            try {
                mediaFormat = ph0Var.h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return mediaFormat;
    }

    @Override // defpackage.po8
    public final void i() {
        this.a.detachOutputSurface();
    }

    @Override // defpackage.po8
    public final void j(int i, long j) {
        this.a.releaseOutputBuffer(i, j);
    }

    @Override // defpackage.po8
    public final int k() {
        this.c.g();
        ph0 ph0Var = this.b;
        synchronized (ph0Var.a) {
            try {
                ph0Var.b();
                int i = -1;
                if (ph0Var.l > 0 || ph0Var.m) {
                    return -1;
                }
                i12 i12Var = ph0Var.d;
                int i2 = i12Var.a;
                int i3 = i12Var.b;
                if (!(i2 == i3)) {
                    if (i2 == i3) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i = i12Var.c[i2];
                    i12Var.a = (i2 + 1) & i12Var.d;
                }
                return i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.po8
    public final int l(MediaCodec.BufferInfo bufferInfo) {
        this.c.g();
        ph0 ph0Var = this.b;
        synchronized (ph0Var.a) {
            try {
                ph0Var.b();
                if (ph0Var.l > 0 || ph0Var.m) {
                    return -1;
                }
                i12 i12Var = ph0Var.e;
                int i = i12Var.a;
                int i2 = i12Var.b;
                if (i == i2) {
                    return -1;
                }
                if (i == i2) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i3 = i12Var.c[i];
                i12Var.a = i12Var.d & (i + 1);
                if (i3 >= 0) {
                    ph0Var.h.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) ph0Var.f.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i3 == -2) {
                    ph0Var.h = (MediaFormat) ph0Var.g.remove();
                }
                return i3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.po8
    public final void m(int i) {
        this.a.setVideoScalingMode(i);
    }

    @Override // defpackage.po8
    public final ByteBuffer n(int i) {
        return this.a.getInputBuffer(i);
    }

    @Override // defpackage.po8
    public final void o(Surface surface) {
        this.a.setOutputSurface(surface);
    }

    @Override // defpackage.po8
    public final ByteBuffer p(int i) {
        return this.a.getOutputBuffer(i);
    }

    @Override // defpackage.po8
    public final void q(ArrayList arrayList) {
        this.a.subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.po8
    public final void r(fp8 fp8Var, Handler handler) {
        this.a.setOnFrameRenderedListener(new kh0(this, fp8Var, 0), handler);
    }

    @Override // defpackage.po8
    public final boolean s(kb6 kb6Var) {
        ph0 ph0Var = this.b;
        synchronized (ph0Var.a) {
            ph0Var.o = kb6Var;
        }
        return true;
    }

    @Override // defpackage.po8
    public final void t(ArrayList arrayList) {
        this.a.unsubscribeFromVendorParameters(arrayList);
    }

    public final void u(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i) {
        zi8 zi8Var;
        ph0 ph0Var = this.b;
        HandlerThread handlerThread = ph0Var.b;
        pa7.J(ph0Var.c == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.a;
        mediaCodec.setCallback(ph0Var, handler);
        ph0Var.c = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i);
        Trace.endSection();
        this.c.start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (zi8Var = this.d) != null) {
            zi8Var.c(mediaCodec);
        }
        this.f = 1;
    }
}
