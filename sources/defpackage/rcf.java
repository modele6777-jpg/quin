package defpackage;

import ai.askquin.ui.draw.mixed.MixedDeckSnapshot;
import ai.askquin.ui.draw.model.DrawCardSaves;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class rcf extends ewf implements hf8 {
    public static final /* synthetic */ int x = 0;
    public final DrawCardSaves b;
    public final vz9 c;
    public final nqd d;
    public final vz9 e;
    public final jsd f;
    public final jsd g;
    public final vz9 v;
    public final vz9 w;

    public rcf(DrawCardSaves drawCardSaves) {
        this.b = drawCardSaves;
        this.c = q1c.f(drawCardSaves.getMixedDeck());
        this.d = new nqd();
        this.e = q1c.f(drawCardSaves.getPatterns());
        List<TarotCardChoice> choices = drawCardSaves.getChoices();
        jsd jsdVar = new jsd();
        jsdVar.addAll(choices);
        this.f = jsdVar;
        List<Integer> drawnIndexes = drawCardSaves.getDrawnIndexes();
        jsd jsdVar2 = new jsd();
        jsdVar2.addAll(drawnIndexes);
        this.g = jsdVar2;
        this.v = q1c.f(jsdVar.isEmpty() ? tn4.a : tn4.b);
        this.w = q1c.f(null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    /* JADX WARN: Multi-variable type inference failed */
    public final TarotCardChoice f() {
        String str;
        TarotCardChoice tarotCardChoice;
        ql6 ql6Var;
        ql6 ql6Var2;
        List<String> cardOrder;
        Integer numH = h();
        Object obj = null;
        if (numH != null) {
            int iIntValue = numH.intValue();
            MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) this.c.getValue();
            if (mixedDeckSnapshot == null || (cardOrder = mixedDeckSnapshot.getCardOrder()) == null) {
                str = null;
            } else {
                str = (String) s72.y0(iIntValue, cardOrder);
            }
        } else {
            str = null;
        }
        if (str != null) {
            for (Object obj2 : TarotCardType.getEntries()) {
                if (pa7.t(((TarotCardType) obj2).getCardKey(), str)) {
                    obj = obj2;
                    break;
                }
            }
            obj = (TarotCardType) obj;
        }
        TarotCardType tarotCardType = obj;
        jsd jsdVar = this.f;
        if (tarotCardType != 0) {
            if (jsdVar == null || !jsdVar.isEmpty()) {
                ListIterator listIterator = jsdVar.listIterator();
                do {
                    ql6Var2 = (ql6) listIterator;
                    if (ql6Var2.hasNext()) {
                    }
                } while (((TarotCardChoice) ql6Var2.next()).getCard() != tarotCardType);
            }
            lbb lbbVar = mbb.a;
            return new TarotCardChoice(tarotCardType, mbb.b.h().nextBoolean(), (String) null, 4, (rp3) null);
        }
        loop2: while (true) {
            lx4 entries = TarotCardType.getEntries();
            lbb lbbVar2 = mbb.a;
            tarotCardChoice = new TarotCardChoice((TarotCardType) s72.S0(entries), mbb.b.h().nextBoolean(), (String) null, 4, (rp3) null);
            if (jsdVar != null && jsdVar.isEmpty()) {
                break;
            }
            ListIterator listIterator2 = jsdVar.listIterator();
            do {
                ql6Var = (ql6) listIterator2;
                if (!ql6Var.hasNext()) {
                    break loop2;
                }
            } while (((TarotCardChoice) ql6Var.next()).getCard() != tarotCardChoice.getCard());
        }
        return tarotCardChoice;
    }

    public final tn4 g() {
        return (tn4) this.v.getValue();
    }

    public final Integer h() {
        return (Integer) this.w.getValue();
    }

    public final List i() {
        return (List) this.e.getValue();
    }

    public final boolean k() {
        return this.f.size() >= i().size();
    }

    public void l(TarotCardChoice tarotCardChoice, int i) {
        this.f.add(tarotCardChoice);
        this.g.add(Integer.valueOf(i));
        p(null);
        this.v.setValue(tn4.b);
    }

    public final void m() {
        MixedDeckSnapshot mixedDeckSnapshotCopy$default;
        vz9 vz9Var = this.c;
        MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) vz9Var.getValue();
        if (mixedDeckSnapshot != null) {
            List<String> cardOrder = mixedDeckSnapshot.getCardOrder();
            cardOrder.getClass();
            List listM1 = s72.m1(cardOrder);
            Collections.shuffle(listM1);
            mixedDeckSnapshotCopy$default = MixedDeckSnapshot.copy$default(mixedDeckSnapshot, null, null, listM1, 0, 11, null);
        } else {
            mixedDeckSnapshotCopy$default = null;
        }
        vz9Var.setValue(mixedDeckSnapshotCopy$default);
        this.v.setValue(tn4.b);
    }

    public final dt0 n() {
        Object next;
        if (k()) {
            return new ct0("drawing is already finished", "draw_finished");
        }
        Iterator it = new z67(1, 78, 1).iterator();
        do {
            if (!((y67) it).c) {
                next = null;
                break;
            }
            next = ((q67) it).next();
        } while (this.g.contains(Integer.valueOf(((Number) next).intValue())));
        Integer num = (Integer) next;
        if (num == null) {
            return new ct0("no available tarot card index", "no_available_index");
        }
        int iIntValue = num.intValue();
        TarotCardChoice tarotCardChoice = new TarotCardChoice(TarotCardType.DEATH, false, (String) null, 4, (rp3) null);
        l(tarotCardChoice, iIntValue);
        return new bt0(tarotCardChoice.getCard(), iIntValue, this.f.size(), k());
    }

    public final DrawCardSaves o() {
        nm4 nm4Var = DrawCardSaves.Companion;
        String chatId = this.b.getChatId();
        List listI = i();
        List listJ1 = s72.j1(this.f);
        List listJ2 = s72.j1(this.g);
        MixedDeckSnapshot mixedDeckSnapshot = (MixedDeckSnapshot) this.c.getValue();
        nm4Var.getClass();
        return nm4.a(chatId, listI, listJ1, listJ2, mixedDeckSnapshot);
    }

    public final void p(Integer num) {
        this.w.setValue(num);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public rcf(String str, ArrayList arrayList, List list, int i) {
        int i2 = i & 4;
        pu4 pu4Var = pu4.a;
        list = i2 != 0 ? pu4Var : list;
        DrawCardSaves.Companion.getClass();
        this(nm4.a(str, arrayList, list, pu4Var, null));
    }
}
