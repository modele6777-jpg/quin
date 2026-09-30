package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface te1 extends vdb {
    public static final no0 j = new no0("camerax.core.camera.useCaseConfigFactory", akf.class, null);
    public static final no0 k = new no0("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class, null);
    public static final no0 l = new no0("camerax.core.camera.SessionProcessor", y0d.class, null);
    public static final no0 m = new no0("camerax.core.camera.isPostviewSupported", Boolean.class, null);
    public static final no0 n = new no0("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class, null);

    default void u() {
        if (a(l, null) == null) {
            return;
        }
        r3.f();
    }
}
