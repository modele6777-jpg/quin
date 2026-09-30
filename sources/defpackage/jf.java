package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jf extends od4 {
    public final /* synthetic */ int c0;
    public final /* synthetic */ tb2 d0;
    public final /* synthetic */ String e0;
    public final /* synthetic */ mh3 f0;

    public /* synthetic */ jf(tb2 tb2Var, String str, mh3 mh3Var, int i) {
        this.c0 = i;
        this.d0 = tb2Var;
        this.e0 = str;
        this.f0 = mh3Var;
    }

    public void L() {
        this.d0.e(this.e0);
    }

    @Override // defpackage.od4
    public final void y(Object obj, eb3 eb3Var) throws Exception {
        int i = this.c0;
        mh3 mh3Var = this.f0;
        String str = this.e0;
        tb2 tb2Var = this.d0;
        switch (i) {
            case 0:
                LinkedHashMap linkedHashMap = tb2Var.b;
                ArrayList arrayList = tb2Var.d;
                Object obj2 = linkedHashMap.get(str);
                if (obj2 == null) {
                    ho7.q("Attempting to launch an unregistered ActivityResultLauncher with contract ", mh3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    tb2Var.b(iIntValue, mh3Var, obj, eb3Var);
                    return;
                } catch (Exception e) {
                    arrayList.remove(str);
                    throw e;
                }
            default:
                ArrayList arrayList2 = tb2Var.d;
                Object obj3 = tb2Var.b.get(str);
                if (obj3 == null) {
                    ho7.q("Attempting to launch an unregistered ActivityResultLauncher with contract ", mh3Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                int iIntValue2 = ((Number) obj3).intValue();
                arrayList2.add(str);
                try {
                    tb2Var.b(iIntValue2, mh3Var, obj, eb3Var);
                    return;
                } catch (Exception e2) {
                    arrayList2.remove(str);
                    throw e2;
                }
        }
    }
}
