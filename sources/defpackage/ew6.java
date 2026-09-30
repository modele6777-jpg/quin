package defpackage;

import android.util.Size;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface ew6 extends vdb {
    public static final no0 F = new no0("camerax.core.imageOutput.targetAspectRatio", vd0.class, null);
    public static final no0 G;
    public static final no0 H;
    public static final no0 I;
    public static final no0 J;
    public static final no0 K;
    public static final no0 L;
    public static final no0 M;
    public static final no0 N;
    public static final no0 O;

    static {
        Class cls = Integer.TYPE;
        G = new no0("camerax.core.imageOutput.targetRotation", cls, null);
        H = new no0("camerax.core.imageOutput.appTargetRotation", cls, null);
        I = new no0("camerax.core.imageOutput.mirrorMode", cls, null);
        J = new no0("camerax.core.imageOutput.targetResolution", Size.class, null);
        K = new no0("camerax.core.imageOutput.defaultResolution", Size.class, null);
        L = new no0("camerax.core.imageOutput.maxResolution", Size.class, null);
        M = new no0("camerax.core.imageOutput.supportedResolutions", List.class, null);
        N = new no0("camerax.core.imageOutput.resolutionSelector", nxb.class, null);
        O = new no0("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    static void z(ew6 ew6Var) {
        boolean zH = ew6Var.h(F);
        boolean z = ((Size) ew6Var.a(J, null)) != null;
        if (zH && z) {
            qc0.j("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        } else if (((nxb) ew6Var.a(N, null)) != null) {
            if (zH || z) {
                qc0.j("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }

    default int A(int i) {
        return ((Integer) a(G, Integer.valueOf(i))).intValue();
    }
}
