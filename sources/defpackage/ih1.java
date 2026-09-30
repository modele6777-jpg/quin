package defpackage;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ih1 {
    public static final ru8 a;
    public static final ru8 b;
    public static final ru8 c;

    static {
        HashMap map = ru8.c;
        kob kobVar = job.a;
        a = af1.C(kobVar.b(Integer.class), "androidx.camera.camera2.pipe.extensionMode");
        b = af1.C(kobVar.b(Object.class), "androidx.camera.camera2.pipe.captureRequestTag");
        c = af1.C(kobVar.b(Boolean.class), "androidx.camera.camera2.pipe.ignore3ARequiredParameters");
    }
}
