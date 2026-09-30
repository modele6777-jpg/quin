package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xp1 extends ewf {
    public final boolean b;
    public final s0e c;
    public final Set d;
    public final Map e;
    public final LinkedHashMap f;
    public final whb g;

    public xp1(List list, int i, Set set, boolean z) {
        this.b = z;
        this.c = t0e.a(list);
        this.d = set;
        lx4<ArcanaGroup> entries = ArcanaGroup.getEntries();
        ArrayList arrayList = new ArrayList();
        for (ArcanaGroup arcanaGroup : entries) {
            List<TarotCardType> types = arcanaGroup.getTypes();
            ArrayList arrayList2 = new ArrayList(t72.u(types, 10));
            Iterator<T> it = types.iterator();
            while (it.hasNext()) {
                arrayList2.add(new iy9((TarotCardType) it.next(), arcanaGroup));
            }
            x72.g0(arrayList, arrayList2);
        }
        this.e = bm8.W(arrayList);
        lx4 entries2 = ArcanaGroup.getEntries();
        int iF = bm8.F(t72.u(entries2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF < 16 ? 16 : iF);
        for (Object obj : entries2) {
            List<TarotCardType> types2 = ((ArcanaGroup) obj).getTypes();
            ArrayList arrayList3 = new ArrayList(t72.u(types2, 10));
            for (TarotCardType tarotCardType : types2) {
                arrayList3.add(new zhe(tarotCardType, -1, false, set.contains(tarotCardType)));
            }
            linkedHashMap.put(obj, arrayList3);
        }
        this.f = linkedHashMap;
        this.g = if9.F(new wp1(this.c, this, i), hwf.a(this), new xzd(3000L, Long.MAX_VALUE), new eie(linkedHashMap, false));
    }
}
