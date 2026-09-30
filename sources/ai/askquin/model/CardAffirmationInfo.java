package ai.askquin.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.hp1;
import defpackage.ib8;
import defpackage.ip1;
import defpackage.jl0;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.syc;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GHBg\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eB\u008d\u0001\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\r\u0010\u0013J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0015J\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0015J\u0010\u0010\u001d\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0082\u0001\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J'\u00100\u001a\u00020-2\u0006\u0010(\u001a\u00020\u00002\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+H\u0001¢\u0006\u0004\b.\u0010/R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0004\u00101\u0012\u0004\b3\u00104\u001a\u0004\b2\u0010\u0015R&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u00101\u0012\u0004\b6\u00104\u001a\u0004\b5\u0010\u0015R \u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u00107\u0012\u0004\b9\u00104\u001a\u0004\b8\u0010\u0018R \u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u00107\u0012\u0004\b;\u00104\u001a\u0004\b:\u0010\u0018R \u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u00107\u0012\u0004\b=\u00104\u001a\u0004\b<\u0010\u0018R&\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\t\u00101\u0012\u0004\b?\u00104\u001a\u0004\b>\u0010\u0015R&\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\n\u00101\u0012\u0004\bA\u00104\u001a\u0004\b@\u0010\u0015R \u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u00107\u0012\u0004\bC\u00104\u001a\u0004\bB\u0010\u0018R \u0010\f\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\f\u00107\u0012\u0004\bE\u00104\u001a\u0004\bD\u0010\u0018¨\u0006I"}, d2 = {"Lai/askquin/model/CardAffirmationInfo;", "", "", "", "cardAffirmationsCn", "cardAffirmationsEn", "cardDescCn", "cardDescEn", "cardKey", "reversedCardAffirmationsCn", "reversedCardAffirmationsEn", "reversedCardDescCn", "reversedCardDescEn", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "component1", "()Ljava/util/List;", "component2", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/model/CardAffirmationInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_model", "(Lai/askquin/model/CardAffirmationInfo;Lag2;Lnyc;)V", "write$Self", "Ljava/util/List;", "getCardAffirmationsCn", "getCardAffirmationsCn$annotations", "()V", "getCardAffirmationsEn", "getCardAffirmationsEn$annotations", "Ljava/lang/String;", "getCardDescCn", "getCardDescCn$annotations", "getCardDescEn", "getCardDescEn$annotations", "getCardKey", "getCardKey$annotations", "getReversedCardAffirmationsCn", "getReversedCardAffirmationsCn$annotations", "getReversedCardAffirmationsEn", "getReversedCardAffirmationsEn$annotations", "getReversedCardDescCn", "getReversedCardDescCn$annotations", "getReversedCardDescEn", "getReversedCardDescEn$annotations", "Companion", "hp1", "ip1", "Quin.core:model"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class CardAffirmationInfo {
    private static final lw7[] $childSerializers;
    public static final ip1 Companion = new ip1();
    private final List<String> cardAffirmationsCn;
    private final List<String> cardAffirmationsEn;
    private final String cardDescCn;
    private final String cardDescEn;
    private final String cardKey;
    private final List<String> reversedCardAffirmationsCn;
    private final List<String> reversedCardAffirmationsEn;
    private final String reversedCardDescCn;
    private final String reversedCardDescEn;

    static {
        jl0 jl0Var = new jl0(15);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{eb3.N(z18Var, jl0Var), eb3.N(z18Var, new jl0(16)), null, null, null, eb3.N(z18Var, new jl0(17)), eb3.N(z18Var, new jl0(18)), null, null};
    }

    public CardAffirmationInfo(List<String> list, List<String> list2, String str, String str2, String str3, List<String> list3, List<String> list4, String str4, String str5) {
        list.getClass();
        list2.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        list3.getClass();
        list4.getClass();
        str4.getClass();
        str5.getClass();
        this.cardAffirmationsCn = list;
        this.cardAffirmationsEn = list2;
        this.cardDescCn = str;
        this.cardDescEn = str2;
        this.cardKey = str3;
        this.reversedCardAffirmationsCn = list3;
        this.reversedCardAffirmationsEn = list4;
        this.reversedCardDescCn = str4;
        this.reversedCardDescEn = str5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$2() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardAffirmationInfo copy$default(CardAffirmationInfo cardAffirmationInfo, List list, List list2, String str, String str2, String str3, List list3, List list4, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cardAffirmationInfo.cardAffirmationsCn;
        }
        if ((i & 2) != 0) {
            list2 = cardAffirmationInfo.cardAffirmationsEn;
        }
        if ((i & 4) != 0) {
            str = cardAffirmationInfo.cardDescCn;
        }
        if ((i & 8) != 0) {
            str2 = cardAffirmationInfo.cardDescEn;
        }
        if ((i & 16) != 0) {
            str3 = cardAffirmationInfo.cardKey;
        }
        if ((i & 32) != 0) {
            list3 = cardAffirmationInfo.reversedCardAffirmationsCn;
        }
        if ((i & 64) != 0) {
            list4 = cardAffirmationInfo.reversedCardAffirmationsEn;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str4 = cardAffirmationInfo.reversedCardDescCn;
        }
        if ((i & 256) != 0) {
            str5 = cardAffirmationInfo.reversedCardDescEn;
        }
        String str6 = str4;
        String str7 = str5;
        List list5 = list3;
        List list6 = list4;
        String str8 = str3;
        String str9 = str;
        return cardAffirmationInfo.copy(list, list2, str9, str2, str8, list5, list6, str6, str7);
    }

    public static final /* synthetic */ void write$Self$Quin_core_model(CardAffirmationInfo self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.p(serialDesc, 0, (xn7) lw7VarArr[0].getValue(), self.cardAffirmationsCn);
        output.p(serialDesc, 1, (xn7) lw7VarArr[1].getValue(), self.cardAffirmationsEn);
        output.w(serialDesc, 2, self.cardDescCn);
        output.w(serialDesc, 3, self.cardDescEn);
        output.w(serialDesc, 4, self.cardKey);
        output.p(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.reversedCardAffirmationsCn);
        output.p(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.reversedCardAffirmationsEn);
        output.w(serialDesc, 7, self.reversedCardDescCn);
        output.w(serialDesc, 8, self.reversedCardDescEn);
    }

    public final List<String> component1() {
        return this.cardAffirmationsCn;
    }

    public final List<String> component2() {
        return this.cardAffirmationsEn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCardDescCn() {
        return this.cardDescCn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardDescEn() {
        return this.cardDescEn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCardKey() {
        return this.cardKey;
    }

    public final List<String> component6() {
        return this.reversedCardAffirmationsCn;
    }

    public final List<String> component7() {
        return this.reversedCardAffirmationsEn;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getReversedCardDescCn() {
        return this.reversedCardDescCn;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getReversedCardDescEn() {
        return this.reversedCardDescEn;
    }

    public final CardAffirmationInfo copy(List<String> cardAffirmationsCn, List<String> cardAffirmationsEn, String cardDescCn, String cardDescEn, String cardKey, List<String> reversedCardAffirmationsCn, List<String> reversedCardAffirmationsEn, String reversedCardDescCn, String reversedCardDescEn) {
        cardAffirmationsCn.getClass();
        cardAffirmationsEn.getClass();
        cardDescCn.getClass();
        cardDescEn.getClass();
        cardKey.getClass();
        reversedCardAffirmationsCn.getClass();
        reversedCardAffirmationsEn.getClass();
        reversedCardDescCn.getClass();
        reversedCardDescEn.getClass();
        return new CardAffirmationInfo(cardAffirmationsCn, cardAffirmationsEn, cardDescCn, cardDescEn, cardKey, reversedCardAffirmationsCn, reversedCardAffirmationsEn, reversedCardDescCn, reversedCardDescEn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardAffirmationInfo)) {
            return false;
        }
        CardAffirmationInfo cardAffirmationInfo = (CardAffirmationInfo) other;
        return pa7.t(this.cardAffirmationsCn, cardAffirmationInfo.cardAffirmationsCn) && pa7.t(this.cardAffirmationsEn, cardAffirmationInfo.cardAffirmationsEn) && pa7.t(this.cardDescCn, cardAffirmationInfo.cardDescCn) && pa7.t(this.cardDescEn, cardAffirmationInfo.cardDescEn) && pa7.t(this.cardKey, cardAffirmationInfo.cardKey) && pa7.t(this.reversedCardAffirmationsCn, cardAffirmationInfo.reversedCardAffirmationsCn) && pa7.t(this.reversedCardAffirmationsEn, cardAffirmationInfo.reversedCardAffirmationsEn) && pa7.t(this.reversedCardDescCn, cardAffirmationInfo.reversedCardDescCn) && pa7.t(this.reversedCardDescEn, cardAffirmationInfo.reversedCardDescEn);
    }

    public final List<String> getCardAffirmationsCn() {
        return this.cardAffirmationsCn;
    }

    public final List<String> getCardAffirmationsEn() {
        return this.cardAffirmationsEn;
    }

    public final String getCardDescCn() {
        return this.cardDescCn;
    }

    public final String getCardDescEn() {
        return this.cardDescEn;
    }

    public final String getCardKey() {
        return this.cardKey;
    }

    public final List<String> getReversedCardAffirmationsCn() {
        return this.reversedCardAffirmationsCn;
    }

    public final List<String> getReversedCardAffirmationsEn() {
        return this.reversedCardAffirmationsEn;
    }

    public final String getReversedCardDescCn() {
        return this.reversedCardDescCn;
    }

    public final String getReversedCardDescEn() {
        return this.reversedCardDescEn;
    }

    public int hashCode() {
        return this.reversedCardDescEn.hashCode() + ub3.c(tec.a(tec.a(ub3.c(ub3.c(ub3.c(tec.a(this.cardAffirmationsCn.hashCode() * 31, 31, this.cardAffirmationsEn), 31, this.cardDescCn), 31, this.cardDescEn), 31, this.cardKey), 31, this.reversedCardAffirmationsCn), 31, this.reversedCardAffirmationsEn), 31, this.reversedCardDescCn);
    }

    public String toString() {
        List<String> list = this.cardAffirmationsCn;
        List<String> list2 = this.cardAffirmationsEn;
        String str = this.cardDescCn;
        String str2 = this.cardDescEn;
        String str3 = this.cardKey;
        List<String> list3 = this.reversedCardAffirmationsCn;
        List<String> list4 = this.reversedCardAffirmationsEn;
        String str4 = this.reversedCardDescCn;
        String str5 = this.reversedCardDescEn;
        StringBuilder sb = new StringBuilder("CardAffirmationInfo(cardAffirmationsCn=");
        sb.append(list);
        sb.append(", cardAffirmationsEn=");
        sb.append(list2);
        sb.append(", cardDescCn=");
        ub3.v(sb, str, ", cardDescEn=", str2, ", cardKey=");
        ib8.v(sb, str3, ", reversedCardAffirmationsCn=", list3, ", reversedCardAffirmationsEn=");
        sb.append(list4);
        sb.append(", reversedCardDescCn=");
        sb.append(str4);
        sb.append(", reversedCardDescEn=");
        return ks0.l(sb, str5, ")");
    }

    @syc("card_affirmations_cn")
    public static /* synthetic */ void getCardAffirmationsCn$annotations() {
    }

    @syc("card_affirmations_en")
    public static /* synthetic */ void getCardAffirmationsEn$annotations() {
    }

    @syc("card_desc_cn")
    public static /* synthetic */ void getCardDescCn$annotations() {
    }

    @syc("card_desc_en")
    public static /* synthetic */ void getCardDescEn$annotations() {
    }

    @syc("card_key")
    public static /* synthetic */ void getCardKey$annotations() {
    }

    @syc("reversed_card_affirmations_cn")
    public static /* synthetic */ void getReversedCardAffirmationsCn$annotations() {
    }

    @syc("reversed_card_affirmations_en")
    public static /* synthetic */ void getReversedCardAffirmationsEn$annotations() {
    }

    @syc("reversed_card_desc_cn")
    public static /* synthetic */ void getReversedCardDescCn$annotations() {
    }

    @syc("reversed_card_desc_en")
    public static /* synthetic */ void getReversedCardDescEn$annotations() {
    }

    public /* synthetic */ CardAffirmationInfo(int i, List list, List list2, String str, String str2, String str3, List list3, List list4, String str4, String str5, xyc xycVar) {
        if (511 != (i & 511)) {
            an1.R(i, 511, hp1.a.e());
            throw null;
        }
        this.cardAffirmationsCn = list;
        this.cardAffirmationsEn = list2;
        this.cardDescCn = str;
        this.cardDescEn = str2;
        this.cardKey = str3;
        this.reversedCardAffirmationsCn = list3;
        this.reversedCardAffirmationsEn = list4;
        this.reversedCardDescCn = str4;
        this.reversedCardDescEn = str5;
    }
}
