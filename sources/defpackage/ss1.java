package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ss1 implements a26 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ xp1 b;
    public final /* synthetic */ e89 c;

    public ss1(boolean z, xp1 xp1Var, e89 e89Var) {
        this.a = z;
        this.b = xp1Var;
        this.c = e89Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Object value;
        List list;
        ArrayList arrayList;
        TarotCardType tarotCardType = (TarotCardType) obj;
        tarotCardType.getClass();
        if (this.a) {
            this.c.setValue(tarotCardType);
        } else {
            xp1 xp1Var = this.b;
            Map map = xp1Var.e;
            if (!xp1Var.d.contains(tarotCardType)) {
                s0e s0eVar = xp1Var.c;
                do {
                    value = s0eVar.getValue();
                    list = (List) value;
                    Iterator it = list.iterator();
                    int i = 0;
                    int i2 = 0;
                    while (true) {
                        if (!it.hasNext()) {
                            i2 = -1;
                            break;
                        }
                        if (((TarotCardChoice) it.next()).getCard() == tarotCardType) {
                            break;
                        }
                        i2++;
                    }
                    if (i2 != -1) {
                        arrayList = new ArrayList();
                        for (Object obj2 : list) {
                            int i3 = i + 1;
                            if (i < 0) {
                                t72.Z();
                                throw null;
                            }
                            if (i != i2) {
                                arrayList.add(obj2);
                            }
                            i = i3;
                        }
                    } else if (!((eie) xp1Var.g.a.getValue()).a) {
                        if (xp1Var.b && !list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (map.get(((TarotCardChoice) it2.next()).getCard()) == map.get(tarotCardType)) {
                                    }
                                }
                            }
                        }
                        arrayList = s72.R0(list, new TarotCardChoice(tarotCardType, false, (String) null, 4, (rp3) null));
                    }
                    list = arrayList;
                } while (!s0eVar.l(value, list));
            }
        }
        return wef.a;
    }
}
