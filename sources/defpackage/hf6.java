package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class hf6 {
    public static final ace a = new ace(new w66(13));
    public static final ace b = new ace(new w66(14));

    public static ArrayList a(w9e w9eVar, w9e w9eVar2) {
        ArrayList arrayList = new ArrayList();
        v9e v9eVar = new v9e();
        n3e n3eVar = z9e.e;
        n3e n3eVar2 = z9e.e;
        y9e y9eVar = y9e.a;
        v9eVar.a(g3e.c(y9eVar, w9eVar, n3eVar2));
        v9eVar.a(g3e.c(y9e.c, w9eVar2, n3eVar2));
        arrayList.add(v9eVar);
        v9e v9eVar2 = new v9e();
        v9eVar2.a(g3e.c(y9eVar, w9eVar, n3eVar2));
        v9eVar2.a(g3e.c(y9e.d, w9eVar2, n3eVar2));
        arrayList.add(v9eVar2);
        return arrayList;
    }

    public static ArrayList b(yg1 yg1Var, vuf vufVar) {
        yg1Var.getClass();
        vufVar.getClass();
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 35) {
            CameraCharacteristics.Key key = CameraCharacteristics.INFO_SESSION_CONFIGURATION_QUERY_VERSION;
            key.getClass();
            Object objC = ((nc1) yg1Var).c(key);
            if (objC == null) {
                qc0.j("Required value was null.");
                return null;
            }
            int iIntValue = ((Number) objC).intValue();
            if (iIntValue >= 35 && vufVar != vuf.d) {
                arrayList.addAll((List) a.getValue());
            }
            if (iIntValue >= 36 && vufVar != vuf.e) {
                arrayList.addAll((List) b.getValue());
                return arrayList;
            }
        }
        return arrayList;
    }
}
