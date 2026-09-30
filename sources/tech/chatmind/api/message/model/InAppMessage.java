package tech.chatmind.api.message.model;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ag2;
import defpackage.an1;
import defpackage.az6;
import defpackage.eb3;
import defpackage.hz6;
import defpackage.ib8;
import defpackage.job;
import defpackage.ks0;
import defpackage.lw7;
import defpackage.nyc;
import defpackage.p4e;
import defpackage.pa7;
import defpackage.rp3;
import defpackage.tyc;
import defpackage.ub3;
import defpackage.wn2;
import defpackage.xn7;
import defpackage.xyc;
import defpackage.yv6;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zy6;
import java.time.OffsetDateTime;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@tyc
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0087\b\u0018\u0000 `2\u00020\u0001:\u0002abB¹\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u001aBÃ\u0001\b\u0010\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u0019\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010!J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010!J\u0010\u0010%\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b'\u0010!J\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010!J\u0010\u0010)\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b-\u0010!J\u0010\u0010.\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b.\u0010!J\u0010\u0010/\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b3\u0010!J\u0010\u00104\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b4\u0010!J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u0010!J\u0010\u00106\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b6\u0010!JÆ\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b7\u00108J\u0010\u00109\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b9\u0010!J\u0010\u0010:\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\r2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b=\u0010>J'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001¢\u0006\u0004\bE\u0010FR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010H\u001a\u0004\bI\u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010H\u001a\u0004\bJ\u0010!R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010H\u001a\u0004\bK\u0010!R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010H\u001a\u0004\bL\u0010!R \u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010M\u0012\u0004\bO\u0010P\u001a\u0004\bN\u0010&R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010H\u001a\u0004\bQ\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010H\u001a\u0004\bR\u0010!R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010S\u001a\u0004\bT\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010U\u001a\u0004\b\u000e\u0010,R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010H\u001a\u0004\bV\u0010!R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010H\u001a\u0004\bW\u0010!R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010X\u001a\u0004\bY\u00100R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010Z\u001a\u0004\b[\u00102R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\b\\\u0010!R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010H\u001a\u0004\b]\u0010!R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\b^\u0010!R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010H\u001a\u0004\b_\u0010!¨\u0006c"}, d2 = {"Ltech/chatmind/api/message/model/InAppMessage;", "", "", "action", "actionTips", "attach", "content", "Ljava/time/OffsetDateTime;", "createdAt", "data", "imageUrl", "Ltech/chatmind/api/message/model/InAppMessageIntensity;", "intensity", "", "isAllVersions", "maxAppVersion", "messageId", "Ltech/chatmind/api/message/model/InAppMessageType;", "messageType", "Ltech/chatmind/api/message/model/InAppMessageMetadata;", "metadata", "minAppVersion", "region", "title", "validPlatforms", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/message/model/InAppMessageIntensity;ZLjava/lang/String;Ljava/lang/String;Ltech/chatmind/api/message/model/InAppMessageType;Ltech/chatmind/api/message/model/InAppMessageMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "seen0", "Lxyc;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/message/model/InAppMessageIntensity;ZLjava/lang/String;Ljava/lang/String;Ltech/chatmind/api/message/model/InAppMessageType;Ltech/chatmind/api/message/model/InAppMessageMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lxyc;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Ljava/time/OffsetDateTime;", "component6", "component7", "component8", "()Ltech/chatmind/api/message/model/InAppMessageIntensity;", "component9", "()Z", "component10", "component11", "component12", "()Ltech/chatmind/api/message/model/InAppMessageType;", "component13", "()Ltech/chatmind/api/message/model/InAppMessageMetadata;", "component14", "component15", "component16", "component17", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/OffsetDateTime;Ljava/lang/String;Ljava/lang/String;Ltech/chatmind/api/message/model/InAppMessageIntensity;ZLjava/lang/String;Ljava/lang/String;Ltech/chatmind/api/message/model/InAppMessageType;Ltech/chatmind/api/message/model/InAppMessageMetadata;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ltech/chatmind/api/message/model/InAppMessage;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "self", "Lag2;", "output", "Lnyc;", "serialDesc", "Lwef;", "write$Self$Quin_core_base_api_release", "(Ltech/chatmind/api/message/model/InAppMessage;Lag2;Lnyc;)V", "write$Self", "Ljava/lang/String;", "getAction", "getActionTips", "getAttach", "getContent", "Ljava/time/OffsetDateTime;", "getCreatedAt", "getCreatedAt$annotations", "()V", "getData", "getImageUrl", "Ltech/chatmind/api/message/model/InAppMessageIntensity;", "getIntensity", "Z", "getMaxAppVersion", "getMessageId", "Ltech/chatmind/api/message/model/InAppMessageType;", "getMessageType", "Ltech/chatmind/api/message/model/InAppMessageMetadata;", "getMetadata", "getMinAppVersion", "getRegion", "getTitle", "getValidPlatforms", "Companion", "zy6", "az6", "Quin.core:base-api_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final /* data */ class InAppMessage {
    private static final lw7[] $childSerializers;
    public static final int $stable = 8;
    public static final az6 Companion = new az6();
    private final String action;
    private final String actionTips;
    private final String attach;
    private final String content;
    private final OffsetDateTime createdAt;
    private final String data;
    private final String imageUrl;
    private final InAppMessageIntensity intensity;
    private final boolean isAllVersions;
    private final String maxAppVersion;
    private final String messageId;
    private final InAppMessageType messageType;
    private final InAppMessageMetadata metadata;
    private final String minAppVersion;
    private final String region;
    private final String title;
    private final String validPlatforms;

    static {
        yv6 yv6Var = new yv6(2);
        z18 z18Var = z18.b;
        $childSerializers = new lw7[]{null, null, null, null, eb3.N(z18Var, yv6Var), null, null, eb3.N(z18Var, new yv6(3)), null, null, null, eb3.N(z18Var, new yv6(4)), null, null, null, null, null};
    }

    public /* synthetic */ InAppMessage(int i, String str, String str2, String str3, String str4, OffsetDateTime offsetDateTime, String str5, String str6, InAppMessageIntensity inAppMessageIntensity, boolean z, String str7, String str8, InAppMessageType inAppMessageType, InAppMessageMetadata inAppMessageMetadata, String str9, String str10, String str11, String str12, xyc xycVar) {
        if (24 != (i & 24)) {
            an1.R(i, 24, zy6.a.e());
            throw null;
        }
        if ((i & 1) == 0) {
            this.action = null;
        } else {
            this.action = str;
        }
        if ((i & 2) == 0) {
            this.actionTips = null;
        } else {
            this.actionTips = str2;
        }
        if ((i & 4) == 0) {
            this.attach = null;
        } else {
            this.attach = str3;
        }
        this.content = str4;
        this.createdAt = offsetDateTime;
        if ((i & 32) == 0) {
            this.data = "";
        } else {
            this.data = str5;
        }
        if ((i & 64) == 0) {
            this.imageUrl = null;
        } else {
            this.imageUrl = str6;
        }
        if ((i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) == 0) {
            this.intensity = InAppMessageIntensity.Unknown;
        } else {
            this.intensity = inAppMessageIntensity;
        }
        if ((i & 256) == 0) {
            this.isAllVersions = false;
        } else {
            this.isAllVersions = z;
        }
        if ((i & 512) == 0) {
            this.maxAppVersion = "";
        } else {
            this.maxAppVersion = str7;
        }
        if ((i & UserMetadata.MAX_ATTRIBUTE_SIZE) == 0) {
            this.messageId = "";
        } else {
            this.messageId = str8;
        }
        this.messageType = (i & 2048) == 0 ? InAppMessageType.Unknown : inAppMessageType;
        if ((i & 4096) == 0) {
            this.metadata = null;
        } else {
            this.metadata = inAppMessageMetadata;
        }
        if ((i & UserMetadata.MAX_INTERNAL_KEY_SIZE) == 0) {
            this.minAppVersion = "";
        } else {
            this.minAppVersion = str9;
        }
        if ((i & 16384) == 0) {
            this.region = "";
        } else {
            this.region = str10;
        }
        if ((32768 & i) == 0) {
            this.title = null;
        } else {
            this.title = str11;
        }
        if ((i & 65536) == 0) {
            this.validPlatforms = "";
        } else {
            this.validPlatforms = str12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final xn7 _childSerializers$_anonymous_() {
        return new wn2(job.a.b(OffsetDateTime.class), new xn7[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$0() {
        return InAppMessageIntensity.Companion.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ xn7 _childSerializers$_anonymous_$1() {
        return InAppMessageType.Companion.serializer();
    }

    public static /* synthetic */ InAppMessage copy$default(InAppMessage inAppMessage, String str, String str2, String str3, String str4, OffsetDateTime offsetDateTime, String str5, String str6, InAppMessageIntensity inAppMessageIntensity, boolean z, String str7, String str8, InAppMessageType inAppMessageType, InAppMessageMetadata inAppMessageMetadata, String str9, String str10, String str11, String str12, int i, Object obj) {
        String str13;
        String str14;
        String str15 = (i & 1) != 0 ? inAppMessage.action : str;
        String str16 = (i & 2) != 0 ? inAppMessage.actionTips : str2;
        String str17 = (i & 4) != 0 ? inAppMessage.attach : str3;
        String str18 = (i & 8) != 0 ? inAppMessage.content : str4;
        OffsetDateTime offsetDateTime2 = (i & 16) != 0 ? inAppMessage.createdAt : offsetDateTime;
        String str19 = (i & 32) != 0 ? inAppMessage.data : str5;
        String str20 = (i & 64) != 0 ? inAppMessage.imageUrl : str6;
        InAppMessageIntensity inAppMessageIntensity2 = (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? inAppMessage.intensity : inAppMessageIntensity;
        boolean z2 = (i & 256) != 0 ? inAppMessage.isAllVersions : z;
        String str21 = (i & 512) != 0 ? inAppMessage.maxAppVersion : str7;
        String str22 = (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? inAppMessage.messageId : str8;
        InAppMessageType inAppMessageType2 = (i & 2048) != 0 ? inAppMessage.messageType : inAppMessageType;
        InAppMessageMetadata inAppMessageMetadata2 = (i & 4096) != 0 ? inAppMessage.metadata : inAppMessageMetadata;
        String str23 = (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? inAppMessage.minAppVersion : str9;
        String str24 = str15;
        String str25 = (i & 16384) != 0 ? inAppMessage.region : str10;
        String str26 = (i & 32768) != 0 ? inAppMessage.title : str11;
        if ((i & 65536) != 0) {
            str14 = str26;
            str13 = inAppMessage.validPlatforms;
        } else {
            str13 = str12;
            str14 = str26;
        }
        return inAppMessage.copy(str24, str16, str17, str18, offsetDateTime2, str19, str20, inAppMessageIntensity2, z2, str21, str22, inAppMessageType2, inAppMessageMetadata2, str23, str25, str14, str13);
    }

    public static final /* synthetic */ void write$Self$Quin_core_base_api_release(InAppMessage self, ag2 output, nyc serialDesc) {
        lw7[] lw7VarArr = $childSerializers;
        if (output.g(serialDesc) || self.action != null) {
            output.A(serialDesc, 0, p4e.a, self.action);
        }
        if (output.g(serialDesc) || self.actionTips != null) {
            output.A(serialDesc, 1, p4e.a, self.actionTips);
        }
        if (output.g(serialDesc) || self.attach != null) {
            output.A(serialDesc, 2, p4e.a, self.attach);
        }
        output.w(serialDesc, 3, self.content);
        output.p(serialDesc, 4, (xn7) lw7VarArr[4].getValue(), self.createdAt);
        if (output.g(serialDesc) || !pa7.t(self.data, "")) {
            output.w(serialDesc, 5, self.data);
        }
        if (output.g(serialDesc) || self.imageUrl != null) {
            output.A(serialDesc, 6, p4e.a, self.imageUrl);
        }
        if (output.g(serialDesc) || self.intensity != InAppMessageIntensity.Unknown) {
            output.p(serialDesc, 7, (xn7) lw7VarArr[7].getValue(), self.intensity);
        }
        if (output.g(serialDesc) || self.isAllVersions) {
            output.o(serialDesc, 8, self.isAllVersions);
        }
        if (output.g(serialDesc) || !pa7.t(self.maxAppVersion, "")) {
            output.w(serialDesc, 9, self.maxAppVersion);
        }
        if (output.g(serialDesc) || !pa7.t(self.messageId, "")) {
            output.w(serialDesc, 10, self.messageId);
        }
        if (output.g(serialDesc) || self.messageType != InAppMessageType.Unknown) {
            output.p(serialDesc, 11, (xn7) lw7VarArr[11].getValue(), self.messageType);
        }
        if (output.g(serialDesc) || self.metadata != null) {
            output.A(serialDesc, 12, hz6.a, self.metadata);
        }
        if (output.g(serialDesc) || !pa7.t(self.minAppVersion, "")) {
            output.w(serialDesc, 13, self.minAppVersion);
        }
        if (output.g(serialDesc) || !pa7.t(self.region, "")) {
            output.w(serialDesc, 14, self.region);
        }
        if (output.g(serialDesc) || self.title != null) {
            output.A(serialDesc, 15, p4e.a, self.title);
        }
        if (!output.g(serialDesc) && pa7.t(self.validPlatforms, "")) {
            return;
        }
        output.w(serialDesc, 16, self.validPlatforms);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getMaxAppVersion() {
        return this.maxAppVersion;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final InAppMessageType getMessageType() {
        return this.messageType;
    }

    /* JADX INFO: renamed from: component13, reason: from getter */
    public final InAppMessageMetadata getMetadata() {
        return this.metadata;
    }

    /* JADX INFO: renamed from: component14, reason: from getter */
    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    /* JADX INFO: renamed from: component15, reason: from getter */
    public final String getRegion() {
        return this.region;
    }

    /* JADX INFO: renamed from: component16, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component17, reason: from getter */
    public final String getValidPlatforms() {
        return this.validPlatforms;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getActionTips() {
        return this.actionTips;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAttach() {
        return this.attach;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final OffsetDateTime getCreatedAt() {
        return this.createdAt;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final InAppMessageIntensity getIntensity() {
        return this.intensity;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final boolean getIsAllVersions() {
        return this.isAllVersions;
    }

    public final InAppMessage copy(String action, String actionTips, String attach, String content, OffsetDateTime createdAt, String data, String imageUrl, InAppMessageIntensity intensity, boolean isAllVersions, String maxAppVersion, String messageId, InAppMessageType messageType, InAppMessageMetadata metadata, String minAppVersion, String region, String title, String validPlatforms) {
        content.getClass();
        createdAt.getClass();
        data.getClass();
        intensity.getClass();
        maxAppVersion.getClass();
        messageId.getClass();
        messageType.getClass();
        minAppVersion.getClass();
        region.getClass();
        validPlatforms.getClass();
        return new InAppMessage(action, actionTips, attach, content, createdAt, data, imageUrl, intensity, isAllVersions, maxAppVersion, messageId, messageType, metadata, minAppVersion, region, title, validPlatforms);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InAppMessage)) {
            return false;
        }
        InAppMessage inAppMessage = (InAppMessage) other;
        return pa7.t(this.action, inAppMessage.action) && pa7.t(this.actionTips, inAppMessage.actionTips) && pa7.t(this.attach, inAppMessage.attach) && pa7.t(this.content, inAppMessage.content) && pa7.t(this.createdAt, inAppMessage.createdAt) && pa7.t(this.data, inAppMessage.data) && pa7.t(this.imageUrl, inAppMessage.imageUrl) && this.intensity == inAppMessage.intensity && this.isAllVersions == inAppMessage.isAllVersions && pa7.t(this.maxAppVersion, inAppMessage.maxAppVersion) && pa7.t(this.messageId, inAppMessage.messageId) && this.messageType == inAppMessage.messageType && pa7.t(this.metadata, inAppMessage.metadata) && pa7.t(this.minAppVersion, inAppMessage.minAppVersion) && pa7.t(this.region, inAppMessage.region) && pa7.t(this.title, inAppMessage.title) && pa7.t(this.validPlatforms, inAppMessage.validPlatforms);
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

    public final String getData() {
        return this.data;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final InAppMessageIntensity getIntensity() {
        return this.intensity;
    }

    public final String getMaxAppVersion() {
        return this.maxAppVersion;
    }

    public final String getMessageId() {
        return this.messageId;
    }

    public final InAppMessageType getMessageType() {
        return this.messageType;
    }

    public final InAppMessageMetadata getMetadata() {
        return this.metadata;
    }

    public final String getMinAppVersion() {
        return this.minAppVersion;
    }

    public final String getRegion() {
        return this.region;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getValidPlatforms() {
        return this.validPlatforms;
    }

    public int hashCode() {
        String str = this.action;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.actionTips;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.attach;
        int iC = ub3.c((this.createdAt.hashCode() + ub3.c((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.content)) * 31, 31, this.data);
        String str4 = this.imageUrl;
        int iHashCode3 = (this.messageType.hashCode() + ub3.c(ub3.c(ub3.d((this.intensity.hashCode() + ((iC + (str4 == null ? 0 : str4.hashCode())) * 31)) * 31, 31, this.isAllVersions), 31, this.maxAppVersion), 31, this.messageId)) * 31;
        InAppMessageMetadata inAppMessageMetadata = this.metadata;
        int iC2 = ub3.c(ub3.c((iHashCode3 + (inAppMessageMetadata == null ? 0 : inAppMessageMetadata.hashCode())) * 31, 31, this.minAppVersion), 31, this.region);
        String str5 = this.title;
        return this.validPlatforms.hashCode() + ((iC2 + (str5 != null ? str5.hashCode() : 0)) * 31);
    }

    public final boolean isAllVersions() {
        return this.isAllVersions;
    }

    public String toString() {
        String str = this.action;
        String str2 = this.actionTips;
        String str3 = this.attach;
        String str4 = this.content;
        OffsetDateTime offsetDateTime = this.createdAt;
        String str5 = this.data;
        String str6 = this.imageUrl;
        InAppMessageIntensity inAppMessageIntensity = this.intensity;
        boolean z = this.isAllVersions;
        String str7 = this.maxAppVersion;
        String str8 = this.messageId;
        InAppMessageType inAppMessageType = this.messageType;
        InAppMessageMetadata inAppMessageMetadata = this.metadata;
        String str9 = this.minAppVersion;
        String str10 = this.region;
        String str11 = this.title;
        String str12 = this.validPlatforms;
        StringBuilder sbO = ib8.o("InAppMessage(action=", str, ", actionTips=", str2, ", attach=");
        ub3.v(sbO, str3, ", content=", str4, ", createdAt=");
        sbO.append(offsetDateTime);
        sbO.append(", data=");
        sbO.append(str5);
        sbO.append(", imageUrl=");
        sbO.append(str6);
        sbO.append(", intensity=");
        sbO.append(inAppMessageIntensity);
        sbO.append(", isAllVersions=");
        sbO.append(z);
        sbO.append(", maxAppVersion=");
        sbO.append(str7);
        sbO.append(", messageId=");
        sbO.append(str8);
        sbO.append(", messageType=");
        sbO.append(inAppMessageType);
        sbO.append(", metadata=");
        sbO.append(inAppMessageMetadata);
        sbO.append(", minAppVersion=");
        sbO.append(str9);
        sbO.append(", region=");
        ub3.v(sbO, str10, ", title=", str11, ", validPlatforms=");
        return ks0.l(sbO, str12, ")");
    }

    public InAppMessage(String str, String str2, String str3, String str4, OffsetDateTime offsetDateTime, String str5, String str6, InAppMessageIntensity inAppMessageIntensity, boolean z, String str7, String str8, InAppMessageType inAppMessageType, InAppMessageMetadata inAppMessageMetadata, String str9, String str10, String str11, String str12) {
        str4.getClass();
        offsetDateTime.getClass();
        str5.getClass();
        inAppMessageIntensity.getClass();
        str7.getClass();
        str8.getClass();
        inAppMessageType.getClass();
        str9.getClass();
        str10.getClass();
        str12.getClass();
        this.action = str;
        this.actionTips = str2;
        this.attach = str3;
        this.content = str4;
        this.createdAt = offsetDateTime;
        this.data = str5;
        this.imageUrl = str6;
        this.intensity = inAppMessageIntensity;
        this.isAllVersions = z;
        this.maxAppVersion = str7;
        this.messageId = str8;
        this.messageType = inAppMessageType;
        this.metadata = inAppMessageMetadata;
        this.minAppVersion = str9;
        this.region = str10;
        this.title = str11;
        this.validPlatforms = str12;
    }

    public static /* synthetic */ void getCreatedAt$annotations() {
    }

    public /* synthetic */ InAppMessage(String str, String str2, String str3, String str4, OffsetDateTime offsetDateTime, String str5, String str6, InAppMessageIntensity inAppMessageIntensity, boolean z, String str7, String str8, InAppMessageType inAppMessageType, InAppMessageMetadata inAppMessageMetadata, String str9, String str10, String str11, String str12, int i, rp3 rp3Var) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, str4, offsetDateTime, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? null : str6, (i & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) != 0 ? InAppMessageIntensity.Unknown : inAppMessageIntensity, (i & 256) != 0 ? false : z, (i & 512) != 0 ? "" : str7, (i & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? "" : str8, (i & 2048) != 0 ? InAppMessageType.Unknown : inAppMessageType, (i & 4096) != 0 ? null : inAppMessageMetadata, (i & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? "" : str9, (i & 16384) != 0 ? "" : str10, (32768 & i) != 0 ? null : str11, (i & 65536) != 0 ? "" : str12);
    }
}
