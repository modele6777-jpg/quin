package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import tech.chatmind.api.CloudMixedDeckSnapshot;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k62 implements xn7 {
    public static final k62 a = new k62();
    public static final pyc b = eec.o("CloudMixedDeckSnapshot", new nyc[0], new cz1(5));

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        CloudMixedDeckSnapshot cloudMixedDeckSnapshot = (CloudMixedDeckSnapshot) obj;
        cloudMixedDeckSnapshot.getClass();
        sh7 sh7Var = (sh7) ev4Var;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        yi7 yi7VarB = oh7.b(Integer.valueOf(cloudMixedDeckSnapshot.getVersion()));
        yi7VarB.getClass();
        Map<String, String> deckIDsByCardKey = cloudMixedDeckSnapshot.getDeckIDsByCardKey();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(bm8.F(deckIDsByCardKey.size()));
        Iterator<T> it = deckIDsByCardKey.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap2.put(entry.getKey(), oh7.c((String) entry.getValue()));
        }
        sh7Var.z(new ti7(linkedHashMap));
    }

    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        Integer numG;
        String strC;
        nh7 nh7VarM = ((jh7) om3Var).m();
        Map map = null;
        byte b2 = 0;
        byte b3 = 0;
        byte b4 = 0;
        byte b5 = 0;
        byte b6 = 0;
        byte b7 = 0;
        byte b8 = 0;
        ti7 ti7Var = nh7VarM instanceof ti7 ? (ti7) nh7VarM : null;
        int i = 3;
        int i2 = 0;
        if (ti7Var == null) {
            return new CloudMixedDeckSnapshot(i2, map, i, b8 == true ? 1 : 0);
        }
        Object obj = ti7Var.get("version");
        yi7 yi7Var = obj instanceof yi7 ? (yi7) obj : null;
        if (yi7Var == null || (numG = oh7.g(yi7Var)) == null) {
            return new CloudMixedDeckSnapshot(i2, b3 == true ? 1 : 0, i, b2 == true ? 1 : 0);
        }
        int iIntValue = numG.intValue();
        Object obj2 = ti7Var.get("deckIDsByCardKey");
        ti7 ti7Var2 = obj2 instanceof ti7 ? (ti7) obj2 : null;
        if (ti7Var2 == null) {
            return new CloudMixedDeckSnapshot(i2, b7 == true ? 1 : 0, i, b6 == true ? 1 : 0);
        }
        Map map2 = ti7Var2.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap(bm8.F(map2.size()));
        for (Map.Entry entry : map2.entrySet()) {
            Object key = entry.getKey();
            nh7 nh7Var = (nh7) entry.getValue();
            yi7 yi7Var2 = nh7Var instanceof yi7 ? (yi7) nh7Var : null;
            if (yi7Var2 != null) {
                if (!yi7Var2.d()) {
                    yi7Var2 = null;
                }
                if (yi7Var2 != null && (strC = yi7Var2.c()) != null) {
                    linkedHashMap.put(key, strC);
                }
            }
            return new CloudMixedDeckSnapshot(i2, b5 == true ? 1 : 0, i, b4 == true ? 1 : 0);
        }
        return new CloudMixedDeckSnapshot(iIntValue, linkedHashMap);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return b;
    }
}
