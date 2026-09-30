package com.google.android.filament;

import defpackage.qc0;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class IndexBuffer {
    public long a;

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferType(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, long j2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIndexCount(long j, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j);

    private static native int nSetBuffer(long j, long j2, Buffer buffer, int i, int i2, int i3, Object obj, Runnable runnable);

    public final long f() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed IndexBuffer");
        return 0L;
    }

    public final void g(Engine engine, ByteBuffer byteBuffer) {
        if (nSetBuffer(f(), engine.getNativeObject(), byteBuffer, byteBuffer.remaining(), 0, byteBuffer.remaining(), null, null) < 0) {
            throw new BufferOverflowException();
        }
    }
}
