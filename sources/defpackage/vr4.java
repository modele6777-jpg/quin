package defpackage;

import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vr4 implements tr4 {
    public static final vd9 a = new vd9(17, new vr4());
    public static final Set b = n3d.p(qr4.d);

    @Override // defpackage.tr4
    public final Set a() {
        return b;
    }

    @Override // defpackage.tr4
    public final DynamicRangeProfiles b() {
        return null;
    }

    @Override // defpackage.tr4
    public final Set c(qr4 qr4Var) {
        qr4Var.getClass();
        ok8.k("DynamicRange is not supported: " + qr4Var, qr4.d.equals(qr4Var));
        return b;
    }
}
