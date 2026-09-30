package defpackage;

import android.util.Range;
import android.util.Size;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface xjf extends kfe, wv6 {
    public static final no0 e0 = new no0("camerax.core.useCase.defaultSessionConfig", zzc.class, null);
    public static final no0 f0 = new no0("camerax.core.useCase.defaultCaptureConfig", im1.class, null);
    public static final no0 g0 = new no0("camerax.core.useCase.sessionConfigUnpacker", jk1.class, null);
    public static final no0 h0 = new no0("camerax.core.useCase.captureConfigUnpacker", ik1.class, null);
    public static final no0 i0;
    public static final no0 j0;
    public static final no0 k0;
    public static final no0 l0;
    public static final no0 m0;
    public static final no0 n0;
    public static final no0 o0;
    public static final no0 p0;
    public static final no0 q0;
    public static final no0 r0;
    public static final no0 s0;
    public static final no0 t0;
    public static final no0 u0;

    static {
        Class cls = Integer.TYPE;
        i0 = new no0("camerax.core.useCase.surfaceOccupancyPriority", cls, null);
        j0 = new no0("camerax.core.useCase.sessionType", cls, null);
        k0 = new no0("camerax.core.useCase.targetFrameRate", Range.class, null);
        l0 = new no0("camerax.core.useCase.isStrictFrameRateRequired", Boolean.class, null);
        m0 = new no0("camerax.core.useCase.resolutionToMaxFrameRate", Map.class, null);
        Class cls2 = Boolean.TYPE;
        n0 = new no0("camerax.core.useCase.zslDisabled", cls2, null);
        o0 = new no0("camerax.core.useCase.highResolutionDisabled", cls2, null);
        p0 = new no0("camerax.core.useCase.captureType", zjf.class, null);
        q0 = new no0("camerax.core.useCase.previewStabilizationMode", cls, null);
        r0 = new no0("camerax.core.useCase.videoStabilizationMode", cls, null);
        s0 = new no0("camerax.core.useCase.isVideoQualitySelectorDefault", Boolean.class, null);
        t0 = new no0("camerax.core.useCase.takePictureManagerProvider", vjf.class, null);
        u0 = new no0("camerax.core.useCase.streamUseCase", n3e.class, null);
    }

    default n3e r() {
        n3e n3eVar = (n3e) a(u0, n3e.DEFAULT);
        Objects.requireNonNull(n3eVar);
        return n3eVar;
    }

    default zjf s() {
        return (zjf) c(p0);
    }

    default int t() {
        return ((Integer) a(r0, 0)).intValue();
    }

    default int v(Size size) {
        Map map = (Map) a(m0, null);
        if (map == null || !map.containsKey(size)) {
            return Integer.MAX_VALUE;
        }
        Integer num = (Integer) map.get(size);
        Objects.requireNonNull(num);
        return num.intValue();
    }

    default int y() {
        return ((Integer) a(q0, 0)).intValue();
    }
}
