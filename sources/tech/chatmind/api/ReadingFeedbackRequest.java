package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.i7b;
import defpackage.ib8;
import defpackage.kfb;
import defpackage.ks0;
import defpackage.lfb;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 02\u00020\u0001:\u000212BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nBS\b\u0010\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\t\u0010\u000fJ'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001aJ\u0018\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001aJN\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u001aR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b/\u0010\u001a¨\u00063"}, d2 = {"Ltech/chatmind/api/ReadingFeedbackRequest;", "", "", "chatId", "feedbackType", "entrypoint", "", "tags", "text", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/ReadingFeedbackRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ltech/chatmind/api/ReadingFeedbackRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getChatId", "getFeedbackType", "getEntrypoint", "Ljava/util/List;", "getTags", "getText", "Companion", "kfb", "lfb", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ReadingFeedbackRequest {
    public static final int $stable = 8;
    private final String chatId;
    private final String entrypoint;
    private final String feedbackType;
    private final List<String> tags;
    private final String text;
    public static final lfb Companion = new lfb();
    private static final lw7[] $childSerializers = {null, null, null, eb3.N(z18.b, new i7b(18)), null};

    public /* synthetic */ ReadingFeedbackRequest(int i, String str, String str2, String str3, List list, String str4, xyc xycVar) {
        if (3 != (i & 3)) {
            an1.R(i, 3, kfb.a.e());
            throw null;
        }
        this.chatId = str;
        this.feedbackType = str2;
        if ((i & 4) == 0) {
            this.entrypoint = null;
        } else {
            this.entrypoint = str3;
        }
        if ((i & 8) == 0) {
            this.tags = null;
        } else {
            this.tags = list;
        }
        if ((i & 16) == 0) {
            this.text = null;
        } else {
            this.text = str4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReadingFeedbackRequest copy$default(ReadingFeedbackRequest readingFeedbackRequest, String str, String str2, String str3, List list, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = readingFeedbackRequest.chatId;
        }
        if ((i & 2) != 0) {
            str2 = readingFeedbackRequest.feedbackType;
        }
        if ((i & 4) != 0) {
            str3 = readingFeedbackRequest.entrypoint;
        }
        if ((i & 8) != 0) {
            list = readingFeedbackRequest.tags;
        }
        if ((i & 16) != 0) {
            str4 = readingFeedbackRequest.text;
        }
        String str5 = str4;
        String str6 = str3;
        return readingFeedbackRequest.copy(str, str2, str6, list, str5);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(ReadingFeedbackRequest self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.chatId);
        output.w(serialDesc, 1, self.feedbackType);
        if (output.g(serialDesc) || self.entrypoint != null) {
            output.A(serialDesc, 2, p4e.a, self.entrypoint);
        }
        if (output.g(serialDesc) || self.tags != null) {
            output.A(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.tags);
        }
        if (!output.g(serialDesc) && self.text == null) {
            return;
        }
        output.A(serialDesc, 4, p4e.a, self.text);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFeedbackType() {
        return this.feedbackType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getEntrypoint() {
        return this.entrypoint;
    }

    public final List<String> component4() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final ReadingFeedbackRequest copy(String chatId, String feedbackType, String entrypoint, List<String> tags, String text) {
        chatId.getClass();
        feedbackType.getClass();
        return new ReadingFeedbackRequest(chatId, feedbackType, entrypoint, tags, text);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadingFeedbackRequest)) {
            return false;
        }
        ReadingFeedbackRequest readingFeedbackRequest = (ReadingFeedbackRequest) other;
        return pa7.t(this.chatId, readingFeedbackRequest.chatId) && pa7.t(this.feedbackType, readingFeedbackRequest.feedbackType) && pa7.t(this.entrypoint, readingFeedbackRequest.entrypoint) && pa7.t(this.tags, readingFeedbackRequest.tags) && pa7.t(this.text, readingFeedbackRequest.text);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final String getEntrypoint() {
        return this.entrypoint;
    }

    public final String getFeedbackType() {
        return this.feedbackType;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int iC = ub3.c(this.chatId.hashCode() * 31, 31, this.feedbackType);
        String str = this.entrypoint;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        List<String> list = this.tags;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.text;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        String str = this.chatId;
        String str2 = this.feedbackType;
        String str3 = this.entrypoint;
        List<String> list = this.tags;
        String str4 = this.text;
        StringBuilder sbO = ib8.o("ReadingFeedbackRequest(chatId=", str, ", feedbackType=", str2, ", entrypoint=");
        ib8.v(sbO, str3, ", tags=", list, ", text=");
        return ks0.l(sbO, str4, ")");
    }

    public ReadingFeedbackRequest(String str, String str2, String str3, List<String> list, String str4) {
        str.getClass();
        str2.getClass();
        this.chatId = str;
        this.feedbackType = str2;
        this.entrypoint = str3;
        this.tags = list;
        this.text = str4;
    }

    public /* synthetic */ ReadingFeedbackRequest(String str, String str2, String str3, List list, String str4, int i, rp3 rp3Var) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : str4);
    }
}
