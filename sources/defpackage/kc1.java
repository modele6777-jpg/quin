package defpackage;

import android.hardware.camera2.CameraExtensionCharacteristics;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kc1 implements rf1 {
    public final String a;
    public final int b;
    public final CameraExtensionCharacteristics c;
    public final lw7 d;

    public kc1(String str, int i, CameraExtensionCharacteristics cameraExtensionCharacteristics) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = cameraExtensionCharacteristics;
        new LinkedHashMap();
        new LinkedHashMap();
        new LinkedHashMap();
        jc1 jc1Var = new jc1(this, 0);
        z18 z18Var = z18.b;
        eb3.N(z18Var, jc1Var);
        eb3.N(z18Var, new jc1(this, 1));
        this.d = eb3.N(z18Var, new jc1(this, 2));
        eb3.N(z18Var, new jc1(this, 3));
    }

    @Override // defpackage.yff
    public final Object H0(em7 em7Var) {
        em7Var.getClass();
        if (em7Var.equals(job.a.b(CameraExtensionCharacteristics.class))) {
            return this.c;
        }
        return null;
    }
}
