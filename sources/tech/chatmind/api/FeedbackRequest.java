package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bt8;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.ib8;
import defpackage.lw7;
import defpackage.mz4;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tec;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.xb5;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.yb5;
import defpackage.z18;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rBa\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\f\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJX\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001cJ\u0010\u0010'\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b'\u0010\u001fJ\u001a\u0010)\u001a\u00020(2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010.\u001a\u0004\b/\u0010\u001fR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b1\u0010!R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b2\u0010!R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010+\u001a\u0004\b3\u0010\u001c¨\u00067"}, d2 = {"Ltech/chatmind/api/FeedbackRequest;", "", "", "uid", "chatId", "", "starNum", "", "tags", "Ltech/chatmind/api/Message;", "chatRecord", "other", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;)V", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/FeedbackRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "()I", "component4", "()Ljava/util/List;", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;)Ltech/chatmind/api/FeedbackRequest;", "toString", "hashCode", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getUid", "getChatId", "I", "getStarNum", "Ljava/util/List;", "getTags", "getChatRecord", "getOther", "Companion", "xb5", "yb5", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class FeedbackRequest {
    private static final lw7[] $childSerializers;
    public static final int $stable = 0;
    public static final yb5 Companion = new yb5();
    private final String chatId;
    private final List<Message> chatRecord;
    private final String other;
    private final int starNum;
    private final List<String> tags;
    private final String uid;

    static {
        mz4 mz4Var = new mz4(16);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, eb3.N(z18Var, mz4Var), eb3.N(z18Var, new mz4(17)), null};
    }

    public /* synthetic */ FeedbackRequest(int i, String str, String str2, int i2, List list, List list2, String str3, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, xb5.a.e());
            throw null;
        }
        this.uid = str;
        this.chatId = str2;
        this.starNum = i2;
        this.tags = list;
        this.chatRecord = list2;
        if ((i & 32) == 0) {
            this.other = "";
        } else {
            this.other = str3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(p4e.a, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return new dd0(bt8.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FeedbackRequest copy$default(FeedbackRequest feedbackRequest, String str, String str2, int i, List list, List list2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedbackRequest.uid;
        }
        if ((i2 & 2) != 0) {
            str2 = feedbackRequest.chatId;
        }
        if ((i2 & 4) != 0) {
            i = feedbackRequest.starNum;
        }
        if ((i2 & 8) != 0) {
            list = feedbackRequest.tags;
        }
        if ((i2 & 16) != 0) {
            list2 = feedbackRequest.chatRecord;
        }
        if ((i2 & 32) != 0) {
            str3 = feedbackRequest.other;
        }
        List list3 = list2;
        String str4 = str3;
        return feedbackRequest.copy(str, str2, i, list, list3, str4);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(FeedbackRequest self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.uid);
        output.w(serialDesc, 1, self.chatId);
        output.v(2, self.starNum, serialDesc);
        output.p(serialDesc, 3, (xn7) lw7VarArr[3].getValue(), self.tags);
        output.p(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.chatRecord);
        if (!output.g(serialDesc) && pa7.t(self.other, "")) {
            return;
        }
        output.w(serialDesc, 5, self.other);
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
    public final int getStarNum() {
        return this.starNum;
    }

    public final List<String> component4() {
        return this.tags;
    }

    public final List<Message> component5() {
        return this.chatRecord;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getOther() {
        return this.other;
    }

    public final FeedbackRequest copy(String uid, String chatId, int starNum, List<String> tags, List<Message> chatRecord, String other) {
        uid.getClass();
        chatId.getClass();
        tags.getClass();
        chatRecord.getClass();
        other.getClass();
        return new FeedbackRequest(uid, chatId, starNum, tags, chatRecord, other);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedbackRequest)) {
            return false;
        }
        FeedbackRequest feedbackRequest = (FeedbackRequest) other;
        return pa7.t(this.uid, feedbackRequest.uid) && pa7.t(this.chatId, feedbackRequest.chatId) && this.starNum == feedbackRequest.starNum && pa7.t(this.tags, feedbackRequest.tags) && pa7.t(this.chatRecord, feedbackRequest.chatRecord) && pa7.t(this.other, feedbackRequest.other);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final List<Message> getChatRecord() {
        return this.chatRecord;
    }

    public final String getOther() {
        return this.other;
    }

    public final int getStarNum() {
        return this.starNum;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        return this.other.hashCode() + tec.a(tec.a(ub3.b(this.starNum, ub3.c(this.uid.hashCode() * 31, 31, this.chatId), 31), 31, this.tags), 31, this.chatRecord);
    }

    public String toString() {
        String str = this.uid;
        String str2 = this.chatId;
        int i = this.starNum;
        List<String> list = this.tags;
        List<Message> list2 = this.chatRecord;
        String str3 = this.other;
        StringBuilder sbO = ib8.o("FeedbackRequest(uid=", str, ", chatId=", str2, ", starNum=");
        sbO.append(i);
        sbO.append(", tags=");
        sbO.append(list);
        sbO.append(", chatRecord=");
        sbO.append(list2);
        sbO.append(", other=");
        sbO.append(str3);
        sbO.append(")");
        return sbO.toString();
    }

    public FeedbackRequest(String str, String str2, int i, List<String> list, List<Message> list2, String str3) {
        str.getClass();
        str2.getClass();
        list.getClass();
        list2.getClass();
        str3.getClass();
        this.uid = str;
        this.chatId = str2;
        this.starNum = i;
        this.tags = list;
        this.chatRecord = list2;
        this.other = str3;
    }

    public /* synthetic */ FeedbackRequest(String str, String str2, int i, List list, List list2, String str3, int i2, rp3 rp3Var) {
        this(str, str2, i, list, list2, (i2 & 32) != 0 ? "" : str3);
    }
}
