package tech.chatmind.api;

import defpackage.ag2;
import defpackage.an1;
import defpackage.bca;
import defpackage.bt8;
import defpackage.dd0;
import defpackage.eb3;
import defpackage.i5b;
import defpackage.ib8;
import defpackage.j5b;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
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

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 42\u00020\u0001:\u000256BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fB]\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001cJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001cJT\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u001cJ\u0010\u0010&\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010,\u001a\u0004\b.\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010,\u001a\u0004\b/\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u00101\u001a\u0004\b2\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b3\u0010\u001c¨\u00067"}, d2 = {"Ltech/chatmind/api/QuestionRequest;", "", "", "tarotRole", "chatId", "uid", "question", "", "Ltech/chatmind/api/Message;", "messages", "patternId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lxyc;)V", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/QuestionRequest;Lag2;Lnyc;)V", "write$Self", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)Ltech/chatmind/api/QuestionRequest;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTarotRole", "getChatId", "getUid", "getQuestion", "Ljava/util/List;", "getMessages", "getPatternId", "Companion", "i5b", "j5b", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class QuestionRequest {
    public static final int $stable = 8;
    private final String chatId;
    private final List<Message> messages;
    private final String patternId;
    private final String question;
    private final String tarotRole;
    private final String uid;
    public static final j5b Companion = new j5b();
    private static final lw7[] $childSerializers = {null, null, null, null, eb3.N(z18.b, new bca(26)), null};

    public /* synthetic */ QuestionRequest(int i, String str, String str2, String str3, String str4, List list, String str5, xyc xycVar) {
        if (31 != (i & 31)) {
            an1.R(i, 31, i5b.a.e());
            throw null;
        }
        this.tarotRole = str;
        this.chatId = str2;
        this.uid = str3;
        this.question = str4;
        this.messages = list;
        if ((i & 32) == 0) {
            this.patternId = null;
        } else {
            this.patternId = str5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_() {
        return new dd0(bt8.a, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ QuestionRequest copy$default(QuestionRequest questionRequest, String str, String str2, String str3, String str4, List list, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = questionRequest.tarotRole;
        }
        if ((i & 2) != 0) {
            str2 = questionRequest.chatId;
        }
        if ((i & 4) != 0) {
            str3 = questionRequest.uid;
        }
        if ((i & 8) != 0) {
            str4 = questionRequest.question;
        }
        if ((i & 16) != 0) {
            list = questionRequest.messages;
        }
        if ((i & 32) != 0) {
            str5 = questionRequest.patternId;
        }
        List list2 = list;
        String str6 = str5;
        return questionRequest.copy(str, str2, str3, str4, list2, str6);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(QuestionRequest self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        output.w(serialDesc, 0, self.tarotRole);
        output.w(serialDesc, 1, self.chatId);
        output.w(serialDesc, 2, self.uid);
        output.w(serialDesc, 3, self.question);
        output.p(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.messages);
        if (!output.g(serialDesc) && self.patternId == null) {
            return;
        }
        output.A(serialDesc, 5, p4e.a, self.patternId);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTarotRole() {
        return this.tarotRole;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getChatId() {
        return this.chatId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    public final List<Message> component5() {
        return this.messages;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPatternId() {
        return this.patternId;
    }

    public final QuestionRequest copy(String tarotRole, String chatId, String uid, String question, List<Message> messages, String patternId) {
        tarotRole.getClass();
        chatId.getClass();
        uid.getClass();
        question.getClass();
        messages.getClass();
        return new QuestionRequest(tarotRole, chatId, uid, question, messages, patternId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionRequest)) {
            return false;
        }
        QuestionRequest questionRequest = (QuestionRequest) other;
        return pa7.t(this.tarotRole, questionRequest.tarotRole) && pa7.t(this.chatId, questionRequest.chatId) && pa7.t(this.uid, questionRequest.uid) && pa7.t(this.question, questionRequest.question) && pa7.t(this.messages, questionRequest.messages) && pa7.t(this.patternId, questionRequest.patternId);
    }

    public final String getChatId() {
        return this.chatId;
    }

    public final List<Message> getMessages() {
        return this.messages;
    }

    public final String getPatternId() {
        return this.patternId;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getTarotRole() {
        return this.tarotRole;
    }

    public final String getUid() {
        return this.uid;
    }

    public int hashCode() {
        int iA = tec.a(ub3.c(ub3.c(ub3.c(this.tarotRole.hashCode() * 31, 31, this.chatId), 31, this.uid), 31, this.question), 31, this.messages);
        String str = this.patternId;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        String str = this.tarotRole;
        String str2 = this.chatId;
        String str3 = this.uid;
        String str4 = this.question;
        List<Message> list = this.messages;
        String str5 = this.patternId;
        StringBuilder sbO = ib8.o("QuestionRequest(tarotRole=", str, ", chatId=", str2, ", uid=");
        ub3.v(sbO, str3, ", question=", str4, ", messages=");
        sbO.append(list);
        sbO.append(", patternId=");
        sbO.append(str5);
        sbO.append(")");
        return sbO.toString();
    }

    public QuestionRequest(String str, String str2, String str3, String str4, List<Message> list, String str5) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.tarotRole = str;
        this.chatId = str2;
        this.uid = str3;
        this.question = str4;
        this.messages = list;
        this.patternId = str5;
    }

    public /* synthetic */ QuestionRequest(String str, String str2, String str3, String str4, List list, String str5, int i, rp3 rp3Var) {
        this(str, str2, str3, str4, list, (i & 32) != 0 ? null : str5);
    }
}
