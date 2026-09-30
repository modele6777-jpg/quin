package ai.askquin.ui.dailycard;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.s43;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wn2;
import defpackage.xad;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0083\b\u0018\u0000 C2\u00020\u0001:\u0002DEBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0089\u0001\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0010\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0018J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0018J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bHÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0018J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u0018J\u0084\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0018J\u0010\u0010(\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010+\u001a\u00020\u00072\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,J'\u00105\u001a\u0002022\u0006\u0010-\u001a\u00020\u00002\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u000200H\u0001¢\u0006\u0004\b3\u00104R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b\b\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00106\u001a\u0004\b<\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00106\u001a\u0004\b=\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010>\u001a\u0004\b?\u0010!R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010>\u001a\u0004\b@\u0010!R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00106\u001a\u0004\bA\u0010\u0018R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u00106\u001a\u0004\bB\u0010\u0018¨\u0006F"}, d2 = {"Lai/askquin/ui/dailycard/DailyCardShareRoute;", "", "", "date", "affirmation", "Ltech/chatmind/api/TarotCardType;", "cardType", "", "isReversed", "cardDescription", "explain", "", "dos", "donts", "skinName", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotCardType;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotCardType;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ltech/chatmind/api/TarotCardType;", "component4", "()Z", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotCardType;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Lai/askquin/ui/dailycard/DailyCardShareRoute;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_conversation_gpRelease", "(Lai/askquin/ui/dailycard/DailyCardShareRoute;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getDate", "getAffirmation", "Ltech/chatmind/api/TarotCardType;", "getCardType", "Z", "getCardDescription", "getExplain", "Ljava/util/List;", "getDos", "getDonts", "getSkinName", "getSource", "Companion", "ai/askquin/ui/dailycard/c", "s43", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DailyCardShareRoute {
    private static final lw7[] $childSerializers;
    public static final s43 Companion = new s43();
    private final String affirmation;
    private final String cardDescription;
    private final TarotCardType cardType;
    private final String date;
    private final List<String> donts;
    private final List<String> dos;
    private final String explain;
    private final boolean isReversed;
    private final String skinName;
    private final String source;

    static {
        b bVar = new b(0);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, eb3.N(z18Var, bVar), null, null, null, eb3.N(z18Var, new b(1)), eb3.N(z18Var, new b(2)), null, null};
    }

    public /* synthetic */ DailyCardShareRoute(int i, String str, String str2, TarotCardType tarotCardType, boolean z, String str3, String str4, List list, List list2, String str5, String str6, xyc xycVar) {
        if (63 != (i & 63)) {
            an1.R(i, 63, c.a.e());
            throw null;
        }
        this.date = str;
        this.affirmation = str2;
        this.cardType = tarotCardType;
        this.isReversed = z;
        this.cardDescription = str3;
        this.explain = str4;
        int i2 = i & 64;
        pu4 pu4Var = pu4.a;
        if (i2 == 0) {
            this.dos = pu4Var;
        } else {
            this.dos = list;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.donts = pu4Var;
        } else {
            this.donts = list2;
        }
        if ((i & 256) == 0) {
            this.skinName = null;
        } else {
            this.skinName = str5;
        }
        if ((i & 512) == 0) {
            this.source = xad.DailyCard.a();
        } else {
            this.source = str6;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_() {
        TarotCardType[] tarotCardTypeArrValues = TarotCardType.values();
        tarotCardTypeArrValues.getClass();
        return new wn2("tech.chatmind.api.TarotCardType", tarotCardTypeArrValues);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DailyCardShareRoute copy$default(DailyCardShareRoute dailyCardShareRoute, String str, String str2, TarotCardType tarotCardType, boolean z, String str3, String str4, List list, List list2, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dailyCardShareRoute.date;
        }
        if ((i & 2) != 0) {
            str2 = dailyCardShareRoute.affirmation;
        }
        if ((i & 4) != 0) {
            tarotCardType = dailyCardShareRoute.cardType;
        }
        if ((i & 8) != 0) {
            z = dailyCardShareRoute.isReversed;
        }
        if ((i & 16) != 0) {
            str3 = dailyCardShareRoute.cardDescription;
        }
        if ((i & 32) != 0) {
            str4 = dailyCardShareRoute.explain;
        }
        if ((i & 64) != 0) {
            list = dailyCardShareRoute.dos;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            list2 = dailyCardShareRoute.donts;
        }
        if ((i & 256) != 0) {
            str5 = dailyCardShareRoute.skinName;
        }
        if ((i & 512) != 0) {
            str6 = dailyCardShareRoute.source;
        }
        String str7 = str5;
        String str8 = str6;
        List list3 = list;
        List list4 = list2;
        String str9 = str3;
        String str10 = str4;
        return dailyCardShareRoute.copy(str, str2, tarotCardType, z, str9, str10, list3, list4, str7, str8);
    }

    public static final /* synthetic */ void write$Self$Quin_conversation_gpRelease(DailyCardShareRoute self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.date);
        output.w(serialDesc, 1, self.affirmation);
        output.p(serialDesc, 2, (xn7) lw7VarArr[2].getValue(), self.cardType);
        output.o(serialDesc, 3, self.isReversed);
        output.w(serialDesc, 4, self.cardDescription);
        p4e p4eVar = p4e.a;
        output.A(serialDesc, 5, p4eVar, self.explain);
        boolean zG = output.g(serialDesc);
        pu4 pu4Var = pu4.a;
        if (zG || !pa7.t(self.dos, pu4Var)) {
            output.p(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.dos);
        }
        if (output.g(serialDesc) || !pa7.t(self.donts, pu4Var)) {
            output.p(serialDesc, 7, (xn7) lw7VarArr[7].getValue(), self.donts);
        }
        if (output.g(serialDesc) || self.skinName != null) {
            output.A(serialDesc, 8, p4eVar, self.skinName);
        }
        if (!output.g(serialDesc) && pa7.t(self.source, xad.DailyCard.a())) {
            return;
        }
        output.w(serialDesc, 9, self.source);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAffirmation() {
        return this.affirmation;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final TarotCardType getCardType() {
        return this.cardType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getIsReversed() {
        return this.isReversed;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getCardDescription() {
        return this.cardDescription;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getExplain() {
        return this.explain;
    }

    public final List<String> component7() {
        return this.dos;
    }

    public final List<String> component8() {
        return this.donts;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getSkinName() {
        return this.skinName;
    }

    public final DailyCardShareRoute copy(String date, String affirmation, TarotCardType cardType, boolean isReversed, String cardDescription, String explain, List<String> dos, List<String> donts, String skinName, String source) {
        date.getClass();
        affirmation.getClass();
        cardType.getClass();
        cardDescription.getClass();
        dos.getClass();
        donts.getClass();
        source.getClass();
        return new DailyCardShareRoute(date, affirmation, cardType, isReversed, cardDescription, explain, dos, donts, skinName, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyCardShareRoute)) {
            return false;
        }
        DailyCardShareRoute dailyCardShareRoute = (DailyCardShareRoute) other;
        return pa7.t(this.date, dailyCardShareRoute.date) && pa7.t(this.affirmation, dailyCardShareRoute.affirmation) && this.cardType == dailyCardShareRoute.cardType && this.isReversed == dailyCardShareRoute.isReversed && pa7.t(this.cardDescription, dailyCardShareRoute.cardDescription) && pa7.t(this.explain, dailyCardShareRoute.explain) && pa7.t(this.dos, dailyCardShareRoute.dos) && pa7.t(this.donts, dailyCardShareRoute.donts) && pa7.t(this.skinName, dailyCardShareRoute.skinName) && pa7.t(this.source, dailyCardShareRoute.source);
    }

    public final String getAffirmation() {
        return this.affirmation;
    }

    public final String getCardDescription() {
        return this.cardDescription;
    }

    public final TarotCardType getCardType() {
        return this.cardType;
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

    public final String getSkinName() {
        return this.skinName;
    }

    public final String getSource() {
        return this.source;
    }

    public int hashCode() {
        int iC = ub3.c(ub3.d((this.cardType.hashCode() + ub3.c(this.date.hashCode() * 31, 31, this.affirmation)) * 31, 31, this.isReversed), 31, this.cardDescription);
        String str = this.explain;
        int iA = tec.a(tec.a((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.dos), 31, this.donts);
        String str2 = this.skinName;
        return this.source.hashCode() + ((iA + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isReversed() {
        return this.isReversed;
    }

    public String toString() {
        String str = this.date;
        String str2 = this.affirmation;
        TarotCardType tarotCardType = this.cardType;
        boolean z = this.isReversed;
        String str3 = this.cardDescription;
        String str4 = this.explain;
        List<String> list = this.dos;
        List<String> list2 = this.donts;
        String str5 = this.skinName;
        String str6 = this.source;
        StringBuilder sbO = ib8.o("DailyCardShareRoute(date=", str, ", affirmation=", str2, ", cardType=");
        sbO.append(tarotCardType);
        sbO.append(", isReversed=");
        sbO.append(z);
        sbO.append(", cardDescription=");
        ub3.v(sbO, str3, ", explain=", str4, ", dos=");
        sbO.append(list);
        sbO.append(", donts=");
        sbO.append(list2);
        sbO.append(", skinName=");
        return ks0.m(sbO, str5, ", source=", str6, ")");
    }

    public DailyCardShareRoute(String str, String str2, TarotCardType tarotCardType, boolean z, String str3, String str4, List<String> list, List<String> list2, String str5, String str6) {
        str.getClass();
        str2.getClass();
        tarotCardType.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        str6.getClass();
        this.date = str;
        this.affirmation = str2;
        this.cardType = tarotCardType;
        this.isReversed = z;
        this.cardDescription = str3;
        this.explain = str4;
        this.dos = list;
        this.donts = list2;
        this.skinName = str5;
        this.source = str6;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ DailyCardShareRoute(String str, String str2, TarotCardType tarotCardType, boolean z, String str3, String str4, List list, List list2, String str5, String str6, int i, rp3 rp3Var) {
        int i2 = i & 64;
        pu4 pu4Var = pu4.a;
        this(str, str2, tarotCardType, z, str3, str4, i2 != 0 ? pu4Var : list, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? pu4Var : list2, (i & 256) != 0 ? null : str5, (i & 512) != 0 ? xad.DailyCard.a() : str6);
    }
}
