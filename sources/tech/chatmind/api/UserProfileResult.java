package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.c77;
import defpackage.cpf;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ehf;
import defpackage.eod;
import defpackage.g11;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.syc;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0081\b\u0018\u0000 U2\u00020\u0001:\u0002VWBÁ\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0015\u0010\u0016B¹\u0001\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b\u0015\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b(\u0010%J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b)\u0010%J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b,\u0010+J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010+JÊ\u0001\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001cJ\u0010\u00101\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b1\u00102J\u001a\u00104\u001a\u00020\u00112\b\u00103\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001¢\u0006\u0004\b<\u0010=R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010?\u001a\u0004\b@\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010?\u001a\u0004\bC\u0010\u001cR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010?\u001a\u0004\bD\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010A\u001a\u0004\bE\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010A\u001a\u0004\bF\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010?\u001a\u0004\bG\u0010\u001cR(\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010H\u0012\u0004\bJ\u0010K\u001a\u0004\bI\u0010%R\"\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010L\u0012\u0004\bN\u0010K\u001a\u0004\bM\u0010'R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bO\u0010%R\u001f\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bP\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010Q\u001a\u0004\bR\u0010+R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010Q\u001a\u0004\bS\u0010+R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bT\u0010+¨\u0006X"}, d2 = {"Ltech/chatmind/api/UserProfileResult;", "", "", "nickname", "", "gender", "birthday", "selfDescription", "customizedCardBack", "tarotExperienceLevel", "expectations", "", "Ltech/chatmind/api/SkinType;", "purchasedTarotCards", "currentTarotCard", "quinSource", "intentions", "", "optOutAllServerPush", "optOutDailyTarotLocalPush", "optOutTomorrowTarotLocalPush", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ltech/chatmind/api/SkinType;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ltech/chatmind/api/SkinType;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "()Ltech/chatmind/api/SkinType;", "component10", "component11", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ltech/chatmind/api/SkinType;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ltech/chatmind/api/UserProfileResult;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/UserProfileResult;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getNickname", "Ljava/lang/Integer;", "getGender", "getBirthday", "getSelfDescription", "getCustomizedCardBack", "getTarotExperienceLevel", "getExpectations", "Ljava/util/List;", "getPurchasedTarotCards", "getPurchasedTarotCards$annotations", "()V", "Ltech/chatmind/api/SkinType;", "getCurrentTarotCard", "getCurrentTarotCard$annotations", "getQuinSource", "getIntentions", "Ljava/lang/Boolean;", "getOptOutAllServerPush", "getOptOutDailyTarotLocalPush", "getOptOutTomorrowTarotLocalPush", "Companion", "bpf", "cpf", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UserProfileResult {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final cpf Companion = new cpf();
    private final String birthday;
    private final SkinType currentTarotCard;
    private final Integer customizedCardBack;
    private final String expectations;
    private final Integer gender;
    private final List<String> intentions;
    private final String nickname;
    private final Boolean optOutAllServerPush;
    private final Boolean optOutDailyTarotLocalPush;
    private final Boolean optOutTomorrowTarotLocalPush;
    private final List<SkinType> purchasedTarotCards;
    private final List<String> quinSource;
    private final String selfDescription;
    private final Integer tarotExperienceLevel;

    static {
        ehf ehfVar = new ehf(15);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, null, null, null, null, eb3.N(z18Var, ehfVar), null, eb3.N(z18Var, new ehf(16)), eb3.N(z18Var, new ehf(17)), null, null, null};
    }

    public /* synthetic */ UserProfileResult(String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, List list, SkinType skinType, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str4, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : list, (i & 256) != 0 ? null : skinType, (i & 512) != 0 ? null : list2, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : list3, (i & 2048) != 0 ? null : bool, (i & 4096) != 0 ? null : bool2, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : bool3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(eod.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return new dd0(p4e.a, 0);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(UserProfileResult self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.nickname != null) {
            output.A(serialDesc, 0, p4e.a, self.nickname);
        }
        if (output.g(serialDesc) || self.gender != null) {
            output.A(serialDesc, 1, c77.a, self.gender);
        }
        if (output.g(serialDesc) || self.birthday != null) {
            output.A(serialDesc, 2, p4e.a, self.birthday);
        }
        if (output.g(serialDesc) || self.selfDescription != null) {
            output.A(serialDesc, 3, p4e.a, self.selfDescription);
        }
        if (output.g(serialDesc) || self.customizedCardBack != null) {
            output.A(serialDesc, 4, c77.a, self.customizedCardBack);
        }
        if (output.g(serialDesc) || self.tarotExperienceLevel != null) {
            output.A(serialDesc, 5, c77.a, self.tarotExperienceLevel);
        }
        if (output.g(serialDesc) || self.expectations != null) {
            output.A(serialDesc, 6, p4e.a, self.expectations);
        }
        if (output.g(serialDesc) || self.purchasedTarotCards != null) {
            output.A(serialDesc, 7, (xn7) lw7VarArr[7].getValue(), self.purchasedTarotCards);
        }
        if (output.g(serialDesc) || self.currentTarotCard != null) {
            output.A(serialDesc, 8, eod.a, self.currentTarotCard);
        }
        if (output.g(serialDesc) || self.quinSource != null) {
            output.A(serialDesc, 9, (xn7) lw7VarArr[9].getValue(), self.quinSource);
        }
        if (output.g(serialDesc) || self.intentions != null) {
            output.A(serialDesc, 10, (xn7) lw7VarArr[10].getValue(), self.intentions);
        }
        if (output.g(serialDesc) || self.optOutAllServerPush != null) {
            output.A(serialDesc, 11, g11.a, self.optOutAllServerPush);
        }
        if (output.g(serialDesc) || self.optOutDailyTarotLocalPush != null) {
            output.A(serialDesc, 12, g11.a, self.optOutDailyTarotLocalPush);
        }
        if (!output.g(serialDesc) && self.optOutTomorrowTarotLocalPush == null) {
            return;
        }
        output.A(serialDesc, 13, g11.a, self.optOutTomorrowTarotLocalPush);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    public final List<String> component10() {
        return this.quinSource;
    }

    public final List<String> component11() {
        return this.intentions;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final Boolean getOptOutAllServerPush() {
        return this.optOutAllServerPush;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final Boolean getOptOutDailyTarotLocalPush() {
        return this.optOutDailyTarotLocalPush;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final Boolean getOptOutTomorrowTarotLocalPush() {
        return this.optOutTomorrowTarotLocalPush;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSelfDescription() {
        return this.selfDescription;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCustomizedCardBack() {
        return this.customizedCardBack;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getTarotExperienceLevel() {
        return this.tarotExperienceLevel;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getExpectations() {
        return this.expectations;
    }

    public final List<SkinType> component8() {
        return this.purchasedTarotCards;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final SkinType getCurrentTarotCard() {
        return this.currentTarotCard;
    }

    public final UserProfileResult copy(String nickname, Integer gender, String birthday, String selfDescription, Integer customizedCardBack, Integer tarotExperienceLevel, String expectations, List<? extends SkinType> purchasedTarotCards, SkinType currentTarotCard, List<String> quinSource, List<String> intentions, Boolean optOutAllServerPush, Boolean optOutDailyTarotLocalPush, Boolean optOutTomorrowTarotLocalPush) {
        return new UserProfileResult(nickname, gender, birthday, selfDescription, customizedCardBack, tarotExperienceLevel, expectations, purchasedTarotCards, currentTarotCard, quinSource, intentions, optOutAllServerPush, optOutDailyTarotLocalPush, optOutTomorrowTarotLocalPush);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfileResult)) {
            return false;
        }
        UserProfileResult userProfileResult = (UserProfileResult) other;
        return pa7.t(this.nickname, userProfileResult.nickname) && pa7.t(this.gender, userProfileResult.gender) && pa7.t(this.birthday, userProfileResult.birthday) && pa7.t(this.selfDescription, userProfileResult.selfDescription) && pa7.t(this.customizedCardBack, userProfileResult.customizedCardBack) && pa7.t(this.tarotExperienceLevel, userProfileResult.tarotExperienceLevel) && pa7.t(this.expectations, userProfileResult.expectations) && pa7.t(this.purchasedTarotCards, userProfileResult.purchasedTarotCards) && this.currentTarotCard == userProfileResult.currentTarotCard && pa7.t(this.quinSource, userProfileResult.quinSource) && pa7.t(this.intentions, userProfileResult.intentions) && pa7.t(this.optOutAllServerPush, userProfileResult.optOutAllServerPush) && pa7.t(this.optOutDailyTarotLocalPush, userProfileResult.optOutDailyTarotLocalPush) && pa7.t(this.optOutTomorrowTarotLocalPush, userProfileResult.optOutTomorrowTarotLocalPush);
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final SkinType getCurrentTarotCard() {
        return this.currentTarotCard;
    }

    public final Integer getCustomizedCardBack() {
        return this.customizedCardBack;
    }

    public final String getExpectations() {
        return this.expectations;
    }

    public final Integer getGender() {
        return this.gender;
    }

    public final List<String> getIntentions() {
        return this.intentions;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final Boolean getOptOutAllServerPush() {
        return this.optOutAllServerPush;
    }

    public final Boolean getOptOutDailyTarotLocalPush() {
        return this.optOutDailyTarotLocalPush;
    }

    public final Boolean getOptOutTomorrowTarotLocalPush() {
        return this.optOutTomorrowTarotLocalPush;
    }

    public final List<SkinType> getPurchasedTarotCards() {
        return this.purchasedTarotCards;
    }

    public final List<String> getQuinSource() {
        return this.quinSource;
    }

    public final String getSelfDescription() {
        return this.selfDescription;
    }

    public final Integer getTarotExperienceLevel() {
        return this.tarotExperienceLevel;
    }

    public int hashCode() {
        String str = this.nickname;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.gender;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.birthday;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.selfDescription;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num2 = this.customizedCardBack;
        int iHashCode5 = (iHashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.tarotExperienceLevel;
        int iHashCode6 = (iHashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str4 = this.expectations;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<SkinType> list = this.purchasedTarotCards;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        SkinType skinType = this.currentTarotCard;
        int iHashCode9 = (iHashCode8 + (skinType == null ? 0 : skinType.hashCode())) * 31;
        List<String> list2 = this.quinSource;
        int iHashCode10 = (iHashCode9 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.intentions;
        int iHashCode11 = (iHashCode10 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.optOutAllServerPush;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.optOutDailyTarotLocalPush;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.optOutTomorrowTarotLocalPush;
        return iHashCode13 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        String str = this.nickname;
        Integer num = this.gender;
        String str2 = this.birthday;
        String str3 = this.selfDescription;
        Integer num2 = this.customizedCardBack;
        Integer num3 = this.tarotExperienceLevel;
        String str4 = this.expectations;
        List<SkinType> list = this.purchasedTarotCards;
        SkinType skinType = this.currentTarotCard;
        List<String> list2 = this.quinSource;
        List<String> list3 = this.intentions;
        Boolean bool = this.optOutAllServerPush;
        Boolean bool2 = this.optOutDailyTarotLocalPush;
        Boolean bool3 = this.optOutTomorrowTarotLocalPush;
        StringBuilder sb = new StringBuilder("UserProfileResult(nickname=");
        sb.append(str);
        sb.append(", gender=");
        sb.append(num);
        sb.append(", birthday=");
        ub3.v(sb, str2, ", selfDescription=", str3, ", customizedCardBack=");
        sb.append(num2);
        sb.append(", tarotExperienceLevel=");
        sb.append(num3);
        sb.append(", expectations=");
        ib8.v(sb, str4, ", purchasedTarotCards=", list, ", currentTarotCard=");
        sb.append(skinType);
        sb.append(", quinSource=");
        sb.append(list2);
        sb.append(", intentions=");
        sb.append(list3);
        sb.append(", optOutAllServerPush=");
        sb.append(bool);
        sb.append(", optOutDailyTarotLocalPush=");
        sb.append(bool2);
        sb.append(", optOutTomorrowTarotLocalPush=");
        sb.append(bool3);
        sb.append(")");
        return sb.toString();
    }

    @syc("curUsedTarotCard")
    public static /* synthetic */ void getCurrentTarotCard$annotations() {
    }

    @syc("tarotCards")
    public static /* synthetic */ void getPurchasedTarotCards$annotations() {
    }

    public /* synthetic */ UserProfileResult(int i, String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, List list, SkinType skinType, List list2, List list3, Boolean bool, Boolean bool2, Boolean bool3, xyc xycVar) {
        if ((i & 1) == 0) {
            this.nickname = null;
        } else {
            this.nickname = str;
        }
        if ((i & 2) == 0) {
            this.gender = null;
        } else {
            this.gender = num;
        }
        if ((i & 4) == 0) {
            this.birthday = null;
        } else {
            this.birthday = str2;
        }
        if ((i & 8) == 0) {
            this.selfDescription = null;
        } else {
            this.selfDescription = str3;
        }
        if ((i & 16) == 0) {
            this.customizedCardBack = null;
        } else {
            this.customizedCardBack = num2;
        }
        if ((i & 32) == 0) {
            this.tarotExperienceLevel = null;
        } else {
            this.tarotExperienceLevel = num3;
        }
        if ((i & 64) == 0) {
            this.expectations = null;
        } else {
            this.expectations = str4;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.purchasedTarotCards = null;
        } else {
            this.purchasedTarotCards = list;
        }
        if ((i & 256) == 0) {
            this.currentTarotCard = null;
        } else {
            this.currentTarotCard = skinType;
        }
        if ((i & 512) == 0) {
            this.quinSource = null;
        } else {
            this.quinSource = list2;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.intentions = null;
        } else {
            this.intentions = list3;
        }
        if ((i & 2048) == 0) {
            this.optOutAllServerPush = null;
        } else {
            this.optOutAllServerPush = bool;
        }
        if ((i & 4096) == 0) {
            this.optOutDailyTarotLocalPush = null;
        } else {
            this.optOutDailyTarotLocalPush = bool2;
        }
        if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
            this.optOutTomorrowTarotLocalPush = null;
        } else {
            this.optOutTomorrowTarotLocalPush = bool3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfileResult(String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, List<? extends SkinType> list, SkinType skinType, List<String> list2, List<String> list3, Boolean bool, Boolean bool2, Boolean bool3) {
        this.nickname = str;
        this.gender = num;
        this.birthday = str2;
        this.selfDescription = str3;
        this.customizedCardBack = num2;
        this.tarotExperienceLevel = num3;
        this.expectations = str4;
        this.purchasedTarotCards = list;
        this.currentTarotCard = skinType;
        this.quinSource = list2;
        this.intentions = list3;
        this.optOutAllServerPush = bool;
        this.optOutDailyTarotLocalPush = bool2;
        this.optOutTomorrowTarotLocalPush = bool3;
    }

    public UserProfileResult() {
        this((String) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (List) null, (SkinType) null, (List) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, 16383, (rp3) null);
    }
}
