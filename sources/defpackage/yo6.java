package defpackage;

import ai.askquin.model.CardAffirmationInfo;
import ai.askquin.model.DailyFortuneDirectionContent;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.repository.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.dailycard.model.DailyCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yo6 extends gbe implements q26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ b $localAssetRepository;
    final /* synthetic */ b93 $window;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$13;
    Object L$14;
    /* synthetic */ Object L$2;
    /* synthetic */ Object L$3;
    /* synthetic */ Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ kq6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo6(kq6 kq6Var, b93 b93Var, String str, b bVar, xn2 xn2Var) {
        super(6, xn2Var);
        this.this$0 = kq6Var;
        this.$window = b93Var;
        this.$accountId = str;
        this.$localAssetRepository = bVar;
    }

    public static final z63 x(List list, b bVar, lb8 lb8Var, TarotSkinIdentify tarotSkinIdentify, mfc mfcVar, LocalDate localDate) {
        Object next;
        int i;
        Object next2;
        String cardDescEn;
        String str;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!pa7.t(((DailyCard) next).getDate(), localDate.toString()));
        DailyCard dailyCard = (DailyCard) next;
        if (dailyCard != null) {
            String key = dailyCard.getKey();
            int direction = dailyCard.getDirection();
            if (direction == 0) {
                i = 0;
            } else {
                if (direction != 1) {
                    qc0.j(tec.e(direction, "Invalid orientation value: "));
                    return null;
                }
                i = 1;
            }
            qhe qheVar = new qhe(key, i);
            bVar.getClass();
            if (((List) bVar.c.getValue()).isEmpty()) {
                synchronized (bVar) {
                    if (((List) bVar.c.getValue()).isEmpty()) {
                        InputStream inputStreamOpen = bVar.a.getAssets().open("affirmation.json");
                        inputStreamOpen.getClass();
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, ox1.a), UserMetadata.MAX_INTERNAL_KEY_SIZE);
                        try {
                            String strL = o5c.l(bufferedReader);
                            bufferedReader.close();
                            xh7 xh7Var = fzc.a;
                            xh7Var.getClass();
                            Object objB = xh7Var.b(new dd0(CardAffirmationInfo.Companion.serializer(), 0), strL);
                            bVar.c.setValue((List) objB);
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ym8.t(bufferedReader, th);
                                throw th2;
                            }
                        }
                    }
                }
            }
            Iterator it2 = ((List) bVar.c.getValue()).iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!pa7.t(((CardAffirmationInfo) next2).getCardKey(), qheVar.a));
            CardAffirmationInfo cardAffirmationInfo = (CardAffirmationInfo) next2;
            if (cardAffirmationInfo == null) {
                str = null;
            } else {
                boolean zC = c5e.C(vd8.a(), "zh", false);
                int i2 = qheVar.b;
                if (zC) {
                    cardDescEn = i2 == 1 ? cardAffirmationInfo.getCardDescCn() : cardAffirmationInfo.getReversedCardDescCn();
                } else {
                    cardDescEn = i2 == 1 ? cardAffirmationInfo.getCardDescEn() : cardAffirmationInfo.getReversedCardDescEn();
                }
                str = cardDescEn;
            }
            if (str != null) {
                DailyFortuneDirectionContent dailyFortuneDirectionContentB = bVar.b(qheVar);
                TarotSkinIdentify tarotSkinIdentifyA0 = oa7.a0(localDate, lb8Var.u, tarotSkinIdentify, mfcVar);
                String date = dailyCard.getDate();
                String affirmation = dailyFortuneDirectionContentB != null ? dailyFortuneDirectionContentB.getAffirmation() : null;
                if (affirmation == null) {
                    affirmation = "";
                }
                String str2 = affirmation;
                String reading = dailyFortuneDirectionContentB != null ? dailyFortuneDirectionContentB.getReading() : null;
                if (reading == null) {
                    reading = "";
                }
                return new z63(date, qheVar, str, str2, reading, tarotSkinIdentifyA0);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x01d4 A[LOOP:2: B:25:0x01ce->B:27:0x01d4, LOOP_END] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x025f, code lost:
    
        if (r7 == r13) goto L30;
     */
    /* JADX WARN: Type inference failed for: r7v30, types: [java.time.ZonedDateTime] */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r33) {
        /*
            Method dump skipped, instruction units count: 811
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yo6.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.q26
    public final Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        yo6 yo6Var = new yo6(this.this$0, this.$window, this.$accountId, this.$localAssetRepository, (xn2) obj6);
        yo6Var.L$0 = (LocalDate) obj;
        yo6Var.L$1 = (List) obj2;
        yo6Var.L$2 = (List) obj3;
        yo6Var.L$3 = (iy9) obj4;
        yo6Var.L$4 = (lb8) obj5;
        return yo6Var.r(wef.a);
    }
}
