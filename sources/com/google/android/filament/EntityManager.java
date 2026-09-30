package com.google.android.filament;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class EntityManager {
    public final long a;

    public EntityManager() {
        this.a = nGetEntityManager();
    }

    private static native int nCreate(long j);

    private static native void nDestroy(long j, int i);

    private static native long nGetEntityManager();

    public final int a() {
        return nCreate(this.a);
    }

    public final void b(int i) {
        nDestroy(this.a, i);
    }

    public long getNativeObject() {
        return this.a;
    }

    public EntityManager(long j) {
        nGetEntityManager();
        this.a = j;
    }
}
