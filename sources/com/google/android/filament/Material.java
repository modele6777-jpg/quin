package com.google.android.filament;

import defpackage.kv2;
import defpackage.qc0;
import java.nio.Buffer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class Material {
    public long a;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class Parameter {
        public static final int[] a = kv2.C(24);
        private static final int SAMPLER_OFFSET = 18;
        private static final int SUBPASS_OFFSET = 23;

        private static void add(List<Parameter> list, String str, int i, int i2, int i3) {
            int i4 = a[i];
            int i5 = kv2.C(4)[i2];
            list.add(new Parameter());
        }
    }

    public Material(long j) {
        this.a = j;
        nGetDefaultInstance(j);
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j, Buffer buffer, int i, int i2, int i3, int i4);

    private static native long nCreateInstance(long j);

    private static native long nGetDefaultInstance(long j);

    public final MaterialInstance b() {
        long jNCreateInstance = nCreateInstance(c());
        if (jNCreateInstance == 0) {
            qc0.p("Couldn't create MaterialInstance");
            return null;
        }
        MaterialInstance materialInstance = new MaterialInstance();
        c();
        materialInstance.a = jNCreateInstance;
        return materialInstance;
    }

    public final long c() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed Material");
        return 0L;
    }
}
