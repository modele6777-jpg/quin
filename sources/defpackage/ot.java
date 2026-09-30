package defpackage;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ot implements yff {
    public final OutputConfiguration a;
    public final Surface b;

    public ot(OutputConfiguration outputConfiguration) {
        this.a = outputConfiguration;
        this.b = outputConfiguration.getSurface();
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        if (em7Var.equals(job.a.b(OutputConfiguration.class))) {
            return this.a;
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
