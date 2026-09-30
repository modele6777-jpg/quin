package defpackage;

import android.app.Application;
import android.content.Context;
import android.util.ArrayMap;
import android.util.Log;
import androidx.camera.camera2.compat.quirk.PreviewUnderExposureQuirk;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mk1 implements akf {
    public final ja4 b;

    public mk1(Context context) {
        context.getClass();
        this.b = ja4.g.x(context);
        if ((context instanceof Application) && b21.F(4, "CXCP")) {
            Log.i("CXCP", "The provided context (" + context + ") is application scoped and will be used to infer the default display for computing the default preview size, orientation, and default aspect ratio for UseCase outputs.");
        }
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Created UseCaseConfigurationMap");
        }
    }

    @Override // defpackage.akf
    public final qh2 a(zjf zjfVar, int i) {
        int i2;
        int i3;
        zjfVar.getClass();
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Creating config for " + zjfVar);
        }
        k79 k79VarJ = k79.j();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet hashSet = new HashSet();
        k79 k79VarJ2 = k79.j();
        ArrayList arrayList = new ArrayList();
        m89 m89VarA = m89.a();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        int iOrdinal = zjfVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            i2 = 1;
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4 && iOrdinal != 5) {
                ap.c();
                return null;
            }
            i2 = 1;
        } else {
            i2 = s74.a().b(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        no0 no0Var = xjf.e0;
        ArrayList arrayList5 = new ArrayList(linkedHashSet);
        ArrayList arrayList6 = new ArrayList(arrayList2);
        ArrayList arrayList7 = new ArrayList(arrayList3);
        ArrayList arrayList8 = new ArrayList(arrayList4);
        ArrayList arrayList9 = new ArrayList(hashSet);
        bs9 bs9VarD = bs9.d(k79VarJ2);
        ArrayList arrayList10 = new ArrayList(arrayList);
        wde wdeVar = wde.b;
        ArrayMap arrayMap = new ArrayMap();
        ArrayMap arrayMap2 = m89VarA.a;
        for (String str : arrayMap2.keySet()) {
            arrayMap.put(str, arrayMap2.get(str));
        }
        k79VarJ.p(no0Var, new zzc(arrayList5, arrayList6, arrayList7, arrayList8, new im1(arrayList9, bs9VarD, i2, arrayList10, new wde(arrayMap)), null, null, 0, null));
        HashSet hashSet2 = new HashSet();
        k79 k79VarJ3 = k79.j();
        ArrayList arrayList11 = new ArrayList();
        ArrayMap arrayMap3 = m89.a().a;
        int iOrdinal2 = zjfVar.ordinal();
        if (iOrdinal2 == 0) {
            i3 = i == 2 ? 5 : 2;
        } else if (iOrdinal2 == 1 || iOrdinal2 == 2) {
            i3 = 1;
        } else if (iOrdinal2 != 3) {
            if (iOrdinal2 != 4 && iOrdinal2 != 5) {
                ap.c();
                return null;
            }
            i3 = 1;
        } else {
            i3 = s74.a().b(PreviewUnderExposureQuirk.class) != null ? 1 : 3;
        }
        no0 no0Var2 = xjf.f0;
        ArrayList arrayList12 = new ArrayList(hashSet2);
        bs9 bs9VarD2 = bs9.d(k79VarJ3);
        ArrayList arrayList13 = new ArrayList(arrayList11);
        wde wdeVar2 = wde.b;
        ArrayMap arrayMap4 = new ArrayMap();
        for (String str2 : arrayMap3.keySet()) {
            arrayMap4.put(str2, arrayMap3.get(str2));
        }
        k79VarJ.p(no0Var2, new im1(arrayList12, bs9VarD2, i3, arrayList13, new wde(arrayMap4)));
        k79VarJ.p(xjf.h0, zjfVar == zjf.a ? kk1.b : ik1.a);
        k79VarJ.p(xjf.g0, jk1.a);
        zjf zjfVar2 = zjf.b;
        ja4 ja4Var = this.b;
        if (zjfVar == zjfVar2) {
            k79VarJ.p(ew6.L, ja4Var.c());
        }
        no0 no0Var3 = ew6.G;
        m8c m8cVar = ja4.g;
        k79VarJ.p(no0Var3, Integer.valueOf(ja4Var.b(true).getRotation()));
        return bs9.d(k79VarJ);
    }
}
