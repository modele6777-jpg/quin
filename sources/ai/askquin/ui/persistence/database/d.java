package ai.askquin.ui.persistence.database;

import defpackage.bm8;
import defpackage.dd0;
import defpackage.dzb;
import defpackage.ezb;
import defpackage.fzc;
import defpackage.iy9;
import defpackage.ld4;
import defpackage.s72;
import defpackage.t72;
import defpackage.the;
import defpackage.xh7;
import defpackage.xn7;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final dd0 a = t72.l(TarotCardChoice.Companion.serializer());

    public static String a(List list) {
        if (list == null) {
            return null;
        }
        if (!(list instanceof ld4)) {
            return fzc.a.d(a, list);
        }
        xh7 xh7Var = fzc.a;
        xn7 xn7VarSerializer = TarotCardChoiceListConverter$PersistedSummaryCards.Companion.serializer();
        ld4 ld4Var = (ld4) list;
        Map map = ld4Var.c;
        List<TarotCardChoice> list2 = ld4Var.a;
        ArrayList arrayList = new ArrayList(t72.u(list2, 10));
        for (TarotCardChoice tarotCardChoice : list2) {
            the theVar = TarotCardChoiceListConverter$PersistedSummaryCard.Companion;
            String str = (String) map.get(tarotCardChoice.getCard().getCardKey());
            theVar.getClass();
            arrayList.add(new TarotCardChoiceListConverter$PersistedSummaryCard(tarotCardChoice.getCard().name(), tarotCardChoice.isReversed(), tarotCardChoice.getTarotCardDesc(), str));
        }
        List<TarotCardChoice> list3 = ld4Var.b;
        ArrayList arrayList2 = new ArrayList(t72.u(list3, 10));
        for (TarotCardChoice tarotCardChoice2 : list3) {
            the theVar2 = TarotCardChoiceListConverter$PersistedSummaryCard.Companion;
            String str2 = (String) map.get(tarotCardChoice2.getCard().getCardKey());
            theVar2.getClass();
            arrayList2.add(new TarotCardChoiceListConverter$PersistedSummaryCard(tarotCardChoice2.getCard().name(), tarotCardChoice2.isReversed(), tarotCardChoice2.getTarotCardDesc(), str2));
        }
        return xh7Var.d(xn7VarSerializer, new TarotCardChoiceListConverter$PersistedSummaryCards(arrayList, arrayList2));
    }

    public static List b(String str) {
        Object dzbVar;
        TarotCardType card;
        String cardKey;
        String skin;
        if (str == null) {
            return null;
        }
        try {
            TarotCardChoiceListConverter$PersistedSummaryCards tarotCardChoiceListConverter$PersistedSummaryCards = (TarotCardChoiceListConverter$PersistedSummaryCards) fzc.a.b(TarotCardChoiceListConverter$PersistedSummaryCards.Companion.serializer(), str);
            List<TarotCardChoiceListConverter$PersistedSummaryCard> originalCards = tarotCardChoiceListConverter$PersistedSummaryCards.getOriginalCards();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = originalCards.iterator();
            while (it.hasNext()) {
                TarotCardChoice choice = ((TarotCardChoiceListConverter$PersistedSummaryCard) it.next()).toChoice();
                if (choice != null) {
                    arrayList.add(choice);
                }
            }
            List<TarotCardChoiceListConverter$PersistedSummaryCard> extraCards = tarotCardChoiceListConverter$PersistedSummaryCards.getExtraCards();
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it2 = extraCards.iterator();
            while (it2.hasNext()) {
                TarotCardChoice choice2 = ((TarotCardChoiceListConverter$PersistedSummaryCard) it2.next()).toChoice();
                if (choice2 != null) {
                    arrayList2.add(choice2);
                }
            }
            ArrayList<TarotCardChoiceListConverter$PersistedSummaryCard> arrayListQ0 = s72.Q0(tarotCardChoiceListConverter$PersistedSummaryCards.getOriginalCards(), tarotCardChoiceListConverter$PersistedSummaryCards.getExtraCards());
            ArrayList arrayList3 = new ArrayList();
            for (TarotCardChoiceListConverter$PersistedSummaryCard tarotCardChoiceListConverter$PersistedSummaryCard : arrayListQ0) {
                TarotCardChoice choice3 = tarotCardChoiceListConverter$PersistedSummaryCard.toChoice();
                iy9 iy9Var = (choice3 == null || (card = choice3.getCard()) == null || (cardKey = card.getCardKey()) == null || (skin = tarotCardChoiceListConverter$PersistedSummaryCard.getSkin()) == null) ? null : new iy9(cardKey, skin);
                if (iy9Var != null) {
                    arrayList3.add(iy9Var);
                }
            }
            dzbVar = new ld4(arrayList, arrayList2, bm8.W(arrayList3));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (ezb.a(dzbVar) != null) {
            try {
                dzbVar = (List) fzc.a.b(a, str);
            } catch (Throwable th2) {
                dzbVar = new dzb(th2);
            }
        }
        return (List) (dzbVar instanceof dzb ? null : dzbVar);
    }
}
