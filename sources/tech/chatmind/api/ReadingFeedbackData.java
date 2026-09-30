package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.afb;
import defpackage.ag2;
import defpackage.an1;
import defpackage.bfb;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.i7b;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.ofb;
import defpackage.p4e;
import defpackage.pa7;
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
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002>?BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fB{\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000e\u0010\u0014J'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001fJ\u0018\u0010$\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0010\u0010(\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJt\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u0010\u0010,\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020/2\b\u0010.\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00102\u001a\u0004\b7\u0010\u001fR\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u00108\u001a\u0004\b9\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b:\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00102\u001a\u0004\b;\u0010\u001fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00102\u001a\u0004\b<\u0010\u001f¨\u0006@"}, d2 = {"Ltech/chatmind/api/ReadingFeedbackData;", "", "", "uid", "chatId", "userType", "entrypoint", "feedbackType", "", "Ltech/chatmind/api/ReadingFeedbackTag;", "tags", "text", "createdAt", "updatedAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/ReadingFeedbackData;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/ReadingFeedbackData;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUid", "getChatId", "getUserType", "getEntrypoint", "getFeedbackType", "Ljava/util/List;", "getTags", "getText", "getCreatedAt", "getUpdatedAt", "Companion", "afb", "bfb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ReadingFeedbackData {
    public static final int $stable = 8;
    private final String chatId;
    private final String createdAt;
    private final String entrypoint;
    private final String feedbackType;
    private final List<ReadingFeedbackTag> tags;
    private final String text;
    private final String uid;
    private final String updatedAt;
    private final String userType;
    public static final bfb Companion = new bfb();
    private static final lw7[] $childSerializers = {null, null, null, null, null, eb3.N(z18.b, new i7b(16)), null, null, null};

    public ReadingFeedbackData(String str, String str2, String str3, String str4, String str5, List<ReadingFeedbackTag> list, String str6, String str7, String str8) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str7.getClass();
        str8.getClass();
        this.uid = str;
        this.chatId = str2;
        this.userType = str3;
        this.entrypoint = str4;
        this.feedbackType = str5;
        this.tags = list;
        this.text = str6;
        this.createdAt = str7;
        this.updatedAt = str8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(ofb.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReadingFeedbackData copy$default(ReadingFeedbackData readingFeedbackData, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, int i, Object obj) {
        if ((i & 1) != 0) {
            str = readingFeedbackData.uid;
        }
        if ((i & 2) != 0) {
            str2 = readingFeedbackData.chatId;
        }
        if ((i & 4) != 0) {
            str3 = readingFeedbackData.userType;
        }
        if ((i & 8) != 0) {
            str4 = readingFeedbackData.entrypoint;
        }
        if ((i & 16) != 0) {
            str5 = readingFeedbackData.feedbackType;
        }
        if ((i & 32) != 0) {
            list = readingFeedbackData.tags;
        }
        if ((i & 64) != 0) {
            str6 = readingFeedbackData.text;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str7 = readingFeedbackData.createdAt;
        }
        if ((i & 256) != 0) {
            str8 = readingFeedbackData.updatedAt;
        }
        String str9 = str7;
        String str10 = str8;
        List list2 = list;
        String str11 = str6;
        String str12 = str5;
        String str13 = str3;
        return readingFeedbackData.copy(str, str2, str13, str4, str12, list2, str11, str9, str10);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ReadingFeedbackData self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.uid);
        output.w(serialDesc, 1, self.chatId);
        output.w(serialDesc, 2, self.userType);
        output.w(serialDesc, 3, self.entrypoint);
        output.w(serialDesc, 4, self.feedbackType);
        output.A(serialDesc, 5, (xn7) lw7VarArr[5].getValue(), self.tags);
        output.A(serialDesc, 6, p4e.a, self.text);
        output.w(serialDesc, 7, self.createdAt);
        output.w(serialDesc, 8, self.updatedAt);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getEntrypoint() {
        return this.entrypoint;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFeedbackType() {
        return this.feedbackType;
    }

    public final List<ReadingFeedbackTag> component6() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final ReadingFeedbackData copy(String uid, String chatId, String userType, String entrypoint, String feedbackType, List<ReadingFeedbackTag> tags, String text, String createdAt, String updatedAt) {
        uid.getClass();
        chatId.getClass();
        userType.getClass();
        entrypoint.getClass();
        feedbackType.getClass();
        createdAt.getClass();
        updatedAt.getClass();
        return new ReadingFeedbackData(uid, chatId, userType, entrypoint, feedbackType, tags, text, createdAt, updatedAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadingFeedbackData)) {
            return false;
        }
        ReadingFeedbackData readingFeedbackData = (ReadingFeedbackData) other;
        return pa7.t(this.uid, readingFeedbackData.uid) && pa7.t(this.chatId, readingFeedbackData.chatId) && pa7.t(this.userType, readingFeedbackData.userType) && pa7.t(this.entrypoint, readingFeedbackData.entrypoint) && pa7.t(this.feedbackType, readingFeedbackData.feedbackType) && pa7.t(this.tags, readingFeedbackData.tags) && pa7.t(this.text, readingFeedbackData.text) && pa7.t(this.createdAt, readingFeedbackData.createdAt) && pa7.t(this.updatedAt, readingFeedbackData.updatedAt);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getEntrypoint() {
        return this.entrypoint;
    }

    public final String getFeedbackType() {
        return this.feedbackType;
    }

    public final List<ReadingFeedbackTag> getTags() {
        return this.tags;
    }

    public final String getText() {
        return this.text;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final String getUserType() {
        return this.userType;
    }

    public int hashCode() {
        int iC = ub3.c(ub3.c(ub3.c(ub3.c(this.uid.hashCode() * 31, 31, this.chatId), 31, this.userType), 31, this.entrypoint), 31, this.feedbackType);
        List<ReadingFeedbackTag> list = this.tags;
        int iHashCode = (iC + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.text;
        return this.updatedAt.hashCode() + ub3.c((iHashCode + (str != null ? str.hashCode() : 0)) * 31, 31, this.createdAt);
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.chatId;
        String str3 = this.userType;
        String str4 = this.entrypoint;
        String str5 = this.feedbackType;
        List<ReadingFeedbackTag> list = this.tags;
        String str6 = this.text;
        String str7 = this.createdAt;
        String str8 = this.updatedAt;
        StringBuilder sbO = ib8.o("ReadingFeedbackData(uid=", str, ", chatId=", str2, ", userType=");
        ub3.v(sbO, str3, ", entrypoint=", str4, ", feedbackType=");
        ib8.v(sbO, str5, ", tags=", list, ", text=");
        ub3.v(sbO, str6, ", createdAt=", str7, ", updatedAt=");
        return ks0.l(sbO, str8, ")");
    }

    public /* synthetic */ ReadingFeedbackData(int i, String str, String str2, String str3, String str4, String str5, List list, String str6, String str7, String str8, xyc xycVar) {
        if (511 != (i & 511)) {
            an1.R(i, 511, afb.a.e());
            throw null;
        }
        this.uid = str;
        this.chatId = str2;
        this.userType = str3;
        this.entrypoint = str4;
        this.feedbackType = str5;
        this.tags = list;
        this.text = str6;
        this.createdAt = str7;
        this.updatedAt = str8;
    }
}
