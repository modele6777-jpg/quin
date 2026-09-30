package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.ond;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xhe;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.yhe;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0087\b\u0018\u0000 B2\u00020\u0001:\u0002CDB\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u009b\u0001\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000f\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0017J\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\tHÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0017J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0017J\u0096\u0001\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0017J\u0010\u0010&\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J'\u00104\u001a\u0002012\u0006\u0010,\u001a\u00020\u00002\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0001¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00105\u001a\u0004\b6\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00105\u001a\u0004\b7\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b8\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b9\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00105\u001a\u0004\b:\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00105\u001a\u0004\b;\u0010\u0017R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010<\u001a\u0004\b>\u0010\u001eR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010<\u001a\u0004\b?\u0010\u001eR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00105\u001a\u0004\b@\u0010\u0017R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00105\u001a\u0004\bA\u0010\u0017¨\u0006E"}, d2 = {"Ltech/chatmind/api/TarotCardInfo;", "", "", "cardKey", "englishName", "name", "element", "planet", "zodiac", "", "keywords", "uprightKeywords", "reversedKeywords", "meaning", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/util/List;", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/TarotCardInfo;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/TarotCardInfo;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getCardKey", "getEnglishName", "getName", "getElement", "getPlanet", "getZodiac", "Ljava/util/List;", "getKeywords", "getUprightKeywords", "getReversedKeywords", "getMeaning", "getDescription", "Companion", "xhe", "yhe", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class TarotCardInfo {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final yhe Companion = new yhe();
    private final String cardKey;
    private final String description;
    private final String element;
    private final String englishName;
    private final List<String> keywords;
    private final String meaning;
    private final String name;
    private final String planet;
    private final List<String> reversedKeywords;
    private final List<String> uprightKeywords;
    private final String zodiac;

    static {
        ond ondVar = new ond(27);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, null, null, null, eb3.N(z18Var, ondVar), eb3.N(z18Var, new ond(28)), eb3.N(z18Var, new ond(29)), null, null};
    }

    public /* synthetic */ TarotCardInfo(int i, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, String str7, String str8, xyc xycVar) {
        if (7 != (i & 7)) {
            an1.R(i, 7, xhe.a.e());
            throw null;
        }
        this.cardKey = str;
        this.englishName = str2;
        this.name = str3;
        if ((i & 8) == 0) {
            this.element = null;
        } else {
            this.element = str4;
        }
        if ((i & 16) == 0) {
            this.planet = null;
        } else {
            this.planet = str5;
        }
        if ((i & 32) == 0) {
            this.zodiac = null;
        } else {
            this.zodiac = str6;
        }
        int i2 = i & 64;
        pu4 pu4Var = pu4.a;
        if (i2 == 0) {
            this.keywords = pu4Var;
        } else {
            this.keywords = list;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.uprightKeywords = pu4Var;
        } else {
            this.uprightKeywords = list2;
        }
        if ((i & 256) == 0) {
            this.reversedKeywords = pu4Var;
        } else {
            this.reversedKeywords = list3;
        }
        if ((i & 512) == 0) {
            this.meaning = "";
        } else {
            this.meaning = str7;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.description = "";
        } else {
            this.description = str8;
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
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TarotCardInfo copy$default(TarotCardInfo tarotCardInfo, String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tarotCardInfo.cardKey;
        }
        if ((i & 2) != 0) {
            str2 = tarotCardInfo.englishName;
        }
        if ((i & 4) != 0) {
            str3 = tarotCardInfo.name;
        }
        if ((i & 8) != 0) {
            str4 = tarotCardInfo.element;
        }
        if ((i & 16) != 0) {
            str5 = tarotCardInfo.planet;
        }
        if ((i & 32) != 0) {
            str6 = tarotCardInfo.zodiac;
        }
        if ((i & 64) != 0) {
            list = tarotCardInfo.keywords;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            list2 = tarotCardInfo.uprightKeywords;
        }
        if ((i & 256) != 0) {
            list3 = tarotCardInfo.reversedKeywords;
        }
        if ((i & 512) != 0) {
            str7 = tarotCardInfo.meaning;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str8 = tarotCardInfo.description;
        }
        String str9 = str7;
        String str10 = str8;
        List list4 = list2;
        List list5 = list3;
        String str11 = str6;
        List list6 = list;
        String str12 = str5;
        String str13 = str3;
        return tarotCardInfo.copy(str, str2, str13, str4, str12, str11, list6, list4, list5, str9, str10);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(TarotCardInfo self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.cardKey);
        output.w(serialDesc, 1, self.englishName);
        output.w(serialDesc, 2, self.name);
        if (output.g(serialDesc) || self.element != null) {
            output.A(serialDesc, 3, p4e.a, self.element);
        }
        if (output.g(serialDesc) || self.planet != null) {
            output.A(serialDesc, 4, p4e.a, self.planet);
        }
        if (output.g(serialDesc) || self.zodiac != null) {
            output.A(serialDesc, 5, p4e.a, self.zodiac);
        }
        boolean zG = output.g(serialDesc);
        pu4 pu4Var = pu4.a;
        if (zG || !pa7.t(self.keywords, pu4Var)) {
            output.p(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.keywords);
        }
        if (output.g(serialDesc) || !pa7.t(self.uprightKeywords, pu4Var)) {
            output.p(serialDesc, 7, (xn7) lw7VarArr[7].getValue(), self.uprightKeywords);
        }
        if (output.g(serialDesc) || !pa7.t(self.reversedKeywords, pu4Var)) {
            output.p(serialDesc, 8, (xn7) lw7VarArr[8].getValue(), self.reversedKeywords);
        }
        if (output.g(serialDesc) || !pa7.t(self.meaning, "")) {
            output.w(serialDesc, 9, self.meaning);
        }
        if (!output.g(serialDesc) && pa7.t(self.description, "")) {
            return;
        }
        output.w(serialDesc, 10, self.description);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCardKey() {
        return this.cardKey;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMeaning() {
        return this.meaning;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getEnglishName() {
        return this.englishName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getElement() {
        return this.element;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getPlanet() {
        return this.planet;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getZodiac() {
        return this.zodiac;
    }

    public final List<String> component7() {
        return this.keywords;
    }

    public final List<String> component8() {
        return this.uprightKeywords;
    }

    public final List<String> component9() {
        return this.reversedKeywords;
    }

    public final TarotCardInfo copy(String cardKey, String englishName, String name, String element, String planet, String zodiac, List<String> keywords, List<String> uprightKeywords, List<String> reversedKeywords, String meaning, String description) {
        cardKey.getClass();
        englishName.getClass();
        name.getClass();
        keywords.getClass();
        uprightKeywords.getClass();
        reversedKeywords.getClass();
        meaning.getClass();
        description.getClass();
        return new TarotCardInfo(cardKey, englishName, name, element, planet, zodiac, keywords, uprightKeywords, reversedKeywords, meaning, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TarotCardInfo)) {
            return false;
        }
        TarotCardInfo tarotCardInfo = (TarotCardInfo) other;
        return pa7.t(this.cardKey, tarotCardInfo.cardKey) && pa7.t(this.englishName, tarotCardInfo.englishName) && pa7.t(this.name, tarotCardInfo.name) && pa7.t(this.element, tarotCardInfo.element) && pa7.t(this.planet, tarotCardInfo.planet) && pa7.t(this.zodiac, tarotCardInfo.zodiac) && pa7.t(this.keywords, tarotCardInfo.keywords) && pa7.t(this.uprightKeywords, tarotCardInfo.uprightKeywords) && pa7.t(this.reversedKeywords, tarotCardInfo.reversedKeywords) && pa7.t(this.meaning, tarotCardInfo.meaning) && pa7.t(this.description, tarotCardInfo.description);
    }

    public final String getCardKey() {
        return this.cardKey;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getElement() {
        return this.element;
    }

    public final String getEnglishName() {
        return this.englishName;
    }

    public final List<String> getKeywords() {
        return this.keywords;
    }

    public final String getMeaning() {
        return this.meaning;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPlanet() {
        return this.planet;
    }

    public final List<String> getReversedKeywords() {
        return this.reversedKeywords;
    }

    public final List<String> getUprightKeywords() {
        return this.uprightKeywords;
    }

    public final String getZodiac() {
        return this.zodiac;
    }

    public int hashCode() {
        int iC = ub3.c(ub3.c(this.cardKey.hashCode() * 31, 31, this.englishName), 31, this.name);
        String str = this.element;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.planet;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zodiac;
        return this.description.hashCode() + ub3.c(tec.a(tec.a(tec.a((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31, 31, this.keywords), 31, this.uprightKeywords), 31, this.reversedKeywords), 31, this.meaning);
    }

    public String toString() {
        String str = this.cardKey;
        String str2 = this.englishName;
        String str3 = this.name;
        String str4 = this.element;
        String str5 = this.planet;
        String str6 = this.zodiac;
        List<String> list = this.keywords;
        List<String> list2 = this.uprightKeywords;
        List<String> list3 = this.reversedKeywords;
        String str7 = this.meaning;
        String str8 = this.description;
        StringBuilder sbO = ib8.o("TarotCardInfo(cardKey=", str, ", englishName=", str2, ", name=");
        ub3.v(sbO, str3, ", element=", str4, ", planet=");
        ub3.v(sbO, str5, ", zodiac=", str6, ", keywords=");
        sbO.append(list);
        sbO.append(", uprightKeywords=");
        sbO.append(list2);
        sbO.append(", reversedKeywords=");
        sbO.append(list3);
        sbO.append(", meaning=");
        sbO.append(str7);
        sbO.append(", description=");
        return ks0.l(sbO, str8, ")");
    }

    public TarotCardInfo(String str, String str2, String str3, String str4, String str5, String str6, List<String> list, List<String> list2, List<String> list3, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        list2.getClass();
        list3.getClass();
        str7.getClass();
        str8.getClass();
        this.cardKey = str;
        this.englishName = str2;
        this.name = str3;
        this.element = str4;
        this.planet = str5;
        this.zodiac = str6;
        this.keywords = list;
        this.uprightKeywords = list2;
        this.reversedKeywords = list3;
        this.meaning = str7;
        this.description = str8;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TarotCardInfo(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, String str7, String str8, int i, rp3 rp3Var) {
        str4 = (i & 8) != 0 ? null : str4;
        str5 = (i & 16) != 0 ? null : str5;
        str6 = (i & 32) != 0 ? null : str6;
        int i2 = i & 64;
        pu4 pu4Var = pu4.a;
        this(str, str2, str3, str4, str5, str6, i2 != 0 ? pu4Var : list, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? pu4Var : list2, (i & 256) != 0 ? pu4Var : list3, (i & 512) != 0 ? "" : str7, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? "" : str8);
    }
}
