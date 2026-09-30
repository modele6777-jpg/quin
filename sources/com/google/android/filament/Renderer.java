package com.google.android.filament;

import android.os.Handler;
import defpackage.kv2;
import defpackage.ni;
import defpackage.pk1;
import defpackage.psd;
import defpackage.qc0;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class Renderer {
    public final Engine a;
    public long b;

    public Renderer(Engine engine, long j) {
        this.a = engine;
        this.b = j;
    }

    private static native boolean nBeginFrame(long j, long j2, long j3);

    private static native void nEndFrame(long j);

    private static native int nReadPixelsEx(long j, long j2, long j3, int i, int i2, int i3, int i4, Buffer buffer, int i5, int i6, int i7, int i8, int i9, int i10, int i11, Object obj, Runnable runnable);

    private static native void nRender(long j, long j2);

    private static native void nSetClearOptions(long j, double d, double d2, double d3, double d4, boolean z, boolean z2);

    public final boolean a(SwapChain swapChain, long j) {
        long jC = c();
        long j2 = swapChain.b;
        if (j2 != 0) {
            return nBeginFrame(jC, j2, j);
        }
        qc0.p("Calling method on destroyed SwapChain");
        return false;
    }

    public final void b() {
        nEndFrame(c());
    }

    public final long c() {
        long j = this.b;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed Renderer");
        return 0L;
    }

    public final void d(RenderTarget renderTarget, int i, int i2, psd psdVar) {
        Buffer buffer = (Buffer) psdVar.b;
        if (buffer.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        if (nReadPixelsEx(c(), this.a.getNativeObject(), renderTarget.e(), 0, 0, i, i2, buffer, buffer.remaining(), 0, 0, kv2.B(1), 1, 0, kv2.B(7), (Handler) psdVar.c, (ni) psdVar.d) < 0) {
            throw new BufferOverflowException();
        }
    }

    public final void e(View view) {
        nRender(c(), view.a());
    }

    public final void f(pk1 pk1Var) {
        long jC = c();
        double[] dArr = (double[]) pk1Var.c;
        nSetClearOptions(jC, dArr[0], dArr[1], dArr[2], dArr[3], pk1Var.b, true);
    }
}
