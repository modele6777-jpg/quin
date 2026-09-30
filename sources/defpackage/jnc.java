package defpackage;

import ai.askquin.data.SeasonalDraftStore$Draft;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.ArcanaGroup;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jnc extends ewf {
    public final ckc b;
    public final mic c;
    public final List d;
    public final jsd e;

    public jnc(ckc ckcVar, mic micVar) {
        this.b = ckcVar;
        this.c = micVar;
        List list = rmc.a;
        this.d = list;
        SeasonalDraftStore$Draft seasonalDraftStore$DraftB = ckcVar.b(micVar.b(), micVar.c().getWireValue());
        List<TarotCardChoice> physicalSlots = seasonalDraftStore$DraftB != null ? seasonalDraftStore$DraftB.getPhysicalSlots() : null;
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(physicalSlots != null ? (TarotCardChoice) s72.y0(i, physicalSlots) : null);
        }
        jsd jsdVar = new jsd();
        jsdVar.addAll(arrayList);
        this.e = jsdVar;
    }

    public final boolean f() {
        jsd jsdVar = this.e;
        Iterable iterableB = t72.B(jsdVar);
        if ((iterableB instanceof Collection) && ((Collection) iterableB).isEmpty()) {
            return true;
        }
        Iterator it = iterableB.iterator();
        while (((y67) it).c) {
            int iNextInt = ((q67) it).nextInt();
            TarotCardChoice tarotCardChoice = (TarotCardChoice) jsdVar.get(iNextInt);
            TarotCardType card = tarotCardChoice != null ? tarotCardChoice.getCard() : null;
            if (card == null || !((ArcanaGroup) this.d.get(iNextInt)).getTypes().contains(card)) {
                return false;
            }
        }
        return true;
    }

    public final void g() {
        ynb.V(hwf.a(this), null, null, new inc(this, null), 3);
    }

    public final void h(List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TarotCardChoice tarotCardChoice = (TarotCardChoice) it.next();
            Iterator it2 = this.d.iterator();
            int i = 0;
            while (true) {
                if (!it2.hasNext()) {
                    i = -1;
                    break;
                } else if (((ArcanaGroup) it2.next()).getTypes().contains(tarotCardChoice.getCard())) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                this.e.set(i, tarotCardChoice);
            }
        }
        g();
    }
}
