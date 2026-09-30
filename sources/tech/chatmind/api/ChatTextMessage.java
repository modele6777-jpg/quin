package tech.chatmind.api;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ib8;
import defpackage.jy1;
import defpackage.ky1;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc(with = ky1.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u001b\b\u0087\b\u0018\u0000 G2\u00020\u0001:\u0001HB·\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0019J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0018\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0019J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0019J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0019J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u0019J\u0012\u0010)\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b)\u0010*JÀ\u0001\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b-\u0010\u0019J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00104\u001a\u0004\b6\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00104\u001a\u0004\b7\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00104\u001a\u0004\b8\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b9\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b:\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010;\u001a\u0004\b<\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b=\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00104\u001a\u0004\b>\u0010\u0019R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010?\u001a\u0004\b@\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\bA\u0010\u0019R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\bB\u0010\u0019R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00104\u001a\u0004\bC\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u00104\u001a\u0004\bD\u0010\u0019R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010E\u001a\u0004\bF\u0010*¨\u0006I"}, d2 = {"Ltech/chatmind/api/ChatTextMessage;", "", "", "messageId", "createdTime", "role", "type", "content", "label", "", "ignored", "drawClarifyingCardMessageId", "interpretClarifyingCardMessageId", "", "Ltech/chatmind/api/SelectedCard;", "cards", "requestClarifyingCardMessageId", "interpretation", "question", "tarotReadingId", "Ltech/chatmind/api/TarotReadingHistory;", "tarotReading", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotReadingHistory;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "()Ljava/lang/Boolean;", "component8", "component9", "component10", "()Ljava/util/List;", "component11", "component12", "component13", "component14", "component15", "()Ltech/chatmind/api/TarotReadingHistory;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/TarotReadingHistory;)Ltech/chatmind/api/ChatTextMessage;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getMessageId", "getCreatedTime", "getRole", "getType", "getContent", "getLabel", "Ljava/lang/Boolean;", "getIgnored", "getDrawClarifyingCardMessageId", "getInterpretClarifyingCardMessageId", "Ljava/util/List;", "getCards", "getRequestClarifyingCardMessageId", "getInterpretation", "getQuestion", "getTarotReadingId", "Ltech/chatmind/api/TarotReadingHistory;", "getTarotReading", "Companion", "jy1", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class ChatTextMessage {
    private final List<SelectedCard> cards;
    private final String content;
    private final String createdTime;
    private final String drawClarifyingCardMessageId;
    private final Boolean ignored;
    private final String interpretClarifyingCardMessageId;
    private final String interpretation;
    private final String label;
    private final String messageId;
    private final String question;
    private final String requestClarifyingCardMessageId;
    private final String role;
    private final TarotReadingHistory tarotReading;
    private final String tarotReadingId;
    private final String type;
    public static final jy1 Companion = new jy1();
    public static final int $stable = TarotReadingHistory.$stable;

    public /* synthetic */ ChatTextMessage(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, List list, String str9, String str10, String str11, String str12, TarotReadingHistory tarotReadingHistory, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "text" : str4, (i & 16) == 0 ? str5 : "", (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : bool, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : str7, (i & 256) != 0 ? null : str8, (i & 512) != 0 ? null : list, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? null : str9, (i & 2048) != 0 ? null : str10, (i & 4096) != 0 ? null : str11, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? null : str12, (i & 16384) != 0 ? null : tarotReadingHistory);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    public final List<SelectedCard> component10() {
        return this.cards;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRequestClarifyingCardMessageId() {
        return this.requestClarifyingCardMessageId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final String getInterpretation() {
        return this.interpretation;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getTarotReadingId() {
        return this.tarotReadingId;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final TarotReadingHistory getTarotReading() {
        return this.tarotReading;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCreatedTime() {
        return this.createdTime;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRole() {
        return this.role;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Boolean getIgnored() {
        return this.ignored;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDrawClarifyingCardMessageId() {
        return this.drawClarifyingCardMessageId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getInterpretClarifyingCardMessageId() {
        return this.interpretClarifyingCardMessageId;
    }

    public final ChatTextMessage copy(String messageId, String createdTime, String role, String type, String content, String label, Boolean ignored, String drawClarifyingCardMessageId, String interpretClarifyingCardMessageId, List<SelectedCard> cards, String requestClarifyingCardMessageId, String interpretation, String question, String tarotReadingId, TarotReadingHistory tarotReading) {
        messageId.getClass();
        createdTime.getClass();
        role.getClass();
        type.getClass();
        content.getClass();
        return new ChatTextMessage(messageId, createdTime, role, type, content, label, ignored, drawClarifyingCardMessageId, interpretClarifyingCardMessageId, cards, requestClarifyingCardMessageId, interpretation, question, tarotReadingId, tarotReading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatTextMessage)) {
            return false;
        }
        ChatTextMessage chatTextMessage = (ChatTextMessage) other;
        return pa7.t(this.messageId, chatTextMessage.messageId) && pa7.t(this.createdTime, chatTextMessage.createdTime) && pa7.t(this.role, chatTextMessage.role) && pa7.t(this.type, chatTextMessage.type) && pa7.t(this.content, chatTextMessage.content) && pa7.t(this.label, chatTextMessage.label) && pa7.t(this.ignored, chatTextMessage.ignored) && pa7.t(this.drawClarifyingCardMessageId, chatTextMessage.drawClarifyingCardMessageId) && pa7.t(this.interpretClarifyingCardMessageId, chatTextMessage.interpretClarifyingCardMessageId) && pa7.t(this.cards, chatTextMessage.cards) && pa7.t(this.requestClarifyingCardMessageId, chatTextMessage.requestClarifyingCardMessageId) && pa7.t(this.interpretation, chatTextMessage.interpretation) && pa7.t(this.question, chatTextMessage.question) && pa7.t(this.tarotReadingId, chatTextMessage.tarotReadingId) && pa7.t(this.tarotReading, chatTextMessage.tarotReading);
    }

    public final List<SelectedCard> getCards() {
        return this.cards;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getCreatedTime() {
        return this.createdTime;
    }

    public final String getDrawClarifyingCardMessageId() {
        return this.drawClarifyingCardMessageId;
    }

    public final Boolean getIgnored() {
        return this.ignored;
    }

    public final String getInterpretClarifyingCardMessageId() {
        return this.interpretClarifyingCardMessageId;
    }

    public final String getInterpretation() {
        return this.interpretation;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final String getQuestion() {
        return this.question;
    }

    public final String getRequestClarifyingCardMessageId() {
        return this.requestClarifyingCardMessageId;
    }

    public final String getRole() {
        return this.role;
    }

    public final TarotReadingHistory getTarotReading() {
        return this.tarotReading;
    }

    public final String getTarotReadingId() {
        return this.tarotReadingId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iC = ub3.c(ub3.c(ub3.c(ub3.c(this.messageId.hashCode() * 31, 31, this.createdTime), 31, this.role), 31, this.type), 31, this.content);
        String str = this.label;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.ignored;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.drawClarifyingCardMessageId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.interpretClarifyingCardMessageId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<SelectedCard> list = this.cards;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str4 = this.requestClarifyingCardMessageId;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.interpretation;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.question;
        int iHashCode8 = (iHashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.tarotReadingId;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        TarotReadingHistory tarotReadingHistory = this.tarotReading;
        return iHashCode9 + (tarotReadingHistory != null ? tarotReadingHistory.hashCode() : 0);
    }

    public String toString() {
        String str = this.messageId;
        String str2 = this.createdTime;
        String str3 = this.role;
        String str4 = this.type;
        String str5 = this.content;
        String str6 = this.label;
        Boolean bool = this.ignored;
        String str7 = this.drawClarifyingCardMessageId;
        String str8 = this.interpretClarifyingCardMessageId;
        List<SelectedCard> list = this.cards;
        String str9 = this.requestClarifyingCardMessageId;
        String str10 = this.interpretation;
        String str11 = this.question;
        String str12 = this.tarotReadingId;
        TarotReadingHistory tarotReadingHistory = this.tarotReading;
        StringBuilder sbO = ib8.o("ChatTextMessage(messageId=", str, ", createdTime=", str2, ", role=");
        ub3.v(sbO, str3, ", type=", str4, ", content=");
        ub3.v(sbO, str5, ", label=", str6, ", ignored=");
        sbO.append(bool);
        sbO.append(", drawClarifyingCardMessageId=");
        sbO.append(str7);
        sbO.append(", interpretClarifyingCardMessageId=");
        ib8.v(sbO, str8, ", cards=", list, ", requestClarifyingCardMessageId=");
        ub3.v(sbO, str9, ", interpretation=", str10, ", question=");
        ub3.v(sbO, str11, ", tarotReadingId=", str12, ", tarotReading=");
        sbO.append(tarotReadingHistory);
        sbO.append(")");
        return sbO.toString();
    }

    public ChatTextMessage(String str, String str2, String str3, String str4, String str5, String str6, Boolean bool, String str7, String str8, List<SelectedCard> list, String str9, String str10, String str11, String str12, TarotReadingHistory tarotReadingHistory) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        str5.getClass();
        this.messageId = str;
        this.createdTime = str2;
        this.role = str3;
        this.type = str4;
        this.content = str5;
        this.label = str6;
        this.ignored = bool;
        this.drawClarifyingCardMessageId = str7;
        this.interpretClarifyingCardMessageId = str8;
        this.cards = list;
        this.requestClarifyingCardMessageId = str9;
        this.interpretation = str10;
        this.question = str11;
        this.tarotReadingId = str12;
        this.tarotReading = tarotReadingHistory;
    }

    public ChatTextMessage() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 32767, null);
    }
}
