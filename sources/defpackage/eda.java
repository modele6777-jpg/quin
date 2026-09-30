package defpackage;

import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eda extends ewf implements hf8 {
    public static final /* synthetic */ int e = 0;
    public final s0e b;
    public final whb c;
    public final vz9 d;

    public eda(List list, List list2, gda gdaVar) {
        int size = list2.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(null);
        }
        int i2 = 0;
        for (Object obj : s72.c1(list, size)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                t72.Z();
                throw null;
            }
            arrayList.set(i2, (TarotCardChoice) obj);
            i2 = i3;
        }
        s0e s0eVarA = t0e.a(new dda(list2, arrayList, false));
        this.b = s0eVarA;
        this.c = if9.n(s0eVarA);
        this.d = q1c.f(Boolean.FALSE);
    }

    public final void f(List list, boolean z) {
        s0e s0eVar;
        Object value;
        dda ddaVar;
        ArrayList arrayList;
        list.getClass();
        do {
            s0eVar = this.b;
            value = s0eVar.getValue();
            ddaVar = (dda) value;
            int size = ddaVar.a.size();
            arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(null);
            }
            int i2 = 0;
            for (Object obj : s72.c1(list, ddaVar.a.size())) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    t72.Z();
                    throw null;
                }
                arrayList.set(i2, (TarotCardChoice) obj);
                i2 = i3;
            }
        } while (!s0eVar.l(value, dda.a(ddaVar, null, arrayList, ddaVar.c || z, 1)));
    }
}
