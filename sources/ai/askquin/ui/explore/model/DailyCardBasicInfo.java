package ai.askquin.ui.explore.model;

import ai.askquin.model.TarotSkinIdentify;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.a33;
import defpackage.ag2;
import defpackage.an1;
import defpackage.b33;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.os2;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rhe;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 ?2\u00020\u0001:\u0002@AB]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fBw\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0016\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b'\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b(\u0010)Jp\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u001fJ\u0010\u0010-\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u001fR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b;\u0010&R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\b<\u0010&R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010=\u001a\u0004\b>\u0010)¨\u0006B"}, d2 = {"Lai/askquin/ui/explore/model/DailyCardBasicInfo;", "", "", "date", "affirmation", "Ltech/chatmind/api/TarotCardChoice;", "tarotCard", "cardDescription", "explain", "", "dos", "donts", "Lai/askquin/model/TarotSkinIdentify;", "skin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotCardChoice;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lai/askquin/model/TarotSkinIdentify;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotCardChoice;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lai/askquin/model/TarotSkinIdentify;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/explore/model/DailyCardBasicInfo;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ltech/chatmind/api/TarotCardChoice;", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "()Lai/askquin/model/TarotSkinIdentify;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotCardChoice;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lai/askquin/model/TarotSkinIdentify;)Lai/askquin/ui/explore/model/DailyCardBasicInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDate", "getAffirmation", "Ltech/chatmind/api/TarotCardChoice;", "getTarotCard", "getCardDescription", "getExplain", "Ljava/util/List;", "getDos", "getDonts", "Lai/askquin/model/TarotSkinIdentify;", "getSkin", "Companion", "a33", "b33", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DailyCardBasicInfo {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final b33 Companion = new b33();
    private final String affirmation;
    private final String cardDescription;
    private final String date;
    private final List<String> donts;
    private final List<String> dos;
    private final String explain;
    private final TarotSkinIdentify skin;
    private final TarotCardChoice tarotCard;

    static {
        os2 os2Var = new os2(9);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, null, null, eb3.N(z18Var, os2Var), eb3.N(z18Var, new os2(10)), eb3.N(z18Var, new os2(11))};
    }

    public /* synthetic */ DailyCardBasicInfo(int i, String str, String str2, TarotCardChoice tarotCardChoice, String str3, String str4, List list, List list2, TarotSkinIdentify tarotSkinIdentify, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, a33.a.e());
            throw null;
        }
        this.date = str;
        this.affirmation = str2;
        this.tarotCard = tarotCardChoice;
        this.cardDescription = str3;
        this.explain = str4;
        int i2 = i & 32;
        pu4 pu4Var = pu4.a;
        if (i2 == 0) {
            this.dos = pu4Var;
        } else {
            this.dos = list;
        }
        if ((i & 64) == 0) {
            this.donts = pu4Var;
        } else {
            this.donts = list2;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.skin = null;
        } else {
            this.skin = tarotSkinIdentify;
        }
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
        return TarotSkinIdentify.Companion.serializer();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyCardBasicInfo copy$default(DailyCardBasicInfo dailyCardBasicInfo, String str, String str2, TarotCardChoice tarotCardChoice, String str3, String str4, List list, List list2, TarotSkinIdentify tarotSkinIdentify, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyCardBasicInfo.date;
        }
        if ((i & 2) != 0) {
            str2 = dailyCardBasicInfo.affirmation;
        }
        if ((i & 4) != 0) {
            tarotCardChoice = dailyCardBasicInfo.tarotCard;
        }
        if ((i & 8) != 0) {
            str3 = dailyCardBasicInfo.cardDescription;
        }
        if ((i & 16) != 0) {
            str4 = dailyCardBasicInfo.explain;
        }
        if ((i & 32) != 0) {
            list = dailyCardBasicInfo.dos;
        }
        if ((i & 64) != 0) {
            list2 = dailyCardBasicInfo.donts;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            tarotSkinIdentify = dailyCardBasicInfo.skin;
        }
        List list3 = list2;
        TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
        String str5 = str4;
        List list4 = list;
        return dailyCardBasicInfo.copy(str, str2, tarotCardChoice, str3, str5, list4, list3, tarotSkinIdentify2);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(DailyCardBasicInfo self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.date);
        output.w(serialDesc, 1, self.affirmation);
        output.p(serialDesc, 2, rhe.a, self.tarotCard);
        output.w(serialDesc, 3, self.cardDescription);
        output.A(serialDesc, 4, p4e.a, self.explain);
        boolean zG = output.g(serialDesc);
        pu4 pu4Var = pu4.a;
        if (zG || !pa7.t(self.dos, pu4Var)) {
            output.p(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.dos);
        }
        if (output.g(serialDesc) || !pa7.t(self.donts, pu4Var)) {
            output.p(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.donts);
        }
        if (!output.g(serialDesc) && self.skin == null) {
            return;
        }
        output.A(serialDesc, 7, (xn7) lw7VarArr[7].getValue(), self.skin);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAffirmation() {
        return this.affirmation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TarotCardChoice getTarotCard() {
        return this.tarotCard;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCardDescription() {
        return this.cardDescription;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    public final List<String> component6() {
        return this.dos;
    }

    public final List<String> component7() {
        return this.donts;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final TarotSkinIdentify getSkin() {
        return this.skin;
    }

    public final DailyCardBasicInfo copy(String date, String affirmation, TarotCardChoice tarotCard, String cardDescription, String explain, List<String> dos, List<String> donts, TarotSkinIdentify skin) {
        date.getClass();
        affirmation.getClass();
        tarotCard.getClass();
        cardDescription.getClass();
        dos.getClass();
        donts.getClass();
        return new DailyCardBasicInfo(date, affirmation, tarotCard, cardDescription, explain, dos, donts, skin);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyCardBasicInfo)) {
            return false;
        }
        DailyCardBasicInfo dailyCardBasicInfo = (DailyCardBasicInfo) other;
        return pa7.t(this.date, dailyCardBasicInfo.date) && pa7.t(this.affirmation, dailyCardBasicInfo.affirmation) && pa7.t(this.tarotCard, dailyCardBasicInfo.tarotCard) && pa7.t(this.cardDescription, dailyCardBasicInfo.cardDescription) && pa7.t(this.explain, dailyCardBasicInfo.explain) && pa7.t(this.dos, dailyCardBasicInfo.dos) && pa7.t(this.donts, dailyCardBasicInfo.donts) && this.skin == dailyCardBasicInfo.skin;
    }

    public final String getAffirmation() {
        return this.affirmation;
    }

    public final String getCardDescription() {
        return this.cardDescription;
    }

    public final String getDate() {
        return this.date;
    }

    public final List<String> getDonts() {
        return this.donts;
    }

    public final List<String> getDos() {
        return this.dos;
    }

    public final String getExplain() {
        return this.explain;
    }

    public final TarotSkinIdentify getSkin() {
        return this.skin;
    }

    public final TarotCardChoice getTarotCard() {
        return this.tarotCard;
    }

    public int hashCode() {
        int iC = ub3.c((this.tarotCard.hashCode() + ub3.c(this.date.hashCode() * 31, 31, this.affirmation)) * 31, 31, this.cardDescription);
        String str = this.explain;
        int iA = tec.a(tec.a((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.dos), 31, this.donts);
        TarotSkinIdentify tarotSkinIdentify = this.skin;
        return iA + (tarotSkinIdentify != null ? tarotSkinIdentify.hashCode() : 0);
    }

    public String toString() {
        String str = this.date;
        String str2 = this.affirmation;
        TarotCardChoice tarotCardChoice = this.tarotCard;
        String str3 = this.cardDescription;
        String str4 = this.explain;
        List<String> list = this.dos;
        List<String> list2 = this.donts;
        TarotSkinIdentify tarotSkinIdentify = this.skin;
        StringBuilder sbO = ib8.o("DailyCardBasicInfo(date=", str, ", affirmation=", str2, ", tarotCard=");
        sbO.append(tarotCardChoice);
        sbO.append(", cardDescription=");
        sbO.append(str3);
        sbO.append(", explain=");
        ib8.v(sbO, str4, ", dos=", list, ", donts=");
        sbO.append(list2);
        sbO.append(", skin=");
        sbO.append(tarotSkinIdentify);
        sbO.append(")");
        return sbO.toString();
    }

    public DailyCardBasicInfo(String str, String str2, TarotCardChoice tarotCardChoice, String str3, String str4, List<String> list, List<String> list2, TarotSkinIdentify tarotSkinIdentify) {
        str.getClass();
        str2.getClass();
        tarotCardChoice.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        this.date = str;
        this.affirmation = str2;
        this.tarotCard = tarotCardChoice;
        this.cardDescription = str3;
        this.explain = str4;
        this.dos = list;
        this.donts = list2;
        this.skin = tarotSkinIdentify;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DailyCardBasicInfo(String str, String str2, TarotCardChoice tarotCardChoice, String str3, String str4, List list, List list2, TarotSkinIdentify tarotSkinIdentify, int i, rp3 rp3Var) {
        int i2 = i & 32;
        pu4 pu4Var = pu4.a;
        this(str, str2, tarotCardChoice, str3, str4, i2 != 0 ? pu4Var : list, (i & 64) != 0 ? pu4Var : list2, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : tarotSkinIdentify);
    }
}
