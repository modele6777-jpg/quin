package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import tech.chatmind.api.SkinType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class eod implements xn7 {
    public static final eod a = new eod();
    public static final hua b = eec.c("SkinType");
    public static final LinkedHashMap c;

    static {
        String strName;
        lx4 entries = SkinType.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((SkinType) obj) != SkinType.Unknown) {
                arrayList.add(obj);
            }
        }
        int iF = bm8.F(t72.u(arrayList, 10));
        if (iF < 16) {
            iF = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
        for (Object obj2 : arrayList) {
            SkinType skinType = (SkinType) obj2;
            syc sycVar = (syc) SkinType.class.getField(skinType.name()).getAnnotation(syc.class);
            if (sycVar == null || (strName = sycVar.value()) == null) {
                strName = skinType.name();
            }
            linkedHashMap.put(strName, obj2);
        }
        c = linkedHashMap;
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        String strName;
        SkinType skinType = (SkinType) obj;
        skinType.getClass();
        syc sycVar = (syc) SkinType.class.getField(skinType.name()).getAnnotation(syc.class);
        if (sycVar == null || (strName = sycVar.value()) == null) {
            strName = skinType.name();
        }
        ev4Var.D(strName);
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        SkinType skinType = (SkinType) c.get(om3Var.u());
        return skinType == null ? SkinType.Unknown : skinType;
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
