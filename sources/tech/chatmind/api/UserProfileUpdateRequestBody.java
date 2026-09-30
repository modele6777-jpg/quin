package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.c77;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ehf;
import defpackage.fpf;
import defpackage.g11;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\b\u0018\u0000 I2\u00020\u0001:\u0002JKB£\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0012\u0010\u0013B\u009f\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001bJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001bJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b#\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010%J¬\u0001\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010;\u001a\u0004\b<\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b>\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b?\u0010\u001bR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010;\u001a\u0004\b@\u0010\u001bR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010\u0019R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010\"R\u001f\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010B\u001a\u0004\bD\u0010\"R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010E\u001a\u0004\bF\u0010%R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010E\u001a\u0004\bG\u0010%R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bH\u0010%¨\u0006L"}, d2 = {"Ltech/chatmind/api/UserProfileUpdateRequestBody;", "", "", "nickname", "", "gender", "birthday", "selfDescription", "customizedCardBack", "tarotExperienceLevel", "expectations", "", "quinSource", "intentions", "", "optOutAllServerPush", "optOutDailyTarotLocalPush", "optOutTomorrowTarotLocalPush", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Integer;", "component3", "component4", "component5", "component6", "component7", "component8", "()Ljava/util/List;", "component9", "component10", "()Ljava/lang/Boolean;", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Ltech/chatmind/api/UserProfileUpdateRequestBody;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/UserProfileUpdateRequestBody;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getNickname", "Ljava/lang/Integer;", "getGender", "getBirthday", "getSelfDescription", "getCustomizedCardBack", "getTarotExperienceLevel", "getExpectations", "Ljava/util/List;", "getQuinSource", "getIntentions", "Ljava/lang/Boolean;", "getOptOutAllServerPush", "getOptOutDailyTarotLocalPush", "getOptOutTomorrowTarotLocalPush", "Companion", "epf", "fpf", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UserProfileUpdateRequestBody {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final fpf Companion = new fpf();
    private final String birthday;
    private final Integer customizedCardBack;
    private final String expectations;
    private final Integer gender;
    private final List<String> intentions;
    private final String nickname;
    private final Boolean optOutAllServerPush;
    private final Boolean optOutDailyTarotLocalPush;
    private final Boolean optOutTomorrowTarotLocalPush;
    private final List<String> quinSource;
    private final String selfDescription;
    private final Integer tarotExperienceLevel;

    static {
        ehf ehfVar = new ehf(18);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, null, null, null, null, eb3.N(z18Var, ehfVar), eb3.N(z18Var, new ehf(19)), null, null, null};
    }

    public /* synthetic */ UserProfileUpdateRequestBody(int i, String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, xyc xycVar) {
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
            this.quinSource = null;
        } else {
            this.quinSource = list;
        }
        if ((i & 256) == 0) {
            this.intentions = null;
        } else {
            this.intentions = list2;
        }
        if ((i & 512) == 0) {
            this.optOutAllServerPush = null;
        } else {
            this.optOutAllServerPush = bool;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.optOutDailyTarotLocalPush = null;
        } else {
            this.optOutDailyTarotLocalPush = bool2;
        }
        if ((i & 2048) == 0) {
            this.optOutTomorrowTarotLocalPush = null;
        } else {
            this.optOutTomorrowTarotLocalPush = bool3;
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserProfileUpdateRequestBody copy$default(UserProfileUpdateRequestBody userProfileUpdateRequestBody, String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProfileUpdateRequestBody.nickname;
        }
        if ((i & 2) != 0) {
            num = userProfileUpdateRequestBody.gender;
        }
        if ((i & 4) != 0) {
            str2 = userProfileUpdateRequestBody.birthday;
        }
        if ((i & 8) != 0) {
            str3 = userProfileUpdateRequestBody.selfDescription;
        }
        if ((i & 16) != 0) {
            num2 = userProfileUpdateRequestBody.customizedCardBack;
        }
        if ((i & 32) != 0) {
            num3 = userProfileUpdateRequestBody.tarotExperienceLevel;
        }
        if ((i & 64) != 0) {
            str4 = userProfileUpdateRequestBody.expectations;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            list = userProfileUpdateRequestBody.quinSource;
        }
        if ((i & 256) != 0) {
            list2 = userProfileUpdateRequestBody.intentions;
        }
        if ((i & 512) != 0) {
            bool = userProfileUpdateRequestBody.optOutAllServerPush;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            bool2 = userProfileUpdateRequestBody.optOutDailyTarotLocalPush;
        }
        if ((i & 2048) != 0) {
            bool3 = userProfileUpdateRequestBody.optOutTomorrowTarotLocalPush;
        }
        Boolean bool4 = bool2;
        Boolean bool5 = bool3;
        List list3 = list2;
        Boolean bool6 = bool;
        String str5 = str4;
        List list4 = list;
        Integer num4 = num2;
        Integer num5 = num3;
        return userProfileUpdateRequestBody.copy(str, num, str2, str3, num4, num5, str5, list4, list3, bool6, bool4, bool5);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(UserProfileUpdateRequestBody self, ag2 output, nyc serialDesc) {
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
        if (output.g(serialDesc) || self.quinSource != null) {
            output.A(serialDesc, 7, (xn7) lw7VarArr[7].getValue(), self.quinSource);
        }
        if (output.g(serialDesc) || self.intentions != null) {
            output.A(serialDesc, 8, (xn7) lw7VarArr[8].getValue(), self.intentions);
        }
        if (output.g(serialDesc) || self.optOutAllServerPush != null) {
            output.A(serialDesc, 9, g11.a, self.optOutAllServerPush);
        }
        if (output.g(serialDesc) || self.optOutDailyTarotLocalPush != null) {
            output.A(serialDesc, 10, g11.a, self.optOutDailyTarotLocalPush);
        }
        if (!output.g(serialDesc) && self.optOutTomorrowTarotLocalPush == null) {
            return;
        }
        output.A(serialDesc, 11, g11.a, self.optOutTomorrowTarotLocalPush);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getOptOutAllServerPush() {
        return this.optOutAllServerPush;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getOptOutDailyTarotLocalPush() {
        return this.optOutDailyTarotLocalPush;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
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

    public final List<String> component8() {
        return this.quinSource;
    }

    public final List<String> component9() {
        return this.intentions;
    }

    public final UserProfileUpdateRequestBody copy(String nickname, Integer gender, String birthday, String selfDescription, Integer customizedCardBack, Integer tarotExperienceLevel, String expectations, List<String> quinSource, List<String> intentions, Boolean optOutAllServerPush, Boolean optOutDailyTarotLocalPush, Boolean optOutTomorrowTarotLocalPush) {
        return new UserProfileUpdateRequestBody(nickname, gender, birthday, selfDescription, customizedCardBack, tarotExperienceLevel, expectations, quinSource, intentions, optOutAllServerPush, optOutDailyTarotLocalPush, optOutTomorrowTarotLocalPush);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfileUpdateRequestBody)) {
            return false;
        }
        UserProfileUpdateRequestBody userProfileUpdateRequestBody = (UserProfileUpdateRequestBody) other;
        return pa7.t(this.nickname, userProfileUpdateRequestBody.nickname) && pa7.t(this.gender, userProfileUpdateRequestBody.gender) && pa7.t(this.birthday, userProfileUpdateRequestBody.birthday) && pa7.t(this.selfDescription, userProfileUpdateRequestBody.selfDescription) && pa7.t(this.customizedCardBack, userProfileUpdateRequestBody.customizedCardBack) && pa7.t(this.tarotExperienceLevel, userProfileUpdateRequestBody.tarotExperienceLevel) && pa7.t(this.expectations, userProfileUpdateRequestBody.expectations) && pa7.t(this.quinSource, userProfileUpdateRequestBody.quinSource) && pa7.t(this.intentions, userProfileUpdateRequestBody.intentions) && pa7.t(this.optOutAllServerPush, userProfileUpdateRequestBody.optOutAllServerPush) && pa7.t(this.optOutDailyTarotLocalPush, userProfileUpdateRequestBody.optOutDailyTarotLocalPush) && pa7.t(this.optOutTomorrowTarotLocalPush, userProfileUpdateRequestBody.optOutTomorrowTarotLocalPush);
    }

    public final String getBirthday() {
        return this.birthday;
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
        List<String> list = this.quinSource;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.intentions;
        int iHashCode9 = (iHashCode8 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Boolean bool = this.optOutAllServerPush;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.optOutDailyTarotLocalPush;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.optOutTomorrowTarotLocalPush;
        return iHashCode11 + (bool3 != null ? bool3.hashCode() : 0);
    }

    public String toString() {
        String str = this.nickname;
        Integer num = this.gender;
        String str2 = this.birthday;
        String str3 = this.selfDescription;
        Integer num2 = this.customizedCardBack;
        Integer num3 = this.tarotExperienceLevel;
        String str4 = this.expectations;
        List<String> list = this.quinSource;
        List<String> list2 = this.intentions;
        Boolean bool = this.optOutAllServerPush;
        Boolean bool2 = this.optOutDailyTarotLocalPush;
        Boolean bool3 = this.optOutTomorrowTarotLocalPush;
        StringBuilder sb = new StringBuilder("UserProfileUpdateRequestBody(nickname=");
        sb.append(str);
        sb.append(", gender=");
        sb.append(num);
        sb.append(", birthday=");
        ub3.v(sb, str2, ", selfDescription=", str3, ", customizedCardBack=");
        sb.append(num2);
        sb.append(", tarotExperienceLevel=");
        sb.append(num3);
        sb.append(", expectations=");
        ib8.v(sb, str4, ", quinSource=", list, ", intentions=");
        sb.append(list2);
        sb.append(", optOutAllServerPush=");
        sb.append(bool);
        sb.append(", optOutDailyTarotLocalPush=");
        sb.append(bool2);
        sb.append(", optOutTomorrowTarotLocalPush=");
        sb.append(bool3);
        sb.append(")");
        return sb.toString();
    }

    public UserProfileUpdateRequestBody() {
        this((String) null, (Integer) null, (String) null, (String) null, (Integer) null, (Integer) null, (String) null, (List) null, (List) null, (Boolean) null, (Boolean) null, (Boolean) null, 4095, (rp3) null);
    }

    public UserProfileUpdateRequestBody(String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, List<String> list, List<String> list2, Boolean bool, Boolean bool2, Boolean bool3) {
        this.nickname = str;
        this.gender = num;
        this.birthday = str2;
        this.selfDescription = str3;
        this.customizedCardBack = num2;
        this.tarotExperienceLevel = num3;
        this.expectations = str4;
        this.quinSource = list;
        this.intentions = list2;
        this.optOutAllServerPush = bool;
        this.optOutDailyTarotLocalPush = bool2;
        this.optOutTomorrowTarotLocalPush = bool3;
    }

    public /* synthetic */ UserProfileUpdateRequestBody(String str, Integer num, String str2, String str3, Integer num2, Integer num3, String str4, List list, List list2, Boolean bool, Boolean bool2, Boolean bool3, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str4, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : list, (i & 256) != 0 ? null : list2, (i & 512) != 0 ? null : bool, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : bool2, (i & 2048) != 0 ? null : bool3);
    }
}
