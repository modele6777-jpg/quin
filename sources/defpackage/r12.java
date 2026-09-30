package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r12 extends ewf {
    public final String b;
    public final String c;
    public final MixedDeckSnapshot d;
    public LinkedHashSet e;
    public final ArrayList f;
    public final vz9 g;
    public final vz9 v;

    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    public r12(String str, String str2, List list, MixedDeckSnapshot mixedDeckSnapshot) {
        ArrayList arrayList;
        List<String> cardOrder;
        TarotCardType tarotCardType;
        this.b = str;
        this.c = str2;
        this.d = mixedDeckSnapshot;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((TarotCardChoice) it.next()).getCard());
        }
        this.e = linkedHashSet;
        MixedDeckSnapshot mixedDeckSnapshot2 = this.d;
        if (mixedDeckSnapshot2 == null) {
            arrayList = null;
        } else {
            mixedDeckSnapshot2 = mixedDeckSnapshot2.isValid() ? mixedDeckSnapshot2 : null;
            if (mixedDeckSnapshot2 == null || (cardOrder = mixedDeckSnapshot2.getCardOrder()) == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(t72.u(cardOrder, 10));
                for (String str3 : cardOrder) {
                    Iterator<E> it2 = TarotCardType.getEntries().iterator();
                    do {
                        if (!it2.hasNext()) {
                            r3.n("Collection contains no element matching the predicate.");
                            throw null;
                        }
                        tarotCardType = (TarotCardType) it2.next();
                    } while (!pa7.t(tarotCardType.getCardKey(), str3));
                    arrayList.add(tarotCardType);
                }
            }
        }
        this.f = arrayList;
        this.g = q1c.f(f());
        this.v = q1c.f(null);
        if (v4e.Q(this.b)) {
            qc0.j("requestMessageId must not be blank");
            throw null;
        }
        if (this.e.size() < ((d1) TarotCardType.getEntries()).c()) {
            return;
        }
        qc0.j("No clarifying card is available");
        throw null;
    }

    public final ArrayList f() {
        Iterable entries = this.f;
        if (entries == null) {
            entries = TarotCardType.getEntries();
        }
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : entries) {
            int i2 = i + 1;
            if (i < 0) {
                t72.Z();
                throw null;
            }
            Integer numValueOf = this.e.contains((TarotCardType) obj) ? Integer.valueOf(i) : null;
            if (numValueOf != null) {
                arrayList.add(numValueOf);
            }
            i = i2;
        }
        return arrayList;
    }
}
