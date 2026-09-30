package defpackage;

import ai.askquin.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;
import tech.chatmind.api.generatecard.model.CardDetectionResponse;
import tech.chatmind.api.generatecard.model.CardPosition;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ki1 implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;

    public /* synthetic */ ki1(a26 a26Var, int i) {
        this.a = i;
        this.b = a26Var;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        Float fValueOf = null;
        wef wefVar = wef.a;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                List<CardDetectionResponse> list = (List) obj;
                if (list.isEmpty()) {
                    kv2.u(R.string.photo_decode_no_card, 0);
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (CardDetectionResponse cardDetectionResponse : list) {
                        fie fieVar = TarotCardType.Companion;
                        String tarotCardKey = cardDetectionResponse.getTarotCardKey();
                        fieVar.getClass();
                        TarotCardType tarotCardTypeA = fie.a(tarotCardKey);
                        TarotCardChoice tarotCardChoice = tarotCardTypeA != null ? new TarotCardChoice(tarotCardTypeA, cardDetectionResponse.getPosition() == CardPosition.REVERSE, (String) null, 4, (rp3) null) : null;
                        if (tarotCardChoice != null) {
                            arrayList.add(tarotCardChoice);
                        }
                    }
                    HashSet hashSet = new HashSet();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (hashSet.add(((TarotCardChoice) obj2).getCard())) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (arrayList2.size() != arrayList.size()) {
                        kv2.u(R.string.photo_duplicate_card, 0);
                    }
                    a26Var.d(arrayList2);
                }
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                try {
                    if (b5e.r(str)) {
                        fValueOf = Float.valueOf(Float.parseFloat(str));
                    }
                    break;
                } catch (NumberFormatException unused) {
                }
                if (fValueOf != null) {
                    a26Var.d(fValueOf);
                }
                break;
            case 2:
                String str2 = (String) obj;
                if (str2.length() == 0) {
                    a26Var.d(null);
                } else {
                    Integer numD = c5e.D(str2);
                    if (numD != null) {
                        a26Var.d(numD);
                    }
                }
                break;
            default:
                a26Var.d(new Integer(((Number) obj).intValue()));
                break;
        }
        return wefVar;
    }
}
