package ai.askquin.datastore.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.c77;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ehf;
import defpackage.g11;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.n2f;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.pu4;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xnf;
import defpackage.xyc;
import defpackage.ynf;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0081\b\u0018\u0000 I2\u00020\u0001:\u0002JKB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0013B\u008f\u0001\b\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0012\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b&\u0010$J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010$J\u008e\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0019J\u0010\u0010+\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/J'\u00108\u001a\u0002052\u0006\u00100\u001a\u00020\u00002\u0006\u00102\u001a\u0002012\u0006\u00104\u001a\u000203H\u0001¢\u0006\u0004\b6\u00107R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00109\u001a\u0004\b<\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b=\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\u001eR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bA\u0010 R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010\"R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010$R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010D\u001a\u0004\bF\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010D\u001a\u0004\bG\u0010$R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bH\u0010$¨\u0006L"}, d2 = {"Lai/askquin/datastore/model/UserProfile;", "", "", "nickname", "gender", "birthday", "bios", "", "cardCoverOrdinal", "", "Ln2f;", "purchasedSkins", "usingSkinType", "", "appReviewClaimed", "optOutAllServerPush", "optOutDailyTarotLocalPush", "optOutTomorrowTarotLocalPush", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ln2f;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ln2f;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/lang/Integer;", "component6", "()Ljava/util/List;", "component7", "()Ln2f;", "component8", "()Ljava/lang/Boolean;", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ln2f;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lai/askquin/datastore/model/UserProfile;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_datastore_release", "(Lai/askquin/datastore/model/UserProfile;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getNickname", "getGender", "getBirthday", "getBios", "Ljava/lang/Integer;", "getCardCoverOrdinal", "Ljava/util/List;", "getPurchasedSkins", "Ln2f;", "getUsingSkinType", "Ljava/lang/Boolean;", "getAppReviewClaimed", "getOptOutAllServerPush", "getOptOutDailyTarotLocalPush", "getOptOutTomorrowTarotLocalPush", "Companion", "ynf", "xnf", "Quin.core:datastore_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class UserProfile {
    private static final lw7[] $childSerializers;
    public static final ynf Companion = new ynf();
    private static final UserProfile EMPTY;
    private final Boolean appReviewClaimed;
    private final String bios;
    private final String birthday;
    private final Integer cardCoverOrdinal;
    private final String gender;
    private final String nickname;
    private final Boolean optOutAllServerPush;
    private final Boolean optOutDailyTarotLocalPush;
    private final Boolean optOutTomorrowTarotLocalPush;
    private final List<n2f> purchasedSkins;
    private final n2f usingSkinType;

    static {
        ehf ehfVar = new ehf(13);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, null, null, eb3.N(z18Var, ehfVar), eb3.N(z18Var, new ehf(14)), null, null, null, null};
        EMPTY = new UserProfile("", "", "", "", (Integer) null, (List) null, (n2f) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 2016, (rp3) null);
    }

    public /* synthetic */ UserProfile(int i, String str, String str2, String str3, String str4, Integer num, List list, n2f n2fVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, xnf.a.e());
            throw null;
        }
        this.nickname = str;
        this.gender = str2;
        this.birthday = str3;
        this.bios = str4;
        this.cardCoverOrdinal = num;
        if ((i & 32) == 0) {
            this.purchasedSkins = pu4.a;
        } else {
            this.purchasedSkins = list;
        }
        if ((i & 64) == 0) {
            this.usingSkinType = n2f.a;
        } else {
            this.usingSkinType = n2fVar;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.appReviewClaimed = null;
        } else {
            this.appReviewClaimed = bool;
        }
        if ((i & 256) == 0) {
            this.optOutAllServerPush = null;
        } else {
            this.optOutAllServerPush = bool2;
        }
        if ((i & 512) == 0) {
            this.optOutDailyTarotLocalPush = null;
        } else {
            this.optOutDailyTarotLocalPush = bool3;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.optOutTomorrowTarotLocalPush = null;
        } else {
            this.optOutTomorrowTarotLocalPush = bool4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_() {
        n2f[] n2fVarArrValues = n2f.values();
        n2fVarArrValues.getClass();
        return new dd0(new wn2("ai.askquin.data.model.TransferSkinType", n2fVarArrValues), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_$0() {
        n2f[] n2fVarArrValues = n2f.values();
        n2fVarArrValues.getClass();
        return new wn2("ai.askquin.data.model.TransferSkinType", n2fVarArrValues);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserProfile copy$default(UserProfile userProfile, String str, String str2, String str3, String str4, Integer num, List list, n2f n2fVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userProfile.nickname;
        }
        if ((i & 2) != 0) {
            str2 = userProfile.gender;
        }
        if ((i & 4) != 0) {
            str3 = userProfile.birthday;
        }
        if ((i & 8) != 0) {
            str4 = userProfile.bios;
        }
        if ((i & 16) != 0) {
            num = userProfile.cardCoverOrdinal;
        }
        if ((i & 32) != 0) {
            list = userProfile.purchasedSkins;
        }
        if ((i & 64) != 0) {
            n2fVar = userProfile.usingSkinType;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            bool = userProfile.appReviewClaimed;
        }
        if ((i & 256) != 0) {
            bool2 = userProfile.optOutAllServerPush;
        }
        if ((i & 512) != 0) {
            bool3 = userProfile.optOutDailyTarotLocalPush;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            bool4 = userProfile.optOutTomorrowTarotLocalPush;
        }
        Boolean bool5 = bool3;
        Boolean bool6 = bool4;
        Boolean bool7 = bool;
        Boolean bool8 = bool2;
        List list2 = list;
        n2f n2fVar2 = n2fVar;
        Integer num2 = num;
        String str5 = str3;
        return userProfile.copy(str, str2, str5, str4, num2, list2, n2fVar2, bool7, bool8, bool5, bool6);
    }

    public static final /* synthetic */ void write$Self$Quin_core_datastore_release(UserProfile self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.nickname);
        output.w(serialDesc, 1, self.gender);
        output.w(serialDesc, 2, self.birthday);
        output.w(serialDesc, 3, self.bios);
        output.A(serialDesc, 4, c77.a, self.cardCoverOrdinal);
        if (output.g(serialDesc) || !pa7.t(self.purchasedSkins, pu4.a)) {
            output.p(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.purchasedSkins);
        }
        if (output.g(serialDesc) || self.usingSkinType != n2f.a) {
            output.p(serialDesc, 6, (xn7) lw7VarArr[6].getValue(), self.usingSkinType);
        }
        if (output.g(serialDesc) || self.appReviewClaimed != null) {
            output.A(serialDesc, 7, g11.a, self.appReviewClaimed);
        }
        if (output.g(serialDesc) || self.optOutAllServerPush != null) {
            output.A(serialDesc, 8, g11.a, self.optOutAllServerPush);
        }
        if (output.g(serialDesc) || self.optOutDailyTarotLocalPush != null) {
            output.A(serialDesc, 9, g11.a, self.optOutDailyTarotLocalPush);
        }
        if (!output.g(serialDesc) && self.optOutTomorrowTarotLocalPush == null) {
            return;
        }
        output.A(serialDesc, 10, g11.a, self.optOutTomorrowTarotLocalPush);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Boolean getOptOutDailyTarotLocalPush() {
        return this.optOutDailyTarotLocalPush;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final Boolean getOptOutTomorrowTarotLocalPush() {
        return this.optOutTomorrowTarotLocalPush;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGender() {
        return this.gender;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBirthday() {
        return this.birthday;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getBios() {
        return this.bios;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getCardCoverOrdinal() {
        return this.cardCoverOrdinal;
    }

    public final List<n2f> component6() {
        return this.purchasedSkins;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final n2f getUsingSkinType() {
        return this.usingSkinType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getAppReviewClaimed() {
        return this.appReviewClaimed;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getOptOutAllServerPush() {
        return this.optOutAllServerPush;
    }

    public final UserProfile copy(String nickname, String gender, String birthday, String bios, Integer cardCoverOrdinal, List<? extends n2f> purchasedSkins, n2f usingSkinType, Boolean appReviewClaimed, Boolean optOutAllServerPush, Boolean optOutDailyTarotLocalPush, Boolean optOutTomorrowTarotLocalPush) {
        nickname.getClass();
        gender.getClass();
        birthday.getClass();
        bios.getClass();
        purchasedSkins.getClass();
        usingSkinType.getClass();
        return new UserProfile(nickname, gender, birthday, bios, cardCoverOrdinal, purchasedSkins, usingSkinType, appReviewClaimed, optOutAllServerPush, optOutDailyTarotLocalPush, optOutTomorrowTarotLocalPush);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserProfile)) {
            return false;
        }
        UserProfile userProfile = (UserProfile) other;
        return pa7.t(this.nickname, userProfile.nickname) && pa7.t(this.gender, userProfile.gender) && pa7.t(this.birthday, userProfile.birthday) && pa7.t(this.bios, userProfile.bios) && pa7.t(this.cardCoverOrdinal, userProfile.cardCoverOrdinal) && pa7.t(this.purchasedSkins, userProfile.purchasedSkins) && this.usingSkinType == userProfile.usingSkinType && pa7.t(this.appReviewClaimed, userProfile.appReviewClaimed) && pa7.t(this.optOutAllServerPush, userProfile.optOutAllServerPush) && pa7.t(this.optOutDailyTarotLocalPush, userProfile.optOutDailyTarotLocalPush) && pa7.t(this.optOutTomorrowTarotLocalPush, userProfile.optOutTomorrowTarotLocalPush);
    }

    public final Boolean getAppReviewClaimed() {
        return this.appReviewClaimed;
    }

    public final String getBios() {
        return this.bios;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final Integer getCardCoverOrdinal() {
        return this.cardCoverOrdinal;
    }

    public final String getGender() {
        return this.gender;
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

    public final List<n2f> getPurchasedSkins() {
        return this.purchasedSkins;
    }

    public final n2f getUsingSkinType() {
        return this.usingSkinType;
    }

    public int hashCode() {
        int iC = ub3.c(ub3.c(ub3.c(this.nickname.hashCode() * 31, 31, this.gender), 31, this.birthday), 31, this.bios);
        Integer num = this.cardCoverOrdinal;
        int iHashCode = (this.usingSkinType.hashCode() + tec.a((iC + (num == null ? 0 : num.hashCode())) * 31, 31, this.purchasedSkins)) * 31;
        Boolean bool = this.appReviewClaimed;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.optOutAllServerPush;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.optOutDailyTarotLocalPush;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.optOutTomorrowTarotLocalPush;
        return iHashCode4 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        String str = this.nickname;
        String str2 = this.gender;
        String str3 = this.birthday;
        String str4 = this.bios;
        Integer num = this.cardCoverOrdinal;
        List<n2f> list = this.purchasedSkins;
        n2f n2fVar = this.usingSkinType;
        Boolean bool = this.appReviewClaimed;
        Boolean bool2 = this.optOutAllServerPush;
        Boolean bool3 = this.optOutDailyTarotLocalPush;
        Boolean bool4 = this.optOutTomorrowTarotLocalPush;
        StringBuilder sbO = ib8.o("UserProfile(nickname=", str, ", gender=", str2, ", birthday=");
        ub3.v(sbO, str3, ", bios=", str4, ", cardCoverOrdinal=");
        sbO.append(num);
        sbO.append(", purchasedSkins=");
        sbO.append(list);
        sbO.append(", usingSkinType=");
        sbO.append(n2fVar);
        sbO.append(", appReviewClaimed=");
        sbO.append(bool);
        sbO.append(", optOutAllServerPush=");
        sbO.append(bool2);
        sbO.append(", optOutDailyTarotLocalPush=");
        sbO.append(bool3);
        sbO.append(", optOutTomorrowTarotLocalPush=");
        sbO.append(bool4);
        sbO.append(")");
        return sbO.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserProfile(String str, String str2, String str3, String str4, Integer num, List<? extends n2f> list, n2f n2fVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        n2fVar.getClass();
        this.nickname = str;
        this.gender = str2;
        this.birthday = str3;
        this.bios = str4;
        this.cardCoverOrdinal = num;
        this.purchasedSkins = list;
        this.usingSkinType = n2fVar;
        this.appReviewClaimed = bool;
        this.optOutAllServerPush = bool2;
        this.optOutDailyTarotLocalPush = bool3;
        this.optOutTomorrowTarotLocalPush = bool4;
    }

    public /* synthetic */ UserProfile(String str, String str2, String str3, String str4, Integer num, List list, n2f n2fVar, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, int i, rp3 rp3Var) {
        this(str, str2, str3, str4, num, (i & 32) != 0 ? pu4.a : list, (i & 64) != 0 ? n2f.a : n2fVar, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : bool, (i & 256) != 0 ? null : bool2, (i & 512) != 0 ? null : bool3, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : bool4);
    }
}
