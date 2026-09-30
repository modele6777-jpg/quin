package defpackage;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.HandlerThread;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oh0 implements ro8 {
    public static final ArrayDeque g = new ArrayDeque();
    public static final Object v = new Object();
    public final MediaCodec a;
    public final HandlerThread b;
    public qi c;
    public final AtomicReference d;
    public final nh2 e;
    public boolean f;

    public oh0(MediaCodec mediaCodec, HandlerThread handlerThread) {
        nh2 nh2Var = new nh2(0);
        this.a = mediaCodec;
        this.b = handlerThread;
        this.e = nh2Var;
        this.d = new AtomicReference();
    }

    public static nh0 a() {
        ArrayDeque arrayDeque = g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new nh0();
                }
                return (nh0) arrayDeque.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ro8
    public final void b(Bundle bundle) {
        g();
        qi qiVar = this.c;
        String str = pqf.a;
        qiVar.obtainMessage(4, bundle).sendToTarget();
    }

    @Override // defpackage.ro8
    public final void d(int i, n03 n03Var, long j, int i2) {
        g();
        nh0 nh0VarA = a();
        nh0VarA.a = i;
        nh0VarA.b = 0;
        nh0VarA.d = j;
        nh0VarA.e = i2;
        MediaCodec.CryptoInfo cryptoInfo = nh0VarA.c;
        cryptoInfo.numSubSamples = n03Var.f;
        int[] iArr = n03Var.d;
        int[] iArrCopyOf = cryptoInfo.numBytesOfClearData;
        if (iArr != null) {
            if (iArrCopyOf == null || iArrCopyOf.length < iArr.length) {
                iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            } else {
                System.arraycopy(iArr, 0, iArrCopyOf, 0, iArr.length);
            }
        }
        cryptoInfo.numBytesOfClearData = iArrCopyOf;
        int[] iArr2 = n03Var.e;
        int[] iArrCopyOf2 = cryptoInfo.numBytesOfEncryptedData;
        if (iArr2 != null) {
            if (iArrCopyOf2 == null || iArrCopyOf2.length < iArr2.length) {
                iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
            } else {
                System.arraycopy(iArr2, 0, iArrCopyOf2, 0, iArr2.length);
            }
        }
        cryptoInfo.numBytesOfEncryptedData = iArrCopyOf2;
        byte[] bArr = n03Var.b;
        byte[] bArrCopyOf = cryptoInfo.key;
        if (bArr != null) {
            if (bArrCopyOf == null || bArrCopyOf.length < bArr.length) {
                bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
            } else {
                System.arraycopy(bArr, 0, bArrCopyOf, 0, bArr.length);
            }
        }
        bArrCopyOf.getClass();
        cryptoInfo.key = bArrCopyOf;
        byte[] bArr2 = n03Var.a;
        byte[] bArrCopyOf2 = cryptoInfo.iv;
        if (bArr2 != null) {
            if (bArrCopyOf2 == null || bArrCopyOf2.length < bArr2.length) {
                bArrCopyOf2 = Arrays.copyOf(bArr2, bArr2.length);
            } else {
                System.arraycopy(bArr2, 0, bArrCopyOf2, 0, bArr2.length);
            }
        }
        bArrCopyOf2.getClass();
        cryptoInfo.iv = bArrCopyOf2;
        cryptoInfo.mode = n03Var.c;
        cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(n03Var.g, n03Var.h));
        qi qiVar = this.c;
        String str = pqf.a;
        qiVar.obtainMessage(2, nh0VarA).sendToTarget();
    }

    @Override // defpackage.ro8
    public final void e(int i, int i2, int i3, long j) {
        g();
        nh0 nh0VarA = a();
        nh0VarA.a = i;
        nh0VarA.b = i2;
        nh0VarA.d = j;
        nh0VarA.e = i3;
        qi qiVar = this.c;
        String str = pqf.a;
        qiVar.obtainMessage(1, nh0VarA).sendToTarget();
    }

    @Override // defpackage.ro8
    public final void flush() {
        if (this.f) {
            try {
                qi qiVar = this.c;
                qiVar.getClass();
                qiVar.removeCallbacksAndMessages(null);
                nh2 nh2Var = this.e;
                synchronized (nh2Var) {
                    nh2Var.b = false;
                }
                qi qiVar2 = this.c;
                qiVar2.getClass();
                qiVar2.obtainMessage(3).sendToTarget();
                synchronized (nh2Var) {
                    while (!nh2Var.b) {
                        nh2Var.a.getClass();
                        nh2Var.wait();
                    }
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e);
            }
        }
    }

    @Override // defpackage.ro8
    public final void g() {
        RuntimeException runtimeException = (RuntimeException) this.d.getAndSet(null);
        if (runtimeException != null) {
            throw runtimeException;
        }
    }

    @Override // defpackage.ro8
    public final void shutdown() {
        if (this.f) {
            flush();
            this.b.quit();
        }
        this.f = false;
    }

    @Override // defpackage.ro8
    public final void start() {
        if (this.f) {
            return;
        }
        HandlerThread handlerThread = this.b;
        handlerThread.start();
        this.c = new qi(this, handlerThread.getLooper(), 1);
        this.f = true;
    }
}
