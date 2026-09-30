package ai.askquin.data;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.ub3;
import defpackage.z7c;
import java.time.OffsetDateTime;
import kotlin.Metadata;
import tech.chatmind.api.message.model.InAppMessageIntensity;
import tech.chatmind.api.message.model.InAppMessageType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000bHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\u0081\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0014\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u00101\u001a\u000202HÖ\u0081\u0004J\n\u00103\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0014R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!Ê\u0001\u0002\b5Ê\u0001\f\b6\u0012\b\b7\u0012\u0004\b\u0003\u0010\u0000¨\u00064"}, d2 = {"Lai/askquin/data/InAppMessageUiModel;", "", "messageId", "", "messageType", "Ltech/chatmind/api/message/model/InAppMessageType;", "region", "title", "content", "imageUrl", "intensity", "Ltech/chatmind/api/message/model/InAppMessageIntensity;", "action", "actionTips", "attach", "createdAt", "Ljava/time/OffsetDateTime;", "<init>", "(Ljava/lang/String;Ltech/chatmind/api/message/model/InAppMessageType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/message/model/InAppMessageIntensity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;)V", "getMessageId", "()Ljava/lang/String;", "getMessageType", "()Ltech/chatmind/api/message/model/InAppMessageType;", "getRegion", "getTitle", "getContent", "getImageUrl", "getIntensity", "()Ltech/chatmind/api/message/model/InAppMessageIntensity;", "getAction", "getActionTips", "getAttach", "getCreatedAt", "()Ljava/time/OffsetDateTime;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", "other", "hashCode", "", "toString", "Quin.feature:inappmessage_release", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class InAppMessageUiModel {
    public static final int $stable = 8;
    private final String action;
    private final String actionTips;
    private final String attach;
    private final String content;
    private final OffsetDateTime createdAt;
    private final String imageUrl;
    private final InAppMessageIntensity intensity;
    private final String messageId;
    private final InAppMessageType messageType;
    private final String region;
    private final String title;

    public InAppMessageUiModel(String str, InAppMessageType inAppMessageType, String str2, String str3, String str4, String str5, InAppMessageIntensity inAppMessageIntensity, String str6, String str7, String str8, OffsetDateTime offsetDateTime) {
        str.getClass();
        inAppMessageType.getClass();
        str2.getClass();
        str4.getClass();
        inAppMessageIntensity.getClass();
        offsetDateTime.getClass();
        this.messageId = str;
        this.messageType = inAppMessageType;
        this.region = str2;
        this.title = str3;
        this.content = str4;
        this.imageUrl = str5;
        this.intensity = inAppMessageIntensity;
        this.action = str6;
        this.actionTips = str7;
        this.attach = str8;
        this.createdAt = offsetDateTime;
    }

    public static /* synthetic */ InAppMessageUiModel copy$default(InAppMessageUiModel inAppMessageUiModel, String str, InAppMessageType inAppMessageType, String str2, String str3, String str4, String str5, InAppMessageIntensity inAppMessageIntensity, String str6, String str7, String str8, OffsetDateTime offsetDateTime, int i, Object obj) {
        if ((i & 1) != 0) {
            str = inAppMessageUiModel.messageId;
        }
        if ((i & 2) != 0) {
            inAppMessageType = inAppMessageUiModel.messageType;
        }
        if ((i & 4) != 0) {
            str2 = inAppMessageUiModel.region;
        }
        if ((i & 8) != 0) {
            str3 = inAppMessageUiModel.title;
        }
        if ((i & 16) != 0) {
            str4 = inAppMessageUiModel.content;
        }
        if ((i & 32) != 0) {
            str5 = inAppMessageUiModel.imageUrl;
        }
        if ((i & 64) != 0) {
            inAppMessageIntensity = inAppMessageUiModel.intensity;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0) {
            str6 = inAppMessageUiModel.action;
        }
        if ((i & 256) != 0) {
            str7 = inAppMessageUiModel.actionTips;
        }
        if ((i & 512) != 0) {
            str8 = inAppMessageUiModel.attach;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0) {
            offsetDateTime = inAppMessageUiModel.createdAt;
        }
        String str9 = str8;
        OffsetDateTime offsetDateTime2 = offsetDateTime;
        String str10 = str6;
        String str11 = str7;
        String str12 = str5;
        InAppMessageIntensity inAppMessageIntensity2 = inAppMessageIntensity;
        String str13 = str4;
        String str14 = str2;
        return inAppMessageUiModel.copy(str, inAppMessageType, str14, str3, str13, str12, inAppMessageIntensity2, str10, str11, str9, offsetDateTime2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getAttach() {
        return this.attach;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final InAppMessageType getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final InAppMessageIntensity getIntensity() {
        return this.intensity;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getActionTips() {
        return this.actionTips;
    }

    public final InAppMessageUiModel copy(String messageId, InAppMessageType messageType, String region, String title, String content, String imageUrl, InAppMessageIntensity intensity, String action, String actionTips, String attach, OffsetDateTime createdAt) {
        messageId.getClass();
        messageType.getClass();
        region.getClass();
        content.getClass();
        intensity.getClass();
        createdAt.getClass();
        return new InAppMessageUiModel(messageId, messageType, region, title, content, imageUrl, intensity, action, actionTips, attach, createdAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppMessageUiModel)) {
            return false;
        }
        InAppMessageUiModel inAppMessageUiModel = (InAppMessageUiModel) other;
        return pa7.t(this.messageId, inAppMessageUiModel.messageId) && this.messageType == inAppMessageUiModel.messageType && pa7.t(this.region, inAppMessageUiModel.region) && pa7.t(this.title, inAppMessageUiModel.title) && pa7.t(this.content, inAppMessageUiModel.content) && pa7.t(this.imageUrl, inAppMessageUiModel.imageUrl) && this.intensity == inAppMessageUiModel.intensity && pa7.t(this.action, inAppMessageUiModel.action) && pa7.t(this.actionTips, inAppMessageUiModel.actionTips) && pa7.t(this.attach, inAppMessageUiModel.attach) && pa7.t(this.createdAt, inAppMessageUiModel.createdAt);
    }

    public final String getAction() {
        return this.action;
    }

    public final String getActionTips() {
        return this.actionTips;
    }

    public final String getAttach() {
        return this.attach;
    }

    public final String getContent() {
        return this.content;
    }

    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final InAppMessageIntensity getIntensity() {
        return this.intensity;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final InAppMessageType getMessageType() {
        return this.messageType;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iC = ub3.c((this.messageType.hashCode() + (this.messageId.hashCode() * 31)) * 31, 31, this.region);
        String str = this.title;
        int iC2 = ub3.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.content);
        String str2 = this.imageUrl;
        int iHashCode = (this.intensity.hashCode() + ((iC2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.action;
        int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.actionTips;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.attach;
        return this.createdAt.hashCode() + ((iHashCode3 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.messageId;
        InAppMessageType inAppMessageType = this.messageType;
        String str2 = this.region;
        String str3 = this.title;
        String str4 = this.content;
        String str5 = this.imageUrl;
        InAppMessageIntensity inAppMessageIntensity = this.intensity;
        String str6 = this.action;
        String str7 = this.actionTips;
        String str8 = this.attach;
        OffsetDateTime offsetDateTime = this.createdAt;
        StringBuilder sb = new StringBuilder("InAppMessageUiModel(messageId=");
        sb.append(str);
        sb.append(", messageType=");
        sb.append(inAppMessageType);
        sb.append(", region=");
        ub3.v(sb, str2, ", title=", str3, ", content=");
        ub3.v(sb, str4, ", imageUrl=", str5, ", intensity=");
        sb.append(inAppMessageIntensity);
        sb.append(", action=");
        sb.append(str6);
        sb.append(", actionTips=");
        ub3.v(sb, str7, ", attach=", str8, ", createdAt=");
        sb.append(offsetDateTime);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ InAppMessageUiModel(String str, InAppMessageType inAppMessageType, String str2, String str3, String str4, String str5, InAppMessageIntensity inAppMessageIntensity, String str6, String str7, String str8, OffsetDateTime offsetDateTime, int i, rp3 rp3Var) {
        this(str, inAppMessageType, str2, str3, str4, (i & 32) != 0 ? null : str5, inAppMessageIntensity, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? null : str6, (i & 256) != 0 ? null : str7, (i & 512) != 0 ? null : str8, offsetDateTime);
    }
}
