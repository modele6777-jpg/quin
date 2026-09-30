package tech.chatmind.api.dailycard.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.e43;
import defpackage.f43;
import defpackage.ib8;
import defpackage.ks0;
import defpackage.nyc;
import defpackage.pa7;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xyc;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0081\b\u0018\u0000 @2\u00020\u0001:\u0002ABB_\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010B\u0087\u0001\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0016J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J~\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0016J\u0010\u0010%\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b%\u0010\u0019J\u001a\u0010(\u001a\u00020'2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J'\u00102\u001a\u00020/2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0001¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00103\u001a\u0004\b5\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u00103\u001a\u0004\b9\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u00103\u001a\u0004\b:\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u00103\u001a\u0004\b;\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00103\u001a\u0004\b<\u0010\u0016R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b>\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b?\u0010\u0016¨\u0006C"}, d2 = {"Ltech/chatmind/api/dailycard/model/DailyCardResponse;", "", "", "date", "description", "", "direction", "key", "locale", "question", "reading", "summary", "tagType", "title", "userId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/dailycard/model/DailyCardResponse;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/dailycard/model/DailyCardResponse;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getDate", "getDescription", "I", "getDirection", "getKey", "getLocale", "getQuestion", "getReading", "getSummary", "getTagType", "getTitle", "getUserId", "Companion", "e43", "f43", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class DailyCardResponse {
    public static final int $stable = 0;
    public static final f43 Companion = new f43();
    private final String date;
    private final String description;
    private final int direction;
    private final String key;
    private final String locale;
    private final String question;
    private final String reading;
    private final String summary;
    private final String tagType;
    private final String title;
    private final String userId;

    public DailyCardResponse(String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        str6.getClass();
        str7.getClass();
        str8.getClass();
        str9.getClass();
        str10.getClass();
        this.date = str;
        this.description = str2;
        this.direction = i;
        this.key = str3;
        this.locale = str4;
        this.question = str5;
        this.reading = str6;
        this.summary = str7;
        this.tagType = str8;
        this.title = str9;
        this.userId = str10;
    }

    public static /* synthetic */ DailyCardResponse copy$default(DailyCardResponse dailyCardResponse, String str, String str2, int i, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = dailyCardResponse.date;
        }
        if ((i2 & 2) != 0) {
            str2 = dailyCardResponse.description;
        }
        if ((i2 & 4) != 0) {
            i = dailyCardResponse.direction;
        }
        if ((i2 & 8) != 0) {
            str3 = dailyCardResponse.key;
        }
        if ((i2 & 16) != 0) {
            str4 = dailyCardResponse.locale;
        }
        if ((i2 & 32) != 0) {
            str5 = dailyCardResponse.question;
        }
        if ((i2 & 64) != 0) {
            str6 = dailyCardResponse.reading;
        }
        if ((i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str7 = dailyCardResponse.summary;
        }
        if ((i2 & 256) != 0) {
            str8 = dailyCardResponse.tagType;
        }
        if ((i2 & 512) != 0) {
            str9 = dailyCardResponse.title;
        }
        if ((i2 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            str10 = dailyCardResponse.userId;
        }
        String str11 = str9;
        String str12 = str10;
        String str13 = str7;
        String str14 = str8;
        String str15 = str5;
        String str16 = str6;
        String str17 = str4;
        int i3 = i;
        return dailyCardResponse.copy(str, str2, i3, str3, str17, str15, str16, str13, str14, str11, str12);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(DailyCardResponse self, ag2 output, nyc serialDesc) {
        output.w(serialDesc, 0, self.date);
        output.w(serialDesc, 1, self.description);
        output.v(2, self.direction, serialDesc);
        output.w(serialDesc, 3, self.key);
        output.w(serialDesc, 4, self.locale);
        output.w(serialDesc, 5, self.question);
        output.w(serialDesc, 6, self.reading);
        output.w(serialDesc, 7, self.summary);
        output.w(serialDesc, 8, self.tagType);
        output.w(serialDesc, 9, self.title);
        output.w(serialDesc, 10, self.userId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getDirection() {
        return this.direction;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getReading() {
        return this.reading;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getSummary() {
        return this.summary;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getTagType() {
        return this.tagType;
    }

    public final DailyCardResponse copy(String date, String description, int direction, String key, String locale, String question, String reading, String summary, String tagType, String title, String userId) {
        date.getClass();
        description.getClass();
        key.getClass();
        locale.getClass();
        question.getClass();
        reading.getClass();
        summary.getClass();
        tagType.getClass();
        title.getClass();
        userId.getClass();
        return new DailyCardResponse(date, description, direction, key, locale, question, reading, summary, tagType, title, userId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyCardResponse)) {
            return false;
        }
        DailyCardResponse dailyCardResponse = (DailyCardResponse) other;
        return pa7.t(this.date, dailyCardResponse.date) && pa7.t(this.description, dailyCardResponse.description) && this.direction == dailyCardResponse.direction && pa7.t(this.key, dailyCardResponse.key) && pa7.t(this.locale, dailyCardResponse.locale) && pa7.t(this.question, dailyCardResponse.question) && pa7.t(this.reading, dailyCardResponse.reading) && pa7.t(this.summary, dailyCardResponse.summary) && pa7.t(this.tagType, dailyCardResponse.tagType) && pa7.t(this.title, dailyCardResponse.title) && pa7.t(this.userId, dailyCardResponse.userId);
    }

    public final String getDate() {
        return this.date;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getDirection() {
        return this.direction;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getReading() {
        return this.reading;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTagType() {
        return this.tagType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getUserId() {
        return this.userId;
    }

    public int hashCode() {
        return this.userId.hashCode() + ub3.c(ub3.c(ub3.c(ub3.c(ub3.c(ub3.c(ub3.c(ub3.b(this.direction, ub3.c(this.date.hashCode() * 31, 31, this.description), 31), 31, this.key), 31, this.locale), 31, this.question), 31, this.reading), 31, this.summary), 31, this.tagType), 31, this.title);
    }

    public String toString() {
        String str = this.date;
        String str2 = this.description;
        int i = this.direction;
        String str3 = this.key;
        String str4 = this.locale;
        String str5 = this.question;
        String str6 = this.reading;
        String str7 = this.summary;
        String str8 = this.tagType;
        String str9 = this.title;
        String str10 = this.userId;
        StringBuilder sbO = ib8.o("DailyCardResponse(date=", str, ", description=", str2, ", direction=");
        sbO.append(i);
        sbO.append(", key=");
        sbO.append(str3);
        sbO.append(", locale=");
        ub3.v(sbO, str4, ", question=", str5, ", reading=");
        ub3.v(sbO, str6, ", summary=", str7, ", tagType=");
        ub3.v(sbO, str8, ", title=", str9, ", userId=");
        return ks0.l(sbO, str10, ")");
    }

    public /* synthetic */ DailyCardResponse(int i, String str, String str2, int i2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, xyc xycVar) {
        if (2047 != (i & 2047)) {
            an1.R(i, 2047, e43.a.e());
            throw null;
        }
        this.date = str;
        this.description = str2;
        this.direction = i2;
        this.key = str3;
        this.locale = str4;
        this.question = str5;
        this.reading = str6;
        this.summary = str7;
        this.tagType = str8;
        this.title = str9;
        this.userId = str10;
    }
}
